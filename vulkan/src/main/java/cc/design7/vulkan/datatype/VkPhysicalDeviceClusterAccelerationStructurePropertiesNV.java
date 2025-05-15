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

public record VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxVerticesPerCluster = ValueLayout.JAVA_INT.withName("maxVerticesPerCluster");
    public static final OfInt LAYOUT$maxTrianglesPerCluster = ValueLayout.JAVA_INT.withName("maxTrianglesPerCluster");
    public static final OfInt LAYOUT$clusterScratchByteAlignment = ValueLayout.JAVA_INT.withName("clusterScratchByteAlignment");
    public static final OfInt LAYOUT$clusterByteAlignment = ValueLayout.JAVA_INT.withName("clusterByteAlignment");
    public static final OfInt LAYOUT$clusterTemplateByteAlignment = ValueLayout.JAVA_INT.withName("clusterTemplateByteAlignment");
    public static final OfInt LAYOUT$clusterBottomLevelByteAlignment = ValueLayout.JAVA_INT.withName("clusterBottomLevelByteAlignment");
    public static final OfInt LAYOUT$clusterTemplateBoundsByteAlignment = ValueLayout.JAVA_INT.withName("clusterTemplateBoundsByteAlignment");
    public static final OfInt LAYOUT$maxClusterGeometryIndex = ValueLayout.JAVA_INT.withName("maxClusterGeometryIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxVerticesPerCluster, LAYOUT$maxTrianglesPerCluster, LAYOUT$clusterScratchByteAlignment, LAYOUT$clusterByteAlignment, LAYOUT$clusterTemplateByteAlignment, LAYOUT$clusterBottomLevelByteAlignment, LAYOUT$clusterTemplateBoundsByteAlignment, LAYOUT$maxClusterGeometryIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] ret = new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV clone(Arena arena, VkPhysicalDeviceClusterAccelerationStructurePropertiesNV src) {
        VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] clone(Arena arena, VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] src) {
        VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxVerticesPerCluster = PathElement.groupElement("PATH$maxVerticesPerCluster");
    public static final PathElement PATH$maxTrianglesPerCluster = PathElement.groupElement("PATH$maxTrianglesPerCluster");
    public static final PathElement PATH$clusterScratchByteAlignment = PathElement.groupElement("PATH$clusterScratchByteAlignment");
    public static final PathElement PATH$clusterByteAlignment = PathElement.groupElement("PATH$clusterByteAlignment");
    public static final PathElement PATH$clusterTemplateByteAlignment = PathElement.groupElement("PATH$clusterTemplateByteAlignment");
    public static final PathElement PATH$clusterBottomLevelByteAlignment = PathElement.groupElement("PATH$clusterBottomLevelByteAlignment");
    public static final PathElement PATH$clusterTemplateBoundsByteAlignment = PathElement.groupElement("PATH$clusterTemplateBoundsByteAlignment");
    public static final PathElement PATH$maxClusterGeometryIndex = PathElement.groupElement("PATH$maxClusterGeometryIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxVerticesPerCluster = LAYOUT$maxVerticesPerCluster.byteSize();
    public static final long SIZE$maxTrianglesPerCluster = LAYOUT$maxTrianglesPerCluster.byteSize();
    public static final long SIZE$clusterScratchByteAlignment = LAYOUT$clusterScratchByteAlignment.byteSize();
    public static final long SIZE$clusterByteAlignment = LAYOUT$clusterByteAlignment.byteSize();
    public static final long SIZE$clusterTemplateByteAlignment = LAYOUT$clusterTemplateByteAlignment.byteSize();
    public static final long SIZE$clusterBottomLevelByteAlignment = LAYOUT$clusterBottomLevelByteAlignment.byteSize();
    public static final long SIZE$clusterTemplateBoundsByteAlignment = LAYOUT$clusterTemplateBoundsByteAlignment.byteSize();
    public static final long SIZE$maxClusterGeometryIndex = LAYOUT$maxClusterGeometryIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxVerticesPerCluster = LAYOUT.byteOffset(PATH$maxVerticesPerCluster);
    public static final long OFFSET$maxTrianglesPerCluster = LAYOUT.byteOffset(PATH$maxTrianglesPerCluster);
    public static final long OFFSET$clusterScratchByteAlignment = LAYOUT.byteOffset(PATH$clusterScratchByteAlignment);
    public static final long OFFSET$clusterByteAlignment = LAYOUT.byteOffset(PATH$clusterByteAlignment);
    public static final long OFFSET$clusterTemplateByteAlignment = LAYOUT.byteOffset(PATH$clusterTemplateByteAlignment);
    public static final long OFFSET$clusterBottomLevelByteAlignment = LAYOUT.byteOffset(PATH$clusterBottomLevelByteAlignment);
    public static final long OFFSET$clusterTemplateBoundsByteAlignment = LAYOUT.byteOffset(PATH$clusterTemplateBoundsByteAlignment);
    public static final long OFFSET$maxClusterGeometryIndex = LAYOUT.byteOffset(PATH$maxClusterGeometryIndex);

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

    public @unsigned int maxVerticesPerCluster() {
        return segment.get(LAYOUT$maxVerticesPerCluster, OFFSET$maxVerticesPerCluster);
    }

    public void maxVerticesPerCluster(@unsigned int value) {
        segment.set(LAYOUT$maxVerticesPerCluster, OFFSET$maxVerticesPerCluster, value);
    }

    public @unsigned int maxTrianglesPerCluster() {
        return segment.get(LAYOUT$maxTrianglesPerCluster, OFFSET$maxTrianglesPerCluster);
    }

    public void maxTrianglesPerCluster(@unsigned int value) {
        segment.set(LAYOUT$maxTrianglesPerCluster, OFFSET$maxTrianglesPerCluster, value);
    }

    public @unsigned int clusterScratchByteAlignment() {
        return segment.get(LAYOUT$clusterScratchByteAlignment, OFFSET$clusterScratchByteAlignment);
    }

    public void clusterScratchByteAlignment(@unsigned int value) {
        segment.set(LAYOUT$clusterScratchByteAlignment, OFFSET$clusterScratchByteAlignment, value);
    }

    public @unsigned int clusterByteAlignment() {
        return segment.get(LAYOUT$clusterByteAlignment, OFFSET$clusterByteAlignment);
    }

    public void clusterByteAlignment(@unsigned int value) {
        segment.set(LAYOUT$clusterByteAlignment, OFFSET$clusterByteAlignment, value);
    }

    public @unsigned int clusterTemplateByteAlignment() {
        return segment.get(LAYOUT$clusterTemplateByteAlignment, OFFSET$clusterTemplateByteAlignment);
    }

    public void clusterTemplateByteAlignment(@unsigned int value) {
        segment.set(LAYOUT$clusterTemplateByteAlignment, OFFSET$clusterTemplateByteAlignment, value);
    }

    public @unsigned int clusterBottomLevelByteAlignment() {
        return segment.get(LAYOUT$clusterBottomLevelByteAlignment, OFFSET$clusterBottomLevelByteAlignment);
    }

    public void clusterBottomLevelByteAlignment(@unsigned int value) {
        segment.set(LAYOUT$clusterBottomLevelByteAlignment, OFFSET$clusterBottomLevelByteAlignment, value);
    }

    public @unsigned int clusterTemplateBoundsByteAlignment() {
        return segment.get(LAYOUT$clusterTemplateBoundsByteAlignment, OFFSET$clusterTemplateBoundsByteAlignment);
    }

    public void clusterTemplateBoundsByteAlignment(@unsigned int value) {
        segment.set(LAYOUT$clusterTemplateBoundsByteAlignment, OFFSET$clusterTemplateBoundsByteAlignment, value);
    }

    public @unsigned int maxClusterGeometryIndex() {
        return segment.get(LAYOUT$maxClusterGeometryIndex, OFFSET$maxClusterGeometryIndex);
    }

    public void maxClusterGeometryIndex(@unsigned int value) {
        segment.set(LAYOUT$maxClusterGeometryIndex, OFFSET$maxClusterGeometryIndex, value);
    }

}
/// dummy, not implemented yet
