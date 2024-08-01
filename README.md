# Zipkin Setup Guide

## Download and Run Zipkin

1. **Download Zipkin JAR**: Download the Zipkin server JAR file from the following link:
   [Zipkin Server 2.12.9](https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.12.9/zipkin-server-2.12.9-exec.jar)

2. **Execute Zipkin Server**: Run the following command to start the Zipkin server:
   ```sh
   java -jar zipkin-server-2.12.9-exec.jar

Open http://localhost:9411/zipkin in your browser it should make you see zipkin dashboard.
Mention this same base url in your application.properties.
Run the project with ./gradlew bootRun or bootRun task
Hit the GET API of orders using this curl - curl --location --request GET 'http://localhost:8080/order/7817'
Go back to zipkin dashboard and check individual or "all" registered services traces.
