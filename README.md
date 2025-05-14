# vulkan4j

> ⚠️ NOTE: UNDERGOING CHANGES
> 
> We're about to release the 0.3.0 version of this ecosystem, fixing most issues and make it more human-friendly, and this would cause a **massive changes** on APIs, however. If you're interested you may read some docs and star this, but maybe don't put this into your project at once.

> [Discord](https://discord.gg/UsmRvrt4gg)

[Vulkan](https://www.vulkan.org/) Binding for Java using [Project Panama](https://openjdk.org/projects/panama/) `java.lang.foreign` APIs.

*Heavily inspired by the [`vulkanalia`](https://github.com/KyleMayes/vulkanalia) crate.*

## [Vulkan tutorial](https://vulkan4j.7dg.tech/tutorial/en/)
For users new to Vulkan, there is a (almost) complete adaptation of [https://vulkan-tutorial.com](https://vulkan-tutorial.com) by [Alexander Overvoorde](https://github.com/Overv) to use Java and vulkan4j instead of C++. The published version of this tutorial can be found [here](https://vulkan4j.7dg.tech/tutorial/en/), and the sources for the tutorial (including standalone working code examples for each chapter) can be found under the `tutorial` directory.

## Overview
[`panama-plus`](https://github.com/chuigda/vulkan4j/tree/master/panama-plus) is a small utility library that gives a thin wrapper over Project Panama `java.lang.foreign` APIs to make them easier and more type-safe to use. It is used by `vulkan4j` to provide a more Java-friendly API for Vulkan.

[`vk4j`](https://github.com/chuigda/vulkan4j/tree/master/vk4j) is the main library that provides the Vulkan bindings. Bindings are generated from [`vk.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/vk.xml) using [`vkxml2java`](https://github.com/chuigda/vulkan4j/tree/master/vk4j/vkxml2java) *(we plan to switch to `codegen` module soon)*.

[`vma`](https://github.com/chuigda/vulkan4j/tree/master/vma) is a binding to the Vulkan Memory Allocator library. It is generated from [`vk_mem_alloc.h`](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h) using the `codegen` module.

[`glfw`](https://github.com/chuigda/vulkan4j/tree/master/glfw) is a wrapper around the GLFW library that provides a more Java-friendly API for creating windows and handling input. It is generated from [GLFW header files](https://github.com/glfw/glfw/tree/master/include/GLFW) using the `codegen` module.

[`gles2`](https://github.com/chuigda/vulkan4j/tree/master/gles2) provides OpenGL ES2 bindings. Bindings are generated from [`gl.xml`](https://github.com/KhronosGroup/OpenGL-Registry/blob/main/xml/gl.xml) using the `codegen` module. 

## Roadmap
- [x] Generate fundamental Vulkan API bindings using `vkxml2java` from `vk.xml`
- [x] Take off!
- [x] Vulkan tutorial
  - [ ] Chinese translation
- [x] Generate GLFW bindings using `codegen`
- [x] Generate OpenGL ES2 bindings using `codegen`
- [x] Generate or write Vulkan Memory Allocator API bindings
- [ ] Switch to `codegen` for Vulkan bindings <- Ongoing
- [ ] Generate Vulkan Video API bindings <- Ongoing
