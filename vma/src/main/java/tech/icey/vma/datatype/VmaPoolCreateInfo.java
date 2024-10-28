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

public record VmaPoolCreateInfo(MemorySegment segment) implements IPointer {
    public @unsigned int memoryTypeIndex() {
        return segment.get(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex);
    }

    public void memoryTypeIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeIndex, OFFSET$memoryTypeIndex, value);
    }

    public @enumtype(VmaPoolCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VmaPoolCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long blockSize() {
        return segment.get(LAYOUT$blockSize, OFFSET$blockSize);
    }

    public void blockSize(@unsigned long value) {
        segment.set(LAYOUT$blockSize, OFFSET$blockSize, value);
    }

    public @unsigned long minBlockCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$minBlockCount);
    }

    public void minBlockCount(long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$minBlockCount, value);
    }

    public @unsigned long maxBlockCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$maxBlockCount);
    }

    public void maxBlockCount(long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$maxBlockCount, value);
    }

    public float priority() {
        return segment.get(LAYOUT$priority, OFFSET$priority);
    }

    public void priority(float value) {
        segment.set(LAYOUT$priority, OFFSET$priority, value);
    }

    public @unsigned long minAllocationAlignment() {
        return segment.get(LAYOUT$minAllocationAlignment, OFFSET$minAllocationAlignment);
    }

    public void minAllocationAlignment(@unsigned long value) {
        segment.set(LAYOUT$minAllocationAlignment, OFFSET$minAllocationAlignment, value);
    }

    public @pointer(comment="void*") MemorySegment pMemoryAllocateNext() {
        return segment.get(LAYOUT$pMemoryAllocateNext, OFFSET$pMemoryAllocateNext);
    }

    public void pMemoryAllocateNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pMemoryAllocateNext, OFFSET$pMemoryAllocateNext, value);
    }

    public void pMemoryAllocateNext(IPointer pointer) {
        pMemoryAllocateNext(pointer.segment());
    }

    public static VmaPoolCreateInfo allocate(Arena arena) {
        return new VmaPoolCreateInfo(arena.allocate(LAYOUT));
    }

    public static VmaPoolCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaPoolCreateInfo[] ret = new VmaPoolCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaPoolCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaPoolCreateInfo clone(Arena arena, VmaPoolCreateInfo src) {
        VmaPoolCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaPoolCreateInfo[] clone(Arena arena, VmaPoolCreateInfo[] src) {
        VmaPoolCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryTypeIndex"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("blockSize"),
        NativeLayout.C_SIZE_T.withName("minBlockCount"),
        NativeLayout.C_SIZE_T.withName("maxBlockCount"),
        ValueLayout.JAVA_FLOAT.withName("priority"),
        ValueLayout.JAVA_LONG.withName("minAllocationAlignment"),
        ValueLayout.ADDRESS.withName("pMemoryAllocateNext")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$memoryTypeIndex = PathElement.groupElement("memoryTypeIndex");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$blockSize = PathElement.groupElement("blockSize");
    public static final PathElement PATH$minBlockCount = PathElement.groupElement("minBlockCount");
    public static final PathElement PATH$maxBlockCount = PathElement.groupElement("maxBlockCount");
    public static final PathElement PATH$priority = PathElement.groupElement("priority");
    public static final PathElement PATH$minAllocationAlignment = PathElement.groupElement("minAllocationAlignment");
    public static final PathElement PATH$pMemoryAllocateNext = PathElement.groupElement("pMemoryAllocateNext");

    public static final OfInt LAYOUT$memoryTypeIndex = (OfInt) LAYOUT.select(PATH$memoryTypeIndex);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$blockSize = (OfLong) LAYOUT.select(PATH$blockSize);
    public static final OfFloat LAYOUT$priority = (OfFloat) LAYOUT.select(PATH$priority);
    public static final OfLong LAYOUT$minAllocationAlignment = (OfLong) LAYOUT.select(PATH$minAllocationAlignment);
    public static final AddressLayout LAYOUT$pMemoryAllocateNext = (AddressLayout) LAYOUT.select(PATH$pMemoryAllocateNext);

    public static final long OFFSET$memoryTypeIndex = LAYOUT.byteOffset(PATH$memoryTypeIndex);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$blockSize = LAYOUT.byteOffset(PATH$blockSize);
    public static final long OFFSET$minBlockCount = LAYOUT.byteOffset(PATH$minBlockCount);
    public static final long OFFSET$maxBlockCount = LAYOUT.byteOffset(PATH$maxBlockCount);
    public static final long OFFSET$priority = LAYOUT.byteOffset(PATH$priority);
    public static final long OFFSET$minAllocationAlignment = LAYOUT.byteOffset(PATH$minAllocationAlignment);
    public static final long OFFSET$pMemoryAllocateNext = LAYOUT.byteOffset(PATH$pMemoryAllocateNext);

    public static final long SIZE$memoryTypeIndex = LAYOUT$memoryTypeIndex.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$blockSize = LAYOUT$blockSize.byteSize();
    public static final long SIZE$minBlockCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$maxBlockCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$priority = LAYOUT$priority.byteSize();
    public static final long SIZE$minAllocationAlignment = LAYOUT$minAllocationAlignment.byteSize();
    public static final long SIZE$pMemoryAllocateNext = LAYOUT$pMemoryAllocateNext.byteSize();
}

