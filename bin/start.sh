#!/usr/bin/env bash

if [ -L ${BASH_SOURCE-$0} ]; then
  FWDIR=$(dirname $(readlink "${BASH_SOURCE-$0}"))
else
  FWDIR=$(dirname "${BASH_SOURCE-$0}")
fi

APP_HOME="$(cd "${FWDIR}/.."; pwd)"
CONFIG_PATH=$APP_HOME/conf/application.properties

if [[ -n "${JAVA_HOME}" ]]; then
  RUNNER="${JAVA_HOME}/bin/java"
else
  RUNNER=java
fi

if [[ -e "$CONFIG_PATH" ]]; then
  JAVA_OPTS+=" -Dspring.config.location=${CONFIG_PATH} "
fi

if [[ ! -e "${APP_HOME}/logs" ]]; then
  mkdir -p "${APP_HOME}/logs"
fi

JAVA_OPTS+=" -Dapp.log.dir=${APP_HOME}/logs "

nohup $RUNNER $JAVA_OPTS -jar $APP_HOME/lib/spring-boot-with-scala-1.0.jar > /dev/null &

PID_PATH=$APP_HOME/app.pid
echo $! > $PID_PATH
