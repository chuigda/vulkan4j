package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.ShortPtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.util.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ShortArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    ShortArray allocate(A allocator, long size) {
        return new ShortArray(allocator.apply(ValueLayout.JAVA_SHORT, size), size);
    }

    public static ShortArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public short get(long index) {
        return segment.get(ValueLayout.JAVA_SHORT, index * ValueLayout.JAVA_SHORT.byteSize());
    }

    public void set(long index, short value) {
        segment.set(ValueLayout.JAVA_SHORT, index * ValueLayout.JAVA_SHORT.byteSize(), value);
    }

    public ShortPtr ptr() {
        return new ShortPtr(segment);
    }

    @unsafe
    public static ShortArray ofPtr(ShortPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, ValueLayout.JAVA_SHORT.byteSize() * size);
        return new ShortArray(transmuted, size);
    }
}