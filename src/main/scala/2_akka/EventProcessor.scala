package training.ships.akka

import se.scalablesolutions.akka.actor.Actor

// =============================
// Event processor and storage
// =============================

object EventProcessor extends Actor {
  private var eventLog: List[StateChangeEvent] = Nil
  start
  
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
