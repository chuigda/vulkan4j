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

public record VmaDefragmentationStats(MemorySegment segment) implements IPointer {
    public @unsigned long bytesMoved() {
        return segment.get(LAYOUT$bytesMoved, OFFSET$bytesMoved);
    }

    public void bytesMoved(@unsigned long value) {
        segment.set(LAYOUT$bytesMoved, OFFSET$bytesMoved, value);
    }

    public @unsigned long bytesFreed() {
        return segment.get(LAYOUT$bytesFreed, OFFSET$bytesFreed);
    }

    public void bytesFreed(@unsigned long value) {
        segment.set(LAYOUT$bytesFreed, OFFSET$bytesFreed, value);
    }

    public @unsigned int allocationsMoved() {
        return segment.get(LAYOUT$allocationsMoved, OFFSET$allocationsMoved);
    }

    public void allocationsMoved(@unsigned int value) {
        segment.set(LAYOUT$allocationsMoved, OFFSET$allocationsMoved, value);
    }

    public @unsigned int deviceMemoryBlocksFreed() {
        return segment.get(LAYOUT$deviceMemoryBlocksFreed, OFFSET$deviceMemoryBlocksFreed);
    }

    public void deviceMemoryBlocksFreed(@unsigned int value) {
        segment.set(LAYOUT$deviceMemoryBlocksFreed, OFFSET$deviceMemoryBlocksFreed, value);
    }

    public static VmaDefragmentationStats allocate(Arena arena) {
        return new VmaDefragmentationStats(arena.allocate(LAYOUT));
    }

    public static VmaDefragmentationStats[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaDefragmentationStats[] ret = new VmaDefragmentationStats[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaDefragmentationStats(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaDefragmentationStats clone(Arena arena, VmaDefragmentationStats src) {
        VmaDefragmentationStats ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaDefragmentationStats[] clone(Arena arena, VmaDefragmentationStats[] src) {
        VmaDefragmentationStats[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bytesMoved"),
        ValueLayout.JAVA_LONG.withName("bytesFreed"),
        ValueLayout.JAVA_INT.withName("allocationsMoved"),
        ValueLayout.JAVA_INT.withName("deviceMemoryBlocksFreed")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$bytesMoved = PathElement.groupElement("bytesMoved");
    public static final PathElement PATH$bytesFreed = PathElement.groupElement("bytesFreed");
    public static final PathElement PATH$allocationsMoved = PathElement.groupElement("allocationsMoved");
    public static final PathElement PATH$deviceMemoryBlocksFreed = PathElement.groupElement("deviceMemoryBlocksFreed");

    public static final OfLong LAYOUT$bytesMoved = (OfLong) LAYOUT.select(PATH$bytesMoved);
    public static final OfLong LAYOUT$bytesFreed = (OfLong) LAYOUT.select(PATH$bytesFreed);
    public static final OfInt LAYOUT$allocationsMoved = (OfInt) LAYOUT.select(PATH$allocationsMoved);
    public static final OfInt LAYOUT$deviceMemoryBlocksFreed = (OfInt) LAYOUT.select(PATH$deviceMemoryBlocksFreed);

    public static final long OFFSET$bytesMoved = LAYOUT.byteOffset(PATH$bytesMoved);
    public static final long OFFSET$bytesFreed = LAYOUT.byteOffset(PATH$bytesFreed);
    public static final long OFFSET$allocationsMoved = LAYOUT.byteOffset(PATH$allocationsMoved);
    public static final long OFFSET$deviceMemoryBlocksFreed = LAYOUT.byteOffset(PATH$deviceMemoryBlocksFreed);

    public static final long SIZE$bytesMoved = LAYOUT$bytesMoved.byteSize();
    public static final long SIZE$bytesFreed = LAYOUT$bytesFreed.byteSize();
    public static final long SIZE$allocationsMoved = LAYOUT$allocationsMoved.byteSize();
    public static final long SIZE$deviceMemoryBlocksFreed = LAYOUT$deviceMemoryBlocksFreed.byteSize();
}

