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
/// typedef struct VkAccelerationStructureTrianglesDisplacementMicromapNV {
///     VkStructureType sType;
///     void* pNext;
///     VkFormat displacementBiasAndScaleFormat;
///     VkFormat displacementVectorFormat;
///     VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer;
///     VkDeviceSize displacementBiasAndScaleStride;
///     VkDeviceOrHostAddressConstKHR displacementVectorBuffer;
///     VkDeviceSize displacementVectorStride;
///     VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags;
///     VkDeviceSize displacedMicromapPrimitiveFlagsStride;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexBuffer;
///     VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount;
///     const VkMicromapUsageEXT* pUsageCounts;
///     const VkMicromapUsageEXT* const* ppUsageCounts;
///     VkMicromapEXT micromap;
/// } VkAccelerationStructureTrianglesDisplacementMicromapNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAccelerationStructureTrianglesDisplacementMicromapNV.html">VkAccelerationStructureTrianglesDisplacementMicromapNV</a>
public record VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) implements IPointer {
    public VkAccelerationStructureTrianglesDisplacementMicromapNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_DISPLACEMENT_MICROMAP_NV);
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

    public @enumtype(VkFormat.class) int displacementBiasAndScaleFormat() {
        return segment.get(LAYOUT$displacementBiasAndScaleFormat, OFFSET$displacementBiasAndScaleFormat);
    }

    public void displacementBiasAndScaleFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$displacementBiasAndScaleFormat, OFFSET$displacementBiasAndScaleFormat, value);
    }

    public @enumtype(VkFormat.class) int displacementVectorFormat() {
        return segment.get(LAYOUT$displacementVectorFormat, OFFSET$displacementVectorFormat);
    }

    public void displacementVectorFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$displacementVectorFormat, OFFSET$displacementVectorFormat, value);
    }

    public VkDeviceOrHostAddressConstKHR displacementBiasAndScaleBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacementBiasAndScaleBuffer, LAYOUT$displacementBiasAndScaleBuffer));
    }

    public void displacementBiasAndScaleBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacementBiasAndScaleBuffer, SIZE$displacementBiasAndScaleBuffer);
    }

    public @unsigned long displacementBiasAndScaleStride() {
        return segment.get(LAYOUT$displacementBiasAndScaleStride, OFFSET$displacementBiasAndScaleStride);
    }

    public void displacementBiasAndScaleStride(@unsigned long value) {
        segment.set(LAYOUT$displacementBiasAndScaleStride, OFFSET$displacementBiasAndScaleStride, value);
    }

    public VkDeviceOrHostAddressConstKHR displacementVectorBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacementVectorBuffer, LAYOUT$displacementVectorBuffer));
    }

    public void displacementVectorBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacementVectorBuffer, SIZE$displacementVectorBuffer);
    }

    public @unsigned long displacementVectorStride() {
        return segment.get(LAYOUT$displacementVectorStride, OFFSET$displacementVectorStride);
    }

    public void displacementVectorStride(@unsigned long value) {
        segment.set(LAYOUT$displacementVectorStride, OFFSET$displacementVectorStride, value);
    }

    public VkDeviceOrHostAddressConstKHR displacedMicromapPrimitiveFlags() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$displacedMicromapPrimitiveFlags, LAYOUT$displacedMicromapPrimitiveFlags));
    }

    public void displacedMicromapPrimitiveFlags(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displacedMicromapPrimitiveFlags, SIZE$displacedMicromapPrimitiveFlags);
    }

    public @unsigned long displacedMicromapPrimitiveFlagsStride() {
        return segment.get(LAYOUT$displacedMicromapPrimitiveFlagsStride, OFFSET$displacedMicromapPrimitiveFlagsStride);
    }

    public void displacedMicromapPrimitiveFlagsStride(@unsigned long value) {
        segment.set(LAYOUT$displacedMicromapPrimitiveFlagsStride, OFFSET$displacedMicromapPrimitiveFlagsStride, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkDeviceOrHostAddressConstKHR indexBuffer() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexBuffer, LAYOUT$indexBuffer));
    }

    public void indexBuffer(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexBuffer, SIZE$indexBuffer);
    }

    public @unsigned long indexStride() {
        return segment.get(LAYOUT$indexStride, OFFSET$indexStride);
    }

    public void indexStride(@unsigned long value) {
        segment.set(LAYOUT$indexStride, OFFSET$indexStride, value);
    }

    public @unsigned int baseTriangle() {
        return segment.get(LAYOUT$baseTriangle, OFFSET$baseTriangle);
    }

    public void baseTriangle(@unsigned int value) {
        segment.set(LAYOUT$baseTriangle, OFFSET$baseTriangle, value);
    }

    public @unsigned int usageCountsCount() {
        return segment.get(LAYOUT$usageCountsCount, OFFSET$usageCountsCount);
    }

    public void usageCountsCount(@unsigned int value) {
        segment.set(LAYOUT$usageCountsCount, OFFSET$usageCountsCount, value);
    }

    public @pointer(comment="VkMicromapUsageEXT*") MemorySegment pUsageCountsRaw() {
        return segment.get(LAYOUT$pUsageCounts, OFFSET$pUsageCounts);
    }

    public void pUsageCountsRaw(@pointer(comment="VkMicromapUsageEXT*") MemorySegment value) {
        segment.set(LAYOUT$pUsageCounts, OFFSET$pUsageCounts, value);
    }

    public @Nullable VkMicromapUsageEXT pUsageCounts() {
        MemorySegment s = pUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapUsageEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkMicromapUsageEXT[] pUsageCounts(int assumedCount) {
        MemorySegment s = pUsageCountsRaw().reinterpret(assumedCount * VkMicromapUsageEXT.SIZE);
        VkMicromapUsageEXT[] arr = new VkMicromapUsageEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkMicromapUsageEXT(s.asSlice(i * VkMicromapUsageEXT.SIZE, VkMicromapUsageEXT.SIZE));
        }
        return arr;
    }

    public void pUsageCounts(@Nullable VkMicromapUsageEXT value) {
        pUsageCountsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @pointer(comment="void**") MemorySegment ppUsageCountsRaw() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCountsRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the
    /// size before actually {@link PointerBuffer#read}ing or {@link PointerBuffer#write}ing the buffer.
    ///
    /// @see PointerBuffer
    public @Nullable PointerBuffer ppUsageCounts() {
        var s = ppUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(ppUsageCountsRaw());
    }

    public void ppUsageCounts(@Nullable PointerBuffer value) {
        ppUsageCountsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public @Nullable VkMicromapEXT micromap() {
        MemorySegment s = segment.get(LAYOUT$micromap, OFFSET$micromap);
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void micromap(@Nullable VkMicromapEXT value) {
        segment.set(
            LAYOUT$micromap,
            OFFSET$micromap,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV allocate(Arena arena) {
        return new VkAccelerationStructureTrianglesDisplacementMicromapNV(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureTrianglesDisplacementMicromapNV[] ret = new VkAccelerationStructureTrianglesDisplacementMicromapNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAccelerationStructureTrianglesDisplacementMicromapNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV clone(Arena arena, VkAccelerationStructureTrianglesDisplacementMicromapNV src) {
        VkAccelerationStructureTrianglesDisplacementMicromapNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureTrianglesDisplacementMicromapNV[] clone(Arena arena, VkAccelerationStructureTrianglesDisplacementMicromapNV[] src) {
        VkAccelerationStructureTrianglesDisplacementMicromapNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("displacementBiasAndScaleFormat"),
        ValueLayout.JAVA_INT.withName("displacementVectorFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementBiasAndScaleBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementBiasAndScaleStride"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacementVectorBuffer"),
        ValueLayout.JAVA_LONG.withName("displacementVectorStride"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("displacedMicromapPrimitiveFlags"),
        ValueLayout.JAVA_LONG.withName("displacedMicromapPrimitiveFlagsStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts"),
        ValueLayout.ADDRESS.withName("micromap")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displacementBiasAndScaleFormat = PathElement.groupElement("displacementBiasAndScaleFormat");
    public static final PathElement PATH$displacementVectorFormat = PathElement.groupElement("displacementVectorFormat");
    public static final PathElement PATH$displacementBiasAndScaleBuffer = PathElement.groupElement("displacementBiasAndScaleBuffer");
    public static final PathElement PATH$displacementBiasAndScaleStride = PathElement.groupElement("displacementBiasAndScaleStride");
    public static final PathElement PATH$displacementVectorBuffer = PathElement.groupElement("displacementVectorBuffer");
    public static final PathElement PATH$displacementVectorStride = PathElement.groupElement("displacementVectorStride");
    public static final PathElement PATH$displacedMicromapPrimitiveFlags = PathElement.groupElement("displacedMicromapPrimitiveFlags");
    public static final PathElement PATH$displacedMicromapPrimitiveFlagsStride = PathElement.groupElement("displacedMicromapPrimitiveFlagsStride");
    public static final PathElement PATH$indexType = PathElement.groupElement("indexType");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("indexBuffer");
    public static final PathElement PATH$indexStride = PathElement.groupElement("indexStride");
    public static final PathElement PATH$baseTriangle = PathElement.groupElement("baseTriangle");
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement("usageCountsCount");
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement("pUsageCounts");
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement("ppUsageCounts");
    public static final PathElement PATH$micromap = PathElement.groupElement("micromap");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$displacementBiasAndScaleFormat = (OfInt) LAYOUT.select(PATH$displacementBiasAndScaleFormat);
    public static final OfInt LAYOUT$displacementVectorFormat = (OfInt) LAYOUT.select(PATH$displacementVectorFormat);
    public static final UnionLayout LAYOUT$displacementBiasAndScaleBuffer = (UnionLayout) LAYOUT.select(PATH$displacementBiasAndScaleBuffer);
    public static final OfLong LAYOUT$displacementBiasAndScaleStride = (OfLong) LAYOUT.select(PATH$displacementBiasAndScaleStride);
    public static final UnionLayout LAYOUT$displacementVectorBuffer = (UnionLayout) LAYOUT.select(PATH$displacementVectorBuffer);
    public static final OfLong LAYOUT$displacementVectorStride = (OfLong) LAYOUT.select(PATH$displacementVectorStride);
    public static final UnionLayout LAYOUT$displacedMicromapPrimitiveFlags = (UnionLayout) LAYOUT.select(PATH$displacedMicromapPrimitiveFlags);
    public static final OfLong LAYOUT$displacedMicromapPrimitiveFlagsStride = (OfLong) LAYOUT.select(PATH$displacedMicromapPrimitiveFlagsStride);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final UnionLayout LAYOUT$indexBuffer = (UnionLayout) LAYOUT.select(PATH$indexBuffer);
    public static final OfLong LAYOUT$indexStride = (OfLong) LAYOUT.select(PATH$indexStride);
    public static final OfInt LAYOUT$baseTriangle = (OfInt) LAYOUT.select(PATH$baseTriangle);
    public static final OfInt LAYOUT$usageCountsCount = (OfInt) LAYOUT.select(PATH$usageCountsCount);
    public static final AddressLayout LAYOUT$pUsageCounts = (AddressLayout) LAYOUT.select(PATH$pUsageCounts);
    public static final AddressLayout LAYOUT$ppUsageCounts = (AddressLayout) LAYOUT.select(PATH$ppUsageCounts);
    public static final AddressLayout LAYOUT$micromap = (AddressLayout) LAYOUT.select(PATH$micromap);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displacementBiasAndScaleFormat = LAYOUT.byteOffset(PATH$displacementBiasAndScaleFormat);
    public static final long OFFSET$displacementVectorFormat = LAYOUT.byteOffset(PATH$displacementVectorFormat);
    public static final long OFFSET$displacementBiasAndScaleBuffer = LAYOUT.byteOffset(PATH$displacementBiasAndScaleBuffer);
    public static final long OFFSET$displacementBiasAndScaleStride = LAYOUT.byteOffset(PATH$displacementBiasAndScaleStride);
    public static final long OFFSET$displacementVectorBuffer = LAYOUT.byteOffset(PATH$displacementVectorBuffer);
    public static final long OFFSET$displacementVectorStride = LAYOUT.byteOffset(PATH$displacementVectorStride);
    public static final long OFFSET$displacedMicromapPrimitiveFlags = LAYOUT.byteOffset(PATH$displacedMicromapPrimitiveFlags);
    public static final long OFFSET$displacedMicromapPrimitiveFlagsStride = LAYOUT.byteOffset(PATH$displacedMicromapPrimitiveFlagsStride);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$indexStride = LAYOUT.byteOffset(PATH$indexStride);
    public static final long OFFSET$baseTriangle = LAYOUT.byteOffset(PATH$baseTriangle);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$displacementBiasAndScaleFormat = LAYOUT$displacementBiasAndScaleFormat.byteSize();
    public static final long SIZE$displacementVectorFormat = LAYOUT$displacementVectorFormat.byteSize();
    public static final long SIZE$displacementBiasAndScaleBuffer = LAYOUT$displacementBiasAndScaleBuffer.byteSize();
    public static final long SIZE$displacementBiasAndScaleStride = LAYOUT$displacementBiasAndScaleStride.byteSize();
    public static final long SIZE$displacementVectorBuffer = LAYOUT$displacementVectorBuffer.byteSize();
    public static final long SIZE$displacementVectorStride = LAYOUT$displacementVectorStride.byteSize();
    public static final long SIZE$displacedMicromapPrimitiveFlags = LAYOUT$displacedMicromapPrimitiveFlags.byteSize();
    public static final long SIZE$displacedMicromapPrimitiveFlagsStride = LAYOUT$displacedMicromapPrimitiveFlagsStride.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();
    public static final long SIZE$indexStride = LAYOUT$indexStride.byteSize();
    public static final long SIZE$baseTriangle = LAYOUT$baseTriangle.byteSize();
    public static final long SIZE$usageCountsCount = LAYOUT$usageCountsCount.byteSize();
    public static final long SIZE$pUsageCounts = LAYOUT$pUsageCounts.byteSize();
    public static final long SIZE$ppUsageCounts = LAYOUT$ppUsageCounts.byteSize();
    public static final long SIZE$micromap = LAYOUT$micromap.byteSize();
}
