FROM eclipse-temurin:20.0.1_9-jre-alpine as builder
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} application.jar
ENTRYPOINT ["java","-jar","/application.jar"]