FROM openjdk
COPY . /app
WORKDIR /app/
RUN javac Sum.java
CMD [ "java","Sum" ]