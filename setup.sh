#!/bin/bash
LANGUAGES_HOME="`pwd`/linguagens"

function create_gen_dirs() {
    local path=$1
    local directories=(${!2})
    for dir in ${directories[@]}; do
        if [ ! -d "$path/$dir" ]; then
            echo "Created dir \"$dir\" at \"$path\""
            mkdir "$path/$dir"
        else
            echo "Directory \"$dir\" already exist"
        fi
    done
}

for lang in `ls $LANGUAGES_HOME`; do
    proj_prefix=${lang%.parent}
    project_root="$LANGUAGES_HOME/$lang"

    to_create=("xtend-gen" "src-gen")
    create_gen_dirs "$project_root/$proj_prefix" to_create[@]

    suffixes=("ide" "ui.tests" "ui")
    for suffix in ${suffixes[@]}; do
        to_create=("xtend-gen" "src-gen" "src")
        create_gen_dirs "$project_root/$proj_prefix.$suffix" to_create[@]
    done
done
