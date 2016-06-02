#!/bin/bash
#
# Script de deploy de UI no servidor
#
# Autor:
#     Jeanderson Candido <http://jeadersonbc.github.io>
#
BASEDIR="`pwd`"
SERVER_HOME="$BASEDIR/br.ufpe.cin.plp.web.server"
SERVER_UI_HOME="$SERVER_HOME/src/main/webapp"
UI_HOME="$BASEDIR/br.ufpe.cin.plp.web.ui"
BUILD_DIR="dist"

check_ui_dependencies() {
    required=("npm" "gulp" "bower")
    for cmd in ${required[@]}; do
        location="`which $cmd`"
        if [ -z "$location" ]; then
            missing_commands="- $cmd\n$missing_commands"
        fi
    done
    if [ ! -z "$missing_commands" ]; then
        echo "Nao eh possivel prosseguir sem as seguintes dependencias:"
        echo -e $missing_commands
        echo "Execucao abortada."
        exit 1
    fi
}

echo "Checando dependencias de UI..."
check_ui_dependencies

echo "Compilando UI"
cd $UI_HOME
rm -rf "$BUILD_DIR"
npm install &>/dev/null
bower install &>/dev/null
gulp

echo "Copiando arquivos para o servidor..."
rm -rf "$SERVER_UI_HOME" && mkdir -p "$SERVER_UI_HOME"
mv "$BUILD_DIR"/* "$SERVER_UI_HOME"
echo "Fim." && cd "$BASEDIR"
