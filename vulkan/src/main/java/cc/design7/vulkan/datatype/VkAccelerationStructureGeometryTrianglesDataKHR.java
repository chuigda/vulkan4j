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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryTrianglesDataKHR.html">VkAccelerationStructureGeometryTrianglesDataKHR</a>
@ValueBasedCandidate
public record VkAccelerationStructureGeometryTrianglesDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$vertexFormat = ValueLayout.JAVA_INT.withName("vertexFormat");
    public static final StructLayout LAYOUT$vertexData = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData");
    public static final OfLong LAYOUT$vertexStride = ValueLayout.JAVA_LONG.withName("vertexStride");
    public static final OfInt LAYOUT$maxVertex = ValueLayout.JAVA_INT.withName("maxVertex");
    public static final OfInt LAYOUT$indexType = ValueLayout.JAVA_INT.withName("indexType");
    public static final StructLayout LAYOUT$indexData = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData");
    public static final StructLayout LAYOUT$transformData = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$vertexFormat, LAYOUT$vertexData, LAYOUT$vertexStride, LAYOUT$maxVertex, LAYOUT$indexType, LAYOUT$indexData, LAYOUT$transformData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureGeometryTrianglesDataKHR allocate(Arena arena) {
        return new VkAccelerationStructureGeometryTrianglesDataKHR(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryTrianglesDataKHR[] ret = new VkAccelerationStructureGeometryTrianglesDataKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR clone(Arena arena, VkAccelerationStructureGeometryTrianglesDataKHR src) {
        VkAccelerationStructureGeometryTrianglesDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR[] clone(Arena arena, VkAccelerationStructureGeometryTrianglesDataKHR[] src) {
        VkAccelerationStructureGeometryTrianglesDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("PATH$vertexFormat");
    public static final PathElement PATH$vertexData = PathElement.groupElement("PATH$vertexData");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("PATH$vertexStride");
    public static final PathElement PATH$maxVertex = PathElement.groupElement("PATH$maxVertex");
    public static final PathElement PATH$indexType = PathElement.groupElement("PATH$indexType");
    public static final PathElement PATH$indexData = PathElement.groupElement("PATH$indexData");
    public static final PathElement PATH$transformData = PathElement.groupElement("PATH$transformData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$vertexData = LAYOUT$vertexData.byteSize();
    public static final long SIZE$vertexStride = LAYOUT$vertexStride.byteSize();
    public static final long SIZE$maxVertex = LAYOUT$maxVertex.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$indexData = LAYOUT$indexData.byteSize();
    public static final long SIZE$transformData = LAYOUT$transformData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$maxVertex = LAYOUT.byteOffset(PATH$maxVertex);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$transformData = LAYOUT.byteOffset(PATH$transformData);

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

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, SIZE$vertexData);
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @unsigned int maxVertex() {
        return segment.get(LAYOUT$maxVertex, OFFSET$maxVertex);
    }

    public void maxVertex(@unsigned int value) {
        segment.set(LAYOUT$maxVertex, OFFSET$maxVertex, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkDeviceOrHostAddressConstKHR indexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexData, LAYOUT$indexData));
    }

    public void indexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexData, SIZE$indexData);
    }

    public VkDeviceOrHostAddressConstKHR transformData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$transformData, LAYOUT$transformData));
    }

    public void transformData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformData, SIZE$transformData);
    }

}
