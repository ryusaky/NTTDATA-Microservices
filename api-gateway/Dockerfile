FROM openjdk:17
VOLUME /tmp
COPY target/api-gateway.jar api-gateway.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/api-gateway.jar"]