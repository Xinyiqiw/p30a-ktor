#!/bin/sh

function usage() {
  echo "[USAGE]"
  echo '  - $1: Project name'
  echo '  - $2: [bitbucket|github]'
  echo
  exit 1
}

function fetch() {
  cd ${PJ_HOME}
  echo "`date` fetch from ${PJ_NAME}"
  git fetch --all --prune
  if [ $? -ne 0 ]; then
    exit 1
  fi
}

function clone() {
  cd ${HOME}
  echo "${PJ_HOME} does not exist."
  echo "`date` clone from ${URL}"
  git clone ${URL}
  if [ $? -ne 0 ]; then
    exit 1
  fi
}


if [ $# -lt 2 ]; then
  usage
fi
PJ_NAME=$1

case "$2" in
"bitbucket")
  URL="git@bitbucket.org:dignicatedev/${PJ_NAME}.git"
  ;;
"github")
  URL="git@github.com:dignicate/${PJ_NAME}.git"
  ;;
*) echo "[ERROR]: Repository must be either 'github' or 'bitbucket'"
  exit 1
esac

if [ -z "${HOME}" ]; then
  echo "[ERROR]"
  echo "  - Environment variable 'HOME' must be defined."
  echo
  exit 1
fi
PJ_HOME=${HOME}/${PJ_NAME}


echo "=== Begin ==="
if [ ! -d "${PJ_HOME}" ]; then
  clone
fi
fetch
echo "===  End  ==="


