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

After creating the window and thus having the OpenGL context, we can start loading the OpenGL functions. GLFW provides a function to load the OpenGL functions: `GLFW::getProcAddress`:

```java
GL gl = new GL(name -> {
    try (Arena arena1 = Arena.ofConfined()) {
        return glfw.getProcAddress(BytePtr.allocateString(arena1, name));
    }
});
```

> Where are my compatibility profile functions?
> 
> The `GL` class only provides access to the OpenGL core profile functions. If you look closely you'll find it's a `sealed` class and its only subclass is `GLCompatibility`, which extends `GL` and provides access to the compatibility profile functions. If you want to use the compatibility profile, you can use `GLCompatibility` instead of `GL`. Remember to update `GLFW::windowHint` call to use compatibility profile instead of core profile.

## Viewport

Before we can start rendering we have to do one last thing. We have to tell OpenGL the size of the rendering window so OpenGL knows how we want to display the data and coordinates with respect to the window. We can set those dimensions via the `GL::viewport` function:

```java
gl.viewport(0, 0, 800, 600);
```

The first two parameters of `GL::viewport` set the location of the lower left corner of the window. The third and fourth parameter set the width and height of the rendering window in pixels, which we set equal to GLFW's window size. 

We could actually set the viewport dimensions at values smaller than GLFW's dimensions; then all the OpenGL rendering would be displayed in a smaller window and we could for example display other elements outside the OpenGL viewport. 

> Behind the scenes OpenGL uses the data specified via `GL::viewport` to transform the 2D coordinates it processed to coordinates on your screen. For example, a processed point of location `(-0.5, 0.5)` would (as its final transformation) be mapped to `(200, 450)` in screen coordinates. Note that processed coordinates in OpenGL are between `-1` and `1` so we effectively map from the range `(-1 to 1)` to `(0, 800)` and `(0, 600)`. 

However, the moment a user resizes the window the viewport should be adjusted as well. We can register a callback function on the window that gets called each time the window is resized. This resize callback function has the following prototype: 

```c
void framebuffer_size_callback(GLFWwindow* window, int width, int height);
```
