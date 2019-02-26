FROM maven:3.3.9
RUN mkdir /docker-app
WORKDIR /docker-app
COPY src src
COPY pom.xml pom.xml
RUN ["mvn", "clean", "install"]
COPY target/app.jar app.jar
EXPOSE 7777
ENTRYPOINT ["java", "-jar", "app.jar"]
