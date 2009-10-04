package training.ships.akka_remote

import java.util.Date

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._
import se.scalablesolutions.akka.nio.RemoteServer
import se.scalablesolutions.akka.serialization.Serializable

// =============================
// Define the events
// =============================

// ------- NEW -------
@serializable sealed trait Event
// ------- NEW -------

// ------- NEW -------
case class NewShip(shipName: String, destination: Port) extends Event
// ------- NEW -------

case object Reset extends Event
case object CurrentPort extends Event

case object Replay extends Event
case class ReplayUpTo(date: Date) extends Event

case object Kill

abstract case class StateChangeEvent(val occurred: Date) extends Event {
  val recorded = new Date
  def process: Unit
}

case class DepartureEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process = ship ! DepartureEvent(time, port, null)
}

case class ArrivalEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process = ship ! ArrivalEvent(time, port, null)
}

// =============================
// Define the domain: Ship, Cargo, Port, Country
// =============================

case class Port(val city: String, val country: Country)
object Port {
  val AT_SEA = new Port("AT SEA", Country.AT_SEA)
}

case class Country(val name: String)
object Country {
  val US = new Country("US")
  val CANADA = new Country("CANADA")
  val AT_SEA = new Country("AT_SEA")
}

class Ship extends Actor {
  lifeCycleConfig = Some(LifeCycle(Permanent, 100))

  private var shipName: String = _
  private var currentDestination: Port = _

  def receive: PartialFunction[Any, Unit] = {
// ------- NEW -------
    case NewShip(name, port) =>
      shipName = name 
      currentDestination = port
// ------- NEW -------

    case ArrivalEvent(time, port, _) =>
      log.info("%s ARRIVED at port %s @ %s", toString, port, time)
      currentDestination = port

    case DepartureEvent(time, port, _) =>
      log.info("%s DEPARTED from port %s @ %s", toString, port, time)
      currentDestination = Port.AT_SEA

    case Reset =>
      log.info("%s has been reset", toString)

    case CurrentPort =>
      reply(currentDestination)

    case Kill =>
      throw new RuntimeException("I'm killed: " + this)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
  
  override def toString = "Ship(" + shipName + ")"
}

// =============================
// Event processor and storage
// =============================

object EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start
  
// ------- NEW -------
  RemoteServer.start(None)
// ------- NEW -------

  private var eventLog: List[StateChangeEvent] = Nil

  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      event.process
      eventLog ::= event

    case Replay =>
      eventLog.reverse.foreach(_.process)

    case ReplayUpTo(date) =>
      eventLog.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process)

// ------- NEW -------
    case init @ NewShip(_,_) =>
      val ship = spawnLinkRemote(classOf[Ship], "localhost", 9999)
      ship ! init
      reply(ship)
// ------- NEW -------

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
