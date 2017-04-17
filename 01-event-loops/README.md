# Event Loop Experiments

## Running Vert.x Scripts

1. Event loop with a groovy script

```
vertx run scripts/event-loop-thread.groovy
vertx run scripts/event-loop-thread.groovy -instances=2
```

2. Event loop with a groovy class

```
vertx run scripts/EventLoopExampleVerticle.groovy
```

## Running Vert.x Apps

1. Event loop with verticles being deployed programmatically

```
cd projects/vertx-app/
./gradlew clean shadowJar && java -jar ./build/libs/vertx-app-1.0.0-SNAPSHOT-fat.jar
```