package tech.icey.vk4j.ptr;

import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongPtr(MemorySegment segment) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    LongPtr allocate(A allocator) {
        return new LongPtr(allocator.apply(ValueLayout.JAVA_LONG, 1L));
    }

    public static LongPtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }

    public long read() {
        return segment.get(ValueLayout.JAVA_LONG, 0);
    }

    public void write(long value) {
        segment.set(ValueLayout.JAVA_LONG, 0, value);
    }
}
