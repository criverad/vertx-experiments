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

## Pub-Sub

