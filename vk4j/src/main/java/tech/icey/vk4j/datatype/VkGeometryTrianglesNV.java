package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkGeometryTrianglesNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBuffer vertexData;
///     VkDeviceSize vertexOffset;
///     uint32_t vertexCount;
///     VkDeviceSize vertexStride;
///     VkFormat vertexFormat;
///     VkBuffer indexData;
///     VkDeviceSize indexOffset;
///     uint32_t indexCount;
///     VkIndexType indexType;
///     VkBuffer transformData;
///     VkDeviceSize transformOffset;
/// } VkGeometryTrianglesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGeometryTrianglesNV.html">VkGeometryTrianglesNV</a>
public record VkGeometryTrianglesNV(MemorySegment segment) implements IPointer {
    public VkGeometryTrianglesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkBuffer vertexData() {
        MemorySegment s = segment.get(LAYOUT$vertexData, OFFSET$vertexData);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void vertexData(@Nullable VkBuffer value) {
        segment.set(
            LAYOUT$vertexData,
            OFFSET$vertexData,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(@unsigned long value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public @Nullable VkBuffer indexData() {
        MemorySegment s = segment.get(LAYOUT$indexData, OFFSET$indexData);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void indexData(@Nullable VkBuffer value) {
        segment.set(
            LAYOUT$indexData,
            OFFSET$indexData,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long indexOffset() {
        return segment.get(LAYOUT$indexOffset, OFFSET$indexOffset);
    }

    public void indexOffset(@unsigned long value) {
        segment.set(LAYOUT$indexOffset, OFFSET$indexOffset, value);
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public @Nullable VkBuffer transformData() {
        MemorySegment s = segment.get(LAYOUT$transformData, OFFSET$transformData);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void transformData(@Nullable VkBuffer value) {
        segment.set(
            LAYOUT$transformData,
            OFFSET$transformData,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned long value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }

    public static VkGeometryTrianglesNV allocate(Arena arena) {
        return new VkGeometryTrianglesNV(arena.allocate(LAYOUT));
    }

    public static VkGeometryTrianglesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryTrianglesNV[] ret = new VkGeometryTrianglesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGeometryTrianglesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGeometryTrianglesNV clone(Arena arena, VkGeometryTrianglesNV src) {
        VkGeometryTrianglesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGeometryTrianglesNV[] clone(Arena arena, VkGeometryTrianglesNV[] src) {
        VkGeometryTrianglesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.ADDRESS.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexOffset"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("indexType"),
        ValueLayout.ADDRESS.withName("transformData"),
        ValueLayout.JAVA_LONG.withName("transformOffset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexData = PathElement.groupElement("vertexData");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("vertexStride");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("vertexFormat");
    public static final PathElement PATH$indexData = PathElement.groupElement("indexData");
    public static final PathElement PATH$indexOffset = PathElement.groupElement("indexOffset");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$indexType = PathElement.groupElement("indexType");
    public static final PathElement PATH$transformData = PathElement.groupElement("transformData");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("transformOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$vertexData = (AddressLayout) LAYOUT.select(PATH$vertexData);
    public static final OfLong LAYOUT$vertexOffset = (OfLong) LAYOUT.select(PATH$vertexOffset);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final OfLong LAYOUT$vertexStride = (OfLong) LAYOUT.select(PATH$vertexStride);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final AddressLayout LAYOUT$indexData = (AddressLayout) LAYOUT.select(PATH$indexData);
    public static final OfLong LAYOUT$indexOffset = (OfLong) LAYOUT.select(PATH$indexOffset);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final AddressLayout LAYOUT$transformData = (AddressLayout) LAYOUT.select(PATH$transformData);
    public static final OfLong LAYOUT$transformOffset = (OfLong) LAYOUT.select(PATH$transformOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$indexOffset = LAYOUT.byteOffset(PATH$indexOffset);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$transformData = LAYOUT.byteOffset(PATH$transformData);
    public static final long OFFSET$transformOffset = LAYOUT.byteOffset(PATH$transformOffset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexData = LAYOUT$vertexData.byteSize();
    public static final long SIZE$vertexOffset = LAYOUT$vertexOffset.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();
    public static final long SIZE$vertexStride = LAYOUT$vertexStride.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$indexData = LAYOUT$indexData.byteSize();
    public static final long SIZE$indexOffset = LAYOUT$indexOffset.byteSize();
    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$transformData = LAYOUT$transformData.byteSize();
    public static final long SIZE$transformOffset = LAYOUT$transformOffset.byteSize();
}
