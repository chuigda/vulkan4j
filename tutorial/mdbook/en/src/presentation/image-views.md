# Image views

To use any `VkImage`, including those in the swap chain, in the render pipeline we have to create a `VkImageView` object. An image view is quite literally a view into an image. It describes how to access the image and which part of the image to access, for example if it should be treated as a 2D texture depth texture without any mipmapping levels.

In this chapter we'll write a createImageViews function that creates a basic image view for every image in the swap chain so that we can use them as color targets later on.

First add a class member to store the image views in:

```java
private VkImageView[] swapChainImageViews;
```

Create the `createImageViews` function and call it right after swap chain creation.

```java
private void initVulkan() {
    // ...
    createImageViews();
}

private void createImageViews() {
}
```

The first thing we need to do is to create a Java array capable of holding all the image views we'll be creating:

```java
private void createImageViews() {
    swapChainImageViews = new VkImageView[swapChainImages.length];
}
```

Next, set up the loop that iterates over all the swap chain images.

```java
try (var arena = Arena.ofConfined()) {
    var createInfo = VkImageViewCreateInfo.allocate(arena);
    var pImageView = VkImageView.Buffer.allocate(arena);

    for (int i = 0; i < swapChainImages.length; i++) {
    }
}
```

The parameters for image view creation are specified in a `VkImageViewCreateInfo` structure. The first few parameters are straightforward.

```java
createInfo.image(swapChainImages[i]);
```

The `viewType` and format fields specify how the image data should be interpreted. The `viewType` parameter allows you to treat images as 1D textures, 2D textures, 3D textures and cube maps.

```java
createInfo.viewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D);
createInfo.format(swapChainImageFormat);
```

The `components` field allows you to swizzle the color channels around. For example, you can map all of the channels to the red channel for a monochrome texture. You can also map constant values of `0` and `1` to a channel. In our case we'll stick to the default mapping.

```java
var components = createInfo.components();
components.r(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
components.g(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
components.b(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
components.a(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
```

The `subresourceRange` field describes what the image's purpose is and which part of the image should be accessed. Our images will be used as color targets without any mipmapping levels or multiple layers.

```java
var subresourceRange = createInfo.subresourceRange();
subresourceRange.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
subresourceRange.baseMipLevel(0);
subresourceRange.levelCount(1);
subresourceRange.baseArrayLayer(0);
subresourceRange.layerCount(1);
```

If you were working on a stereographic 3D application, then you would create a swap chain with multiple layers. You could then create multiple image views for each image representing the views for the left and right eyes by accessing different layers.

Creating the image view is now a matter of calling `vkCreateImageView`:

```java
var result = deviceCommands.vkCreateImageView(device, createInfo, null, pImageView);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to create image views, vulkan error code: " + VkResult.explain(result));
}
swapChainImageViews[i] = pImageView.read();
```

Unlike images, the image views were explicitly created by us, so we need to add a similar loop to destroy them again at the end of the program:

```java
private void cleanup() {
    for (var imageView : swapChainImageViews) {
        deviceCommands.vkDestroyImageView(device, imageView, null);
    }
    // ...
}
```

An image view is sufficient to start using an image as a texture, but it's not quite ready to be used as a render target just yet. That requires one more step of indirection, known as a framebuffer. But first we'll have to set up the graphics pipeline.
