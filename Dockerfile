FROM amazoncorretto:11-alpine-jdk
maintainer mnc
copy target/mnc-0.0.1-SNAPSHOT.jar mnc-app.jar
entrypoint ["java","-jar","/mnc-app.jar"]
