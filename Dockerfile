FROM java:8-alpine
add webapp/target/web-base.jar web-base.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/web-base.jar"]