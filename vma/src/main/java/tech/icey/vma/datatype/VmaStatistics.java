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
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaStatistics(MemorySegment segment) implements IPointer {
    public @unsigned int blockCount() {
        return segment.get(LAYOUT$blockCount, OFFSET$blockCount);
    }

    public void blockCount(@unsigned int value) {
        segment.set(LAYOUT$blockCount, OFFSET$blockCount, value);
    }

    public @unsigned int allocationCount() {
        return segment.get(LAYOUT$allocationCount, OFFSET$allocationCount);
    }

    public void allocationCount(@unsigned int value) {
        segment.set(LAYOUT$allocationCount, OFFSET$allocationCount, value);
    }

    public @unsigned long blockBytes() {
        return segment.get(LAYOUT$blockBytes, OFFSET$blockBytes);
    }

    public void blockBytes(@unsigned long value) {
        segment.set(LAYOUT$blockBytes, OFFSET$blockBytes, value);
    }

    public @unsigned long allocationBytes() {
        return segment.get(LAYOUT$allocationBytes, OFFSET$allocationBytes);
    }

    public void allocationBytes(@unsigned long value) {
        segment.set(LAYOUT$allocationBytes, OFFSET$allocationBytes, value);
    }

    public static VmaStatistics allocate(Arena arena) {
        return new VmaStatistics(arena.allocate(LAYOUT));
    }

    public static VmaStatistics[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaStatistics[] ret = new VmaStatistics[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaStatistics(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaStatistics clone(Arena arena, VmaStatistics src) {
        VmaStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaStatistics[] clone(Arena arena, VmaStatistics[] src) {
        VmaStatistics[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("blockCount"),
        ValueLayout.JAVA_INT.withName("allocationCount"),
        ValueLayout.JAVA_LONG.withName("blockBytes"),
        ValueLayout.JAVA_LONG.withName("allocationBytes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$blockCount = PathElement.groupElement("blockCount");
    public static final PathElement PATH$allocationCount = PathElement.groupElement("allocationCount");
    public static final PathElement PATH$blockBytes = PathElement.groupElement("blockBytes");
    public static final PathElement PATH$allocationBytes = PathElement.groupElement("allocationBytes");

    public static final OfInt LAYOUT$blockCount = (OfInt) LAYOUT.select(PATH$blockCount);
    public static final OfInt LAYOUT$allocationCount = (OfInt) LAYOUT.select(PATH$allocationCount);
    public static final OfLong LAYOUT$blockBytes = (OfLong) LAYOUT.select(PATH$blockBytes);
    public static final OfLong LAYOUT$allocationBytes = (OfLong) LAYOUT.select(PATH$allocationBytes);

    public static final long OFFSET$blockCount = LAYOUT.byteOffset(PATH$blockCount);
    public static final long OFFSET$allocationCount = LAYOUT.byteOffset(PATH$allocationCount);
    public static final long OFFSET$blockBytes = LAYOUT.byteOffset(PATH$blockBytes);
    public static final long OFFSET$allocationBytes = LAYOUT.byteOffset(PATH$allocationBytes);

    public static final long SIZE$blockCount = LAYOUT$blockCount.byteSize();
    public static final long SIZE$allocationCount = LAYOUT$allocationCount.byteSize();
    public static final long SIZE$blockBytes = LAYOUT$blockBytes.byteSize();
    public static final long SIZE$allocationBytes = LAYOUT$allocationBytes.byteSize();
}

