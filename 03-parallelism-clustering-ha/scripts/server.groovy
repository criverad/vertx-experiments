vertx.createHttpServer().requestHandler({ req ->
  req.response().end("Happily served by ${Thread.currentThread().name}")
}).listen(8080)
