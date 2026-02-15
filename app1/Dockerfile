FROM alpine:latest
WORKDIR /app/
RUN apk -U upgrade 
RUN apk add python3
COPY . .
CMD ["python3", "app.py"]

