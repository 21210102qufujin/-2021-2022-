FROM openjdk:14
COPY . /myapp/
WORKDIR /myapp/
RUN javac -cp src/antlr-4.9.2-complete.jar:src/ src/lab7_1.java -d dst/
