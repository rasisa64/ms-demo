FROM openjdk:11.0.7
ADD build/libs/ms-demo-*.jar ms-demo.jar
EXPOSE 8083
ENTRYPOINT ["java", "-jar","-Xms256m","-Xmx2048m","ms-demo.jar"]