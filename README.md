# Jersey Rest API

Created by David Holte.

Configuration:

1. Download source code
2. cd rest-service
3. mvn install
4. mvn exec:java

Test it! run: curl http://localhost:8080/myapp/myresource
You should receive: "Got it!"

5. docker build --tag=myapp .
6. docker run -p 18080:8080 -t -i myapp

Test it again! run: curl http://localhost:8080/myapp/myresource
You should receive: "Got it!"
