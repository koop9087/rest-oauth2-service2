# Use the OpenJDK 17 Alpine image as the base image
FROM wodby/openjdk:17-alpine

# Add your Java application JAR file into the container
ADD target/rest-oauth2-service-0.0.1-SNAPSHOT.jar app.jar

# Add your bootstrap script into the container

ENTRYPOINT ["java","-jar","app.jar"]