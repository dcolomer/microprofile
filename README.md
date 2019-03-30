## Testing microprofile with Thorntail (AKA wildfly swarm)
### Simple pet project REST API
We have a Task class and we can create new tasks and return it as JSON

Java version: 10

localhost:8080/Task

PUT (task as store):

curl -H 'Content-Type: application/json' -X PUT -d '{"id":2,"description":"new!"}' http://localhost:8080/task
