package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.BytePtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.util.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ByteArray(MemorySegment segment) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    ByteArray allocate(A allocator, long size) {
        return new ByteArray(allocator.apply(ValueLayout.JAVA_BYTE, size));
    }

    public static ByteArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public int get(long index) {
        return segment.get(ValueLayout.JAVA_BYTE, index);
    }

    public void set(long index, byte value) {
        segment.set(ValueLayout.JAVA_BYTE, index, value);
    }

    public BytePtr ptr() {
        return new BytePtr(segment);
    }

    @unsafe
    public static ByteArray ofPtr(BytePtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, size);
        return new ByteArray(transmuted);
    }
}