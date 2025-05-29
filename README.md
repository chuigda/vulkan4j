# vulkan4j

[![CI status](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml)

> [Discord](https://discord.gg/UsmRvrt4gg)

[Vulkan](https://www.vulkan.org/) Binding for Java using [Project Panama](https://openjdk.org/projects/panama/) `java.lang.foreign` APIs.

*Heavily inspired by the [`vulkanalia`](https://github.com/KyleMayes/vulkanalia) crate.*

## [Vulkan tutorial](https://vulkan4j.doki7.club/tutorial/en/)
For users new to Vulkan, there is a (almost) complete adaptation of [https://vulkan-tutorial.com](https://vulkan-tutorial.com) by [Alexander Overvoorde](https://github.com/Overv) to use Java and vulkan4j instead of C++. The published version of this tutorial can be found [here](https://vulkan4j.doki7.club/tutorial/en/), and the sources for the tutorial (including standalone working code examples for each chapter) can be found under the `tutorial` directory.

## Overview
[`ffm-plus`](https://github.com/chuigda/vulkan4j/tree/master/ffm-plus) is a small utility library that gives a thin wrapper over Project Panama `java.lang.foreign` APIs to make them easier and more type-safe to use. It is used by other components to provide a more Java-friendly APIs.

[`vulkan`](https://github.com/chuigda/vulkan4j/tree/master/vulkan) is the binding to Vulkan. Bindings are generated from [`vk.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/vk.xml) (also `video.xml`) using `codegen-v2` module.

[`vma`](https://github.com/chuigda/vulkan4j/tree/master/vma) is the binding to the Vulkan Memory Allocator library. It is generated from [`vk_mem_alloc.h`](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h) using the `codegen-v2` module.

[`glfw`](https://github.com/chuigda/vulkan4j/tree/master/glfw) is the binding to the GLFW library that provides a more Java-friendly API for creating windows and handling input. It is generated from [GLFW header files](https://github.com/glfw/glfw/tree/master/include/GLFW) using the `codegen-v2` module.

[`gles2`](https://github.com/chuigda/vulkan4j/tree/master/gles2) provides OpenGL ES2 bindings. Bindings are generated from [`gl.xml`](https://github.com/KhronosGroup/OpenGL-Registry/blob/main/xml/gl.xml) using the `codegen-v2` module. 

## Roadmap
- [x] Generate fundamental Vulkan API bindings using `vkxml2java` from `vk.xml`
- [x] Take off!
- [x] Vulkan tutorial
  - [ ] Chinese translation
- [x] Generate GLFW bindings using `codegen`
- [x] Generate OpenGL ES2 bindings using `codegen`
- [x] Generate or write Vulkan Memory Allocator API bindings
- [x] Switch to `codegen` for Vulkan bindings
- [x] Generate Vulkan Video API bindings

## *Development history before 0.3.0?*

See [vulkan4j-legacy](https://github.com/CousinZe/vulkan4j-legacy).
