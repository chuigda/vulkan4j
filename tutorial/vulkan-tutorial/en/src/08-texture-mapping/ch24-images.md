# Images

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part08/ch24/Main.java) | [C++ version](https://vulkan-tutorial.com/Texture_mapping/Images) 

## Introduction

The geometry has been colored using per-vertex colors so far, which is a rather limited approach. In this part of the tutorial we're going to implement texture mapping to make the geometry look more interesting. This will also allow us to load and draw basic 3D models in a future chapter.

Adding a texture to our application will involve the following steps:

- Create an image object backed by device memory
- Fill it with pixels from an image file
- Create an image sampler
- Add a combined image sampler descriptor to sample colors from the texture

We've already worked with image objects before, but those were automatically created by the swap chain extension. This time we'll have to create one by ourselves. Creating an image and filling it with data is similar to vertex buffer creation. We'll start by creating a staging resource and filling it with pixel data, and then we copy this to the final image object that we'll use for rendering. Although it is possible to create a staging image for this purpose, Vulkan also allows you to copy pixels from a `VkBuffer` to an image and the API for this is [actually faster on some hardware](https://developer.nvidia.com/vulkan-memory-management). We'll first create this buffer and fill it with pixel values, and then we'll create an image to copy the pixels to. Creating an image is not very different from creating buffers. It involves querying the memory requirements, allocating device memory and binding it, just like we've seen before.

However, there is something extra that we'll have to take care of when working with images. Images can have different *layouts* that affect how the pixels are organized in memory. Due to the way graphics hardware works, simply storing the pixels row by row may not lead to the best performance, for example. When performing any operation on images, you must make sure that they have the layout that is optimal for use in that operation. We've actually already seen some of these layouts when we specified the render pass:


- `VkImageLayout.PRESENT_SRC_KHR`: Optimal for presentation
- `VkImageLayout.COLOR_ATTACHMENT_OPTIMAL`: Optimal as attachment for writing colors from the fragment shader
- `VkImageLayout.TRANSFER_SRC_OPTIMAL`: Optimal as source in a transfer operation, like `vkCmdCopyImageToBuffer`
- `VkImageLayout.TRANSFER_DST_OPTIMAL`: Optimal as destination in a transfer operation, like `vkCmdCopyBufferToImage`
- `VkImageLayout.SHADER_READ_ONLY_OPTIMAL`: Optimal for sampling from a shader

One of the most common ways to transition the layout of an image is a pipeline barrier. Pipeline barriers are primarily used for synchronizing access to resources, like making sure that an image was written to before it is read, but they can also be used to transition layouts. In this chapter we'll see how pipeline barriers are used for this purpose. Barriers can additionally be used to transfer queue family ownership when using `VkSharingMode.EXCLUSIVE`.

## Image loading

There are many libraries available for loading images, and you can even write your own code to load simple formats like BMP and PPM. In this tutorial we'll be using `javax.imageio` for loading images. The advantage of it is that it's already included in the Java standard library, so we don't have to add any extra dependencies.

Create a new function `createTextureImage` where we'll load an image and upload it into a Vulkan image object. We're going to use command buffers, so it should be called after `createCommandPool`.

```java
private void initVulkan() {
    // ...
    createCommandPool();
    createTextureImage();
    createVertexBuffer();
    // ...
}

// ...

private void createTextureImage() {
}
```

Create a new directory `texture` next to the `shader` directory to store texture images in. We're going to load an image called `texture.jpg` from that directory. I've chosen to use the following [CC0 licensed image](https://pixabay.com/en/statue-sculpture-fig-historically-1275469/) resized to 512 x 512 pixels, but feel free to pick any image you want.

![texture.png](../../images/texture.png)

Loading an image with `javax.imageio` is easy:

```java
private void createTextureImage() {
    BufferedImage image;
    try (var stream = Application.class.getResourceAsStream("/texture/texture.png")) {
        if (stream == null) {
            throw new RuntimeException("Failed to load texture image");
        }
        image = ImageIO.read(stream);
    }
    catch (IOException e) {
        throw new RuntimeException("Failed to load texture image", e);
    }

    var width = image.getWidth();
    var height = image.getHeight();
    var imageSize = width * height;
    var imageSizeBytes = imageSize * 4;
}
```

## Staging buffer

We're now going to create a buffer in host visible memory so that we can use `vkMapMemory` and copy the pixels to it. The buffer should be in host visible memory so that we can map it, and it should be usable as a transfer source so that we can copy it to an image later on:

```java
var pair = createBuffer(
        imageSizeBytes,
        VkBufferUsageFlags.TRANSFER_SRC,
        VkMemoryPropertyFlags.HOST_VISIBLE | VkMemoryPropertyFlags.HOST_COHERENT
);
var stagingBuffer = pair.first;
var stagingBufferMemory = pair.second;
```

We can then directly copy the pixel values that we got from the image loading library to the buffer:

```java
try (Arena arena = Arena.ofConfined()) {
    var ppData = PointerPtr.allocate(arena);
    var result = deviceCommands.mapMemory(device, stagingBufferMemory, 0, imageSizeBytes, 0, ppData);
    if (result != VkResult.SUCCESS) {
        throw new RuntimeException("Failed to map texture image memory, vulkan error code: " + VkResult.explain(result));
    }
    var buffer = new BytePtr(ppData.read().reinterpret(imageSizeBytes));
    for (int y = 0; y < height; y++) {
        for (int x = 0; x < width; x++) {
            var color = new Color(image.getRGB(x, y), true);
            var linearIndex = y * width + x;
            buffer.write(linearIndex * 4L, (byte) color.getRed());
            buffer.write(linearIndex * 4L + 1, (byte) color.getGreen());
            buffer.write(linearIndex * 4L + 2, (byte) color.getBlue());
            buffer.write(linearIndex * 4L + 3, (byte) color.getAlpha());
        }
    }
    deviceCommands.unmapMemory(device, stagingBufferMemory);
}
```

Writing pixel by pixel might not be the optimal way of doing this, but it's simple and works for now. You may use a more efficient image loading and pixel copying method in real-world application if you want. 

## Texture Image

Although we could set up the shader to access the pixel values in the buffer, it's better to use image objects in Vulkan for this purpose. Image objects will make it easier and faster to retrieve colors by allowing us to use 2D coordinates, for one. Pixels within an image object are known as texels and we'll use that name from this point on. Add the following new class members:

```java
private VkImage textureImage;
private VkDeviceMemory textureImageMemory;
```

The parameters for an image are specified in a `VkImageCreateInfo` struct:

```java
var imageInfo = VkImageCreateInfo.allocate(arena)
        .imageType(VkImageType._2D)
        .extent(it -> it.width(width).height(height).depth(1))
        .mipLevels(1)
        .arrayLayers(1);
```

The image type, specified in the `imageType` field, tells Vulkan with what kind of coordinate system the texels in the image are going to be addressed. It is possible to create 1D, 2D and 3D images. One dimensional images can be used to store an array of data or gradient, two-dimensional images are mainly used for textures, and three-dimensional images can be used to store voxel volumes, for example. The `extent` field specifies the dimensions of the image, basically how many texels there are on each axis. That's why `depth` must be `1` instead of `0`. Our texture will not be an array, and we won't be using mipmapping for now.

```java
imageInfo.format(VkFormat.R8G8B8A8_SRGB);
```

Vulkan supports many possible image formats, but we should use the same format for the texels as the pixels in the buffer, otherwise the copy operation will fail.

```java
imageInfo.tiling(VkImageTiling.VkImageTiling.OPTIMAL);
```

The `tiling` field can have one of two values:

- `VkImageTiling.LINEAR`: Texels are laid out in row-major order like our pixels array
- `VkImageTiling.OPTIMAL`: Texels are laid out in an implementation defined order for optimal access

Unlike the layout of an image, the tiling mode cannot be changed at a later time. If you want to be able to directly access texels in the memory of the image, then you must use `VkImageTiling.LINEAR`. We will be using a staging buffer instead of a staging image, so this won't be necessary. We will be using `VkImageTiling.OPTIMAL` for efficient access from the shader.

```java
imageInfo.initialLayout(VkImageLayout.UNDEFINED);
```

There are only two possible values for the initialLayout of an image:

- `VkImageLayout.UNDEFINED`: Not usable by the GPU and the very first transition will discard the texels.
- `VkImageLayout.PREINITIALIZED`: Not usable by the GPU, but the first transition will preserve the texels.

There are few situations where it is necessary for the texels to be preserved during the first transition. One example, however, would be if you wanted to use an image as a staging image in combination with the `VkImageTiling.LINEAR` layout. In that case, you'd want to upload the texel data to it and then transition the image to be a transfer source without losing the data. In our case, however, we're first going to transition the image to be a transfer destination and then copy texel data to it from a buffer object, so we don't need this property and can safely use `VkImageLayout.UNDEFINED`.

```java
imageInfo.usage(VkImageUsageFlags.TRANSFER_DST | VkImageUsageFlags.SAMPLED);
```

The `usage` field has the same semantics as the one during buffer creation. The image is going to be used as destination for the buffer copy, so it should be set up as a transfer destination. We also want to be able to access the image from the shader to color our mesh, so the usage should include `VkImageUsageFlags.SAMPLED`.

```java
imageInfo.sharingMode(VkSharingMode.EXCLUSIVE);
```

The image will only be used by one queue family: the one that supports graphics (and therefore also) transfer operations.

```java
imageInfo
        .samples(VkSampleCountFlags._1)
        .flags(0); // Optional
```

The `samples` flag is related to multisampling. This is only relevant for images that will be used as attachments, so stick to one sample. There are some optional flags for images that are related to sparse images. Sparse images are images where only certain regions are actually backed by memory. If you were using a 3D texture for a voxel terrain, for example, then you could use this to avoid allocating memory to store large volumes of "air" values. We won't be using it in this tutorial, so leave it to its default value of `0`.

```java
var pTextureImage = VkImage.Ptr.allocate(arena);
result = deviceCommands.createImage(device, imageInfo, null, pTextureImage);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create image, vulkan error code: " + VkResult.explain(result));
}
textureImage = Objects.requireNonNull(pTextureImage.read());
```

The image is created using `VkDeviceCommands.createImage`, which doesn't have any particularly noteworthy parameters. It is possible that the `VkFormat.R8G8B8A8_SRGB` format is not supported by the graphics hardware. You should have a list of acceptable alternatives and go with the best one that is supported. However, support for this particular format is so widespread that we'll skip this step. Using different formats would also require annoying conversions. We will get back to this in the depth buffer chapter, where we'll implement such a system.

```java
var memoryRequirements = VkMemoryRequirements.allocate(arena);
deviceCommands.getImageMemoryRequirements(device, textureImage, memoryRequirements);

var allocInfo = VkMemoryAllocateInfo.allocate(arena)
        .allocationSize(memRequirements.size())
        .memoryTypeIndex(findMemoryType(memRequirements.memoryTypeBits(), properties));

var pTextureImageMemory = VkDeviceMemory.Ptr.allocate(arena);
result = deviceCommands.allocateMemory(device, allocInfo, null, pTextureImageMemory);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to allocate image memory, vulkan error code: " + VkResult.explain(result));
}
textureImageMemory = Objects.requireNonNull(pTextureImageMemory.read());
deviceCommands.bindImageMemory(device, textureImage, textureImageMemory, 0);
```

Allocating memory for an image works in exactly the same way as allocating memory for a buffer. Use `VkDeviceCommands::getImageMemoryRequirements` instead of `VkDeviceCommands::getBufferMemoryRequirements`, and use `VkDeviceCommands::bindImageMemory` instead of `VkDeviceCommands::bindBufferMemory`.

This function is already getting quite large and there'll be a need to create more images in later chapters, so we should abstract image creation into a `createImage` function, like we did for buffers. Create the function and move the image object creation and memory allocation to it:

```java
private Pair<VkImage, VkDeviceMemory> createImage(
        int width,
        int height,
        @EnumType(VkFormat.class) int format,
        @EnumType(VkImageTiling.class) int tiling,
        @EnumType(VkImageUsageFlags.class) int usage,
        @EnumType(VkMemoryPropertyFlags.class) int properties
) {
    try (var arena = Arena.ofConfined()) {
        var imageInfo = VkImageCreateInfo.allocate(arena)
                .imageType(VkImageType._2D)
                .mipLevels(1)
                .arrayLayers(1)
                .extent(it -> it.width(width).height(height).depth(1))
                .format(format)
                .tiling(tiling)
                .initialLayout(VkImageLayout.UNDEFINED)
                .usage(usage)
                .samples(VkSampleCountFlags._1)
                .sharingMode(VkSharingMode.EXCLUSIVE);

        var pImage = VkImage.Ptr.allocate(arena);
        var result = deviceCommands.createImage(device, imageInfo, null, pImage);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to create image, vulkan error code: " + VkResult.explain(result));
        }
        var image = Objects.requireNonNull(pImage.read());

        var memRequirements = VkMemoryRequirements.allocate(arena);
        deviceCommands.getImageMemoryRequirements(device, image, memRequirements);

        var allocInfo = VkMemoryAllocateInfo.allocate(arena)
                .allocationSize(memRequirements.size())
                .memoryTypeIndex(findMemoryType(memRequirements.memoryTypeBits(), properties));

        var pMemory = VkDeviceMemory.Ptr.allocate(arena);
        result = deviceCommands.allocateMemory(device, allocInfo, null, pMemory);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to allocate image memory, vulkan error code: " + VkResult.explain(result));
        }
        var memory = Objects.requireNonNull(pMemory.read());

        deviceCommands.bindImageMemory(device, image, memory, 0);
        return new Pair<>(image, memory);
    }
}
```

I've made the width, height, format, tiling mode, usage, and memory properties parameters, because these will all vary between the images we'll be creating throughout this tutorial.

The `createTextureImage` function can now be simplified to:

```java
private void createTextureImage() {
    BufferedImage image;
    try (var stream = Application.class.getResourceAsStream("/texture/texture.jpg")) {
        if (stream == null) {
            throw new RuntimeException("Failed to load texture image");
        }
        image = ImageIO.read(stream);
    }
    catch (IOException e) {
        throw new RuntimeException("Failed to load texture image", e);
    }

    var width = image.getWidth();
    var height = image.getHeight();
    var imageSize = width * height;
    var imageSizeBytes = imageSize * 4;

    try (var arena = Arena.ofConfined()) {
        var pair = createBuffer(
                imageSizeBytes,
                VkBufferUsageFlags.VK_BUFFER_USAGE_TRANSFER_SRC_BIT,
                VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_VISIBLE_BIT
                | VkMemoryPropertyFlags.VK_MEMORY_PROPERTY_HOST_COHERENT_BIT
        );
        var stagingBuffer = pair.first;
        var stagingBufferMemory = pair.second;

        var ppData = PointerBuffer.allocate(arena);
        var result = deviceCommands.vkMapMemory(device, stagingBufferMemory, 0, imageSizeBytes, 0, ppData.segment());
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to map texture image memory, vulkan error code: " + VkResult.explain(result));
        }
        var buffer = new ByteBuffer(ppData.read().reinterpret(imageSizeBytes));
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                var color = new Color(image.getRGB(x, y), true);

                var linearIndex = y * width + x;
                buffer.write(linearIndex * 4L, (byte) color.getRed());
                buffer.write(linearIndex * 4L + 1, (byte) color.getGreen());
                buffer.write(linearIndex * 4L + 2, (byte) color.getBlue());
                buffer.write(linearIndex * 4L + 3, (byte) color.getAlpha());
            }
        }
        deviceCommands.vkUnmapMemory(device, stagingBufferMemory);

        var pair2 = createImage(
                width,
                height,
                VkFormat.R8G8B8A8_SRGB,
                VkImageTiling.OPTIMAL,
                VkImageUsageFlags.TRANSFER_DST | VkImageUsageFlags.SAMPLED,
                VkMemoryPropertyFlags.DEVICE_LOCAL
        );
        textureImage = pair2.first;
        textureImageMemory = pair2.second;
    }
}
```

## Layout transitions

The function we're going to write now involves recording and executing a command buffer again, so now's a good time to move that logic into a helper function or two:

```java
private VkCommandBuffer beginSingleTimeCommands() {
    try (var arena = Arena.ofConfined()) {
        var allocInfo = VkCommandBufferAllocateInfo.allocate(arena)
                .level(VkCommandBufferLevel.PRIMARY)
                .commandPool(commandPool)
                .commandBufferCount(1);

        var pCommandBuffer = VkCommandBuffer.Ptr.allocate(arena);
        var result = deviceCommands.allocateCommandBuffers(device, allocInfo, pCommandBuffer);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to allocate command buffer, vulkan error code: " + VkResult.explain(result));
        }
        var commandBuffer = Objects.requireNonNull(pCommandBuffer.read());

        var beginInfo = VkCommandBufferBeginInfo.allocate(arena)
                .flags(VkCommandBufferUsageFlags.ONE_TIME_SUBMIT);
        result = deviceCommands.beginCommandBuffer(commandBuffer, beginInfo);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to begin recording command buffer, vulkan error code: " + VkResult.explain(result));
        }

        return commandBuffer;
    }
}

private void endSingleTimeCommands(VkCommandBuffer commandBuffer) {
    deviceCommands.endCommandBuffer(commandBuffer);

    try (var arena = Arena.ofConfined()) {
        var pCommandBuffer = VkCommandBuffer.Ptr.allocateV(arena, commandBuffer);
        var submitInfo = VkSubmitInfo.allocate(arena)
                .commandBufferCount(1)
                .pCommandBuffers(pCommandBuffer);

        deviceCommands.queueSubmit(graphicsQueue, 1, submitInfo, null);
        deviceCommands.queueWaitIdle(graphicsQueue);

        deviceCommands.freeCommandBuffers(device, commandPool, 1, pCommandBuffers);
    }
}
```

The code for these functions is based on the existing code in `copyBuffer`. You can now simplify that function to:

```java
private void copyBuffer(VkBuffer srcBuffer, VkBuffer dstBuffer, int size) {
    try (var arena = Arena.ofConfined()) {
        var commandBuffer = beginSingleTimeCommands();

        var copyRegion = VkBufferCopy.allocate(arena);
        copyRegion.size(size);
        deviceCommands.cmdCopyBuffer(commandBuffer, srcBuffer, dstBuffer, 1, copyRegion);

        endSingleTimeCommands(commandBuffer);
    }
}
```

If we were still using buffers, then we could now write a function to record and execute `vkCmdCopyBufferToImage` to finish the job, but this command requires the image to be in the right layout first. Create a new function to handle layout transitions:

```java
private void transitionImageLayout(
        VkImage image,
        @EnumType(VkFormat.class) int format,
        @EnumType(VkImageLayout.class) int oldLayout,
        @EnumType(VkImageLayout.class) int newLayout
) {
    try (var arena = Arena.ofConfined()) {
        var commandBuffer = beginSingleTimeCommands();
        endSingleTimeCommands(commandBuffer);
    }
}
```

One of the most common ways to perform layout transitions is using an *image memory barrier*. A pipeline barrier like that is generally used to synchronize access to resources, like ensuring that a write to a buffer completes before reading from it, but it can also be used to transition image layouts and transfer queue family ownership when `VkSharingMode.EXCLUSIVE` is used. There is an equivalent *buffer memory barrier* to do this for buffers.

```java
var barrier = VkImageMemoryBarrier.allocate(arena)
        .oldLayout(oldLayout)
        .newLayout(newLayout);
```

The first two fields specify layout transition. It is possible to use `VkImageLayout.UNDEFINED` as `oldLayout` if you don't care about the existing contents of the image.

```java
barrier
        .srcQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED)
        .dstQueueFamilyIndex(VkConstants.QUEUE_FAMILY_IGNORED);
```

If you are using the barrier to transfer queue family ownership, then these two fields should be the indices of the queue families. They must be set to `VkConstants.QUEUE_FAMILY_IGNORED` if you don't want to do this (not the default value!).

```java
barrier
        .image(image)
        .subresourceRange(it -> it
                .aspectMask(VkImageAspectFlags.COLOR)
                                    .baseMipLevel(0)
                                    .levelCount(1)
                                    .baseArrayLayer(0)
                                    .layerCount(1));
```

The `image` and `subresourceRange` specify the image that is affected and the specific part of the image. Our image is not an array and does not have mipmapping levels, so only one level and layer are specified.

```java
barrier
        .srcAccessMask(0)  // TODO
        .dstAccessMask(0); // TODO
```

Barriers are primarily used for synchronization purposes, so you must specify which types of operations that involve the resource must happen before the barrier, and which operations that involve the resource must wait on the barrier. We need to do that despite already using `vkQueueWaitIdle` to manually synchronize. The right values depend on the old and new layout, so we'll get back to this once we've figured out which transitions we're going to use.

```java
deviceCommands.vkCmdPipelineBarrier(
        commandBuffer,
        0, // TODO
        0, // TODO
        0,
        0, null,
        0, null,
        1, barrier
);
```

All types of pipeline barriers are submitted using the same function. The first parameter after the command buffer specifies in which pipeline stage the operations occur that should happen before the barrier. The second parameter specifies the pipeline stage in which operations will wait on the barrier. The pipeline stages that you are allowed to specify before and after the barrier depend on how you use the resource before and after the barrier. The allowed values are listed in [this table](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap7.html#synchronization-access-types-supported) of the specification. For example, if you're going to read from a uniform after the barrier, you would specify a usage of `VkAccessFlags.UNIFORM_READ` and the earliest shader that will read from the uniform as pipeline stage, for example `VkPipelineStageFlags.FRAGMENT_SHADER`. It would not make sense to specify a non-shader pipeline stage for this type of usage and the validation layers will warn you when you specify a pipeline stage that does not match the type of usage.

The third parameter is either `0` or `VkDependencyFlags.BY_REGION`. The latter turns the barrier into a per-region condition. That means that the implementation is allowed to already begin reading from the parts of a resource that were written so far, for example.

The last three pairs of parameters reference arrays of pipeline barriers of the three available types: memory barriers, buffer memory barriers, and image memory barriers like the one we're using here. Note that we're not using the `VkFormat` parameter yet, but we'll be using that one for special transitions in the depth buffer chapter.

## Copying buffer to image

Before we get back to `createTextureImage`, we're going to write one more helper function: `copyBufferToImage`:

```java
private void copyBufferToImage(
        VkBuffer buffer,
        VkImage image,
        int width,
        int height
) {
    try (var arena = Arena.ofConfined()) {
        var commandBuffer = beginSingleTimeCommands();

        endSingleTimeCommands(commandBuffer);
    }
}
```

Just like with buffer copies, you need to specify which part of the buffer is going to be copied to which part of the image. This happens through `VkBufferImageCopy` structs:

```java
var region = VkBufferImageCopy.allocate(arena)
        .bufferOffset(0)
        .bufferRowLength(0)
        .bufferImageHeight(0)
        .imageSubresource(it -> it
                .aspectMask(VkImageAspectFlags.COLOR)
                .mipLevel(0)
                .baseArrayLayer(0)
                .layerCount(1))
        .imageOffset(it -> it.x(0).y(0).z(0))
        .imageExtent(it -> it
            .width(width)
            .height(height)
            .depth(1));
```

Most of these fields are self-explanatory. The `bufferOffset` specifies the byte offset in the buffer at which the pixel values start. The `bufferRowLength` and `bufferImageHeight` fields specify how the pixels are laid out in memory. For example, you could have some padding bytes between rows of the image. Specifying `0` for both indicates that the pixels are simply tightly packed like they are in our case. The `imageSubresource`, `imageOffset` and `imageExtent` fields indicate to which part of the image we want to copy the pixels.

Buffer to image copy operations are enqueued using the `vkCmdCopyBufferToImage` function:

```java
deviceCommands.cmdCopyBufferToImage(
        commandBuffer,
        buffer,
        image,
        VkImageLayout.TRANSFER_DST_OPTIMAL,
        1,
        region
);
```

The fourth parameter indicates which layout the image is currently using. I'm assuming here that the image has already been transitioned to the layout that is optimal for copying pixels to. Right now we're only copying one chunk of pixels to the whole image, but it's possible to specify an array of `VkBufferImageCopy` to perform many different copies from this buffer to the image in one operation.

## Preparing the texture image

We now have all the tools we need to finish setting up the texture image, so we're going back to the `createTextureImage` function. The last thing we did there was creating the texture image. The next step is to copy the staging buffer to the texture image. This involves two steps:

- Transition the texture image to `VkImageLayout.TRANSFER_DST_OPTIMAL`
- Execute the buffer to image copy operation

This is easy to do with the functions we just created:

```java
transitionImageLayout(
        textureImage,
        VkFormat.R8G8B8A8_SRGB,
        VkImageLayout.UNDEFINED,
        VkImageLayout.TRANSFER_DST_OPTIMAL
);
copyBufferToImage(stagingBuffer, textureImage, width, height);
```

The image was created with the `VkImageLayout.UNDEFINED` layout, so that one should be specified as old layout when transitioning `textureImage`. Remember that we can do this because we don't care about its contents before performing the copy operation.

To be able to start sampling from the texture image in the shader, we need one last transition to prepare it for shader access:

```java
transitionImageLayout(
        textureImage,
        VkFormat.VK_FORMAT_R8G8B8A8_SRGB,
        VkImageLayout.VkImageLayout.TRANSFER_DST_OPTIMAL,
        VkImageLayout.VkImageLayout.SHADER_READ_ONLY_OPTIMAL
);
```

## Transition barrier masks

If you run your application with validation layers enabled now, then you'll see that it complains about the access masks and pipeline stages in `transitionImageLayout` being invalid. We still need to set those based on the layouts in the transition.

There are two transitions we need to handle:

- Undefined → transfer destination: transfer writes that don't need to wait on anything
- Transfer destination → shader reading: shader reads should wait on transfer writes, specifically the shader reads in the fragment shader, because that's where we're going to use the texture

These rules are specified using the following access masks and pipeline stages:

```java
@EnumType(VkPipelineStageFlags.class) int sourceStage;
@EnumType(VkPipelineStageFlags.class) int destinationStage;

if (oldLayout == VkImageLayout.UNDEFINED
    && newLayout == VkImageLayout.TRANSFER_DST_OPTIMAL) {
    barrier.srcAccessMask(0).dstAccessMask(VkAccessFlags.TRANSFER_WRITE);

    sourceStage = VkPipelineStageFlags.TOP_OF_PIPE;
    destinationStage = VkPipelineStageFlags.TRANSFER;
}
else if (oldLayout == VkImageLayout.TRANSFER_DST_OPTIMAL
         && newLayout == VkImageLayout.SHADER_READ_ONLY_OPTIMAL) {
    barrier.srcAccessMask(VkAccessFlags.TRANSFER_WRITE).dstAccessMask(VkAccessFlags.SHADER_READ);

    sourceStage = VkPipelineStageFlags.TRANSFER;
    destinationStage = VkPipelineStageFlags.FRAGMENT_SHADER;
}
else {
    throw new RuntimeException(
            "Unsupported layout transition from "
            + VkImageLayout.explain(oldLayout)
            + " to "
            + VkImageLayout.explain(newLayout)
    );
}

deviceCommands.vkCmdPipelineBarrier(
        commandBuffer,
        sourceStage,
        destinationStage,
        0,
        0, null,
        0, null,
        1, barrier
);
```

As you can see in the aforementioned table, transfer writes must occur in the pipeline transfer stage. Since the writes don't have to wait on anything, you may specify an empty access mask and the earliest possible pipeline stage `VkPipelineStageFlags.TOP_OF_PIPE` for the pre-barrier operations. It should be noted that `VkPipelineStageFlgs.TRANSFER` is not a *real* stage within the graphics and compute pipelines. It is more of a pseudo-stage where transfers happen. See [the documentation](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap7.html#VkPipelineStageFlagBits) for more information and other examples of pseudo-stages.

The image will be written in the same pipeline stage and subsequently read by the fragment shader, which is why we specify shader reading access in the fragment shader pipeline stage.

If we need to do more transitions in the future, then we'll extend the function. The application should now run successfully, although there are of course no visual changes yet.

One thing to note is that command buffer submission results in implicit `VkAccessFlags.HOST_WRITE` synchronization at the beginning. Since the `transitionImageLayout` function executes a command buffer with only a single command, you could use this implicit synchronization and set `srcAccessMask` to `0` if you ever needed a `VkAccessFlags.HOST_WRITE` dependency in a layout transition. It's up to you if you want to be explicit about it or not, but I'm personally not a fan of relying on these OpenGL-like "hidden" operations.

There is actually a special type of image layout that supports all operations, `VkImageLayout.GENERAL`. The problem with it, of course, is that it doesn't necessarily offer the best performance for any operation. It is required for some special cases, like using an image as both input and output, or for reading an image after it has left the pre-initialized layout.

All the helper functions that submit commands so far have been set up to execute synchronously by waiting for the queue to become idle. For practical applications it is recommended to combine these operations in a single command buffer and execute them asynchronously for higher throughput, especially the transitions and copy in the `createTextureImage` function. Try to experiment with this by creating a `setupCommandBuffer` that the helper functions record commands into, and add a `flushSetupCommands` to execute the commands that have been recorded so far. It's best to do this after the texture mapping works to check if the texture resources are still set up correctly.

## Cleanup

Finish the `createTextureImage` function by cleaning up the staging buffer and its memory at the end:

```java
deviceCommands.destroyBuffer(device, stagingBuffer, null);
deviceCommands.freeMemory(device, stagingBufferMemory, null);
```

The main texture image is used until the end of the program:

```java
private void cleanup() {
    // ...
    cleanupSwapChain();

    deviceCommands.destroyImage(device, textureImage, null);
    deviceCommands.freeMemory(device, textureImageMemory, null);
}
```

The image now contains the texture, but we still need a way to access it from the graphics pipeline. We'll work on that in the next chapter.
