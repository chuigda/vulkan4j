package tech.icey.vk4j.ptr;

import tech.icey.vk4j.annotations.unsafe;
import tech.icey.vk4j.array.ShortArray;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public sealed class ShortPtr permits ShortArray {
    protected final MemorySegment segment;

    @unsafe(alt = "ShortPtr::allocate")
    public ShortPtr(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment segment() {
        return segment;
    }

    public short read() {
        return segment.get(ValueLayout.JAVA_SHORT, 0);
    }

    public void write(short value) {
        segment.set(ValueLayout.JAVA_SHORT, 0, value);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    ShortPtr allocate(A allocator) {
        return new ShortPtr(allocator.apply(ValueLayout.JAVA_SHORT, 1L));
    }

    public static ShortPtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }
}
