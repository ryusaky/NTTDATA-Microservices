FROM openjdk:17
VOLUME /tmp
COPY target/*.jar config-server.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/config-server.jar"]