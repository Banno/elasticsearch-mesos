package mesosphere.elasticsearch
import org.slf4j.LoggerFactory

/**
 * A thin logging wrapper.
 */
trait Logger { self =>
  protected[this] lazy val log = new {
    private[this] lazy val logger = LoggerFactory.getLogger(self.getClass)

    def debug(msg: String) = logger.debug(msg)
    def info(msg: String) = logger.info(msg)
    def warn(msg: String) = logger.warn(msg)
    def error(msg: String) = logger.error(msg)
  }
}
