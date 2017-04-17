# Event Bus Experiments

## P2P

1. Run the following commands:

```
vertx run scripts/pointtopoint/receiver.groovy
vertx run scripts/pointtopoint/sender.groovy
```

What happened? The verticles are not talking to each other!

2. Now run the correct commands:

```
vertx run scripts/pointtopoint/receiver.groovy -cluster
vertx run scripts/pointtopoint/sender.groovy -cluster
```

The Event Bus is now clustered so both sender and receiver are able to communicate.

3. Play with number of instances for both sender and receiver

```
vertx run scripts/pointtopoint/receiver.groovy -cluster -instances=3
vertx run scripts/pointtopoint/sender.groovy -cluster -instances=2
```

## Pub-Sub

Run the following commands:

```
vertx run scripts/pubsub/receiver.groovy -cluster -instances=3
vertx run scripts/pubsub/sender.groovy -cluster
```
