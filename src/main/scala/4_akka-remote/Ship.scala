package training.ships.akka_remote

import java.util.Date

import se.scalablesolutions.akka.actor.Actor
import se.scalablesolutions.akka.config.ScalaConfig._

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

case object Sink

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
// Define the Ship
// =============================

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

    case Sink =>
      throw new RuntimeException("I'm killed: " + this)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
  
  override def toString = "Ship(" + shipName + ")"
}

case class Port(val name: String)
object Port {
  val AT_SEA = new Port("AT SEA")
}

