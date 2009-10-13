package training.ships.akka_persistence

import java.util.Date

import se.scalablesolutions.akka.config.ScalaConfig._
import se.scalablesolutions.akka.actor.Actor

// =============================
// Define the events
// =============================

@serializable sealed trait Event
case object ReplayEvents extends Event
case object CurrentPort extends Event
case object Replay extends Event
case object Sink extends Event

case object GetEventLog extends Event

abstract case class StateChangeEvent(val occurred: Date) extends Event {
  val recorded = new Date
  def process: String
}
case class DepartureEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process: String = (ship !! this).getOrElse(throw new RuntimeException("Could not move Ship"))
}
case class ArrivalEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
  override def process: String = (ship !! this).getOrElse(throw new RuntimeException("Could not move Ship"))
}

// =============================
// Define the domain: Ship, Cargo, Port, Country
// =============================

case class Port(val name: String)
object Port {
  val AT_SEA = new Port("AT SEA")
}

class Ship(val shipName: String, private var port: Port) extends Actor {
  lifeCycleConfig = Some(LifeCycle(Permanent, 100))

  makeTransactionRequired
  private var currentDestination: Port = port

  log.info("Created %s", toString)

  def receive: PartialFunction[Any, Unit] = {

    case ArrivalEvent(time, port, _) =>
      currentDestination = port
      reply(String.format("%s ARRIVED at port %s @ %s", toString, port, time))

    case DepartureEvent(time, port, _) =>
      currentDestination = Port.AT_SEA
      reply(String.format("%s DEPARTED from port %s @ %s", toString, port, time))

    case Sink =>
      log.error("%s has been killed", toString)
      throw new RuntimeException("I'm killed: " + toString)

    case CurrentPort =>
      reply(currentDestination)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
  
  override def toString = "Ship(" + shipName + ")"
}
