# Command buffers

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part04/ch14/Main.java)

Commands in Vulkan, like drawing operations and memory transfers, are not executed directly using function calls. You have to record all the operations you want to perform in command buffer objects. The advantage of this is that when we are ready to tell the Vulkan what we want to do, all the commands are submitted together and Vulkan can more efficiently process the commands since all of them are available together. In addition, this allows command recording to happen in multiple threads if so desired.

## Command pools

We have to create a command pool before we can create command buffers. Command pools manage the memory that is used to store the buffers and command buffers are allocated from them. Add a new class member to store a `VkCommandPool`:

```java
private VkCommandPool commandPool;
```

Then create a new function `createCommandPool` and call it from `initVulkan` after the framebuffers were created.

```java
private void initVulkan() {
    // ...
    createCommandPool();
}

// ...

private void createCommandPool() {
}
```

Command pool creation only takes two parameters:

```java
private void createCommandPool() {
    try (var arena = Arena.ofConfined()) {
        var queueFamilyIndices = findQueueFamilies(physicalDevice);
        assert queueFamilyIndices != null;

        var poolInfo = VkCommandPoolCreateInfo.allocate(arena);
        poolInfo.flags(VkCommandPoolCreateFlags.RESET_COMMAND_BUFFER);
        poolInfo.queueFamilyIndex(queueFamilyIndices.graphicsFamily());
    }
}
```

There are two possible flags for command pools:

- `VkCommandPoolCreate.VK_COMMAND_POOL_CREATE_TRANSIENT`: Hint that command buffers are rerecorded with new commands very often (may change memory allocation behavior)
- `VkCommandPoolCreate.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER`: Allow command buffers to be rerecorded individually, without this flag they all have to be reset together

We will be recording a command buffer every frame, so we want to be able to reset and rerecord over it. Thus, we need to set the `VkCommandPoolCreate.RESET_COMMAND_BUFFER` flag bit for our command pool.

Command buffers are executed by submitting them on one of the device queues, like the graphics and presentation queues we retrieved. Each command pool can only allocate command buffers that are submitted on a single type of queue. We're going to record commands for drawing, which is why we've chosen the graphics queue family.

```java
var pCommandPool = VkCommandPool.Ptr.allocate(arena);
var result = deviceCommands.createCommandPool(device, poolInfo, null, pCommandPool);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create command pool, vulkan error code: " + VkResult.explain(result));
}
commandPool = Objects.requireNonNull(pCommandPool.read());
```

Finish creating the command pool using the `VkDeviceCommands::createCommandPool` function. It doesn't have any special parameters. Commands will be used throughout the program to draw things on the screen, so the pool should only be destroyed at the end:

```java
private void cleanup() {
    deviceCommands.destroyCommandPool(device, commandPool, null);
    // ...
}
```

## Command buffer allocation

We can now start allocating command buffers

Create a `VkCommandBuffer` object as a class member. Command buffers will be automatically freed when their command pool is destroyed, so we don't need explicit cleanup.

```java
private VkCommandBuffer commandBuffer;
```

We'll now start working on a `createCommandBuffer` function to allocate a single command buffer from the command pool.

```java
private void initVulkan() {
    // ...
    createCommandBuffer();
}

// ...

private void createCommandBuffer() {
}
```

Command buffers are allocated with the `VkDeviceCommands::allocateCommandBuffers` function, which takes a `VkCommandBufferAllocateInfo` struct as parameter that specifies the command pool and number of buffers to allocate:

```java
try (var arena = Arena.ofConfined()) {
    var allocInfo = VkCommandBufferAllocateInfo.allocate(arena);
    allocInfo.commandPool(commandPool);
    allocInfo.level(VkCommandBufferLevel.PRIMARY);
    allocInfo.commandBufferCount(1);

    var pCommandBuffer = VkCommandBuffer.Ptr.allocate(arena);
    var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
    if (result != VkResult.SUCCESS) {
        throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
    }
    commandBuffer = Objects.requireNonNull(pCommandBuffer.read());
}
```

The `level` parameter specifies if the allocated command buffers are primary or secondary command buffers.

- `VkCommandBufferLevel.PRIMARY`: Can be submitted to a queue for execution, but cannot be called from other command buffers.
- `VkCommandBufferLevel.SECONDARY`: Cannot be submitted directly, but can be called from primary command buffers.

We won't make use of the secondary command buffer functionality here, but you can imagine that it's helpful to reuse common operations from primary command buffers.

Since we are only allocating one command buffer, the `commandBufferCount` parameter is just one.

## Command buffer recording

We'll now start working on the `recordCommandBuffer` function that writes the commands we want to execute into a command buffer. The `VkCommandBuffer` used will be passed in as a parameter, as well as the index of the current swapchain image we want to write to.

```java
private void recordCommandBuffer(VkCommandBuffer commandBuffer, int imageIndex) {
}
```

We always begin recording a command buffer by calling `VkDeviceCommands::beginCommandBuffer` with a small `VkCommandBufferBeginInfo` structure as argument that specifies some details about the usage of this specific command buffer.

```java
try (var arena = Arena.ofConfined()) {
    var beginInfo = VkCommandBufferBeginInfo.allocate(arena);
    beginInfo.flags(0); // Optional
    beginInfo.pInheritanceInfo(null); // Optional

    var result = deviceCommands.beginCommandBuffer(commandBuffer, beginInfo);
    if (result != VkResult.SUCCESS) {
        throw new RuntimeException("Failed to begin recording command buffer, vulkan error code: " + VkResult.explain(result));
    }
}
```

The flags parameter specifies how we're going to use the command buffer. The following values are available:

- `VkCommandBufferUsage.ONE_TIME_SUBMIT`: The command buffer will be rerecorded right after executing it once.
- `VkCommandBufferUsage.RENDER_PASS_CONTINUE`: This is a secondary command buffer that will be entirely within a single render pass.
- `VkCommandBufferUsage.SIMULTANEOUS_USE`: The command buffer can be resubmitted while it is also already pending execution.

None of these flags are applicable for us right now.

The `pInheritanceInfo` parameter is only relevant for secondary command buffers. It specifies which state to inherit from the calling primary command buffers.

If the command buffer was already recorded once, then a call to `beginCommandBuffer` will implicitly reset it. It's not possible to append commands to a buffer at a later time.

## Starting a render pass

Drawing starts by beginning the render pass with `DeviceCommands::cmdBeginRenderPass`. The render pass is configured using some parameters in a `VkRenderPassBeginInfo` struct.

```java
var renderPassInfo = VkRenderPassBeginInfo.allocate(arena);
renderPassInfo.renderPass(renderPass);
renderPassInfo.framebuffer(swapChainFramebuffers.read(imageIndex));
```

The first two fields are the render pass itself and the attachments to bind. We created a framebuffer for each swap chain image where it is specified as a color attachment. Thus we need to bind the framebuffer for the swapchain image we want to draw to. Using the `imageIndex` parameter which was passed in, we can pick the right framebuffer for the current swapchain image.

```java
renderPassInfo.renderArea().offset().x(0);
renderPassInfo.renderArea().offset().y(0);
renderPassInfo.renderArea().extent(swapChainExtent);
```

The next two fields define the size of the render area. The render area defines where shader loads and stores will take place. The pixels outside this region will have undefined values. It should match the size of the attachments for best performance.

```java
renderPassInfo.clearValueCount(1);
var pClearValue = VkClearValue.allocate(arena);
pClearValue.color().float32().write(0, 0.0f);
pClearValue.color().float32().write(1, 0.0f);
pClearValue.color().float32().write(2, 0.0f);
pClearValue.color().float32().write(3, 1.0f);
renderPassInfo.pClearValues(pClearValue);
```

The last two parameters define the clear values to use for `VkAttachmentLoadOp.CLEAR`, which we used as load operation for the color attachment. I've defined the clear color to simply be black with 100% opacity.

```java
ddeviceCommands.cmdBeginRenderPass(commandBuffer, renderPassInfo, VkSubpassContents.INLINE);
```

The render pass can now begin. All the functions that record commands can be recognized by their `cmd` prefix. They all return `void`, so there will be no error handling until we've finished recording.

The first parameter for every command is always the command buffer to record the command to. The second parameter specifies the details of the render pass we've just provided. The final parameter controls how the drawing commands within the render pass will be provided. It can have one of two values:

- `VkSubspassContents.INLINE`: The render pass commands will be embedded in the primary command buffer itself and no secondary command buffers will be executed.
- `VkSubspassContents.SECONDARY_COMMAND_BUFFERS`: The render pass commands will be executed from secondary command buffers.

We will not be using secondary command buffers, so we'll go with the first option.

## Basic drawing commands

We can now bind the graphics pipeline:

```java
deviceCommands.cmdBindPipeline(commandBuffer, VkPipelineBindPoint.GRAPHICS, graphicsPipeline);
```

The second parameter specifies if the pipeline object is a graphics or compute pipeline. We've now told Vulkan which operations to execute in the graphics pipeline and which attachment to use in the fragment shader.

As noted in the [fixed functions chapter](../pipeline/fixed-functions.md), we did specify viewport and scissor state for this pipeline to be dynamic. So we need to set them in the command buffer before issuing our draw command:

```java
var viewport = VkViewport.allocate(arena);
viewport.x(0.0f);
viewport.y(0.0f);
viewport.width(swapChainExtent.width());
viewport.height(swapChainExtent.height());
viewport.minDepth(0.0f);
viewport.maxDepth(1.0f);
deviceCommands.cmdSetViewport(commandBuffer, 0, 1, viewport);

var scissor = VkRect2D.allocate(arena);
scissor.offset().x(0);
scissor.offset().y(0);
scissor.extent(swapChainExtent);
deviceCommands.cmdSetScissor(commandBuffer, 0, 1, scissor);
```

Now we are ready to issue the draw command for the triangle:

```java
deviceCommands.cmdDraw(commandBuffer, 3, 1, 0, 0);
```

The actual `VkDeviceCommands::cmdDraw` function call is a bit anticlimactic, but it's so simple because of all the information we specified in advance. It has the following parameters, aside from the command buffer:

- `vertexCount`: Even though we don't have a vertex buffer, we technically still have 3 vertices to draw.
- `instanceCount`: Used for instanced rendering, use `1` if you're not doing that.
- `firstVertex`: Used as an offset into the vertex buffer, defines the lowest value of `gl_VertexIndex`.
- `firstInstance`: Used as an offset for instanced rendering, defines the lowest value of `gl_InstanceIndex`.

## Finishing up

The render pass can now be ended:

```java
deviceCommands.cmdEndRenderPass(commandBuffer);
```

And we've finished recording the command buffer:

```java
result = deviceCommands.endCommandBuffer(commandBuffer);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to end recording command buffer, vulkan error code: " + VkResult.explain(result));
}
```

In the next chapter we'll write the code for the main loop, which will acquire an image from the swap chain, record and execute a command buffer, then return the finished image to the swap chain.
