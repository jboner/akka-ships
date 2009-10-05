package training.ships.akka

import se.scalablesolutions.akka.actor.Actor
import java.util.Date
import se.scalablesolutions.akka.state.{PersistentState, MongoStorageConfig}
// =============================
// Define the events
// =============================

sealed trait Event

case object Reset extends Event
case object CurrentPort extends Event

case object Replay extends Event
case class ReplayUpTo(date: Date) extends Event

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

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }

  override def toString = "Ship(" + shipName + ")"
}

// =============================
// Event processor and storage
// =============================

object EventProcessor extends Actor {
  private var eventLog: List[StateChangeEvent] = Nil
  start
  
  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      event.process
      eventLog ::= event

    case Replay =>
      eventLog.reverse.foreach(_.process)

    case ReplayUpTo(date) =>
      eventLog.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
