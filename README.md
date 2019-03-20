# Special Topics Build Tools Lab

## Objective

For this lab, you will learn about Maven, by using Maven to build, run, and test a simple application.  The project itself is pretty simple, but has been constructed to demonstrate some common use cases where build tools can help you accomplish your goal.  The code maps strings from "Upper Underscore" case to "Lower Camel" case, leveraging the [Guava CaseFormat](https://github.com/google/guava/wiki/StringsExplained#caseformat) library.  The final artifact is a docker image that can be run and accepts an input string, converts it, and spits the output to `stdout`.

Please read through the [examples](examples) before getting started, and review the comments throughout.

_NOTE:_ For this lab you will want to perform your builds only using a command line terminal.  The integration tests for this project are fairly complex, and require that the docker image be built (which happens as part of the `package` phase, when building with Maven) for them to run successfully.  

## Getting Started:

1. Copy the starter code from here into a new, private repository in your personal GitHub account using [these instructions](https://github.com/jschmersal-cscc/lab0-completing-and-submitting-assignments) substituting this repository URL ``https://github.com/jschmersal-cscc/special-topics-labs-build-tools`` for the one referenced in that document.  When adding a collaborator, be sure to add me ("jschmersal-cscc").
2. Create a new branch for your code changes as described in [these instructions](https://github.com/jschmersal-cscc/lab0-completing-and-submitting-assignments#important-before-you-start-coding)


## Completing the Assignment

1. The goal of this assignment is to build and test the code using maven.
    1. You _should_ be able to complete this assignment without having to change anything beside the [build script](pom.xml) and the [Dockerfile](src/main/docker/Dockerfile).  When you are finished, you should be able to run `mvn clean instal` and have your code compiled, unit tests executed, the docker image built, and your integration tests run successfully.
    1. You _must not_ remove or change any of the tests in the [src/test](src/test) directory.  If you want to add extra tests, by all means do so.  Remember though that the point of this lab isn't to fix or modify the software, but rather to migrate from one build system to another. 
1. I recommend proceeding through this lab in steps:
    1. Your first step should be to get `maven compile` to succeed.  To do this you'll need to work on the `<dependencies>` section of the [pom.xml](pom.xml).
    1. Your next step should be to get `maven test` to succeed.  To do this you'll need to work on the `<dependencies>` section of the [pom.xml](pom.xml).
    1. Your next step should be augment your [pom.xml](pom.xml) to get your jar built as an "uber" jar that is executable using `java -jar`.  You can easily test if this is working by running `java -jar <your-maven-built-jar>.jar DOES_THIS_WORK` from the command line (expected output would be "doesThisWork").  The jar should be produced as part of the `mvn package` command.  Check the `target/` directory.
    1. Next up is to get the docker image built. For this step you will change both the [pom.xml](pom.xml) and your [Dockerfile](src/main/docker/Dockerfile).  Refer to the examples using the `docker-maven-plugin`.  Be sure to name your artifact as `edu.cscc.topics.tools/constant-to-camel`.  This step also should be found after `mvn package`.  If you run `docker images` you can see your newly produced image.  You can try to run it using `docker run --rm edu.cscc.topics.tools/constant-to-camel:1.0-SNAPSHOT DOES_IT_WORK`
    1. Finally, change your [pom.xml](pom.xml) to run the integration tests with the `maven-failsafe-plugin`.  When the integration tests pass, you're done! 


## Hints
1. If you want to test things, run your image with `docker run <your-image-name>:<your-image-tag>`.  The default output you should see is `thisIsATestConstantName`.
 

## Submitting Your Work

1. Create a pull request for your branch using [these instructions](https://github.com/jschmersal-cscc/lab0-completing-and-submitting-assignments#push-your-changes-and-create-a-pull-request-for-grading)
1. Submit the assignment in Blackboard as described in [these instructions](https://github.com/jschmersal-cscc/lab0-completing-and-submitting-assignments#once-your-pull-request-is-reviewed-and-approved)

__NOTE: I will provide feedback via. comments in your pull request.__
If you need to amend your work after you issue your initial pull request:

1. Commit your updates
1. Push your changes to gitHub
1. Verify the new commits were automatically added to your open pull request


## Footnotes
### mvn test output
```
[INFO] --- maven-surefire-plugin:2.10:test (default-test) @ constant-to-camel ---
[INFO] Surefire report directory: /home/jts25/repos/special-topics-build-tools/target/surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running edu.cscc.topics.tools.build.ConstantToCamelTest
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.074 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0
 ```
