#!/bin/bash

cd /home/admin
chmod 777 ./*
cp admin.war /usr/local/tomcat/webapps/
cd /usr/local/tomcat/bin/
./startup.sh
