# 概览

本章会以介绍 Vulkan 和它所解决的问题开始。之后，我们会看到绘制第一个三角形所需的所有组件。这会给你一个总体的蓝图，以便你将每个后续章节放在正确的位置。之后我们会讨论 `vulkan4j` 提供的 Vulkan API 封装。

## Vulkan 的起源

和之前的图形 API 一样，Vulkan 也是为跨平台抽象 [GPU](https://en.wikipedia.org/wiki/Graphics_processing_unit) 而设计的。以往的 API 大都有一个问题，那就是它们都是根据诞生年代的图形硬件特性来设计的，而此时的图形硬件大多都只有一些可配置的功能。程序员必须以标准的格式提供顶点数据，并且在光照和着色选项上受制于 GPU 制造商。

在显卡架构成熟之后，它们开始提供更多的可编程特性。所有这些新功能都必须以某种方式与现有的 API 集成。这就导致这些 API 不能提供理想的抽象，而显卡驱动需要猜测程序员的意图，以将其映射到现代图形架构。这就是为什么有这么多驱动更新来提高游戏性能，而且有时候提升幅度很大。由于这些驱动的复杂性，应用程序开发人员还需要处理制造商之间的不一致性，例如[着色器](https://en.wikipedia.org/wiki/Shader)接受的语法。除了这些新功能之外，过去十年还涌入了具有强大图形硬件的移动设备。这些移动 GPU 出于空间和能耗上的考虑采用了与桌面端不同的架构。其中一个例子是 [tiled rendering](https://en.wikipedia.org/wiki/Tiled_rendering)，它可以给程序员提供对此功能的更多控制，从而提高性能。此外受限于诞生的年代，这些 API 对多线程的支持都非常有限，这可能会导致 CPU 成为性能瓶颈。

Vulkan 从头开始、针对现代图形架构而设计，从而解决了上述问题。Vulkan 要求程序员明确地指定他们的意图，从而减少驱动开销，并允许多个线程并行创建和提交指令。Vulkan 使用一种标准的字节码格式和一种编译器来减少着色器编译中的不一致性。最后，它将现代图形卡的通用处理能力纳入到单个 API 中，从而将图形和计算功能统一起来。

## 画一个三角形需要什么

接下来我们会总览一下在一个良好的 Vulkan 程序中绘制一个三角形所需的所有步骤。这里只是给你一个大的蓝图，以便你将所有的单独组件联系起来，而所有概念都会在后面的章节中详细介绍。

### 1. 创建实例并选择物理设备

一个 Vulkan 应用首先通过创建一个 `VkInstance` 来设置 Vulkan API。实例的创建是通过描述你的应用程序和你将要使用的 API 扩展来完成的。创建实例之后，你可以查询支持 Vulkan 的硬件，并选择一个或多个 `VkPhysicalDevice` 来使用。你可以查询像 VRAM 大小和设备功能这样的属性来选择所需的设备，例如优先使用独立显卡。

### 2. 逻辑设备和队列族（queue families）

选择正确的硬件设备后，你需要创建一个 `VkDevice` (逻辑设备)，在这里你需要更具体地描述你将要使用的 `VkPhysicalDeviceFeatures`，例如多视口渲染和 64 位浮点数。你还需要指定你想要使用的队列族。大多数 Vulkan 操作，例如绘制指令和内存操作，都是通过提交到 `VkQueue` 来异步执行的。队列是从队列族中分配的，每个队列族都支持一组特定的操作。例如，可能会有单独的队列族用于图形、计算和内存传输操作。队列族的可用性也可以用作物理设备选择的区分因素。虽然支持 Vulkan 的设备可能不提供任何图形功能，但是今天所有支持 Vulkan 的显卡通常都支持我们感兴趣的所有队列操作。

### 3. 创建窗口和交换链（swapchain）

除非你只对离屏渲染有兴趣，否则你需要创建一个窗口来呈现渲染图像。窗口可以使用本地平台 API 创建，也可以使用类似 [GLFW](http://www.glfw.org/) 或 [SDL](https://www.libsdl.org/) 的库来创建。在本教程中我们会使用 GLFW，因为 `vulkan4j` 中已经提供了对 GLFW 的最小化集成。

我们还需要两个组件才能完成窗口渲染：一个窗口表面（`VkSurfaceKHR`）和一个交换链（`VkSwapchainKHR`），可以注意到这两个组件都有一个 `KHR` 后缀，这表示它们都是 Vulkan 扩展。Vulkan 本身完全是平台无关的，这就是为什么我们需要使用标准 WSI（Window System Interface，窗口系统接口）扩展与原生的窗口管理器进行交互。表面（Surface）是一个渲染窗口的跨平台抽象，通常它是由原生窗口系统句柄 —— 例如 Windows 上的 `HWND` —— 作为参数实例化得到的。GLFW 中提供了能让我们跨平台处理表面的函数。

交换链是一系列的渲染目标。它可以保证我们正在渲染的图像不是当前屏幕上正在显然的图像，从而确保只有完整的图像才会被显示。每次我们想要绘制一帧时，我们都必须要求交换链提供一个图像来进行渲染。当我们完成一帧的绘制后，图像就会被返回到交换链中，以便在某个时刻呈现到屏幕上。渲染目标的数量和呈现图像到屏幕的条件取决于呈现模式（present mode）。常见的呈现模式有双缓冲（垂直同步）和三缓冲。我们将在创建交换链章节讨论这些问题。

有的平台允许你直接渲染到输出，而不通过 `VK_KHR_display` 和 `VK_KHR_display_swapchain` 与窗口管理器进行交互。这就允许你创建一个覆盖整个屏幕的表面，你可以用它来实现你自己的窗口管理器。

### 4. 图像视图（image view）和帧缓冲（framebuffer）

从交换链获取图像后，还不能直接在图像上进行绘制，需要将图像先包装进 `VkImageView` 和 `VkFramebuffer`。一个图像视图可以引用图像的一个特定部分，而一个帧缓冲则可以引用用于颜色、深度和模板的图像视图。因为交换链中可能有很多不同的图像，所以我们会预先为每个交换链图像创建一个图像视图和帧缓冲，并在绘制时选择正确的那个。

### 5. 渲染流程（render passes）

Vulkan 中的渲染流程描述了渲染操作中使用的图像类型、图像的使用方式，以及如何处理它们的内容。在我们最初的三角形渲染程序中，我们会告诉 Vulkan 我们会使用一个图像作为颜色目标，并且我们希望在绘制操作之前将其清除为一个纯色。渲染流程只描述图像的类型，`VkFramebuffer` 则会将特定的图像绑定到这些槽中。

### 6. 图形管线（graphics pipeline）

Vulkan 的图形管线通过创建 `VkPipeline` 对象建立。它描述了显卡的可配置状态 —— 例如视口（viewport）的大小和深度缓冲操作，以及使用 `VkShaderModule` 的可编程状态。`VkShaderModule` 对象是从着色器字节码创建的。驱动还需要知道在管线中将使用哪些渲染目标，我们通过引用渲染流程来指定。

Vulkan 与之前的图形 API 最大的不同是几乎所有图形管线的配置都需要提前完成。这也就意味着如果我们想要切换到另一个着色器，或者稍微改变顶点布局，那么整个图形管线都要被重建。也就是说，我们需要为所有不同的组合创建很多 `VkPipeline` 对象。只有一些基本的配置 —— 例如视口大小和清除颜色 —— 可以被动态地改变。所有的状态都需要被显式地描述，没有默认的颜色混合状态。

这样做的好处类似于预编译相比于即时编译，驱动程序可以获得更大的优化空间，并且运行时的性能更加可预测，因为像切换到另一个图形管线这样的大的状态改变都是显式的。

### 7. 指令池和指令缓冲

之前提到，Vulkan 的许多操作 —— 例如绘制操作 —— 需要被提交到队列才能执行。这些操作首先要被记录到一个 `VkCommandBuffer` 中，然后提交给队列。这些指令缓冲由 `VkCommandPool` 分配，它与特定的队列族相关联。要绘制一个简单的三角形，我们需要记录下列操作到 `VkCommandBuffer` 中：

* 开始渲染
* 绑定图形管线
* 绘制三个顶点
* 结束渲染

帧缓冲绑定的图像依赖于交换链给我们的图像，我们可以提前为每个图像创建指令缓冲，然后在绘制时直接选择对应的指令缓冲使用。当然，每一帧都重新记录指令缓冲也是可以的，但这样做的效率很低。

### 8. 主循环

将绘制指令包装进指令缓冲之后，主循环就很直截了当了。我们首先使用 `vkAcquireNextImageKHR` 从交换链获取一张图像，接着为图像选择正确的指令缓冲，然后用 `vkQueueSubmit` 执行它。最后，我们使用 `vkQueuePresentKHR` 将图像返回到交换链，从而使其呈现到屏幕上。

提交给队列的操作会被异步执行。我们需要采取诸如信号量一类的同步措施来确保正确的执行顺序。绘制指令必须在获取图像完成后才能开始执行，否则可能会出现我们渲染到一个仍然在屏幕上显示的图像的情况。`vkQueuePresentKHR` 调用也需要等到渲染完成后才能执行，我们会使用第二个信号量来实现这一点。

### 总结

这个快速的介绍应该能让你对绘制第一个三角形所需的工作有一个基本的了解。一个真实的程序包含更多的步骤，例如分配顶点缓冲、创建 uniform 缓冲和上传纹理图像，这些都会在后续章节中介绍，但我们会从简单的开始，因为 Vulkan 本身的学习曲线就已经非常陡峭了。请注意，我们会通过将顶点坐标嵌入到顶点着色器中来作弊，而不使用顶点缓冲。这是因为管理顶点缓冲需要对指令缓冲有一定的了解。

所以简单来说，要绘制第一个三角形，我们需要：

* 创建一个 `VkInstance`
* 选择一个支持的显卡（`VkPhysicalDevice`）
* 创建用于绘制和呈现的 `VkDevice` 和 `VkQueue`
* 创建窗口、窗口表面和交换链
* 将交换链图像包装进 `VkImageView`
* 创建描述渲染目标和用途的渲染流程
* 为渲染流程创建帧缓冲
* 设置图形管线
* 为每个可能的交换链图像分配并记录一个包含绘制指令的指令缓冲
* 通过获取图像、提交正确的绘制指令缓冲，然后将图像返回到交换链来绘制帧

步骤非常多，但其实每一步都非常简单。每一步都会在后续章节中详细介绍。如果你对程序中的某一步感到困惑，可以回来参考一下本章节。

## API 概念

Vulkan API 是用 C 语言定义的。Vulkan API 的规范 —— Vulkan API 注册表 —— 是用[一个 XML 文件](https://github.com/KhronosGroup/Vulkan-Docs/blob/main/xml/vk.xml)来定义的，它提供了机器可读的 Vulkan API 定义。

[Vulkan 头文件](https://github.com/KhronosGroup/Vulkan-Headers) 是 Vulkan SDK 的一部分，它们是从 Vulkan API 注册表生成的。下一章里我们将要安装的 Vulkan SDK 包含了这些头文件。然而，我们不会直接或间接地使用这些头文件，因为 `vulkan4j` 提供的 Java 接口独立于 Vulkan SDK 提供的 C 接口，这个 Java 接口是从 Vulkan API 注册表生成的。

### 命名规则

`vulkan4j` 设计上更贴近于原始 Vulkan API，因此大部分函数名、数据类型名和常量名都和 Vulkan API 保持一致：

- 函数以小写 `vk` 开头
- 类型 —— 例如枚举和结构 —— 以 `Vk` 开头
- 枚举值和常量以 `VK_` 开头

一个细微的区别是，`vulkan4j` 合并了 `Flags` 和 `FlagBits` 枚举类型。例如，`VkImageUsageFlags` 和 `VkImageUsageFlagBits` 在 `vulkan4j` 中被合并为 `VkImageUsageFlags`。

`struct` 和 `union` 类型位于 `tech.icey.vk4j.datatype` 包中，枚举类型位于 `tech.icey.vk4j.enumeration` 包中，而 Vulkan 句柄类型（例如 `VkInstance`, `VkDevice`, `VkQueue` 等）位于 `tech.icey.vk4j.handle` 包中。

### 结构与枚举类型的表示

> TODO

### 句柄类型的表示

> TODO

### 枚举与掩码的表示

`vulkan4j` 使用常规的 `int` 和 `long` 类型来表示 Vulkan 中的枚举和掩码。不使用 Java 枚举是因为它们对位运算不友好，并且在进行 FFI 调用时需要转换。Vulkan 枚举和掩码值存放在对应枚举类的 `public static final` 字段中。

为了让涉及到 Vulkan 枚举与掩码的 API 更加易用，`vulkan4j` 提供了一个注解 `tech.icey.vk4j.annotation.enumtype`。这个注解用来标识某个 `int` 或者 `long` 值是某个特定的 Vulkan 枚举或者掩码。这样当你使用“Ctrl-点击”的方式跳到某个 API 的文档之后，你可以再“Ctrl-点击”这个枚举或者掩码类型，从而查看这个枚举或者掩码的所有可能值。

`vulkan4j` 的枚举类还提供了一个方便的 `explain` 静态方法，可以用来获得一个 Vulkan 枚举或掩码值的人类可读解释。

### 指令（command，即 Vulkan API 函数）

诸如 `vkCreateInstance` 的原始 Vulkan 函数的类型在 `vulkan4j` 中被定义为带有 `DESCRIPTOR$` 前缀的 `FunctionDescriptor`。例如，`vkCreateInstance` 的类型由 `DESCRIPTOR$vkCreateInstance` 定义。

只有这些函数签名还不足以调用 Vulkan 函数，我们必须先加载这些类型所描述的函数。Vulkan 规范针对这个问题有一个[详细的描述](https://www.khronos.org/registry/vulkan/specs/1.2-extensions/html/vkspec.html#initialization-functionpointers)，但是在这里我会给出一个简化的版本。

第一个要加载的函数是 `vkGetInstanceProcAddr`，我们可以使用 Project-Panama 的 API `NativeLinker` 和 `SymbolLookup` 来加载它。`vulkan4j` 针对这些 API 的加载提供了一个轻量级封装，使得加载过程变得更容易。

然而，取决于系统上的 Vulkan 实现，可能会有多个版本的 Vulkan 函数可用。例如，如果你的系统上有一个独立的 NVIDIA GPU 和一个集成的 Intel GPU，那么可能会有针对每个设备的专用 Vulkan 函数的不同实现，例如 `allocate_memory`。在这种情况下，`vkGetInstanceProcAddr` 会返回一个函数，这个函数会根据使用的设备来分派调用到正确的设备特定函数。

要避免这种分派的运行时开销，可以使用 `vkGetDeviceProcAddr` 函数来直接加载这些设备特定的 Vulkan 函数。这个函数的加载方式和 `vkGetInstanceProcAddr` 一样。

我们会在这个教程中用到许多 Vulkan 函数。幸运的是，我们不必手动逐一加载它们，`vulkan4j` 提供了一个 `Loader` 类型，可以用来轻松地加载以下四类 Vulkan 函数：

* `StaticCommands` &ndash; 以平台特定的方式加载的 Vulkan 函数，可以用来加载其他函数（例如 `vkGetInstanceProcAddr` 和 `vkGetDeviceProcAddr`）
* `EntryCommands` &ndash; 使用 `vkGetInstanceProcAddr` 和一个空的 Vulkan 实例加载的 Vulkan 函数。这些函数不与特定的 Vulkan 实例绑定，可以用来查询实例支持并创建实例
* `InstanceCommands` &ndash; 使用 `vkGetInstanceProcAddr` 和一个有效的 Vulkan 实例加载的 Vulkan 函数。这些函数与特定的 Vulkan 实例绑定，可以用来查询设备支持并创建设备
* `DeviceCommands` &ndash; 使用 `vkGetDeviceProcAddr` 和一个有效的 Vulkan 设备加载的 Vulkan 函数。这些函数与特定的 Vulkan 设备绑定，并且提供了你期望中图形 API 提供的大多数功能

这些结构体能让你简单地在 Java 中加载和调用原始 Vulkan 函数。

## 校验层（Validation layers）

如前文所述，Vulkan 是为高性能和低驱动程序开销而设计的。因此，默认情况下 Vulkan 只包含非常有限的错误检查和调试功能。如果你做错了什么，驱动程序通常会崩溃而不是返回错误代码，或者比这更糟 —— 程序会在你的显卡上运行，但在其他显卡上完全失效。

你可以通过*校验层*来在 Vulkan 中启用很多检查。校验层是可以插入到 API 和图形驱动程序之间的代码片段，用于对函数参数进行额外的检查，并且跟踪内存管理问题。你可以在开发时启用它们，然后在发布应用程序时将其完全禁用，从而实现零开销。任何人都可以编写自己的校验层，但是 LunarG 的 Vulkan SDK 提供了一套标准的校验层，我们将在本教程中使用它们。你还需要注册一个回调函数来接收校验层的调试消息。

因为 Vulkan 对每个操作都非常明确，校验层也非常广泛，所以实际上相比于 OpenGL 和 Direct3D，你更容易找出为什么你的画面是全黑的！
