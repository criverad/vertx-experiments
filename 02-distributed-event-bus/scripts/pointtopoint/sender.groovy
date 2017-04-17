def eb = vertx.eventBus()

// Send a message every second

vertx.setPeriodic(1000, { v ->

  eb.send("ping-address", "ping!", { reply ->
    if (reply.succeeded()) {
      println("${Thread.currentThread().name} => Received reply ${reply.result().body()}")
    } else {
      println("${Thread.currentThread().name} => No reply")
    }
  })

})
