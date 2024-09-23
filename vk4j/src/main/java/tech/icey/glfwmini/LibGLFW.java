package tech.icey.glfwmini;

import tech.icey.vk4j.Loader;
import tech.icey.vk4j.annotations.enumtype;
import tech.icey.vk4j.annotations.nullable;
import tech.icey.vk4j.annotations.pointer;
import tech.icey.vk4j.annotations.unsigned;
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
    public static final int GLFW_NO_API = 0;

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

    public final MethodHandle HANDLE$glfwInit;
    public final MethodHandle HANDLE$glfwTerminate;
    public final MethodHandle HANDLE$glfwInitHint;

    public final MethodHandle HANDLE$glfwVulkanSupported;
    public final MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;
    public final MethodHandle HANDLE$glfwGetInstanceProcAddress;
    public final MethodHandle HANDLE$glfwWindowHint;
    public final MethodHandle HANDLE$glfwCreateWindow;
    public final MethodHandle HANDLE$glfwCreateWindowSurface;

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
            // TODO: here if we try to "inline" the expression into invokeExact arguments there'll be a
            // java.lang.invoke.WrongMethodTypeException. Why?
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
}
