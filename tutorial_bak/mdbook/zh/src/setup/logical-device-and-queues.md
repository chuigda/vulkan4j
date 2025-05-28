# 逻辑设备与队列

## 介绍

在选择了要使用的物理设备之后，我们需要创建一个与之交互的逻辑设备。创建逻辑设备的过程与创建实例的过程相似，即描述我们希望使用的功能。既然我们已经查询了可用的队列族，我们还需要指定要创建哪些队列。如果你有不同的需求，甚至可以从同一个物理设备创建多个逻辑设备。

首先添加一个新的类成员来存储逻辑设备的句柄。

```java
private VkDevice device;
```

接下来，添加一个 `createLogicalDevice` 函数，从 `initVulkan` 中调用。

```java
private void initVulkan() {
    // ...
    createLogicalDevice();
}

private void createLogicalDevice() {
}
```

## 指定要创建的队列

创建逻辑设备需要再创建一堆结构体来指定一堆细节，首先是 `VkDeviceQueueCreateInfo`。这个结构体描述了我们单个队列族需要的队列数量。现在，我们只对具备图形功能的队列感兴趣。

```java
var indices = findQueueFamilies(physicalDevice);
assert indices != null;

try (var arena = Arena.ofConfined()) {
    var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena);
    queueCreateInfo.queueCount(1);
    queueCreateInfo.queueFamilyIndex(indices.graphicsFamily());
}
```

当前可用的驱动程序只允许你为每个队列族创建少量队列，实际上你也确实不需要多个队列。因为你可以在多个线程上创建指令缓冲，然后在主线程上一次性提交它们，这样只需要一次低开销的调用。

Vulkan 允许你为队列分配优先级，使用介于 `0.0` 和 `1.0` 之间的浮点数来影响指令缓冲执行的调度。即使只创建一个队列，也需要指定优先级：

```java
var pQueuePriorities = FloatBuffer.allocate(arena);
pQueuePriorities.write(1.0f);
queueCreateInfo.pQueuePriorities(pQueuePriorities);
```

## 指定使用的设备功能

下一个需要指定的信息是我们将要使用的设备特性。这些特性是我们在上一章中通过 `vkGetPhysicalDeviceFeatures` 查询到的，比如几何着色器。现在我们不需要任何特殊的东西，所以我们可以简单地定义它，并将所有东西都保留为 `VK_FALSE`。一旦我们要开始使用 Vulkan 做更有趣的事情，我们会再回到这个结构体。

```java
var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);
```

## 创建逻辑设备

有了前两个结构体，我们可以开始填充主要的 `VkDeviceCreateInfo` 结构体。首先添加指向队列创建信息和设备功能的指针。

```java
var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena);
deviceCreateInfo.queueCreateInfoCount(1);
deviceCreateInfo.pQueueCreateInfos(queueCreateInfo);
deviceCreateInfo.pEnabledFeatures(deviceFeatures);
```

剩下的信息与 `VkInstanceCreateInfo` 结构体相似，需要你指定扩展和校验层。不同之处在于这次是设备特定的。

一个设备特定的扩展示例是 `VK_KHR_swapchain`，它允许你将从该设备渲染的图像呈现到窗口。可能系统中有一些 Vulkan 设备缺乏这种能力，例如因为它们只支持计算操作。我们将在交换链章节中回到这个扩展。

以前的 Vulkan 实现区分了实例和设备特定的校验层，但现在不再这样。这意味着 `VkDeviceCreateInfo` 的 `enabledLayerCount` 和 `ppEnabledLayerNames` 字段在最新的实现中被忽略。然而，为了与旧实现兼容，仍然最好设置它们：

```java
if (ENABLE_VALIDATION_LAYERS) {
    deviceCreateInfo.enabledLayerCount(1);
    PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(arena);
    ppEnabledLayerNames.write(ByteBuffer.allocateString(arena, VALIDATION_LAYER_NAME));
    deviceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);
}
```

现在我们不需要任何设备特定的扩展。

就是这样，我们现在可以通过调用名为 `vkCreateDevice` 的函数来实例化逻辑设备了。

```java
var pDevice = VkDevice.Buffer.allocate(arena);
var result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, pDevice);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to create logical device, vulkan error code: " + VkResult.explain(result));
}
device = pDevice.read();
```

参数是要与逻辑设备交互的物理设备、我们刚刚指定的队列和使用信息，以及可选的分配回调。与实例创建函数类似，如果启用不存在的扩展或指定了不支持的功能，则此调用可能会返回错误。

## 加载设备级 Vulkan 指令

在创建设备之后，我们可以加载设备级 Vulkan 指令。在 `Application` 类中添加一个新字段：

```java
private DeviceCommands deviceCommands;
```

然后在 `createLogicalDevice` 函数中加载设备级指令：

```java
deviceCommands = VulkanLoader.loadDeviceCommands(instance, device, staticCommands);
```

## 清理

设备应当在 `cleanup` 中使用 `vkDestroyDevice` 函数销毁：

```java
private void cleanup() {
    deviceCommands.vkDestroyDevice(device, null);
    // ...
}
```

## 检索队列句柄

队列会随着逻辑设备的创建而自动创建，但我们还没有取得与它们交互所用的句柄。首先添加一个类成员来存储图形队列的句柄：

```java
private VkQueue graphicsQueue;
```

设备队列会在设备销毁时自动清理，所以我们不需要在 `cleanup` 中做任何处理。

我们可以使用 `vkGetDeviceQueue` 函数来检索每个队列族的队列句柄。参数是逻辑设备、队列族和队列索引，以及一个指向存储队列句柄的变量的指针。因为我们只从该族中创建一个队列，所以我们只需使用索引 `0`。

```java
var pQueue = VkQueue.Buffer.allocate(arena);
deviceCommands.vkGetDeviceQueue(device, indices.graphicsFamily(), 0, pQueue);
graphicsQueue = pQueue.read();
```

有了逻辑设备和队列句柄，我们现在就可以真正开始使用显卡来执行任务了！在接下来的几章中，我们将设置资源以将结果呈现给窗口系统。
