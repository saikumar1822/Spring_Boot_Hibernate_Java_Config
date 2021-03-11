FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD target/Spring_Boot_Hibernate_properties-0.0.1-SNAPSHOT hello-docker.jar
ENV JAVA_OPTS=""
ENTRYPOINT ["java","-jar","/hello-docker.jar"]