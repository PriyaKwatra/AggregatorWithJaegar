FROM java:8

COPY target/aggregator-service-0.0.1-SNAPSHOT.jar /etc/nagp/aggregator-service.jar

WORKDIR /etc/nagp

EXPOSE 6000

ENTRYPOINT ["java","-jar","aggregator-service.jar"]
