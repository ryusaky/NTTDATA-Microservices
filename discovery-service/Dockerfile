FROM openjdk:17
VOLUME /tmp
COPY target/discovery-service.jar discovery-service.jar
EXPOSE 8761
ENTRYPOINT ["java","-jar","/discovery-service.jar"]