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

public record VmaAllocationInfo2(MemorySegment segment) implements IPointer {
    public VmaAllocationInfo allocationInfo() {
        return new VmaAllocationInfo(segment.asSlice(OFFSET$allocationInfo, LAYOUT$allocationInfo));
    }

    public void allocationInfo(VmaAllocationInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$allocationInfo, SIZE$allocationInfo);
    }

    public @unsigned long blockSize() {
        return segment.get(LAYOUT$blockSize, OFFSET$blockSize);
    }

    public void blockSize(@unsigned long value) {
        segment.set(LAYOUT$blockSize, OFFSET$blockSize, value);
    }

    public @unsigned int dedicatedMemory() {
        return segment.get(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory);
    }

    public void dedicatedMemory(@unsigned int value) {
        segment.set(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory, value);
    }

    public static VmaAllocationInfo2 allocate(Arena arena) {
        return new VmaAllocationInfo2(arena.allocate(LAYOUT));
    }

    public static VmaAllocationInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaAllocationInfo2[] ret = new VmaAllocationInfo2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaAllocationInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaAllocationInfo2 clone(Arena arena, VmaAllocationInfo2 src) {
        VmaAllocationInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaAllocationInfo2[] clone(Arena arena, VmaAllocationInfo2[] src) {
        VmaAllocationInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VmaAllocationInfo.LAYOUT.withName("allocationInfo"),
        ValueLayout.JAVA_LONG.withName("blockSize"),
        ValueLayout.JAVA_INT.withName("dedicatedMemory")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$allocationInfo = PathElement.groupElement("allocationInfo");
    public static final PathElement PATH$blockSize = PathElement.groupElement("blockSize");
    public static final PathElement PATH$dedicatedMemory = PathElement.groupElement("dedicatedMemory");

    public static final StructLayout LAYOUT$allocationInfo = (StructLayout) LAYOUT.select(PATH$allocationInfo);
    public static final OfLong LAYOUT$blockSize = (OfLong) LAYOUT.select(PATH$blockSize);
    public static final OfInt LAYOUT$dedicatedMemory = (OfInt) LAYOUT.select(PATH$dedicatedMemory);

    public static final long OFFSET$allocationInfo = LAYOUT.byteOffset(PATH$allocationInfo);
    public static final long OFFSET$blockSize = LAYOUT.byteOffset(PATH$blockSize);
    public static final long OFFSET$dedicatedMemory = LAYOUT.byteOffset(PATH$dedicatedMemory);

    public static final long SIZE$allocationInfo = LAYOUT$allocationInfo.byteSize();
    public static final long SIZE$blockSize = LAYOUT$blockSize.byteSize();
    public static final long SIZE$dedicatedMemory = LAYOUT$dedicatedMemory.byteSize();
}

