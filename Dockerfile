FROM adoptopenjdk:11

ADD target/twitch-analytics-service-backend.jar /app/twitch-analytics-service-backend.jar

RUN mkdir - /app/java_tmp

WORKDIR /app

EXPOSE 8000

