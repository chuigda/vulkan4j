# Multisampling

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part10/ch30/Main.java) | [C++ version](https://vulkan-tutorial.com/Multisampling)

## Introduction

Our program can now load multiple levels of detail for textures which fixes artifacts when rendering objects far away from the viewer. The image is now a lot smoother, however on closer inspection you will notice jagged saw-like patterns along the edges of drawn geometric shapes. This is especially visible in one of our early programs when we rendered a quad:

![Texture coordinate visualization](../../images/texcoord_visualization.png)

This undesired effect is called "aliasing" and it's a result of a limited numbers of pixels that are available for rendering. Since there are no displays out there with unlimited resolution, it will be always visible to some extent. There's a number of ways to fix this and in this chapter we'll focus on one of the more popular ones: [Multisample antialiasing](https://en.wikipedia.org/wiki/Multisample_anti-aliasing) (MSAA).

In ordinary rendering, the pixel color is determined based on a single sample point which in most cases is the center of the target pixel on screen. If part of the drawn line passes through a certain pixel but doesn't cover the sample point, that pixel will be left blank, leading to the jagged "staircase" effect.

![Aliasing](../../images/aliasing.png)

What MSAA does is it uses multiple sample points per pixel (hence the name) to determine its final color. As one might expect, more samples lead to better results, however it is also more computationally expensive.

![Aliasing](../../images/antialiasing.png)

In our implementation, we will focus on using the maximum available sample count. Depending on your application this may not always be the best approach and it might be better to use less samples for the sake of higher performance if the final result meets your quality demands.

## Getting available sample count

Let's start off by determining how many samples our hardware can use. Most modern GPUs support at least 8 samples but this number is not guaranteed to be the same everywhere. We'll keep track of it by adding a new class member:

```java
private @EnumType(VkSampleCountFlags.class) int msaaSamples;
```

By default, we'll be using only one sample per pixel which is equivalent to no multisampling, in which case the final image will remain unchanged. The exact maximum number of samples can be extracted from `VkPhysicalDeviceProperties` associated with our selected physical device. We're using a depth buffer, so we have to take into account the sample count for both color and depth. The highest sample count that is supported by both (&) will be the maximum we can support. Add a function that will fetch this information for us:By default we'll be using only one sample per pixel which is equivalent to no multisampling, in which case the final image will remain unchanged. The exact maximum number of samples can be extracted from VkPhysicalDeviceProperties associated with our selected physical device. We're using a depth buffer, so we have to take into account the sample count for both color and depth. The highest sample count that is supported by both (&) will be the maximum we can support. Add a function that will fetch this information for us:

```java
private @EnumType(VkSampleCountFlags.class) int getMaxUsableSampleCount() {
    try (var arena = Arena.ofConfined()) {
        var physicalDeviceProperties = VkPhysicalDeviceProperties.allocate(arena);
        instanceCommands.getPhysicalDeviceProperties(physicalDevice, physicalDeviceProperties);

        var counts = physicalDeviceProperties.limits().framebufferColorSampleCounts()
                     & physicalDeviceProperties.limits().framebufferDepthSampleCounts();

        if ((counts & VkSampleCountFlags._64) != 0) {
            return VkSampleCountFlags._64;
        }
        if ((counts & VkSampleCountFlags._32) != 0) {
            return VkSampleCountFlags._32;
        }
        if ((counts & VkSampleCountFlags._16) != 0) {
            return VkSampleCountFlags._16;
        }
        if ((counts & VkSampleCountFlags._8) != 0) {
            return VkSampleCountFlags._8;
        }
        if ((counts & VkSampleCountFlags._4) != 0) {
            return VkSampleCountFlags._4;
        }
        if ((counts & VkSampleCountFlags._2) != 0) {
            return VkSampleCountFlags._2;
        }

        return VkSampleCountFlags._1;
    }
}
```

We will now use this function to set the `msaaSamples` variable during the physical device selection process. For this, we have to slightly modify the `pickPhysicalDevice` function:

```java
private void pickPhysicalDevice() {
    // ...
    for (var device : devices) {
        if (isDeviceSuitable(device)) {
            physicalDevice = device;
            msaaSamples = getMaxUsableSampleCount();
            break;
        }
    }
    // ...
}
```

## Setting up a render target

In MSAA, each pixel is sampled in an offscreen buffer which is then rendered to the screen. This new buffer is slightly different from regular images we've been rendering to - they have to be able to store more than one sample per pixel. Once a multisampled buffer is created, it has to be resolved to the default framebuffer (which stores only a single sample per pixel). This is why we have to create an additional render target and modify our current drawing process. We only need one render target since only one drawing operation is active at a time, just like with the depth buffer. Add the following class members:

```java
private VkImage colorImage;
private VkDeviceMemory colorImageMemory;
private VkImageView colorImageView;
```

This new image will have to store the desired number of samples per pixel, so we need to pass this number to `VkImageCreateInfo` during the image creation process. Modify the `createImage` function by adding a `numSamples` parameter:

```java
    private Pair<VkImage, VkDeviceMemory> createImage(
        int width,
        int height,
        int mipLevels,
        @EnumType(VkSampleCountFlags.class) int numSamples,
        @EnumType(VkFormat.class) int format,
        @EnumType(VkImageTiling.class) int tiling,
        @EnumType(VkImageUsageFlags.class) int usage,
        @EnumType(VkMemoryPropertyFlags.class) int properties
) {
    // ...
    imageInfo.samples(numSamples);
    // ...
}
```

For now, update all calls to this function using `VK_SAMPLE_COUNT_1_BIT` - we will be replacing this with proper values as we progress with implementation:

```java
var pair = createImage(
        swapChainExtent.width(),
        swapChainExtent.height(),
        1,
        VkSampleCountFlags._1,
        depthFormat,
        VkImageTiling.OPTIMAL,
        VkImageUsageFlags.DEPTH_STENCIL_ATTACHMENT,
        VkMemoryPropertyFlags.DEVICE_LOCAL
);
depthImage = pair.first;
depthImageMemory = pair.second;

// ...

var pair2 = createImage(
        width,
        height,
        textureMipLevels,
        VkSampleCountFlags._1,
        VkFormat.R8G8B8A8_SRGB,
        VkImageTiling.OPTIMAL,
        VkImageUsageFlags.TRANSFER_DST
        | VkImageUsageFlags.SAMPLED
        | VkImageUsageFlags.TRANSFER_SRC,
        VkMemoryPropertyFlags.DEVICE_LOCAL
);
textureImage = pair2.first;
textureImageMemory = pair2.second;
```

We will now create a multisampled color buffer. Add a `createColorResources` function and note that we're using `msaaSamples` here as a function parameter to `createImage`. We're also using only one mip level, since this is enforced by the Vulkan specification in case of images with more than one sample per pixel. Also, this color buffer doesn't need mipmaps since it's not going to be used as a texture:

```java
private void createColorResources() {
    var colorFormat = swapChainImageFormat;

    var pair = createImage(
            swapChainExtent.width(),
            swapChainExtent.height(),
            1,
            msaaSamples,
            colorFormat,
            VkImageTiling.OPTIMAL,
            VkImageUsageFlags.TRANSIENT_ATTACHMENT | VkImageUsageFlags.COLOR_ATTACHMENT,
            VkMemoryPropertyFlags.DEVICE_LOCAL
    );
    colorImage = pair.first;
    colorImageMemory = pair.second;
    colorImageView = createImageView(colorImage, colorFormat, VkImageAspectFlags.COLOR, 1);
}
```

For consistency, call the function right before `createDepthResources`:

```java
private void initVulkan() {
    // ...
    createColorResources();
    createDepthResources();
    // ...
}
```

Now that we have a multisampled color buffer in place it's time to take care of depth. Modify `createDepthResources` and update the number of samples used by the depth buffer:

```java
var pair = createImage(
        swapChainExtent.width(),
        swapChainExtent.height(),
        1,
        msaaSamples,
        depthFormat,
        VkImageTiling.OPTIMAL,
        VkImageUsageFlags.DEPTH_STENCIL_ATTACHMENT,
        VkMemoryPropertyFlags.DEVICE_LOCAL
);
```

We have now created a couple of new Vulkan resources, so let's not forget to release them when necessary:

```java
private void cleanupSwapChain() {
    deviceCommands.destroyImageView(device, colorImageView, null);
    deviceCommands.destroyImage(device, colorImage, null);
    deviceCommands.freeMemory(device, colorImageMemory, null);
    // ...
}
```

And update the `recreateSwapChain` so that the new color image can be recreated in the correct resolution when the window is resized:

```java
private void recreateSwapChain() {
    // ...
    createImageViews();
    createColorResources();
    createDepthResources();
    // ...
}
```

We made it past the initial MSAA setup, now we need to start using this new resource in our graphics pipeline, framebuffer, render pass and see the results!

## Adding new attachments

Let's take care of the render pass first. Modify `createRenderPass` and update color and depth attachment creation info structs:

```java
private void createRenderPass() {
    // ...
    colorAttachment.samples(msaaSamples);
    colorAttachment.finalLayout(VkImageLayout.COLOR_ATTACHMENT_OPTIMAL);
    // ...
    depthAttachment.samples(msaaSamples);
    // ...
}
```

You'll notice that we have changed the finalLayout from `VkImageLayout.PRESENT_SRC_KHR` to `VkImageLayout.COLOR_ATTACHMENT_OPTIMAL`. That's because multisampled images cannot be presented directly. We first need to resolve them to a regular image. This requirement does not apply to the depth buffer, since it won't be presented at any point. Therefore, we will have to add only one new attachment for color which is a so-called resolve attachment:

```java
var attachments = VkAttachmentDescription.allocate(arena, 3);
// ...
var colorAttachmentResolve = attachments.at(2);
colorAttachmentResolve.format(swapChainImageFormat);
colorAttachmentResolve.samples(VkSampleCountFlags._1);
colorAttachmentResolve.loadOp(VkAttachmentLoadOp.DONT_CARE);
colorAttachmentResolve.storeOp(VkAttachmentStoreOp.STORE);
colorAttachmentResolve.stencilLoadOp(VkAttachmentLoadOp.DONT_CARE);
colorAttachmentResolve.stencilStoreOp(VkAttachmentStoreOp.DONT_CARE);
colorAttachmentResolve.initialLayout(VkImageLayout.UNDEFINED);
colorAttachmentResolve.finalLayout(VkImageLayout.PRESENT_SRC_KHR);
```

The render pass now has to be instructed to resolve multisampled color image into regular attachment. Create a new attachment reference that will point to the color buffer which will serve as the resolve target:

```java
// ...
var colorAttachmentResolveRef = VkAttachmentReference.allocate(arena);
colorAttachmentResolveRef.attachment(2);
colorAttachmentResolveRef.layout(VkImageLayout.COLOR_ATTACHMENT_OPTIMAL);
// ...
```

Set the `pResolveAttachments` subpass struct member to point to the newly created attachment reference. This is enough to let the render pass define a multisample resolve operation which will let us render the image to screen:

```java
// ...
subpass.pResolveAttachments(colorAttachmentResolveRef);
// ...
```

Now update render pass info struct:

```java
var renderPassInfo = VkRenderPassCreateInfo.allocate(arena);
renderPassInfo.attachmentCount(3);
```

With the render pass in place, modify `createFramebuffers` and add the new image view to the list:

```java
private void createFramebuffers() {
    // ...
    var pAttachments = VkImageView.Buffer.allocate(arena, 3);
    pAttachments.write(0, colorImageView);
    pAttachments.write(1, depthImageView);
    pAttachments.write(2, swapChainImageViews.read(i));
    // ...
    framebufferInfo.attachmentCount(3);
    // ...
}
```

Finally, tell the newly created pipeline to use more than one sample by modifying `createGraphicsPipeline`:

```java
private void createGraphicsPipeline() {
    // ...
    multisampling.rasterizationSamples(msaaSamples);
    // ...
}
```

Now run your program and you should see the following:

![Multisampling](../../images/multisampling.png)

Just like with mipmapping, the difference may not be apparent straight away. On a closer look you'll notice that the edges are not as jagged anymore and the whole image seems a bit smoother compared to the original.

![Multisampling comparison](../../images/multisampling_comparison.png)

The difference is more noticeable when looking up close at one of the edges:

![Multisampling comparison axe](../../images/multisampling_comparison_axe.png)

## Quality improvements

There are certain limitations of our current MSAA implementation which may impact the quality of the output image in more detailed scenes. For example, we're currently not solving potential problems caused by shader aliasing, i.e. MSAA only smoothens out the edges of geometry but not the interior filling. This may lead to a situation when you get a smooth polygon rendered on screen but the applied texture will still look aliased if it contains high contrasting colors. One way to approach this problem is to enable [Sample Shading](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap27.html#primsrast-sampleshading) which will improve the image quality even further, though at an additional performance cost:

```java
private void createLogicalDevice() {
    // ...
    deviceFeatures.sampleRateShading(VkConstants.TRUE);
    // ...
}

private void createGraphicsPipeline() {
    // ...
    multisampling.sampleShadingEnable(VkConstants.TRUE);
    multisampling.minSampleShading(0.2f);
    // ...
}
```

In certain scenarios the quality improvement may be noticeable:

![Sample shading](../../images/sample_shading.png)

## Conclusion

It has taken a lot of work to get to this point, but now you finally have a good base for a Vulkan program. The knowledge of the basic principles of Vulkan that you now possess should be sufficient to start exploring more of the features, like:

- Push constants
- Instanced rendering
- Dynamic uniforms
- Separate images and sampler descriptors
- Pipeline cache
- Multithreaded command buffer generation
- Multiple subpasses
- Compute shaders

The current program can be extended in many ways, like adding Blinn-Phong lighting, post-processing effects and shadow mapping. You should be able to learn how these effects work from tutorials for other APIs, because despite Vulkan's explicitness, many concepts still work the same.
