# Swap chain recreation

## Introduction

The application we have now successfully draws a triangle, but there are some circumstances that it isn't handling properly yet. It is possible for the window surface to change such that the swap chain is no longer compatible with it. One of the reasons that could cause this to happen is the size of the window changing. We have to catch these events and recreate the swap chain.

## Recreating the swap chain

Create a new `recreateSwapChain` function that calls `createSwapChain` and all the creation functions for the objects that depend on the swap chain or the window size.

```java
private void recreateSwapChain() {
    deviceCommands.vkDeviceWaitIdle(device);

    createSwapchain();
    createImageViews();
    createFramebuffers();
}
```

We first call `vkDeviceWaitIdle`, because just like in the last chapter, we shouldn't touch resources that may still be in use. Obviously, we'll have to recreate the swap chain itself. The image views need to be recreated because they are based directly on the swap chain images. Finally, the framebuffers directly depend on the swap chain images, and thus must be recreated as well.

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
        deviceCommands.vkDestroyFramebuffer(device, framebuffer, null);
    }

    for (var imageView : swapChainImageViews) {
        deviceCommands.vkDestroyImageView(device, imageView, null);
    }

    deviceCommands.vkDestroySwapchainKHR(device, swapChain, null);
}

private void cleanup() {
    // ...
    cleanupSwapChain();
    deviceCommands.vkDestroyPipeline(device, graphicsPipeline, null);
    // ...
}
```
