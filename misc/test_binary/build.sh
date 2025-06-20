#!/usr/bin/env bash

rm -r *.o
rm -r *.so

for file in $(ls *.c); do
  cc -c -g "$file" -o "${file%.c}.o" -fPIC
  cc "${file%.c}.o" -shared -o "lib${file%.c}.so"
done

