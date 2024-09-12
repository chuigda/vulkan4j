package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.DoublePtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.annotations.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DoubleArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    DoubleArray allocate(A allocator, long size) {
        return new DoubleArray(allocator.apply(ValueLayout.JAVA_DOUBLE, size), size);
    }

    public static DoubleArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public double get(long index) {
        return segment.get(ValueLayout.JAVA_DOUBLE, index * ValueLayout.JAVA_DOUBLE.byteSize());
    }

    public void set(long index, double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, index * ValueLayout.JAVA_DOUBLE.byteSize(), value);
    }

    public DoublePtr ptr() {
        return new DoublePtr(segment);
    }

    @unsafe
    public static DoubleArray ofPtr(DoublePtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, ValueLayout.JAVA_DOUBLE.byteSize() * size);
        return new DoubleArray(transmuted, size);
    }
}
