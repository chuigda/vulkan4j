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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureTrianglesOpacityMicromapEXT.html"><code>VkAccelerationStructureTrianglesOpacityMicromapEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureTrianglesOpacityMicromapEXT {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexBuffer;
///     VkDeviceSize indexStride;
///     uint32_t baseTriangle;
///     uint32_t usageCountsCount; // optional
///     VkMicromapUsageEXT const* pUsageCounts; // optional
///     VkMicromapUsageEXT const* const* ppUsageCounts;
///     VkMicromapEXT micromap; // optional
/// } VkAccelerationStructureTrianglesOpacityMicromapEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT`
///
/// The {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAccelerationStructureTrianglesOpacityMicromapEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureTrianglesOpacityMicromapEXT.html"><code>VkAccelerationStructureTrianglesOpacityMicromapEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureTrianglesOpacityMicromapEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureTrianglesOpacityMicromapEXT allocate(Arena arena) {
        VkAccelerationStructureTrianglesOpacityMicromapEXT ret = new VkAccelerationStructureTrianglesOpacityMicromapEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
        return ret;
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureTrianglesOpacityMicromapEXT[] ret = new VkAccelerationStructureTrianglesOpacityMicromapEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
        }
        return ret;
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT clone(Arena arena, VkAccelerationStructureTrianglesOpacityMicromapEXT src) {
        VkAccelerationStructureTrianglesOpacityMicromapEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT[] clone(Arena arena, VkAccelerationStructureTrianglesOpacityMicromapEXT[] src) {
        VkAccelerationStructureTrianglesOpacityMicromapEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_TRIANGLES_OPACITY_MICROMAP_EXT);
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMicromapUsageEXT(s);
    }

    public void pUsageCounts(@Nullable VkMicromapUsageEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUsageCountsRaw(s);
    }

    @unsafe public @Nullable VkMicromapUsageEXT[] pUsageCounts(int assumedCount) {
        MemorySegment s = pUsageCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMicromapUsageEXT.BYTES);
        VkMicromapUsageEXT[] ret = new VkMicromapUsageEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMicromapUsageEXT(s.asSlice(i * VkMicromapUsageEXT.BYTES, VkMicromapUsageEXT.BYTES));
        }
        return ret;
    }

    public @pointer(comment="void**") MemorySegment ppUsageCountsRaw() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCountsRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr ppUsageCounts() {
        MemorySegment s = ppUsageCountsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public void ppUsageCounts(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppUsageCountsRaw(s);
    }

    public @Nullable VkMicromapEXT micromap() {
        MemorySegment s = segment.asSlice(OFFSET$micromap, SIZE$micromap);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void micromap(@Nullable VkMicromapEXT value) {
        segment.set(LAYOUT$micromap, OFFSET$micromap, value != null ? value.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("baseTriangle"),
        ValueLayout.JAVA_INT.withName("usageCountsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts"),
        ValueLayout.ADDRESS.withName("micromap")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$indexType = PathElement.groupElement("PATH$indexType");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("PATH$indexBuffer");
    public static final PathElement PATH$indexStride = PathElement.groupElement("PATH$indexStride");
    public static final PathElement PATH$baseTriangle = PathElement.groupElement("PATH$baseTriangle");
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement("PATH$usageCountsCount");
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement("PATH$pUsageCounts");
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement("PATH$ppUsageCounts");
    public static final PathElement PATH$micromap = PathElement.groupElement("PATH$micromap");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final StructLayout LAYOUT$indexBuffer = (StructLayout) LAYOUT.select(PATH$indexBuffer);
    public static final OfLong LAYOUT$indexStride = (OfLong) LAYOUT.select(PATH$indexStride);
    public static final OfInt LAYOUT$baseTriangle = (OfInt) LAYOUT.select(PATH$baseTriangle);
    public static final OfInt LAYOUT$usageCountsCount = (OfInt) LAYOUT.select(PATH$usageCountsCount);
    public static final AddressLayout LAYOUT$pUsageCounts = (AddressLayout) LAYOUT.select(PATH$pUsageCounts);
    public static final AddressLayout LAYOUT$ppUsageCounts = (AddressLayout) LAYOUT.select(PATH$ppUsageCounts);
    public static final AddressLayout LAYOUT$micromap = (AddressLayout) LAYOUT.select(PATH$micromap);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();
    public static final long SIZE$indexStride = LAYOUT$indexStride.byteSize();
    public static final long SIZE$baseTriangle = LAYOUT$baseTriangle.byteSize();
    public static final long SIZE$usageCountsCount = LAYOUT$usageCountsCount.byteSize();
    public static final long SIZE$pUsageCounts = LAYOUT$pUsageCounts.byteSize();
    public static final long SIZE$ppUsageCounts = LAYOUT$ppUsageCounts.byteSize();
    public static final long SIZE$micromap = LAYOUT$micromap.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$indexStride = LAYOUT.byteOffset(PATH$indexStride);
    public static final long OFFSET$baseTriangle = LAYOUT.byteOffset(PATH$baseTriangle);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);
}
