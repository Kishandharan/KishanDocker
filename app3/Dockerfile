FROM ubuntu:latest
WORKDIR /app 

RUN apt update --yes 
RUN apt upgrade --yes 
RUN apt install python3 --yes 

COPY . .

CMD ["python3", "app.py"]
