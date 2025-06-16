#!/usr/bin/env bash

# Note: we're restricting to GLFW 3.4. Update this when GLFW releases a new version.
echo Downloading GLFW header files
curl -o glfw3.h https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3.h
curl -o glfw3native.h https://raw.githubusercontent.com/glfw/glfw/refs/tags/3.4/include/GLFW/glfw3native.h

echo Downloading Vulkan vk.xml
curl -o vk.xml https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/refs/tags/v1.4.313/xml/vk.xml
curl -o video.xml https://raw.githubusercontent.com/KhronosGroup/Vulkan-Docs/refs/tags/v1.4.313/xml/video.xml

echo Downloading OpenGL gl.xml
curl -o gl.xml https://raw.githubusercontent.com/KhronosGroup/OpenGL-Registry/main/xml/gl.xml

# Note: we're restricting to VMA 3.2. Update this when VMA releases a new version.
echo Downloading VMA header file
curl -o vk_mem_alloc.h https://raw.githubusercontent.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/refs/tags/v3.2.0/include/vk_mem_alloc.h

# Note: we're restricting to OpenAL 1.24.3 Update this when VMA releases a new version.
echo Downloading OpenAL header file
curl -o al.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/al.h
curl -o alc.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/alc.h
curl -o alext.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/alext.h
curl -o efx.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/efx.h
curl -o efx-presets.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/efx-presets.h
# efx-creative.h are empty
#curl -o efx-creative.h https://raw.githubusercontent.com/kcat/openal-soft/refs/tags/1.24.3/include/AL/efx-creative.h

echo Downloading SDL
curl -o SDL3.tar.gz https://github.com/libsdl-org/SDL/releases/download/release-3.2.14/SDL3-3.2.14.tar.gz
tar -xzf SDL3-3.2.14.tar.gzithubusercontent.com/google/shaderc/refs/heads/main/libshaderc/include/shaderc/shaderc.h
