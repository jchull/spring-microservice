# spring-microservice
Basic Spring RESTful API build to Docker


# Build
mvn install dockerfile:build
# Run
docker run -p "8080:8080" -t coderado/restful-microservice
# Test
curl http://localhost:8080
> Welcome!
