package training.ships.scalaactors.labs

import java.util.Date

import scala.actors.Actor
import scala.actors.Actor._

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
// Define the Ship
// =============================

class Ship(val name: String, val home: Port) extends Actor {
  private var current: Port = home

  def act = loop {
    react {
      case ArrivalEvent(time, port, _) =>
        println(toString + " ARRIVED  at port   " + port + " @ " + time)
        current = port

      case DepartureEvent(time, port, _) => 
        println(toString + " DEPARTED from port " + port  + " @ " + time)
        current = Port.AT_SEA

      case CurrentPort => 
        reply(current)

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }

  override def toString = "Ship(" + name + ")"
}

case class Port(name: String)
object Port {
  val AT_SEA = new Port("AT SEA")
}
