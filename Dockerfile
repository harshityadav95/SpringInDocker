FROM adoptopenjdk/openjdk11:alpine-jre


ARG APP_NAME="SampleApplication"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/target/mytroubleartifact-0.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "app.jar"]