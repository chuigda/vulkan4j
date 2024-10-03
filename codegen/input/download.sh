#!/usr/bin/env bash

# Note: we're restricting to GLFW 3.4. Update this when GLFW releases a new version.
echo Downloading GLFW header files
wget https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3.h
wget https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3native.h

echo Downloading Vulkan vk.xml
wget https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/main/xml/vk.xml
