FROM openjdk:17
EXPOSE 8085
ADD target/springboot-images-new.jar springboot-images-new.jar

ENTRYPOINT ["java","-jar","springboot-images-new.jar"]