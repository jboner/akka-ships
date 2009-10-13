package training.ships.akka_rest.labs

import se.scalablesolutions.akka.actor.SupervisorFactory
import se.scalablesolutions.akka.config.ScalaConfig._

class Boot {
  object factory extends SupervisorFactory {
  }
  val supervisor = factory.newSupervisor
  supervisor.startSupervisor
}