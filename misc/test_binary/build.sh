#!/usr/bin/env bash

rm -r *.o
rm -r *.so

for file in $(ls *.c); do
  cc -c -g "$file" -o "${file%.c}.o" -fPIC
  cc "${file%.c}.o" -shared -o "lib${file%.c}.so"
done

echo "Current working directory: $PWD"
ls -l

for file in $(ls *.so); do
  chmod +x "$file"
done
