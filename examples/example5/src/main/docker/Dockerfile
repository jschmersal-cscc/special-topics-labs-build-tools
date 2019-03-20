# We need to build upon a base image that has java, thus openjdk
FROM openjdk:8u181

# The docker-maven-plugin puts your artifact in maven/ when you configure it with <appendAssemblyId>false</appendAssemblyId>.
# This line puts it in /opt/ in the image we're building
ADD maven/example5-1.0-SNAPSHOT.jar /opt/

# To run the "HelloWorld" class, we need its jar to be on the classpath and to specify the class with a "main" method to run.
# When the docker is run, execute /user/bin/java -cp /opt/example5-1.0-SNAPSHOT.jar edu.cscc.topics.HelloWorld
CMD ["java", "-cp", "/opt/example5-1.0-SNAPSHOT.jar", "edu.cscc.topics.HelloWorld"]
