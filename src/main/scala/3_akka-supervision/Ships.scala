package training.ships.akka_supervision

import java.util.Date

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._


// =============================
// Define the events
// =============================

sealed trait Event

case object Reset extends Event
case object CurrentPort extends Event

case object Replay extends Event
case class ReplayUpTo(date: Date) extends Event

// ------- NEW -------
case class Register(ship: Ship) extends Event
case object Sink
// ------- NEW -------

abstract case class StateChangeEvent(val occurred: Date) extends Event {
  val recorded = new Date

  def process: Unit
}

case class DepartureEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process = ship ! this
}

case class ArrivalEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process = ship ! this
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

class Ship(val shipName: String, private var currentDestination: Port) extends Actor {
// ------- NEW -------
  lifeCycleConfig = Some(LifeCycle(Permanent, 100))
// ------- NEW -------
  
  def receive: PartialFunction[Any, Unit] = {
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

// ------- NEW -------
    case Sink =>
      throw new RuntimeException("I'm killed: " + this)
// ------- NEW -------

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
  
  override def toString = "Ship(" + shipName + ")"
}

// =============================
// Event processor and storage
// =============================

object EventProcessor extends Actor {
// ------- NEW -------
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start
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
    case Register(ship) =>
      startLink(ship)
// ------- NEW -------

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
