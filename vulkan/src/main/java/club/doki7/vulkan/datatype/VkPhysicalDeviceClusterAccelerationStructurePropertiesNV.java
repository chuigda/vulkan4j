package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.html"><code>VkPhysicalDeviceClusterAccelerationStructurePropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceClusterAccelerationStructurePropertiesNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxVerticesPerCluster; // @link substring="maxVerticesPerCluster" target="#maxVerticesPerCluster"
///     uint32_t maxTrianglesPerCluster; // @link substring="maxTrianglesPerCluster" target="#maxTrianglesPerCluster"
///     uint32_t clusterScratchByteAlignment; // @link substring="clusterScratchByteAlignment" target="#clusterScratchByteAlignment"
///     uint32_t clusterByteAlignment; // @link substring="clusterByteAlignment" target="#clusterByteAlignment"
///     uint32_t clusterTemplateByteAlignment; // @link substring="clusterTemplateByteAlignment" target="#clusterTemplateByteAlignment"
///     uint32_t clusterBottomLevelByteAlignment; // @link substring="clusterBottomLevelByteAlignment" target="#clusterBottomLevelByteAlignment"
///     uint32_t clusterTemplateBoundsByteAlignment; // @link substring="clusterTemplateBoundsByteAlignment" target="#clusterTemplateBoundsByteAlignment"
///     uint32_t maxClusterGeometryIndex; // @link substring="maxClusterGeometryIndex" target="#maxClusterGeometryIndex"
/// } VkPhysicalDeviceClusterAccelerationStructurePropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV`
///
/// The {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceClusterAccelerationStructurePropertiesNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterAccelerationStructurePropertiesNV.html"><code>VkPhysicalDeviceClusterAccelerationStructurePropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceClusterAccelerationStructurePropertiesNV ret = new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[] ret = new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceClusterAccelerationStructurePropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
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

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_ACCELERATION_STRUCTURE_PROPERTIES_NV);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVerticesPerCluster"),
        ValueLayout.JAVA_INT.withName("maxTrianglesPerCluster"),
        ValueLayout.JAVA_INT.withName("clusterScratchByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterBottomLevelByteAlignment"),
        ValueLayout.JAVA_INT.withName("clusterTemplateBoundsByteAlignment"),
        ValueLayout.JAVA_INT.withName("maxClusterGeometryIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxVerticesPerCluster = (OfInt) LAYOUT.select(PATH$maxVerticesPerCluster);
    public static final OfInt LAYOUT$maxTrianglesPerCluster = (OfInt) LAYOUT.select(PATH$maxTrianglesPerCluster);
    public static final OfInt LAYOUT$clusterScratchByteAlignment = (OfInt) LAYOUT.select(PATH$clusterScratchByteAlignment);
    public static final OfInt LAYOUT$clusterByteAlignment = (OfInt) LAYOUT.select(PATH$clusterByteAlignment);
    public static final OfInt LAYOUT$clusterTemplateByteAlignment = (OfInt) LAYOUT.select(PATH$clusterTemplateByteAlignment);
    public static final OfInt LAYOUT$clusterBottomLevelByteAlignment = (OfInt) LAYOUT.select(PATH$clusterBottomLevelByteAlignment);
    public static final OfInt LAYOUT$clusterTemplateBoundsByteAlignment = (OfInt) LAYOUT.select(PATH$clusterTemplateBoundsByteAlignment);
    public static final OfInt LAYOUT$maxClusterGeometryIndex = (OfInt) LAYOUT.select(PATH$maxClusterGeometryIndex);

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
}
