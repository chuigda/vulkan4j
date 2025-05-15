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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureTriangleClusterInputNV.html">VkClusterAccelerationStructureTriangleClusterInputNV</a>
@ValueBasedCandidate
public record VkClusterAccelerationStructureTriangleClusterInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$vertexFormat = ValueLayout.JAVA_INT.withName("vertexFormat");
    public static final OfInt LAYOUT$maxGeometryIndexValue = ValueLayout.JAVA_INT.withName("maxGeometryIndexValue");
    public static final OfInt LAYOUT$maxClusterUniqueGeometryCount = ValueLayout.JAVA_INT.withName("maxClusterUniqueGeometryCount");
    public static final OfInt LAYOUT$maxClusterTriangleCount = ValueLayout.JAVA_INT.withName("maxClusterTriangleCount");
    public static final OfInt LAYOUT$maxClusterVertexCount = ValueLayout.JAVA_INT.withName("maxClusterVertexCount");
    public static final OfInt LAYOUT$maxTotalTriangleCount = ValueLayout.JAVA_INT.withName("maxTotalTriangleCount");
    public static final OfInt LAYOUT$maxTotalVertexCount = ValueLayout.JAVA_INT.withName("maxTotalVertexCount");
    public static final OfInt LAYOUT$minPositionTruncateBitCount = ValueLayout.JAVA_INT.withName("minPositionTruncateBitCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$vertexFormat, LAYOUT$maxGeometryIndexValue, LAYOUT$maxClusterUniqueGeometryCount, LAYOUT$maxClusterTriangleCount, LAYOUT$maxClusterVertexCount, LAYOUT$maxTotalTriangleCount, LAYOUT$maxTotalVertexCount, LAYOUT$minPositionTruncateBitCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClusterAccelerationStructureTriangleClusterInputNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureTriangleClusterInputNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureTriangleClusterInputNV[] ret = new VkClusterAccelerationStructureTriangleClusterInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureTriangleClusterInputNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV clone(Arena arena, VkClusterAccelerationStructureTriangleClusterInputNV src) {
        VkClusterAccelerationStructureTriangleClusterInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV[] clone(Arena arena, VkClusterAccelerationStructureTriangleClusterInputNV[] src) {
        VkClusterAccelerationStructureTriangleClusterInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("PATH$vertexFormat");
    public static final PathElement PATH$maxGeometryIndexValue = PathElement.groupElement("PATH$maxGeometryIndexValue");
    public static final PathElement PATH$maxClusterUniqueGeometryCount = PathElement.groupElement("PATH$maxClusterUniqueGeometryCount");
    public static final PathElement PATH$maxClusterTriangleCount = PathElement.groupElement("PATH$maxClusterTriangleCount");
    public static final PathElement PATH$maxClusterVertexCount = PathElement.groupElement("PATH$maxClusterVertexCount");
    public static final PathElement PATH$maxTotalTriangleCount = PathElement.groupElement("PATH$maxTotalTriangleCount");
    public static final PathElement PATH$maxTotalVertexCount = PathElement.groupElement("PATH$maxTotalVertexCount");
    public static final PathElement PATH$minPositionTruncateBitCount = PathElement.groupElement("PATH$minPositionTruncateBitCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$maxGeometryIndexValue = LAYOUT$maxGeometryIndexValue.byteSize();
    public static final long SIZE$maxClusterUniqueGeometryCount = LAYOUT$maxClusterUniqueGeometryCount.byteSize();
    public static final long SIZE$maxClusterTriangleCount = LAYOUT$maxClusterTriangleCount.byteSize();
    public static final long SIZE$maxClusterVertexCount = LAYOUT$maxClusterVertexCount.byteSize();
    public static final long SIZE$maxTotalTriangleCount = LAYOUT$maxTotalTriangleCount.byteSize();
    public static final long SIZE$maxTotalVertexCount = LAYOUT$maxTotalVertexCount.byteSize();
    public static final long SIZE$minPositionTruncateBitCount = LAYOUT$minPositionTruncateBitCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$maxGeometryIndexValue = LAYOUT.byteOffset(PATH$maxGeometryIndexValue);
    public static final long OFFSET$maxClusterUniqueGeometryCount = LAYOUT.byteOffset(PATH$maxClusterUniqueGeometryCount);
    public static final long OFFSET$maxClusterTriangleCount = LAYOUT.byteOffset(PATH$maxClusterTriangleCount);
    public static final long OFFSET$maxClusterVertexCount = LAYOUT.byteOffset(PATH$maxClusterVertexCount);
    public static final long OFFSET$maxTotalTriangleCount = LAYOUT.byteOffset(PATH$maxTotalTriangleCount);
    public static final long OFFSET$maxTotalVertexCount = LAYOUT.byteOffset(PATH$maxTotalVertexCount);
    public static final long OFFSET$minPositionTruncateBitCount = LAYOUT.byteOffset(PATH$minPositionTruncateBitCount);

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

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public @unsigned int maxGeometryIndexValue() {
        return segment.get(LAYOUT$maxGeometryIndexValue, OFFSET$maxGeometryIndexValue);
    }

    public void maxGeometryIndexValue(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryIndexValue, OFFSET$maxGeometryIndexValue, value);
    }

    public @unsigned int maxClusterUniqueGeometryCount() {
        return segment.get(LAYOUT$maxClusterUniqueGeometryCount, OFFSET$maxClusterUniqueGeometryCount);
    }

    public void maxClusterUniqueGeometryCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterUniqueGeometryCount, OFFSET$maxClusterUniqueGeometryCount, value);
    }

    public @unsigned int maxClusterTriangleCount() {
        return segment.get(LAYOUT$maxClusterTriangleCount, OFFSET$maxClusterTriangleCount);
    }

    public void maxClusterTriangleCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterTriangleCount, OFFSET$maxClusterTriangleCount, value);
    }

    public @unsigned int maxClusterVertexCount() {
        return segment.get(LAYOUT$maxClusterVertexCount, OFFSET$maxClusterVertexCount);
    }

    public void maxClusterVertexCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterVertexCount, OFFSET$maxClusterVertexCount, value);
    }

    public @unsigned int maxTotalTriangleCount() {
        return segment.get(LAYOUT$maxTotalTriangleCount, OFFSET$maxTotalTriangleCount);
    }

    public void maxTotalTriangleCount(@unsigned int value) {
        segment.set(LAYOUT$maxTotalTriangleCount, OFFSET$maxTotalTriangleCount, value);
    }

    public @unsigned int maxTotalVertexCount() {
        return segment.get(LAYOUT$maxTotalVertexCount, OFFSET$maxTotalVertexCount);
    }

    public void maxTotalVertexCount(@unsigned int value) {
        segment.set(LAYOUT$maxTotalVertexCount, OFFSET$maxTotalVertexCount, value);
    }

    public @unsigned int minPositionTruncateBitCount() {
        return segment.get(LAYOUT$minPositionTruncateBitCount, OFFSET$minPositionTruncateBitCount);
    }

    public void minPositionTruncateBitCount(@unsigned int value) {
        segment.set(LAYOUT$minPositionTruncateBitCount, OFFSET$minPositionTruncateBitCount, value);
    }

}
