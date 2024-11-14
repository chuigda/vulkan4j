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

public record VmaTotalStatistics(MemorySegment segment) implements IPointer {
    public VmaDetailedStatistics memoryType() {
        return new VmaDetailedStatistics(segment.asSlice(OFFSET$memoryType, LAYOUT$memoryType));
    }

    public void memoryType(VmaDetailedStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryType, SIZE$memoryType);
    }

    public VmaDetailedStatistics memoryHeap() {
        return new VmaDetailedStatistics(segment.asSlice(OFFSET$memoryHeap, LAYOUT$memoryHeap));
    }

    public void memoryHeap(VmaDetailedStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryHeap, SIZE$memoryHeap);
    }

    public VmaDetailedStatistics total() {
        return new VmaDetailedStatistics(segment.asSlice(OFFSET$total, LAYOUT$total));
    }

    public void total(VmaDetailedStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$total, SIZE$total);
    }

    public static VmaTotalStatistics allocate(Arena arena) {
        return new VmaTotalStatistics(arena.allocate(LAYOUT));
    }

    public static VmaTotalStatistics[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaTotalStatistics[] ret = new VmaTotalStatistics[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaTotalStatistics(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaTotalStatistics clone(Arena arena, VmaTotalStatistics src) {
        VmaTotalStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaTotalStatistics[] clone(Arena arena, VmaTotalStatistics[] src) {
        VmaTotalStatistics[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VmaDetailedStatistics.LAYOUT.withName("memoryType"),
        VmaDetailedStatistics.LAYOUT.withName("memoryHeap"),
        VmaDetailedStatistics.LAYOUT.withName("total")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$memoryType = PathElement.groupElement("memoryType");
    public static final PathElement PATH$memoryHeap = PathElement.groupElement("memoryHeap");
    public static final PathElement PATH$total = PathElement.groupElement("total");

    public static final StructLayout LAYOUT$memoryType = (StructLayout) LAYOUT.select(PATH$memoryType);
    public static final StructLayout LAYOUT$memoryHeap = (StructLayout) LAYOUT.select(PATH$memoryHeap);
    public static final StructLayout LAYOUT$total = (StructLayout) LAYOUT.select(PATH$total);

    public static final long OFFSET$memoryType = LAYOUT.byteOffset(PATH$memoryType);
    public static final long OFFSET$memoryHeap = LAYOUT.byteOffset(PATH$memoryHeap);
    public static final long OFFSET$total = LAYOUT.byteOffset(PATH$total);

    public static final long SIZE$memoryType = LAYOUT$memoryType.byteSize();
    public static final long SIZE$memoryHeap = LAYOUT$memoryHeap.byteSize();
    public static final long SIZE$total = LAYOUT$total.byteSize();
}

