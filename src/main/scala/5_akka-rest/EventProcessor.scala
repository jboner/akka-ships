package training.ships.akka_rest

import se.scalablesolutions.akka.actor.{SupervisorFactory, OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._

import scala.collection.mutable.HashMap

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

class Boot {
  object factory extends SupervisorFactory {
    override def getSupervisorConfig: SupervisorConfig = {
      SupervisorConfig(
        RestartStrategy(OneForOne, 3, 100),
        Supervise(
          new EventProcessor,
          LifeCycle(Permanent, 100)) ::
        Nil)
    }
  }
  val supervisor = factory.newSupervisor
  supervisor.startSupervisor
}

// =============================
// Event processor and storage
// =============================

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
class EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start

  private var eventLog: List[StateChangeEvent] = Nil
  private val shipRepository = new HashMap[String, Ship]

  // Internal messages for the actor; one for each "method", dispatched as an actor message
  private case class Depart(shipName: String, port: String)
  private case class Arrive(shipName: String, port: String)
  private case class Destination(shipName: String)
  private case class Sink(shipName: String)

  @GET
  @Produces(Array("text/xml"))
  def process(@PathParam("event") event: String,
              @PathParam("shipName") shipName: String,
              @PathParam("port") port: String) = event match {
    case "create" =>
      val reply = this !! NewShip(shipName, new Port(port))
      reply match {
        case None =>
          <error>Could not create a new ship</error>
        case Some(ship) =>
          <success>Created new ship [{shipName}]</success>
      }
    case "depart" => this !! Depart(shipName, port)
    case "arrive" => this !! Arrive(shipName, port)
    case "destination" => this !! Destination(shipName)
    case "sink" => Sink(shipName)

    case unknown =>
      <error>Unknown event: {unknown}</error>
  }

  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      eventLog ::= event
      reply(event.process)

    case NewShip(shipName, port) =>
      val ship = new Ship(shipName, port)
      startLink(ship)
      shipRepository += shipName -> ship
      reply(ship)

    case Depart(shipName, port) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = this !! DepartureEvent(new Date, new Port(port), ship)
          reply match {
            case Some(result) => <success>{result}</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }
    
    case Arrive(shipName, port) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = this !! ArrivalEvent(new Date, new Port(port), ship)
          reply match {
            case Some(result) => <success>{result}</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }

    case Destination(shipName) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = ship !! CurrentPort
          reply match {
            case Some(result) => <success>{result}</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }

    case Sink(shipName) =>
      shipRepository.get(shipName) match {
        case Some(ship) => ship ! Sink
        case None => {}
      }

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
