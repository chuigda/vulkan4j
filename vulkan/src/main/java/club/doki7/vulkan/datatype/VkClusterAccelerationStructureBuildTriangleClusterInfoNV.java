package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureBuildTriangleClusterInfoNV.html"><code>VkClusterAccelerationStructureBuildTriangleClusterInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureBuildTriangleClusterInfoNV {
///     uint32_t clusterID; // @link substring="clusterID" target="#clusterID"
///     VkClusterAccelerationStructureClusterFlagsNV clusterFlags; // optional // @link substring="VkClusterAccelerationStructureClusterFlagsNV" target="VkClusterAccelerationStructureClusterFlagsNV" @link substring="clusterFlags" target="#clusterFlags"
///     uint32_t triangleCount : 9; // @link substring="triangleCount" target="#triangleCount"
///     uint32_t vertexCount : 9; // @link substring="vertexCount" target="#vertexCount"
///     uint32_t positionTruncateBitCount : 6; // @link substring="positionTruncateBitCount" target="#positionTruncateBitCount"
///     uint32_t indexType : 4; // @link substring="indexType" target="#indexType"
///     uint32_t opacityMicromapIndexType : 4; // @link substring="opacityMicromapIndexType" target="#opacityMicromapIndexType"
///     VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags; // @link substring="VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV" target="VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV" @link substring="baseGeometryIndexAndGeometryFlags" target="#baseGeometryIndexAndGeometryFlags"
///     uint16_t indexBufferStride; // @link substring="indexBufferStride" target="#indexBufferStride"
///     uint16_t vertexBufferStride; // @link substring="vertexBufferStride" target="#vertexBufferStride"
///     uint16_t geometryIndexAndFlagsBufferStride; // @link substring="geometryIndexAndFlagsBufferStride" target="#geometryIndexAndFlagsBufferStride"
///     uint16_t opacityMicromapIndexBufferStride; // @link substring="opacityMicromapIndexBufferStride" target="#opacityMicromapIndexBufferStride"
///     VkDeviceAddress indexBuffer; // @link substring="indexBuffer" target="#indexBuffer"
///     VkDeviceAddress vertexBuffer; // @link substring="vertexBuffer" target="#vertexBuffer"
///     VkDeviceAddress geometryIndexAndFlagsBuffer; // @link substring="geometryIndexAndFlagsBuffer" target="#geometryIndexAndFlagsBuffer"
///     VkDeviceAddress opacityMicromapArray; // @link substring="opacityMicromapArray" target="#opacityMicromapArray"
///     VkDeviceAddress opacityMicromapIndexBuffer; // @link substring="opacityMicromapIndexBuffer" target="#opacityMicromapIndexBuffer"
/// } VkClusterAccelerationStructureBuildTriangleClusterInfoNV;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureBuildTriangleClusterInfoNV.html"><code>VkClusterAccelerationStructureBuildTriangleClusterInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureBuildTriangleClusterInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV allocate(Arena arena) {
        VkClusterAccelerationStructureBuildTriangleClusterInfoNV ret = new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureBuildTriangleClusterInfoNV[] ret = new VkClusterAccelerationStructureBuildTriangleClusterInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureBuildTriangleClusterInfoNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV clone(Arena arena, VkClusterAccelerationStructureBuildTriangleClusterInfoNV src) {
        VkClusterAccelerationStructureBuildTriangleClusterInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureBuildTriangleClusterInfoNV[] clone(Arena arena, VkClusterAccelerationStructureBuildTriangleClusterInfoNV[] src) {
        VkClusterAccelerationStructureBuildTriangleClusterInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int clusterID() {
        return segment.get(LAYOUT$clusterID, OFFSET$clusterID);
    }

    public void clusterID(@unsigned int value) {
        segment.set(LAYOUT$clusterID, OFFSET$clusterID, value);
    }

    public @enumtype(VkClusterAccelerationStructureClusterFlagsNV.class) int clusterFlags() {
        return segment.get(LAYOUT$clusterFlags, OFFSET$clusterFlags);
    }

    public void clusterFlags(@enumtype(VkClusterAccelerationStructureClusterFlagsNV.class) int value) {
        segment.set(LAYOUT$clusterFlags, OFFSET$clusterFlags, value);
    }

    public @unsigned int triangleCount() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        return BitfieldUtil.readBits(s, 0, 9);
    }

    public void triangleCount(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        BitfieldUtil.writeBits(s, 0, 9, value);
    }

    public @unsigned int vertexCount() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        return BitfieldUtil.readBits(s, 9, 18);
    }

    public void vertexCount(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        BitfieldUtil.writeBits(s, 9, 18, value);
    }

    public @unsigned int positionTruncateBitCount() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        return BitfieldUtil.readBits(s, 18, 24);
    }

    public void positionTruncateBitCount(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        BitfieldUtil.writeBits(s, 18, 24, value);
    }

    public @unsigned int indexType() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        return BitfieldUtil.readBits(s, 24, 28);
    }

    public void indexType(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        BitfieldUtil.writeBits(s, 24, 28, value);
    }

    public @unsigned int opacityMicromapIndexType() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        return BitfieldUtil.readBits(s, 28, 32);
    }

    public void opacityMicromapIndexType(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$triangleCount$opacityMicromapIndexType, LAYOUT$bitfield$triangleCount$opacityMicromapIndexType);
        BitfieldUtil.writeBits(s, 28, 32, value);
    }

    public @NotNull VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV baseGeometryIndexAndGeometryFlags() {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.asSlice(OFFSET$baseGeometryIndexAndGeometryFlags, LAYOUT$baseGeometryIndexAndGeometryFlags));
    }

    public void baseGeometryIndexAndGeometryFlags(@NotNull VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$baseGeometryIndexAndGeometryFlags, SIZE$baseGeometryIndexAndGeometryFlags);
    }

    public @unsigned short indexBufferStride() {
        return segment.get(LAYOUT$indexBufferStride, OFFSET$indexBufferStride);
    }

    public void indexBufferStride(@unsigned short value) {
        segment.set(LAYOUT$indexBufferStride, OFFSET$indexBufferStride, value);
    }

    public @unsigned short vertexBufferStride() {
        return segment.get(LAYOUT$vertexBufferStride, OFFSET$vertexBufferStride);
    }

    public void vertexBufferStride(@unsigned short value) {
        segment.set(LAYOUT$vertexBufferStride, OFFSET$vertexBufferStride, value);
    }

    public @unsigned short geometryIndexAndFlagsBufferStride() {
        return segment.get(LAYOUT$geometryIndexAndFlagsBufferStride, OFFSET$geometryIndexAndFlagsBufferStride);
    }

    public void geometryIndexAndFlagsBufferStride(@unsigned short value) {
        segment.set(LAYOUT$geometryIndexAndFlagsBufferStride, OFFSET$geometryIndexAndFlagsBufferStride, value);
    }

    public @unsigned short opacityMicromapIndexBufferStride() {
        return segment.get(LAYOUT$opacityMicromapIndexBufferStride, OFFSET$opacityMicromapIndexBufferStride);
    }

    public void opacityMicromapIndexBufferStride(@unsigned short value) {
        segment.set(LAYOUT$opacityMicromapIndexBufferStride, OFFSET$opacityMicromapIndexBufferStride, value);
    }

    public @unsigned long indexBuffer() {
        return segment.get(LAYOUT$indexBuffer, OFFSET$indexBuffer);
    }

    public void indexBuffer(@unsigned long value) {
        segment.set(LAYOUT$indexBuffer, OFFSET$indexBuffer, value);
    }

    public @unsigned long vertexBuffer() {
        return segment.get(LAYOUT$vertexBuffer, OFFSET$vertexBuffer);
    }

    public void vertexBuffer(@unsigned long value) {
        segment.set(LAYOUT$vertexBuffer, OFFSET$vertexBuffer, value);
    }

    public @unsigned long geometryIndexAndFlagsBuffer() {
        return segment.get(LAYOUT$geometryIndexAndFlagsBuffer, OFFSET$geometryIndexAndFlagsBuffer);
    }

    public void geometryIndexAndFlagsBuffer(@unsigned long value) {
        segment.set(LAYOUT$geometryIndexAndFlagsBuffer, OFFSET$geometryIndexAndFlagsBuffer, value);
    }

    public @unsigned long opacityMicromapArray() {
        return segment.get(LAYOUT$opacityMicromapArray, OFFSET$opacityMicromapArray);
    }

    public void opacityMicromapArray(@unsigned long value) {
        segment.set(LAYOUT$opacityMicromapArray, OFFSET$opacityMicromapArray, value);
    }

    public @unsigned long opacityMicromapIndexBuffer() {
        return segment.get(LAYOUT$opacityMicromapIndexBuffer, OFFSET$opacityMicromapIndexBuffer);
    }

    public void opacityMicromapIndexBuffer(@unsigned long value) {
        segment.set(LAYOUT$opacityMicromapIndexBuffer, OFFSET$opacityMicromapIndexBuffer, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("clusterID"),
        ValueLayout.JAVA_INT.withName("clusterFlags"),
        ValueLayout.JAVA_INT.withName("bitfield$triangleCount$opacityMicromapIndexType"),
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.LAYOUT.withName("baseGeometryIndexAndGeometryFlags"),
        ValueLayout.JAVA_SHORT.withName("indexBufferStride"),
        ValueLayout.JAVA_SHORT.withName("vertexBufferStride"),
        ValueLayout.JAVA_SHORT.withName("geometryIndexAndFlagsBufferStride"),
        ValueLayout.JAVA_SHORT.withName("opacityMicromapIndexBufferStride"),
        ValueLayout.JAVA_LONG.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("vertexBuffer"),
        ValueLayout.JAVA_LONG.withName("geometryIndexAndFlagsBuffer"),
        ValueLayout.JAVA_LONG.withName("opacityMicromapArray"),
        ValueLayout.JAVA_LONG.withName("opacityMicromapIndexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$clusterID = PathElement.groupElement("PATH$clusterID");
    public static final PathElement PATH$clusterFlags = PathElement.groupElement("PATH$clusterFlags");
    public static final PathElement PATH$bitfield$triangleCount$opacityMicromapIndexType = PathElement.groupElement("PATH$bitfield$triangleCount$opacityMicromapIndexType");
    public static final PathElement PATH$baseGeometryIndexAndGeometryFlags = PathElement.groupElement("PATH$baseGeometryIndexAndGeometryFlags");
    public static final PathElement PATH$indexBufferStride = PathElement.groupElement("PATH$indexBufferStride");
    public static final PathElement PATH$vertexBufferStride = PathElement.groupElement("PATH$vertexBufferStride");
    public static final PathElement PATH$geometryIndexAndFlagsBufferStride = PathElement.groupElement("PATH$geometryIndexAndFlagsBufferStride");
    public static final PathElement PATH$opacityMicromapIndexBufferStride = PathElement.groupElement("PATH$opacityMicromapIndexBufferStride");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("PATH$indexBuffer");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("PATH$vertexBuffer");
    public static final PathElement PATH$geometryIndexAndFlagsBuffer = PathElement.groupElement("PATH$geometryIndexAndFlagsBuffer");
    public static final PathElement PATH$opacityMicromapArray = PathElement.groupElement("PATH$opacityMicromapArray");
    public static final PathElement PATH$opacityMicromapIndexBuffer = PathElement.groupElement("PATH$opacityMicromapIndexBuffer");

    public static final OfInt LAYOUT$clusterID = (OfInt) LAYOUT.select(PATH$clusterID);
    public static final OfInt LAYOUT$clusterFlags = (OfInt) LAYOUT.select(PATH$clusterFlags);
    public static final OfInt LAYOUT$bitfield$triangleCount$opacityMicromapIndexType = (OfInt) LAYOUT.select(PATH$bitfield$triangleCount$opacityMicromapIndexType);
    public static final StructLayout LAYOUT$baseGeometryIndexAndGeometryFlags = (StructLayout) LAYOUT.select(PATH$baseGeometryIndexAndGeometryFlags);
    public static final OfShort LAYOUT$indexBufferStride = (OfShort) LAYOUT.select(PATH$indexBufferStride);
    public static final OfShort LAYOUT$vertexBufferStride = (OfShort) LAYOUT.select(PATH$vertexBufferStride);
    public static final OfShort LAYOUT$geometryIndexAndFlagsBufferStride = (OfShort) LAYOUT.select(PATH$geometryIndexAndFlagsBufferStride);
    public static final OfShort LAYOUT$opacityMicromapIndexBufferStride = (OfShort) LAYOUT.select(PATH$opacityMicromapIndexBufferStride);
    public static final OfLong LAYOUT$indexBuffer = (OfLong) LAYOUT.select(PATH$indexBuffer);
    public static final OfLong LAYOUT$vertexBuffer = (OfLong) LAYOUT.select(PATH$vertexBuffer);
    public static final OfLong LAYOUT$geometryIndexAndFlagsBuffer = (OfLong) LAYOUT.select(PATH$geometryIndexAndFlagsBuffer);
    public static final OfLong LAYOUT$opacityMicromapArray = (OfLong) LAYOUT.select(PATH$opacityMicromapArray);
    public static final OfLong LAYOUT$opacityMicromapIndexBuffer = (OfLong) LAYOUT.select(PATH$opacityMicromapIndexBuffer);

    public static final long SIZE$clusterID = LAYOUT$clusterID.byteSize();
    public static final long SIZE$clusterFlags = LAYOUT$clusterFlags.byteSize();
    public static final long SIZE$baseGeometryIndexAndGeometryFlags = LAYOUT$baseGeometryIndexAndGeometryFlags.byteSize();
    public static final long SIZE$indexBufferStride = LAYOUT$indexBufferStride.byteSize();
    public static final long SIZE$vertexBufferStride = LAYOUT$vertexBufferStride.byteSize();
    public static final long SIZE$geometryIndexAndFlagsBufferStride = LAYOUT$geometryIndexAndFlagsBufferStride.byteSize();
    public static final long SIZE$opacityMicromapIndexBufferStride = LAYOUT$opacityMicromapIndexBufferStride.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();
    public static final long SIZE$geometryIndexAndFlagsBuffer = LAYOUT$geometryIndexAndFlagsBuffer.byteSize();
    public static final long SIZE$opacityMicromapArray = LAYOUT$opacityMicromapArray.byteSize();
    public static final long SIZE$opacityMicromapIndexBuffer = LAYOUT$opacityMicromapIndexBuffer.byteSize();

    public static final long OFFSET$clusterID = LAYOUT.byteOffset(PATH$clusterID);
    public static final long OFFSET$clusterFlags = LAYOUT.byteOffset(PATH$clusterFlags);
    public static final long OFFSET$bitfield$triangleCount$opacityMicromapIndexType = LAYOUT.byteOffset(PATH$bitfield$triangleCount$opacityMicromapIndexType);
    public static final long OFFSET$baseGeometryIndexAndGeometryFlags = LAYOUT.byteOffset(PATH$baseGeometryIndexAndGeometryFlags);
    public static final long OFFSET$indexBufferStride = LAYOUT.byteOffset(PATH$indexBufferStride);
    public static final long OFFSET$vertexBufferStride = LAYOUT.byteOffset(PATH$vertexBufferStride);
    public static final long OFFSET$geometryIndexAndFlagsBufferStride = LAYOUT.byteOffset(PATH$geometryIndexAndFlagsBufferStride);
    public static final long OFFSET$opacityMicromapIndexBufferStride = LAYOUT.byteOffset(PATH$opacityMicromapIndexBufferStride);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
    public static final long OFFSET$geometryIndexAndFlagsBuffer = LAYOUT.byteOffset(PATH$geometryIndexAndFlagsBuffer);
    public static final long OFFSET$opacityMicromapArray = LAYOUT.byteOffset(PATH$opacityMicromapArray);
    public static final long OFFSET$opacityMicromapIndexBuffer = LAYOUT.byteOffset(PATH$opacityMicromapIndexBuffer);
}
