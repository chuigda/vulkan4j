package tech.icey.glfwmini;

import tech.icey.panama.Loader;
import tech.icey.panama.FunctionLoader;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.panama.buffer.PointerBuffer;
import tech.icey.vk4j.datatype.VkAllocationCallbacks;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;
import tech.icey.vk4j.handle.VkSurfaceKHR;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public final class LibGLFW {
    public static final int GLFW_CLIENT_API = 0x00022001;
    public static final int GLFW_RESIZABLE = 0x00020003;
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;
    public static final int GLFW_NO_API = 0;
    public static final int GLFW_FALSE = 0;
    public static final int GLFW_TRUE = 1;

    public static final FunctionDescriptor DESCRIPTOR$glfwInit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwTerminate = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwInitHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$glfwVulkanSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetRequiredInstanceExtensions = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwGetInstanceProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowIconifyCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetFramebufferSizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$glfwWindowHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindowSurface = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwPollEvents = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwWaitEvents = FunctionDescriptor.ofVoid();
    public static final FunctionDescriptor DESCRIPTOR$glfwWindowShouldClose = FunctionDescriptor.of(
            ValueLayout.JAVA_BOOLEAN,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwDestroyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    private static final FunctionDescriptor DESCRIPTOR$glfwGetFramebufferSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    private static final FunctionDescriptor DESCRIPTOR$glfwGetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public final MethodHandle HANDLE$glfwInit;
    public final MethodHandle HANDLE$glfwTerminate;
    public final MethodHandle HANDLE$glfwInitHint;

    public final MethodHandle HANDLE$glfwVulkanSupported;
    public final MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;
    public final MethodHandle HANDLE$glfwGetInstanceProcAddress;
    public final MethodHandle HANDLE$glfwWindowHint;
    public final MethodHandle HANDLE$glfwCreateWindow;
    public final MethodHandle HANDLE$glfwCreateWindowSurface;
    public final MethodHandle HANDLE$glfwPollEvents;
    public final MethodHandle HANDLE$glfwWaitEvents;
    public final MethodHandle HANDLE$glfwWindowShouldClose;
    public final MethodHandle HANDLE$glfwDestroyWindow;
    public final MethodHandle HANDLE$glfwGetWindowSize;
    public final MethodHandle HANDLE$glfwGetFramebufferSize;
    public final MethodHandle HANDLE$glfwSetWindowIconifyCallback;
    public final MethodHandle HANDLE$glfwSetFramebufferSizeCallback;

    public LibGLFW(FunctionLoader loader) {
        HANDLE$glfwInit = loader.apply("glfwInit", DESCRIPTOR$glfwInit);
        HANDLE$glfwTerminate = loader.apply("glfwTerminate", DESCRIPTOR$glfwTerminate);
        HANDLE$glfwInitHint = loader.apply("glfwInitHint", DESCRIPTOR$glfwInitHint);

        HANDLE$glfwVulkanSupported = loader.apply("glfwVulkanSupported", DESCRIPTOR$glfwVulkanSupported);
        HANDLE$glfwGetRequiredInstanceExtensions = loader.apply("glfwGetRequiredInstanceExtensions", DESCRIPTOR$glfwGetRequiredInstanceExtensions);
        HANDLE$glfwGetInstanceProcAddress = loader.apply("glfwGetInstanceProcAddress", DESCRIPTOR$glfwGetInstanceProcAddress);
        HANDLE$glfwWindowHint = loader.apply("glfwWindowHint", DESCRIPTOR$glfwWindowHint);
        HANDLE$glfwCreateWindow = loader.apply("glfwCreateWindow", DESCRIPTOR$glfwCreateWindow);
        HANDLE$glfwCreateWindowSurface = loader.apply("glfwCreateWindowSurface", DESCRIPTOR$glfwCreateWindowSurface);
        HANDLE$glfwPollEvents = loader.apply("glfwPollEvents", DESCRIPTOR$glfwPollEvents);
        HANDLE$glfwWaitEvents = loader.apply("glfwWaitEvents", DESCRIPTOR$glfwWaitEvents);
        HANDLE$glfwWindowShouldClose = loader.apply("glfwWindowShouldClose", DESCRIPTOR$glfwWindowShouldClose);
        HANDLE$glfwDestroyWindow = loader.apply("glfwDestroyWindow", DESCRIPTOR$glfwDestroyWindow);
        HANDLE$glfwGetWindowSize = loader.apply("glfwGetWindowSize", DESCRIPTOR$glfwGetWindowSize);
        HANDLE$glfwGetFramebufferSize = loader.apply("glfwGetFramebufferSize", DESCRIPTOR$glfwGetFramebufferSize);
        HANDLE$glfwSetWindowIconifyCallback = loader.apply("glfwSetWindowIconifyCallback", DESCRIPTOR$glfwSetWindowIconifyCallback);
        HANDLE$glfwSetFramebufferSizeCallback = loader.apply("glfwSetFramebufferSizeCallback", DESCRIPTOR$glfwSetFramebufferSizeCallback);
    }

    public int glfwInit() {
        try {
            return (int) HANDLE$glfwInit.invokeExact();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwTerminate() {
        try {
            HANDLE$glfwTerminate.invokeExact();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwInitHint(int hint, int value) {
        try {
            HANDLE$glfwInitHint.invokeExact(hint, value);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public int glfwVulkanSupported() {
        try {
            return (int) HANDLE$glfwVulkanSupported.invokeExact();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public @pointer(comment = "const char**") PointerBuffer glfwGetRequiredInstanceExtensions(
            @pointer(comment = "uint32_t*") @unsigned IntBuffer count
    ) {
        try {
            MemorySegment s = (MemorySegment) HANDLE$glfwGetRequiredInstanceExtensions.invokeExact(count.segment());
            if (s.address() == 0) {
                return null;
            }

            s = s.reinterpret(count.read() * ValueLayout.ADDRESS.byteSize());
            return new PointerBuffer(s);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public MethodHandle glfwGetInstanceProcAddress(
            @nullable VkInstance instance,
            String procName,
            FunctionDescriptor descriptor
    ) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment s = arena.allocateFrom(procName);
            MemorySegment instanceSegment = instance != null ? instance.segment() : MemorySegment.NULL;
            MemorySegment ret = (MemorySegment) HANDLE$glfwGetInstanceProcAddress.invokeExact(instanceSegment, s);
            if (ret.address() == 0) {
                return null;
            }
            return Linker.nativeLinker().downcallHandle(ret, descriptor);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void glfwWindowHint(int hint, int value) {
        try {
            HANDLE$glfwWindowHint.invokeExact(hint, value);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public GLFWwindow glfwCreateWindow(
            int width,
            int height,
            String title,
            @pointer(comment="GLFWMonitor*") @nullable MemorySegment monitor,
            @pointer(comment="GLFWwindow*") @nullable MemorySegment share
    ) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment titleSegment = arena.allocateFrom(title);
            MemorySegment ret = (MemorySegment) HANDLE$glfwCreateWindow.invokeExact(
                    width,
                    height,
                    titleSegment,
                    (MemorySegment) (monitor != null ? monitor : MemorySegment.NULL),
                    (MemorySegment) (share != null ? share : MemorySegment.NULL)
            );
            return new GLFWwindow(ret);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public @enumtype(VkResult.class) int glfwCreateWindowSurface(
            VkInstance instance,
            GLFWwindow window,
            VkAllocationCallbacks allocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer surface
    ) {
        try {
            MemorySegment allocatorSegment = allocator != null ? allocator.segment() : MemorySegment.NULL;
            return (int) HANDLE$glfwCreateWindowSurface.invokeExact(
                    instance.segment(),
                    window.segment(),
                    allocatorSegment,
                    surface.segment()
            );
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwPollEvents() {
        try {
            HANDLE$glfwPollEvents.invokeExact();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwWaitEvents() {
        try {
            HANDLE$glfwWaitEvents.invokeExact();
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public boolean glfwWindowShouldClose(GLFWwindow window) {
        try {
            return (boolean) HANDLE$glfwWindowShouldClose.invokeExact(window.segment());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwDestroyWindow(GLFWwindow window) {
        try {
            HANDLE$glfwDestroyWindow.invokeExact(window.segment());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwGetWindowSize(GLFWwindow window, IntBuffer width, IntBuffer height) {
        try {
            HANDLE$glfwGetWindowSize.invokeExact(window.segment(), width.segment(), height.segment());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwGetFramebufferSize(GLFWwindow window, IntBuffer width, IntBuffer height) {
        try {
            HANDLE$glfwGetFramebufferSize.invokeExact(window.segment(), width.segment(), height.segment());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public @pointer(comment="GLFWwindowiconifyfun") MemorySegment glfwSetWindowIconifyCallback(
            GLFWwindow window,
            @pointer(comment="GLFWwindowiconifyfun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetWindowIconifyCallback.invokeExact(window.segment(), callback);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public @pointer(comment="GLFWframebuffersizefun") MemorySegment glfwSetFramebufferSizeCallback(
            GLFWwindow window,
            @pointer(comment="GLFWframebuffersizefun") MemorySegment callback
    ) {
        try {
            return (MemorySegment) HANDLE$glfwSetFramebufferSizeCallback.invokeExact(window.segment(), callback);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    /// Try loading the GLFW library.
    ///
    /// This function is implemented in terms of {@link System#loadLibrary}. On Windows it will try {@code "glfw3"}
    /// ({@code glfw3.dll}), and on other platforms it will try {@code "glfw"} ({@code libglfw.so}).
    ///
    /// Instead of using this function, you may also implement your own GLFW library loading logic.
    ///
    /// @throws SecurityException see {@link System#loadLibrary}
    /// @throws UnsatisfiedLinkError see {@link System#loadLibrary}
    public static void loadGLFWLibrary() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.loadLibrary("glfw3");
        } else {
            System.loadLibrary("glfw");
        }
    }

    /// Load GLFW functions.
    ///
    /// This function is implemented in terms of {@link Loader#loadFunction}. If any of the functions is not found,
    /// a {@link RuntimeException} will be thrown.
    ///
    /// Instead of using this function, you may also implement your own functions loading logic.
    ///
    /// @return loaded functions
    /// @throws RuntimeException if any function is not found
    public static LibGLFW loadGLFW() {
        return new LibGLFW(Loader::loadFunction);
    }
}
