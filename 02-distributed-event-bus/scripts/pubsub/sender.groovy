
def eb = vertx.eventBus()

// Send a message every second

vertx.setPeriodic(1000, { v ->
  println "${Thread.currentThread().name} => Publishing some news!"
  eb.publish("news-feed", "Some news!")
})
