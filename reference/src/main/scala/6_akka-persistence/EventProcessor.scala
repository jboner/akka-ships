package training.ships.akka_persistence.reference

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

import scala.collection.mutable.HashMap

import se.scalablesolutions.akka.state.{PersistentVector, CassandraStorageConfig, PersistentState}

/**
 * EventProcessor REST facade.
 * <p/>
 * Supervisor definition and wiring in the {@link training.ships.akka_persistence.reference.Boot} class.
 * <p/>
 * Responds to the following GET requests:
 * <pre>
 *   curl http://localhost:9998/persistent-ships/create/<ship-name>/<port-name>
 *   curl http://localhost:9998/persistent-ships/depart/<ship-name>/<port-name>
 *   curl http://localhost:9998/persistent-ships/arrive/<ship-name>/<port-name>
 *   curl http://localhost:9998/persistent-ships/destination/<ship-name>/_
 *   curl http://localhost:9998/persistent-ships/sink/<ship-name>/_
 * </pre>
 * 
 * If an error occurs it returns: 
 * <pre>
 *   <error>{error message}</error>
 * </pre>
 * 
 * It also creates and supervisor the EventProcessor.
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

/**
 * The actual implementation of EventProcessor.
 */
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
