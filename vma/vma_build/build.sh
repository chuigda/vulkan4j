#!/usr/bin/env bash

# if the file does not exist
  if [ ! -f vk_mem_alloc.h ]; then
  # if wget is installed on this system
  if command -v wget &> /dev/null; then
    echo Downloading VMA header file
    wget https://raw.githubusercontent.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/refs/tags/v3.1.0/include/vk_mem_alloc.h
  fi
fi

# if the file still does not exist
if [ ! -f vk_mem_alloc.h ]; then
  echo Error: could not find vk_mem_alloc.h, consider downloading it manually
  exit 1
fi

# if CXX is not set, default to g++
if [ -z "$CXX" ]; then
  CXX=g++
fi

# if VULKAN_SDK_DIR is not set, or the directory does not exist, give a warn
if [ -z "$VULKAN_SDK_DIR" ] || [ ! -d "$VULKAN_SDK_DIR" ]; then
  echo Warning: VULKAN_SDK_DIR is not set or does not exist
fi

# Build without RTTI and exceptions, with optimization
$CXX -std=c++14 -O2 -fno-rtti -fno-exceptions "-I${VULKAN_SDK_DIR}" -I. -c -o vma.o vma_usage.cc

# Generate shared library file according to the platform, using a environment variable WIN32
if [ -n "$WIN32" ]; then
  $CXX -shared -fPIC -o vma.dll vma.o
else
  $CXX -shared -fPIC -o libvma.so vma.o
fi
