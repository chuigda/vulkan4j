package tech.icey.vk4j.ptr;

import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatPtr(MemorySegment segment) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    FloatPtr allocate(A allocator) {
        return new FloatPtr(allocator.apply(ValueLayout.JAVA_FLOAT, 1L));
    }

    public static FloatPtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }

    public float read() {
        return segment.get(ValueLayout.JAVA_FLOAT, 0);
    }

    public void write(float value) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, value);
    }
}
