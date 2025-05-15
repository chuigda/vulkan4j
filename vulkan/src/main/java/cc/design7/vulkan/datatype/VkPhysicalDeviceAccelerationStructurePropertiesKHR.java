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

public record VkPhysicalDeviceAccelerationStructurePropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$maxGeometryCount = ValueLayout.JAVA_LONG.withName("maxGeometryCount");
    public static final OfLong LAYOUT$maxInstanceCount = ValueLayout.JAVA_LONG.withName("maxInstanceCount");
    public static final OfLong LAYOUT$maxPrimitiveCount = ValueLayout.JAVA_LONG.withName("maxPrimitiveCount");
    public static final OfInt LAYOUT$maxPerStageDescriptorAccelerationStructures = ValueLayout.JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures");
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures");
    public static final OfInt LAYOUT$maxDescriptorSetAccelerationStructures = ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures");
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures = ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures");
    public static final OfInt LAYOUT$minAccelerationStructureScratchOffsetAlignment = ValueLayout.JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxGeometryCount, LAYOUT$maxInstanceCount, LAYOUT$maxPrimitiveCount, LAYOUT$maxPerStageDescriptorAccelerationStructures, LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, LAYOUT$maxDescriptorSetAccelerationStructures, LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, LAYOUT$minAccelerationStructureScratchOffsetAlignment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceAccelerationStructurePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAccelerationStructurePropertiesKHR[] ret = new VkPhysicalDeviceAccelerationStructurePropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR clone(Arena arena, VkPhysicalDeviceAccelerationStructurePropertiesKHR src) {
        VkPhysicalDeviceAccelerationStructurePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR[] clone(Arena arena, VkPhysicalDeviceAccelerationStructurePropertiesKHR[] src) {
        VkPhysicalDeviceAccelerationStructurePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxGeometryCount = PathElement.groupElement("PATH$maxGeometryCount");
    public static final PathElement PATH$maxInstanceCount = PathElement.groupElement("PATH$maxInstanceCount");
    public static final PathElement PATH$maxPrimitiveCount = PathElement.groupElement("PATH$maxPrimitiveCount");
    public static final PathElement PATH$maxPerStageDescriptorAccelerationStructures = PathElement.groupElement("PATH$maxPerStageDescriptorAccelerationStructures");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = PathElement.groupElement("PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures");
    public static final PathElement PATH$maxDescriptorSetAccelerationStructures = PathElement.groupElement("PATH$maxDescriptorSetAccelerationStructures");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures");
    public static final PathElement PATH$minAccelerationStructureScratchOffsetAlignment = PathElement.groupElement("PATH$minAccelerationStructureScratchOffsetAlignment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxGeometryCount = LAYOUT$maxGeometryCount.byteSize();
    public static final long SIZE$maxInstanceCount = LAYOUT$maxInstanceCount.byteSize();
    public static final long SIZE$maxPrimitiveCount = LAYOUT$maxPrimitiveCount.byteSize();
    public static final long SIZE$maxPerStageDescriptorAccelerationStructures = LAYOUT$maxPerStageDescriptorAccelerationStructures.byteSize();
    public static final long SIZE$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures.byteSize();
    public static final long SIZE$maxDescriptorSetAccelerationStructures = LAYOUT$maxDescriptorSetAccelerationStructures.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures.byteSize();
    public static final long SIZE$minAccelerationStructureScratchOffsetAlignment = LAYOUT$minAccelerationStructureScratchOffsetAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxGeometryCount = LAYOUT.byteOffset(PATH$maxGeometryCount);
    public static final long OFFSET$maxInstanceCount = LAYOUT.byteOffset(PATH$maxInstanceCount);
    public static final long OFFSET$maxPrimitiveCount = LAYOUT.byteOffset(PATH$maxPrimitiveCount);
    public static final long OFFSET$maxPerStageDescriptorAccelerationStructures = LAYOUT.byteOffset(PATH$maxPerStageDescriptorAccelerationStructures);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    public static final long OFFSET$maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PATH$maxDescriptorSetAccelerationStructures);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures);
    public static final long OFFSET$minAccelerationStructureScratchOffsetAlignment = LAYOUT.byteOffset(PATH$minAccelerationStructureScratchOffsetAlignment);

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

    public @unsigned long maxGeometryCount() {
        return segment.get(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount);
    }

    public void maxGeometryCount(@unsigned long value) {
        segment.set(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount, value);
    }

    public @unsigned long maxInstanceCount() {
        return segment.get(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount);
    }

    public void maxInstanceCount(@unsigned long value) {
        segment.set(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount, value);
    }

    public @unsigned long maxPrimitiveCount() {
        return segment.get(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount);
    }

    public void maxPrimitiveCount(@unsigned long value) {
        segment.set(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount, value);
    }

    public @unsigned int maxPerStageDescriptorAccelerationStructures() {
        return segment.get(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures);
    }

    public void maxPerStageDescriptorAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    }

    public void maxPerStageDescriptorUpdateAfterBindAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, value);
    }

    public @unsigned int maxDescriptorSetAccelerationStructures() {
        return segment.get(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures);
    }

    public void maxDescriptorSetAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindAccelerationStructures() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures);
    }

    public void maxDescriptorSetUpdateAfterBindAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures, value);
    }

    public @unsigned int minAccelerationStructureScratchOffsetAlignment() {
        return segment.get(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment);
    }

    public void minAccelerationStructureScratchOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment, value);
    }

}
/// dummy, not implemented yet
