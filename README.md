## Build App

    ./mvnw clean package -Dmaven.test.skip=true

## Run H2 Database

    java -jar ~/.m2/repository/com/h2database/h2/1.4.190/h2-1.4.190.jar -tcp

## Run GitBucket

    java -Ddb.url="jdbc:h2:tcp://localhost//tmp/testdb" -jar gitbucket.war

## Run Authorization Server

    java -jar target/gitbucketoauth-server-0.0.1-SNAPSHOT.jar

## Issue Access Token

    curl foo:bar@localhost:9999/oauth/token -d grant_type=password -d username=root -d password=root -d scope=read

## (Optional) Re-generate Sources

    rm -rf src/generated
    mvn clean generate-sources -Pgenerate