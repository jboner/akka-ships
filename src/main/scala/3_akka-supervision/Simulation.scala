package training.ships.akka_supervision

import java.util.Date
import junit.framework.TestCase
import junit.framework.Assert._

class Simulation extends TestCase {
  private var shipKR: Ship = _
  private var portSFO, portLA, portYYV: Port = _

  override def setUp = {
    portSFO = new Port("San Francisco", Country.US)
    portLA = new Port("Los Angeles", Country.US)
    portYYV = new Port("Vancouver", Country.CANADA)

    shipKR = new Ship("King Roy", portYYV)
    EventProcessor ! Register(shipKR)
  }

  override def tearDown = {
    EventProcessor.stop
  }

  def testArrivalSetsShipsLocation = {
    println("\n===> arrivalSetsShipsLocation")

    EventProcessor ! DepartureEvent(new Date(2009, 2, 1), portSFO, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 3), portSFO, shipKR)
    Thread.sleep(500)

    assertEquals(portSFO, (shipKR !? CurrentPort))

    println("\n===> departurePutsShipOutToSea")

// ------- NEW -------
    shipKR ! Sink
// ------- NEW -------

    EventProcessor ! DepartureEvent(new Date(2009, 2, 4), portLA, shipKR)
    Thread.sleep(500)

    assertEquals(Port.AT_SEA, (shipKR !? CurrentPort))

    println("\n===> smallTrip")

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 5), portLA, shipKR)
    Thread.sleep(500)

    EventProcessor ! DepartureEvent(new Date(2009, 2, 6), portYYV, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 8), portYYV, shipKR)
    Thread.sleep(500)

    EventProcessor ! DepartureEvent(new Date(2009, 2, 9), portSFO, shipKR)
    Thread.sleep(500)

    EventProcessor ! ArrivalEvent(new Date(2009, 2, 11), portSFO, shipKR)
    Thread.sleep(500)

    assertEquals(portSFO, (shipKR !? CurrentPort))

    println("\n===> resetAndReplayEventLog")

    shipKR ! Reset

    EventProcessor ! Replay
    Thread.sleep(500)

    assertEquals(portSFO, (shipKR !? CurrentPort))

    println("\n===> resetAndReplayEventLogUpToDate")

    shipKR ! Reset

    EventProcessor ! ReplayUpTo(new Date(2009, 2, 4))
    Thread.sleep(500)

    assertEquals(Port.AT_SEA, (shipKR !? CurrentPort))
  }
}
