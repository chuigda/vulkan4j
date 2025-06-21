# Image views

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part02/ch07/Main.java) | [C++ version](https://vulkan-tutorial.com/Drawing_a_triangle/Presentation/Image_views)

To use any `VkImage`, including those in the swap chain, in the render pipeline we have to create a `VkImageView` object. An image view is quite literally a view into an image. It describes how to access the image and which part of the image to access, for example if it should be treated as a 2D texture depth texture without any mipmapping levels.

In this chapter we'll write a createImageViews function that creates a basic image view for every image in the swap chain so that we can use them as color targets later on.

First add a class member to store the image views in:

```java
private VkImageView.Ptr swapChainImageViews;
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

The first thing we need to do is to create a buffer capable of holding all the image views we'll be creating:

```java
private void createImageViews() {
    swapChainImageViews = VkImageView.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());
}
```

Next, set up the loop that iterates over all the swap chain images.

```java
try (var arena = Arena.ofConfined()) {
    var createInfo = VkImageViewCreateInfo.allocate(arena);
    var pImageView = VkImageView.Ptr.allocate(arena);

    for (int i = 0; i < swapChainImages.length; i++) {
    }
}
```

The parameters for image view creation are specified in a `VkImageViewCreateInfo` structure. The first few parameters are straightforward.

```java
createInfo.image(swapChainImages.read(i));
```

The `viewType` and format fields specify how the image data should be interpreted. The `viewType` parameter allows you to treat images as 1D textures, 2D textures, 3D textures and cube maps.

```java
createInfo
        .viewType(VkImageViewType._2D)
        .format(swapChainImageFormat);
```

The `components` field allows you to swizzle the color channels around. For example, you can map all of the channels to the red channel for a monochrome texture. You can also map constant values of `0` and `1` to a channel. In our case we'll stick to the default mapping.

```java
createInfo.components(it -> it
        .r(VkComponentSwizzle.IDENTITY)
        .g(VkComponentSwizzle.IDENTITY)
        .b(VkComponentSwizzle.IDENTITY)
        .a(VkComponentSwizzle.IDENTITY));
```

> Note: closure syntax
> 
> In the above code, we use a closure to set the `components` field. This is a common pattern in `vulkan4j` where you can pass a lambda function to configure a nested structure. The lambda receives a mutable reference to the structure, allowing you to set its fields in a more readable way.

The `subresourceRange` field describes what the image's purpose is and which part of the image should be accessed. Our images will be used as color targets without any mipmapping levels or multiple layers.

```java
createInfo
        .subresourceRange(it -> it
        .aspectMask(VkImageAspectFlags.COLOR)
        .baseMipLevel(0)
        .levelCount(1)
        .baseArrayLayer(0)
        .layerCount(1));
```

If you were working on a stereographic 3D application, then you would create a swap chain with multiple layers. You could then create multiple image views for each image representing the views for the left and right eyes by accessing different layers.

Creating the image view is now a matter of calling `DeviceCommands::createImageView`:

```java
var result = deviceCommands.createImageView(device, createInfo, null, pImageView);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create image views, vulkan error code: " + VkResult.explain(result));
}
swapChainImageViews.write(i, Objects.requireNonNull(pImageView.read()));
```

Unlike images, the image views were explicitly created by us, so we need to add a similar loop to destroy them again at the end of the program:

```java
private void cleanup() {
    for (var imageView : swapChainImageViews) {
        deviceCommands.destroyImageView(device, imageView, null);
    }
    // ...
}
```

An image view is sufficient to start using an image as a texture, but it's not quite ready to be used as a render target just yet. That requires one more step of indirection, known as a framebuffer. But first we'll have to set up the graphics pipeline.
