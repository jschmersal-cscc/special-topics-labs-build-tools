### Building executable "uber" jars with maven

This is an example of creating an executable "all-in-one" or "uber" or "fat" jar.  When you have multiple dependent liraries that need to be included to run your jar, doing so from the command line can be cumbersome.  To make this process simpler, you can create an "uber" jar that contains not only your code, but also that of the libraries that your code depends on.

Additionally, java has a capability of making a jar "executable", and specifying a "Main Class" in some metadata that will tell the JVM which class to look for a `main()` method to invoke.

This example uses the [maven assembly plugin](http://maven.apache.org/plugins/maven-assembly-plugin/) to accomplish those goals.  If you read through the [pom.xml](pom.xml) you can see the configuration of the plugin.  

## Running the example
To run the example beginning to end, run `mvn install` in a terminal in this directory.  Note that `mvn clean` will clean any artifacts produced by the build.

Once the build is finished, run `java -jar target/example2-1.0-SNAPSHOT-jar-with-dependencies.jar` with various values.  What you are seeing is it checking whether each input string is already [base64 encoded](https://en.wikipedia.org/wiki/Base64).

For example, here's the output from running `java -jar target/example2-1.0-SNAPSHOT-jar-with-dependencies.jar hello world`:
```
[jschmersal1@WFIL011 example2]$ java -jar target/example2-1.0-SNAPSHOT-jar-with-dependencies.jar hello world
hello IS base64
world IS base64
```
