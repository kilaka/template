# Code templates for spring boot

## REST in mem

### compile and run
./mvnw package
./mvnw spring-boot:run

### Invoke
```
curl localhost:8080/sanctuary-in-mem
```

```
curl --header "Content-Type: application/json" \
--request POST \
--data '{"name":"julius"}' \
localhost:8080/sanctuary-in-mem
```

## REST Mongo

### Invoke
```
curl http://localhost:8080/sanctuary-mongo
```

```
curl -i -X POST -H "Content-Type:application/json" \
-d '{"name":"Didi"}' \
http://localhost:8080/sanctuary-mongo
```

```
curl http://localhost:8080/sanctuary-mongo/search/findByName?name=Didi
```