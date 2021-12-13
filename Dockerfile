FROM adoptopenjdk:8u292-b10-jdk-hotspot
ARG SERVER_DIR
WORKDIR /runner
ENV TZ Asia/Shanghai
ENV SERVER_PORT 80
EXPOSE 80

COPY $SERVER_DIR/target/*.jar /runner/

#RUN chmod +x /runner/run_command.sh

ENTRYPOINT ["java", "-jar", "/runner/server.jar"]
