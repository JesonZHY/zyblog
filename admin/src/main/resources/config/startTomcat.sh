#!/bin/bash

export JAVA_HOME=/usr/local/java
export PATH=$JAVA_HOME/bin:$PATH
cd /usr/local/tomcat/webapps
rm -rf ./*
cd /home/admin
chmod 777 ./*
cp admin.war /usr/local/tomcat/webapps/
cd /usr/local/tomcat/bin/
./startup.sh
