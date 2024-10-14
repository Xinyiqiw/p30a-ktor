#!/bin/sh

if [ -z "${P30A_HOME}" ]; then
  P30A_HOME=/home/p30a
fi
if [ -z "${P30A_NAME}" ]; then
  P30A_NAME=p30a-ktor
fi
PROJECT_HOME=${P30A_HOME}/${P30A_NAME}

echo "P30A_HOME: ${P30A_HOME}"
echo "PROJECT_HOME: ${PROJECT_HOME}"


