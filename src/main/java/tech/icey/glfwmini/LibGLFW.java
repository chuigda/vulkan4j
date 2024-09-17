package tech.icey.glfwmini;

import tech.icey.vk4j.annotations.pointer;
import tech.icey.vk4j.annotations.unsigned;
import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public final class LibGLFW {
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

    public final MethodHandle HANDLE$glfwInit;
    public final MethodHandle HANDLE$glfwTerminate;
    public final MethodHandle HANDLE$glfwInitHint;

    public final MethodHandle HANDLE$glfwVulkanSupported;
    public final MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;

    public LibGLFW(Function2<String, FunctionDescriptor, MethodHandle> loader) {
        HANDLE$glfwInit = loader.apply("glfwInit", DESCRIPTOR$glfwInit);
        HANDLE$glfwTerminate = loader.apply("glfwTerminate", DESCRIPTOR$glfwTerminate);
        HANDLE$glfwInitHint = loader.apply("glfwInitHint", DESCRIPTOR$glfwInitHint);

        HANDLE$glfwVulkanSupported = loader.apply("glfwVulkanSupported", DESCRIPTOR$glfwVulkanSupported);
        HANDLE$glfwGetRequiredInstanceExtensions = loader.apply("glfwGetRequiredInstanceExtensions", DESCRIPTOR$glfwGetRequiredInstanceExtensions);
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
}
