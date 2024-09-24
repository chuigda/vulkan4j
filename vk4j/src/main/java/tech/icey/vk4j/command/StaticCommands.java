package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.util.Function2;

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
            @pointer(target=BytePtr.class) BytePtr pName
    ) {
        try {
            return (MemorySegment) HANDLE$vkGetDeviceProcAddr.invoke(
                    device.handle(),
                    pName.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @pointer(comment="PFN_vkVoidFunction") MemorySegment vkGetInstanceProcAddr(
            @nullable VkInstance instance,
            @pointer(target=BytePtr.class) BytePtr pName
    ) {
        try {
            return (MemorySegment) HANDLE$vkGetInstanceProcAddr.invoke(
                    instance != null ? instance.handle() : MemorySegment.NULL,
                    pName.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
