#!/bin/bash

if [ ! -n "$API_ENDPOINT" ]; then
   echo "you should set env 'API_ENDPOINT'!"
   exit 1
else
    echo api endpoint: $API_ENDPOINT
    # 读取指定环境变量注入到 default.conf.template
    envsubst '${API_ENDPOINT}' < /default.conf.template > /etc/nginx/conf.d/default.conf
fi

exec nginx -g "daemon off;"