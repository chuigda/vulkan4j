#!/usr/bin/env bash

STB_URL_PREFIX="https://raw.githubusercontent.com/nothings/stb/f58f558c120e9b32c217290b80bad1a0729fbb2c/"

COMPONENTS=("image" "truetype" "image_resize2")

mkdir -p stb
mkdir -p stb_formatted
for component in "${COMPONENTS[@]}"; do
  curl -o "stb/stb_${component}.h" "${STB_URL_PREFIX}stb_${component}.h";
  cat "stb/stb_${component}.h" | clang-format --style=file:.clang-format > "stb_formatted/stb_${component}.h";
done
