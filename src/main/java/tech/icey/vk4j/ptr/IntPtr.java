package tech.icey.vk4j.ptr;

import tech.icey.vk4j.util.Function2;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntPtr(MemorySegment segment) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    IntPtr allocate(A allocator) {
        return new IntPtr(allocator.apply(ValueLayout.JAVA_INT, 1L));
    }

    public static IntPtr allocate(Arena arena) {
        return allocate(arena::allocate);
    }

    public int read() {
        return segment.get(ValueLayout.JAVA_INT, 0);
    }

    public void write(int value) {
        segment.set(ValueLayout.JAVA_INT, 0, value);
    }
}
