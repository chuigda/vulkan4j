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

public record VkBuildPartitionedAccelerationStructureInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$input = VkPartitionedAccelerationStructureInstancesInputNV.LAYOUT.withName("input");
    public static final OfLong LAYOUT$srcAccelerationStructureData = ValueLayout.JAVA_LONG.withName("srcAccelerationStructureData");
    public static final OfLong LAYOUT$dstAccelerationStructureData = ValueLayout.JAVA_LONG.withName("dstAccelerationStructureData");
    public static final OfLong LAYOUT$scratchData = ValueLayout.JAVA_LONG.withName("scratchData");
    public static final OfLong LAYOUT$srcInfos = ValueLayout.JAVA_LONG.withName("srcInfos");
    public static final OfLong LAYOUT$srcInfosCount = ValueLayout.JAVA_LONG.withName("srcInfosCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$input, LAYOUT$srcAccelerationStructureData, LAYOUT$dstAccelerationStructureData, LAYOUT$scratchData, LAYOUT$srcInfos, LAYOUT$srcInfosCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBuildPartitionedAccelerationStructureInfoNV allocate(Arena arena) {
        return new VkBuildPartitionedAccelerationStructureInfoNV(arena.allocate(LAYOUT));
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBuildPartitionedAccelerationStructureInfoNV[] ret = new VkBuildPartitionedAccelerationStructureInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBuildPartitionedAccelerationStructureInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV clone(Arena arena, VkBuildPartitionedAccelerationStructureInfoNV src) {
        VkBuildPartitionedAccelerationStructureInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBuildPartitionedAccelerationStructureInfoNV[] clone(Arena arena, VkBuildPartitionedAccelerationStructureInfoNV[] src) {
        VkBuildPartitionedAccelerationStructureInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$input = PathElement.groupElement("PATH$input");
    public static final PathElement PATH$srcAccelerationStructureData = PathElement.groupElement("PATH$srcAccelerationStructureData");
    public static final PathElement PATH$dstAccelerationStructureData = PathElement.groupElement("PATH$dstAccelerationStructureData");
    public static final PathElement PATH$scratchData = PathElement.groupElement("PATH$scratchData");
    public static final PathElement PATH$srcInfos = PathElement.groupElement("PATH$srcInfos");
    public static final PathElement PATH$srcInfosCount = PathElement.groupElement("PATH$srcInfosCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$input = LAYOUT$input.byteSize();
    public static final long SIZE$srcAccelerationStructureData = LAYOUT$srcAccelerationStructureData.byteSize();
    public static final long SIZE$dstAccelerationStructureData = LAYOUT$dstAccelerationStructureData.byteSize();
    public static final long SIZE$scratchData = LAYOUT$scratchData.byteSize();
    public static final long SIZE$srcInfos = LAYOUT$srcInfos.byteSize();
    public static final long SIZE$srcInfosCount = LAYOUT$srcInfosCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$input = LAYOUT.byteOffset(PATH$input);
    public static final long OFFSET$srcAccelerationStructureData = LAYOUT.byteOffset(PATH$srcAccelerationStructureData);
    public static final long OFFSET$dstAccelerationStructureData = LAYOUT.byteOffset(PATH$dstAccelerationStructureData);
    public static final long OFFSET$scratchData = LAYOUT.byteOffset(PATH$scratchData);
    public static final long OFFSET$srcInfos = LAYOUT.byteOffset(PATH$srcInfos);
    public static final long OFFSET$srcInfosCount = LAYOUT.byteOffset(PATH$srcInfosCount);

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

    public VkPartitionedAccelerationStructureInstancesInputNV input() {
        return new VkPartitionedAccelerationStructureInstancesInputNV(segment.asSlice(OFFSET$input, LAYOUT$input));
    }

    public void input(VkPartitionedAccelerationStructureInstancesInputNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$input, SIZE$input);
    }

    public @unsigned long srcAccelerationStructureData() {
        return segment.get(LAYOUT$srcAccelerationStructureData, OFFSET$srcAccelerationStructureData);
    }

    public void srcAccelerationStructureData(@unsigned long value) {
        segment.set(LAYOUT$srcAccelerationStructureData, OFFSET$srcAccelerationStructureData, value);
    }

    public @unsigned long dstAccelerationStructureData() {
        return segment.get(LAYOUT$dstAccelerationStructureData, OFFSET$dstAccelerationStructureData);
    }

    public void dstAccelerationStructureData(@unsigned long value) {
        segment.set(LAYOUT$dstAccelerationStructureData, OFFSET$dstAccelerationStructureData, value);
    }

    public @unsigned long scratchData() {
        return segment.get(LAYOUT$scratchData, OFFSET$scratchData);
    }

    public void scratchData(@unsigned long value) {
        segment.set(LAYOUT$scratchData, OFFSET$scratchData, value);
    }

    public @unsigned long srcInfos() {
        return segment.get(LAYOUT$srcInfos, OFFSET$srcInfos);
    }

    public void srcInfos(@unsigned long value) {
        segment.set(LAYOUT$srcInfos, OFFSET$srcInfos, value);
    }

    public @unsigned long srcInfosCount() {
        return segment.get(LAYOUT$srcInfosCount, OFFSET$srcInfosCount);
    }

    public void srcInfosCount(@unsigned long value) {
        segment.set(LAYOUT$srcInfosCount, OFFSET$srcInfosCount, value);
    }

}
/// dummy, not implemented yet
