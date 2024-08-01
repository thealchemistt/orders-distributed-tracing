Download zipkin jar from this link - https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.12.9/ 
Execute command java -jar zipkin-server-2.12.9-exec.jar this will bring up the zipkin server.
Open http://localhost:9411/zipkin in your browser it should make you see zipkin dashboard.
Mention this same base url in your application.properties.
Run the project with ./gradlew bootRun or bootRun task
Hit the GET API of orders using this curl - curl --location --request GET 'http://localhost:8080/order/7817'
Go back to zipkin dashboard and check individual or "all" registered services traces.
