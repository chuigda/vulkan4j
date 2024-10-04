package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.panama.FunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

public final class StaticCommands {
    public static final FunctionDescriptor DESCRIPTOR$vkGetDeviceProcAddr = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetInstanceProcAddr = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public final @nullable MethodHandle HANDLE$vkGetDeviceProcAddr;
    public final @nullable MethodHandle HANDLE$vkGetInstanceProcAddr;

    public StaticCommands(FunctionLoader loader) {
        HANDLE$vkGetDeviceProcAddr = loader.apply("vkGetDeviceProcAddr", DESCRIPTOR$vkGetDeviceProcAddr);
        HANDLE$vkGetInstanceProcAddr = loader.apply("vkGetInstanceProcAddr", DESCRIPTOR$vkGetInstanceProcAddr);
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDeviceProcAddr.html">vkGetDeviceProcAddr</a>
    public @pointer(comment="PFN_vkVoidFunction") MemorySegment vkGetDeviceProcAddr(
            VkDevice device,
            ByteBuffer pName
    ) {
        try {
            return (MemorySegment) HANDLE$vkGetDeviceProcAddr.invokeExact(
                    device.segment(),
                    pName.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetInstanceProcAddr.html">vkGetInstanceProcAddr</a>
    public @pointer(comment="PFN_vkVoidFunction") MemorySegment vkGetInstanceProcAddr(
            @nullable VkInstance instance,
            ByteBuffer pName
    ) {
        try {
            return (MemorySegment) HANDLE$vkGetInstanceProcAddr.invokeExact(
                    (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                    pName.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
