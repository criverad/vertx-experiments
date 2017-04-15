import io.vertx.core.AbstractVerticle

class EventLoopExampleVerticle extends AbstractVerticle {

  @Override
  void start() throws Exception {
    println "Starting on thread ${Thread.currentThread().name}"
  }

  @Override
  void stop() throws Exception {
    println "stopping"
  }
}
