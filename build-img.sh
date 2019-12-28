#!/bin/bash
mvn package
docker build -f centos7-openjdk8.Dockerfile -t openjdk8:v1 .
docker build -t echo-service:0.0.1 .
