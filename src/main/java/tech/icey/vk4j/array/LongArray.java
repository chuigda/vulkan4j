package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.LongPtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.util.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    LongArray allocate(A allocator, long size) {
        return new LongArray(allocator.apply(ValueLayout.JAVA_LONG, size), size);
    }

    public static LongArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
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

    @unsafe
    public static LongArray ofPtr(LongPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, ValueLayout.JAVA_LONG.byteSize() * size);
        return new LongArray(transmuted, size);
    }
}