# Start with a base image containing Java runtime
FROM openjdk:11-jre-slim
# Add Maintainer Info
LABEL maintainer="Kamil Celejewski"
# The application's jar file
ARG JAR_FILE=target/cassandra-api-0.0.1-SNAPSHOT.jar
# Add the application's jar to the container
ADD ${JAR_FILE} cassandra-api.jar
# Run the jar file
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/cassandra-api.jar"]