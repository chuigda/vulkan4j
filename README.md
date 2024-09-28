# vulkan4j
[Vulkan](https://www.vulkan.org/) Binding for Java using [Project-Panama](https://openjdk.org/projects/panama/) `java.lang.foreign` APIs.

*Heavily inspired by the [`vulkanalia`](https://github.com/KyleMayes/vulkanalia) crate.*

## Features
- Project-Panama `java.lang.foreign` APIs
- Clean Vulkan API bindings generated from `vk.xml`
- Does not require extra native libraries to work
- Platform-agnostic
- Java-friendly, type-safe API
- Automatically fulfilling fields like `sType` for you
- Customizable library loading

## Roadmap
- [x] Generate fundamental Vulkan API bindings using `vkxml2java` from `vk.xml`
- [x] Take off!
- [ ] VkCube example implemented with `tech.icey.vk4j`
- [ ] Generate or write Vulkan Memory Allocator API bindings
- [ ] Generate Vulkan Video API bindings
