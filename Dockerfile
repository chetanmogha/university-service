FROM openjdk:11
ADD target/university-service.jar university.jar
EXPOSE 8200
ENTRYPOINT [ "java", "-jar", "university.jar" ]