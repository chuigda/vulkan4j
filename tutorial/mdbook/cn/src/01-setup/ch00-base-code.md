# 基础代码

> 本章内容的翻译使用了生成式人工智能，可能存在不准确之处。如有问题，欢迎提交问题和拉取请求。
>
> [英文版](https://vulkan4j.doki7.club/tutorial/en/01-setup/ch00-base-code.html) | [Java 代码](https://github.com/chuigda/vulkan4j/tree/master/tutorial/src/main/java/tutorial/vulkan/part01/ch00/Main.java) | [C++ 版本](https://vulkan-tutorial.com/Drawing_a_triangle/Setup/Base_code)

## 基本结构

在上一章中，你创建了一个包含所有正确配置的 Vulkan 项目。在本章中，我们将从以下代码开始从头构建：

```java
class Application {
    public void run() {
        initVulkan();
        mainLoop();
        cleanup();
    }

    private void initVulkan() {
    }

    private void mainLoop() {
    }

    private void cleanup() {
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            var app = new Application();
            app.run();
        }
        catch (Throwable e) {
            e.printStackTrace(System.err);
        }
    }
}
```

程序本身被封装在一个类中，我们将在该类中将 Vulkan 对象存储为私有类成员，并添加函数来初始化它们中的每一个，这些函数将从 `initVulkan` 函数中调用。一旦一切准备就绪，我们就进入主循环开始渲染帧。我们稍后会实现 `mainLoop` 函数，该函数中包含一个循环，该循环会一直迭代直到窗口关闭。一旦窗口关闭且 `mainLoop` 返回，我们将确保在 `cleanup` 函数中释放我们已使用的资源。

如果在执行过程中发生任何类型的致命错误，我们将抛出一个带有描述信息的 `RuntimeException` 异常，该异常将传播回主函数并打印到命令提示符。为了同时处理各种标准异常类型，我们捕获了更通用的 `java.lang.Throwable`。我们很快将处理的一个错误示例是发现某个必需的扩展不受支持。

在此之后，大致每一章都会添加一个将从 `initVulkan` 调用的新函数，以及一个或多个新的 Vulkan 对象到私有类成员中，这些对象需要在 `cleanup` 结束时被释放。

## 资源管理

就像每一块用 `malloc` 分配的内存都需要调用 `free` 来释放一样，我们创建的每一个 Vulkan 对象在不再需要时也需要被显式销毁。虽然在 Java 中有几种自动管理资源的方法，但是，在本教程中，我选择明确地进行 Vulkan 对象的分配和释放。毕竟，Vulkan 的特点就是对每个操作都明确指定以避免错误，因此明确对象的生存期以学习 API 的工作原理是很有益的。

学习完本教程后，你可以自己编写 Java 类来实现自动资源管理，这些类在其构造器中获取 Vulkan 对象，并可能在 `Autoclosable::close` 中释放它们，具体取决于你的所有权要求。对于较大的 Vulkan 程序，try-with-resource 是推荐的模型，但为了学习目的，了解幕后发生的事情总是好的。

Vulkan 对象要么通过像 `createXXX` 这样的函数直接创建，要么通过另一个对象使用像 `allocateXXX` 这样的函数进行分配。在确保某个对象不再被任何地方使用后，你需要用对应的 `destroyXXX` 和 `freeXXX` 来销毁它。这些函数的参数通常因对象类型而异，但它们共享一个参数：`pAllocator`。这是一个可选参数，允许你为自定义内存分配器指定回调。在本教程中，我们将忽略此参数，并始终传递 `null` 作为参数。

## 初始化 GLFW

如果你想将 Vulkan 用于离屏渲染，它在不创建窗口的情况下也能完美工作，但实际显示一些东西会更令人兴奋！添加一个 `initWindow` 函数，并在 `run` 函数中其他调用之前添加对它的调用。我们将使用该函数来初始化 GLFW 并创建一个窗口。

```java
public void run() {
    initWindow();
    initVulkan();
    mainLoop();
    cleanup();
}

private void initWindow() {
}
```

与 LWJGL 或其他一些封装不同，使用 `vulkan4j` 时，你需要手动加载库及其函数。首先，我们需要将 GLFW 本地库加载到 JVM 中。这可以通过一行代码完成：

```java
GLFWLoader.loadGLFWLibrary();
```

然后我们要加载 GLFW 函数。向 `Application` 类添加一个私有字段：

```java
private GLFW glfw;
```

然后在 `initWindow` 函数中初始化它：

```java
private void initWindow() {
    // ...
    glfw = GLFWLoader.loadGLFW();
}
```

然后我们可以调用 `GLFW::init()` 来初始化 GLFW 库。如果失败，我们将抛出一个异常：

```java
if (glfw.init() != GLFWConstants.TRUE) {
    throw new RuntimeException("初始化 GLFW 失败");
}
```

然后我们将使用 `GLFW::vulkanSupported()` 检查 Vulkan 支持情况：

```java
if (glfw.vulkanSupported() != GLFWConstants.TRUE) {
    throw new RuntimeException("不支持 Vulkan");
}
```

然后我们开始向 GLFW 提供关于我们想要创建的窗口的提示。因为 GLFW 最初是为创建 OpenGL 上下文而设计的，所以我们需要通过后续调用告诉它不要创建 OpenGL 上下文：

```java
glfw.windowHint(GLFWConstants.CLIENT_API, GLFWConstants.NO_API);
```

因为处理调整大小的窗口需要特别注意，我们稍后会研究，所以现在用另一个窗口提示调用来禁用它：

```java
glfw.windowHint(GLFWConstants.RESIZABLE, GLFWConstants.FALSE);
```

现在剩下的就是创建实际的窗口了。添加一个私有类成员来存储窗口句柄：

```java
private GLFWwindow window;
```

然后用 `GLFW::createWindow` 初始化它：

```java
window = glfw.createWindow(800, 600, ByteBuffer.allocateString(Arena.global(), "Vulkan"), null, null);
```

前三个参数指定窗口的宽度、高度和标题。第四个参数允许你可选地指定一个显示器来打开窗口，最后一个参数仅与 OpenGL 相关。

使用常量而不是硬编码的宽度和高度数字是一个好主意，因为我们将来会多次引用这些值。此外，使用常量有助于减小表达式的大小。我在 `Application` 类定义中添加了以下常量：

```java
private static final int WIDTH = 800;
private static final int HEIGHT = 600;
private static final BytePtr WINDOW_TITLE = BytePtr.allocateString(Arena.global(), "Vulkan");
```

并将窗口创建调用替换为

```java
window = glfw.createWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
```

你现在应该有一个如下所示的 `initWindow` 函数：

```java
private void initWindow() {
    GLFWLoader.loadGLFWLibrary();
    glfw = GLFWLoader.loadGLFW();

    if (glfw.init() != GLFWConstants.TRUE) {
        throw new RuntimeException("初始化 GLFW 失败");
    }

    if (glfw.vulkanSupported() != GLFWConstants.TRUE) {
        throw new RuntimeException("不支持 Vulkan");
    }

    glfw.windowHint(GLFWConstants.CLIENT_API, GLFWConstants.NO_API);
    glfw.windowHint(GLFWConstants.RESIZABLE, GLFWConstants.FALSE);
    window = glfw.createWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
}
```

为了让应用程序一直运行直到发生错误或窗口关闭，我们需要在 `mainLoop` 函数中添加一个事件循环，如下所示：

```java
private void mainLoop() {
    while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
        glfw.pollEvents();
    }
}
```

这段代码应该不言自明。它循环检查事件，例如按下 X 按钮，直到用户关闭窗口。这个循环也是我们稍后调用函数来渲染单个帧的地方。

一旦窗口关闭，我们需要通过销毁窗口并终止 GLFW 本身来清理资源。这将是我们的第一个 `cleanup` 代码：

```java
private void cleanup() {
    glfw.destroyWindow(window);
    glfw.terminate();
}
```

现在当你运行程序时，你应该会看到一个标题为 "Vulkan" 的窗口出现，直到通过关闭窗口来终止应用程序。既然我们已经有了 Vulkan 应用程序的骨架，让我们[创建第一个 Vulkan 对象](ch01-instance.md)吧！
