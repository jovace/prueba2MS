# Each instruction in this file generates a new layer that gets pushed to your local image cache
#
 
#
# Lines preceeded by # are regarded as comments and ignored
#
 
#
# The line below states we will base our new image on the Latest Official Ubuntu 
FROM ubuntu
 
#
# Identify the maintainer of an image
LABEL maintainer="rmjuw21@gmail.com"
 
#
# Update the image to the latest packages
RUN apt-get update -y && apt-get upgrade -y
 
#
# Install MAVEN to test.
RUN apt-get install maven -y
RUN apt-get install git-core -y

RUN mkdir pruebaMS2 && cd pruebaMS2

RUN git clone -b master https://github.com/jovace/prueba2MS.git
WORKDIR /prueba2MS/notes_service
RUN rm -rf rm -rf ~.m2/repository
RUN mvn install

#
# Expose port 5000
EXPOSE 5001

CMD ["java","-jar","./target/NotesService-1.0-SNAPSHOT-spring-boot.jar","&"]