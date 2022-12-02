#!/bin/sh

docker run \
--name {Docker Container 이름 - 자유 지정} -d \
--restart=unless-stopped \
-p {Docker Host Port - 자유 지정}:{Garafana Container 내부 Port} \
--ip {해당 Container 고정하고 싶은 IP 주소} \
-v {%상위 Directory%}/prometheus.yml:/etc/prometheus/prometheus.yml \
prom/prometheus소