
### Building Docker Images With Maven

This example has us build a simple "Hello world" docker image using the [fabric8io docker-maven-plugin](https://github.com/fabric8io/docker-maven-plugin), which is  a popular maven plugin for building docker images.  If you follow the link and look through the documentation you will see that the plugin has extensive configuration options and covers pretty much every usecase one could run into related to interacting with docker in a build.

## Example
As you will see, there is [barely any java code](src/main/java/edu/cscc/topics/HelloWorld.java), as that's not the focus.  The simple `HelloWorld` class is packaged in a jar and then a docker image.  The meat of this example lies in the [pom.xml](pom.xml).  In it you can see the inline comments, but the bulk of its configuration is in the docker build section. Additionally, the [Dockerfile](src/main/docker/Dockerfile) is a simple, yet critical, component to the docker image build. 

To run this example, simply type `mvn install` in a terminal in this directory.  In the end you will have an `edu.cscc.topics/hello-world:latest` image that you can run by typing `docker run --rm edu.cscc.topics/hello-world`.  You should see "Hello, world!" printed to your terminal.
