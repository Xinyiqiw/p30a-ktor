#!/bin/sh

echo "=== Build start. ==="
PLACE=`dirname $0`
FULLPATH=`(cd $PLACE; pwd)`
HERE=${FULLPATH}
cd ${HERE}
. ${HERE}/.env.sh

cd ${PROJECT_HOME}
#gradle wrapper
#./gradlew installDist --scan
./gradlew installDist
#sbt dist
if [ $? -ne 0 ]; then
  echo "=== Build failed. ==="
  exit 1
else
  echo "=== Build successfully done.  ==="
fi
#cd target
cd build/install
DATE=`date +%Y%m%d%H%M%S-`
COMMIT=`git log --format="%H" -n 1`
BUILD_NO=${DATE}${COMMIT}
#echo $BUILD_NO
#mkdir -p ${BUILD_NO}
zip ${BUILD_NO}.zip com.dignicate.p30a-ktor/
#mv -f universal/${DEFIRE_NAME}-*.zip ${BUILD_NO}/.
if [ $? -ne 0 ]; then
  echo "=== Build aborted. ==="
  exit 1
fi
echo ${BUILD_NO} > ${HERE}/.build_no
cat ${HERE}/.build_no
exit 0