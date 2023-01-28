
FROM amazoncorretto:11-alpine-jdk
MAINTAINER MNC
COPY target/mnc-0.0.1-SNAPSHOT.jar mnc-app.jar
ENTRYPOINT ["java","-jar","/mnc-app.jar"]