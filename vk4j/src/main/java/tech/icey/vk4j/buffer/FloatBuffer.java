package tech.icey.vk4j.buffer;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Float.BYTES;
    }

    public float read() {
        return segment.get(ValueLayout.JAVA_FLOAT, 0);
    }

    public void write(float value) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, value);
    }

    public float read(long index) {
        return segment.get(ValueLayout.JAVA_FLOAT, index * Float.BYTES);
    }

    public void write(long index, float value) {
        segment.set(ValueLayout.JAVA_FLOAT, index * Float.BYTES, value);
    }

    @unsafe
    public FloatBuffer reinterpret(long newSize) {
        return new FloatBuffer(segment.reinterpret(newSize * Float.BYTES));
    }

    public FloatBuffer offset(long offset) {
        return new FloatBuffer(segment.asSlice(offset * Float.BYTES));
    }

    public static FloatBuffer allocate(Arena arena) {
        return new FloatBuffer(arena.allocate(ValueLayout.JAVA_FLOAT));
    }

    public static FloatBuffer allocate(Arena arena, long size) {
        return new FloatBuffer(arena.allocate(ValueLayout.JAVA_FLOAT, size));
    }

    public static FloatBuffer allocate(Arena arena, float[] array) {
        return new FloatBuffer(arena.allocateFrom(ValueLayout.JAVA_FLOAT, array));
    }

    public static FloatBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Float.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_FLOAT, bytes.length / Float.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new FloatBuffer(s);
    }
}
