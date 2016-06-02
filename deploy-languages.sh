#!/bin/bash
#
# Autor:
#     Jeanderson Candido <http://jeadersonbc.github.io>
#
BASEDIR="`pwd`"
LANGURL="https://github.com/marcel-reboucas/PLP.git"
LANGDIR="$BASEDIR/linguagens-plp"
echo "Fazendo download das linguagens em diretorio temporario \"$LANGDIR\"..."
[[ ! -d "$LANGDIR" ]] && git clone $LANGURL $LANGDIR &>/dev/null

echo "Instalando linguagens no repositorio local"
for subdir in `ls $LANGDIR`; do
    if [ -f "$LANGDIR/$subdir/pom.xml" ]; then
        cd "$LANGDIR/$subdir"
        echo "Encontrado arquivo \"pom.xml\" em \"$LANGDIR/$subdir\"."
        echo "Instalando componentes..."
        mvn install &>/dev/null
    fi
done
echo "Removendo diretorio temporario..."
rm -rf "$LANGDIR" && cd "$BASEDIR"
echo "Fim"
