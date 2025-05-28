# Descriptor pool and sets

## Introduction

The descriptor layout from the previous chapter describes the type of descriptors that can be bound. In this chapter we're going to create a descriptor set for each `VkBuffer` resource to bind it to the uniform buffer descriptor.

## Descriptor pool

Descriptor sets can't be created directly, they must be allocated from a pool like command buffers. The equivalent for descriptor sets is unsurprisingly called a *descriptor pool*. We'll write a new function `createDescriptorPool` to set it up.

```java
private void initVulkan() {
    // ...
    createUniformBuffers();
    createDescriptorPool();
    // ...
}

// ...

private void createDescriptorPool() {
}
```

We first need to describe which descriptor types our descriptor sets are going to contain and how many of them, using `VkDescriptorPoolSize` structures.

```java
try (var arena = Arena.ofConfined()) {
    var poolSize = VkDescriptorPoolSize.allocate(arena);
    poolSize.type(VkDescriptorType.UNIFORM_BUFFER);
    poolSize.descriptorCount(MAX_FRAMES_IN_FLIGHT);
}
```

We will allocate one of these descriptors for every frame. This pool size structure is referenced by the main `VkDescriptorPoolCreateInfo`:

```java
var poolInfo = VkDescriptorPoolCreateInfo.allocate(arena);
poolInfo.poolSizeCount(1);
poolInfo.pPoolSizes(poolSize);
```

Aside from the maximum number of individual descriptors that are available, we also need to specify the maximum number of descriptor sets that may be allocated:

```java
poolInfo.maxSets(MAX_FRAMES_IN_FLIGHT);
```

The structure has an optional flag similar to command pools that determines if individual descriptor sets can be freed or not: `VkDescriptorPoolCreateFlags.FREE_DESCRIPTOR_SET`. We're not going to touch the descriptor set after creating it, so we don't need this flag. You can leave flags to its default value of `0`.

```java
private VkDescriptorPool descriptorPool;

// ...

var pDescriptorPool = VkDescriptorPool.Ptr.allocate(arena);
var result = deviceCommands.createDescriptorPool(device, poolInfo, null, pDescriptorPool);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create descriptor pool, vulkan error code: " + VkResult.explain(result));
}
descriptorPool = Objects.requireNonNull(pDescriptorPool.read());
```

Add a new class member to store the handle of the descriptor pool and call `VkDeviceCommands::createDescriptorPool` to create it.

## Descriptor set

We can now allocate the descriptor sets themselves. Add a `createDescriptorSets` function for that purpose:

```java
private void initVulkan() {
    // ...
    createDescriptorPool();
    createDescriptorSets();
    // ...
}

// ...

private void createDescriptorSets() {
}
```

A descriptor set allocation is described with a `VkDescriptorSetAllocateInfo` struct. You need to specify the descriptor pool to allocate from, the number of descriptor sets to allocate, and the descriptor layout to base them on:

```java
try (Arena arena = Arena.ofConfined()) {
    var pLayouts = VkDescriptorSetLayout.Ptr.allocate(arena, MAX_FRAMES_IN_FLIGHT);
    pLayouts.write(0, descriptorSetLayout);
    pLayouts.write(1, descriptorSetLayout);

    var allocInfo = VkDescriptorSetAllocateInfo.allocate(arena);
    allocInfo.descriptorPool(descriptorPool);
    allocInfo.descriptorSetCount(MAX_FRAMES_IN_FLIGHT);
    allocInfo.pSetLayouts(pLayouts);
}
```

In our case we will create one descriptor set for each frame in flight, all with the same layout. Unfortunately we do need all the copies of the layout because the next function expects an array matching the number of sets.

Add a class member to hold the descriptor set handles and allocate them with `VkDeviceCommands::allocateDescriptorSets`:

```java
private VkDescriptorSet.Ptr descriptorSets;

// ...

descriptorSets = VkDescriptorSet.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);

// ...

var result = deviceCommands.allocateDescriptorSets(device, allocInfo, descriptorSets);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to allocate descriptor sets, vulkan error code: " + VkResult.explain(result));
}
```

The call to `VkDeviceCommands::allocateDescriptorSets` will allocate descriptor sets, each with one uniform buffer descriptor.

You don't need to explicitly clean up descriptor sets, because they will be automatically freed when the descriptor pool is destroyed.

```java
private void cleanup() {
    // ...
    deviceCommands.destroyDescriptorPool(device, descriptorPool, null);
    deviceCommands.destroyDescriptorSetLayout(device, descriptorSetLayout, null);
    // ...
}
```

The descriptor sets have been allocated now, but the descriptors within still need to be configured. We'll now add a loop to populate every descriptor:

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++){
}
```

Descriptors that refer to buffers, like our uniform buffer descriptor, are configured with a `VkDescriptorBufferInfo` struct. This structure specifies the buffer and the region within it that contains the data for the descriptor.

```java
for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++){
    var bufferInfo = VkDescriptorBufferInfo.allocate(arena);
    bufferInfo.buffer(uniformBuffers.read(i));
    bufferInfo.offset(0);
    bufferInfo.range((long) UniformBufferObject.bufferSize() * Float.BYTES);
}
```

If you're overwriting the whole buffer, like we are in this case, then it is also possible to use the `VkConstants.WHOLE_SIZE` value for the range. The configuration of descriptors is updated using the `VkDeviceCommands::updateDescriptorSets` function, which takes an array of `VkWriteDescriptorSet` structs as parameter.

```java
var descriptorWrite = VkWriteDescriptorSet.allocate(arena);
descriptorWrite.dstSet(descriptorSets.read(i));
descriptorWrite.dstBinding(0);
descriptorWrite.dstArrayElement(0);
```

The first two fields specify the descriptor set to update and the binding. We gave our uniform buffer binding index `0`. Remember that descriptors can be arrays, so we also need to specify the first index in the array that we want to update. We're not using an array, so the index is simply `0`.

```java
descriptorWrite.descriptorType(VkDescriptorType.UNIFORM_BUFFER);
descriptorWrite.descriptorCount(1);
```

We need to specify the type of descriptor again. It's possible to update multiple descriptors at once in an array, starting at index `dstArrayElement`. The `descriptorCount` field specifies how many array elements you want to update.

```java
descriptorWrite.pBufferInfo(bufferInfo);
descriptorWrite.pImageInfo(null); // Optional
descriptorWrite.pTexelBufferView(null); // Optional
```

The last field references an array with `descriptorCount` structs that actually configure the descriptors. It depends on the type of descriptor which one of the three you actually need to use. The `pBufferInfo` field is used for descriptors that refer to buffer data, `pImageInfo` is used for descriptors that refer to image data, and `pTexelBufferView` is used for descriptors that refer to buffer views. Our descriptor is based on buffers, so we're using `pBufferInfo`.

```java
deviceCommands.updateDescriptorSets(device, 1, descriptorWrite, 0, null);
```

The updates are applied using `VkDeviceCommands::updateDescriptorSets`. It accepts two kinds of arrays as parameters: an array of `VkWriteDescriptorSet` and an array of `VkCopyDescriptorSet`. The latter can be used to copy descriptors to each other, as its name implies.

## Updating descriptor sets

We now need to update the `recordCommandBuffer` function to actually bind the right descriptor set for each frame to the descriptors in the shader with `vkCmdBindDescriptorSets`. This needs to be done before the `vkCmdDrawIndexed` call:

```java
var pDescriptorSet = descriptorSets.offset(currentFrame);
deviceCommands.cmdBindDescriptorSets(
        commandBuffer,
        VkPipelineBindPoint.GRAPHICS,
        pipelineLayout,
        0,
        1,
        pDescriptorSet,
        0,
        null
);
deviceCommands.cmdDrawIndexed(commandBuffer, INDICES.length, 1, 0, 0, 0);
```

Unlike vertex and index buffers, descriptor sets are not unique to graphics pipelines. Therefore, we need to specify if we want to bind descriptor sets to the graphics or compute pipeline. The next parameter is the layout that the descriptors are based on. The next three parameters specify the index of the first descriptor set, the number of sets to bind, and the array of sets to bind. We'll get back to this in a moment. The last two parameters specify an array of offsets that are used for dynamic descriptors. We'll look at these in a future chapter.

Now run the program. If you're careful enough, you'll find the output looks upside down. There are some mathematical reasons for this which *I don't understand*. Fortunately, there's an easy way and a more complicated way to fix this.

### Easy way

The easiest way to compensate for that is to flip the sign on the scaling factor of the Y axis in the projection matrix:

```java
proj.m11(-proj.m11());
```

And after this transformation, our triangles will have opposite winding order. So our rasterizer settings also needs to be changed:

```java
rasterizer.frontFace(VkFrontFace.COUNTER_CLOCKWISE);
```

### Complicated way

After collecting developer feedback, the `VK_KHR_Maintenance1` extensions was added for Vulkan 1.0, including support for passing negative viewport heights. This extension has become core with Vulkan 1.1.

<hr />

If you'd like to stick to Vulkan 1.0, you can update function `checkDeviceExtensionSupported` to check for the `VK_KHR_MAINTENANCE_1_EXTENSION_NAME` extension:

```java
boolean hasSwapchain = false;
boolean hasMaintenance1 = false;
for (var extension : availableExtensions) {
    if (VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME.equals(extension.extensionName().readString())) {
        hasSwapchain = true;
    }

    if (VkConstants.KHR_MAINTENANCE_1_EXTENSION_NAME.equals(extension.extensionName().readString())) {
        hasMaintenance1 = true;
    }

    if (hasSwapchain && hasMaintenance1) {
        return true;
    }
}

return false;
```

And request the extension in the `createLogicalDevice` function:

```java
deviceCreateInfo.enabledExtensionCount(2);
var ppDeviceExtensions = PointerPtr.allocate(arena, 2);
ppDeviceExtensions.write(0, BytePtr.allocateString(arena, VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME));
ppDeviceExtensions.write(1, ByteBuffer.allocateString(arena, VkConstants.KHR_MAINTENANCE_1_EXTENSION_NAME));
deviceCreateInfo.ppEnabledExtensionNames(ppDeviceExtensions);
```

<hr />

Or you may simply request a higher Vulkan version:

```java
appInfo.apiVersion(Version.VK_API_VERSION_1_1.encode());
```

<hr />

Then, when setting the viewport state, we can now specify a negative viewport height to flip it along the y axia:

```java
var viewport = VkViewport.allocate(arena);
viewport.x(0.0f);
viewport.y(swapChainExtent.height());
viewport.width(swapChainExtent.width());
viewport.height(-swapChainExtent.height());
viewport.minDepth(0.0f);
viewport.maxDepth(1.0f);
deviceCommands.cmdSetViewport(commandBuffer, 0, 1, viewport);
```

And still you need to change your front facing:

```java
rasterizer.frontFace(VkFrontFace.COUNTER_CLOCKWISE);
```

Now run the program, and you should see the correctly oriented triangle.

![Spinning quad](../../images/spinning_quad.png)

The rectangle has changed into a square because the projection matrix now corrects for aspect ratio. The `updateUniformBuffer` takes care of screen resizing, so we don't need to recreate the descriptor set in `recreateSwapChain`.

## Alignment requirements

One thing we've glossed over so far is how exactly our `FloatBuffer` content should match with the uniform definition in the shader. It seems obvious enough to simply use the same types in both:

```glsl
layout(binding = 0) uniform UniformBufferObject {
    mat4 model;
    mat4 view;
    mat4 proj;
} ubo;
```

```java
private record UniformBufferObject(Matrix4f model, Matrix4f view, Matrix4f proj) {
    public static int bufferSize() {
        return 16 * 3;
    }

    public void writeToFloatPtr(FloatPtr buffer) {
        assert buffer.size() >= bufferSize();

        model.get(buffer.segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        view.get(buffer.offset(16).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        proj.get(buffer.offset(32).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
    }
}
```

However, that's not all there is to it. For example, try modifying the shader to look like this:

```java
layout(binding = 0) uniform UniformBufferObject {
    vec2 foo;
    mat4 model;
    mat4 view;
    mat4 proj;
} ubo;
```

You may think that you can simply add a `Vector2f` field to the `UniformBufferObject`, increase the buffer size by `2` and prepend a `foo.get` call to the `writeToBuffer` method like this:

```java
private record UniformBufferObject(Vector2f foo, Matrix4f model, Matrix4f view, Matrix4f proj) {
    public static int bufferSize() {
        return 2 + 16 * 3;
    }

    public void writeToFloatPtr(FloatPtr buffer) {
        assert buffer.size() >= bufferSize();

        foo.get(buffer.segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        model.get(buffer.offset(2).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        view.get(buffer.offset(18).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        proj.get(buffer.offset(34).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
    }
}
```

Recompile your shader and your program and run it, and you'll find that the colorful square you worked so far has disappeared! That's because we haven't taken into account the *alignment requirements*.

Vulkan expects the data in your structure to be aligned in memory in a specific way, for example:

- `Scalars` have to be aligned by `N` (= 4 bytes given 32 bit floats).
- A `vec2` must be aligned by `2N` (= 8 bytes)
- A `vec3` or vec4 must be aligned by `4N` (= 16 bytes)
- A nested structure must be aligned by the base alignment of its members rounded up to a multiple of `16`.
- A `mat4` matrix must have the same alignment as a `vec4`.

You can find the full list of alignment requirements in [the specification](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap15.html#interfaces-resources-layout).

Our original shader with just three mat4 fields already met the alignment requirements. As each `mat4` is `4 x 4 x 4 = 64` bytes in size, `model` has an offset of `0`, `view` has an offset of `64` and `proj` has an offset of `128`. All of these are multiples of `16` and that's why it worked fine.

The new structure starts with a `vec2` which is only 8 bytes in size and therefore throws off all the offsets. Now `model` has an offset of `8`, `view` an offset of `72` and `proj` an offset of `136`, none of which are multiples of `16`.

To fix this, we need to add padding to our buffer. We need to request a little more memory than we actually need and then manually align the fields in the buffer.

```java
private record UniformBufferObject(Vector2f foo, Matrix4f model, Matrix4f view, Matrix4f proj) {
    public static int bufferSize() {
        return 4 + 16 * 3;
    }

    public void writeToFloatPtr(FloatPtr buffer) {
        assert buffer.size() >= bufferSize();
        
        foo.get(buffer.segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        model.get(buffer.offset(4).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        view.get(buffer.offset(20).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
        proj.get(buffer.offset(36).segment().asByteBuffer().order(ByteOrder.nativeOrder()));
    }
}
```

If you now compile and run your program again you should see that the shader correctly receives its matrix values once again.

## Multiple descriptor sets

As some of the structures and function calls hinted at, it is actually possible to bind multiple descriptor sets simultaneously. You need to specify a descriptor layout for each descriptor set when creating the pipeline layout. Shaders can then reference specific descriptor sets like this:

```glsl
layout(set = 0, binding = 0) uniform UniformBufferObject { ... }
```

You can use this feature to put descriptors that vary per-object and descriptors that are shared into separate descriptor sets. In that case you avoid rebinding most of the descriptors across draw calls which is potentially more efficient.
