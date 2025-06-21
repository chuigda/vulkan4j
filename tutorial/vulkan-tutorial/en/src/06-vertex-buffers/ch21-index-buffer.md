# Index buffer

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part06/ch21/Main.java) | [C++ version](https://vulkan-tutorial.com/Vertex_buffers/Index_buffer)

## Introduction

The 3D meshes you'll be rendering in a real world application will often share vertices between multiple triangles. This already happens even with something simple like drawing a rectangle:

https://vulkan-tutorial.com/images/vertex_vs_index.svg

![Rectangle](../../images/vertex_vs_index_en.svg)

Drawing a rectangle takes two triangles, which means that we need a vertex buffer with 6 vertices. The problem is that the data of two vertices needs to be duplicated resulting in 50% redundancy. It only gets worse with more complex meshes, where vertices are reused in an average number of 3 triangles. The solution to this problem is to use an *index buffer*.

An index buffer is essentially an array of pointers into the vertex buffer. It allows you to reorder the vertex data, and reuse existing data for multiple vertices. The illustration above demonstrates what the index buffer would look like for the rectangle if we have a vertex buffer containing each of the four unique vertices. The first three indices define the upper-right triangle and the last three indices define the vertices for the bottom-left triangle.

## Index buffer creation

In this chapter we're going to modify the vertex data and add index data to draw a rectangle like the one in the illustration. Modify the vertex data to represent the four corners:

```java
private static final float[] VERTICES = {
        // vec2 pos     // vec3 color
        -0.5f, -0.5f,   1.0f, 0.0f, 0.0f,
        0.5f, -0.5f,    0.0f, 1.0f, 0.0f,
        0.5f, 0.5f,     0.0f, 0.0f, 1.0f,
        -0.5f, 0.5f,    1.0f, 1.0f, 1.0f
};
```

The top-left corner is red, top-right is green, bottom-right is blue and the bottom-left is white. We'll add a new array `INDICES` to represent the contents of the index buffer. It should match the indices in the illustration to draw the upper-right triangle and bottom-left triangle.

```java
private static final short[] INDICES = {
    0, 1, 2,
    2, 3, 0
};
```

It is possible to use either `short` or `int` for your index buffer, depending on the number of entries in vertices. We can stick to `short` for now because we're using less than `32767` unique vertices.

Just like the vertex data, the indices need to be uploaded into a `VkBuffer` for the GPU to be able to access them. Define two new class members to hold the resources for the index buffer:

```java
private VkBuffer indexBuffer;
private VkDeviceMemory indexBufferMemory;
```

The `createIndexBuffer` function that we'll add now is almost identical to `createVertexBuffer`:

```java
private void initVulkan() {
    // ...
    createVertexBuffer();
    createIndexBuffer();
    // ...
}

private void createIndexBuffer() {
    try (var arena = Arena.ofConfined()) {
        var bufferSize = INDICES.length * Short.BYTES;

        var pair = createBuffer(
                bufferSize,
                VkBufferUsageFlags.TRANSFER_SRC,
                VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
        );
        var stagingBuffer = pair.first;
        var stagingBufferMemory = pair.second;

        var ppData = PointerPtr.allocate(arena);
        var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, bufferSize, 0, ppData);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to map index buffer memory, vulkan error code: " + VkResult.explain(result));
        }
        var pData = ppData.read().reinterpret(bufferSize);

        pData.copyFrom(MemorySegment.ofArray(INDICES));

        deviceCommands.unmapMemory(device, stagingBufferMemory);

        pair = createBuffer(
                bufferSize,
                VkBufferUsageFlags.TRANSFER_DST | VkBufferUsageFlags.INDEX_BUFFER,
                VkMemoryPropertyFlags.DEVICE_LOCAL
        );
        indexBuffer = pair.first;
        indexBufferMemory = pair.second;

        copyBuffer(stagingBuffer, indexBuffer, bufferSize);

        deviceCommands.destroyBuffer(device, stagingBuffer, null);
        deviceCommands.freeMemory(device, stagingBufferMemory, null);
    }
}
```

There are only two notable differences. The `bufferSize` is now equal to the number of indices times the size of the index type, either `short` or `int`. The usage of the `indexBuffer` should be `VkBufferUsageFlags.INDEX_BUFFER` instead of `VkBufferUsageFlags.VERTEX_BUFFER`, which makes sense. Other than that, the process is exactly the same. We create a staging buffer to copy the contents of indices to and then copy it to the final device local index buffer.

The index buffer should be cleaned up at the end of the program, just like the vertex buffer:

```java
private void cleanup() {
    // ...
    deviceCommands.vkDestroyBuffer(device, indexBuffer, null);
    deviceCommands.vkFreeMemory(device, indexBufferMemory, null);
    // ...
}
```

## Using an index buffer

Using an index buffer for drawing involves two changes to `recordCommandBuffer`. We first need to bind the index buffer, just like we did for the vertex buffer. The difference is that you can only have a single index buffer. It's unfortunately not possible to use different indices for each vertex attribute, so we do still have to completely duplicate vertex data even if just one attribute varies.

```java
deviceCommands.cmdBindVertexBuffers(commandBuffer, 0, 1, vertexBuffers, offsets);
deviceCommands.cmdBindIndexBuffer(commandBuffer, indexBuffer, 0, VkIndexType.UINT16);
```

An index buffer is bound with `vkCmdBindIndexBuffer` which has the index buffer, a byte offset into it, and the type of index data as parameters. As mentioned before, the possible types are `VkIndexType.UINT16` and `VkIndexType.UINT32`.

Just binding an index buffer doesn't change anything yet, we also need to change the drawing command to tell Vulkan to use the index buffer. Remove the `VkDeviceCommands::cmdDraw` line and replace it with `VkDeviceCommands::cmdDrawIndexed`:

```java
deviceCommands.cmdDrawIndexed(commandBuffer, INDICES.length, 1, 0, 0, 0);
```

A call to this function is very similar to `VkDeviceCommands::cmdDraw`. The first two parameters specify the number of indices and the number of instances. We're not using instancing, so just specify `1` instance. The number of indices represents the number of vertices that will be passed to the vertex shader. The next parameter specifies an offset into the index buffer, using a value of `1` would cause the graphics card to start reading at the second index. The second to last parameter specifies an offset to add to the indices in the index buffer. The final parameter specifies an offset for instancing, which we're not using.

Now run your program and you should see the following:

![Indexed rectangle](../../images/indexed_rectangle.png)

You now know how to save memory by reusing vertices with index buffers. This will become especially important in a future chapter where we're going to load complex 3D models.

The previous chapter already mentioned that you should allocate multiple resources like buffers from a single memory allocation, but in fact you should go a step further. Driver developers recommend that you also store multiple buffers, like the vertex and index buffer, into a single `VkBuffer` and use offsets in commands like `VkDeviceCommands::cmdBindVertexBuffers`. The advantage is that your data is more cache friendly in that case, because it's closer together. It is even possible to reuse the same chunk of memory for multiple resources if they are not used during the same render operations, provided that their data is refreshed, of course. This is known as *aliasing* and some Vulkan functions have explicit flags to specify that you want to do this.
