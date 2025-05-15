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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapBuildInfoEXT.html">VkMicromapBuildInfoEXT</a>
@ValueBasedCandidate
public record VkMicromapBuildInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$type = ValueLayout.JAVA_INT.withName("type");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$mode = ValueLayout.JAVA_INT.withName("mode");
    public static final AddressLayout LAYOUT$dstMicromap = ValueLayout.ADDRESS.withName("dstMicromap");
    public static final OfInt LAYOUT$usageCountsCount = ValueLayout.JAVA_INT.withName("usageCountsCount");
    public static final AddressLayout LAYOUT$pUsageCounts = ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT).withName("pUsageCounts");
    public static final AddressLayout LAYOUT$ppUsageCounts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(VkMicromapUsageEXT.LAYOUT)).withName("ppUsageCounts");
    public static final StructLayout LAYOUT$data = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("data");
    public static final StructLayout LAYOUT$scratchData = VkDeviceOrHostAddressKHR.LAYOUT.withName("scratchData");
    public static final StructLayout LAYOUT$triangleArray = VkDeviceOrHostAddressConstKHR.LAYOUT.withName("triangleArray");
    public static final OfLong LAYOUT$triangleArrayStride = ValueLayout.JAVA_LONG.withName("triangleArrayStride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$type, LAYOUT$flags, LAYOUT$mode, LAYOUT$dstMicromap, LAYOUT$usageCountsCount, LAYOUT$pUsageCounts, LAYOUT$ppUsageCounts, LAYOUT$data, LAYOUT$scratchData, LAYOUT$triangleArray, LAYOUT$triangleArrayStride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMicromapBuildInfoEXT allocate(Arena arena) {
        return new VkMicromapBuildInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkMicromapBuildInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapBuildInfoEXT[] ret = new VkMicromapBuildInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapBuildInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMicromapBuildInfoEXT clone(Arena arena, VkMicromapBuildInfoEXT src) {
        VkMicromapBuildInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapBuildInfoEXT[] clone(Arena arena, VkMicromapBuildInfoEXT[] src) {
        VkMicromapBuildInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$type = PathElement.groupElement("PATH$type");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$dstMicromap = PathElement.groupElement("PATH$dstMicromap");
    public static final PathElement PATH$usageCountsCount = PathElement.groupElement("PATH$usageCountsCount");
    public static final PathElement PATH$pUsageCounts = PathElement.groupElement("PATH$pUsageCounts");
    public static final PathElement PATH$ppUsageCounts = PathElement.groupElement("PATH$ppUsageCounts");
    public static final PathElement PATH$data = PathElement.groupElement("PATH$data");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");
    public static final PathElement PATH$triangleArray = PathElement.groupElement("PATH$triangleArray");
    public static final PathElement PATH$triangleArrayStride = PathElement.groupElement("PATH$triangleArrayStride");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$dstMicromap = LAYOUT$dstMicromap.byteSize();
    public static final long SIZE$usageCountsCount = LAYOUT$usageCountsCount.byteSize();
    public static final long SIZE$pUsageCounts = LAYOUT$pUsageCounts.byteSize();
    public static final long SIZE$ppUsageCounts = LAYOUT$ppUsageCounts.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();
    public static final long SIZE$triangleArray = LAYOUT$triangleArray.byteSize();
    public static final long SIZE$triangleArrayStride = LAYOUT$triangleArrayStride.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$dstMicromap = LAYOUT.byteOffset(PATH$dstMicromap);
    public static final long OFFSET$usageCountsCount = LAYOUT.byteOffset(PATH$usageCountsCount);
    public static final long OFFSET$pUsageCounts = LAYOUT.byteOffset(PATH$pUsageCounts);
    public static final long OFFSET$ppUsageCounts = LAYOUT.byteOffset(PATH$ppUsageCounts);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$triangleArray = LAYOUT.byteOffset(PATH$triangleArray);
    public static final long OFFSET$triangleArrayStride = LAYOUT.byteOffset(PATH$triangleArrayStride);

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

    public @enumtype(VkMicromapTypeEXT.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkMicromapTypeEXT.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkBuildMicromapFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkBuildMicromapFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkBuildMicromapModeEXT.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkBuildMicromapModeEXT.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public @Nullable VkMicromapEXT dstMicromap() {
        MemorySegment s = segment.asSlice(OFFSET$dstMicromap, SIZE$dstMicromap);
        if (s.address() == 0) {
            return null;
        }
        return new VkMicromapEXT(s);
    }

    public void dstMicromap(@Nullable VkMicromapEXT value) {
        segment.set(LAYOUT$dstMicromap, OFFSET$dstMicromap, value != null ? value.segment() : MemorySegment.NULL);
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

    public VkDeviceOrHostAddressConstKHR data() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
    }

    public VkDeviceOrHostAddressKHR scratchData() {
        return new VkDeviceOrHostAddressKHR(segment.asSlice(OFFSET$scratchData, LAYOUT$scratchData));
    }

    public void scratchData(VkDeviceOrHostAddressKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scratchData, SIZE$scratchData);
    }

    public VkDeviceOrHostAddressConstKHR triangleArray() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$triangleArray, LAYOUT$triangleArray));
    }

    public void triangleArray(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$triangleArray, SIZE$triangleArray);
    }

    public @unsigned long triangleArrayStride() {
        return segment.get(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride);
    }

    public void triangleArrayStride(@unsigned long value) {
        segment.set(LAYOUT$triangleArrayStride, OFFSET$triangleArrayStride, value);
    }

}
