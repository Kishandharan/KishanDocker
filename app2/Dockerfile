FROM ubuntu:latest
WORKDIR /app/
RUN apt update -y 
RUN apt upgrade -y
RUN apt install python3 -y
COPY . .
CMD ["python3", "app.py"]
