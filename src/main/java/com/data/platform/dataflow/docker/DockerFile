# use the mirror, it will be put in the first place.
FROM centos

# maintainer
MAINTAINER LiuMing

# copy jdk
COPY jdk1.8.0_161 jdk1.7.0_79

#
ADD data-flow-1.0-SNAPSHOT.jar app.jar

ENV JAVA_HOME=/jdk1.7.0_79
ENV PATH=$JAVA_HOME/bin:$PATH
ENV CLASSPATH=.:$JAVA_HOME/lib/dt.jar:$JAVA_HOME/lib/tools.jar

# expose port
EXPOSE 8080

# run app.jar]
ENTRYPOINT ["java","-jar","/app.jar"]