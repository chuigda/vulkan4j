# 开发环境

> 本章内容的翻译使用了生成式人工智能，可能存在不准确之处。如有问题，欢迎提交问题和拉取请求。
>
> [英文版](https://vulkan4j.doki7.club/tutorial/en/development-environment.html) | [C++ 版本](https://vulkan-tutorial.com/Development_environment)

在本章中，我们将为你的操作系统安装 Vulkan SDK，配置你用于开发 Vulkan 应用程序的环境。本教程假定你已经拥有一个可用的 Java 开发环境。

## Maven 项目

创建一个 Maven 项目，并将以下依赖项添加到你的 `pom.xml` 文件中：

```xml
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>ffm-plus</artifactId>
    <version>0.2.0</version>
</dependency>
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>vulkan</artifactId>
    <version>0.3.0</version>
</dependency>
<dependency>
    <groupId>club.doki7</groupId>
    <artifactId>glfw</artifactId>
    <version>0.3.0</version>
</dependency>
<dependency>
    <groupId>org.joml</groupId>
    <artifactId>joml</artifactId>
    <version>1.10.8</version>
</dependency>
<dependency>
    <groupId>de.javagl</groupId>
    <artifactId>obj</artifactId>
    <version>0.4.0</version>
</dependency>
```

`club.doki7.vulkan` 是 Vulkan 的 Java 绑定，`club.doki7.ffm-plus` 是一个库，它在 Java 22 FFM API 之上提供了一个轻量级封装，使其更易于使用且类型安全。`club.doki7.glfw` 是 GLFW 库的 Java 绑定，我们将用它来创建窗口。`org.joml` 是一个数学库，我们将用它进行向量和矩阵运算。`de.javagl.obj` 是一个用于加载 Wavefront OBJ 文件的库，我们将用它来加载 3D 模型。

## GLFW

与 `lwjgl-glfw` 和其他 GLFW 的 Java 绑定不同，`club.doki7.glfw` 不附带原生二进制文件。你需要为你的操作系统和架构下载 GLFW 二进制文件，可以从[官方网站](https://www.glfw.org/download.html)下载，也可以使用你喜欢的包管理器。

如果你使用包管理器，所有事情都应该会自动为你设置好。但是，如果你手动下载二进制文件，则需要多花一些功夫才能让 JVM 找到原生库。有两种方法可以做到这一点：

-   将原生库文件（`glfw3.dll`）复制（或链接）到 `PATH` 环境变量包含的某个目录中。
-   将 `java.library.path` 系统属性设置为包含原生库的目录。这可以通过向 JVM 参数添加以下行来完成：`-Djava.library.path=/path/to/glfw/native/libs`。如果你使用 IDE，通常可以在运行配置中进行设置。有关更多信息，请查阅你的 IDE 文档。

在实际生产中，你可能希望将原生库与你的应用程序（通常是 JAR 文件）捆绑在一起，在这种情况下，你可以使用像 [native-utils](https://github.com/adamheinrich/native-utils) 这样的解决方案。

> Chuigda 没有将原生库与 `club.doki7.glfw` 捆绑在一起，因为他不知道 Java 世界的最佳实践是什么<del>，绝对不是因为他懒</del>。如果你有好主意，随时欢迎提交拉取请求。

## Vulkan SDK

开发 Vulkan 应用程序所需的最重要的组件是 SDK。它包括头文件、标准校验层、调试工具以及 Vulkan 函数的加载器。该加载器在运行时从驱动程序中查找函数，类似于 OpenGL 的 GLEW——如果你熟悉的话。

### Windows

SDK 可以从 [LunarG 网站](https://vulkan.lunarg.com/) 使用页面底部的按钮下载。你不需要创建账户，但这会让你能够访问一些可能对你有用的额外文档。

![](../images/vulkan_sdk_download_buttons.png)

继续安装过程，并注意 SDK 的安装位置。我们要做的第一件事是验证你的显卡和驱动程序是否正确支持 Vulkan。转到你安装 SDK 的目录，打开 `Bin` 目录并运行 `vkcube.exe` 演示程序。你应该会看到以下内容：

![](../images/cube_demo.png)

如果你收到错误消息，请确保你的驱动程序是最新的，包含 Vulkan 运行时，并且你的显卡受支持。有关主要供应商驱动程序的链接，请参阅[介绍章节](introduction.md)。

此目录中还有另一个对开发有用的程序。`glslangValidator.exe` 和 `glslc.exe` 程序将用于将人类可读的 [GLSL](https://en.wikipedia.org/wiki/OpenGL_Shading_Language) 着色器编译为字节码。我们将在[着色器模块](pipeline/ch09-shader-modules.md)一章深入介绍这一点。`Bin` 目录还包含 Vulkan 加载器和校验层的二进制文件，而 `Lib` 目录包含库文件。

你可以随意浏览其他文件，但本教程不需要它们。

### Linux

这些说明主要面向 Ubuntu 用户，但你可以通过将 `apt` 命令更改为适合你的包管理器命令来参照执行。

在 Linux 上开发 Vulkan 应用程序所需的最重要的组件是 Vulkan 加载器、校验层以及一些用于测试你的机器是否支持 Vulkan 的命令行实用程序：

*   `sudo apt install vulkan-tools` – 命令行实用程序，最重要的是 `vulkaninfo` 和 `vkcube`。运行这些程序以确认你的机器支持 Vulkan。
*   `sudo apt install libvulkan-dev` – 安装 Vulkan 加载器。该加载器在运行时从驱动程序中查找函数，类似于 OpenGL 的 GLEW——如果你熟悉的话。
*   `sudo apt install vulkan-validationlayers-dev` – 安装标准校验层。这些在调试 Vulkan 应用程序时至关重要，我们将在后续章节中讨论它们。

如果安装成功，Vulkan 部分就应该准备就绪了。记住运行 `vkcube` 并确保你看到以下内容弹出一个窗口：

![](../images/cube_demo_nowindow.png)

如果你收到错误消息，请确保你的驱动程序是最新的，包含 Vulkan 运行时，并且你的显卡受支持。有关主要供应商驱动程序的链接，请参阅[介绍章节](introduction.md)。

### macOS

> TODO：作者不使用 macOS，也没有 macOS 实例，无法提供相关说明。如果你有适用于 macOS 的可复现的说明，请提交一个拉取请求。
