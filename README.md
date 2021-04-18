# Hello World Rest API

Simple Restful service that returns a hello world response or greets a user based on a given ID.

## Getting Started

### Run the Application

#### Run with Docker

This project is available as a docker image [here](https://hub.docker.com/r/mamadasun1/helloworld-rest)

1. Pull the image: `docker pull mamadasun1/helloworld-rest`
1. Run the image as a container: `docker run -p 8080:8080 mamadasun1/helloworld-rest`
1. The application should now be running on port 8080

For additional help with docker read [Getting Started with Docker](https://docs.docker.com/get-started/)

#### Run with Gradle

You can clone this project from GitHub and run the project locally via Gradle

1. Clone the repo: `git clone git@github.com:amadasunm1/helloworld-rest.git`
1. Change working directory: `cd helloworld-rest`
1. Clean gradle: `gradle clean`
1. Build: `gradle build`
1. Run: java -jar build/libs/helloworld-rest*.jar

### Make Requests

Now that the application is running you can make requests to the following endpoints.

#### Hello World
Request:

`GET http:\\localhost:8080\hello` 

Response
```
Hello World!
```

Returns Hello World!

#### Hello User By  ID
`GET http:\\localhost:8080\hello\{id}`

Request:

`GET http:\\localhost:8080\hello\{id}`

Response
```
Hello John Smith!
```

#### Create User
`POST http:\\localhost:8080\hello` Creates a User based on the request

Request:
```
{
  "firstName": "John",
  "lastName": "Smith"
}
```

Response:
```
{
  "id": 1,
  "firstName": "John",
  "lastName": "Smith"
}
```


## Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.4.5/gradle-plugin/reference/html/)

