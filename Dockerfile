FROM openjdk:17-jdk-alpine

WORKDIR /app

# copy source code
COPY ./src /app/

# compile source code
RUN javac Main.java

CMD ["top", "-b"]