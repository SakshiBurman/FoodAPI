FROM openjdk:22
COPY target/*.jar foodapi.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/foodapi.jar"]
