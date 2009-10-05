package training.ships.akka_rest

import java.util.Date

import se.scalablesolutions.akka.config.ScalaConfig._
import se.scalablesolutions.akka.actor.Actor

// =============================
// Define the events
// =============================

@serializable sealed trait Event

case class NewShip(shipName: String, destination: Port) extends Event

case object Reset extends Event
case object CurrentPort extends Event

case object Replay extends Event
case class ReplayUpTo(date: Date) extends Event

case class Register(ship: Ship) extends Event
case object Kill

abstract case class StateChangeEvent(val occurred: Date) extends Event {
  val recorded = new Date
  def process: String
}

case class DepartureEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
// ------- NEW -------
  override def process: String = (ship !! this).getOrElse("<error>Could not move Ship</error")
// ------- NEW -------
}

case class ArrivalEvent(val time: Date, val port: Port, val ship: Ship) extends StateChangeEvent(time) {
// ------- NEW -------
  override def process: String = (ship !! this).getOrElse("<error>Could not move Ship</error")
// ------- NEW -------
}

// =============================
// Define the domain: Ship, Cargo, Port, Country
// =============================

case class Port(val city: String)
object Port {
  val AT_SEA = new Port("AT SEA")
}

class Ship(val shipName: String, private var currentDestination: Port) extends Actor {
  lifeCycleConfig = Some(LifeCycle(Permanent, 100))

  log.info("Created %s", toString)

  def receive: PartialFunction[Any, Unit] = {

    case ArrivalEvent(time, port, _) =>
      currentDestination = port
// ------- NEW -------
      val message = String.format("%s ARRIVED at port %s @ %s", toString, port, time)
      log.info(message)
      reply(message)
// ------- NEW -------

    case DepartureEvent(time, port, _) =>
      currentDestination = Port.AT_SEA
// ------- NEW -------
      val message = String.format("%s DEPARTED from port %s @ %s", toString, port, time)
      log.info(message)
      reply(message)
// ------- NEW -------

    case Kill =>
      log.error("%s has been killed", toString)
      throw new RuntimeException("I'm killed: " + toString)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
  
  override def toString = "Ship(" + shipName + ")"
}
