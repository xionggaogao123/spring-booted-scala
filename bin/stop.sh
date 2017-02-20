#!/usr/bin/env bash

if [ -L ${BASH_SOURCE-$0} ]; then
  FWDIR=$(dirname $(readlink "${BASH_SOURCE-$0}"))
else
  FWDIR=$(dirname "${BASH_SOURCE-$0}")
fi

APP_HOME="$(cd "${FWDIR}/.."; pwd)"

PID_PATH=$APP_HOME/app.pid

kill "$(cat $PID_PATH)"

rm $PID_PATH