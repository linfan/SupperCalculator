#!/bin/bash

CMD=${1}
BEGIN=${2}
END=${3}

if [[ "${CMD}" = "" || "${BEGIN}" = "" || "${END}" = "" ]]; then
    echo "Usage: ${0} <rm|run|addr> <firstNo> <lastNo>"
    exit -1
fi

SEQ=$(seq -f %02g ${BEGIN} ${END})

if [ "${CMD}" = "rm" ]; then
    for NUM in ${SEQ}; do
        alauda service rm ${NUM}
    done
elif [ "${CMD}" = "run" ]; then
    for NUM in ${SEQ}; do
        alauda service run --instance-size=XS --publish=22/tcp --publish=8080/http --env=ROOT_PASS=rootme \
            ${NUM} index.alauda.cn/fanlin/ci-workshop-base:latest
    done
elif [ "${CMD}" = "addr" ]; then
    for NUM in ${SEQ}; do
        IP=$(alauda service inspect ${NUM} | grep 'ipaddress' | head -1 |  grep -o '[0-9.]\+')
        PORT=$(alauda service inspect ${NUM} | grep 'service_port' | grep -v ': 80,' | grep -o '[0-9]\+')
        echo ${NUM}: ${IP} ${PORT}
    done
fi
