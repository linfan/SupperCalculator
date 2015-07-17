FROM index.alauda.cn/tutum/centos:centos7

RUN mkdir /root/.ssh; \
        touch /root/.ssh/known_hosts
RUN yum install --assumeyes python-simplejson \
        tar \
        java-1.7.0-openjdk \
        net-tools
