#!/bin/sh

# Parameter check
if [ $# -lt 2 ]; then
  echo "[USAGE]"
  echo '  - $1: BUILD_NO: (e.g. 20151010091234-xxxxxxxxxxxxx.....)'
  echo '  - $2: '"HOSTNAME to deploy: (e.g.  'octo', 'aqua001', etc... )"
  exit 1
fi
BUILD_NO=$1
HOST=$2

echo "=== Deploy start. ==="
PLACE=`dirname $0`
FULLPATH=`(cd $PLACE; pwd)`
HERE=${FULLPATH}
cd ${HERE}
. ${HERE}/.env.sh
cd ${PROJECT_HOME}/target
RELEASE_HOME=${P30A_HOME}/release

if [ "$HOST" = "localhost" ]; then
  mkdir -p ${RELEASE_HOME}
else
  ssh ${HOST} "mkdir -p ${RELEASE_HOME}"
fi

if [ $? -ne 0 ]; then
  echo "=== Deploy failed. ==="
  exit 1
fi

if [ "$HOST" = "localhost" ]; then
  cp -r ${BUILD_NO} ${P30A_HOME}/release/.
else
  scp -r ${BUILD_NO} ${HOST}:${P30A_HOME}/release/.
fi

if [ $? -ne 0 ]; then
  echo "=== Deploy failed. ==="
  exit 1
fi

if [ "$HOST" = "localhost" ]; then
  cd ${RELEASE_HOME}; rm -f head; ln -s ${BUILD_NO} head; cd head; unzip -oq *.zip && rm -f *.zip
else
  ssh ${HOST} "cd ${RELEASE_HOME}; rm -f head; ln -s ${BUILD_NO} head; cd head; unzip -oq *.zip && rm -f *.zip"
fi

if [ $? -ne 0 ]; then
  echo "=== Deploy failed. ==="
  exit 1
fi
echo "..."
echo "Deployed: ${HOST}:${P30A_HOME}/release/head"
echo "=== Deploy successfully done. ==="
exit 0


