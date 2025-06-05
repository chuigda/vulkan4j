# vulkan4j

[![CI status](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml/badge.svg?branch=master)](https://github.com/chuigda/vulkan4j/actions/workflows/ci.yml)

> [Website & JavaDoc](https://vulkan4j.doki7.club) | [Vulkan Tutorial port](https://vulkan4j.doki7.club/tutorial/en/) | [LearnOpenGL port](https://vulkan4j.doki7.club/learnopengl/en/) | [Discord](https://discord.gg/UsmRvrt4gg)

*This project is heavily inspired by the [`vulkanalia`](https://github.com/KyleMayes/vulkanalia) crate.*

`vulkan4j` is a series of graphics and relevant API binding for Java, implemented with Java 22 [Project Panama](https://openjdk.org/projects/panama/) `java.lang.foreign` APIs. This project initially focuses on [Vulkan](https://www.vulkan.org/), but soon we expanded to other graphics APIs such as [OpenGL](https://www.opengl.org/) and [OpenGL ES](https://www.khronos.org/opengles/). More APIs will be added in the future, feature requests and contributions are welcome!

## Bindings Available

- [Vulkan](https://www.khronos.org/vulkan/) ([`vulkan`](https://github.com/chuigda/vulkan4j/tree/master/vulkan) module): Generated from [`vk.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/vk.xml) and [`video.xml`](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/video.xml).
- [Vulkan Memory Allocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator) ([`vma`](https://github.com/chuigda/vulkan4j/tree/master/vma) module): Generated from [`vk_mem_alloc.h`](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator/blob/master/include/vk_mem_alloc.h). If you use a specific build supporting `vk4jSetJavaTrace`, you can enjoy Java stacktrace on VMA assertion failures. Check out the [`vma_build`](https://github.com/chuigda/vulkan4j/tree/master/vma/vma_build) directory for more information.
- [OpenGL](https://www.opengl.org/) ([`opengl`](https://github.com/chuigda/vulkan4j/tree/master/opengl) module): Generated from [`gl.xml`](https://github.com/KhronosGroup/OpenGL-Registry/blob/main/xml/gl.xml). Our supported extension list is copied from LWJGL, and not all extensions are included (since some OpenGL extensions are completely useless nowadays). Name your desired extension in the issue tracker!
- [OpenAL](https://www.openal.org/) ([`openal`](https://github.com/chuigda/vulkan4j/tree/master/openal) module): Generated from OpenAL-soft header files. This module is based on OpenAL-soft 1.2, and provides a complete set of OpenAL features, including all extensions supported by OpenAL-soft.
- [GLFW](https://www.glfw.org/) ([`glfw`](https://github.com/chuigda/vulkan4j/tree/master/glfw) module): Generated from GLFW header files.

<details>
<summary>Obsolete bindings</summary>

- [OpenGL ES 2.0](https://www.khronos.org/opengles/) ([`gles2`](https://github.com/chuigda/vulkan4j/tree/master/gles2) module): Also generated from `gl.xml`. This module only provides most fundamental OpenGL ES 2.0 features, and does not include any extensions. This package was initially created for the Chuigda's own use. This package will still get maintained since Chuigda wants.

</details>

## `ffm-plus`

To improve development experience using Java 22 FFM APIs, we created a small library [`ffm-plus`](https://github.com/chuigda/vulkan4j/tree/master/ffm-plus) that encapsulates most commonly used facilities, such as typed pointers and bitfield operations. All our bindings use `ffm-plus`.

## Documentation and Tutorials

### [JavaDoc](https://vulkan4j.doki7.club/)

*Our website itself is generated with JavaDoc, with a custom `overview.html`.*

### [Vulkan tutorial port](https://vulkan4j.doki7.club/tutorial/en/)
For users new to Vulkan, there is a (almost) complete adaptation of [https://vulkan-tutorial.com](https://vulkan-tutorial.com) by [Alexander Overvoorde](https://github.com/Overv) to use Java and `vulkan4j` instead of C++. The published version of this tutorial can be found [here](https://vulkan4j.doki7.club/tutorial/en/), and the sources for the tutorial (including standalone working code examples for each chapter) can be found under the `tutorial` directory.

### [LearnOpenGL tutorial port](https://vulkan4j.doki7.club/learnopengl/en/)
For OpenGL users, we ported the [LearnOpenGL](https://learnopengl.com) tutorial to use Java and `vulkan4j`. The published version of this tutorial can be found [here](https://vulkan4j.doki7.club/learnopengl/en/), and the sources for the tutorial can be found under the `tutorial` directory. Till now only the first several chapters are ported, which should be adequate to get you started with OpenGL in Java. The rest of the chapters will be ported in the future.

## Roadmap
- [x] v0.3.0 rewrite, new namespace, new `ffm-plus` module, use `codegen-v2` module for all registry extraction and code generation.
- [x] API enhancements: chaining `set` methods for structures, LWJGL style `set` methods for structure members, `allocateV` and `writeV` series functions for `Ptr` types.
- [x] Full OpenGL bindings
  - [ ] Tutorial porting
- [x] OpenAL bindings
- [ ] Full OpenGL ES bindings
- [ ] WebGPU bindings
- [ ] SDL3 bindings
- [ ] LLVM bindings (*is this graphics anymore?*)

### *Development history before 0.3.0?*

See [vulkan4j-legacy](https://github.com/CousinZe/vulkan4j-legacy).

## Donation

Doki Doki 7th Design Club! is not accepting any donation at the moment <del>though Chuigda thinks that the whole world owes him 27 billion 30 million CHF</del>. If you like this project, either using in production or got some inspiration, just star and thank author.
