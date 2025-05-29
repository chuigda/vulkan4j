# Staging buffer

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part06/ch20/Main.java) | [C++ version](https://vulkan-tutorial.com/Vertex_buffers/Staging_buffer)

## Introduction

The vertex buffer we have right now works correctly, but the memory type that allows us to access it from the CPU may not be the most optimal memory type for the graphics card itself to read from. The most optimal memory has the `VkMemoryPropertyFlags.DEVICE_LOCAL` flag and is usually not accessible by the CPU on dedicated graphics cards. In this chapter we're going to create two vertex buffers. One staging buffer in CPU accessible memory to upload the data from the vertex array to, and the final vertex buffer in device local memory. We'll then use a buffer copy command to move the data from the staging buffer to the actual vertex buffer.

## Transfer queue

The buffer copy command requires a queue family that supports transfer operations, which is indicated using `VkQueueFlags.TRANSFER`. The good news is that any queue family with `VkQueueFlags.GRAPHICS` or `VkQueueFlags.COMPUTE` capabilities already implicitly support `VkQueueFlags.TRANSFER` operations. The implementation is not required to explicitly list it in `queueFlags` in those cases.

If you like a challenge, then you can still try to use a different queue family specifically for transfer operations. It will require you to make the following modifications to your program:

- Modify `QueueFamilyIndices` and `findQueueFamilies` to explicitly look for a queue family with the `VkQueueFlags.TRANSFER` bit, but not the `VkQueueFlags.GRAPHICS`.
- Modify `createLogicalDevice` to request a handle to the transfer queue
- Create a second command pool for command buffers that are submitted on the transfer queue family
- Change the sharingMode of resources to be `VkSharingMode.CONCURRENT` and specify both the graphics and transfer queue families
- Submit any transfer commands like `VkDeviceCommands::cmdCopyBuffer` (which we'll be using in this chapter) to the transfer queue instead of the graphics queue

It's a bit of work, but it'll teach you a lot about how resources are shared between queue families.

## Abstracting buffer creation

Because we're going to create multiple buffers in this chapter, it's a good idea to move buffer creation to a helper function. Create a new function `createBuffer` and move the code in `createVertexBuffer` (except mapping) to it.

```java
private record Pair<T1, T2>(T1 first, T2 second) {}

private Pair<VkBuffer, VkDeviceMemory> createBuffer(
        int size,
        @EnumType(VkBufferUsageFlags.class) int usage,
        @EnumType(VkMemoryPropertyFlags.class) int properties
) {
    try (var arena = Arena.ofConfined()) {
        var bufferInfo = VkBufferCreateInfo.allocate(arena);
        bufferInfo.size(size);
        bufferInfo.usage(usage);
        bufferInfo.sharingMode(VkSharingMode.EXCLUSIVE);

        var pBuffer = VkBuffer.Ptr.allocate(arena);
        var result = deviceCommands.createBuffer(device, bufferInfo, null, pBuffer);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to create vertex buffer, vulkan error code: " + VkResult.explain(result));
        }
        var buffer = pBuffer.read();

        var memRequirements = VkMemoryRequirements.allocate(arena);
        deviceCommands.getBufferMemoryRequirements(device, buffer, memRequirements);

        var allocInfo = VkMemoryAllocateInfo.allocate(arena);
        allocInfo.allocationSize(memRequirements.size());
        allocInfo.memoryTypeIndex(findMemoryType(memRequirements.memoryTypeBits(), properties));
        var pMemory = VkDeviceMemory.Ptr.allocate(arena);
        result = deviceCommands.allocateMemory(device, allocInfo, null, pMemory);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to allocate vertex buffer memory, vulkan error code: " + VkResult.explain(result));
        }
        var memory = pMemory.read();

        deviceCommands.bindBufferMemory(device, buffer, memory, 0);
        return new Pair<>(buffer, memory);
    }
}
```

Make sure to add parameters for the buffer size, memory properties and usage so that we can use this function to create many different types of buffers. The last two parameters are output variables to write the handles to.

You can now remove the buffer creation and memory allocation code from `createVertexBuffer` and just call `createBuffer` instead:

```java
private void createVertexBuffer() {
    try (var arena = Arena.ofConfined()) {
        var bufferSize = VERTICES.length * Float.BYTES;

        var pair = createBuffer(
                bufferSize,
                VkBufferUsageFlags.VERTEX_BUFFER,
                VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
        );
        vertexBuffer = pair.first();
        vertexBufferMemory = pair.second();

        var ppData = PointerPtr.allocate(arena);
        var result = deviceCommands.mapMemory(device, vertexBufferMemory, 0, bufferSize, 0, ppData);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to map vertex buffer memory, vulkan error code: " + VkResult.explain(result));
        }
        var pData = ppData.read().reinterpret(bufferSize);
        pData.copyFrom(MemorySegment.ofArray(VERTICES));
        deviceCommands.unmapMemory(device, vertexBufferMemory);
    }
}
```

Run your program to make sure that the vertex buffer still works properly.

## Using a staging buffer

We're now going to change `createVertexBuffer` to only use a host visible buffer as temporary buffer and use a device local one as actual vertex buffer.

```java
    private void createVertexBuffer() {
    try (var arena = Arena.ofConfined()) {
        var bufferSize = VERTICES.length * Float.BYTES;

        var pair = createBuffer(
                bufferSize,
                VkBufferUsageFlags.TRANSFER_SRC,
                VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
        );
        var stagingBuffer = pair.first;
        var stagingBufferMemory = pair.second;

        var ppData = PointerPtr.allocate(arena);
        var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, bufferSize, 0, ppData.segment());
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to map vertex buffer memory, vulkan error code: " + VkResult.explain(result));
        }
        var pData = ppData.read().reinterpret(bufferSize);
        pData.copyFrom(MemorySegment.ofArray(VERTICES));
        deviceCommands.unmapMemory(device, stagingBufferMemory);

        pair = createBuffer(
                bufferSize,
                VkBufferUsageFlags.TRANSFER_DST | VkBufferUsageFlags.VERTEX_BUFFER,
                VkMemoryPropertyFlags.DEVICE_LOCAL
        );
        vertexBuffer = pair.first;
        vertexBufferMemory = pair.second;
    }
}
```

We're now using a new `stagingBuffer` with `stagingBufferMemory` for mapping and copying the vertex data. In this chapter we're going to use two new buffer usage flags:

- `VkBufferUsageFlags.TRANSFER_SRC`: Buffer can be used as source in a memory transfer operation.
- `VkBufferUsageFlags.TRANSFER_DST`: Buffer can be used as destination in a memory transfer operation.

The `vertexBuffer` is now allocated from a memory type that is device local, which generally means that we're not able to use `VkDeviceCommands::mapMemory`. However, we can copy data from the `stagingBuffer` to the `vertexBuffer`. We have to indicate that we intend to do that by specifying the transfer source flag for the `stagingBuffer` and the transfer destination flag for the `vertexBuffer`, along with the vertex buffer usage flag.

We're now going to write a function to copy the contents from one buffer to another, called `copyBuffer`.

```java
private void copyBuffer(VkBuffer srcBuffer, VkBuffer dstBuffer, int size) {
}
```

Memory transfer operations are executed using command buffers, just like drawing commands. Therefore, we must first allocate a temporary command buffer. You may wish to create a separate command pool for these kinds of short-lived buffers, because the implementation may be able to apply memory allocation optimizations. You should use the `VkCommandPoolCreateFlags.TRANSIENT` flag during command pool generation in that case.

```java
private void copyBuffer(VkBuffer srcBuffer, VkBuffer dstBuffer, int size) {
    try (var arena = Arena.ofConfined()) {
        var allocInfo = VkCommandBufferAllocateInfo.allocate(arena);
        allocInfo.level(VkCommandBufferLevel.PRIMARY);
        allocInfo.commandPool(commandPool);
        allocInfo.commandBufferCount(1);

        var pCommandBuffer = VkCommandBuffer.Ptr.allocate(arena);
        var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
        }
        var commandBuffer = Objects.requireNonNull(pCommandBuffer.read());
    }
}
```

And immediately start recording the command buffer:

```java
var beginInfo = VkCommandBufferBeginInfo.allocate(arena);
beginInfo.flags(VkCommandBufferUsageFlags.ONE_TIME_SUBMIT);
result = deviceCommands.beginCommandBuffer(commandBuffer, beginInfo);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to begin recording command buffer, vulkan error code: " + VkResult.explain(result));
}
```

We're only going to use the command buffer once and wait with returning from the function until the copy operation has finished executing. It's good practice to tell the driver about our intent using `VkCommandBufferUsageFlags.ONE_TIME_SUBMIT`.

```java
var copyRegion = VkBufferCopy.allocate(arena);
copyRegion.srcOffset(0); // Optional
copyRegion.dstOffset(0); // Optional
copyRegion.size(size);
deviceCommands.cmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, 1, copyRegion);
```

Contents of buffers are transferred using the `VkDeviceCommands::cmdCopyBuffer` command. It takes the source and destination buffers as arguments, and an array of regions to copy. The regions are defined in `VkBufferCopy` structs and consist of a source buffer offset, destination buffer offset and size. It is not possible to specify `VkConstants.WHOLE_SIZE` here, unlike the `VkDeviceCommands::mapMemory` command.

```java
result = deviceCommands.endCommandBuffer(commandBuffer);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to end recording command buffer, vulkan error code: " + VkResult.explain(result));
}
```

This command buffer only contains the copy command, so we can stop recording right after that. Now execute the command buffer to complete the transfer:

```java
var submitInfo = VkSubmitInfo.allocate(arena);
submitInfo.commandBufferCount(1);
submitInfo.pCommandBuffers(pCommandBuffer);

result = deviceCommands.queueSubmit(graphicsQueue, 1, submitInfo, null);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to submit copy command buffer, vulkan error code: " + VkResult.explain(result));
}
deviceCommands.queueWaitIdle(graphicsQueue);
```

Unlike the draw commands, there are no events we need to wait on this time. We just want to execute the transfer on the buffers immediately. There are again two possible ways to wait on this transfer to complete. We could use a fence and wait with `DeviceCommands::waitForFences`, or simply wait for the transfer queue to become idle with `DeviceCommands::queueWaitIdle`. A fence would allow you to schedule multiple transfers simultaneously and wait for all of them complete, instead of executing one at a time. That may give the driver more opportunities to optimize.

```java
deviceCommands.freeCommandBuffers(device, commandPool, 1, pCommandBuffer);
```

Don't forget to clean up the command buffer used for the transfer operation.

We can now call `copyBuffer` from the `createVertexBuffer` function to move the vertex data to the device local buffer:

```java
copyBuffer(stagingBuffer, vertexBuffer, bufferSize);
```

After copying the data from the staging buffer to the device buffer, we should clean it up:

```java
deviceCommands.destroyBuffer(device, stagingBuffer, null);
deviceCommands.freeMemory(device, stagingBufferMemory, null);
```

Run your program to verify that you're seeing the familiar triangle again. The improvement may not be visible right now, but its vertex data is now being loaded from high performance memory. This will matter when we're going to start rendering more complex geometry.

## Conclusion

It should be noted that in a real world application, you're not supposed to actually call `DeviceCommands::allocateMemory` for every individual buffer. The maximum number of simultaneous memory allocations is limited by the `maxMemoryAllocationCount` physical device limit, which may be as low as `4096` even on high-end hardware like an `NVIDIA GTX 1080`. The right way to allocate memory for a large number of objects at the same time is to create a custom allocator that splits up a single allocation among many different objects by using the `offset` parameters that we've seen in many functions.

You can either implement such an allocator yourself, or use the [VulkanMemoryAllocator](https://github.com/GPUOpen-LibrariesAndSDKs/VulkanMemoryAllocator) library provided by the GPUOpen initiative. However, for this tutorial it's okay to use a separate allocation for every resource, because we won't come close to hitting any of these limits for now.
