# Again, a simple Dockerfile.  This tells docker to use the 'httpd:2.4' image as its starting point for building
# our image
FROM httpd:2.4

# This specifies that we copy index.html from the build context into /usr/local/apache2/htdocs (which is where
# httpd looks for static files to serve up).
COPY index.html /usr/local/apache2/htdocs/
