# Image view and sampler

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/packages/tutorial/src/main/java/tutorial/vulkan/part08/ch25/Main.java) | [C++ version](https://vulkan-tutorial.com/Texture_mapping/Image_view_and_sampler)

In this chapter we're going to create two more resources that are needed for the graphics pipeline to sample an image. The first resource is one that we've already seen before while working with the swap chain images, but the second one is new - it relates to how the shader will read texels from the image.

## Texture image view

We've seen before, with the swap chain images and the framebuffer, that images are accessed through image views rather than directly. We will also need to create such an image view for the texture image.

Add a class member to hold a `VkImageView` for the texture image and create a new function `createTextureImageView` where we'll create it:

```java
private VkImageView textureImageView;

// ...

private void initVulkan() {
    // ...
    createTextureImage();
    createTextureImageView();
    // ...
}

private void createTextureImageView() {
}
```

The code for this function can be based directly on `createImageViews`. The only two changes you have to make are the format and the image:

```java
try (var arena = Arena.ofConfined()) {
    var viewInfo = VkImageViewCreateInfo.allocate(arena)
            .image(textureImage)
            .viewType(VkImageViewType._2D)
            .format(VkFormat.R8G8B8A8_SRGB)
            .subresourceRange(it -> it
                    .aspectMask(VkImageAspectFlags.COLOR)
                    .baseMipLevel(0)
                    .levelCount(1)
                    .baseArrayLayer(0)
                    .layerCount(1));
}
```

I've left out the explicit `viewInfo.components` initialization, because `VkComponentSwizzle.IDENTITY` is defined as `0` anyway. Finish creating the image view by calling `VkDeviceCommands::createImageView`:

```java
var pImageView = VkImageView.Ptr.allocate(arena);
var result = deviceCommands.createImageView(device, viewInfo, null, pImageView);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create texture image view, vulkan error code: " + VkResult.explain(result));
}
textureImageView = Objects.requireNonNull(pImageView.read());
```

Because so much of the logic is duplicated from `createImageViews`, you may wish to abstract it into a new `createImageView` function:

```java
private VkImageView createImageView(VkImage image, @EnumType(VkFormat.class) int format) {
    try (var arena = Arena.ofConfined()) {
        var viewInfo = VkImageViewCreateInfo.allocate(arena)
                .image(image)
                .viewType(VkImageViewType._2D)
                .format(format)
                .subresourceRange(it -> it
                        .aspectMask(VkImageAspectFlags.COLOR)
                        .baseMipLevel(0)
                        .levelCount(1)
                        .baseArrayLayer(0)
                        .layerCount(1));

        var pImageView = VkImageView.Ptr.allocate(arena);
        var result = deviceCommands.createImageView(device, viewInfo, null, pImageView);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to create image view, vulkan error code: " + VkResult.explain(result));
        }
        return Objects.requireNonNull(pImageView.read());
    }
}
```

The `createTextureImageView` function can now be simplified to:

```java
private void createTextureImageView() {
    textureImageView = createImageView(textureImage, VkFormat.R8G8B8A8_SRGB);
}
```

And `createImageViews` can be simplified to:

```java
private void createImageViews() {
    swapChainImageViews = VkImageView.Ptr.allocate(Arena.ofAuto(), swapChainImages.size());
    for (long i = 0; i < swapChainImages.size(); i++) {
        swapChainImageViews.write(i, createImageView(swapChainImages.read(i), swapChainImageFormat));
    }
}
```

Make sure to destroy the image view at the end of the program, right before destroying the image itself:

```java
private void cleanup() {
    // ...
    deviceCommands.destroyImageView(device, textureImageView, null);
    deviceCommands.destroyImage(device, textureImage, null);
    // ...
}
```

## Samplers

It is possible for shaders to read texels directly from images, but that is not very common when they are used as textures. Textures are usually accessed through samplers, which will apply filtering and transformations to compute the final color that is retrieved.

These filters are helpful to deal with problems like oversampling. Consider a texture that is mapped to geometry with more fragments than texels. If you simply took the closest texel for the texture coordinate in each fragment, then you would get a result like the first image:

![Nearest filtering](../../images/texture_filtering.png)

If you combined the 4 closest texels through linear interpolation, then you would get a smoother result like the one on the right. Of course your application may have art style requirements that fit the left style more (think Minecraft), but the right is preferred in conventional graphics applications. A sampler object automatically applies this filtering for you when reading a color from the texture.

Under sampling is the opposite problem, where you have more texels than fragments. This will lead to artifacts when sampling high frequency patterns like a checkerboard texture at a sharp angle:

![Anisotropic filtering](../../images/anisotropic_filtering.png)

As shown in the left image, the texture turns into a blurry mess in the distance. The solution to this is [anisotropic filtering](https://en.wikipedia.org/wiki/Anisotropic_filtering), which can also be applied automatically by a sampler.

Aside from these filters, a sampler can also take care of transformations. It determines what happens when you try to read texels outside the image through its *addressing mode*. The image below displays some of the possibilities:

![Texture addressing](../../images/texture_addressing.png)

We will now create a function `createTextureSampler` to set up such a sampler object. We'll be using that sampler to read colors from the texture in the shader later on.

```java
private void initVulkan() {
    // ...
    createTextureImage();
    createTextureImageView();
    createTextureSampler();
    // ...
}

// ...

private void createTextureSampler() {
}
```

Samplers are configured through a `VkSamplerCreateInfo` structure, which specifies all filters and transformations that it should apply.

```java
try (var arena = Arena.ofConfined()) {
    var samplerInfo = VkSamplerCreateInfo.allocate(arena)
            .magFilter(VkFilter.LINEAR)
            .minFilter(VkFilter.LINEAR);
}
```

The `magFilter` and `minFilter` fields specify how to interpolate texels that are magnified or minified. Magnification concerns the oversampling problem describes above, and minification concerns undersampling. The choices are `VkFilter.LINEAR` and `VkFilter.NEAREST`, corresponding to the modes demonstrated in the images above.

```java
samplerInfo
        .addressModeU(VkSamplerAddressMode.REPEAT)
        .addressModeV(VkSamplerAddressMode.REPEAT)
        .addressModeW(VkSamplerAddressMode.REPEAT);
```

The addressing mode can be specified per axis using the `addressMode` fields. The available values are listed below. Most of these are demonstrated in the image above. Note that the axes are called U, V and W instead of X, Y and Z. This is a convention for texture space coordinates.

- `VkSamplerAddressMode.REPEAT`: Repeat the texture when going beyond the image dimensions.
- `VkSamplerAddressMode.MIRRORED_REPEAT`: Like repeat, but inverts the coordinates to mirror the image when going beyond the dimensions.
- `VkSamplerAddressMode.CLAMP_TO_EDGE`: Take the color of the edge closest to the coordinate beyond the image dimensions.
- `VkSamplerAddressMode.MIRROR_CLAMP_TO_EDGE`: Like clamp to edge, but instead uses the edge opposite to the closest edge.
- `VkSamplerAddressMode.CLAMP_TO_BORDER`: Return a solid color when sampling beyond the dimensions of the image.
                              
It doesn't really matter which addressing mode we use here, because we're not going to sample outside of the image in this tutorial. However, the repeat mode is probably the most common mode, because it can be used to tile textures like floors and walls.
                                                                       
```java
samplerInfo
        .anisotropyEnable(VkConstants.TRUE)
        .maxAnisotropy(/* ???*/);
```

These two fields specify if anisotropic filtering should be used. There is no reason not to use this unless performance is a concern. The `maxAnisotropy` field limits the amount of texel samples that can be used to calculate the final color. A lower value results in better performance, but lower quality results. To figure out which value we can use, we need to retrieve the properties of the physical device like so:

```java
var properties = VkPhysicalDeviceProperties.allocate(arena);
instanceCommands.getPhysicalDeviceProperties(physicalDevice, properties);
```

If you look at the documentation for the `VkPhysicalDeviceProperties` structure, you'll see that it contains a `VkPhysicalDeviceLimits` member named limits. This struct in turn has a member called `maxSamplerAnisotropy` and this is the maximum value we can specify for `maxAnisotropy`. If we want to go for maximum quality, we can simply use that value directly:

```java
samplerInfo.maxAnisotropy(properties.limits().maxSamplerAnisotropy());
```

You can either query the properties at the beginning of your program and pass them around to the functions that need them, or query them in the `createTextureSampler` function itself.

```java
samplerInfo.borderColor(VkBorderColor.INT_OPAQUE_BLACK);
```

The `borderColor` field specifies which color is returned when sampling beyond the image with clamp to border addressing mode. It is possible to return black, white or transparent in either float or int formats. You cannot specify an arbitrary color.

```java
samplerInfo.unnormalizedCoordinates(VkConstants.FALSE);
```

The `unnormalizedCoordinates` field specifies which coordinate system you want to use to address texels in an image. If this field is `VkConstants.TRUE`, then you can simply use coordinates within the `[0, texWidth)` and `[0, texHeight)` range. If it is `VkConstants.FALSE`, then the texels are addressed using the `[0, 1)` range on all axes. Real-world applications almost always use normalized coordinates, because then it's possible to use textures of varying resolutions with the exact same coordinates.

```java
samplerInfo
        .compareEnable(VkConstants.FALSE)
        .compareOp(VkCompareOp.ALWAYS);
```

If a comparison function is enabled, then texels will first be compared to a value, and the result of that comparison is used in filtering operations. This is mainly used for percentage-closer filtering on shadow maps. We'll look at this in a future chapter.

```java
samplerInfo
        .mipmapMode(VkSamplerMipmapMode.LINEAR)
        .mipLodBias(0.0f)
        .minLod(0.0f)
        .maxLod(0.0f);
```

All of these fields apply to mipmapping. We will look at mipmapping in a later chapter, but basically it's another type of filter that can be applied.

The functioning of the sampler is now fully defined. Add a class member to hold the handle of the sampler object and create the sampler with `VkDeviceCommands::createSampler`:

```java
private VkSampler textureSampler;

// ...

var pSampler = VkSampler.Ptr.allocate(arena);
var result = deviceCommands.createSampler(device, samplerInfo, null, pSampler);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create texture sampler, vulkan error code: " + VkResult.explain(result));
}
textureSampler = Objects.requireNonNull(pSampler.read());
```

Note the sampler does not reference a `VkImage` anywhere. The sampler is a distinct object that provides an interface to extract colors from a texture. It can be applied to any image you want, whether it is 1D, 2D or 3D. This is different from many older APIs, which combined texture images and filtering into a single state.

Destroy the sampler at the end of the program when we'll no longer be accessing the image:

```java
private void cleanup() {
    // ...
    deviceCommands.destroySampler(device, textureSampler, null);
    deviceCommands.destroyImageView(device, textureImageView, null);
    // ...
}
```

## Anisotropy device feature

If you run your program right now, you'll see a validation layer message like this:

```
Validation layer: vkCreateSampler(): pCreateInfo->anisotropyEnable is VK_TRUE but the samplerAnisotropy feature was not enabled.
The Vulkan spec states: If the samplerAnisotropy feature is not enabled, anisotropyEnable must be VK_FALSE (https://docs.vulkan.org/spec/latest/chapters/samplers.html#VUID-VkSamplerCreateInfo-anisotropyEnable-01070)
```

That's because anisotropic filtering is actually an optional device feature. We need to update the `createLogicalDevice` function to request it:

```java
var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);
deviceFeatures.samplerAnisotropy(VkConstants.TRUE);
```

And even though it is very unlikely that a modern graphics card will not support it, we should update `isDeviceSuitable` to check if it is available:

```java
var supportedFeatures = VkPhysicalDeviceFeatures.allocate(arena);
instanceCommands.getPhysicalDeviceFeatures(device, supportedFeatures);
instanceCommands.getPhysicalDeviceFeatures(device, supportedFeatures);
return swapChainSupport.formats().size() != 0
       && swapChainSupport.presentModes().size() != 0
       && supportedFeatures.samplerAnisotropy() == VkConstants.TRUE;
```

The `VkInstanceCommands::getPhysicalDeviceFeatures` repurposes the `VkPhysicalDeviceFeatures` struct to indicate which features are supported rather than requested by setting the boolean values.

Instead of enforcing the availability of anisotropic filtering, it's also possible to simply not use it by conditionally setting:

```java
samplerInfo
        .anisotropyEnable(VkConstants.FALSE)
        .maxAnisotropy(1.0f);
```

In the next chapter we will expose the image and sampler objects to the shaders to draw the texture onto the square.

You should see something like the image below. Don't forget to recompile the shaders!

![Texture coordinate visualization](../../images/texcoord_visualization.png)

The green channel represents the horizontal coordinates and the red channel the vertical coordinates. The black and yellow corners confirm that the texture coordinates are correctly interpolated from `0, 0` to `1, 1` across the square. Visualizing data using colors is the shader programming equivalent of printf debugging, for lack of a better option!

A combined image sampler descriptor is represented in GLSL by a sampler uniform. Add a reference to it in the fragment shader:

```glsl
layout(binding = 1) uniform sampler2D texSampler;
```

There are equivalent `sampler1D` and `sampler3D` types for other types of images. Make sure to use the correct binding here.

```glsl
void main() {
    outColor = texture(texSampler, fragTexCoord);
}
```

Textures are sampled using the built-in `texture` function. It takes a `sampler` and coordinate as arguments. The sampler automatically takes care of the filtering and transformations in the background. You should now see the texture on the square when you run the application:

![Texture on square](../../images/texture_on_square.png)

Try experimenting with the addressing modes by scaling the texture coordinates to values higher than `1`. For example, the following fragment shader produces the result in the image below when using `VkSamplerAddressMode.REPEAT`:

![Texture on square repeated](../../images/texture_on_square_repeated.png)

You can also manipulate the texture colors using the vertex colors:

```glsl
void main() {
    outColor = vec4(fragColor * texture(texSampler, fragTexCoord).rgb, 1.0);
}
```

I've separated the RGB and alpha channels here to not scale the alpha channel.

![Texture on square colorized](../../images/texture_on_square_colorized.png)

You now know how to access images in shaders! This is a very powerful technique when combined with images that are also written to in framebuffers. You can use these images as inputs to implement cool effects like post-processing and camera displays within the 3D world.
