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

public final class EntryCommands {
    public static final FunctionDescriptor DESCRIPTOR$vkCreateInstance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkInstanceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumerateInstanceVersion = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumerateInstanceLayerProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkLayerProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumerateInstanceExtensionProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkExtensionProperties.LAYOUT)
    );

    public final @nullable MethodHandle HANDLE$vkCreateInstance;
    public final @nullable MethodHandle HANDLE$vkEnumerateInstanceVersion;
    public final @nullable MethodHandle HANDLE$vkEnumerateInstanceLayerProperties;
    public final @nullable MethodHandle HANDLE$vkEnumerateInstanceExtensionProperties;

    public EntryCommands(FunctionLoader loader) {
        HANDLE$vkCreateInstance = loader.apply("vkCreateInstance", DESCRIPTOR$vkCreateInstance);
        HANDLE$vkEnumerateInstanceVersion = loader.apply("vkEnumerateInstanceVersion", DESCRIPTOR$vkEnumerateInstanceVersion);
        HANDLE$vkEnumerateInstanceLayerProperties = loader.apply("vkEnumerateInstanceLayerProperties", DESCRIPTOR$vkEnumerateInstanceLayerProperties);
        HANDLE$vkEnumerateInstanceExtensionProperties = loader.apply("vkEnumerateInstanceExtensionProperties", DESCRIPTOR$vkEnumerateInstanceExtensionProperties);
    }

    public @enumtype(VkResult.class) int vkCreateInstance(
            @pointer(target=VkInstanceCreateInfo.class) VkInstanceCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkInstance.class) VkInstance.Buffer pInstance
    ) {
        try {
            return (int) HANDLE$vkCreateInstance.invokeExact(
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pInstance.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateInstanceVersion(
             @unsigned IntBuffer pApiVersion
    ) {
        try {
            return (int) HANDLE$vkEnumerateInstanceVersion.invokeExact(
                    pApiVersion.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateInstanceLayerProperties(
             @unsigned IntBuffer pPropertyCount,
            @nullable @pointer(target=VkLayerProperties.class) VkLayerProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateInstanceLayerProperties.invokeExact(
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateInstanceExtensionProperties(
            @nullable  ByteBuffer pLayerName,
             @unsigned IntBuffer pPropertyCount,
            @nullable @pointer(target=VkExtensionProperties.class) VkExtensionProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateInstanceExtensionProperties.invokeExact(
                    (MemorySegment) (pLayerName != null ? pLayerName.segment() : MemorySegment.NULL),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
