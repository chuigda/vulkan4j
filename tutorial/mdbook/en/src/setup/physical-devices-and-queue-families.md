# Physical devices and queue families

## Selecting a physical device

After initializing the Vulkan library through a `VkInstance` we need to look for and select a graphics card in the system that supports the features we need. In fact, we can select any number of graphics cards and use them simultaneously, but in this tutorial we'll stick to the first graphics card that suits our needs.

We'll add a function `pickPhysicalDevice` and add a call to it in the `initVulkan` function.

```java
private void initVulkan() {
    // ...
    pickPhysicalDevice();
}

private void pickPhysicalDevice() {
}
```

The graphics card that we'll end up selecting will be stored in a `VkPhysicalDevice` handle that is added as a new class member. This object will be implicitly destroyed when the `VkInstance` is destroyed, so we won't need to do anything new in the cleanup function.

```java
private VkPhysicalDevice physicalDevice;
```

Listing the graphics cards is very similar to listing extensions and starts with querying just the number. If there are 0 devices with Vulkan support then there is no point going further.

```java
private void pickPhysicalDevice() {
    try (var arena = Arena.ofConfined()) {
        var pDeviceCount = IntBuffer.allocate(arena);
        var result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, null);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
        }

        var deviceCount = pDeviceCount.read();
        if (deviceCount == 0) {
            throw new RuntimeException("Failed to find GPUs with Vulkan support");
        }
    }
}
```

Otherwise, we can now allocate an array to hold all the VkPhysicalDevice handles.

```java
var pDevices = VkPhysicalDevice.Buffer.allocate(arena, deviceCount);
result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, pDevices);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
}
var devices = pDevices.readAll();
```

Now we need to evaluate each of them and check if they are suitable for the operations we want to perform, because not all graphics cards are created equal. For that we'll introduce a new function:

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return true;
}
```

And we'll check if any of the physical devices meet the requirements that we'll add to that function.

```java
for (var device : devices) {
    if (isDeviceSuitable(device)) {
        physicalDevice = device;
        break;
    }
}

if (physicalDevice == null) {
    throw new RuntimeException("Failed to find a suitable GPU");
}
```

The next section will introduce the first requirements that we'll check for in the `isDeviceSuitable` function. As we'll start using more Vulkan features in the later chapters we will also extend this function to include more checks.

## Base device suitability checks

To evaluate the suitability of a device we can start by querying for some details. Basic device properties like the name, type and supported Vulkan version can be queried using `vkGetPhysicalDeviceProperties`.

```java
var properties = VkPhysicalDeviceProperties.allocate(arena);
instanceCommands.vkGetPhysicalDeviceProperties(device, properties);
```

The support for optional features like texture compression, 64-bit floats and multi viewport rendering (useful for VR) can be queried using `vkGetPhysicalDeviceFeatures`:

```java
var features = VkPhysicalDeviceFeatures.allocate(arena);
instanceCommands.vkGetPhysicalDeviceFeatures(device, features);
```

There are more details that can be queried from devices that we'll discuss later concerning device memory and queue families (see the next section).

As an example, let's say we consider our application only usable for dedicated graphics cards that support geometry shaders. Then the `isDeviceSuitable` function would look like this:

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    try (var arena = Arena.ofConfined()) {
        var properties = VkPhysicalDeviceProperties.allocate(arena);
        instanceCommands.vkGetPhysicalDeviceProperties(device, properties);

        var features = VkPhysicalDeviceFeatures.allocate(arena);
        instanceCommands.vkGetPhysicalDeviceFeatures(device, features);

        return properties.deviceType() == VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU &&
                features.geometryShader() == Constants.VK_TRUE;
    }
}
```

Instead of just checking if a device is suitable or not and going with the first one, you could also give each device a score and pick the highest one. That way you could favor a dedicated graphics card by giving it a higher score, but fall back to an integrated GPU if that's the only available one. Of course, you can also just display the names of the choices and allow the user to select.

Because we're just starting out, Vulkan support is the only thing we need, and therefore we'll settle for just any GPU:

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return true;
} 
```

In the next section we'll discuss the first real required feature to check for.

## Queue families

It has been briefly touched upon before that almost every operation in Vulkan, anything from drawing to uploading textures, requires commands to be submitted to a queue. There are different types of queues that originate from different *queue families* and each family of queues allows only a subset of commands. For example, there could be a queue family that only allows processing of compute commands or one that only allows memory transfer related commands.

We need to check which queue families are supported by the device and which one of these supports the commands that we want to use. For that purpose we'll add a new function `findQueueFamilies` that looks for all the queue families we need.

Right now we are only going to look for a queue that supports graphics commands, so the function could look like this:

```java
private int findQueueFamilies(VkPhysicalDevice device) {
    // Logic to find graphics queue family
}
```

However, in one of the next chapters we're already going to look for yet another queue, so it's better to prepare for that and bundle the indices into a record:

```java
private record QueueFamilyIndices(int graphicsFamily) {}

private QueueFamilyIndices findQueueFamilies(VkPhysicalDevice device) {
    // Logic to find queue family indices to create record with
}
```

The process of retrieving the list of queue families is exactly what you expect and uses `vkGetPhysicalDeviceQueueFamilyProperties`:

```java
try (var arena = Arena.ofConfined()) {
    var pQueueFamilyCount = IntBuffer.allocate(arena);
        instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, null);
    
    var queueFamilyCount = pQueueFamilyCount.read();
    var queueFamilies = VkQueueFamilyProperties.allocate(arena, queueFamilyCount);
        instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, queueFamilies[0]);
}
```

The `VkQueueFamilyProperties` struct contains some details about the queue family, including the type of operations that are supported and the number of queues that can be created based on that family. We need to find at least one queue family that supports `VK_QUEUE_GRAPHICS_BIT`.

```java
Integer graphicsFamily = null;
for (int i = 0; i < queueFamilyCount; i++) {
    if (queueFamilies[i].queueCount() > 0 && (queueFamilies[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
        graphicsFamily = i;
        break;
    }
}

if (graphicsFamily != null) {
    return new QueueFamilyIndices(graphicsFamily);
}
else {
    return null;
}
```

Now that we have this fancy queue family lookup function, we can use it as a check in the `isDeviceSuitable` function to ensure that the device can process the commands we want to use:

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return findQueueFamilies(device) != null;
}
```

Great, that's all we need for now to find the right physical device! The next step is to [create a logical device](logical-device-and-queues.md) to interface with it.
