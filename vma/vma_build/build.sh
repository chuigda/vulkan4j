#!/usr/bin/env bash

VK_MEM_ALLOC_H_URI=https://raw.githubusercontent.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/refs/tags/v3.2.0/include/vk_mem_alloc.h

# if the file does not exist
if [ ! -f vk_mem_alloc.h ]; then
  # if wget is installed on this system
  if command -v wget &> /dev/null; then
    echo Downloading VMA header file
    wget $VK_MEM_ALLOC_H_URI
  elif command -v curl &> /dev/null; then
    echo Downloading VMA header file
    curl -o vk_mem_alloc.h $VK_MEM_ALLOC_H_URI
  else
    echo Error: could not find vk_mem_alloc.h and cannot download it automatically
    exit 1
  fi

  # if last command failed, exit
  if [ $? -ne 0 ]; then
    echo Error: error downloading vk_mem_alloc.h
    exit 1
  fi
fi

# if the file still does not exist (even if the download command succeeded)
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
  # if this is on Windows platform, this is likely to be incorrect and give warning
  if [ -n "$WIN32" ]; then
    echo Warning: VULKAN_SDK_DIR is not set or does not exist
  fi
  $CXX -std=c++17 -O2 -fno-rtti -fno-exceptions -fPIC -I. -c -o vma.o vma_usage.cc
else
  $CXX -std=c++17 -O2 -fno-rtti -fno-exceptions -fPIC "-I${VULKAN_SDK_DIR}/Include" -I. -c -o vma.o vma_usage.cc
fi

# If the last command failed, exit
if [ $? -ne 0 ]; then
  exit 1
fi

# Generate shared library file according to the platform, using a environment variable WIN32
if [ -n "$WIN32" ]; then
  $CXX -shared -fPIC -static-libgcc -static-libstdc++ -o vma.dll vma.o
else
  $CXX -shared -fPIC -o libvma.so vma.o
fi
