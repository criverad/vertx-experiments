
def eb = vertx.eventBus()

eb.consumer("ping-address", { message ->

  println("${Thread.currentThread().name} => Received message: ${message.body()}")
  // Now send back reply
  message.reply("pong!")
})

println("${Thread.currentThread().name} => Receiver ready!")
