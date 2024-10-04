package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.vk4j.bitmask.VkShaderStageFlags;
import tech.icey.vk4j.bitmask.VkSubgroupFeatureFlags;
import tech.icey.vk4j.enumtype.VkPointClippingBehavior;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.Constants.VK_LUID_SIZE;
import static tech.icey.vk4j.Constants.VK_UUID_SIZE;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkan11Properties {
///     VkStructureType sType;
///     void* pNext;
///     uint8_t deviceUUID[VK_UUID_SIZE];
///     uint8_t driverUUID[VK_UUID_SIZE];
///     uint8_t deviceLUID[VK_LUID_SIZE];
///     uint32_t deviceNodeMask;
///     VkBool32 deviceLUIDValid;
///     uint32_t subgroupSize;
///     VkShaderStageFlags subgroupSupportedStages;
///     VkSubgroupFeatureFlags subgroupSupportedOperations;
///     VkBool32 subgroupQuadOperationsInAllStages;
///     VkPointClippingBehavior pointClippingBehavior;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
///     VkBool32 protectedNoFault;
///     uint32_t maxPerSetDescriptors;
///     VkDeviceSize maxMemoryAllocationSize;
/// } VkPhysicalDeviceVulkan11Properties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceVulkan11Properties.html">VkPhysicalDeviceVulkan11Properties</a>
public record VkPhysicalDeviceVulkan11Properties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceVulkan11Properties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public MemorySegment deviceUUIDRaw() {
        return segment.asSlice(OFFSET$deviceUUID, SIZE$deviceUUID);
    }

    public @unsigned ByteBuffer deviceUUID() {
        return new ByteBuffer(deviceUUIDRaw());
    }

    public void deviceUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceUUID, SIZE$deviceUUID);
    }

    public MemorySegment driverUUIDRaw() {
        return segment.asSlice(OFFSET$driverUUID, SIZE$driverUUID);
    }

    public @unsigned ByteBuffer driverUUID() {
        return new ByteBuffer(driverUUIDRaw());
    }

    public void driverUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$driverUUID, SIZE$driverUUID);
    }

    public MemorySegment deviceLUIDRaw() {
        return segment.asSlice(OFFSET$deviceLUID, SIZE$deviceLUID);
    }

    public @unsigned ByteBuffer deviceLUID() {
        return new ByteBuffer(deviceLUIDRaw());
    }

    public void deviceLUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$deviceLUID, SIZE$deviceLUID);
    }

    public @unsigned int deviceNodeMask() {
        return segment.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);
    }

    public void deviceNodeMask(@unsigned int value) {
        segment.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);
    }

    public @unsigned int deviceLUIDValid() {
        return segment.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);
    }

    public void deviceLUIDValid(@unsigned int value) {
        segment.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);
    }

    public @unsigned int subgroupSize() {
        return segment.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);
    }

    public void subgroupSize(@unsigned int value) {
        segment.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);
    }

    public @enumtype(VkShaderStageFlags.class) int subgroupSupportedStages() {
        return segment.get(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages);
    }

    public void subgroupSupportedStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages, value);
    }

    public @enumtype(VkSubgroupFeatureFlags.class) int subgroupSupportedOperations() {
        return segment.get(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations);
    }

    public void subgroupSupportedOperations(@enumtype(VkSubgroupFeatureFlags.class) int value) {
        segment.set(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations, value);
    }

    public @unsigned int subgroupQuadOperationsInAllStages() {
        return segment.get(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages);
    }

    public void subgroupQuadOperationsInAllStages(@unsigned int value) {
        segment.set(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages, value);
    }

    public @enumtype(VkPointClippingBehavior.class) int pointClippingBehavior() {
        return segment.get(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior);
    }

    public void pointClippingBehavior(@enumtype(VkPointClippingBehavior.class) int value) {
        segment.set(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior, value);
    }

    public @unsigned int maxMultiviewViewCount() {
        return segment.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);
    }

    public void maxMultiviewViewCount(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);
    }

    public @unsigned int maxMultiviewInstanceIndex() {
        return segment.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);
    }

    public void maxMultiviewInstanceIndex(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);
    }

    public @unsigned int protectedNoFault() {
        return segment.get(LAYOUT$protectedNoFault, OFFSET$protectedNoFault);
    }

    public void protectedNoFault(@unsigned int value) {
        segment.set(LAYOUT$protectedNoFault, OFFSET$protectedNoFault, value);
    }

    public @unsigned int maxPerSetDescriptors() {
        return segment.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);
    }

    public void maxPerSetDescriptors(@unsigned int value) {
        segment.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);
    }

    public @unsigned long maxMemoryAllocationSize() {
        return segment.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);
    }

    public void maxMemoryAllocationSize(@unsigned long value) {
        segment.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);
    }

    public static VkPhysicalDeviceVulkan11Properties allocate(Arena arena) {
        return new VkPhysicalDeviceVulkan11Properties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkan11Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan11Properties[] ret = new VkPhysicalDeviceVulkan11Properties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceVulkan11Properties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Properties clone(Arena arena, VkPhysicalDeviceVulkan11Properties src) {
        VkPhysicalDeviceVulkan11Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Properties[] clone(Arena arena, VkPhysicalDeviceVulkan11Properties[] src) {
        VkPhysicalDeviceVulkan11Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceUUID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("driverUUID"),
        MemoryLayout.sequenceLayout(VK_LUID_SIZE, ValueLayout.JAVA_BYTE).withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedStages"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedOperations"),
        ValueLayout.JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex"),
        ValueLayout.JAVA_INT.withName("protectedNoFault"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("deviceLUIDValid");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("subgroupSize");
    public static final PathElement PATH$subgroupSupportedStages = PathElement.groupElement("subgroupSupportedStages");
    public static final PathElement PATH$subgroupSupportedOperations = PathElement.groupElement("subgroupSupportedOperations");
    public static final PathElement PATH$subgroupQuadOperationsInAllStages = PathElement.groupElement("subgroupQuadOperationsInAllStages");
    public static final PathElement PATH$pointClippingBehavior = PathElement.groupElement("pointClippingBehavior");
    public static final PathElement PATH$maxMultiviewViewCount = PathElement.groupElement("maxMultiviewViewCount");
    public static final PathElement PATH$maxMultiviewInstanceIndex = PathElement.groupElement("maxMultiviewInstanceIndex");
    public static final PathElement PATH$protectedNoFault = PathElement.groupElement("protectedNoFault");
    public static final PathElement PATH$maxPerSetDescriptors = PathElement.groupElement("maxPerSetDescriptors");
    public static final PathElement PATH$maxMemoryAllocationSize = PathElement.groupElement("maxMemoryAllocationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$deviceUUID = (SequenceLayout) LAYOUT.select(PATH$deviceUUID);
    public static final SequenceLayout LAYOUT$driverUUID = (SequenceLayout) LAYOUT.select(PATH$driverUUID);
    public static final SequenceLayout LAYOUT$deviceLUID = (SequenceLayout) LAYOUT.select(PATH$deviceLUID);
    public static final OfInt LAYOUT$deviceNodeMask = (OfInt) LAYOUT.select(PATH$deviceNodeMask);
    public static final OfInt LAYOUT$deviceLUIDValid = (OfInt) LAYOUT.select(PATH$deviceLUIDValid);
    public static final OfInt LAYOUT$subgroupSize = (OfInt) LAYOUT.select(PATH$subgroupSize);
    public static final OfInt LAYOUT$subgroupSupportedStages = (OfInt) LAYOUT.select(PATH$subgroupSupportedStages);
    public static final OfInt LAYOUT$subgroupSupportedOperations = (OfInt) LAYOUT.select(PATH$subgroupSupportedOperations);
    public static final OfInt LAYOUT$subgroupQuadOperationsInAllStages = (OfInt) LAYOUT.select(PATH$subgroupQuadOperationsInAllStages);
    public static final OfInt LAYOUT$pointClippingBehavior = (OfInt) LAYOUT.select(PATH$pointClippingBehavior);
    public static final OfInt LAYOUT$maxMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMultiviewViewCount);
    public static final OfInt LAYOUT$maxMultiviewInstanceIndex = (OfInt) LAYOUT.select(PATH$maxMultiviewInstanceIndex);
    public static final OfInt LAYOUT$protectedNoFault = (OfInt) LAYOUT.select(PATH$protectedNoFault);
    public static final OfInt LAYOUT$maxPerSetDescriptors = (OfInt) LAYOUT.select(PATH$maxPerSetDescriptors);
    public static final OfLong LAYOUT$maxMemoryAllocationSize = (OfLong) LAYOUT.select(PATH$maxMemoryAllocationSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);
    public static final long OFFSET$subgroupSupportedStages = LAYOUT.byteOffset(PATH$subgroupSupportedStages);
    public static final long OFFSET$subgroupSupportedOperations = LAYOUT.byteOffset(PATH$subgroupSupportedOperations);
    public static final long OFFSET$subgroupQuadOperationsInAllStages = LAYOUT.byteOffset(PATH$subgroupQuadOperationsInAllStages);
    public static final long OFFSET$pointClippingBehavior = LAYOUT.byteOffset(PATH$pointClippingBehavior);
    public static final long OFFSET$maxMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMultiviewViewCount);
    public static final long OFFSET$maxMultiviewInstanceIndex = LAYOUT.byteOffset(PATH$maxMultiviewInstanceIndex);
    public static final long OFFSET$protectedNoFault = LAYOUT.byteOffset(PATH$protectedNoFault);
    public static final long OFFSET$maxPerSetDescriptors = LAYOUT.byteOffset(PATH$maxPerSetDescriptors);
    public static final long OFFSET$maxMemoryAllocationSize = LAYOUT.byteOffset(PATH$maxMemoryAllocationSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceUUID = LAYOUT$deviceUUID.byteSize();
    public static final long SIZE$driverUUID = LAYOUT$driverUUID.byteSize();
    public static final long SIZE$deviceLUID = LAYOUT$deviceLUID.byteSize();
    public static final long SIZE$deviceNodeMask = LAYOUT$deviceNodeMask.byteSize();
    public static final long SIZE$deviceLUIDValid = LAYOUT$deviceLUIDValid.byteSize();
    public static final long SIZE$subgroupSize = LAYOUT$subgroupSize.byteSize();
    public static final long SIZE$subgroupSupportedStages = LAYOUT$subgroupSupportedStages.byteSize();
    public static final long SIZE$subgroupSupportedOperations = LAYOUT$subgroupSupportedOperations.byteSize();
    public static final long SIZE$subgroupQuadOperationsInAllStages = LAYOUT$subgroupQuadOperationsInAllStages.byteSize();
    public static final long SIZE$pointClippingBehavior = LAYOUT$pointClippingBehavior.byteSize();
    public static final long SIZE$maxMultiviewViewCount = LAYOUT$maxMultiviewViewCount.byteSize();
    public static final long SIZE$maxMultiviewInstanceIndex = LAYOUT$maxMultiviewInstanceIndex.byteSize();
    public static final long SIZE$protectedNoFault = LAYOUT$protectedNoFault.byteSize();
    public static final long SIZE$maxPerSetDescriptors = LAYOUT$maxPerSetDescriptors.byteSize();
    public static final long SIZE$maxMemoryAllocationSize = LAYOUT$maxMemoryAllocationSize.byteSize();
}
