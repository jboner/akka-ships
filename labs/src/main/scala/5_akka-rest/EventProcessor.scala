package training.ships.akka_rest.labs

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}

import scala.collection.mutable.HashMap

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

/**
 * EventProcessor REST facade.
 * <p/>
 * Supervisor definition and wiring in the {@link training.ships.akka_rest.labs.Boot} class.
 * <p/>
 * Responds to the following GET requests:
 * <pre>
 *   curl http://localhost:9998/ships/create/<ship-name>/<port-name>
 *   curl http://localhost:9998/ships/depart/<ship-name>/<port-name>
 *   curl http://localhost:9998/ships/arrive/<ship-name>/<port-name>
 *   curl http://localhost:9998/ships/destination/<ship-name>/_
 *   curl http://localhost:9998/ships/sink/<ship-name>/_
 * </pre>
 * 
 * If an error occurs it returns: 
 * <pre>
 *   <error>{error message}</error>
 * </pre>
 * 
 * It also creates and supervisor the EventProcessor.
 */
class EventProcessorFacade extends Actor {
  def receive: PartialFunction[Any, Unit] = {
    case unknown => log.error("EventProcessorFacade does not respond to any messages, received event: %s", unknown)
  }
}

/**
 * The actual implementation of EventProcessor.
 * 
 * Responds to the following messages.
 * All of type Tuple3[String, String, String]): 
 * <pre>
 *  ("create", shipName: String, port: String)
 *  ("depart", shipName: String, port: String)
 *  ("arrive", shipName: String, port: String)
 *  ("destination", shipName: String, port: String)
 *  ("destination", shipName: String, port: String)
 * </pre
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
