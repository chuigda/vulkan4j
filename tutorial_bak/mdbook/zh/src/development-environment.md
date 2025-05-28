# 开发环境

在这个章节中，我们将会安装 Vulkan SDK 并搭建开发 Vulkan 应用所需的环境。此教程假设你已经有一个搭建好的 Java 开发环境。

## Maven 项目

> TODO: 在我们正式发布 `vulkan4j` 之后，添加设置 Maven 项目的说明。

## Vulkan SDK

在开发 Vulkan 应用时需要用到的最关键的组件就是 Vulkan SDK。它包含了头文件、标准校验层、调试工具，以及一个 Vulkan 函数加载器。加载器将会在运行时从驱动中寻找 Vulkan 函数，如果你熟悉 OpenGL 的话，它的功能与 GLEW 类似。

### Windows

SDK 能在 [LunarG 网站](https://vulkan.lunarg.com/)下载。创建账户不是必须的，但它会给你阅读一些额外文档的权限，这些文档或许对你有用。

![](../../images/vulkan_sdk_download_buttons.png)

继续完成安装，并且注意 SDK 的安装路径。我们需要做的第一件事就是验证你的显卡与驱动支持 Vulkan。进入 SDK 的安装路径，打开 `Bin` 文件夹并且运行 `vkcube.exe` 示例应用。你应该会看到这个画面：

![](../../images/cube_demo.png)

如果你收到了一条错误信息，那你需要确保你的显卡驱动是最新的，包含 Vulkan 运行时，并且你的显卡支持 Vulkan。主流品牌的驱动下载链接详见[介绍章节](introduction.md)。

这个文件夹里有另外两个对开发很有用的程序。`glslangValidator.exe` 和 `glslc.exe` 将会把人类可阅读的 [GLSL](https://en.wikipedia.org/wiki/OpenGL_Shading_Language) （OpenGL Shading Language，OpenGL 着色器语言）代码编译为字节码。我们将会在[着色器模块章节](./pipeline/shader-modules.md)深入讨论这部分内容。`Bin` 文件夹也包含了 Vulkan 加载器与校验层的二进制文件；`Lib` 文件夹则包含了库。

你可以自由地探索其它文件，但本教程并不会用到它们。

### Linux

以下操作说明面向 Ubuntu 用户，非 Ubuntu 用户也可以将 `apt` 命令换成合适的你使用的包管理器的命令。

在 Linux 上开发 Vulkan 应用时需要用到的最关键的组件是 Vulkan 加载器，校验层，以及一些用来测试你的机器是否支持 Vulkan 的命令行实用工具：

* `sudo apt install vulkan-tools` &ndash; 命令行实用工具，最关键的两个是 `vulkaninfo` 和 `vkcube`。运行这两个命令来测试你的机器是否支持 Vulkan。
* `sudo apt install libvulkan-dev` &ndash; 安装 Vulkan 加载器。加载器将会在运行时从驱动中寻找这些函数，如果你熟悉 OpenGL 的话，它的功能与 GLEW 类似。
* `sudo apt install vulkan-validationlayers-dev` &ndash; 安装标准校验层。这在调试 Vulkan 应用程序时非常关键，我们会在之后的章节中讨论这部分内容。

如果你安装成功了，你在 Vulkan 部分没有别的需要做的了。记得运行 `vkcube` 并确保你可以在一个窗口中看见这个画面：

![](../../images/cube_demo_nowindow.png)

如果你收到了一条错误信息，那你需要确保你的显卡驱动是最新的，包含 Vulkan 运行时，并且你的显卡支持 Vulkan。主流品牌的驱动下载链接详见[介绍章节](introduction.md)。

### macOS

> TODO: 作者不使用 macOS，无法提供说明。如果你有可重现的 macOS 说明，请提交一个 pull request。
