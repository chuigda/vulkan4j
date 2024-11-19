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

    public final @Nullable MemorySegment SEGMENT$vkCreateInstance;
    public final @Nullable MemorySegment SEGMENT$vkEnumerateInstanceVersion;
    public final @Nullable MemorySegment SEGMENT$vkEnumerateInstanceLayerProperties;
    public final @Nullable MemorySegment SEGMENT$vkEnumerateInstanceExtensionProperties;
    public final @Nullable MethodHandle HANDLE$vkCreateInstance;
    public final @Nullable MethodHandle HANDLE$vkEnumerateInstanceVersion;
    public final @Nullable MethodHandle HANDLE$vkEnumerateInstanceLayerProperties;
    public final @Nullable MethodHandle HANDLE$vkEnumerateInstanceExtensionProperties;

    public EntryCommands(RawFunctionLoader loader) {
        SEGMENT$vkCreateInstance = loader.apply("vkCreateInstance");
        HANDLE$vkCreateInstance = RawFunctionLoader.link(SEGMENT$vkCreateInstance, DESCRIPTOR$vkCreateInstance);
        SEGMENT$vkEnumerateInstanceVersion = loader.apply("vkEnumerateInstanceVersion");
        HANDLE$vkEnumerateInstanceVersion = RawFunctionLoader.link(SEGMENT$vkEnumerateInstanceVersion, DESCRIPTOR$vkEnumerateInstanceVersion);
        SEGMENT$vkEnumerateInstanceLayerProperties = loader.apply("vkEnumerateInstanceLayerProperties");
        HANDLE$vkEnumerateInstanceLayerProperties = RawFunctionLoader.link(SEGMENT$vkEnumerateInstanceLayerProperties, DESCRIPTOR$vkEnumerateInstanceLayerProperties);
        SEGMENT$vkEnumerateInstanceExtensionProperties = loader.apply("vkEnumerateInstanceExtensionProperties");
        HANDLE$vkEnumerateInstanceExtensionProperties = RawFunctionLoader.link(SEGMENT$vkEnumerateInstanceExtensionProperties, DESCRIPTOR$vkEnumerateInstanceExtensionProperties);
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateInstance.html">vkCreateInstance</a>
    public @enumtype(VkResult.class) int vkCreateInstance(
            @pointer(target=VkInstanceCreateInfo.class) VkInstanceCreateInfo pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumerateInstanceVersion.html">vkEnumerateInstanceVersion</a>
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumerateInstanceLayerProperties.html">vkEnumerateInstanceLayerProperties</a>
    public @enumtype(VkResult.class) int vkEnumerateInstanceLayerProperties(
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkLayerProperties.class) VkLayerProperties pProperties
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumerateInstanceExtensionProperties.html">vkEnumerateInstanceExtensionProperties</a>
    public @enumtype(VkResult.class) int vkEnumerateInstanceExtensionProperties(
            @Nullable ByteBuffer pLayerName,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkExtensionProperties.class) VkExtensionProperties pProperties
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
