
def eb = vertx.eventBus()

eb.consumer("news-feed", { message ->
  println("${Thread.currentThread().name} => Received news on consumer: ${message.body()}")
})

println("${Thread.currentThread().name} => Ready!")
