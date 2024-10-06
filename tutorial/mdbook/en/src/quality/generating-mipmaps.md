# Generating Mipmaps

## Introduction

Our program can now load and render 3D models. In this chapter, we will add one more feature, mipmap generation. Mipmaps are widely used in games and rendering software, and Vulkan gives us complete control over how they are created.

Mipmaps are precalculated, downscaled versions of an image. Each new image is half the width and height of the previous one. Mipmaps are used as a form of *Level of Detail or LOD*. Objects that are far away from the camera will sample their textures from the smaller mip images. Using smaller images increases the rendering speed and avoids artifacts such as [Moiré patterns](https://en.wikipedia.org/wiki/Moir%C3%A9_pattern). An example of what mipmaps look like:

![Mipmap LODs](../../../images/mipmaps_example.jpg)

## Image creation

In Vulkan, each of the mip images is stored in different mip levels of a `VkImage`. Mip level 0 is the original image, and the mip levels after level 0 are commonly referred to as the *mip chain*.

The number of mip levels is specified when the `VkImage` is created. Up until now, we have always set this value to one. We need to calculate the number of mip levels from the dimensions of the image. First, add a class member to store this number:

```java
private int textureMipLevels;
private VkImage textureImage;
```

The value for `textureMipLevels` can be found once we've loaded the texture in `createTextureImage`:

```java
textureMipLevels = (int) Math.floor(Math.log(Math.max(width, height)) / Math.log(2)) + 1;
```

> Note: Java `Math` does not provide us a `log2` function, so we need to use [the change of base logarithm formula](https://en.wikipedia.org/wiki/List_of_logarithmic_identities#Changing_the_base) to calculate the logarithm base 2.

This calculates the number of levels in the mip chain. The `max` function selects the largest dimension. The `log` function calculates how many times that dimension can be divided by 2. The `floor` function handles cases where the largest dimension is not a power of 2. 1 is added so that the original image has a mip level.

To use this value, we need to change the `createImage`, `createImageView`, and `transitionImageLayout` functions to allow us to specify the number of mip levels. Add a mipLevels parameter to the functions:

```java
private Pair<VkImage, VkDeviceMemory> createImage(
        int width,
        int height,
        int mipLevels,
        @enumtype(VkFormat.class) int format,
        @enumtype(VkImageTiling.class) int tiling,
        @enumtype(VkImageUsageFlags.class) int usage,
        @enumtype(VkMemoryPropertyFlags.class) int properties
) {
    // ...
    imageInfo.mipLevels(mipLevels);
    // ...
}
```

```java
private VkImageView createImageView(
        VkImage image,
        @enumtype(VkFormat.class) int format,
        @enumtype(VkImageAspectFlags.class) int aspect,
        int mipLevels
) {
    // ...
    subresourceRange.levelCount(mipLevels);
    // ...
}
```

```java
private void transitionImageLayout(
        VkImage image,
        @enumtype(VkFormat.class) int format,
        @enumtype(VkImageLayout.class) int oldLayout,
        @enumtype(VkImageLayout.class) int newLayout,
        int mipLevels
) {
    // ...
    subResourceRange.levelCount(mipLevels);
    // ...
}
```

Update all calls to these functions to use the right values:

```java
var pair = createImage(
        swapChainExtent.width(),
        swapChainExtent.height(),
        1,
        depthFormat,
        VkImageTiling.VK_IMAGE_TILING_OPTIMAL,
        VkImageUsageFlags.VK_IMAGE_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT,
        VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT
);
depthImage = pair.first;
depthImageMemory = pair.second;

// ...

var pair2 = createImage(
        width,
        height,
        textureMipLevels,
        VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
        VkImageTiling.VK_IMAGE_TILING_OPTIMAL,
        VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_DST_BIT
                    | VkImageUsageFlags.VK_IMAGE_USAGE_SAMPLED_BIT,
        VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT
);
textureImage = pair2.first;
textureImageMemory = pair2.second;
```

```java
swapChainImageViews[i] = createImageView(
        swapChainImages[i],
        swapChainImageFormat,
        VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT
);

// ...

depthImageView = createImageView(depthImage, depthFormat, VkImageAspectFlags.VK_IMAGE_ASPECT_DEPTH_BIT, 1);

// ...

textureImageView = createImageView(
        textureImage,
        VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
        VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT,
        textureMipLevels
);
```

```java
transitionImageLayout(
        depthImage,
        depthFormat,
        VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED,
        VkImageLayout.VK_IMAGE_LAYOUT_DEPTH_STENCIL_ATTACHMENT_OPTIMAL,
        1
);
// ...
transitionImageLayout(
        textureImage,
        VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
        VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED,
        VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        textureMipLevels
);
```

## Generating Mipmaps

Our texture image now has multiple mip levels, but the staging buffer can only be used to fill mip level 0. The other levels are still undefined. To fill these levels we need to generate the data from the single level that we have. We will use the `vkCmdBlitImage` command. This command performs copying, scaling, and filtering operations. We will call this multiple times to blit data to each level of our texture image.

`vkCmdBlitImage` is considered a transfer operation, so we must inform Vulkan that we intend to use the texture image as both the source and destination of a transfer. Add `VK_IMAGE_USAGE_TRANSFER_SRC_BIT` to the texture image's usage flags in `createTextureImage`:

```java
var pair2 = createImage(
        width,
        height,
        textureMipLevels,
        VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
        VkImageTiling.VK_IMAGE_TILING_OPTIMAL,
        VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_DST_BIT
                | VkImageUsageFlags.VK_IMAGE_USAGE_SAMPLED_BIT
                | VkImageUsageFlags.VK_IMAGE_USAGE_TRANSFER_SRC_BIT,
        VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_DEVICE_LOCAL_BIT
);
```

Like other image operations, `vkCmdBlitImage` depends on the layout of the image it operates on. We could transition the entire image to `VK_IMAGE_LAYOUT_GENERAL`, but this will most likely be slow. For optimal performance, the source image should be in `VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL` and the destination image should be in `VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL`. Vulkan allows us to transition each mip level of an image independently. Each blit will only deal with two mip levels at a time, so we can transition each level into the optimal layout between blits commands.

`transitionImageLayout` only performs layout transitions on the entire image, so we'll need to write a few more pipeline barrier commands. Remove the existing transition to `VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL` in `createTextureImage`:

```java
// REMOVE this line from your createTextureImage function
//
// transitionImageLayout(
//         textureImage,
//         VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
//         VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
//         VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL,
//         textureMipLevels
// );
```

This will leave each level of the texture image in `VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL`. Each level will be transitioned to `VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL` after the blit command reading from it is finished.

We're now going to write the function that generates the mipmaps:

```java
private void generateMipmaps(VkImage image, int texWidth, int texHeight, int mipLevels) {
    try (var arena = Arena.ofConfined()) {
        var commandBuffer = beginSingleTimeCommands();

        var barrier = VkImageMemoryBarrier.allocate(arena);
        barrier.image(image);
        barrier.srcQueueFamilyIndex(Constants.VK_QUEUE_FAMILY_IGNORED);
        barrier.dstQueueFamilyIndex(Constants.VK_QUEUE_FAMILY_IGNORED);
        barrier.subresourceRange().aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
        barrier.subresourceRange().baseArrayLayer(0);
        barrier.subresourceRange().layerCount(1);
        barrier.subresourceRange().levelCount(1);

        var blit = VkImageBlit.allocate(arena);

        endSingleTimeCommands(commandBuffer);
    }
}
```

We're going to make several transitions, so we'll reuse this `VkImageMemoryBarrier`. The fields set above will remain the same for all barriers. `subresourceRange.miplevel`, `oldLayout`, `newLayout`, `srcAccessMask`, and `dstAccessMask` will be changed for each transition. We also pre-allocate a `VkImageBlit` struct so we don't reallocate it for each blit, we'll see that soon.

```java
var mipWidth = texWidth;
var mipHeight = texHeight;
for (var i = 1; i < mipLevels; i++) {

}
```

This loop will record each of the `VkCmdBlitImage` commands. Note that the loop variable **starts at 1**, not 0.

```java
barrier.subresourceRange().baseMipLevel(i - 1);
barrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);
barrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL);
barrier.srcAccessMask(VkAccessFlags.VK_ACCESS_TRANSFER_WRITE_BIT);
barrier.dstAccessMask(VkAccessFlags.VK_ACCESS_TRANSFER_READ_BIT);
deviceCommands.vkCmdPipelineBarrier(
        commandBuffer,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_TRANSFER_BIT,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_TRANSFER_BIT,
        0,
        0, null,
        0, null,
        1, barrier
);
```

First, we transition level `i - 1` to `VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL`. This transition will wait for level `i - 1` to be filled, either from the previous blit command, or from `vkCmdCopyBufferToImage`. The current blit command will wait on this transition.

```java
var srcOffsets = blit.srcOffsets();
srcOffsets[0].x(0);
srcOffsets[0].y(0);
srcOffsets[0].z(0);
srcOffsets[1].x(mipWidth);
srcOffsets[1].y(mipHeight);
srcOffsets[1].z(1);
var srcSubresource = blit.srcSubresource();
srcSubresource.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
srcSubresource.mipLevel(i - 1);
srcSubresource.baseArrayLayer(0);
srcSubresource.layerCount(1);
var dstOffsets = blit.dstOffsets();
dstOffsets[0].x(0);
dstOffsets[0].y(0);
dstOffsets[0].z(0);
dstOffsets[1].x(mipWidth > 1 ? mipWidth / 2 : 1);
dstOffsets[1].y(mipHeight > 1 ? mipHeight / 2 : 1);
dstOffsets[1].z(1);
var dstSubresource = blit.dstSubresource();
dstSubresource.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
dstSubresource.mipLevel(i);
dstSubresource.baseArrayLayer(0);
dstSubresource.layerCount(1);
```

Next, we specify the regions that will be used in the blit operation. The source mip level is `i - 1` and the destination mip level is `i`. The two elements of the `srcOffsets` array determine the 3D region that data will be blitted from. `dstOffsets` determines the region that data will be blitted to. The X and Y dimensions of the `dstOffsets[1]` are divided by two since each mip level is half the size of the previous level. The Z dimension of `srcOffsets[1]` and `dstOffsets[1]` must be 1, since a 2D image has a depth of 1.

```java
deviceCommands.vkCmdBlitImage(
        commandBuffer,
        image,
        VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL,
        image,
        VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL,
        1,
        blit,
        VkFilter.VK_FILTER_LINEAR
);
```

Now, we record the blit command. Note that `textureImage` is used for both the `srcImage` and `dstImage` parameter. This is because we're blitting between different levels of the same image. The source mip level was just transitioned to `VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL` and the destination level is still in `VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL` from `createTextureImage`.

Beware if you are using a dedicated transfer queue (as suggested in [Vertex buffers](../vertex-buffers/staging-buffer.md)): `vkCmdBlitImage` must be submitted to a queue with graphics capability.

The last parameter allows us to specify a `VkFilter` to use in the blit. We have the same filtering options here that we had when making the `VkSampler`. We use the `VK_FILTER_LINEAR` to enable interpolation.

```java
barrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_SRC_OPTIMAL);
barrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);
barrier.srcAccessMask(VkAccessFlags.VK_ACCESS_TRANSFER_READ_BIT);
barrier.dstAccessMask(VkAccessFlags.VK_ACCESS_SHADER_READ_BIT);
deviceCommands.vkCmdPipelineBarrier(
        commandBuffer,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_TRANSFER_BIT,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT,
        0,
        0, null,
        0, null,
        1, barrier
);
```

This barrier transitions mip level `i - 1` to `VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL`. This transition waits on the current blit command to finish. All sampling operations will wait on this transition to finish.

```java
if (mipWidth > 1) {
    mipWidth /= 2;
}
if (mipHeight > 1) {
    mipHeight /= 2;
}
```

At the end of the loop, we divide the current mip dimensions by two. We check each dimension before the division to ensure that dimension never becomes 0. This handles cases where the image is not square, since one of the mip dimensions would reach 1 before the other dimension. When this happens, that dimension should remain 1 for all remaining levels.

```java
barrier.subresourceRange().baseMipLevel(mipLevels - 1);
barrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL);
barrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL);
barrier.srcAccessMask(VkAccessFlags.VK_ACCESS_TRANSFER_WRITE_BIT);
barrier.dstAccessMask(VkAccessFlags.VK_ACCESS_SHADER_READ_BIT);

deviceCommands.vkCmdPipelineBarrier(
        commandBuffer,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_TRANSFER_BIT,
        VkPipelineStageFlags.VK_PIPELINE_STAGE_FRAGMENT_SHADER_BIT,
        0,
        0, null,
        0, null,
        1, barrier
);
```

Before we end the command buffer, we insert one more pipeline barrier. This barrier transitions the last mip level from `VK_IMAGE_LAYOUT_TRANSFER_DST_OPTIMAL` to `VK_IMAGE_LAYOUT_SHADER_READ_ONLY_OPTIMAL`. This wasn't handled by the loop, since the last mip level is never blitted from.

Finally, add the call to `generateMipmaps` in `createTextureImage`:

```java
// transitionImageLayout
// copyBufferToImage
generateMipmaps(textureImage, width, height, textureMipLevels);
```

Our texture image's mipmaps are now completely filled.

## Linear filtering support

It is very convenient to use a built-in function like `vkCmdBlitImage` to generate all the mip levels, but unfortunately it is not guaranteed to be supported on all platforms. It requires the texture image format we use to support linear filtering, which can be checked with the `vkGetPhysicalDeviceFormatProperties` function. We will add a check to the `generateMipmaps` function for this.

First add one additional parameter that specifies the image format:

```java
generateMipmaps(textureImage, VkFormat.VK_FORMAT_R8G8B8A8_SRGB, width, height, textureMipLevels);

// ...

private void generateMipmaps(
        VkImage image,
        @enumtype(VkFormat.class) int imageFormat,
        int texWidth,
        int texHeight,
        int mipLevels
) {
    // ...
}
```

In the `generateMipmaps` function, use `vkGetPhysicalDeviceFormatProperties` to request the properties of the texture image format:

```java
private void generateMipmaps(
        VkImage image,
        @enumtype(VkFormat.class) int imageFormat,
        int texWidth,
        int texHeight,
        int mipLevels
) {
    try (var arena = Arena.ofConfined()) {
        var formatProperties = VkFormatProperties.allocate(arena);
        instanceCommands.vkGetPhysicalDeviceFormatProperties(physicalDevice, imageFormat, formatProperties);

        // ...
    }
}
```

The VkFormatProperties struct has three fields named `linearTilingFeatures`, `optimalTilingFeatures` and `bufferFeatures` that each describe how the format can be used depending on the way it is used. We create a texture image with the optimal tiling format, so we need to check optimalTilingFeatures. Support for the linear filtering feature can be checked with the `VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT`:

```java
if ((formatProperties.optimalTilingFeatures() & VkFormatFeatureFlags.VK_FORMAT_FEATURE_SAMPLED_IMAGE_FILTER_LINEAR_BIT) == 0) {
    throw new RuntimeException("Texture image format does not support linear blitting");
}
```

There are two alternatives in this case. You could implement a function that searches common texture image formats for one that *does* support linear blitting, or you could implement the mipmap generation in software with a library like `stb_image_resize`. Each mip level can then be loaded into the image in the same way that you loaded the original image.

It should be noted that it is uncommon in practice to generate the mipmap levels at runtime anyway. Usually they are pregenerated and stored in the texture file alongside the base level to improve loading speed. Implementing resizing in software and loading multiple levels from a file is left as an exercise to the reader.

## Sampler

While the `VkImage` holds the mipmap data, `VkSampler` controls how that data is read while rendering. Vulkan allows us to specify `minLod`, `maxLod`, `mipLodBias`, and `mipmapMode` ("Lod" means "Level of Detail"). When a texture is sampled, the sampler selects a mip level according to the following pseudocode:

```c
lod = getLodLevelFromScreenSize(); //smaller when the object is close, may be negative
lod = clamp(lod + mipLodBias, minLod, maxLod);

level = clamp(floor(lod), 0, texture.mipLevels - 1);  //clamped to the number of mip levels in the texture

if (mipmapMode == VK_SAMPLER_MIPMAP_MODE_NEAREST) {
    color = sample(level);
} else {
    color = blend(sample(level), sample(level + 1));
}
```

If `samplerInfo.mipmapMode` is `VK_SAMPLER_MIPMAP_MODE_NEAREST`, `lod` selects the mip level to sample from. If the mipmap mode is `VK_SAMPLER_MIPMAP_MODE_LINEAR`, `lod` is used to select two mip levels to be sampled. Those levels are sampled and the results are linearly blended.

The sample operation is also affected by `lod`:

```java
if (lod <= 0) {
    color = readTexture(uv, magFilter);
} else {
    color = readTexture(uv, minFilter);
}
```

If the object is close to the camera, `magFilter` is used as the filter. If the object is further from the camera, `minFilter` is used. Normally, `lod` is non-negative, and is only 0 when close the camera. `mipLodBias` lets us force Vulkan to use lower `lod` and `level` than it would normally use.

To see the results of this chapter, we need to choose values for our `textureSampler`. We've already set the `minFilter` and `magFilter` to use `VK_FILTER_LINEAR`. We just need to choose values for `minLod`, `maxLod`, `mipLodBias`, and `mipmapMode`.

```java
private void createTextureSampler() {
    // ...

    samplerInfo.mipmapMode(VkSamplerMipmapMode.VK_SAMPLER_MIPMAP_MODE_LINEAR);
    samplerInfo.minLod(0.0f); // Optional
    samplerInfo.maxLod((float) textureMipLevels);
    samplerInfo.mipLodBias(0.0f); // Optional
}
```

To allow the full range of mip levels to be used, we set `minLod` to `0.0f`, and `maxLod` to the number of mip levels. We have no reason to change the `lod` value , so we set `mipLodBias` to `0.0f`.

Now run your program and you should see the following:

![Mipmaps](../../../images/mipmaps.png)

It's not a dramatic difference, since our scene is so simple. There are subtle differences if you look closely.

![Mipmaps comparison](../../../images/mipmaps_comparison.png)

The most noticeable difference is the writing on the papers. With mipmaps, the writing has been smoothed. Without mipmaps, the writing has harsh edges and gaps from Moiré artifacts.

You can play around with the sampler settings to see how they affect mipmapping. For example, by changing `minLod`, you can force the sampler to not use the lowest mip levels:

```java
samplerInfo.minLod(textureMipLevels / 2.0f);
```

These settings will produce this image:

![High mipmaps](../../../images/highmipmaps.png)

This is how higher mip levels will be used when objects are further away from the camera.
