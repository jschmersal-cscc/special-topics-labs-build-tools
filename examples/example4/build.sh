
# This is  super simple invocation of docker build.  It only uses the -t parameter to give our image
# a name.  There is a complete reference of docker build at 
# https://docs.docker.com/engine/reference/commandline/build/


# Even this simple example has one important concept, however.  Note the '.' at the end of the line.  That
# tells docker what files to send to the docker daemon as "build context" so the Dockerfile can reference them.
# In this case it is specifying '.', which is shorthand for the current directory.  Since index.html is a file in
# the current directory, the Dockerfile can specify 'ADD index.html /usr/local/apache/htdocs' and that file will be
# found by the docker daemon from its build context and added into that location in the image that is being built.
docker build -t edu.cscc.topics/httpd:1.0 .
