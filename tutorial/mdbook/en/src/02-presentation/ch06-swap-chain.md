# Swap chain

> [Java code](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part02/ch06/Main.java)

Vulkan does not have the concept of a "default framebuffer", hence it requires an infrastructure that will own the buffers we will render to before we visualize them on the screen. This infrastructure is known as the swap chain and must be created explicitly in Vulkan. The swap chain is essentially a queue of images that are waiting to be presented to the screen. Our application will acquire such an image to draw to it, and then return it to the queue. How exactly the queue works and the conditions for presenting an image from the queue depend on how the swap chain is set up, but the general purpose of the swap chain is to synchronize the presentation of images with the refresh rate of the screen.

## Checking for swap chain support

Not all graphics cards are capable of presenting images directly to a screen for various reasons, for example because they are designed for servers and don't have any display outputs. Secondly, since image presentation is heavily tied into the window system and the surfaces associated with windows, it is not actually part of the Vulkan core. You have to enable the `VK_KHR_swapchain` device extension after querying for its support.

For that purpose we'll first extend the `isDeviceSuitable` function to check if this extension is supported. We've previously seen how to list the extensions that are supported by a `VkPhysicalDevice`, so doing that should be fairly straightforward. Note that the `vulkan4j` provides a nice named constant `VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME` hat is defined as `VK_KHR_swapchain`. The advantage of using this named constant is that the compiler will catch misspellings.

Create a new function `checkDeviceExtensionSupport` that is called from `isDeviceSuitable` as an additional check:

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    var indices = findQueueFamilies(device);
    var extensionsSupported = checkDeviceExtensionSupport(device);
    return (indices != null) && extensionsSupported;
}

boolean checkDeviceExtensionSupport(VkPhysicalDevice device) {
    return true;
}
```

Modify the body of the function to enumerate the extensions and check if all the required extensions are amongst them.

```java
private boolean checkDeviceExtensionSupport(VkPhysicalDevice device) {
    try (var arena = Arena.ofConfined()) {
        var pExtensionCount = IntPtr.allocate(arena);
        var result = instanceCommands.enumerateDeviceExtensionProperties(device, null, pExtensionCount, null);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
        }

        var extensionCount = pExtensionCount.read();
        var availableExtensions = VkExtensionProperties.allocate(arena, extensionCount);
        result = instanceCommands.enumerateDeviceExtensionProperties(device, null, pExtensionCount, availableExtensions);
        if (result != VkResult.SUCCESS) {
            throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
        }

        for (var extension : availableExtensions) {
            if (VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME.equals(extension.extensionName().readString())) {
                return true;
            }
        }

        return false;
    }
}
```

Now run the code and verify that your graphics card is indeed capable of creating a swap chain. It should be noted that the availability of a presentation queue, as we checked in the previous chapter, implies that the swap chain extension must be supported. However, it's still good to be explicit about things, and the extension does have to be explicitly enabled.

## Enabling device extensions

Using a swapchain requires enabling the `VK_KHR_swapchain` extension first. Enabling the extension just requires a small change to the logical device creation structure:

```java
deviceCreateInfo.enabledExtensionCount(1);
var ppEnabledExtensionNames = PointerPtr.allocate(arena);
ppEnabledExtensionNames.write(BytePtr.allocateString(arena, VkConstants.KHR_SWAPCHAIN_EXTENSION_NAME));
deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);
```

## Querying details of swap chain support

Just checking if a swap chain is available is not sufficient, because it may not actually be compatible with our window surface. Creating a swap chain also involves a lot more settings than instance and device creation, so we need to query for some more details before we're able to proceed.

There are basically three kinds of properties we need to check:

- Basic surface capabilities (min/max number of images in swap chain, min/max width and height of images)
- Surface formats (pixel format, color space)
- Available presentation modes

Similar to `findQueueFamilies`, we'll use a record to pass these details around once they've been queried. The three aforementioned types of properties come in the form of the following structs and lists of structs:

```java
private record SwapchainSupportDetails(
        VkSurfaceCapabilitiesKHR capabilities,
        VkSurfaceFormatKHR.Ptr formats,
        @EnumType(VkPresentModeKHR.class) IntPtr presentModes
) {}
```

We'll now create a new function `querySwapChainSupport` that will populate this struct.

```java
private SwapchainSupportDetails querySwapChainSupport(VkPhysicalDevice device, Arena arena) {
}
```

This section covers how to query the structs that include this information. The meaning of these structs and exactly which data they contain is discussed in the next section.

Let's start with the basic surface capabilities. These properties are simple to query and are returned into a single `VkSurfaceCapabilitiesKHR` struct.

```java
var surfaceCapabilities = VkSurfaceCapabilitiesKHR.allocate(arena);
var result = instanceCommands.getPhysicalDeviceSurfaceCapabilitiesKHR(device, surface, surfaceCapabilities);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to get physical device surface capabilities, vulkan error code: " + VkResult.explain(result));
}
```

This function takes the specified `VkPhysicalDevice` and `VkSurfaceKHR` window surface into account when determining the supported capabilities. All the support querying functions have these two as first parameters because they are the core components of the swap chain.

The next step is about querying the supported surface formats. Because this is a list of structs, it follows the familiar ritual of 2 function calls:

```java
try (var localArena = Arena.ofConfined()) {
    var pFormatCount = IntPtr.allocate(localArena);
    result = instanceCommands.getPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, null);
    if (result != VkResult.SUCCESS) {
        throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
    }

    var formatCount = pFormatCount.read();
    var formats = VkSurfaceFormatKHR.allocate(arena, formatCount);
    result = instanceCommands.getPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, formats);
    if (result != VkResult.SUCCESS) {
        throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
    }
}
```

And finally, querying the supported presentation modes works exactly the same way with `VkInstanceCommands::getPhysicalDeviceSurfacePresentModesKHR`:

```java
var pPresentModeCount = IntPtr.allocate(localArena);
result = instanceCommands.getPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, null);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
}

var presentModeCount = pPresentModeCount.read();
var presentModes = IntPtr.allocate(arena, presentModeCount);
result = instanceCommands.getPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, presentModes);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
}

return new SwapchainSupportDetails(surfaceCapabilities, formats, presentModes);
```

All the details are in the struct now, so let's extend `isDeviceSuitable` once more to utilize this function to verify that swap chain support is adequate. Swap chain support is sufficient for this tutorial if there is at least one supported image format and one supported presentation mode given the window surface we have.

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    var indices = findQueueFamilies(device);
    var extensionsSupported = checkDeviceExtensionSupport(device);
    if ((indices == null) || !extensionsSupported) {
        return false;
    }

    try (var arena = Arena.ofConfined()) {
        var swapChainSupport = querySwapChainSupport(device, arena);
        return swapChainSupport.formats().size() != 0 && swapChainSupport.presentModes().size() != 0;
    }
}
```

It is important that we only try to query for swap chain support after verifying that the extension is available.

## Choosing the right settings for the swap chain

If the `swapChainSupport` conditions were met then the support is definitely sufficient, but there may still be many different modes of varying optimality. We'll now write a couple of functions to find the right settings for the best possible swap chain. There are three types of settings to determine:

- Surface format (color depth)
- Presentation mode (conditions for "swapping" images to the screen)
- Swap extent (resolution of images in swap chain)

For each of these settings we'll have an ideal value in mind that we'll go with if it's available and otherwise we'll create some logic to find the next best thing.

### Surface format

The function for this setting starts out like this. We'll later pass the `formats` member of the `SwapChainSupportDetails` struct as argument.

```java
private VkSurfaceFormatKHR chooseSwapSurfaceFormat(VkSurfaceFormatKHR[] formats) {
}
```

Each `VkSurfaceFormatKHR` entry contains a `format` and a `colorSpace` member. The format member specifies the color channels and types. For example, `VK_FORMAT_B8G8R8A8_SRGB` means that we store the B, G, R and alpha channels in that order with an 8-bit unsigned integer for a total of 32 bits per pixel. The `colorSpace` member indicates if the SRGB color space is supported or not using the `VK_COLOR_SPACE_SRGB_NONLINEAR_KHR` flag. Note that this flag used to be called `VK_COLORSPACE_SRGB_NONLINEAR_KHR` in old versions of the specification.

For the color space we'll use SRGB if it is available, because it [results in more accurate perceived colors](http://stackoverflow.com/questions/12524623/). It is also pretty much the standard color space for images, like the textures we'll use later on. Because of that we should also use an SRGB color format, of which one of the most common ones is `VK_FORMAT_B8G8R8A8_SRGB`.

Let's go through the list and see if the preferred combination is available:

```java
for (var format : formats) {
    if (format.format() == VkFormat.B8G8R8A8_SRGB
        && format.colorSpace() == VkColorSpaceKHR.SRGB_NONLINEAR) {
        return format;
    }
}
```

If that also fails then we could start ranking the available formats based on how "good" they are, but in most cases it's okay to just settle with the first format that is specified.

```java
private VkSurfaceFormatKHR chooseSwapSurfaceFormat(VkSurfaceFormatKHR.Ptr formats) {
    for (var format : formats) {
        if (format.format() == VkFormat.B8G8R8A8_SRGB
            && format.colorSpace() == VkColorSpaceKHR.SRGB_NONLINEAR) {
            return format;
        }
    }

    return formats.at(0);
}
```

### Presentation mode

The presentation mode is arguably the most important setting for the swap chain, because it represents the actual conditions for showing images to the screen. There are four possible modes available in Vulkan:


- `VK_PRESENT_MODE_IMMEDIATE_KHR`: Images submitted by your application are transferred to the screen right away, which may result in tearing.
- `VK_PRESENT_MODE_FIFO_KHR`: The swap chain is a queue where the display takes an image from the front of the queue when the display is refreshed and the program inserts rendered images at the back of the queue. If the queue is full then the program has to wait. This is most similar to vertical sync as found in modern games. The moment that the display is refreshed is known as "vertical blank".
- `VK_PRESENT_MODE_FIFO_RELAXED_KHR`: This mode only differs from the previous one if the application is late and the queue was empty at the last vertical blank. Instead of waiting for the next vertical blank, the image is transferred right away when it finally arrives. This may result in visible tearing.
- `VK_PRESENT_MODE_MAILBOX_KHR`: This is another variation of the second mode. Instead of blocking the application when the queue is full, the images that are already queued are simply replaced with the newer ones. This mode can be used to render frames as fast as possible while still avoiding tearing, resulting in fewer latency issues than standard vertical sync. This is commonly known as "triple buffering", although the existence of three buffers alone does not necessarily mean that the framerate is unlocked.

Only the `VK_PRESENT_MODE_FIFO_KHR` mode is guaranteed to be available, so we'll again have to write a function that looks for the best mode that is available:

```java
private @EnumType(VkPresentModeKHR.class) int chooseSwapPresentMode(
        @EnumType(VkPresentModeKHR.class) IntPtr presentModes
) {
    return VkPresentModeKHR.FIFO;
}
```

I personally think that `VK_PRESENT_MODE_MAILBOX_KHR` is a very nice trade-off if energy usage is not a concern. It allows us to avoid tearing while still maintaining a fairly low latency by rendering new images that are as up-to-date as possible right until the vertical blank. On mobile devices, where energy usage is more important, you will probably want to use `VK_PRESENT_MODE_FIFO_KHR` instead. Now, let's look through the list to see if `VK_PRESENT_MODE_MAILBOX_KHR` is available:

```java
private @EnumType(VkPresentModeKHR.class) int chooseSwapPresentMode(
        @EnumType(VkPresentModeKHR.class) IntPtr presentModes
) {
    for (int presentMode : presentModes) {
        if (presentMode == VkPresentModeKHR.MAILBOX) {
            return presentMode;
        }
    }
    return VkPresentModeKHR.FIFO;
}
```

### Swap extent

That leaves only one major property, for which we'll add one last function:

```java
private VkExtent2D chooseSwapExtent(VkSurfaceCapabilitiesKHR capabilities, Arena arena) {
}
```

The swap extent is the resolution of the swap chain images and it's almost always exactly equal to the resolution of the window that we're drawing to in pixels (more on that in a moment). The range of the possible resolutions is defined in the `VkSurfaceCapabilitiesKHR` structure. Vulkan tells us to match the resolution of the window by setting the width and height in the `currentExtent` member. However, some window managers do allow us to differ here and this is indicated by setting the width and height in `currentExtent` to a special value: the maximum value of `uint32_t`. In that case we'll pick the resolution that best matches the window within the `minImageExtent` and `maxImageExtent` bounds. But we must specify the resolution in the correct unit.

GLFW uses two units when measuring sizes: pixels and [screen coordinates](https://www.glfw.org/docs/latest/intro_guide.html#coordinate_systems). For example, the resolution `{WIDTH, HEIGHT}` that we specified earlier when creating the window is measured in screen coordinates. But Vulkan works with pixels, so the swap chain extent must be specified in pixels as well. Unfortunately, if you are using a high DPI display (like Apple's Retina display), screen coordinates don't correspond to pixels. Instead, due to the higher pixel density, the resolution of the window in pixel will be larger than the resolution in screen coordinates. So if Vulkan doesn't fix the swap extent for us, we can't just use the original `{WIDTH, HEIGHT}`. Instead, we must use `GLFW::getFramebufferSize` to query the resolution of the window in pixel before matching it against the minimum and maximum image extent.

```java
private VkExtent2D chooseSwapExtent(VkSurfaceCapabilitiesKHR capabilities, Arena arena) {
    if (capabilities.currentExtent().width() != NativeLayout.UINT32_MAX) {
        return capabilities.currentExtent();
    }
    else {
        try (var localArena = Arena.ofConfined()) {
            var pWidth = IntPtr.allocate(localArena);
            var pHeight = IntPtr.allocate(localArena);
            glfw.getFramebufferSize(window, pWidth, pHeight);
            var width = pWidth.read();
            var height = pHeight.read();

            var actualExtent = VkExtent2D.allocate(arena);
            actualExtent.width(Math.clamp(width, capabilities.minImageExtent().width(), capabilities.maxImageExtent().width()));
            actualExtent.height(Math.clamp(height, capabilities.minImageExtent().height(), capabilities.maxImageExtent().height()));
            return actualExtent;
        }
    }
}
```

The `clamp` function is used here to bound the values of `width` and `height` between the allowed minimum and maximum extents that are supported by the implementation.

## Creating the swap chain

Now that we have all of these helper functions assisting us with the choices we have to make at runtime, we finally have all the information that is needed to create a working swap chain.

Create a `createSwapChain` function that starts out with the results of these calls and make sure to call it from `initVulkan` after logical device creation.

```java
private void initVulkan() {
    // ...
    createSwapchain();
}

private void createSwapchain() {
    try (var arena = Arena.ofConfined()) {
        var swapChainSupport = querySwapChainSupport(physicalDevice, arena);

        var surfaceFormat = chooseSwapSurfaceFormat(swapChainSupport.formats());
        var presentMode = chooseSwapPresentMode(swapChainSupport.presentModes());
        var extent = chooseSwapExtent(swapChainSupport.capabilities(), arena);
    }
}
```

Aside from these properties we also have to decide how many images we would like to have in the swap chain. The implementation specifies the minimum number that it requires to function:

```java
var imageCount = swapChainSupport.capabilities.minImageCount();
```

However, simply sticking to this minimum means that we may sometimes have to wait on the driver to complete internal operations before we can acquire another image to render to. Therefore it is recommended to request at least one more image than the minimum:

```java
var imageCount = swapChainSupport.capabilities.minImageCount() + 1;
```

We should also make sure to not exceed the maximum number of images while doing this, where 0 is a special value that means that there is no maximum:

```java
if (swapChainSupport.capabilities.maxImageCount() > 0 
    && imageCount > swapChainSupport.capabilities.maxImageCount()) {
    imageCount = swapChainSupport.capabilities.maxImageCount();
}
```

As is tradition with Vulkan objects, creating the swap chain object requires filling in a large structure. It starts out very familiarly:

```java
var createInfo = VkSwapchainCreateInfoKHR.allocate(arena);
createInfo.surface(surface);
```

After specifying which surface the swap chain should be tied to, the details of the swap chain images are specified:

```java
createInfo.minImageCount(imageCount);
createInfo.imageFormat(surfaceFormat.format());
createInfo.imageColorSpace(surfaceFormat.colorSpace());
createInfo.imageExtent(extent);
createInfo.imageArrayLayers(1);
createInfo.imageUsage(VkImageUsageFlags.COLOR_ATTACHMENT);
```

The `imageArrayLayers` specifies the amount of layers each image consists of. This is always `1` unless you are developing a stereoscopic 3D application. The `imageUsage` bit field specifies what kind of operations we'll use the images in the swap chain for. In this tutorial we're going to render directly to them, which means that they're used as color attachment. It is also possible that you'll render images to a separate image first to perform operations like post-processing. In that case you may use a value like `VK_IMAGE_USAGE_TRANSFER_DST_BIT` instead and use a memory operation to transfer the rendered image to a swap chain image.

```java
var indices = findQueueFamilies(physicalDevice);
assert indices != null : "Queue family indices should not be null";
if (indices.graphicsFamily != indices.presentFamily) {
    createInfo.imageSharingMode(VkSharingMode.CONCURRENT);
    createInfo.queueFamilyIndexCount(2);
    var pQueueFamilyIndices = IntPtr.allocate(arena, 2);
    pQueueFamilyIndices.write(0, indices.graphicsFamily());
    pQueueFamilyIndices.write(1, indices.presentFamily());
    createInfo.pQueueFamilyIndices(pQueueFamilyIndices);
}
else {
    createInfo.imageSharingMode(VkSharingMode.EXCLUSIVE);
}
```

Next, we need to specify how to handle swap chain images that will be used across multiple queue families. That will be the case in our application if the graphics queue family is different from the presentation queue. We'll be drawing on the images in the swap chain from the graphics queue and then submitting them on the presentation queue. There are two ways to handle images that are accessed from multiple queues:

- `VkSharingMode.EXCLUSIVE`: An image is owned by one queue family at a time and ownership must be explicitly transferred before using it in another queue family. This option offers the best performance.
- `VkSharingMode.CONCURRENT`: Images can be used across multiple queue families without explicit ownership transfers.

If the queue families differ, then we'll be using the concurrent mode in this tutorial to avoid having to do the ownership chapters, because these involve some concepts that are better explained at a later time. Concurrent mode requires you to specify in advance between which queue families ownership will be shared using the `queueFamilyIndexCount` and `pQueueFamilyIndices` parameters. If the graphics queue family and presentation queue family are the same, which will be the case on most hardware, then we should stick to exclusive mode, because concurrent mode requires you to specify at least two distinct queue families.

```java
createInfo.preTransform(swapChainSupport.capabilities.currentTransform());
```

We can specify that a certain transform should be applied to images in the swap chain if it is supported (`supportedTransforms` in `capabilities`), like a 90-degree clockwise rotation or horizontal flip. To specify that you do not want any transformation, simply specify the current transformation.

```java
createInfo.compositeAlpha(VkCompositeAlphaFlagsKHR.OPAQUE);
```

The `compositeAlpha` field specifies if the alpha channel should be used for blending with other windows in the window system. You'll almost always want to simply ignore the alpha channel, hence `VkCompositeAlpha.OPAQUE`.

```java
createInfo.presentMode(presentMode);
createInfo.clipped(VkConstants.TRUE);
```

The `presentMode` member speaks for itself. If the clipped member is set to VK_TRUE then that means that we don't care about the color of pixels that are obscured, for example because another window is in front of them. Unless you really need to be able to read these pixels back and get predictable results, you'll get the best performance by enabling clipping.

```java
createInfo.oldSwapchain(null); // optional
```

That leaves one last field, `oldSwapChain`. With Vulkan it's possible that your swap chain becomes invalid or suboptimal while your application is running, for example because the window was resized. In that case the swap chain actually needs to be recreated from scratch and a reference to the old one must be specified in this field. This is a complex topic that we'll learn more about in a future chapter. For now, we'll assume that we'll only ever create one swap chain.

Now add a class member to store the `VkSwapchainKHR` object:

```java
private VkSwapchainKHR swapChain;
```

Creating the swap chain is now as simple as calling `DeviceCommands::createSwapchainKHR`:

```java
var pSwapChain = VkSwapchainKHR.Ptr.allocate(arena);
var result = deviceCommands.createSwapchainKHR(device, createInfo, null, pSwapChain);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create swap chain, vulkan error code: " + VkResult.explain(result));
}
swapChain = Objects.requireNonNull(pSwapChain.read());
```

The parameters are the logical device, swap chain creation info, optional custom allocators and a pointer to the variable to store the handle in. No surprises there. It should be cleaned up using `VkDeviceCommands::destroySwapchainKHR` before the device:

```java
private void cleanup() {
    deviceCommands.destroySwapchainKHR(device, swapChain, null);
    // ...
}
```

Now run the application to ensure that the swap chain is created successfully! If at this point you get an access violation error in `VkDeviceCommands.createSwapchainKHR` or see a message like Failed to find `'vkGetInstanceProcAddress' in layer SteamOverlayVulkanLayer.dll`, then see the FAQ entry about the Steam overlay layer.

Try removing the `createInfo.imageExtent(extent);` line with validation layers enabled. You'll see that one of the validation layers immediately catches the mistake and a helpful message is printed:

```
Validation layer: vkCreateSwapchainKHR(): pCreateInfo->imageExtent (width = 0, height = 0) is invalid.
The Vulkan spec states: imageExtent members width and height must both be non-zero (https://docs.vulkan.org/spec/latest/chapters/VK_KHR_surface/wsi.html#VUID-VkSwapchainCreateInfoKHR-imageExtent-01689)
```

## Retrieving the swap chain images

The swap chain has been created now, so all that remains is retrieving the handles of the `VkImage`s in it. We'll reference these during rendering operations in later chapters. Add a class member to store the handles:

```
private VkImage.Ptr swapChainImages;
```

The images were created by the implementation for the swap chain, and they will be automatically cleaned up once the swap chain has been destroyed, therefore we don't need to add any cleanup code.

I'm adding the code to retrieve the handles to the end of the `createSwapChain` function, right after the `VkDeviceCommands::createSwapchainKHR` call. Retrieving them is very similar to the other times when we retrieved an array of objects from Vulkan. Remember that we only specified a minimum number of images in the swap chain, so the implementation is allowed to create a swap chain with more. That's why we'll first query the final number of images with `VkDeviceCommands::getSwapchainImagesKHR`, then resize the container and finally call it again to retrieve the handles.

```java
var pImageCount = IntPtr.allocate(arena);
result = deviceCommands.getSwapchainImagesKHR(device, swapChain, pImageCount, null);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
}
assert pImageCount.read() == imageCount : "Image count mismatch";

swapChainImages = VkImage.Ptr.allocate(Arena.ofAuto(), imageCount);
result = deviceCommands.getSwapchainImagesKHR(device, swapChain, pImageCount, swapChainImages);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
}
```

> Here we are allocating the `swapChainImages` array in the auto arena instead of the confined, temporary arena. This is because the swap chain images will be used throughout the lifetime of the application, so we need to ensure that they are not deallocated after function returns.

One last thing, store the format and extent we've chosen for the swap chain images in member variables. We'll need them in future chapters.

```java
private @EnumType(VkFormat.class) int swapChainImageFormat;
private VkExtent2D swapChainExtent;
...

swapChainImageFormat = surfaceFormat.format();
swapChainExtent = VkExtent2D.clone(Arena.ofAuto(), extent);
```

We now have a set of images that can be drawn onto and can be presented to the window. The next chapter will begin to cover how we can set up the images as render targets and then we start looking into the actual graphics pipeline and drawing commands!
