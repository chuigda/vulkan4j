# Vertex buffer creation

## Introduction

Buffers in Vulkan are regions of memory used for storing arbitrary data that can be read by the graphics card. They can be used to store vertex data, which we'll do in this chapter, but they can also be used for many other purposes that we'll explore in future chapters. Unlike the Vulkan objects we've been dealing with so far, buffers do not automatically allocate memory for themselves. The work from the previous chapters has shown that the Vulkan API puts the programmer in control of almost everything and memory management is one of those things.

Buffer creation

Create a new function `createVertexBuffer` and call it from `initVulkan` right before `createCommandBuffers`.

```java
private void initVulkan() {
    // ...
    createVertexBuffer();
    createCommandBuffers();
    // ...
}

// ...

private void createVertexBuffer() {
}
```

Creating a buffer requires us to fill a `VkBufferCreateInfo` structure.

```java
try (var arena = Arena.ofConfined()) {
    var bufferInfo = VkBufferCreateInfo.allocate(arena);
    bufferInfo.size(VERTICES.length * Float.BYTES);
}
```

The first field of the struct is `size`, which specifies the size of the buffer in bytes. Calculating the byte size of the vertex data is straightforward with the `size` method of the `FloatBuffer`.

```java
bufferInfo.usage(VkBufferUsageFlags.VERTEX_BUFFER);
```

The second field is `usage`, which indicates for which purposes the data in the buffer is going to be used. It is possible to specify multiple purposes using a bitwise or. Our use case will be a vertex buffer, we'll look at other types of usage in future chapters.

```java
bufferInfo.sharingMode(VkSharingMode.EXCLUSIVE);
```

Just like the images in the swap chain, buffers can also be owned by a specific queue family or be shared between multiple at the same time. The buffer will only be used from the graphics queue, so we can stick to exclusive access.

The `flags` field is used to configure sparse buffer memory, which is not relevant right now. We'll leave it at the default value of `0`.

We can now create the buffer with `VkDeviceCommands::createBuffer`. Define a class member to hold the buffer handle and call it `vertexBuffer`.

```java
private VkBuffer vertexBuffer;

// ...

private void createVertexBuffer() {
    try (var arena = Arena.ofConfined()) {
        var bufferInfo = VkBufferCreateInfo.allocate(arena);
        bufferInfo.size(VERTICES.length * Float.BYTES);
        bufferInfo.usage(VkBufferUsageFlags.VERTEX_BUFFER);
        bufferInfo.sharingMode(VkSharingMode.EXCLUSIVE);

        var pBuffer = VkBuffer.Ptr.allocate(arena);
        var result = deviceCommands.createBuffer(device, bufferInfo, null, pBuffer);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to create vertex buffer, vulkan error code: " + VkResult.explain(result));
        }

        vertexBuffer = Objects.requireNonNull(pBuffer.read());
    }
}
```

The buffer should be available for use in rendering commands until the end of the program, and it does not depend on the swap chain, so we'll clean it up in the original `cleanup` function:

```java
private void cleanup() {
    // ...
    cleanupSwapchain();
    deviceCommands.destroyBuffer(device, vertexBuffer, null);
    // ...
}
```

## Memory requirements

The buffer has been created, but it doesn't actually have any memory assigned to it yet. The first step of allocating memory for the buffer is to query its memory requirements using the aptly named `VkDeviceCommands::getBufferMemoryRequirements` function.

```java
var memRequirements = VkMemoryRequirements.allocate(arena);
deviceCommands.getBufferMemoryRequirements(device, vertexBuffer, memRequirements);
```

The `VkMemoryRequirements` struct has three fields:

- `size`: The size of the required amount of memory in bytes, may differ from `bufferInfo.size`.
- `alignment`: The offset in bytes where the buffer begins in the allocated region of memory, depends on `bufferInfo.usage` and `bufferInfo.flags`.
- `memoryTypeBits`: Bit field of the memory types that are suitable for the buffer.

Graphics cards can offer different types of memory to allocate from. Each type of memory varies in terms of allowed operations and performance characteristics. We need to combine the requirements of the buffer and our own application requirements to find the right type of memory to use. Let's create a new function `findMemoryType` for this purpose.

```java
private int findMemoryType(int typeFilter, @enumtype(VkMemoryPropertyFlags.class) int properties) {
}
```

First we need to query info about the available types of memory using `VkInstanceCommands::getPhysicalDeviceMemoryProperties`.

```java
try (var arena = Arena.ofConfined()) {
    var memProperties = VkPhysicalDeviceMemoryProperties.allocate(arena);
    instanceCommands.vkGetPhysicalDeviceMemoryProperties(physicalDevice, memProperties);
}
```

The `VkPhysicalDeviceMemoryProperties` structure has two arrays `memoryTypes` and `memoryHeaps`. Memory heaps are distinct memory resources like dedicated VRAM and swap space in RAM for when VRAM runs out. The different types of memory exist within these heaps. Right now we'll only concern ourselves with the type of memory and not the heap it comes from, but you can imagine that this can affect performance.

Let's first find a memory type that is suitable for the buffer itself:

```java
for (int i = 0; i < memProperties.memoryTypeCount(); i++) {
    if ((typeFilter & (1 << i)) != 0) {
        return i;
    }
}

throw new RuntimeException("Failed to find suitable memory type");
```

The `typeFilter` parameter will be used to specify the bit field of memory types that are suitable. That means that we can find the index of a suitable memory type by simply iterating over them and checking if the corresponding bit is set to `1`.

However, we're not just interested in a memory type that is suitable for the vertex buffer. We also need to be able to write our vertex data to that memory. The `memoryTypes` array consists of `VkMemoryType` structs that specify the heap and properties of each type of memory. The properties define special features of the memory, like being able to map it so we can write to it from the CPU. This property is indicated with `VkMemoryPropertyFlags.HOST_VISIBLE`, but we also need to use the `VkMemoryPropertyFlags.HOST_COHERENT` property. We'll see why when we map the memory.

```java
for (int i = 0; i < memProperties.memoryTypeCount(); i++) {
    if ((typeFilter & (1 << i)) != 0 &&
        (memProperties.memoryTypes().at(i).propertyFlags() & properties) == properties) {
        return i;
    }
}
```

We may have more than one desirable property, so we should check if the result of the bitwise AND is not just non-zero, but equal to the desired properties bit field. If there is a memory type suitable for the buffer that also has all the properties we need, then we return its index, otherwise we throw an exception.

## Memory allocation

We now have a way to determine the right memory type, so we can actually allocate the memory by filling in the `VkMemoryAllocateInfo` structure.

```java
var allocInfo = VkMemoryAllocateInfo.allocate(arena);
allocInfo.allocationSize(memRequirements.size());
allocInfo.memoryTypeIndex(findMemoryType(
        memRequirements.memoryTypeBits(),
        VkMemoryPropertyFlags.HOST_VISIBLE
        | VkMemoryPropertyFlags.HOST_COHERENT
));
```

Memory allocation is now as simple as specifying the size and type, both of which are derived from the memory requirements of the vertex buffer and the desired property. Create a class member to store the handle to the memory and allocate it with `VkDeviceCommands::allocateMemory`.

```java
private VkDeviceMemory vertexBufferMemory;

// ...

var pVertexBufferMemory = VkDeviceMemory.Ptr.allocate(arena);
result = deviceCommands.allocateMemory(device, allocInfo, null, pVertexBufferMemory);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to allocate vertex buffer memory, vulkan error code: " + VkResult.explain(result));
}
vertexBufferMemory = Objects.requireNonNull(pVertexBufferMemory.read());
```

If memory allocation was successful, then we can now associate this memory with the buffer using `VkDeviceCommands::bindBufferMemory`:

```java
deviceCommands.bindBufferMemory(device, vertexBuffer, vertexBufferMemory, 0);
```

The first three parameters are self-explanatory and the fourth parameter is the offset within the region of memory. Since this memory is allocated specifically for this the vertex buffer, the offset is simply `0`. If the offset is non-zero, then it is required to be divisible by `memRequirements.alignment`.

Of course, just like dynamic memory allocation in C++, the memory should be freed at some point. Memory that is bound to a buffer object may be freed once the buffer is no longer used, so let's free it after the buffer has been destroyed:

```java
private void cleanup() {
    // ...
    deviceCommands.destroyBuffer(device, vertexBuffer, null);
    deviceCommands.freeMemory(device, vertexBufferMemory, null);
    // ...
}
```

## Filling the vertex buffer

It is now time to copy the vertex data to the buffer. This is done by mapping the buffer memory into CPU accessible memory with `VkDeviceCommands::mapMemory`.

```java
var ppData = PointerPtr.allocate(arena);
result = deviceCommands.mapMemory(device, vertexBufferMemory, 0, bufferInfo.size(), 0, ppData);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to map vertex buffer memory, vulkan error code: " + VkResult.explain(result));
}
var pData = ppData.read().reinterpret(bufferInfo.size());
```

This function allows us to access a region of the specified memory resource defined by an offset and size. The offset and size here are `0` and `bufferInfo.size`, respectively. It is also possible to specify the special value `VkConstants.WHOLE_SIZE` to map all the memory. The second to last parameter can be used to specify flags, but there aren't any available yet in the current API. It must be set to the value `0`. The last parameter specifies the output for the pointer to the mapped memory.

```java
pData.copyFrom(MemorySegment.ofArray(VERTICES));
deviceCommands.vkUnmapMemory(device, vertexBufferMemory);
```

You can now simply use `MemorySegment.copyFrom` to copy the vertex data to mapped memory and unmap it again using `vkUnmapMemory`. Unfortunately the driver may not immediately copy the data into the buffer memory, for example because of caching. It is also possible that writes to the buffer are not visible in the mapped memory yet. There are two ways to deal with that problem: 

- Use a memory heap that is host coherent, indicated with `VkMemoryPropertyFlags.HOST_COHERENT`
- Call `VkDeviceCommands::flushMappedMemoryRanges` after writing to the mapped memory, and call `VkDeviceCommands::invalidateMappedMemoryRanges` before reading from the mapped memory

We went for the first approach, which ensures that the mapped memory always matches the contents of the allocated memory. Do keep in mind that this may lead to slightly worse performance than explicit flushing, but we'll see why that does not matter in the next chapter.

## Binding the vertex buffer

All that remains now is binding the vertex buffer during rendering operations. We're going to extend the `recordCommandBuffer` function to do that.

```java
// ...

var vertexBuffers = VkBuffer.Ptr.allocate(arena);
vertexBuffers.write(vertexBuffer);
var offsets = LongPtr.allocate(arena);
offsets.write(0);
deviceCommands.cmdBindVertexBuffers(commandBuffer, 0, 1, vertexBuffers, offsets);

deviceCommands.cmdDraw(commandBuffer, 3, 1, 0, 0);

// ...
```

The `VkDeviceCommands::cmdBindVertexBuffers` function is used to bind vertex buffers to bindings, like the one we set up in the previous chapter. The first two parameters, besides the command buffer, specify the offset and number of bindings we're going to specify vertex buffers for. The last two parameters specify the array of vertex buffers to bind and the byte offsets to start reading vertex data from.

Now run the program and you should see the familiar triangle again:

![Triangle](../../images/triangle.png)

Try changing the color of the top vertex to white by modifying the `VERTICES` array:

```java
private static final float[] VERTICES = {
        // vec2 pos     // vec3 color
        0.0f, -0.5f,    1.0f, 1.0f, 1.0f,
        0.5f,  0.5f,    0.0f, 1.0f, 0.0f,
        -0.5f,  0.5f,   0.0f, 0.0f, 1.0f
};
```

Run the program again and you should see the following:

![Triangle white](../../images/triangle_white.png)

In the next chapter we'll look at a different way to copy vertex data to a vertex buffer that results in better performance, but takes some more work.
