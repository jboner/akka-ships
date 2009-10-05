package training.ships.akka_persistence

import se.scalablesolutions.akka.actor.{SupervisorFactory, OneForOneStrategy, Actor}
import se.scalablesolutions.akka.state.{PersistentMap, CassandraStorageConfig, PersistentState}
import se.scalablesolutions.akka.config.ScalaConfig._

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date
import collection.mutable.HashMap

class Boot {
  val processor = new EventProcessor
  object factory extends SupervisorFactory {
    override def getSupervisorConfig: SupervisorConfig = {
      SupervisorConfig(
        RestartStrategy(OneForOne, 3, 100),
        Supervise(
          processor,
          LifeCycle(Permanent, 100)) ::
        Nil)
    }
  }
  val supervisor = factory.newSupervisor
  supervisor.startSupervisor
  processor ! Init
}

// =============================
// Event processor and storage
// =============================

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
class EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  makeTransactionRequired
  trapExit = true
  start

  private var eventLog: List[StateChangeEvent] = Nil
  private lazy val shipRepository = new HashMap[String, Ship]
  private lazy val storedShipData: PersistentMap = {
    val storage = PersistentState.newMap(CassandraStorageConfig())
    storage.uuid = getClass.getName
    storage
  }

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
      shipRepository.get(shipName) match {
        case Some(ship) => <success>Ship [{shipName}] already created</success>
        case None =>
          val reply = this !! NewShip(shipName, port)
          reply match {
            case None =>
              <error>Could not create a new ship</error>
            case Some(ship) =>
              <success>Created new ship [{shipName}]</success>
          }
      }
    case "depart" =>      (this !! Depart(shipName, port)).getOrElse(<error>Could not move ship</error>)
    case "arrive" =>      (this !! Arrive(shipName, port)).getOrElse(<error>Could not move ship</error>)
    case "destination" => (this !! Destination(shipName)).getOrElse(<error>Could get destination for ship</error>)
    case "sink" =>        this ! Sink(shipName); <success>Ship killed</success>
    case unknown =>       <error>Unknown event: {unknown}</error>
  }

  def receive: PartialFunction[Any, Unit] = {
    case Init =>
      // recreate persisted ships
      storedShipData.values.foreach { shipData =>
        val (ship: String, port: String) = shipData
        createNewShip(ship, port)
      }

    case NewShip(shipName, port) =>
      reply(createNewShip(shipName, port))

    case Depart(shipName, port) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val event = DepartureEvent(new Date, new Port(port), ship.asInstanceOf[Ship])
          eventLog ::= event
          <success>{event.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }

    case Arrive(shipName, port) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val event = ArrivalEvent(new Date, new Port(port), ship.asInstanceOf[Ship])
          eventLog ::= event
          <success>{event.process}</success>
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }

    case Destination(shipName) => reply {
      shipRepository.get(shipName) match {
        case Some(ship) =>
          val reply = ship.asInstanceOf[Ship] !! CurrentPort
          reply match {
            case Some(result) => <success>{result.toString}</success>
            case None =>         <error>Error in EventProcessor</error>
          }
        case None => <error>Ship [{shipName}] has not been created yet</error>
      }
    }

    case Sink(shipName) =>
      shipRepository.get(shipName) match {
        case Some(ship) => ship.asInstanceOf[Ship] ! Sink
        case None => {}
      }

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }

  private def createNewShip(shipName: String, port: String): Ship = {
    val ship = new Ship(shipName, new Port(port))
    startLink(ship)
    shipRepository.put(shipName, ship)
    storedShipData.put(shipName, Pair(shipName, port))
    ship
  }
}
