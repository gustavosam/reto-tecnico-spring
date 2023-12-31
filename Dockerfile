FROM openjdk:11

ARG JAR_FILE=target/*.jar

COPY ${JAR_FILE} app.jar

EXPOSE 8098

CMD ["java", "-jar", "app.jar"]