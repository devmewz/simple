FROM gcr.io/distroless/java:8
COPY /target/simple-0.0.1-SNAPSHOT.jar /app/simple.jar
EXPOSE 8080
ENTRYPOINT  [ "java", "-jar", "/app/simple.jar" ]