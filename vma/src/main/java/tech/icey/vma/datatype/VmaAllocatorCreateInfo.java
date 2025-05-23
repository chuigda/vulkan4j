package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaAllocatorCreateInfo(MemorySegment segment) implements IPointer {
    public @enumtype(VmaAllocatorCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VmaAllocatorCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkPhysicalDevice physicalDevice() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevice, SIZE$physicalDevice);
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public void physicalDevice(@Nullable VkPhysicalDevice value) {
        segment.set(
            LAYOUT$physicalDevice,
            OFFSET$physicalDevice,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkDevice device() {
        MemorySegment s = segment.asSlice(OFFSET$device, SIZE$device);
        if (s.address() == 0) {
            return null;
        }
        return new VkDevice(s);
    }

    public void device(@Nullable VkDevice value) {
        segment.set(
            LAYOUT$device,
            OFFSET$device,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long preferredLargeHeapBlockSize() {
        return segment.get(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize);
    }

    public void preferredLargeHeapBlockSize(@unsigned long value) {
        segment.set(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize, value);
    }

    public @pointer(comment="VkAllocationCallbacks*") MemorySegment pAllocationCallbacksRaw() {
        return segment.get(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks);
    }

    public void pAllocationCallbacksRaw(@pointer(comment="VkAllocationCallbacks*") MemorySegment value) {
        segment.set(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks, value);
    }

    public @Nullable VkAllocationCallbacks pAllocationCallbacks() {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAllocationCallbacks(s);
    }

    /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
    @unsafe
    public @Nullable VkAllocationCallbacks[] pAllocationCallbacks(int assumedCount) {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAllocationCallbacks.SIZE);
        VkAllocationCallbacks[] ret = new VkAllocationCallbacks[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            ret[i] = new VkAllocationCallbacks(s.asSlice(i * VkAllocationCallbacks.SIZE, VkAllocationCallbacks.SIZE));
        }
        return ret;
    }

    public void pAllocationCallbacks(@Nullable VkAllocationCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAllocationCallbacksRaw(s);
    }

    public @pointer(comment="VmaDeviceMemoryCallbacks*") MemorySegment pDeviceMemoryCallbacksRaw() {
        return segment.get(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks);
    }

    public void pDeviceMemoryCallbacksRaw(@pointer(comment="VmaDeviceMemoryCallbacks*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks, value);
    }

    public @Nullable VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() {
        MemorySegment s = pDeviceMemoryCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VmaDeviceMemoryCallbacks(s);
    }

    /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
    @unsafe
    public @Nullable VmaDeviceMemoryCallbacks[] pDeviceMemoryCallbacks(int assumedCount) {
        MemorySegment s = pDeviceMemoryCallbacksRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaDeviceMemoryCallbacks.SIZE);
        VmaDeviceMemoryCallbacks[] ret = new VmaDeviceMemoryCallbacks[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            ret[i] = new VmaDeviceMemoryCallbacks(s.asSlice(i * VmaDeviceMemoryCallbacks.SIZE, VmaDeviceMemoryCallbacks.SIZE));
        }
        return ret;
    }

    public void pDeviceMemoryCallbacks(@Nullable VmaDeviceMemoryCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceMemoryCallbacksRaw(s);
    }

    public @pointer(comment="long*") MemorySegment pHeapSizeLimitRaw() {
        return segment.get(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit);
    }

    public void pHeapSizeLimitRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct 
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongBuffer pHeapSizeLimit() {
        MemorySegment s = pHeapSizeLimitRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongBuffer(s);
    }

    public void pHeapSizeLimit(@Nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHeapSizeLimitRaw(s);
    }

    public @pointer(comment="VmaVulkanFunctions*") MemorySegment pVulkanFunctionsRaw() {
        return segment.get(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions);
    }

    public void pVulkanFunctionsRaw(@pointer(comment="VmaVulkanFunctions*") MemorySegment value) {
        segment.set(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions, value);
    }

    public @Nullable VmaVulkanFunctions pVulkanFunctions() {
        MemorySegment s = pVulkanFunctionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VmaVulkanFunctions(s);
    }

    /// Note: this function is {@link unsafe} because it's up to caller to provide the correct count of elements.
    @unsafe
    public @Nullable VmaVulkanFunctions[] pVulkanFunctions(int assumedCount) {
        MemorySegment s = pVulkanFunctionsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaVulkanFunctions.SIZE);
        VmaVulkanFunctions[] ret = new VmaVulkanFunctions[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            ret[i] = new VmaVulkanFunctions(s.asSlice(i * VmaVulkanFunctions.SIZE, VmaVulkanFunctions.SIZE));
        }
        return ret;
    }

    public void pVulkanFunctions(@Nullable VmaVulkanFunctions value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVulkanFunctionsRaw(s);
    }

    public @Nullable VkInstance instance() {
        MemorySegment s = segment.asSlice(OFFSET$instance, SIZE$instance);
        if (s.address() == 0) {
            return null;
        }
        return new VkInstance(s);
    }

    public void instance(@Nullable VkInstance value) {
        segment.set(
            LAYOUT$instance,
            OFFSET$instance,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int vulkanApiVersion() {
        return segment.get(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion);
    }

    public void vulkanApiVersion(@unsigned int value) {
        segment.set(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion, value);
    }

    public @pointer(target=VkExternalMemoryHandleTypeFlags.class) MemorySegment pTypeExternalMemoryHandleTypesRaw() {
        return segment.get(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes);
    }

    public void pTypeExternalMemoryHandleTypesRaw(@pointer(target=VkExternalMemoryHandleTypeFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually reading from
    /// or writing to the buffer.
    public @Nullable @enumtype(VkExternalMemoryHandleTypeFlags.class) IntBuffer pTypeExternalMemoryHandleTypes() {
        MemorySegment s = pTypeExternalMemoryHandleTypesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntBuffer(s);
    }

    public void pTypeExternalMemoryHandleTypes(@Nullable @enumtype(VkExternalMemoryHandleTypeFlags.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTypeExternalMemoryHandleTypesRaw(s);
    }

    public static VmaAllocatorCreateInfo allocate(Arena arena) {
        return new VmaAllocatorCreateInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocatorCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaAllocatorCreateInfo[] ret = new VmaAllocatorCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaAllocatorCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaAllocatorCreateInfo clone(Arena arena, VmaAllocatorCreateInfo src) {
        VmaAllocatorCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaAllocatorCreateInfo[] clone(Arena arena, VmaAllocatorCreateInfo[] src) {
        VmaAllocatorCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device"),
        ValueLayout.JAVA_LONG.withName("preferredLargeHeapBlockSize"),
        ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT).withName("pAllocationCallbacks"),
        ValueLayout.ADDRESS.withTargetLayout(VmaDeviceMemoryCallbacks.LAYOUT).withName("pDeviceMemoryCallbacks"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pHeapSizeLimit"),
        ValueLayout.ADDRESS.withTargetLayout(VmaVulkanFunctions.LAYOUT).withName("pVulkanFunctions"),
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.JAVA_INT.withName("vulkanApiVersion"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTypeExternalMemoryHandleTypes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$physicalDevice = PathElement.groupElement("physicalDevice");
    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$preferredLargeHeapBlockSize = PathElement.groupElement("preferredLargeHeapBlockSize");
    public static final PathElement PATH$pAllocationCallbacks = PathElement.groupElement("pAllocationCallbacks");
    public static final PathElement PATH$pDeviceMemoryCallbacks = PathElement.groupElement("pDeviceMemoryCallbacks");
    public static final PathElement PATH$pHeapSizeLimit = PathElement.groupElement("pHeapSizeLimit");
    public static final PathElement PATH$pVulkanFunctions = PathElement.groupElement("pVulkanFunctions");
    public static final PathElement PATH$instance = PathElement.groupElement("instance");
    public static final PathElement PATH$vulkanApiVersion = PathElement.groupElement("vulkanApiVersion");
    public static final PathElement PATH$pTypeExternalMemoryHandleTypes = PathElement.groupElement("pTypeExternalMemoryHandleTypes");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$physicalDevice = (AddressLayout) LAYOUT.select(PATH$physicalDevice);
    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);
    public static final OfLong LAYOUT$preferredLargeHeapBlockSize = (OfLong) LAYOUT.select(PATH$preferredLargeHeapBlockSize);
    public static final AddressLayout LAYOUT$pAllocationCallbacks = (AddressLayout) LAYOUT.select(PATH$pAllocationCallbacks);
    public static final AddressLayout LAYOUT$pDeviceMemoryCallbacks = (AddressLayout) LAYOUT.select(PATH$pDeviceMemoryCallbacks);
    public static final AddressLayout LAYOUT$pHeapSizeLimit = (AddressLayout) LAYOUT.select(PATH$pHeapSizeLimit);
    public static final AddressLayout LAYOUT$pVulkanFunctions = (AddressLayout) LAYOUT.select(PATH$pVulkanFunctions);
    public static final AddressLayout LAYOUT$instance = (AddressLayout) LAYOUT.select(PATH$instance);
    public static final OfInt LAYOUT$vulkanApiVersion = (OfInt) LAYOUT.select(PATH$vulkanApiVersion);
    public static final AddressLayout LAYOUT$pTypeExternalMemoryHandleTypes = (AddressLayout) LAYOUT.select(PATH$pTypeExternalMemoryHandleTypes);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$physicalDevice = LAYOUT.byteOffset(PATH$physicalDevice);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$preferredLargeHeapBlockSize = LAYOUT.byteOffset(PATH$preferredLargeHeapBlockSize);
    public static final long OFFSET$pAllocationCallbacks = LAYOUT.byteOffset(PATH$pAllocationCallbacks);
    public static final long OFFSET$pDeviceMemoryCallbacks = LAYOUT.byteOffset(PATH$pDeviceMemoryCallbacks);
    public static final long OFFSET$pHeapSizeLimit = LAYOUT.byteOffset(PATH$pHeapSizeLimit);
    public static final long OFFSET$pVulkanFunctions = LAYOUT.byteOffset(PATH$pVulkanFunctions);
    public static final long OFFSET$instance = LAYOUT.byteOffset(PATH$instance);
    public static final long OFFSET$vulkanApiVersion = LAYOUT.byteOffset(PATH$vulkanApiVersion);
    public static final long OFFSET$pTypeExternalMemoryHandleTypes = LAYOUT.byteOffset(PATH$pTypeExternalMemoryHandleTypes);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$physicalDevice = LAYOUT$physicalDevice.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$preferredLargeHeapBlockSize = LAYOUT$preferredLargeHeapBlockSize.byteSize();
    public static final long SIZE$pAllocationCallbacks = LAYOUT$pAllocationCallbacks.byteSize();
    public static final long SIZE$pDeviceMemoryCallbacks = LAYOUT$pDeviceMemoryCallbacks.byteSize();
    public static final long SIZE$pHeapSizeLimit = LAYOUT$pHeapSizeLimit.byteSize();
    public static final long SIZE$pVulkanFunctions = LAYOUT$pVulkanFunctions.byteSize();
    public static final long SIZE$instance = LAYOUT$instance.byteSize();
    public static final long SIZE$vulkanApiVersion = LAYOUT$vulkanApiVersion.byteSize();
    public static final long SIZE$pTypeExternalMemoryHandleTypes = LAYOUT$pTypeExternalMemoryHandleTypes.byteSize();
}

