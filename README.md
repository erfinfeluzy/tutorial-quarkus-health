# tutorial-quarkus-health project

This project uses Quarkus, the Supersonic Subatomic Java Framework.

If you want to learn more about Quarkus, please visit its website: https://quarkus.io/ .

## Clone or Generate new quarkus project

Generate new project
```bash
$ mvn io.quarkus:quarkus-maven-plugin:1.5.2.Final:create \
-DprojectGroupId=com.erfinfeluzy \
-DprojectArtifactId=tutorial-quarkus-health \
-Dextensions="health,resteasy-jackson"
```
> Note: health extension will automatically generate health check for readiness probe (/health/ready) and liveness probe (/health/live), 
> resteasy-jackson extension is used for creating json rest services.

Or clone for my github:
```
git clone https://github.com/erfinfeluzy/tutorial-quarkus-health.git
```

## Running the application in dev mode

You can run your application in dev mode that enables live coding using:
```
./mvnw quarkus:dev
```

## Packaging and running the application

The application can be packaged using `./mvnw package`.
It produces the `tutorial-quarkus-health-1.0-SNAPSHOT-runner.jar` file in the `/target` directory.
Be aware that it’s not an _über-jar_ as the dependencies are copied into the `target/lib` directory.

The application is now runnable using `java -jar target/tutorial-quarkus-health-1.0-SNAPSHOT-runner.jar`.

## Creating a native executable

You can create a native executable using: `./mvnw package -Pnative`.

Or, if you don't have GraalVM installed, you can run the native executable build in a container using: `./mvnw package -Pnative -Dquarkus.native.container-build=true`.

You can then execute your native executable with: `./target/tutorial-quarkus-health-1.0-SNAPSHOT-runner`

If you want to learn more about building native executables, please consult https://quarkus.io/guides/building-native-image.# tutorial-quarkus-health
