FROM openjdk:16-alpine3.13
LABEL maintainer="nandini.alluris@gmail.com"
EXPOSE 8080
ADD target/employee-management-system.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]
