package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

public record VmaDetailedStatistics(MemorySegment segment) implements IPointer {
    public VmaStatistics statistics() {
        return new VmaStatistics(segment.asSlice(OFFSET$statistics, LAYOUT$statistics));
    }

    public void statistics(VmaStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$statistics, SIZE$statistics);
    }

    public @unsigned int unusedRangeCount() {
        return segment.get(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount);
    }

    public void unusedRangeCount(@unsigned int value) {
        segment.set(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount, value);
    }

    public @unsigned long allocationSizeMin() {
        return segment.get(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin);
    }

    public void allocationSizeMin(@unsigned long value) {
        segment.set(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin, value);
    }

    public @unsigned long allocationSizeMax() {
        return segment.get(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax);
    }

    public void allocationSizeMax(@unsigned long value) {
        segment.set(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax, value);
    }

    public @unsigned long unusedRangeSizeMin() {
        return segment.get(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin);
    }

    public void unusedRangeSizeMin(@unsigned long value) {
        segment.set(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin, value);
    }

    public @unsigned long unusedRangeSizeMax() {
        return segment.get(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax);
    }

    public void unusedRangeSizeMax(@unsigned long value) {
        segment.set(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax, value);
    }

    public static VmaDetailedStatistics allocate(Arena arena) {
        return new VmaDetailedStatistics(arena.allocate(LAYOUT));
    }

    public static VmaDetailedStatistics[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDetailedStatistics[] ret = new VmaDetailedStatistics[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDetailedStatistics(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDetailedStatistics clone(Arena arena, VmaDetailedStatistics src) {
        VmaDetailedStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDetailedStatistics[] clone(Arena arena, VmaDetailedStatistics[] src) {
        VmaDetailedStatistics[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_INT.withName("unusedRangeCount"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMin"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMax"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMin"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMax")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$statistics = PathElement.groupElement("statistics");
    public static final PathElement PATH$unusedRangeCount = PathElement.groupElement("unusedRangeCount");
    public static final PathElement PATH$allocationSizeMin = PathElement.groupElement("allocationSizeMin");
    public static final PathElement PATH$allocationSizeMax = PathElement.groupElement("allocationSizeMax");
    public static final PathElement PATH$unusedRangeSizeMin = PathElement.groupElement("unusedRangeSizeMin");
    public static final PathElement PATH$unusedRangeSizeMax = PathElement.groupElement("unusedRangeSizeMax");

    public static final StructLayout LAYOUT$statistics = (StructLayout) LAYOUT.select(PATH$statistics);
    public static final OfInt LAYOUT$unusedRangeCount = (OfInt) LAYOUT.select(PATH$unusedRangeCount);
    public static final OfLong LAYOUT$allocationSizeMin = (OfLong) LAYOUT.select(PATH$allocationSizeMin);
    public static final OfLong LAYOUT$allocationSizeMax = (OfLong) LAYOUT.select(PATH$allocationSizeMax);
    public static final OfLong LAYOUT$unusedRangeSizeMin = (OfLong) LAYOUT.select(PATH$unusedRangeSizeMin);
    public static final OfLong LAYOUT$unusedRangeSizeMax = (OfLong) LAYOUT.select(PATH$unusedRangeSizeMax);

    public static final long OFFSET$statistics = LAYOUT.byteOffset(PATH$statistics);
    public static final long OFFSET$unusedRangeCount = LAYOUT.byteOffset(PATH$unusedRangeCount);
    public static final long OFFSET$allocationSizeMin = LAYOUT.byteOffset(PATH$allocationSizeMin);
    public static final long OFFSET$allocationSizeMax = LAYOUT.byteOffset(PATH$allocationSizeMax);
    public static final long OFFSET$unusedRangeSizeMin = LAYOUT.byteOffset(PATH$unusedRangeSizeMin);
    public static final long OFFSET$unusedRangeSizeMax = LAYOUT.byteOffset(PATH$unusedRangeSizeMax);

    public static final long SIZE$statistics = LAYOUT$statistics.byteSize();
    public static final long SIZE$unusedRangeCount = LAYOUT$unusedRangeCount.byteSize();
    public static final long SIZE$allocationSizeMin = LAYOUT$allocationSizeMin.byteSize();
    public static final long SIZE$allocationSizeMax = LAYOUT$allocationSizeMax.byteSize();
    public static final long SIZE$unusedRangeSizeMin = LAYOUT$unusedRangeSizeMin.byteSize();
    public static final long SIZE$unusedRangeSizeMax = LAYOUT$unusedRangeSizeMax.byteSize();
}

