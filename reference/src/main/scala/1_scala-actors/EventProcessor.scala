package training.ships.scalaactors.reference

import scala.actors.Actor

// =============================
// Event processor and storage
// =============================

class EventProcessor extends Actor {
  private var eventLog = List[DomainEvent]()
  def act = {
    receive {
      case event: DomainEvent => 
        event.process
        eventLog ::= event

      case unknown => 
        error("Unknown event: " + unknown)
    }
  }
}

