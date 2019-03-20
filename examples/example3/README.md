### Building executable "uber" jars with maven

This is an example of running integration tests in a maven build.  Integration tests usually need the packaged code to run.  Thus there is a separate maven lifecycle phase after the package phase, called "integration-test", specifically for running such tests.  Maven also has a separate plugin, the [maven failsafe plugin](https://maven.apache.org/surefire/maven-failsafe-plugin/) for running these integration tests.

Read through the [pom.xml](pom.xml).  Notice how the [exec-maven-plugin](https://www.mojohaus.org/exec-maven-plugin/) can be used to start and stop a server that the integration tests rely on.  Also note the configuration of the failsafe plugin.

## Running the example
To run the example beginning to end, run `mvn install` in a terminal in this directory.  Note that `mvn clean` will clean any artifacts produced by the build.

_Note_: while IntelliJ generally has great maven intuition, it's not perfect.  In particular, if you by default just try to run the integration test in Intellij it will fail because the httpd server is not running.  If you want to investigate further, you can see IntelliJ's documentation on [creating a run confugration for tests](https://www.jetbrains.com/help/idea/creating-run-debug-configuration-for-tests.html).
