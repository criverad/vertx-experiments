class MyVerticle extends AbstractVerticle {

  @Override
  void start() throws Exception {
    println "Starting on thread ${Thread.currentThread().name}"
  }

  @Override
  void stop() throws Exception {
    println "Stopping"
  }

}

vertx.deployVerticle('MyVerticle')