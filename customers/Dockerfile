FROM openjdk:17
VOLUME /tmp
#RUN mvn clean install
COPY target/customers.jar customers.jar
ENTRYPOINT ["java","-jar","/customers.jar"]