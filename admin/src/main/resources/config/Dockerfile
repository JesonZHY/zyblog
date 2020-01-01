#
# MAINTAINER        Nosix,nosix <six.heyaxiang@gmail.com>
# DOCKER-VERSION    19.03.5
#
# Dockerizing Tomcat7.0.99: Dockerfile for building Tomcat images
#
FROM       tomcat:7.0.99
MAINTAINER Nosix,nosix <zhuyong1992@aliyun.com>

ENV TZ "Asia/Shanghai"
ENV TERM xterm

#pinyougou-service配置
ADD admin.war /usr/local/tomcat/webapps

EXPOSE 8080 22

CMD ["/usr/local/tomcat/bin/catalina.sh", "run"]
