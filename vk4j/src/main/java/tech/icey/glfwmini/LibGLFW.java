package tech.icey.glfwmini;

import tech.icey.vk4j.Loader;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.nullable;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.array.IntArray;
import tech.icey.vk4j.datatype.VkAllocationCallbacks;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;
import tech.icey.vk4j.handle.VkSurfaceKHR;
import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public final class LibGLFW {
    public static final int GLFW_CLIENT_API = 0x00022001;
    public static final int GLFW_RESIZABLE = 0x00020003;
    public static final int GLFW_TRANSPARENT_FRAMEBUFFER = 0x0002000A;
    public static final int GLFW_NO_API = 0;
    public static final int GLFW_FALSE = 0;

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
    public static final FunctionDescriptor DESCRIPTOR$glfwWindowShouldClose = FunctionDescriptor.of(
            ValueLayout.JAVA_BOOLEAN,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwDestroyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );
    private static final FunctionDescriptor DESCRIPTOR$glfwGetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );
    public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowOpacity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
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
    public final MethodHandle HANDLE$glfwWindowShouldClose;
    public final MethodHandle HANDLE$glfwDestroyWindow;
    public final MethodHandle HANDLE$glfwGetWindowSize;
    public final MethodHandle HANDLE$glfwSetWindowOpacity;

    public LibGLFW(Function2<String, FunctionDescriptor, MethodHandle> loader) {
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
        HANDLE$glfwWindowShouldClose = loader.apply("glfwWindowShouldClose", DESCRIPTOR$glfwWindowShouldClose);
        HANDLE$glfwDestroyWindow = loader.apply("glfwDestroyWindow", DESCRIPTOR$glfwDestroyWindow);
        HANDLE$glfwGetWindowSize = loader.apply("glfwGetWindowSize", DESCRIPTOR$glfwGetWindowSize);
        HANDLE$glfwSetWindowOpacity = loader.apply("glfwSetWindowOpacity", DESCRIPTOR$glfwSetWindowOpacity);
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

    public @pointer(comment = "const char**") MemorySegment glfwGetRequiredInstanceExtensions(
            @pointer(comment = "uint32_t*") @unsigned IntPtr count
    ) {
        try {
            return (MemorySegment) HANDLE$glfwGetRequiredInstanceExtensions.invokeExact(count.segment());
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
            MemorySegment instanceSegment = instance != null ? instance.handle() : MemorySegment.NULL;
            MemorySegment ret = (MemorySegment) HANDLE$glfwGetInstanceProcAddress.invokeExact(instanceSegment, s);
            if (ret.address() == 0) {
                return null;
            }
            return Loader.nativeLinker.downcallHandle(ret, descriptor);
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

    public @pointer(comment="GLFWwindow*") MemorySegment glfwCreateWindow(
            int width,
            int height,
            String title,
            @pointer(comment="GLFWMonitor*") MemorySegment monitor,
            @pointer(comment="GLFWwindow*") MemorySegment share
    ) {
        try (Arena arena = Arena.ofConfined()) {
            MemorySegment titleSegment = arena.allocateFrom(title);
            return (MemorySegment) HANDLE$glfwCreateWindow.invokeExact(width, height, titleSegment, monitor, share);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public @enumtype(VkResult.class) int glfwCreateWindowSurface(
            VkInstance instance,
            @pointer(comment="GLFWwindow*") MemorySegment window,
            VkAllocationCallbacks allocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR surface
    ) {
        try {
            MemorySegment allocatorSegment = allocator != null ? allocator.segment() : MemorySegment.NULL;
            return (int) HANDLE$glfwCreateWindowSurface.invokeExact(
                    instance.handle(),
                    window,
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

    public boolean glfwWindowShouldClose(@pointer(comment="GLFWwindow*") MemorySegment window) {
        try {
            return (boolean) HANDLE$glfwWindowShouldClose.invokeExact(window);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwDestroyWindow(@pointer(comment="GLFWwindow*") MemorySegment window) {
        try {
            HANDLE$glfwDestroyWindow.invokeExact(window);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwGetWindowSize(
            @pointer(comment="GLFWwindow*") MemorySegment window,
            IntPtr width,
            IntPtr height
    ) {
        try {
            HANDLE$glfwGetWindowSize.invokeExact(window, width.segment(), height.segment());
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwGetWindowSize(
            @pointer(comment="GLFWwindow*") MemorySegment window,
            IntArray wh
    ) {
        try {
            HANDLE$glfwGetWindowSize.invokeExact(window, wh.segment(), wh.segment().asSlice(4, 4));
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }

    public void glfwSetWindowOpacity(@pointer(comment="GLFWwindow*") MemorySegment window, float opacity) {
        try {
            HANDLE$glfwSetWindowOpacity.invokeExact(window, opacity);
        } catch (Throwable throwable) {
            throw new RuntimeException(throwable);
        }
    }
}
