# 基础代码

在前一章中，我们创建并配置了一个 Vulkan 项目，并用一些代码测试它的运行情况。在这一章中，我们将从以下代码开始：

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

这个程序被封装在一个类中，我们将把 Vulkan 对象存储为私有类成员，并添加函数来初始化它们，这些函数将从 `initVulkan` 函数中调用。一旦一切准备就绪，我们将进入主循环以开始渲染帧。我们将在稍后的 `mainLoop` 函数中填充一个循环，直到窗口关闭。一旦窗口关闭并且 `mainLoop` 返回，我们将确保在 `cleanup` 函数中释放我们使用的资源。

如果在执行过程中发生任何致命错误，我们将抛出一个带有描述性报错消息的 `RuntimeException` 异常，这个异常将传播回主函数并打印到输出。为了处理各种标准异常类型，我们捕获了更一般的 `java.lang.Throwable`。我们很快将处理的一个错误示例是发现某个必需的扩展不受支持。

大致上，这一章之后的每一章都会添加一个新函数，这个函数将从 `initVulkan` 中调用，并且一个或多个新的 Vulkan 对象将被添加到私有类成员中，这些对象需要在 `cleanup` 中被释放。

## 资源管理

就像每个通过 malloc 分配的内存块都需要调用 free 一样，我们创建的每个 Vulkan 对象在不再需要时都需要显式地销毁。虽然在 Java 中有几种自动管理资源的方法，但是在本教程中，我选择对 Vulkan 对象的分配和释放进行显式处理。毕竟，Vulkan 的特点是对每个操作都要明确，以避免错误，所以对对象的生命周期进行明确处理是有好处的，可以了解 API 的工作原理。

在完成本教程后，你可以通过编写 Java 类，在其构造函数中获取 Vulkan 对象，并在 `Autoclosable::close` 中释放它们，根据你的所有权要求。RAII 是较大 Vulkan 程序的推荐模型，但是为了学习目的，了解背后发生的事情总是有好处的。

Vulkan 对象可以直接使用 `vkCreateXXX` 等函数创建，也可以通过另一个对象使用 `vkAllocateXXX` 等函数分配。确保对象不再被任何地方使用后，需要使用相应的 `vkDestroyXXX` 和 `vkFreeXXX` 销毁它。这些函数的参数通常因对象类型的不同而有所不同，但它们都有一个共同的参数：`pAllocator`。这是一个可选参数，允许你为自定义内存分配器指定回调。在本教程中，我们将忽略这个参数，并始终将 `null` 作为参数传递。

## 初始化 GLFW

如果你想用 Vulkan 进行离屏渲染，那么即使不创建窗口，它也可以正常工作，但是如果你想显示一些东西，那就更有趣了！添加一个 `initWindow` 函数，并在运行函数中的其他调用之前调用它。我们将使用这个函数来初始化 GLFW 并创建一个窗口。

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

不像 LWJGL 或一些其它封装库，使用 `vulkan4j`，你需要手动加载库和库函数。首先我们需要将 GLFW 的本地库加载到 JVM 中。这可以通过一行代码完成：

```java
GLFWLoader.loadGLFWLibrary();
```

然后我们想要加载 GLFW 函数。在 `Application` 类中添加一个私有字段：

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

然后我们可以调用 `glfwInit()` 来初始化 GLFW 库。如果失败，我们将抛出一个异常：

```java
if (glfw.glfwInit() != GLFWConstants.GLFW_TRUE) {
    throw new RuntimeException("Failed to initialize GLFW");
}
```

然后我们将使用 `glfwVulkanSupported()` 检查 Vulkan 支持情况：

```java
if (glfw.glfwVulkanSupported() != GLFWConstants.GLFW_TRUE) {
    throw new RuntimeException("Vulkan is not supported");
}
```

然后我们开始给 GLFW 提示我们想要创建的窗口。因为 GLFW 最初是为了创建 OpenGL 上下文而设计的，我们需要告诉它不要创建 OpenGL 上下文：

```java
glfw.glfwWindowHint(GLFWConstants.GLFW_CLIENT_API, GLFWConstants.GLFW_NO_API);
```

由于处理调整大小的窗口需要特别注意，我们先禁用它，稍后再详细讨论这个问题：

```java
glfw.glfwWindowHint(GLFWConstants.GLFW_RESIZABLE, GLFWConstants.GLFW_FALSE);
```

现在剩下的就是创建实际的窗口了。添加一个私有类成员来存储窗口句柄：

```java
private GLFWwindow window;
```

然后使用 `glfwCreateWindow` 初始化它：

```java
window = glfw.glfwCreateWindow(800, 600, ByteBuffer.allocateString(Arena.global(), "Vulkan"), null, null);
```

前三个参数分别指定了窗口的宽度、高度和标题。第四个参数允许你可选地指定一个显示器来打开窗口。最后一个参数只与 OpenGL 有关。

我们最好使用常量而不是硬编码的宽度和高度数字，因为之后我们会引用这些值好几次。另外，使用常量有助于减少表达式的大小。我在 `Application` 类定义中添加了以下常量：

```java
private static final int WIDTH = 800;
private static final int HEIGHT = 600;
private static final ByteBuffer WINDOW_TITLE = ByteBuffer.allocateString(Arena.global(), "Vulkan");
```

并且用以下代码替换了窗口创建调用：

```java
window = glfw.glfwCreateWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
```

你现在应该有一个如下所示的 `initWindow` 函数：

```java
private void initWindow() {
    GLFWLoader.loadGLFWLibrary();
    glfw = GLFWLoader.loadGLFW();
    if (glfw.glfwInit() != GLFWConstants.GLFW_TRUE) {
        throw new RuntimeException("Failed to initialize GLFW");
    }

    if (glfw.glfwVulkanSupported() != GLFWConstants.GLFW_TRUE) {
        throw new RuntimeException("Vulkan is not supported");
    }

    glfw.glfwWindowHint(GLFWConstants.GLFW_CLIENT_API, GLFWConstants.GLFW_NO_API);
    glfw.glfwWindowHint(GLFWConstants.GLFW_RESIZABLE, GLFWConstants.GLFW_FALSE);
    window = glfw.glfwCreateWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
}
```

为了保持应用程序运行，直到发生错误或窗口关闭，我们需要在 `mainLoop` 函数中添加一个事件循环：

```java
private void mainLoop() {
    while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
        glfw.glfwPollEvents();
    }
}
```

这段代码应该是非常容易理解的。它循环并检查事件（比如按下 X 按钮），直到用户关闭窗口。这也是我们之后调用函数来渲染每一帧的循环。

一旦窗口关闭，我们需要通过销毁它和终止 GLFW 本身来清理资源。这将是我们的第一个 `cleanup` 代码：

```java
private void cleanup() {
    glfw.glfwDestroyWindow(window);
    glfw.glfwTerminate();
}
```

当你现在运行程序时，你应该会看到一个标题为 Vulkan 的窗口，直到应用程序的窗口被关闭。现在我们已经有了 Vulkan 应用程序的框架，让我们[创建第一个 Vulkan 对象](instance.md)吧！
