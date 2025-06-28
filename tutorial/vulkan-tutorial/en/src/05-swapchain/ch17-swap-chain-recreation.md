# Swap chain recreation

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part05/ch17/Main.java) | [C++ version](https://vulkan-tutorial.com/Drawing_a_triangle/Swap_chain_recreation)

## Introduction

The application we have now successfully draws a triangle, but there are some circumstances that it isn't handling properly yet. It is possible for the window surface to change such that the swap chain is no longer compatible with it. One of the reasons that could cause this to happen is the size of the window changing. We have to catch these events and recreate the swap chain.

## Recreating the swap chain

As we've seen in the previous chapter, the `pRenderFinishedSemaphores` synchronization objects are relevant with swapchain setup, so when recreating swapchain, we should also recreate them. We need to extract its creation out from `createSyncObjects`:

```java
private void createSyncObjects() {
    // ...
    createSwapchainSyncObjects();
}

private void createSwapchainSyncObjects() {
    pRenderFinishedSemaphores = VkSemaphore.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());
    try (var arena = Arena.ofConfined()) {
        var semaphoreInfo = VkSemaphoreCreateInfo.allocate(arena);
        for (int i = 0; i < swapChainImages.size(); i++) {
            var pRenderFinishedSemaphore = pRenderFinishedSemaphores.offset(i);
            if (deviceCommands.createSemaphore(device, semaphoreInfo, null, pRenderFinishedSemaphore) != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create render finished semaphore for swap chain image " + i);
            }
        }
    }
}
```

Create a new `recreateSwapChain` function that calls `createSwapChain` and all the creation functions for the objects that depend on the swap chain or the window size.

```java
private void recreateSwapChain() {
    deviceCommands.vkDeviceWaitIdle(device);

    createSwapchain();
    createImageViews();
    createFramebuffers();
    createSwapchainSyncObjects();
}
```

We first call `VkDeviceCommands::deviceWaitIdle`, because just like in the last chapter, we shouldn't touch resources that may still be in use. Obviously, we'll have to recreate the swap chain itself. The image views need to be recreated because they are based directly on the swap chain images. Finally, the framebuffers directly depend on the swap chain images, and thus must be recreated as well.

To make sure that the old versions of these objects are cleaned up before recreating them, we should move some of the cleanup code to a separate function that we can call from the `recreateSwapChain` function. Let's call it `cleanupSwapChain`:

```java
private void recreateSwapChain() {
    deviceCommands.vkDeviceWaitIdle(device);

    cleanupSwapChain();

    createSwapChain();
    createImageViews();
    createFramebuffers();
}

private void cleanupSwapChain() {
}
```

Note that we don't recreate the renderpass here for simplicity. In theory it can be possible for the swap chain image format to change during an applications' lifetime, e.g. when moving a window from an standard range to an high dynamic range monitor. This may require the application to recreate the renderpass to make sure the change between dynamic ranges is properly reflected.

We'll move the cleanup code of all objects that are recreated as part of a swap chain refresh from `cleanup` to `cleanupSwapChain`:

```java
private void cleanupSwapChain() {
    for (var framebuffer : swapChainFramebuffers) {
        deviceCommands.destroyFramebuffer(device, framebuffer, null);
    }
    for (var imageView : swapChainImageViews) {
        deviceCommands.destroyImageView(device, imageView, null);
    }
    for (var semaphore : pRenderFinishedSemaphores) {
        deviceCommands.destroySemaphore(device, semaphore, null);
    }
    deviceCommands.destroySwapchainKHR(device, swapChain, null);
}

private void cleanup() {
    // ...
    cleanupSwapChain();
    deviceCommands.vkDestroyPipeline(device, graphicsPipeline, null);
    // ...
}
```

Note that in `chooseSwapExtent` we already query the new window resolution to make sure that the swap chain images have the (new) right size, so there's no need to modify `chooseSwapExtent` (remember that we already had to use `GLFW::getFramebufferSize` get the resolution of the surface in pixels when creating the swap chain).

That's all it takes to recreate the swap chain! However, the disadvantage of this approach is that we need to stop all rendering before creating the new swap chain. It is possible to create a new swap chain while drawing commands on an image from the old swap chain are still in-flight. You need to pass the previous swap chain to the `oldSwapChain` field in the `VkSwapchainCreateInfoKHR` struct and destroy the old swap chain as soon as you've finished using it.

## Suboptimal or out-of-date swap chain

Now we just need to figure out when swap chain recreation is necessary and call our new `recreateSwapChain` function. Luckily, Vulkan will usually just tell us that the swap chain is no longer adequate during presentation. The `VkDeviceCommands::acquireNextImageKHR` and `VkDeviceCommands::queuePresentKHR` functions can return the following special values to indicate this.

- `VkResult.ERROR_OUT_OF_DATE_KHR`: The swap chain has become incompatible with the surface and can no longer be used for rendering. Usually happens after a window resize.
- `VkResult.VK_SUBOPTIMAL_KHR`: The swap chain can still be used to successfully present to the surface, but the surface properties are no longer matched exactly.

```java
var result = deviceCommands.acquireNextImageKHR(
        device,
        swapChain,
        NativeLayout.UINT64_MAX,
        imageAvailableSemaphore,
        null,
        pImageIndex
);
if (result == VkResult.ERROR_OUT_OF_DATE_KHR) {
    recreateSwapchain();
    return;
} else if (result != VkResult.SUCCESS && result != VkResult.SUBOPTIMAL_KHR) {
    throw new RuntimeException("Failed to acquire swap chain image, vulkan error code: " + VkResult.explain(result));
}
```

If the swap chain turns out to be out of date when attempting to acquire an image, then it is no longer possible to present to it. Therefore we should immediately recreate the swap chain and try again in the next `drawFrame` call.

You could also decide to do that if the swap chain is suboptimal, but I've chosen to proceed anyway in that case because we've already acquired an image. Both `VkResult.SUCCESS` and `VkResult.SUBOPTIMAL_KHR` are considered "success" return codes.

```java
result = deviceCommands.queuePresentKHR(presentQueue, presentInfo);
if (result == VkResult.ERROR_OUT_OF_DATE_KHR) {
    recreateSwapchain();
}
else if (result != VkResult.SUCCESS && result != VkResult.SUBOPTIMAL_KHR) {
    throw new RuntimeException("Failed to submit draw command buffer, vulkan error code: " + VkResult.explain(result));
}
```

The `VkDeviceCommands::queuePresentKHR` function returns the same values with the same meaning. In this case we will also recreate the swap chain if it is suboptimal, because we want the best possible result.

## Fixing a deadlock

If we try to run the code now, it is possible to encounter a deadlock. Debugging the code, we find that the application reaches `VkDeviceCommands::waitForFences` but never continues past it. This is because when `VkDeviceCommands::acquireNextImageKHR` returns `VkResult.ERROR_OUT_OF_DATE_KHR`, we recreate the swapchain and then return from drawFrame. But before that happens, the current frame's fence was waited upon and reset. Since we return immediately, no work is submitted for execution and the fence will never be signaled, causing `VkDeviceCommands::waitForFences` to halt forever.

There is a simple fix thankfully. Delay resetting the fence until after we know for sure we will be submitting work with it. Thus, if we return early, the fence is still signaled and vkWaitForFences wont deadlock the next time we use the same fence object.

The beginning of drawFrame should now look like this:

```java
deviceCommands.waitForFences(device, 1, pInFlightFence, VkConstants.TRUE, NativeLayout.UINT64_MAX);

var pImageIndex = IntBuffer.allocate(arena);
var result = deviceCommands.acquireNextImageKHR(
        device,
        swapChain,
        NativeLayout.UINT64_MAX,
        imageAvailableSemaphore,
        null,
        pImageIndex
);
if (result == VkResult.ERROR_OUT_OF_DATE_KHR) {
    recreateSwapChain();
    return;
}
else if (result != VkResult.SUCCESS && result != VkResult.SUBOPTIMAL_KHR) {
    throw new RuntimeException("Failed to acquire swap chain image, vulkan error code: " + VkResult.explain(result));
}

// Only reset the fence if we are submitting work
deviceCommands.resetFences(device, 1, pInFlightFence);
```

## Handling resizes explicitly

Although many drivers and platforms trigger `VkResult.ERROR_OUT_OF_DATE_KHR` automatically after a window resize, it is not guaranteed to happen. That's why we'll add some extra code to also handle resizes explicitly. First add a new member variable that flags that a resize has happened:

```java
private boolean framebufferResized = false;
```

The `drawFrame` function should then be modified to also check for this flag:

```java
// ...

result = deviceCommands.queuePresentKHR(presentQueue, presentInfo);
if (result == VkResult.ERROR_OUT_OF_DATE_KHR || framebufferResized) {
    framebufferResized = false;
    recreateSwapChain();
}

// ...
```

It is important to do this after `vkQueuePresentKHR` to ensure that the semaphores are in a consistent state, otherwise a signaled semaphore may never be properly waited upon. Now to actually detect resizes we can use the `GLFW::etFramebufferSizeCallback` function in the GLFW framework to set up a callback. First let's write the actual callback function:

```java
private void framebufferResizeCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment ignoredWindow,
        int ignoredWidth,
        int ignoredHeight
) {
    framebufferResized = true;
}
```

And, although this is a non-static function which requires an implicit `this` parameter, it's still possible to create a upcall-ready function pointer to it:

```java
private void initWindow() {
    // ...

    glfw.windowHint(GLFW.CLIENT_API, GLFW.NO_API);
    // now the line disabling window resizing is removed
    window = Objects.requireNonNull(glfw.createWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null));

    try {
        var handle = MethodHandles.lookup().findVirtual(
                Application.class,
                "framebufferResizeCallback",
                GLFWFunctionTypes.GLFWframebuffersizefun.toMethodType()
        ).bindTo(this); // funny binding mechanism

        var upcallStub = Linker.nativeLinker()
                .upcallStub(handle, GLFWFunctionTypes.GLFWframebuffersizefun, Arena.global());
        glfw.setFramebufferSizeCallback(window, upcallStub);
    } catch (Exception e) {
        throw new RuntimeException("Failed to find method handle for framebufferResizeCallback", e);
    }
}
```

Now try to run the program and resize the window to see if the framebuffer is indeed resized properly with the window.

## Handling minimization

There is another case where a swap chain may become out of date and that is a special kind of window resizing: window minimization. This case is special because it will result in a frame buffer size of `0`. In this tutorial we will handle that by pausing until the window is in the foreground again by extending the `recreateSwapChain` function:

```java
private void recreateSwapChain() {
    try (var arena = Arena.ofConfined()) {
        var pWidth = IntPtr.allocate(arena);
        var pHeight = IntPtr.allocate(arena);
        glfw.getFramebufferSize(window, pWidth, pHeight);
        while (pWidth.read() == 0 || pHeight.read() == 0) {
            glfw.getFramebufferSize(window, pWidth, pHeight);
            glfw.waitEvents();
        }
    }
    
    // ...
}
```

The initial call to `GLFW::getFramebufferSize` handles the case where the size is already correct and `GLFW::waitEvents` would have nothing to wait on.

Congratulations, you've now finished your very first well-behaved Vulkan program! In the next chapter we're going to get rid of the hardcoded vertices in the vertex shader and actually use a vertex buffer.
