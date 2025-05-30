# Vulkan 实例

> 本章内容的翻译使用了生成式人工智能，可能存在不准确之处。如有问题，欢迎提交问题和拉取请求。
> 
> [英文版](https://vulkan4j.doki7.club/tutorial/en/01-setup/ch01-instance.html) | [Java 代码](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part01/ch01/Main.java) | [C++ 版本](https://vulkan-tutorial.com/Drawing_a_triangle/Setup/Instance)

## 加载 Vulkan 库

在我们开始使用 Vulkan 之前，我们需要加载 Vulkan 库和几个基本的 Vulkan 函数，就像我们对 GLFW 所做的那样。将以下私有字段添加到 `Application` 类中：

```java
private VkStaticCommands staticCommands;
private VkEntryCommands entryCommands;
```

然后在 `initVulkan` 函数中加载 Vulkan 库并初始化这两个字段：

```java
void initVulkan() {
    VulkanLoader.loadVulkanLibrary();
    staticCommands = VulkanLoader.loadStaticCommands();
    entryCommands = VulkanLoader.loadEntryCommands(staticCommands);
}
```

## 创建实例

使用 Vulkan 的第一步是创建一个实例。实例是你的应用程序和 Vulkan 库之间的连接，创建实例需要向驱动程序指定一些关于你的应用程序的详细信息。

首先添加一个 `createInstance` 函数，并在 `initVulkan` 函数中调用它。

```java
void initVulkan() {
    // ...
    createInstance();
}
```

此外，添加一个数据成员来持有实例的句柄：

```java
private VkInstance instance;
```

现在，要创建一个实例，我们首先需要用一些关于我们应用程序的信息来填充一个结构体。这些数据在技术上是可选的，但它可能会向驱动程序提供一些有用的信息，以便优化我们的特定应用程序（例如，因为它使用了一个具有某些特殊行为的知名图形引擎）。这个结构体叫做 `VkApplicationInfo`：

```java
private void createInstance() {
    try (var arena = Arena.ofConfined()) {
        var appInfo = VkApplicationInfo.allocate(arena);
        appInfo.pApplicationName(BytePtr.allocateString(arena, "Zdravstvuyte, Vulkan!"));
        appInfo.applicationVersion(new Version(0, 1, 0, 0).encode());
        appInfo.pEngineName(BytePtr.allocateString(arena, "Soloviev D-30"));
        appInfo.engineVersion(new Version(0, 1, 0, 0).encode());
        appInfo.apiVersion(Version.VK_API_VERSION_1_0.encode());
    }
}
```

> 如果你对 `try` 代码块语法不熟悉，这是 Java 9 的一个特性，称为“try-with-resources”。它用于自动关闭实现了 `AutoCloseable` 接口的资源。在这种情况下，`Arena` 对象就是一个资源，当退出该代码块时它将被自动关闭。

Vulkan C API 要求你在 `sType` 成员中显式指定类型。然而，`vulkan4j` 已经为你处理好了这一点。`VkApplicationInfo.allocate` 方法会在分配结构体后填充 `sType` 字段。更重要的是，`Arena.ofConfined()` 创建了一个 arena，其 `allocate` 方法会自动用零填充分配的内存，所以我们不需要逐个对结构体的其余字段进行零初始化。

在 Vulkan 中，许多信息是通过结构体而不是函数参数传递的，我们还需要填充另一个结构体来为创建实例提供足够的信息。下一个结构体不是可选的，它告诉 Vulkan 驱动程序我们想要使用哪些全局扩展和校验层。这里的全局意味着它们适用于整个程序，而不是特定的设备，这一点在接下来的几章中会变得清晰。

```java
var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
instanceCreateInfo.pApplicationInfo(appInfo);
```

第一个字段 `pApplicationInfo` 很简单。接下来的两个字段指定所需的全局扩展。正如在概述章节中提到的，Vulkan 是一个平台无关的 API，这意味着你需要一个扩展来与窗口系统交互。GLFW 有一个方便的内置函数，可以返回它所需要的扩展，我们可以将其传递给结构体：

```java
var pGLFWExtensionCount = IntPtr.allocate(arena);
var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
if (glfwExtensions == null) {
    throw new RuntimeException("Failed to get GLFW required instance extensions");
}

var glfwExtensionCount = pGLFWExtensionCount.read();
glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
instanceCreateInfo.enabledExtensionCount(glfwExtensionCount);
instanceCreateInfo.ppEnabledExtensionNames(glfwExtensions);
```

> 注意：这里我们对 `glfwExtensions` 调用 `reinterpret` 方法，将其大小标记为 `glfwExtensionCount`。我们需要自己这样做，因为自动生成的绑定在从函数返回时不知道如何正确设置缓冲的大小。目前这一步还不是必需的，因为 `createInstance` 不需要我们的 `PointerPtr` 的大小信息——它会从 `VkInstanceCreateInfo::enabledExtensionCount` 字段获取大小。然而，在接下来的章节中，我们将从 Java 代码中读取 `glfwExtensions`，届时将需要正确的大小信息。

```java
instanceCreateInfo.enabledLayerCount(0);
```

我们现在已经指定了 Vulkan 创建实例所需的一切，最终可以发出 `VkEntryCommands::createInstance` 调用了：

```java
var pInstance = VkInstance.Ptr.allocate(arena);
var result = entryCommands.createInstance(instanceCreateInfo, null, pInstance);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
}
instance = Objects.requireNonNull(pInstance.read());
```

正如你将看到的，Vulkan 中对象创建函数的参数遵循的一般模式是：

- 指向包含创建信息的结构体的指针
- 指向自定义分配器回调的指针，在本教程中始终为 `null`
- 指向存储新对象句柄的变量的指针

如果一切顺利，实例的句柄就会存储在 `VkInstance` 类成员中。几乎所有的 Vulkan 函数都会返回一个 `VkResult` 类型的值，该值要么是 `VkResult.SUCCESS`，要么是一个错误代码。

## 加载实例级 Vulkan 函数

创建实例后，我们可以加载实例级的 Vulkan 函数。向 `Application` 类添加一个新的字段：

```java
private VkInstanceCommands instanceCommands;
```

然后在 `initVulkan` 函数中加载实例级函数：

```java
instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
```

## 检查扩展支持

如果你查看 `vkCreateInstance` 的文档，你会看到其中一个可能的错误代码是 `ERROR_EXTENSION_NOT_PRESENT`。我们可以简单地指定我们需要的扩展，如果返回该错误代码就终止程序。这对于像窗口系统接口这样的基本扩展来说是合理的，但是如果我们想检查可选功能呢？

要在创建实例之前检索支持的扩展列表，可以使用 `VkEntryCommands::enumerateInstanceExtensionProperties` 函数。它接受一个指向存储扩展数量的变量的指针，以及一个用于存储扩展详细信息的 `extensionProperties` 数组。它还接受一个可选的第一个参数，允许我们按特定的校验层筛选扩展，我们现在将忽略它。

要分配一个数组来保存扩展的详细信息，我们首先需要知道有多少个扩展。你可以通过将后一个参数留空来仅请求扩展的数量：

```java
IntPtr pExtensionCount = IntPtr.allocate(arena);
var result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, null);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
var extensionCount = pExtensionCount.read();
```

现在分配一个数组来保存扩展的详细信息：

```java
var extensions = VkExtensionProperties.allocate(arena, extensionCount);
result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, extensions);
if (result != VkResult.SUCCESS) {
    throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
}
```

每个 `VkExtensionProperties` 结构体都包含扩展的名称和版本。我们可以用一个简单的 for 循环列出它们（\t 是用于缩进的制表符）：

```java
for (var extension : extensions) {
    System.out.println("\t" + extension.extensionName().readString());
}
```

如果你想提供一些关于 Vulkan 支持的详细信息，可以将此代码添加到 `VkEntryCommands::createInstance` 函数中。作为一个挑战，尝试创建一个函数来检查 `getRequiredInstanceExtensions` 返回的所有扩展是否都包含在支持的扩展列表中。

## 清理

`VkInstance` 应该仅在程序退出前销毁。它可以在清理阶段通过 `VkInstanceCommands::destroyInstance` 函数销毁：

```java
void cleanup() {
    instanceCommands.destroyInstance(instance, null);
    // ...
}
```

`VkInstanceCommands::destroyInstance` 函数的参数很简单。正如前一章提到的，Vulkan 中的分配和释放函数有一个可选的分配器回调，我们将通过传递 `null` 来忽略它。在接下来的章节中我们将创建的所有其他 Vulkan 资源都应该在实例销毁之前清理掉。

在继续进行实例创建后更复杂的步骤之前，是时候通过查看[校验层](ch02-validation-layers.md)来评估我们的调试选项了。
