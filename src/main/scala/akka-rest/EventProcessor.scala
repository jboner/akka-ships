package training.ships.akka_rest

import se.scalablesolutions.akka.actor.{SupervisorFactory, OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._

import scala.collection.mutable.HashMap

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

// ------- NEW -------
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
// ------- NEW -------

// =============================
// Event processor and storage
// =============================

// ------- NEW -------
/**
 * Usage:
 * <pre>
 * curl http://localhost:9998/ships/create/MyShip/London
 * curl http://localhost:9998/ships/depart/MyShip/Amsterdam
 * </pre>
 */
@Path("/ships/{event}/{shipName}/{port}")
// ------- NEW -------
class EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start

  private var eventLog: List[StateChangeEvent] = Nil

// ------- NEW -------
  private val shipRepository = new HashMap[String, Ship]
// ------- NEW -------

// ------- NEW -------
  @GET
  @Produces(Array("text/xml"))
  def process(@PathParam("event") event: String,
              @PathParam("shipName") shipName: String,
              @PathParam("port") port: String) = event match {

    case "create" =>
      val ship = (this !! NewShip(shipName, new Port(port))).getOrElse(<error>Could not create a new ship</error>)
      shipRepository ++ shipName -> ship
      <success>Created new ship [{shipName}]</success>

    case "depart" =>
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = this !! DepartureEvent(new Date, new Port(port), ship)
          reply match {
            case Some(result) => <success>result</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    
    case "arrive" =>
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = this !! ArrivalEvent(new Date, new Port(port), ship)
          reply match {
            case Some(result) => <success>result</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }

    case unknown =>
      <error>Unknown event: {unknown}</error>
  }
// ------- NEW -------

  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      eventLog ::= event
// ------- NEW -------
      reply(event.process)
// ------- NEW -------
    
    case init @ NewShip(_,_) =>
      val ship = spawnLinkRemote(classOf[Ship], "localhost", 9999)
      ship ! init
      reply(ship)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
