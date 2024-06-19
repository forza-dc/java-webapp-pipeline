FROM openjdk:11-jre-slim
WORKDIR /app
COPY target/forza-java-webapp.jar /app/forza-java-webapp.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/forza-java-webapp.jar"]
