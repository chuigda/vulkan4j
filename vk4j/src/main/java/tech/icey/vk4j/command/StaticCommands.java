package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.RawFunctionLoader;
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

    public final @Nullable MemorySegment SEGMENT$vkGetDeviceProcAddr;
    public final @Nullable MemorySegment SEGMENT$vkGetInstanceProcAddr;
    public final @Nullable MethodHandle HANDLE$vkGetDeviceProcAddr;
    public final @Nullable MethodHandle HANDLE$vkGetInstanceProcAddr;

    public StaticCommands(RawFunctionLoader loader) {
        SEGMENT$vkGetDeviceProcAddr = loader.apply("vkGetDeviceProcAddr");
        HANDLE$vkGetDeviceProcAddr = RawFunctionLoader.link(SEGMENT$vkGetDeviceProcAddr, DESCRIPTOR$vkGetDeviceProcAddr);
        SEGMENT$vkGetInstanceProcAddr = loader.apply("vkGetInstanceProcAddr");
        HANDLE$vkGetInstanceProcAddr = RawFunctionLoader.link(SEGMENT$vkGetInstanceProcAddr, DESCRIPTOR$vkGetInstanceProcAddr);
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
            @Nullable VkInstance instance,
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
