package training.ships.akka.labs

import java.util.Date

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
// Define the Ship
// =============================

// =======>>>> DEFINE THE SHIP AS AKKA ACTOR <<<<========

case class Port(val name: String)
object Port {
  val AT_SEA = new Port("AT SEA")
}
