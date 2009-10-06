package training.ships.akka_persistence

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import se.scalablesolutions.akka.state.{PersistentVector, CassandraStorageConfig, PersistentState}

import javax.ws.rs.{PathParam, GET, Produces, Path}
import java.util.Date

import scala.collection.mutable.HashMap

import dispatch.json.{JsArray, JsString}

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

  // holds all current active ships mapped by name (non-persistent)
  private lazy val shipRepository = new HashMap[String, Ship]

  // store the EventProcessor's event log in order
  private lazy val eventLog: PersistentVector = {
    val vector = PersistentState.newVector(CassandraStorageConfig())
    vector.uuid = getClass.getName
    vector
  }

  @GET
  @Produces(Array("text/xml"))
  def process(@PathParam("event") event: String,
              @PathParam("shipName") shipName: String,
              @PathParam("port") port: String) = event match {
    case "create" =>      (this !! (List(event, shipName, port, "new"))).getOrElse(<error>Could not create ship</error>)
    case "depart" =>      (this !! (List(event, shipName, port, "new"))).getOrElse(<error>Could not move ship</error>)
    case "arrive" =>      (this !! (List(event, shipName, port, "new"))).getOrElse(<error>Could not move ship</error>)
    case "destination" => (this !! (List(event, shipName, "", "new"))).getOrElse(<error>Could get destination for ship</error>)
    case "sink" =>        this ! List(event, shipName, "", "new"); <success>Ship killed</success>
    case unknown =>       <error>Unknown event: {unknown}</error>
  }

  def receive: PartialFunction[Any, Unit] = {
    case Init =>
      // replay events
      for {
        index <- 0 until eventLog.length
        eventAsJSON = eventLog.get(index)
      } {
        val JsArray(List(JsString(command), JsString(ship), JsString(port), JsString(status))) = eventAsJSON
        this ! List(command, ship, port, "old")
      }

    case event @ List(command: String, shipName: String, port: String, status: String) => command match {

      case "create" =>
        val result = shipRepository.get(shipName) match {
          case Some(ship) =>
            <success>Ship [{shipName}] already created</success>
          case None =>
            val ship = new Ship(shipName, new Port(port))
            startLink(ship) // supervise the Ship
            shipRepository.put(shipName, ship)
            <success>Created new ship [{shipName}]</success>
        }
        status match {
          case "new" =>
            eventLog + event
            reply(result)
          case "old" => {}
        }

      case "depart" =>
        val result = shipRepository.get(shipName) match {
          case Some(ship) =>
            val shipEvent = DepartureEvent(new Date, new Port(port), ship)
            <success>{shipEvent.process}</success>
          case None => <error>Ship [{shipName}] has not been created yet</error>
        }
        status match {
          case "new" =>
            eventLog + event
            reply(result)
          case "old" => {}
        }  

      case "arrive" =>
        val result = shipRepository.get(shipName) match {
          case Some(ship) =>
            val shipEvent = ArrivalEvent(new Date, new Port(port), ship)
            <success>{shipEvent.process}</success>
          case None => <error>Ship [{shipName}] has not been created yet</error>
        }
        status match {
          case "new" =>
            eventLog + event
            reply(result)
          case "old" => {}
        }

      case "destination" =>
        val result = shipRepository.get(shipName) match {
          case Some(ship) =>
            val reply = ship.asInstanceOf[Ship] !! CurrentPort
            reply match {
              case Some(result) => <success>{result.toString}</success>
              case None =>         <error>Error in EventProcessor</error>
            }
          case None => <error>Ship [{shipName}] has not been created yet</error>
        }
        status match {
          case "new" => reply(result)
          case "old" => {}
        }

      case "sink" =>
        shipRepository.get(shipName) match {
          case Some(ship) => ship.asInstanceOf[Ship] ! Sink
          case None => {}
        }

      case unknown =>
        log.error("Unknown event: %s", unknown)
    }
  }
}
