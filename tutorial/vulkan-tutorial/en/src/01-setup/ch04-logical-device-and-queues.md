# Logical device and queues

> [Java code](https://github.com/club-doki7/vulkan4j/tree/master/modules/tutorial/src/main/java/tutorial/vulkan/part01/ch04/Main.java) | [C++ version](https://vulkan-tutorial.com/Drawing_a_triangle/Setup/Logical_device_and_queues)

## Introduction

After selecting a physical device to use we need to set up a *logical device* to interface with it. The logical device creation process is similar to the instance creation process and describes the features we want to use. We also need to specify which queues to create now that we've queried which queue families are available. You can even create multiple logical devices from the same physical device if you have varying requirements.

Start by adding a new class member to store the logical device handle in.

```java
private VkDevice device;
```

Next, add a `createLogicalDevice` function that is called from `initVulkan`.

```java
private void initVulkan() {
    // ...
    createLogicalDevice();
}

private void createLogicalDevice() {
}
```

## Specifying the queues to be created

The creation of a logical device involves specifying a bunch of details in structs again, of which the first one will be `VkDeviceQueueCreateInfo`. This structure describes the number of queues we want for a single queue family. Right now we're only interested in a queue with graphics capabilities.

```java
var indices = findQueueFamilies(physicalDevice);
assert indices != null : "Queue family indices should not be null";

try (var arena = Arena.ofConfined()) {
    var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena)
            .queueCount(1)
            .queueFamilyIndex(indices.graphicsFamily())
            .pQueuePriorities(FloatPtr.allocateV(arena, 1.0f));
}
```

The currently available drivers will only allow you to create a small number of queues for each queue family, and you don't really need more than one. That's because you can create all the command buffers on multiple threads and then submit them all at once on the main thread with a single low-overhead call.

Vulkan lets you assign priorities to queues to influence the scheduling of command buffer execution using floating point numbers between `0.0` and `1.0`. This is required even if there is only a single queue.

## Specifying used device features

The next information to specify is the set of device features that we'll be using. These are the features that we queried support for with `VkInstanceCommands::getPhysicalDeviceFeatures` in the previous chapter, like geometry shaders. Right now we don't need anything special, so we can simply define it and leave everything to `VkConstants.FALSE`. We'll come back to this structure once we're about to start doing more interesting things with Vulkan.

```java
var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);
```

> Hint: make use of auto zero-init
> 
> All `MemorySegment`s allocated by for kinds of Java builtin arenas (`Arena.ofConfined`, `Arena.ofAuto`, `Arena.ofShared` and `Arena.global`) are automatically zero-initialized, thus the `allocate` series methods using these arenas will create structures with these zero-initialized segments.

## Creating the logical device

With the previous two structures in place, we can start filling in the main `VkDeviceCreateInfo` structure. First add pointers to the queue creation info and the device features.
```java
var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena)
        .queueCreateInfoCount(1)
        .pQueueCreateInfos(queueCreateInfo)
        .pEnabledFeatures(deviceFeatures);
```

The remainder of the information bears a resemblance to the `VkInstanceCreateInfo` struct and requires you to specify extensions and validation layers. The difference is that these are device specific this time.

An example of a device specific extension `is VK_KHR_swapchain`, which allows you to present rendered images from that device to windows. It is possible that there are Vulkan devices in the system that lack this ability, for example because they only support compute operations. We will come back to this extension in the swap chain chapter.

Previous implementations of Vulkan made a distinction between instance and device specific validation layers, but this is no longer the case. That means that the `enabledLayerCount` and `ppEnabledLayerNames` fields of `VkDeviceCreateInfo` are ignored by up-to-date implementations. However, it is still a good idea to set them anyway to be compatible with older implementations:

```java
if (ENABLE_VALIDATION_LAYERS) {
    deviceCreateInfo
            .enabledLayerCount(1)
            .ppEnabledLayerNames(PointerPtr.allocateStrings(arena, VALIDATION_LAYER_NAME));
}
```

We won't need any device specific extensions for now.

That's it, we're now ready to instantiate the logical device with a call to the appropriately named `VkInstanceCommands::createDevice` function.

```java
var pDevice = VkDevice.Ptr.allocate(arena);
var result = instanceCommands.createDevice(physicalDevice, deviceCreateInfo, null, pDevice);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create logical device, vulkan error code: " + VkResult.explain(result));
}
device = Objects.requireNonNull(pDevice.read());
```

The parameters are the physical device to interface with, the queue and usage info we just specified, the optional allocation callbacks pointer and a pointer to a variable to store the logical device handle in. Similarly to the instance creation function, this call can return errors based on enabling non-existent extensions or specifying the desired usage of unsupported features.

## Loading device level Vulkan commands

After creating the device, we can load the device level Vulkan commands. Add a new field to the `Application` class:

```java
private VkDeviceCommands deviceCommands;
```

Then load the device level commands in the `createLogicalDevice` function:

```java
deviceCommands = VulkanLoader.loadDeviceCommands(instance, device, staticCommands);
```

## Cleanup

The device should be destroyed in `cleanup` with the `VkDeviceCommands::dsestroyDevice` function:

```java
private void cleanup() {
    deviceCommands.destroyDevice(device, null);
    // ...
}
```

## Retrieving queue handles

The queues are automatically created along with the logical device, but we don't have a handle to interface with them yet. First add a class member to store a handle to the graphics queue:

```java
private VkQueue graphicsQueue;
```

Device queues are implicitly cleaned up when the device is destroyed, so we don't need to do anything in `cleanup`.

We can use the `getDeviceQueue` function to retrieve queue handles for each queue family. The parameters are the logical device, queue family, queue index and a pointer to the variable to store the queue handle in. Because we're only creating a single queue from this family, we'll simply use index `0`.

```java
var pQueue = VkQueue.Ptr.allocate(arena);
deviceCommands.getDeviceQueue(device, indices.graphicsFamily(), 0, pQueue);
graphicsQueue = Objects.requireNonNull(pQueue.read());
```

With the logical device and queue handles we can now actually start using the graphics card to do things! In the next few chapters we'll set up the resources to present results to the window system.
