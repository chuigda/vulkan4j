package tech.icey.vk4j.command;

import tech.icey.vk4j.annotation.nullable;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.buffer.ByteBuffer;
import tech.icey.vk4j.handle.VkDevice;
import tech.icey.vk4j.handle.VkInstance;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

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

    public StaticCommands(Function2<String, FunctionDescriptor, MethodHandle> loader) {
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
