package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.LongPtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.annotations.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class LongArray extends LongPtr {
    private final long size;

    @unsafe(alt = "LongArray::allocate")
    public LongArray(MemorySegment segment, long size) {
        super(segment);
        this.size = size;
    }

    public long size() {
        return size;
    }

    public long get(long index) {
        return segment.get(ValueLayout.JAVA_LONG, index * ValueLayout.JAVA_LONG.byteSize());
    }

    public void set(long index, long value) {
        segment.set(ValueLayout.JAVA_LONG, index * ValueLayout.JAVA_LONG.byteSize(), value);
    }

    public LongPtr ptr() {
        return new LongPtr(segment);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    LongArray allocate(A allocator, long size) {
        return new LongArray(allocator.apply(ValueLayout.JAVA_LONG, size), size);
    }

    public static LongArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    @unsafe
    public static LongArray ofPtr(LongPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().reinterpret(size * ValueLayout.JAVA_LONG.byteSize());
        return new LongArray(transmuted, size);
    }
}
