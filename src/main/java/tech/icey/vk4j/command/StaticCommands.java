package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.datatype.*;
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
}
