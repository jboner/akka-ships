package training.ships.akka_rest

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}

import scala.collection.mutable.HashMap

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

/**
 * Usage:
 * <pre>
 * curl http://localhost:9998/ships/create/MyShip/London
 * curl http://localhost:9998/ships/depart/MyShip/Amsterdam
 * curl http://localhost:9998/ships/arrive/MyShip/Stockholm
 * curl http://localhost:9998/ships/destination/MyShip/_
 * curl http://localhost:9998/ships/sink/MyShip/_
 * </pre>
 */
@Path("/ships/{event}/{shipName}/{port}")
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
    case unknown => log.error("Unknown event: %s", unknown)
  }
}

/**
 * The actual implementation of EventProcessor.
 */
class EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start

  // holds all current active ships mapped by name (non-persistent)
  private lazy val shipRepository = new HashMap[String, Ship]

  def receive: PartialFunction[Any, Unit] = {
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
      reply(result)

    case event @ ("depart", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          val shipEvent = DepartureEvent(new Date, new Port(port), ship)
          <success>{shipEvent.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
      reply(result)

    case event @ ("arrive", shipName: String, port: String) =>
      val result = shipRepository.get(shipName) match {
        case Some(ship) =>
          val shipEvent = ArrivalEvent(new Date, new Port(port), ship)
          <success>{shipEvent.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
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
