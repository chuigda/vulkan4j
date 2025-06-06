# Frames in flight

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/packages/tutorial/src/main/java/tutorial/vulkan/part04/ch16/Main.java) | [C++ version](https://vulkan-tutorial.com/Drawing_a_triangle/Drawing/Frames_in_flight)

> About `VUID-vkQueueSubmit-pSignalSemaphores-00067`:
> 
> When I was creating this Java version tutorial, a recent Vulkan Validation Layer (VVL) was released, and exposed the problem that most Vulkan tutorials (including original vulkan-tutorial.com, vkguide.dev, and other derivative works) have been using semaphores **incorrectly** to synchronize between rendering and presentation. Till this message was written, the original tutorial has not been updated to fix the issue. However, the issue is fixed in this Java version (though wording has not been fully adjusted), so you may see some differences in the code compared to the original tutorial.
> 
> Also, since the size `pRenderFinishedSemaphores` is now bound with `swapChainImages.size()`, swap chain recreation will also be slightly different with the original tutorial. So the code in the following chapaters will also have some differences compared to the original tutorial.
> 
> For more information, checkout [this issue](https://github.com/Overv/VulkanTutorial/issues/407). Feel free to contribute to this and other Vulkan tutorials to fix the issue.

Right now our render loop has one glaring flaw. We are required to wait on the previous frame to finish before we can start rendering the next which results in unnecessary idling of the host.

The way to fix this is to allow multiple frames to be *in-flight* at once, that is to say, allow the rendering of one frame to not interfere with the recording of the next. How do we do this? Any resource that is accessed and modified during rendering must be duplicated. Thus, we need multiple command buffers, semaphores, and fences. In later chapters we will also add multiple instances of other resources, so we will see this concept reappear.

Start by adding a constant at the top of the program that defines how many frames should be processed concurrently:

```java
private static final int MAX_FRAMES_IN_FLIGHT = 2;
```

We choose the number 2 because we don't want the CPU to get *too* far ahead of the GPU. With 2 frames in flight, the CPU and the GPU can be working on their own tasks at the same time. If the CPU finishes early, it will wait till the GPU finishes rendering before submitting more work. With 3 or more frames in flight, the CPU could get ahead of the GPU, adding frames of latency. Generally, extra latency isn't desired. But giving the application control over the number of frames in flight is another example of Vulkan being explicit.

Each frame should have its own command buffer, set of semaphores, and fence. Rename and then change them to array of objects:

```java
private VkCommandBuffer.Ptr pCommandBuffers;
private VkSemaphore.Ptr pImageAvailableSemaphores;
private VkSemaphore.Ptr pRenderFinishedSemaphores;
private VkFence.Ptr pInFlightFences;
```

Then we need to create multiple command buffers. Rename `createCommandBuffer` to `createCommandBuffers`. Next we need to alter the `VkCommandBufferAllocateInfo` to create many command buffers:

```java
private void createCommandBuffers() {
    pCommandBuffers = VkCommandBuffer.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);

    try (var arena = Arena.ofConfined()) {
        var allocInfo = VkCommandBufferAllocateInfo.allocate(arena)
                .commandPool(commandPool)
                .level(VkCommandBufferLevel.PRIMARY)
                .commandBufferCount(1);

        for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
            var pCommandBuffer = pCommandBuffers.offset(i);
            var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
            }
        }
    }
}
```

<!-- TODO: precisely explain why `swapChainImages.size()` semaphores are required here.
Previous tutorial often uses `MAX_FRAMES_IN_FLIGHT` semaphores and use `currentFrame` to index into
them. But most recent VVL complains about that, discovering that all previous tutorials and code
are incorrect.
-->

The `createSyncObjects` function should be changed to create all the objects:

```java
private void createSyncObjects() {
    pImageAvailableSemaphores = VkSemaphore.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
    pInFlightFences = VkFence.Ptr.allocate(Arena.ofAuto(), MAX_FRAMES_IN_FLIGHT);
    pRenderFinishedSemaphores = VkSemaphore.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());

    try (var arena = Arena.ofConfined()) {
        var semaphoreInfo = VkSemaphoreCreateInfo.allocate(arena);
        var fenceCreateInfo = VkFenceCreateInfo.allocate(arena);
        fenceCreateInfo.flags(VkFenceCreateFlags.SIGNALED);

        for (int i = 0; i < MAX_FRAMES_IN_FLIGHT; i++) {
            var pImageAvailableSemaphore = pImageAvailableSemaphores.offset(i);
            var pInFlightFence = pInFlightFences.offset(i);

            if (deviceCommands.createSemaphore(device, semaphoreInfo, null, pImageAvailableSemaphore) != VkResult.SUCCESS
                || deviceCommands.createFence(device, fenceCreateInfo, null, pInFlightFence) != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create synchronization objects for a frame");
            }
        }

        for (int i = 0; i < swapChainImages.size(); i++) {
            var pRenderFinishedSemaphore = pRenderFinishedSemaphores.offset(i);
            if (deviceCommands.createSemaphore(device, semaphoreInfo, null, pRenderFinishedSemaphore) != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create render finished semaphore for swap chain image " + i);
            }
        }
    }
}
```

Similarly, they should also all be cleaned up:

```java
private void cleanup() {
    for (var semaphore : pImageAvailableSemaphores) {
        deviceCommands.destroySemaphore(device, semaphore, null);
    }
    for (var semaphore : pRenderFinishedSemaphores) {
        deviceCommands.destroySemaphore(device, semaphore, null);
    }
    for (var fence : pInFlightFences) {
        deviceCommands.destroyFence(device, fence, null);
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
    var pInFlightFence = pInFlightFences.offset(currentFrame);
    var pImageAvailableSemaphore = pImageAvailableSemaphores.offset(currentFrame);
    var inFlightFence = pInFlightFence.read();
    var imageAvailableSemaphore = pImageAvailableSemaphore.read();
    var commandBuffer = pCommandBuffers.read(currentFrame);
    // ...

    var imageIndex = pImageIndex.read();
    var pRenderFinishedSemaphore = pRenderFinishedSemaphores.offset(imageIndex);
}
```

Of course, we shouldn't forget to advance to the next frame every time:

```java
private void drawFrame() {
    // ...

    currentFrame = (currentFrame + 1) % MAX_FRAMES_IN_FLIGHT;
}
```

By using the modulo (%) operator, we ensure that the frame index loops around after every `MAX_FRAMES_IN_FLIGHT` enqueued frames.

We've now implemented all the needed synchronization to ensure that there are no more than `MAX_FRAMES_IN_FLIGHT` frames of work enqueued and that these frames are not stepping over each other. Note that it is fine for other parts of the code, like the final cleanup, to rely on more rough synchronization like `VkDeviceCommands::deviceWaitIdle`. You should decide on which approach to use based on performance requirements.

To learn more about synchronization through examples, have a look at [this extensive overview](https://github.com/KhronosGroup/Vulkan-Docs/wiki/Synchronization-Examples#swapchain-image-acquire-and-present) by Khronos.

In the next chapter we'll deal with one more small thing that is required for a well-behaved Vulkan program.
