package tech.icey.vk4j.ptr;

import tech.icey.vk4j.annotation.unsafe;
import tech.icey.vk4j.array.ByteArray;
import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public sealed class BytePtr permits ByteArray {
    protected final MemorySegment segment;

    @unsafe(alt = "BytePtr::allocate")
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

    @unsafe
    public String readUtf8() {
        return segment.reinterpret(Long.MAX_VALUE).getString(0);
    }

    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    BytePtr allocate(A allocator) {
        return new BytePtr(allocator.apply(ValueLayout.JAVA_BYTE, 1L));
    }

    public static BytePtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }
}
