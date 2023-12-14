FROM eclipse-temurin:17-jdk-alpine
VOLUME /tmp
COPY /app/target/app*.jar /app/app.jar
ENTRYPOINT ["java","-jar","/app/app.jar"]