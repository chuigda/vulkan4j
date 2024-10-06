# 实例

## 加载 Vulkan 库

在我们开始使用 Vulkan 之前，我们需要加载 Vulkan 库和一些基础的 Vulkan 指令，就像我们在 GLFW 中所做的那样。在 `Application` 类中添加以下私有字段：

```java
private StaticCommands staticCommands;
private EntryCommands entryCommands;
```

然后在 `initVulkan` 函数中加载 Vulkan 库并初始化这两个字段：

```java
void initVulkan() {
    VulkanLoader.loadVulkanLibrary();
    staticCommands = VulkanLoader.loadStaticCommands();
    entryCommands = VulkanLoader.loadEntryCommands();
}
```

## Creating an instance

## 创建实例

使用 Vulkan 的第一步是创建一个实例。实例是你的应用程序与 Vulkan 库之间的连接，创建它需要向驱动程序指定一些关于你的应用程序的细节。

首先添加一个 `createInstance` 函数，并在 `initVulkan` 函数中调用它。

```java
void initVulkan() {
    // ...
    createInstance();
}
```

此外，添加一个数据成员来保存实例的句柄：

```java
private VkInstance instance;
```

现在，要创建一个实例，我们首先需要一个包含有关我们的应用程序信息的结构体。这些数据虽说是可选的，但它可以为驱动程序提供一些有用的信息，以便优化我们的应用程序（比如使用了一个具有某些特殊行为的常用图形引擎）。这个结构体叫做 `VkApplicationInfo`：

```java
private void createInstance() {
    try (var arena = Arena.ofConfined()) {
        var appInfo = VkApplicationInfo.allocate(arena);
        appInfo.pApplicationName(ByteBuffer.allocateString(arena, "Zdravstvuyte, Vulkan!"));
        appInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        appInfo.pEngineName(ByteBuffer.allocateString(arena, "Soloviev D-30"));
        appInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
        appInfo.apiVersion(Version.VK_API_VERSION_1_0);
    }
}
```

> 如果你不熟悉 `try` 块的语法，这是 Java 9 的一个特性，叫做“try-with-resources”。它用于自动关闭实现了 `AutoCloseable` 接口的资源。在这种情况下，`Arena` 对象是一个资源，当块退出时将自动关闭。

Vulkan C API 要求你在 `sType` 成员中明确指定类型。然而，`vulkan4j` 已经为你处理了这个问题。`VkApplicationInfo.allocate` 方法将在分配结构体后填充 `sType` 字段。更重要的是，`Arena.ofConfined()` 创建了一个区域，其 `allocate` 方法将自动用零填充分配的内存，因此我们不需要逐个初始化结构体的其余字段。

在 Vulkan 中，许多信息都是通过结构体而非函数参数传递的，所以我们再需要填充一个结构体，来提供创建一个实例所需的信息。下一个结构体不是可选的，它会告诉 Vulkan 驱动程序我们想要使用哪些全局扩展和校验层。这里的“全局”意味着这些扩展和校验层适用于整个程序，而不是特定的设备。“全局”和“设备”的概念将在接下来的几章中逐渐变得清晰。

```java
var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
instanceCreateInfo.pApplicationInfo(appInfo);
```

第一个字段 `pApplicationInfo` 很简单。接下来的两个字段指定了所需的全局扩展。正如在概述章节中提到的，Vulkan 是一个与平台无关的 API，这意味着你需要一个扩展来与窗口系统进行交互。GLFW 有一个方便的内置函数，返回它需要的扩展，我们可以将它传递给结构体：

```java
var pGLFWExtensionCount = IntBuffer.allocate(arena);
var glfwExtensions = glfw.glfwGetRequiredInstanceExtensions(pGLFWExtensionCount);
if (glfwExtensions == null) {
    throw new RuntimeException("Failed to get GLFW required instance extensions");
}

var glfwExtensionCount = pGLFWExtensionCount.read();
glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
instanceCreateInfo.enabledExtensionCount(glfwExtensionCount);
instanceCreateInfo.ppEnabledExtensionNames(glfwExtensions);
```

> 注意：这里我们在 `glfwExtensions` 缓冲区上调用 `reinterpret`，将其大小标记为 `glfwExtensionCount`。我们需要自己做这个操作，因为自动生成的绑定不知道如何在从函数返回时正确设置缓冲区的大小。目前这一步还不是必要的，因为 `vkCreateInstance` 不需要我们的 `PointerBuffer` 的大小信息——它会从 `VkInstanceCreateInfo::enabledExtensionCount` 字段中获取大小。然而，在接下来的章节中，我们将从 Java 代码中读取 `glfwExtensions`，那时我们将需要正确的大小信息。

```java
instanceCreateInfo.enabledLayerCount(0);
```

我们现在已经指定了 Vulkan 创建实例所需的一切，我们最终可以发出 `vkCreateInstance` 调用了：

```java
var pInstance = VkInstance.Buffer.allocate(arena);
var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
}
instance = pInstance.read();
```

如你所见，Vulkan 中的对象创建函数参数的一般模式是：

- 包含创建信息的结构体指针
- 自定义分配器回调的指针，在本教程中始终为 `null`
- 存储新对象句柄的变量指针

如果一切顺利，那么实例的句柄将被存储在 `VkInstance` 类成员中。几乎所有 Vulkan 函数都返回一个 `VkResult` 类型的值，它要么是 `VK_SUCCESS`，要么是一个错误代码。

## 加载实例级 Vulkan 指令

在创建实例之后，我们可以加载实例级 Vulkan 指令。在 `Application` 类中添加一个新字段：

```java
private InstanceCommands instanceCommands;
```

然后在 `initVulkan` 函数中加载实例级指令：

```java
instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
```

## Checking for extension support

## 检查扩展支持

如果你查看 `vkCreateInstance` 文档，你会看到其中一个可能的错误代码是 `VK_ERROR_EXTENSION_NOT_PRESENT`。我们可以只是简单地指定我们需要的扩展，并且如果返回了这个错误代码，就终止程序。对于像窗口系统接口这样的基本扩展来说，这是可行的，但如果我们想检查可选功能呢？

在创建实例之前检索支持的扩展列表，有一个 `vkEnumerateInstanceExtensionProperties` 函数。它接受一个指向存储扩展数量的变量的指针，以及一个 `VkExtensionProperties` 数组，用于存储扩展的详细信息。它还接受一个可选的第一个参数，允许我们通过特定的校验层来过滤扩展，我们暂时忽略这个参数。

首先我们需要知道有多少扩展，才能分配一个数组来存储扩展的详细信息。你可以通过将后一个参数留空来请求扩展的数量：

```java
IntBuffer pExtensionCount = IntBuffer.allocate(arena);
var result = entryCommands.vkEnumerateInstanceExtensionProperties(null, pExtensionCount, null);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
var extensionCount = pExtensionCount.read();
```

现在分配一个数组来存储扩展的详细信息：

```java
var extensions = VkExtensionProperties.allocate(arena, extensionCount);
result = entryCommands.vkEnumerateInstanceExtensionProperties(null, pExtensionCount, extensions[0]);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
```

> 注意：在 `vulkan4j` 中，当将一个结构体/联合数组传递给 Vulkan 函数包装器时，你应该传递数组的第一个元素。

每个 `VkExtensionProperties` 结构体包含单个扩展的名称和版本。我们可以用一个简单的循环来列出它们（`\t` 是制表符，用于缩进）：

```java
for (var extension : extensions) {
    System.out.println("\t" + extension.extensionName().readString());
}
```

如果你想提供一些关于 Vulkan 支持的详细信息，你可以将这段代码添加到 `createInstance` 函数中。作为一个挑战，尝试创建一个函数，检查 `glfwGetRequiredInstanceExtensions` 返回的所有扩展是否都包含在支持的扩展列表中。

## 清理工作

`VkInstance` 应该只在程序退出之前被销毁。它可以在清理工作中使用 `vkDestroyInstance` 函数销毁：

```java
void cleanup() {
    instanceCommands.vkDestroyInstance(instance, null);
    // ...
}
```

`vkDestroyInstance` 函数的参数很简单。正如在前一章中提到的，Vulkan 中的分配和释放函数有一个可选的分配器回调，我们将通过将 `null` 传递给它来忽略它。在接下来的章节中，我们将创建的所有其它 Vulkan 资源都应该在实例被销毁之前清理。

创建完实例之后，在继续进行更复杂的步骤之前，是时候拿出[校验层](validation-layers.md)，看看我们的调试功能了。
