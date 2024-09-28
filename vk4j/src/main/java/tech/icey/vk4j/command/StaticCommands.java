package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.util.FunctionLoader;

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
