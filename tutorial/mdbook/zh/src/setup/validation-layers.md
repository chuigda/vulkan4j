# 校验层

## 什么是校验层？

Vulkan API 的设计秉持了尽可能降低驱动开销的理念，带来的影响就是 API 默认只提供极少的错误检查。即便是像把枚举设置成了一个非法值这样简单的错误也不会被显式处理，而是会导致程序崩溃或是未定义行为。由于 Vulkan 要求你明确你所做的事，你很容易就会犯下许多小错误，例如在使用一个 GPU 特性时忘记在创建逻辑设备时请求这个特性。

然而，这并不意味着 Vulkan API 就没法进行错误检查。Vulkan 引入了一个优雅的系统，叫做校验层（Validation Layer）。校验层是可选的，它们能在你调用 Vulkan 函数时插入钩子，执行额外的操作。一些常见的操作包括：

- 对比规范检查参数值，以检测是否有误用
- 追踪对象的创建和销毁，找出资源泄漏
- 通过追踪发起调用的线程，检查线程安全性
- 在标准输出中打印含有所有调用及其参数的日志
- 追踪 Vulkan 调用，用于性能分析（profiling）与重放（replay）

诊断校验层中一个函数的实现看起来就像这样（C 语言）：

```c
VkResult vkCreateInstance(
    const VkInstanceCreateInfo* pCreateInfo,
    const VkAllocationCallbacks* pAllocator,
    VkInstance* instance
) {

    if (pCreateInfo == NULL || instance == NULL) {
        log("Null pointer passed to required parameter!");
        return VK_ERROR_INITIALIZATION_FAILED;
    }

    return real_vkCreateInstance(pCreateInfo, pAllocator, instance);
}
```

你可以随意堆叠校验层来引入你感兴趣的调试功能。你只需为 Debug 构建启用校验层，而在 Release 构建禁用它们，就能使这两个构建获得最大收益。

Vulkan 并不内置任何校验层，但是 LunarG Vulkan SDK 提供了一系列校验层，用以检查常见的错误。它们是完全[开源](https://github.com/KhronosGroup/Vulkan-ValidationLayers)的，所以你可以找到它们能检查的错误类型，并且可以参与贡献。你的应用可能会因为无意中依赖于未定义行为而在不同的驱动程序上遇到错误，而要避免这种事，最好的方式就是使用校验层。

校验层只能在安装到系统中之后使用。比如 LunarG 校验层只能在安装了 Vulkan SDK 的电脑上使用。

之前，在 Vulkan 中有两种不同类型的校验层：实例（instance）特定的校验层与设备（device）特定的校验特定层。实例特定的校验层会检查与全局 Vulkan 对象 —— 例如 Vulkan 实例 —— 相关的调用，而设备特定的校验层只会检查与某个特定的 GPU 相关的调用。设备特定的校验层现在已经被弃用了，这也就意味着实例特定的校验层会对所有的 Vulkan 调用生效。规范文档依旧建议你出于兼容性考虑启用设备特定的校验层，而这在某些实现中是必须的。我们将简单地在逻辑设备级别指定与实例相同的校验层，[稍后](./logical-device-and-queues)我们会看到。

## 使用校验层

在这个章节中，我们将会学习如何启用 Vulkan SDK 提供的标准校验层。和扩展一样，启用校验层需要指定它们的名称。在 SDK 中，所有有用的标准校验都被打包于 `VK_LAYER_KHRONOS_validation` 校验层中。

我们先给我们程序增加一个配置变量用来指定是否启用校验层。我决定根据 JVM 选项的值来确定是否启用校验层。在 `Application` 类中添加如下字段：

```java
private static final boolean ENABLE_VALIDATION_LAYERS = System.getProperty("validation") != null;
```

如果 JVM 选项 `validation` 被设置，那么校验层将会被启用。如果你使用的是 IDE，你可以在运行配置中添加这个选项。

然后我们也将校验层名称设为一个命名常量：

```java
private static String VALIDATION_LAYER_NAME = "VK_LAYER_KHRONOS_validation";
```

我们将添加一个新函数 `checkValidationLayerSupport`，用来检查我们想要使用的校验层是否可用。首先使用 `vkEnumerateInstanceLayerProperties` 函数列出所有可用的校验层。

```java
private boolean checkValidationLayerSupport() {
    try (var arena = Arena.ofConfined()) {
        var pLayerCount = IntBuffer.allocate(arena);
        var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
        }

        var layerCount = pLayerCount.read();
        var availableLayers = VkLayerProperties.allocate(arena, layerCount);
        result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, availableLayers[0]);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
        }
        
        return false;
    }
}
```

接下来，检查我们想要的校验层名称是否存在于可用校验层列表中：

```java
// ...

for (var layer : availableLayers) {
    if (VALIDATION_LAYER_NAME.equals(layer.layerName().readString())) {
        return true;
    }
}

return false;
```

我们现在可以在 `createInstance` 中使用这个函数：

```java
if (ENABLE_VALIDATION_LAYERS && !checkValidationLayerSupport()) {
    throw new RuntimeException("Validation layers requested, but not available!");
}

// ...
```

现在在 Debug 模式下运行程序，确保不会出现错误。如果出现了错误，那你需要看一下 FAQ。

最后，如果启用了校验层，修改 `VkInstanceCreateInfo` 结构体的实例化，包含校验层名称：

```java
if (ENABLE_VALIDATION_LAYERS) {
    instanceCreateInfo.enabledLayerCount(1);
    PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(arena);
    ppEnabledLayerNames.write(ByteBuffer.allocateString(arena, VALIDATION_LAYER_NAME));
    instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);
}
```

如果检查成功，那么 `vkCreateInstance` 不应该返回 `VK_ERROR_LAYER_NOT_PRESENT` 错误，但你应该运行程序来确保万无一失。

## 消息回调

默认情况下，校验层会将调试消息打印至标准输出，但我们也可以提供显式回调自己处理这些消息。这样我们可以自主决定处理哪些类型的消息，因为并非所有消息都是（致命）错误消息。如果你不想现在做这些事，你可以跳到本章的最后一节。

要在程序中配置一个处理消息和消息细节的回调，我们需要使用 `VK_EXT_debug_utils` 扩展配置一个带回调的调试信使（debug messenger）。

首先我们创建一个 `getRequiredExtensions` 函数，根据是否启用校验层返回所需的扩展列表：

```java
private PointerBuffer getRequiredExtensions(Arena arena) {
    try (var localArena = Arena.ofConfined()) {
        var pGLFWExtensionCount = IntBuffer.allocate(localArena);
        var glfwExtensions = glfw.glfwGetRequiredInstanceExtensions(pGLFWExtensionCount);
        if (glfwExtensions == null) {
            throw new RuntimeException("Failed to get GLFW required instance extensions");
        }

        var glfwExtensionCount = pGLFWExtensionCount.read();
        glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
        if (!ENABLE_VALIDATION_LAYERS) {
            return glfwExtensions;
        }
        else {
            var extensions = PointerBuffer.allocate(arena, glfwExtensionCount + 1);
            for (int i = 0; i < glfwExtensionCount; i++) {
                extensions.write(i, glfwExtensions.read(i));
            }

            extensions.write(glfwExtensionCount, ByteBuffer.allocateString(arena, Constants.VK_EXT_DEBUG_UTILS_EXTENSION_NAME));
            return extensions;
        }
    }
}
```

> 注意：这里我们希望在函数返回后创建的 `PointerBuffer` 仍然有效，所以我们使用调用者提供的 `Arena` 来分配它。

GLFW 指定的扩展总是必需的，但调试信使扩展是有条件添加的。注意这里我使用了 `Constants.VK_EXT_DEBUG_UTILS_EXTENSION_NAME` 常量，它等于字面字符串 `"VK_EXT_debug_utils"`。使用这个命名常量可以避免拼写错误。

现在我们可以在 `createInstance` 中使用这个函数：

```java
var extensions = getRequiredExtensions(arena);
instanceCreateInfo.enabledExtensionCount((int) extensions.size());
instanceCreateInfo.ppEnabledExtensionNames(extensions);
```

运行程序来确保你没有收到 `VK_ERROR_EXTENSION_NOT_PRESENT` 错误。我们不需要检查这个扩展是否存在，因为校验层的可用性意味着这个扩展的存在。

现在我们来看一下调试回调函数是什么样的。添加一个新的静态成员函数 `debugCallback`，如下所示：

```java
private static /* VkBool32 */ int debugCallback(
        @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
        @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType,
        @pointer(comment="const VkDebugUtilsMessengerCallbackDataEXT*") MemorySegment pCallbackData,
        @pointer(comment="void*") MemorySegment pUserData
) {
    var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.SIZE));
    System.err.println("Validation layer: " + Objects.requireNonNull(callbackData.pMessage()).readString());
    return Constants.VK_FALSE;
}
```

> 注1：由于 Vulkan 将直接调用我们的回调函数，所以不能直接使用像 `VkDebugUtilsMessengerCallbackDataEXT` 这样的包装类型。相反，我们将使用 `MemorySegment` 类型接受原始指针，然后自己在 `VkDebugUtilsMessengerCallbackDataEXT` 类中包装它。为了让 JVM 相信 `MemorySegment` 是指向正确结构的指针，我们将使用 `reinterpret` 方法将其转换为正确的大小，这样 JVM 将不会在未来访问时抱怨缓冲区溢出。

> 注2：`@enumtype` 注解是完全可选的，但有助于指示整数值的预期类型。这也使得 IDE 中的 Ctrl+单击导航工作。

第一个参数表示消息的严重程度，它可以有以下取值：

- `VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT`：诊断信息
- `VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT`：提示消息，例如资源的创建
- `VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT`：行为不一定是错误，但很可能意味着你的程序有 bug
- `VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT`：行为无效，可能会导致崩溃

枚举值被设置为递增的，这样就可以用比较运算符来检查一条消息是否比某个严重程度更严重。例如：

```java
if (messageSeverity >= VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT) {
    // Message is important enough to show
}
```

`messageType` 参数可以有以下取值：

- `VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT`：与规范或性能无关的事件
- `VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT`：违反规范或可能是错误的事件
- `VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT`：这个用法可能不是 Vulkan 的最佳实践

`pCallbackData` 参数指向一个 `VkDebugUtilsMessengerCallbackDataEXT` 结构体，它包含了消息本身的细节，其中最重要的成员是：

- `pMessage`：调试信息，以空字符结尾的字符串
- `pObjects`：与消息相关的 Vulkan 对象句柄数组
- `objectCount`：数组中对象的数量

最后，`pUserData` 参数包含了在回调设置期间指定的指针，允许你将自己的数据传递给它。

回调函数返回一个布尔值，指示触发校验层消息的 Vulkan 调用是否应该被中止。如果回调返回 `true`，那么调用将被 `VK_ERROR_VALIDATION_FAILED_EXT` 错误中止。这通常只用于测试校验层本身，所以你应该总是返回 `VK_FALSE`。

### 创建一个上调桩（upcall stub）

现在我们的 `debugCallback` 是一个 Java 函数。为了使它成为一个可用的 C 函数指针，我们需要几个额外的步骤。首先，我们需要一个函数描述符：

```java
private static final FunctionDescriptor DESCRIPTOR_debugCallback = FunctionDescriptor.of(
        ValueLayout.JAVA_INT, // return value VkBool32
        ValueLayout.JAVA_INT, // int messageSeverity
        ValueLayout.JAVA_INT, // int messageType
        ValueLayout.ADDRESS, // const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData
        ValueLayout.ADDRESS  // void* pUserData
);
```

然后我们需要获取 `debugCallback` 的方法句柄：

```java
private static final MethodHandle HANDLE_debugCallback;
static {
    try {
        HANDLE_debugCallback = MethodHandles
                .lookup()
                .findStatic(Application.class, "debugCallback", DESCRIPTOR_debugCallback.toMethodType());
    } catch (Exception e) {
        throw new RuntimeException(e);
    }
}
```

最后，我们使用 `Linker` 创建一个准备好的上调 `MemorySegment`：

```java
private static final MemorySegment UPCALL_debugCallback = Linker
        .nativeLinker()
        .upcallStub(HANDLE_debugCallback, DESCRIPTOR_debugCallback, Arena.global());
```

<div style="color: gray; user-select: none">
我是一个可爱的章节结束信息，可爱地爬行 _(ÒωÓ๑ゝ∠)_
</div>

现在我们需要告诉 Vulkan 关于回调函数的事情。也许有点出乎意料，在 Vulkan 中，即使是调试回调函数也需要被显式地创建和销毁。这样的回调函数是调试信使（debug messenger）的一部分，你可以有任意多个这样的回调函数。在 `instance` 下方添加一个类成员：

```java
private VkDebugUtilsMessengerEXT debugMessenger;
```

Now add a function `setupDebugMessenger` to be called from `initVulkan` right after `createInstance`:

现在添加一个函数 `setupDebugMessenger`，在 `createInstance` 之后被 `initVulkan` 调用：

```java
private void initVulkan() {
    // ...
    
    createInstance();
    setupDebugMessenger();
}

private void setupDebugMessenger() {
    if (!ENABLE_VALIDATION_LAYERS) {
        return;
    }
}
```

我们需要填写一个关于信使及其回调的结构体：

```java
try (var arena = Arena.ofConfined()) {
    var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
    debugUtilsMessengerCreateInfo.messageSeverity(
            VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                    VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                    VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
    );
    debugUtilsMessengerCreateInfo.messageType(
            VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                    VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                    VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
    );
    debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
}
```

`messageSeverity` 字段允许你指定你的回调函数感兴趣的所有严重程度类型。我在这里指定了除了 `VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT` 之外的所有类型，以便接收关于可能问题的通知，同时略过了冗长的一般调试信息。

类似地，`messageType` 字段允许你过滤你的回调函数感兴趣的消息类型。我在这里启用了所有类型。如果某些类型的消息对你没用，你可以禁用它们。

最后，`pfnUserCallback` 字段指定了回调函数的指针。你可以选择传递一个指向 `pUserData` 字段的指针，它将通过 `pUserData` 参数传递给回调函数。

请注意，有许多方法可以配置校验层消息和调试回调，但这是本教程的一个很好的起点。有关更多信息，请参阅[扩展规范](https://www.khronos.org/registry/vulkan/specs/1.3-extensions/html/chap50.html#VK_EXT_debug_utils)。

这个结构体应该被传递给 `vkCreateDebugUtilsMessengerEXT` 函数来创建 `VkDebugUtilsMessengerEXT` 对象。

```java
var pDebugMessenger = VkDebugUtilsMessengerEXT.Buffer.allocate(arena);
var result = instanceCommands.vkCreateDebugUtilsMessengerEXT(
        instance,
        debugUtilsMessengerCreateInfo,
        null,
        pDebugMessenger
);
if (result != VkResult.VK_SUCCESS) {
    throw new RuntimeException("Failed to set up debug messenger, vulkan error code: " + VkResult.explain(result));
}
debugMessenger = pDebugMessenger.read();
```

倒数第二个参数是可选的分配器回调，我们将其设置为 `null`，除此之外参数都很直白。由于调试信使是特定于我们的 Vulkan 实例和层的，所以需要显式指定为第一个参数。稍后你也会在其他子对象中看到这种模式。

The `VkDebugUtilsMessengerEXT` object also needs to be cleaned up with a call to `vkDestroyDebugUtilsMessengerEXT`.

`VkDebugUtilsMessengerEXT` 对象也需要通过调用 `vkDestroyDebugUtilsMessengerEXT` 进行清理。

```java
void cleanup() {
    if (ENABLE_VALIDATION_LAYERS) {
        instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
    }

    // ...
}
```

## 创建与销毁调试实例

尽管我们已经通过校验层添加了调试功能，但活还没完全干完。调用 `vkCreateDebugUtilsMessengerEXT` 需要一个有效的实例，而 `vkDestroyDebugUtilsMessengerEXT` 必须在实例被销毁前调用。这意味着我们现在还不能调试 `vkCreateInstance` 和 `vkDestroyInstance` 调用中的任何问题。

不过，如果你仔细阅读过[扩展文档](https://github.com/KhronosGroup/Vulkan-Docs/blob/77d9f42e075e6a483a37351c14c5e9e3122f9113/appendices/VK_EXT_debug_utils.txt#L84-L91)，你就会看到，还有一种方式可以为这两个函数调用创建一个单独的调试信使。只需在 `VkInstanceCreateInfo` 的 `pNext` 扩展字段中传递一个指向 `VkDebugUtilsMessengerCreateInfoEXT` 结构体的指针即可。首先将信使创建信息的填充提取到一个单独的函数中：

```java
private void setupDebugMessenger() {
    // ...

    var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
    populateDebugMessengerCreateInfo(debugUtilsMessengerCreateInfo);

    // ...
}

private void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugUtilsMessengerCreateInfo) {
    debugUtilsMessengerCreateInfo.messageSeverity(
            VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                    VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                    VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
    );
    debugUtilsMessengerCreateInfo.messageType(
            VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                    VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                    VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
    );
    debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
}
```

现在我们可以在 `createInstance` 函数中复用这个函数：

```java
private void createInstance() {
    // ...
    if (ENABLE_VALIDATION_LAYERS) {
        // ...

        var debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
        populateDebugMessengerCreateInfo(debugCreateInfo);
        instanceCreateInfo.pNext(debugCreateInfo);
    }
}
```

通过这种方式创建一个额外的调试信使，它将在 `vkCreateInstance` 和 `vkDestroyInstance` 期间自动使用，并在此之后清理。

## 测试

现在让我们故意犯一个错误来看看校验层的工作。暂时删除 `cleanup` 函数中的 `DestroyDebugUtilsMessengerEXT` 调用，然后运行你的程序。一旦程序退出，你应该会看到类似这样的输出：

```
Validation layer: Validation Error: [ VUID-vkDestroyInstance-instance-00629 ] Object 0: handle = 0x27be19342d0, type = VK_OBJECT_TYPE_INSTANCE; Object 1: handle = 0xfd5b260000000001, type = VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT; | MessageID = 0x8b3d8e18 | OBJ ERROR : For VkInstance 0x27be19342d0[], VkDebugUtilsMessengerEXT 0xfd5b260000000001[] has not been destroyed. The Vulkan spec states: All child objects created using instance must have been destroyed prior to destroying instance (https://vulkan.lunarg.com/doc/view/1.3.250.0/windows/1.3-extensions/vkspec.html#VUID-vkDestroyInstance-instance-00629)
Validation layer: Validation Error: [ VUID-vkDestroyInstance-instance-00629 ] Object 0: handle = 0x27be19342d0, type = VK_OBJECT_TYPE_INSTANCE; Object 1: handle = 0xfd5b260000000001, type = VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT; | MessageID = 0x8b3d8e18 | OBJ ERROR : For VkInstance 0x27be19342d0[], VkDebugUtilsMessengerEXT 0xfd5b260000000001[] has not been destroyed. The Vulkan spec states: All child objects created using instance must have been destroyed prior to destroying instance (https://vulkan.lunarg.com/doc/view/1.3.250.0/windows/1.3-extensions/vkspec.html#VUID-vkDestroyInstance-instance-00629)
```

> 如果你没有看到任何消息，那么[检查你的安装](https://vulkan.lunarg.com/doc/view/1.2.131.1/windows/getting_started.html#user-content-verify-the-installation)。

如果你想看到哪个调用触发了消息，你可以在消息回调中添加一个断点，然后查看堆栈跟踪。

## 配置

除了 `VkDebugUtilsMessengerCreateInfoEXT` 结构中的标志之外，还有更多针对校验层行为的配置项目。浏览 Vulkan SDK 所在的位置，进入 `Config` 目录。你会在那里找到一个 `vk_layer_settings.txt` 文件，它解释了如何配置校验层的行为。

要为你自己的应用程序配置校验层，你需要将文件复制到项目可执行文件的工作目录，并按照说明设置所需的行为。不过，在本教程的其余部分，我将假设你使用默认设置。

在本教程中，我会故意制造一些错误，以展示校验层是如何帮助你捕获这些错误的，并告诉你与 Vulkan 共事时清楚自己在做什么是多么重要。现在是时候看看[系统中的 Vulkan 设备了](physical-devices-and-queue-families.md)。
