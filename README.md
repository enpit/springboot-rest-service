# Demo Springboot REST Service
inkl. Dockerfile


## Prerequsites

* Java 1.8
* Maven 3.x
* Docker


## Get the Sourcecode

```
git clone https://github.com/enpit/springboot-rest-service.git
```

## Build service
```
mvn package
```

## Run service

```
java -jar target/rest-service-0.0.1-SNAPSHOT.jar
```

or using the springboot maven plugin

```
mvn spring-boot:run
```

Access service through browser at http://localhost:8080/hello

## Build Docker image

```
docker build -t enpit/springboot-rest-service .
```

## Run Docker Container

```
docker run --name springboot-rest-service -p 8080:8080 -d enpit/springboot-rest-service
```

Access service through browser at http://localhost:8080/hello

## Cleanup

Stop Container
```
docker rm -f springboot-rest-service
```

Remove image
```
docker rmi enpit/springboot-rest-service
```
