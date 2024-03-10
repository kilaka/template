# Code templates for spring boot

## compile and run
./mvnw package
./mvnw spring-boot:run

## Invoke
curl localhost:8080/sanctuary

curl --header "Content-Type: application/json" \
--request POST \
--data '{"name":"julius"}' \
localhost:8080/sanctuary
