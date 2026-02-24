FROM ubuntu:latest
WORKDIR /app
RUN apt update --yes
RUN apt upgrade --yes
RUN apt install openjdk-17-jdk --yes
COPY . .
RUN javac app.java
CMD ["java", "app"]