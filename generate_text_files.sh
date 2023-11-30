#!/usr/bin/env bash

PATH="$1"

if [[ ! -e "$PATH" ]]
then
    printf '%s\n' "No such path"
    exit 1
fi

for i in {01..24}
do
    :> "./${PATH}/Day${i}".txt
done

exit 0
