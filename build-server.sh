#!/bin/bash
#
# Script de empacotamento do servidor
#
# Autor:
#     Jeanderson Candido <http://jeadersonbc.github.io>
#
BASEDIR="`pwd`"
SERVER_HOME="$BASEDIR/br.ufpe.cin.plp.web.server"
cd "$SERVER_HOME" && mvn clean package
