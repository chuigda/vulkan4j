package tech.icey.vk4j.ptr;

import tech.icey.vk4j.annotations.unsafe;
import tech.icey.vk4j.array.ByteArray;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public sealed class BytePtr permits ByteArray {
    protected final MemorySegment segment;

    @unsafe(safety = "The {@code segment} must have at least 1 byte")
    public BytePtr(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment segment() {
        return segment;
    }

    public byte read() {
        return segment.get(ValueLayout.JAVA_BYTE, 0);
    }

    public void write(byte value) {
        segment.set(ValueLayout.JAVA_BYTE, 0, value);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    BytePtr allocate(A allocator) {
        return new BytePtr(allocator.apply(ValueLayout.JAVA_BYTE, 1L));
    }

    public static BytePtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }
}
