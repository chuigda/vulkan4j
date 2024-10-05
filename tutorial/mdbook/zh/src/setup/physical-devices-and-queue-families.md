# 物理设备与队列族

## 选择物理设备

在通过 `VkInstance` 初始化 Vulkan 库之后，我们需要在系统中选择一个支持我们所需功能的显卡。事实上，我们可以选择任意多个显卡，并同时使用它们，不过在本教程中我们只会选择第一个满足我们需求的显卡。

我们会添加一个 `pickPhysicalDevice` 函数，并在 `initVulkan` 函数中调用它。

```java
private void initVulkan() {
    // ...
    pickPhysicalDevice();
}

private void pickPhysicalDevice() {
}
```

我们最终选择的显卡将会存储在一个 `VkPhysicalDevice` 句柄中，这个句柄会作为一个新的类成员添加。当 `VkInstance` 被销毁时，这个对象也会被隐式销毁，所以我们不需要在 cleanup 函数中做任何新的事情。

```java
private VkPhysicalDevice physicalDevice;
```

列出显卡与列出扩展非常相似，都是从查询数量开始。如果没有支持 Vulkan 的设备，那么继续下去就没有意义了。

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

否则，我们现在可以分配一个数组来存储所有 `VkPhysicalDevice` 句柄。

```java
var pDevices = VkPhysicalDevice.Buffer.allocate(arena, deviceCount);
result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, pDevices);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
}
var devices = pDevices.readAll();
```

现在我们需要评估每一个设备，并检查它们是否适合我们要执行的操作，因为并非所有显卡都是一样的。为此我们将引入一个新函数：

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return true;
}
```

然后我们将检查是否有任何物理设备满足我们将添加到该函数中的要求。

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

接下来的一节将介绍我们将在 `isDeviceSuitable` 函数中检查的第一个要求。随着我们在后面的章节中开始使用更多的 Vulkan 功能，我们还将扩展这个函数以包括更多的检查。

## 基础设备适用性检查

要评估一个物理设备是否满足我们的需求，我们需要从设备中查询一些详细信息。设备的名称、类型和支持的 Vulkan 版本等基本信息可以使用 `vkGetPhysicalDeviceProperties` 查询。

```java
var properties = VkPhysicalDeviceProperties.allocate(arena);
instanceCommands.vkGetPhysicalDeviceProperties(device, properties);
```

设备对可选特性，例如纹理压缩、64 位浮点类型和多视口渲染（在 VR 中很有用）的支持则可以使用 `vkGetPhysicalDeviceFeatures` 查询：

```java
var features = VkPhysicalDeviceFeatures.allocate(arena);
instanceCommands.vkGetPhysicalDeviceFeatures(device, features);
```

我们会在讨论设备内存和队列族（见下一节）的时候再讨论更多可以查询的设备细节。

举个例子，假设我们的应用程序只能在支持几何着色器（geometry shader）的独立显卡上运行。那么 `isDeviceSuitable` 函数会是这样的：

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

相比于直接选择第一个合适的设备，你也可以给每个设备评分，然后选择得分最高的那个。这样你就可以通过给独立显卡一个更高的分数来优先选择独立显卡，但是如果只有集成显卡可用，就回退到集成显卡。你也可以直接显示设备的名称，然后让用户自行选择。

因为我们刚刚开始，所以我们只需要 Vulkan 支持，因此我们将接受任何 GPU：

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return true;
} 
```

接下来，我们会讨论第一个我们真正需要的功能。

## 队列族

之前简单提到过，在 Vulkan 中进行任何操作（从绘制到纹理上传）基本都要将指令提交到队列。不同的*队列族*能够产生不同种类的队列，而每个队列族都只支持一部分指令。例如，一个队列族可能只允许处理计算指令，或者只允许处理内存传输相关的指令。

我们需要查询设备支持的队列族，并且找到一个支持我们所需指令的队列族。为此，我们添加一个新的结构体 `QueueFamilyIndices`，用于存储我们需要的队列族。

现在，我们只要找到一个支持图形指令的队列族就好了，所以函数可以是这样的：

```java
private int findQueueFamilies(VkPhysicalDevice device) {
    // Logic to find graphics queue family
}
```

然而，在接下来的章节中，我们将再次查找另一个队列，所以最好为此做好准备，并将索引打包到一个结构体中：

```java
private record QueueFamilyIndices(int graphicsFamily) {}

private QueueFamilyIndices findQueueFamilies(VkPhysicalDevice device) {
    // Logic to find queue family indices to create record with
}
```

获取队列族列表的过程与你期望的完全一样，使用 `vkGetPhysicalDeviceQueueFamilyProperties`：

```java
try (var arena = Arena.ofConfined()) {
    var pQueueFamilyCount = IntBuffer.allocate(arena);
        instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, null);
    
    var queueFamilyCount = pQueueFamilyCount.read();
    var queueFamilies = VkQueueFamilyProperties.allocate(arena, queueFamilyCount);
        instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, queueFamilies[0]);
}
```

`VkQueueFamilyProperties` 结构体包含了关于队列族的一些详细信息，包括支持的操作类型以及可以基于该族创建的队列数量。我们需要找到至少一个支持 `VK_QUEUE_GRAPHICS_BIT` 的队列族。

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

有了这个酷毙了的队列族查询方法，我们就可以在 `isDeviceSuitable` 函数中使用它，来检查物理设备是否能够处理我们想要使用的指令：

```java
private boolean isDeviceSuitable(VkPhysicalDevice device) {
    return findQueueFamilies(device) != null;
}
```

好极了，这就是我们找到正确的物理设备所需要的一切！下一步是[创建一个逻辑设备](logical-device-and-queues.md)来与之交互。
