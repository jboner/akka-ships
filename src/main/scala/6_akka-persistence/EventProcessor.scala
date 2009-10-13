package training.ships.akka_persistence

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

import scala.collection.mutable.HashMap

import se.scalablesolutions.akka.state.{PersistentVector, CassandraStorageConfig, PersistentState}

/**
 * Usage:
 * <pre>
   * curl http://localhost:9998/persistent-ships/create/MyShip/London
 * curl http://localhost:9998/persistent-ships/depart/MyShip/Amsterdam
 * curl http://localhost:9998/persistent-ships/arrive/MyShip/Stockholm
 * curl http://localhost:9998/persistent-ships/destination/MyShip/_
 * curl http://localhost:9998/persistent-ships/sink/MyShip/_
 * </pre>
 */
@Path("/persistent-ships/{event}/{shipName}/{port}")
class EventProcessorFacade extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start
  
  private val processor = new EventProcessor 
  startLink(processor)

  @GET
  @Produces(Array("text/xml"))
  def process(@PathParam("event") event: String,
              @PathParam("shipName") shipName: String,
              @PathParam("port") port: String) = event match {
    case "create" =>      (processor !! (event, shipName, port)).getOrElse(<error>Could not create ship</error>)
    case "depart" =>      (processor !! (event, shipName, port)).getOrElse(<error>Could not move ship</error>)
    case "arrive" =>      (processor !! (event, shipName, port)).getOrElse(<error>Could not move ship</error>)
    case "destination" => (processor !! (event, shipName, "")).getOrElse(<error>Could get destination for ship</error>)
    case "sink" =>        (processor !! (event, shipName, "")).getOrElse(<error>Could get destination for ship</error>)
    case unknown =>       <error>Unknown event: {unknown}</error>
  }

  def receive: PartialFunction[Any, Unit] = {
    case ReplayEvents =>
      val eventLog: List[Tuple3[_,_,_]] = (processor !! GetEventLog).getOrElse(throw new IllegalStateException("Can't access event log"))
      eventLog.foreach(processor !! _)
    case unknown => log.error("Unknown event: %s", unknown)
  }
}

class EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  makeTransactionRequired
  trapExit = true
  start

  // holds all current active ships mapped by name (non-persistent)
  private lazy val shipRepository = new HashMap[String, Ship]

  // store the EventProcessor's event log in order
  private lazy val eventLog: PersistentVector = {
    val vector = PersistentState.newVector(CassandraStorageConfig())
    vector.uuid = getClass.getName
    vector
  }

  def receive: PartialFunction[Any, Unit] = {
    case GetEventLog =>
      reply(eventLog.toList)

    case event @ ("create", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          <success>Ship [{shipName}] already created</success>
        case None =>
          val ship = new Ship(shipName, new Port(port))
          startLink(ship) // supervise the Ship
          shipRepository.put(shipName, ship)
          <success>Created new ship [{shipName}]</success>
      }
      eventLog add event // store in DB
      reply(result)

    case event @ ("depart", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          val shipEvent = DepartureEvent(new Date, new Port(port), ship)
          <success>{shipEvent.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
      eventLog add event // store in DB
      reply(result)

    case event @ ("arrive", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          val shipEvent = ArrivalEvent(new Date, new Port(port), ship)
          <success>{shipEvent.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
      eventLog add event // store in DB
      reply(result)

    case ("destination", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = ship.asInstanceOf[Ship] !! CurrentPort
          reply match {
            case Some(result) => <success>{result.toString}</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
      reply(result)

    case ("sink", shipName: String, port: String) =>
      shipRepository.get(shipName) match {
        case Some(ship) => ship.asInstanceOf[Ship] ! Sink
        case None => {}
      }
      reply(<success>Ship killed</success>)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
