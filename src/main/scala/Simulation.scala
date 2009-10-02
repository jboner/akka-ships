package se.scalablesolutions.akka

import java.util.Date

object Runner {
  def main(args: Array[String]) = {
    val simulation = new Simulation
    simulation
        .setup
        .arrivalSetsShipsLocation
        .departurePutsShipOutToSea
        .smallTrip
        .resetAndReplayEventLog
        .resetAndReplayEventLogUpToDate
        .tearDown
  }
}

class Simulation {
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
    processor.stop
    shipKR.stop
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
