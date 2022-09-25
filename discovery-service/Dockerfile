FROM openjdk:17
VOLUME /tmp
#RUN mvn clean install
COPY target/discovery-service.jar discovery-service.jar
ENTRYPOINT ["java","-jar","/discovery-service.jar"]