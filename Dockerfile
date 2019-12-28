FROM openjdk8:v1
MAINTAINER "Zhang Peng <csonezp@gmail.com>"
LABEL description="Spring Boot Image"
WORKDIR /app
COPY target/echo-service.jar /app/app.jar
EXPOSE 8080
CMD java -jar /app/app.jar