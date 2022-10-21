FROM openjdk:11.0.16
ADD target/DinhThiPhuongThao-0.0.1-SNAPSHOT.jar DinhThiPhuongThao-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar","DinhThiPhuongThao-0.0.1-SNAPSHOT.jar"]
EXPOSE 8089