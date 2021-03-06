package training.ships.akka_supervision.labs

import se.scalablesolutions.akka.actor.{OneForOneStrategy, Actor}
import se.scalablesolutions.akka.config.ScalaConfig._

object EventProcessor extends Actor {
  private var eventLog: List[StateChangeEvent] = Nil

  def receive: PartialFunction[Any, Unit] = {
    case event: StateChangeEvent =>
      event.process
      eventLog ::= event

    case Replay =>
      eventLog.reverse.foreach(_.process)

    case ReplayUpTo(date) =>
      eventLog.reverse.filter(_.occurred.getTime <= date.getTime).foreach(_.process)

    case unknown =>
      log.error("Unknown event: %s", unknown)
  }
}
