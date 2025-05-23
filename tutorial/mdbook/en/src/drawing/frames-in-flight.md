# Frames in flight

Right now our render loop has one glaring flaw. We are required to wait on the previous frame to finish before we can start rendering the next which results in unnecessary idling of the host.

The way to fix this is to allow multiple frames to be *in-flight* at once, that is to say, allow the rendering of one frame to not interfere with the recording of the next. How do we do this? Any resource that is accessed and modified during rendering must be duplicated. Thus, we need multiple command buffers, semaphores, and fences. In later chapters we will also add multiple instances of other resources, so we will see this concept reappear.

Start by adding a constant at the top of the program that defines how many frames should be processed concurrently:

```java
private static final int MAX_FRAMES_IN_FLIGHT = 2;
```

We choose the number 2 because we don't want the CPU to get *too* far ahead of the GPU. With 2 frames in flight, the CPU and the GPU can be working on their own tasks at the same time. If the CPU finishes early, it will wait till the GPU finishes rendering before submitting more work. With 3 or more frames in flight, the CPU could get ahead of the GPU, adding frames of latency. Generally, extra latency isn't desired. But giving the application control over the number of frames in flight is another example of Vulkan being explicit.

Each frame should have its own command buffer, set of semaphores, and fence. Rename and then change them to array of objects:

```java
private VkCommandBuffer[] commandBuffers;
private VkSemaphore[] imageAvailableSemaphores;
private VkSemaphore[] renderFinishedSemaphores;
private VkFence[] inFlightFences;
```

Then we need to create multiple command buffers. Rename `createCommandBuffer` to `createCommandBuffers`. Next we need to alter the `VkCommandBufferAllocateInfo` to create many command buffers:

```java
private void createCommandBuffers() {
    try (var arena = Arena.ofConfined()) {
        var allocInfo = VkCommandBufferAllocateInfo.allocate(arena);
        allocInfo.commandPool(commandPool);
        allocInfo.level(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
        allocInfo.commandBufferCount(MAX_FRAMES_IN_FLIGHT);

        var pCommandBuffers = VkCommandBuffer.Buffer.allocate(arena, MAX_FRAMES_IN_FLIGHT);
        var result = deviceCommands.vkAllocateCommandBuffers(device, allocInfo, pCommandBuffers);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
        }
        commandBuffers = pCommandBuffers.readAll();
    }
}
```

The `createSyncObjects` function should be changed to create all the objects:

```java
private void createSyncObjects() {
    try (var arena = Arena.ofConfined()) {
        var semaphoreInfo = VkSemaphoreCreateInfo.allocate(arena);
        var fenceCreateInfo = VkFenceCreateInfo.allocate(arena);
        fenceCreateInfo.flags(VkFenceCreateFlags.VK_FENCE_CREATE_SIGNALED_BIT);

        var pImageAvailableSemaphore = VkSemaphore.Buffer.allocate(arena);
        var pRenderFinishedSemaphore = VkSemaphore.Buffer.allocate(arena);
        var pInFlightFence = VkFence.Buffer.allocate(arena);

        imageAvailableSemaphores = new VkSemaphore[MAX_FRAMES_IN_FLIGHT];
        renderFinishedSemaphores = new VkSemaphore[MAX_FRAMES_IN_FLIGHT];
        inFlightFences = new VkFence[MAX_FRAMES_IN_FLIGHT];

        for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
            if (deviceCommands.vkCreateSemaphore(device, semaphoreInfo, null, pImageAvailableSemaphore) != VkResult.VK_SUCCESS ||
                    deviceCommands.vkCreateSemaphore(device, semaphoreInfo, null, pRenderFinishedSemaphore) != VkResult.VK_SUCCESS ||
                    deviceCommands.vkCreateFence(device, fenceCreateInfo, null, pInFlightFence) != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create synchronization objects");
            }

            imageAvailableSemaphores[i] = pImageAvailableSemaphore.read();
            renderFinishedSemaphores[i] = pRenderFinishedSemaphore.read();
            inFlightFences[i] = pInFlightFence.read();
        }
    }
}
```

Similarly, they should also all be cleaned up:

```java
private void cleanup() {
    for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
        deviceCommands.vkDestroySemaphore(device, renderFinishedSemaphores[i], null);
        deviceCommands.vkDestroySemaphore(device, imageAvailableSemaphores[i], null);
        deviceCommands.vkDestroyFence(device, inFlightFences[i], null);
    }

    // ...
}
```

Remember, because command buffers are freed for us when we free the command pool, there is nothing extra to do for command buffer cleanup.

To use the right objects every frame, we need to keep track of the current frame. We will use a frame index for that purpose:

```java
private int currentFrame = 0;
```

The `drawFrame` function can now be modified to use the right objects:

```java
private void drawFrame() {
    var inFlightFence = inFlightFences[currentFrame];
    var imageAvailableSemaphore = imageAvailableSemaphores[currentFrame];
    var renderFinishedSemaphore = renderFinishedSemaphores[currentFrame];
    var commandBuffer = commandBuffers[currentFrame];
    // ...
}
```

Of course, we shouldn't forget to advance to the next frame every time:

```java
private void drawFrame() {
    // ...
    currentFrame = (currentFrame + 1) % MAX_FRAMES_IN_FLIGHT;
}
```

By using the modulo (%) operator, we ensure that the frame index loops around after every MAX_FRAMES_IN_FLIGHT enqueued frames.

We've now implemented all the needed synchronization to ensure that there are no more than `MAX_FRAMES_IN_FLIGHT` frames of work enqueued and that these frames are not stepping over eachother. Note that it is fine for other parts of the code, like the final cleanup, to rely on more rough synchronization like `vkDeviceWaitIdle`. You should decide on which approach to use based on performance requirements.

To learn more about synchronization through examples, have a look at [this extensive overview](https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples#swapchain-image-acquire-and-present) by Khronos.

In the next chapter we'll deal with one more small thing that is required for a well-behaved Vulkan program.
