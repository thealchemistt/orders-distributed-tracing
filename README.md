# Zipkin Setup Guide

## Download and Run Zipkin

1. **Download Zipkin JAR**: Download the Zipkin server JAR file from the following link:
   [Zipkin Server 2.12.9](https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.12.9/zipkin-server-2.12.9-exec.jar)

2. **Execute Zipkin Server**: Run the following command to start the Zipkin server:
   ```sh
   java -jar zipkin-server-2.12.9-exec.jar

3. **Access Zipkin Dashboard**: Open http://localhost:9411/zipkin in your browser to see the Zipkin dashboard.

4. **Configure Application:** Mention the same base URL in your application.properties file.

5. **Run the project** with ./gradlew bootRun or bootRun task
6. **Hit the GET API** of orders using this curl - curl --location --request GET 'http://localhost:8080/order/7817'
7. **Go back to zipkin dashboard and check individual or "all" registered services traces.**

![zipkin dashboard with registered apps](https://github.com/user-attachments/assets/df159631-d417-491a-bfca-9dd5fc7cd1c5)
![zipkin trace](https://github.com/user-attachments/assets/767cdc1c-fd2d-4ff9-af83-3927da1024dc)
![zipkin distributed tracing](https://github.com/user-attachments/assets/0f682518-9624-4b89-8727-56a9d8480deb)
