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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureTrianglesOpacityMicromapEXT.html">VkAccelerationStructureTrianglesOpacityMicromapEXT</a>
@ValueBasedCandidate
public record VkAccelerationStructureTrianglesOpacityMicromapEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$indexType = ValueLayout.JAVA_INT.withName("indexType");
    public static final StructLayout LAYOUT$indexBuffer = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexBuffer");
    public static final OfLong LAYOUT$indexStride = ValueLayout.JAVA_LONG.withName("indexStride");
    public static final OfInt LAYOUT$baseTriangle = ValueLayout.JAVA_INT.withName("baseTriangle");
    public static final OfInt LAYOUT$usageCountsCount = ValueLayout.JAVA_INT.withName("usageCountsCount");
    public static final AddressLayout LAYOUT$pUsageCounts = ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts");
    public static final AddressLayout LAYOUT$ppUsageCounts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts");
    public static final AddressLayout LAYOUT$micromap = ValueLayout.ADDRESS.withName("micromap");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$indexType, LAYOUT$indexBuffer, LAYOUT$indexStride, LAYOUT$baseTriangle, LAYOUT$usageCountsCount, LAYOUT$pUsageCounts, LAYOUT$ppUsageCounts, LAYOUT$micromap);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT allocate(Arena arena) {
        return new VkAccelerationStructureTrianglesOpacityMicromapEXT(arena.allocate(LAYOUT));
    }

    public static VkAccelerationStructureTrianglesOpacityMicromapEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureTrianglesOpacityMicromapEXT[] ret = new VkAccelerationStructureTrianglesOpacityMicromapEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureTrianglesOpacityMicromapEXT(segment.asSlice(i * SIZE, SIZE));
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

    public void pUsageCounts(@Nullable VkMicromapUsageEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pUsageCountsRaw(s);
    }

    @unsafe public @Nullable VkMicromapUsageEXT[] pUsageCounts(int assumedCount) {
        MemorySegment s = pUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMicromapUsageEXT.SIZE);
        VkMicromapUsageEXT[] ret = new VkMicromapUsageEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMicromapUsageEXT(s.asSlice(i * VkMicromapUsageEXT.SIZE, VkMicromapUsageEXT.SIZE));
        }
        return ret;
    }

    public @pointer(comment="void**") MemorySegment ppUsageCountsRaw() {
        return segment.get(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts);
    }

    public void ppUsageCountsRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$ppUsageCounts, OFFSET$ppUsageCounts, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer ppUsageCounts() {
        MemorySegment s = ppUsageCountsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void ppUsageCounts(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        ppUsageCountsRaw(s);
    }

    public @Nullable VkMicromapEXT micromap() {
        MemorySegment s = segment.asSlice(OFFSET$micromap, SIZE$micromap);
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void micromap() {
        segment.set(LAYOUT$micromap, OFFSET$micromap, value != null ? value.segment() : MemorySegment.NULL);
    }

}
