
## Run GitBucket

    java -Ddb.url="jdbc:h2:tcp://localhost//tmp/testdb" -jar gitbucket.war

## Generate Sources

    rm -rf src/generated
    mvn clean generate-sources -Pgenerate
    
## Issue Access Token

    curl foo:bar@localhost:9999/oauth/token -d grant_type=password -d username=root -d password=root -d scope=read