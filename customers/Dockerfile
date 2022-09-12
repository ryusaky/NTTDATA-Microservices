FROM openjdk:17
VOLUME /tmp
COPY target/customers.jar customers.jar
EXPOSE 5052
ENTRYPOINT ["java","-jar","/customers.jar"]