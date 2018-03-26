FROM openjdk:8-jdk-alpine
ADD target/rest-service-0.0.1-SNAPSHOT.jar /tmp/app.jar
EXPOSE 8080
ENTRYPOINT ["java"]
CMD ["-jar", "/tmp/app.jar"]