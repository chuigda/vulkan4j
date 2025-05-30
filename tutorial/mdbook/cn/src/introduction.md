# 前言

> 本章内容的翻译使用了生成式人工智能，可能存在不准确之处。如有问题，欢迎提交 issue 和 PR。
>
> [英文版](https://vulkan4j.doki7.club/tutorial/en/introduction.html) | [C++ 版本](https://vulkan-tutorial.com/)

本教程是 <https://vulkan-tutorial.com> 的一个改编版本，它使用 Java 而不是 C++。本教程的主要功劳应归于原教程的作者 ([Alexander Overvoorde](https://github.com/Overv)) 和[其他贡献者](https://github.com/Overv/VulkanTutorial/graphs/contributors)。

## 关于

本教程将教授你 [Vulkan](https://www.khronos.org/vulkan/) 图形和计算 API 的基础知识。Vulkan 是由 [Khronos 组织](https://www.khronos.org/)（以 OpenGL 闻名）推出的一个新 API，它为现代显卡提供了更好的抽象。这个新接口能让你更好地描述应用程序的意图，从而获得比现有 API（如 [OpenGL](https://en.wikipedia.org/wiki/OpenGL) 和 [Direct3D](https://en.wikipedia.org/wiki/Direct3D)）更好的性能和更可预测的驱动行为。Vulkan 背后的理念与 [Direct3D 12](https://en.wikipedia.org/wiki/Direct3D#Direct3D_12) 和 [Metal](https://en.wikipedia.org/wiki/Metal_(API)) 类似，但 Vulkan 的优势在于它是跨平台的，允许你同时为 Windows、Linux 和 Android 开发（并且通过 [MoltenVK](https://github.com/KhronosGroup/MoltenVK) 支持 iOS 和 macOS）。

然而，为获得这些好处所付出的代价是，你必须使用一个明显更为冗长的 API。与图形 API 相关的每个细节都需要由你的应用程序从头开始设置，包括初始帧缓冲的创建以及缓冲和纹理图像等对象的内存管理。图形驱动的干预会少很多，这意味着你需要在应用程序中做更多工作以确保其正确行为。

这里的核心信息是 Vulkan 并不适合所有人。它面向那些对高性能计算机图形充满热情，并愿意投入精力学习的程序员。如果相比于计算图形学，你对游戏开发更感兴趣，那么你可以继续使用 OpenGL 或 Direct3D，它们短期内不会因为 Vulkan 而被弃用。另一种选择是使用像 [Unreal Engine](https://en.wikipedia.org/wiki/Unreal_Engine#Unreal_Engine_4) 或 [Unity](https://en.wikipedia.org/wiki/Unity_(game_engine)) 这样的游戏引擎，它们能够使用 Vulkan，同时向你暴露更高层级的 API。

说明了这些之后，让我们来看看学习本教程的一些先决条件：

* 一块兼容 Vulkan 的显卡，及相应的驱动程序 ([NVIDIA](https://developer.nvidia.com/vulkan-driver), [AMD](http://www.amd.com/en-us/innovations/software-technologies/technologies-gaming/vulkan), [Intel](https://software.intel.com/en-us/blogs/2016/03/14/new-intel-vulkan-beta-1540204404-graphics-driver-for-windows-78110-1540))
* Java 使用经验
* 支持 Java 22 的 JDK
* 一个好的 IDE（主要用于自动导入依赖）
* 一些现有的 3D 计算机图形经验

本教程不假设你了解 OpenGL 或 Direct3D 的概念，但确实要求你了解 3D 计算机图形的基础知识。例如，它不会解释透视投影背后的数学原理。关于计算机图形概念的精彩介绍，请参阅[这本在线书籍](https://paroj.github.io/gltut/)。其他一些优秀的计算机图形资源包括：

* [《一周末光线追踪》(Ray tracing in one weekend)](https://raytracing.github.io/books/RayTracingInOneWeekend.html)
* [《基于物理的渲染》(Physically Based Rendering book)](http://www.pbr-book.org/)
* 在开源的 [Quake](https://github.com/Novum/vkQuake) 和 [DOOM 3](https://github.com/DustinHLand/vkDOOM3) 的真实引擎中使用 Vulkan 的示例

如果你想要 C++ 教程，请参阅原版教程：<https://vulkan-tutorial.com>

本教程使用 [`vulkan4j`](https://github.com/chuigda/vulkan4j) 包来提供从 Java 访问 Vulkan API 的能力。`vulkan4j` 提供了对 Vulkan API 的原始绑定，以及对这些绑定的一个轻量级封装，使其更易于在 Java 中以更符合语言习惯的方式使用。更重要的是，`vulkan4j` 构建于 [`Java 22 FFM`](https://openjdk.java.net/projects/panama/) API 之上，这是一项更加先进的技术。

如果你想要一个使用更成熟的包的 Java Vulkan 教程，可以看看这两个基于 LWJGL 的教程：[vulkanbook](https://github.com/lwjglgamedev/vulkanbook/tree/master)，[Vulkan-Tutorial-Java](https://github.com/Naitsirc98/Vulkan-Tutorial-Java)。

## 教程结构

我们将首先概述 Vulkan 的工作原理，以及让第一个三角形显示在屏幕上需要做哪些工作。在理解了所有这些小步骤在整体中的基本作用后，它们的意义会更加清晰。接下来，我们将使用 [Vulkan SDK](https://lunarg.com/vulkan-sdk/) 配置开发环境。

之后，我们将实现渲染第一个三角形所必需的 Vulkan 程序的所有基本组件。每章大致遵循以下结构：

* 介绍一个新概念及其目的
* 使用所有相关的 API 调用将其集成到你的程序中
* 将其部分内容抽象为辅助函数

虽然每章都是在前一章的基础上编写的，但也可以将各章作为介绍特定 Vulkan 特性的独立文章来阅读。这意味着本网站也可以作为参考资料使用。Vulkan 仍然是一个相当年轻的 API，因此规范本身可能存在一些不足。我们鼓励你向[此 Khronos 仓库](https://github.com/KhronosGroup/Vulkan-Docs)提交反馈。

每章的开头也会提供该章节最终代码的链接。如果你对代码结构有任何疑问，或者正在处理一个缺陷并希望进行比较，可以参考它。

本教程旨在成为一项社区共同努力的成果。Vulkan 仍然是一个相当新的 API，最佳实践尚未完全确立。如果你对教程和网站本身有任何类型的反馈，请随时向 [GitHub 仓库](https://github.com/chuigda/vulkan4j)提交问题或拉取请求。

在你完成了在屏幕上绘制第一个由 Vulkan驱动的三角形这一“仪式”之后，我们将开始扩展程序，以包含线性变换、纹理和 3D 模型。

如果你以前接触过图形 API，那么你就会知道，在第一个几何图形显示在屏幕上之前，可能需要很多步骤。Vulkan 中有很多这样的初始步骤，但你会发现每个单独的步骤都很容易理解，并且不会感觉冗余。同样重要的是要记住，一旦你画出了那个看起来枯燥的三角形，绘制带有完整纹理的 3D 模型并不需要太多额外的工作，而且在那之后的每一步都会更有价值。

如果在学习本教程过程中遇到任何问题，请查看 FAQ（常见问题解答），看看你的问题及其解决方案是否已列在那里。此外，你可能会在[原版教程](https://vulkan-tutorial.com/)相应章节的评论区找到遇到相同问题（如果不是 Java 特有的问题）的人。
