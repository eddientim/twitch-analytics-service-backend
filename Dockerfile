FROM adoptopenjdk:11

ADD target/twitch-analytics-service-backend-0.0.1-SNAPSHOT.jar /app/twitch-analytics-service-backend-0.0.1-SNAPSHOT.jar

RUN mkdir - /app/java_tmp

WORKDIR /app

EXPOSE 8080

ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Duser.country=GB", "-Duser.language=en", "-XX:MaxRAMFraction=2", "-Djava.io.tmpdir=/app/java_tmp", "-jar", "twitch-analytics-service-backend-0.0.1-SNAPSHOT.jar"]
