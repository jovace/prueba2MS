# Each instruction in this file generates a new layer that gets pushed to your local image cache
#
 
#
# Lines preceeded by # are regarded as comments and ignored
#
 
#
# The line below states we will base our new image on the Latest Official Ubuntu 
FROM ubuntu:latest
 
#
# Identify the maintainer of an image
LABEL maintainer="rmjuw21@gmail.com"
 
#
# Update the image to the latest packages
RUN apt-get update && apt-get upgrade -y
 
#
# Install MAVEN to test.
RUN apt-get install maven -y
RUN apt-get install git-core -y

RUN mkdir IdS && cd IdS

RUN git clone -b master-aux https://github.com/companyapproach19/companyApproach19-2.git
WORKDIR /companyApproach19-2
RUN mvn install

#
# Expose port 5000
EXPOSE 5000

CMD ["java","-jar","./target/java-getting-started-1.0.jar","&"]


 

