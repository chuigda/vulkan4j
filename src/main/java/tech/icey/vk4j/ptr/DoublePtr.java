package tech.icey.vk4j.ptr;

import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DoublePtr(MemorySegment segment) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    DoublePtr allocate(A allocator) {
        return new DoublePtr(allocator.apply(ValueLayout.JAVA_DOUBLE, 1L));
    }

    public static DoublePtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }

    public double read() {
        return segment.get(ValueLayout.JAVA_DOUBLE, 0);
    }

    public void write(double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, value);
    }
}
