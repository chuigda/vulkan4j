package tech.icey.vk4j.buffer;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Integer.BYTES;
    }

    public int read() {
        return segment.get(ValueLayout.JAVA_INT, 0);
    }

    public void write(int value) {
        segment.set(ValueLayout.JAVA_INT, 0, value);
    }

    public int read(long index) {
        return segment.get(ValueLayout.JAVA_INT, index * Integer.BYTES);
    }

    public void write(long index, int value) {
        segment.set(ValueLayout.JAVA_INT, index * Integer.BYTES, value);
    }

    @unsafe
    public IntBuffer reinterpret(long newSize) {
        return new IntBuffer(segment.reinterpret(newSize * Integer.BYTES));
    }

    public IntBuffer offset(long offset) {
        return new IntBuffer(segment.asSlice(offset * Integer.BYTES));
    }

    public static IntBuffer allocate(Arena arena) {
        return new IntBuffer(arena.allocate(ValueLayout.JAVA_INT));
    }

    public static IntBuffer allocate(Arena arena, long size) {
        return new IntBuffer(arena.allocate(ValueLayout.JAVA_INT, size));
    }

    public static IntBuffer allocate(Arena arena, int[] array) {
        return new IntBuffer(arena.allocateFrom(ValueLayout.JAVA_INT, array));
    }

    public static IntBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Integer.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_INT, bytes.length / Integer.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new IntBuffer(s);
    }
}
