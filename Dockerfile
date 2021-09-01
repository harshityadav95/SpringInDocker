#FROM adoptopenjdk/openjdk11:alpine-jre

FROM adoptopenjdk:11-jre-hotspot

#FROM openjdk:8-jdk-alpine

ARG APP_NAME="SpringInDocker"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/target/SpringInDocker-0.0.1-SNAPSHOT.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "app.jar"]