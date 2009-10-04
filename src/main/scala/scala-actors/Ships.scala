package training.ships.scalaactors

import java.util.Date
import scala.actors.Actor
import scala.actors.Actor._

// =============================
// Event processor and storage
// =============================

class EventProcessor extends Actor {
  def act = loop(Nil)

  private def loop(log: List[DomainEvent]) {
    react {
      case event: DomainEvent => 
        event.process
        loop(event :: log)

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }
}

// =============================
// Define the events
// =============================

sealed trait Event

case object CurrentPort extends Event

abstract case class DomainEvent(val occurred: Date) extends Event {
  val recorded = new Date
  def process: Unit
}

case class DepartureEvent(val time: Date, val port: Port, val ship: Ship) extends DomainEvent(time) {
  override def process = ship ! this
}

case class ArrivalEvent(val time: Date, val port: Port, val ship: Ship) extends DomainEvent(time) {
  override def process = ship ! this
}

// =============================
// Define the domain: Ship, Cargo, Port, Country
// =============================

class Ship(val name: String, val home: Port) extends Actor {

  def act = loop(home)

  private def loop(current: Port) {
    react {
      case ArrivalEvent(time, port, _) => 
        println(toString + " ARRIVED  at port   " + port + " @ " + time)
        loop(port)

      case DepartureEvent(time, port, _) => 
        println(toString + " DEPARTED from port " + port  + " @ " + time)
        loop(Port.AT_SEA)

      case CurrentPort => 
        reply(current)
        loop(current)

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }

  override def toString = "Ship(" + name + ")"
}

case class Port(city: String, country: Country)
object Port {
  val AT_SEA = new Port("AT SEA", Country.AT_SEA)
}

case class Country(val name: String)
object Country {
  val US = new Country("US")
  val CANADA = new Country("CANADA")
  val AT_SEA = new Country("AT_SEA")
}