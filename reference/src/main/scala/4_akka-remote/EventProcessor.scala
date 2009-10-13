package training.ships.akka_remote.reference

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._
import se.scalablesolutions.akka.nio.RemoteServer

object EventProcessor extends Actor {
  faultHandler = Some(OneForOneStrategy(5, 5000))
  trapExit = true
  start
  
// ------- NEW -------
  RemoteServer.start(None)
// ------- NEW -------

  private var eventLog: List[StateChangeEvent] = Nil

  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      event.process
      eventLog ::= event

    case Replay =>
      eventLog.reverse.foreach(_.process)

    case ReplayUpTo(date) =>
      eventLog.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process)

// ------- NEW -------
    case newShip @ NewShip(_,_) =>
      val ship = spawnLinkRemote(classOf[Ship], "localhost", 9999)
      ship ! newShip
      reply(ship)
// ------- NEW -------

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
