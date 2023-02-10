FROM amazoncorretto:8-alpine-jdk
MAINTAINER Mariani Neme Colombo
COPY target/mnc-0.0.1-SNAPSHOT.jar mnc-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/mnc-0.0.1-SNAPSHOT.jar"]