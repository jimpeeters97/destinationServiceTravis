FROM openjdk:8-jdk-alpine
RUN  apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /usr/local/les10taakdestinationservice
ADD  les10taakdestinationservice-latest.jar /usr/local/les10taakdestinationservice/
ADD run.sh run.sh
RUN chmod +x run.sh
CMD ./run.sh