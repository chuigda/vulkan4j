package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Properties.html">VkPhysicalDeviceVulkan11Properties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceVulkan11Properties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfByte LAYOUT$deviceUUID = ValueLayout.JAVA_BYTE.withName("deviceUUID");
    public static final OfByte LAYOUT$driverUUID = ValueLayout.JAVA_BYTE.withName("driverUUID");
    public static final OfByte LAYOUT$deviceLUID = ValueLayout.JAVA_BYTE.withName("deviceLUID");
    public static final OfInt LAYOUT$deviceNodeMask = ValueLayout.JAVA_INT.withName("deviceNodeMask");
    public static final OfInt LAYOUT$deviceLUIDValid = ValueLayout.JAVA_INT.withName("deviceLUIDValid");
    public static final OfInt LAYOUT$subgroupSize = ValueLayout.JAVA_INT.withName("subgroupSize");
    public static final OfInt LAYOUT$subgroupSupportedStages = ValueLayout.JAVA_INT.withName("subgroupSupportedStages");
    public static final OfInt LAYOUT$subgroupSupportedOperations = ValueLayout.JAVA_INT.withName("subgroupSupportedOperations");
    public static final OfInt LAYOUT$subgroupQuadOperationsInAllStages = ValueLayout.JAVA_INT.withName("subgroupQuadOperationsInAllStages");
    public static final OfInt LAYOUT$pointClippingBehavior = ValueLayout.JAVA_INT.withName("pointClippingBehavior");
    public static final OfInt LAYOUT$maxMultiviewViewCount = ValueLayout.JAVA_INT.withName("maxMultiviewViewCount");
    public static final OfInt LAYOUT$maxMultiviewInstanceIndex = ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex");
    public static final OfInt LAYOUT$protectedNoFault = ValueLayout.JAVA_INT.withName("protectedNoFault");
    public static final OfInt LAYOUT$maxPerSetDescriptors = ValueLayout.JAVA_INT.withName("maxPerSetDescriptors");
    public static final OfLong LAYOUT$maxMemoryAllocationSize = ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$deviceUUID, LAYOUT$driverUUID, LAYOUT$deviceLUID, LAYOUT$deviceNodeMask, LAYOUT$deviceLUIDValid, LAYOUT$subgroupSize, LAYOUT$subgroupSupportedStages, LAYOUT$subgroupSupportedOperations, LAYOUT$subgroupQuadOperationsInAllStages, LAYOUT$pointClippingBehavior, LAYOUT$maxMultiviewViewCount, LAYOUT$maxMultiviewInstanceIndex, LAYOUT$protectedNoFault, LAYOUT$maxPerSetDescriptors, LAYOUT$maxMemoryAllocationSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceVulkan11Properties allocate(Arena arena) {
        return new VkPhysicalDeviceVulkan11Properties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkan11Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan11Properties[] ret = new VkPhysicalDeviceVulkan11Properties[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("PATH$deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("PATH$driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("PATH$deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("PATH$deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("PATH$deviceLUIDValid");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("PATH$subgroupSize");
    public static final PathElement PATH$subgroupSupportedStages = PathElement.groupElement("PATH$subgroupSupportedStages");
    public static final PathElement PATH$subgroupSupportedOperations = PathElement.groupElement("PATH$subgroupSupportedOperations");
    public static final PathElement PATH$subgroupQuadOperationsInAllStages = PathElement.groupElement("PATH$subgroupQuadOperationsInAllStages");
    public static final PathElement PATH$pointClippingBehavior = PathElement.groupElement("PATH$pointClippingBehavior");
    public static final PathElement PATH$maxMultiviewViewCount = PathElement.groupElement("PATH$maxMultiviewViewCount");
    public static final PathElement PATH$maxMultiviewInstanceIndex = PathElement.groupElement("PATH$maxMultiviewInstanceIndex");
    public static final PathElement PATH$protectedNoFault = PathElement.groupElement("PATH$protectedNoFault");
    public static final PathElement PATH$maxPerSetDescriptors = PathElement.groupElement("PATH$maxPerSetDescriptors");
    public static final PathElement PATH$maxMemoryAllocationSize = PathElement.groupElement("PATH$maxMemoryAllocationSize");

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned byte deviceUUID() {
        return segment.get(LAYOUT$deviceUUID, OFFSET$deviceUUID);
    }

    public void deviceUUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceUUID, OFFSET$deviceUUID, value);
    }

    public @unsigned byte driverUUID() {
        return segment.get(LAYOUT$driverUUID, OFFSET$driverUUID);
    }

    public void driverUUID(@unsigned byte value) {
        segment.set(LAYOUT$driverUUID, OFFSET$driverUUID, value);
    }

    public @unsigned byte deviceLUID() {
        return segment.get(LAYOUT$deviceLUID, OFFSET$deviceLUID);
    }

    public void deviceLUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceLUID, OFFSET$deviceLUID, value);
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

}
