#!/usr/bin/env bash

# Note: we're restricting to GLFW 3.4. Update this when GLFW releases a new version.
echo Downloading GLFW header files
wget https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3.h
wget https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3native.h

echo Downloading Vulkan vk.xml
wget https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/main/xml/vk.xml

echo Downloading OpenGL gl.xml
wget https://raw.githubusercontent.com/KhronosGroup/OpenGL-Registry/main/xml/gl.xml

# Note: we're restricting to VMA 3.1. Update this when VMA releases a new version.
echo Downloading VMA header file
wget https://raw.githubusercontent.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/refs/tags/v3.1.0/include/vk_mem_alloc.h
