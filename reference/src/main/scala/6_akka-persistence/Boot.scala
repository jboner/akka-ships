package training.ships.akka_persistence.reference

import se.scalablesolutions.akka.actor.SupervisorFactory
import se.scalablesolutions.akka.config.ScalaConfig._

class Boot {
  val processorFacade = new EventProcessorFacade
  object factory extends SupervisorFactory {
    override def getSupervisorConfig = {
      SupervisorConfig(
        RestartStrategy(OneForOne, 3, 100),
        Supervise(
          processorFacade,
          LifeCycle(Permanent, 100)) ::
        Nil)
    }
  }
  val supervisor = factory.newSupervisor
  supervisor.startSupervisor
  processorFacade ! ReplayEvents
}
