# vulkan4j

[![CI status](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml)

> [Website](https://vulkan4j.doki7.club) | [Discord](https://discord.gg/UsmRvrt4gg)

*This project is heavily inspired by the [`vulkanalia`](https://github.com/KyleMayes/vulkanalia) crate.*

Graphics and relevant API binding for Java using [Project Panama](https://openjdk.org/projects/panama/) `java.lang.foreign` APIs. This project is initially focused on [Vulkan](https://www.vulkan.org/), but soon we extended to other graphics APIs such as [OpenGL](https://www.opengl.org/) and [OpenGL ES](https://www.khronos.org/opengles/). More APIs may be added in the future, feature requests and contributions are welcome!

## Bindings Available

- [Vulkan](https://www.khronos.org/vulkan/): [`vulkan`](https://github.com/chuigda/vulkan4j/tree/master/vulkan) module, generated from [`vk.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/vk.xml) and [`video.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/video.xml).
- [OpenGL](https://www.opengl.org/): [`opengl`](https://github.com/chuigda/vulkan4j/tree/master/opengl) module, generated from [`gl.xml`](https://github.com/KhronosGroup/OpenGL-Registry/blob/main/xml/gl.xml). Note that our extension list is copied from LWJGL, and not all extensions are included. Name your desired extension in the issue tracker!
- [OpenGL ES 2.0](https://www.khronos.org/opengles/): [`gles2`](https://github.com/chuigda/vulkan4j/tree/master/gles2) module, also generated from `gl.xml`. This module only provides most fundamental OpenGL ES 2.0 features, and does not include any extensions. This package was here for the author's own use initially.
- [GLFW](https://www.glfw.org/): [`glfw`](https://github.com/chuigda/vulkan4j/tree/master/glfw) module, generated from GLFW header files.
- [Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator): [`vma`](https://github.com/chuigda/vulkan4j/tree/master/vma) module, generated from [`vk_mem_alloc.h`](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h). If you use a specific build supporting `vk4jSetJavaTrace`, you can enjoy Java stacktrace on VMA assertion failures. Check out the [`vma_build`](https://github.com/chuigda/vulkan4j/tree/master/vma/vma_build) directory for more information.

## Documentation and Tutorials

### [JavaDoc](https://vulkan4j.doki7.club/)

*Our website itself is generated with JavaDoc, with a custom `overview.html`.*

### [Vulkan tutorial](https://vulkan4j.doki7.club/tutorial/en/)
For users new to Vulkan, there is a (almost) complete adaptation of [https://vulkan-tutorial.com](https://vulkan-tutorial.com) by [Alexander Overvoorde](https://github.com/Overv) to use Java and vulkan4j instead of C++. The published version of this tutorial can be found [here](https://vulkan4j.doki7.club/tutorial/en/), and the sources for the tutorial (including standalone working code examples for each chapter) can be found under the `tutorial` directory.

### LearnOpenGL tutorial port
*Now under development!*

## Roadmap
- [x] v0.3.0 rewrite, new namespace, new `ffm-plus` module, use `codegen-v2` module for all registry extraction and code generation.
- [x] API enhancements: chaining `set` methods for structures, LWJGL style `set` methods for structure members, `allocateV` and `writeV` series functions for `Ptr` types.
- [x] Full OpenGL bindings
  - [ ] Tutorial porting 
- [ ] Full OpenGL ES bindings
- [ ] OpenAL bindings
- [ ] WebGPU bindings
- [ ] SDL3 bindings
- [ ] LLVM bindings (*is this graphics anymore?*)

### *Development history before 0.3.0?*

See [vulkan4j-legacy](https://github.com/CousinZe/vulkan4j-legacy).

## Donation

The author is not accepting any donation at the moment <del>though he thinks that the whole world owes him 27 billion 30 million CHF</del>. If you like this project, either using in production or got some inspiration, just star and thank author.
