FROM adoptopenjdk:11

# install Maven
ARG MAVEN_VERSION=3.6.3
ARG USER_HOME_DIR="/."
RUN mkdir -p /usr/share/maven && \
curl -fsSL http://apache.osuosl.org/maven/maven-3/$MAVEN_VERSION/binaries/apache-maven-$MAVEN_VERSION-bin.tar.gz | tar -xzC /usr/share/maven --strip-components=1 && \
ln -s /usr/share/maven/bin/mvn /usr/bin/mvn
ENV MAVEN_HOME /usr/share/maven
ENV MAVEN_CONFIG "$USER_HOME_DIR/.m2"

# speed up Maven JVM
ENV MAVEN_OPTS="-XX:+TieredCompilation -XX:TieredStopAtLevel=1"
ENTRYPOINT ["/usr/bin/mvn"]

# Install project dependencies and keep sources
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# install maven dependency packages (keep in image)
COPY pom.xml /usr/src/app
RUN mvn -T 1C install && rm -rf target

# copy other source files (keep in image)
COPY src /usr/src/app/src

#COPY target/twitch-analytics-service-backend-0.0.1-SNAPSHOT.jar /app/twitch-analytics-service-backend-0.0.1-SNAPSHOT.jar
#RUN mkdir - /app/java_tmp
#WORKDIR /app
EXPOSE 8080
#ENTRYPOINT ["java", "-XX:+UnlockExperimentalVMOptions", "-Duser.country=GB", "-Duser.language=en", "-XX:MaxRAMFraction=2", "-Djava.io.tmpdir=/usr/src/app", "-jar", "*.jar"]
