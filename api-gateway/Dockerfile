FROM openjdk:17
VOLUME /tmp
#RUN mvn clean install
COPY target/api-gateway.jar api-gateway.jar
ENTRYPOINT ["java","-jar","/api-gateway.jar"]