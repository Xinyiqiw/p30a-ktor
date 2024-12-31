#!/bin/sh

if [ $# -lt 1 ]; then
  echo "[USAGE"
  echo '  - $1: '"HOSTNAME to deploy: (e.g. 'octo', 'aqua001', etc...)"
  exit 1
fi
HOST=$1

PLACE=`dirname $0`
FULLPATH=`(cd $PLACE; pwd)`
HERE=${FULLPATH}
cd ${HERE}

. ${HERE}/.env.sh
cd ${HERE}
bash ./dist_package.sh
RETURN=$?
if [ ${RETURN} -ne 0 ]; then
  exit ${RETURN}
fi

BUILD_NO=`cat ${HERE}/.build_no`
bash ./deploy.sh ${BUILD_NO} ${HOST}
RETURN=$?
if [ ${RETURN} -ne 0 ]; then
  exit ${RETURN}
fi

exit 0
