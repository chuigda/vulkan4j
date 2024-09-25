package tech.icey.vk4j.buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / Float.BYTES;
    }

    public float read() {
        return read(0);
    }

    public void write(float value) {
        write(0, value);
    }

    public float read(long index) {
        return segment.get(ValueLayout.JAVA_FLOAT, index * Float.BYTES);
    }

    public void write(long index, float value) {
        segment.set(ValueLayout.JAVA_FLOAT, index * Float.BYTES, value);
    }

    public FloatBuffer reinterpret(long newSize) {
        return new FloatBuffer(segment.reinterpret(newSize * Float.BYTES));
    }

    public static FloatBuffer allocate(Arena arena) {
        return allocate(arena, 1);
    }

    public static FloatBuffer allocate(Arena arena, long size) {
        return new FloatBuffer(arena.allocate(ValueLayout.JAVA_FLOAT, size));
    }
}
