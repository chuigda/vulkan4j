package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.annotations.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    IntArray allocate(A allocator, long size) {
        return new IntArray(allocator.apply(ValueLayout.JAVA_INT, size), size);
    }

    public static IntArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public int get(long index) {
        return segment.get(ValueLayout.JAVA_INT, index * ValueLayout.JAVA_INT.byteSize());
    }

    public void set(long index, int value) {
        segment.set(ValueLayout.JAVA_INT, index * ValueLayout.JAVA_INT.byteSize(), value);
    }

    public IntPtr ptr() {
        return new IntPtr(segment);
    }

    @unsafe
    public static IntArray ofPtr(IntPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, ValueLayout.JAVA_INT.byteSize() * size);
        return new IntArray(transmuted, size);
    }
}
