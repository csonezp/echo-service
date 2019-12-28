FROM centos:centos7
MAINTAINER "Zhang Peng <csonezp@gmail.com>"
LABEL description="Base Image Java 8"

RUN yum -y install java-1.8.0-openjdk && mkdir /app
