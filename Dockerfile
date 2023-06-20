FROM tomcat

COPY target/Docker_SpringBoot.war /usr/tomcat/webapps/

WORKDIR /usr/tomcat/webapps/

ENTRYPOINT [ "java","-jar","Docker_SpringBoot.war" ]