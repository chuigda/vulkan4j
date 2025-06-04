# Hello Window

> [C++ version](https://learnopengl.com/Getting-started/Hello-Window)

Let's see if we can get GLFW up and running. First, let's initialize GLFW and instantiate the GLFW window:

```java
private static void applicationStart(GLFW glfw) {
    if (glfw.init() != GLFWConstants.TRUE) {
        throw new RuntimeException("Failed to initialize GLFW");
    }

    glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MAJOR, 3);
    glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MINOR, 3);
    glfw.windowHint(GLFWConstants.OPENGL_PROFILE, GLFWConstants.OPENGL_CORE_PROFILE);
}
```

In the main function we first initialize GLFW with `GLFW::init`, after which we can configure GLFW using `GLFW::windowHint`. The first argument of `GLFW::windowHint` tells us what option we want to configure, where we can select the option from a constant class `GLFWConstants`. The second argument is an integer that sets the value of our option. A list of all the possible options and its corresponding values can be found at [GLFW's window handling](http://www.glfw.org/docs/latest/window.html#window_hints) documentation. If you try to run the application now and it gives a lot of undefined reference errors it means you didn't successfully link the GLFW library. 

Since the focus of this book is on OpenGL version 3.3 we'd like to tell GLFW that 3.3 is the OpenGL version we want to use. This way GLFW can make the proper arrangements when creating the OpenGL context. This ensures that when a user does not have the proper OpenGL version GLFW fails to run. We set the major and minor version both to `3`. We also tell GLFW we want to explicitly use the core-profile. Telling GLFW we want to use the core-profile means we'll get access to a smaller subset of OpenGL features without backwards-compatible features we no longer need. Note that on Mac OS X you need to add `glfw.windowHint(GLFWConstants.OPENGL_FORWARD_COMPAT, GLConstants.TRUE);` to your initialization code for it to work.

> Make sure you have OpenGL versions 3.3 or higher installed on your system/hardware otherwise the application will crash or display undefined behavior. To find the OpenGL version on your machine either call `glxinfo` on Linux machines or use a utility like the [OpenGL Extension Viewer](http://download.cnet.com/OpenGL-Extensions-Viewer/3000-18487_4-34442.html) for Windows. If your supported version is lower try to check if your video card supports OpenGL 3.3+ (otherwise it's antique) and/or update your drivers. 

Next we're required to create a window object. This window object holds all the windowing data and is required by most of GLFW's other functions.

```java
GLFWwindow window = glfw.createWindow(
        800,
        600,
        BytePtr.allocateString(arena, "LearnOpenGL"),
        null,
        null
);
if (window == null) {
    throw new RuntimeException("Failed to create GLFW window");
}
glfw.makeContextCurrent(window);
```

The `GLFW::createWindow` function requires the window width and height as its first two arguments respectively. The third argument allows us to create a name for the window; for now we call it `"LearnOpenGL"` but you're allowed to name it however you like. We can ignore the last 2 parameters. The function returns a `GLFWwindow` handle object that we'll later need for other GLFW operations. After that we tell GLFW to make the context of our window the main context on the current thread. 

## Loading OpenGL functions
