package se.scalablesolutions.akka

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

      case Replay => 
        log.reverse.foreach(_.process) 
        loop(log)

      case ReplayUpTo(date) => 
        log.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process) 
        loop(log)

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }
}

// =============================
// Define the events
// =============================

sealed abstract case class Event

case object Reset extends Event
case object CurrentPort extends Event

case object Replay extends Event
case class ReplayUpTo(date: Date) extends Event

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

      case Reset => 
        println(toString + " has been reset")
        loop(home)

      case CurrentPort => 
        reply(current)
        loop(current)

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }

  override def toString = "Ship(" + name + ")"
}

class Port(val city: String, val country: Country) {
  override def toString = "Port(" + city + ")"  
}
object Port {
  val AT_SEA = new Port("AT SEA", Country.AT_SEA)
}

case class Country(val name: String)
object Country {
  val US = new Country("US")
  val CANADA = new Country("CANADA")
  val AT_SEA = new Country("AT_SEA")
}


// =============================
// Test class
// =============================

class EventSourcingWithActorsTest {

  private var shipKR: Ship = _
  private var portSFO, portLA, portYYV: Port = _
  private var processor: EventProcessor = _

  def setup = {
    processor = new EventProcessor
    processor.start
    
    portSFO = new Port("San Francisco", Country.US)
    portLA = new Port("Los Angeles", Country.US)
    portYYV = new Port("Vancouver", Country.CANADA)

    shipKR = new Ship("King Roy", portYYV)
    shipKR.start

    this
  }

  def tearDown = { 
    processor.exit
    this
  }

  def arrivalSetsShipsLocation = {
    println("\n===> arrivalSetsShipsLocation")

    processor ! DepartureEvent(new Date(2009, 2, 1), portSFO, shipKR)
    Thread.sleep(500)

    processor ! ArrivalEvent(new Date(2009, 2, 3), portSFO, shipKR)
    Thread.sleep(500)

    assert(portSFO == (shipKR !? CurrentPort))
    this
  }

  def departurePutsShipOutToSea = {
    println("\n===> departurePutsShipOutToSea")

    processor ! DepartureEvent(new Date(2009, 2, 4), portLA, shipKR)
    Thread.sleep(500)

    assert(Port.AT_SEA == (shipKR !? CurrentPort))
    this
  }

  def smallTrip = {
    println("\n===> smallTrip")

    processor ! ArrivalEvent(new Date(2009, 2, 5), portLA, shipKR)
    Thread.sleep(500)

    processor ! DepartureEvent(new Date(2009, 2, 6), portYYV, shipKR)
    Thread.sleep(500)

    processor ! ArrivalEvent(new Date(2009, 2, 8), portYYV, shipKR)
    Thread.sleep(500)

    processor ! DepartureEvent(new Date(2009, 2, 9), portSFO, shipKR)
    Thread.sleep(500)

    processor ! ArrivalEvent(new Date(2009, 2, 11), portSFO, shipKR)
    Thread.sleep(500)

    assert(portSFO == (shipKR !? CurrentPort))
    this
  }

  def resetAndReplayEventLog = {
    println("\n===> resetAndReplayEventLog")

    shipKR ! Reset

    processor ! Replay
    Thread.sleep(500)

    assert(portSFO == (shipKR !? CurrentPort))
    this
  }

  def resetAndReplayEventLogUpToDate = {
    println("\n===> resetAndReplayEventLogUpToDate")

    shipKR ! Reset

    processor ! ReplayUpTo(new Date(2009, 2, 4))
    Thread.sleep(500)

    assert(Port.AT_SEA == (shipKR !? CurrentPort))
    this
  }
}

// =============================
// Run it
// =============================

object Main {
  def main(args: Array[String]) = {
    (new EventSourcingWithActorsTest)
      .setup
      .arrivalSetsShipsLocation
      .departurePutsShipOutToSea
      .smallTrip
      .resetAndReplayEventLog
      .resetAndReplayEventLogUpToDate
      .tearDown    
  }
}
