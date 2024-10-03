# Framebuffers

We've talked a lot about framebuffers in the past few chapters, and we've set up the render pass to expect a single framebuffer with the same format as the swap chain images, but we haven't actually created any yet.

The attachments specified during render pass creation are bound by wrapping them into a `VkFramebuffer` object. A framebuffer object references all the `VkImageView` objects that represent the attachments. In our case that will be only a single one: the color attachment. However, the image that we have to use for the attachment depends on which image the swap chain returns when we retrieve one for presentation. That means that we have to create a framebuffer for all the images in the swap chain and use the one that corresponds to the retrieved image at drawing time.

To that end, create another array class member to hold all the framebuffers:

```java
private VkFramebuffer[] swapChainFramebuffers;
```

We'll create the objects for this array in a new function `createFramebuffers` that is called from `initVulkan` right after creating the graphics pipeline:

```java
private void initVulkan() {
    // ...
    createFramebuffers();
}

// ...

private void createFramebuffers() {
}
```

Start by creating a Java array to hold the framebuffers:

```java
private void createFramebuffers() {
    swapChainFramebuffers = new VkFramebuffer[swapChainImageViews.length];
}
```

We'll then iterate through the image views and create framebuffers from them:

```java
for (int i = 0; i < swapChainImageViews.length; i++) {
    try (var arena = Arena.ofConfined()) {
        var pAttachments = VkImageView.Buffer.allocate(arena);
        pAttachments.write(0, swapChainImageViews[i]);

        var framebufferInfo = VkFramebufferCreateInfo.allocate(arena);
        framebufferInfo.renderPass(renderPass);
        framebufferInfo.attachmentCount(1);
        framebufferInfo.pAttachments(pAttachments);
        framebufferInfo.width(swapChainExtent.width());
        framebufferInfo.height(swapChainExtent.height());
        framebufferInfo.layers(1);

        var pFramebuffer = VkFramebuffer.Buffer.allocate(arena);
        var result = deviceCommands.vkCreateFramebuffer(device, framebufferInfo, null, pFramebuffer);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to create framebuffer, vulkan error code: " + VkResult.explain(result));
        }
        swapChainFramebuffers[i] = pFramebuffer.read();
    }
}
```

As you can see, creation of framebuffers is quite straightforward. We first need to specify with which `renderPass` the framebuffer needs to be compatible. You can only use a framebuffer with the render passes that it is compatible with, which roughly means that they use the same number and type of attachments.

The `attachmentCount` and `pAttachments` parameters specify the `VkImageView` objects that should be bound to the respective attachment descriptions in the render pass `pAttachment` array.

The `width` and `height` parameters are self-explanatory and `layers` refers to the number of layers in image arrays. Our swap chain images are single images, so the number of layers is `1`.

We should delete the framebuffers before the image views and render pass that they are based on, but only after we've finished rendering:

```java
private void clenaup() {
    for (var framebuffer : swapChainFramebuffers) {
        deviceCommands.vkDestroyFramebuffer(device, framebuffer, null);
    }

    // ...
}
```

We've now reached the milestone where we have all of the objects that are required for rendering. In the next chapter we're going to write the first actual drawing commands.
