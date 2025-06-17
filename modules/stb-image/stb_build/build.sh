#!/usr/bin/env bash

VK_MEM_ALLOC_H_URI=https://raw.githubusercontent.com/nothings/stb/refs/heads/master/stb_image.h

# if the file does not exist
if [ ! -f stb_image.h ]; then
  # if wget is installed on this system
  if command -v wget &> /dev/null; then
    echo Downloading VMA header file
    wget $VK_MEM_ALLOC_H_URI
  elif command -v curl &> /dev/null; then
    echo Downloading VMA header file
    curl -o stb_image.h $VK_MEM_ALLOC_H_URI
  else
    echo Error: could not find stb_image.h and cannot download it automatically
    exit 1
  fi

  # if last command failed, exit
  if [ $? -ne 0 ]; then
    echo Error: error downloading stb_image.h
    exit 1
  fi
fi

# if the file still does not exist (even if the download command succeeded)
if [ ! -f stb_image.h ]; then
  echo Error: could not find stb_image.h, consider downloading it manually
  exit 1
fi

# if CXX is not set, default to g++
if [ -z "$CXX" ]; then
  CXX=g++
fi

$CXX -std=c++17 -O2 -fno-rtti -fno-exceptions -fPIC -I. -c -o stb_image.o stb_image.cc

# If the last command failed, exit
if [ $? -ne 0 ]; then
  exit 1
fi

# Generate shared library file according to the platform, using a environment variable WIN32
if [ -n "$WIN32" ]; then
  $CXX -shared -fPIC -static-libgcc -static-libstdc++ -o stb_image.dll stb_image.o
else
  $CXX -shared -fPIC -o libstb_image.so stb_image.o
fi
