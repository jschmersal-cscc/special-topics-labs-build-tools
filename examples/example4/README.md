### Building Docker Images
Building docker images can range from very simple to a pretty complex build step.  There are a couple things to
know:
1. You build a docker image as a call to the docker server, in the command line it's the `docker build` command.
1. Docker uses a `Dockerfile` to describe the process for building an image.
1. The Dockerfile specifies a `FROM` line which is the base docker image that this image should be created from.
1. Docker supports various commands you can [specify in the Dockerfile](https://docs.docker.com/engine/reference/builder/) to assemble your image, and tell it what to run when a container is started.

## Example
In this simple example, no build tool is used.  There is simply a basic [build.sh](build.sh) shell script that
takes care of running the docker build, and a [Dockerfile](Dockerfile) that contains the instructions to create the
image.

To run this example, simply type `./build.sh` in a terminal in this directory.  In the end you will have an 
`edu.cscc.topics/httpd:1.0` image that you can run by typing 
`docker run -dit --rm --name topics-httpd -p 8080:80 edu.cscc.topics/httpd:1.0`.  Once it is running, navigate 
to [http://localhost:8080/](http://localhost:8080) and you will see the custom web page we created. Read through 
the [Dockerfile](Dockerfile) and the [build.sh](build.sh) to get an idea of how simple docker image builds work.
The next example will show you building a docker image using a maven docker plugin. 
