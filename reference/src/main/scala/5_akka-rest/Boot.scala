package training.ships.akka_rest.reference

import se.scalablesolutions.akka.actor.SupervisorFactory
import se.scalablesolutions.akka.config.ScalaConfig._

class Boot {
  object factory extends SupervisorFactory {
    override def getSupervisorConfig = {
      SupervisorConfig(
        RestartStrategy(OneForOne, 3, 100),
        Supervise(
          new EventProcessorFacade,
          LifeCycle(Permanent, 100)) ::
        Nil)
    }
  }
  val supervisor = factory.newSupervisor
  supervisor.startSupervisor
}