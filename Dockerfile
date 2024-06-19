FROM openjdk:21
ADD target/boot-mongo-demo.jar  boot-mongo-demo.jar
ENTRYPOINT [ "java","-jar","boot-mongo-demo.jar" ]