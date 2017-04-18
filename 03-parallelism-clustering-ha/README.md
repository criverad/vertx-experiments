# Parallelism, Clustering, and HA

## HA: Run scripts with HA

1. Go to ```01-event-loops``` and run:

```
vertx run scripts/event-loop-thread.groovy -ha -instances=2
```

2. Run the same script in a different Vert.x instance by running:

```
vertx run scripts/event-loop-thread.groovy -ha -instances=3
```

3. Run the following command to get a list of all the Vert.x instances currently running:

```
jcmd -l
```

4. Kill one of the PIDs in the list using ```kill -9 [PID]``` and watch the verticles being moved to another Vert.x instance.

## Parallelism: HTTP Server with multiples instances

1. Run the following command in order to start a Web Server on port 8080:

```
vertx run scripts/server.groovy
```

and then try to curl it:

```
curl http://localhost:8080/
```

2. Run more instances of the same server:

```
vertx run scripts/server.groovy -instances=5
```

and then curl it multiple times:

```
for i in {1..5}; do curl http://localhost:8080; echo; done
```

**Wonder how come the HTTP Server is listening to the same port and not colliding with the other instances?**