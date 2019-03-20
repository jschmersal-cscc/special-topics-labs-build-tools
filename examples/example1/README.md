### Building with maven

This is a basic example of using maven as a build tool.  You can see the [pom.xml](pom.xml) has very little to it.  Read through the comments to see what's going on.

## Running the example
To run the example beginning to end, run `mvn install` in a terminal in this directory.  Note that `mvn clean` will clean any artifacts produced by the build.

Run the following phases and note from the build output the differences between them (it may help to run `mvn clean` between invocations):
1. `mvn compile`
2. `mvn test`
3. `mvn package`
4. `mvn install`
