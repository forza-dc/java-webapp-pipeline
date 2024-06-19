FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/helloworld.jar /app/helloworld.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/helloworld.jar"]
