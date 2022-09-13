FROM openjdk:17
VOLUME /tmp
#RUN mvn clean install
COPY target/config-server.jar config-server.jar
ENTRYPOINT ["java","-jar","/config-server.jar"]