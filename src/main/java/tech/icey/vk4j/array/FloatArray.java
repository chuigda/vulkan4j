package tech.icey.vk4j.array;

import tech.icey.vk4j.ptr.FloatPtr;
import tech.icey.vk4j.util.Function2;
import tech.icey.vk4j.annotations.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatArray(MemorySegment segment, long size) {
    public static <A extends Function2<MemoryLayout, Long, MemorySegment>>
    FloatArray allocate(A allocator, long size) {
        return new FloatArray(allocator.apply(ValueLayout.JAVA_FLOAT, size), size);
    }

    public static FloatArray allocate(Arena arena, long size) {
        return allocate(arena::allocate, size);
    }

    public float get(long index) {
        return segment.get(ValueLayout.JAVA_FLOAT, index * ValueLayout.JAVA_FLOAT.byteSize());
    }

    public void set(long index, float value) {
        segment.set(ValueLayout.JAVA_FLOAT, index * ValueLayout.JAVA_FLOAT.byteSize(), value);
    }

    public FloatPtr ptr() {
        return new FloatPtr(segment);
    }

    @unsafe
    public static FloatArray ofPtr(FloatPtr ptr, long size) {
        MemorySegment transmuted = ptr.segment().asSlice(0, ValueLayout.JAVA_FLOAT.byteSize() * size);
        return new FloatArray(transmuted, size);
    }
}
