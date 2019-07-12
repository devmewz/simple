FROM gcr.io/distroless/java:8
COPY /target/simple-0.0.1-SNAPSHOT.jar /app/simple.jar
ENTRYPOINT  [ "java", "-jar", "/app/simple.jar" ]