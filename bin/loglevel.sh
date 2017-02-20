#!/bin/bash

if [ -n "$1" ]; then 
  PACKAGE=$1
fi

URL="http://localhost:8080/loggers/$PACKAGE"

if [ -n "$2" ]; then
  LEVEL=$2
  curl -H "Content-Type: application/json"  --data "{\"configuredLevel\": \"$LEVEL\"}" --request POST $URL
else
  curl $URL
fi
