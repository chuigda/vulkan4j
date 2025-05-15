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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryTrianglesNV.html"><code>VkGeometryTrianglesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkGeometryTrianglesNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkBuffer vertexData; // optional
///     VkDeviceSize vertexOffset;
///     uint32_t vertexCount;
///     VkDeviceSize vertexStride;
///     VkFormat vertexFormat;
///     VkBuffer indexData; // optional
///     VkDeviceSize indexOffset;
///     uint32_t indexCount;
///     VkIndexType indexType;
///     VkBuffer transformData; // optional
///     VkDeviceSize transformOffset;
/// } VkGeometryTrianglesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_GEOMETRY_TRIANGLES_NV`
///
/// The {@link VkGeometryTrianglesNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkGeometryTrianglesNV#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryTrianglesNV.html"><code>VkGeometryTrianglesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkGeometryTrianglesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkGeometryTrianglesNV allocate(Arena arena) {
        VkGeometryTrianglesNV ret = new VkGeometryTrianglesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.GEOMETRY_TRIANGLES_NV);
        return ret;
    }

    public static VkGeometryTrianglesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGeometryTrianglesNV[] ret = new VkGeometryTrianglesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGeometryTrianglesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.GEOMETRY_TRIANGLES_NV);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.GEOMETRY_TRIANGLES_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @Nullable VkBuffer vertexData() {
        MemorySegment s = segment.asSlice(OFFSET$vertexData, SIZE$vertexData);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void vertexData(@Nullable VkBuffer value) {
        segment.set(LAYOUT$vertexData, OFFSET$vertexData, value != null ? value.segment() : MemorySegment.NULL);
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
        MemorySegment s = segment.asSlice(OFFSET$indexData, SIZE$indexData);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void indexData(@Nullable VkBuffer value) {
        segment.set(LAYOUT$indexData, OFFSET$indexData, value != null ? value.segment() : MemorySegment.NULL);
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
        MemorySegment s = segment.asSlice(OFFSET$transformData, SIZE$transformData);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void transformData(@Nullable VkBuffer value) {
        segment.set(LAYOUT$transformData, OFFSET$transformData, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned long value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexData = PathElement.groupElement("PATH$vertexData");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("PATH$vertexOffset");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("PATH$vertexCount");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("PATH$vertexStride");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("PATH$vertexFormat");
    public static final PathElement PATH$indexData = PathElement.groupElement("PATH$indexData");
    public static final PathElement PATH$indexOffset = PathElement.groupElement("PATH$indexOffset");
    public static final PathElement PATH$indexCount = PathElement.groupElement("PATH$indexCount");
    public static final PathElement PATH$indexType = PathElement.groupElement("PATH$indexType");
    public static final PathElement PATH$transformData = PathElement.groupElement("PATH$transformData");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("PATH$transformOffset");

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
}
