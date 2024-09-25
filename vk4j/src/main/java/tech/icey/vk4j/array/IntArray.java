package tech.icey.vk4j.array;

import tech.icey.vk4j.annotation.unsafe;
import tech.icey.vk4j.ptr.IntPtr;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class IntArray extends IntPtr {
    private final long size;

    @unsafe(alt = "IntArray::allocate")
    public IntArray(MemorySegment segment, long size) {
        super(segment);
        this.size = size;
    }

    public long size() {
        return size;
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

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    IntArray allocate(A allocator, long size) {
        return new IntArray(allocator.apply(ValueLayout.JAVA_INT, size), size);
    }

    public static IntArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    @unsafe
    public static IntArray ofPtr(IntPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().reinterpret(size * ValueLayout.JAVA_INT.byteSize());
        return new IntArray(transmuted, size);
    }
}
