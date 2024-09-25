package tech.icey.vk4j.buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / Integer.BYTES;
    }

    public int read() {
        return read(0);
    }

    public void write(int value) {
        write(0, value);
    }

    public int read(long index) {
        return segment.get(ValueLayout.JAVA_INT, index * Integer.BYTES);
    }

    public void write(long index, int value) {
        segment.set(ValueLayout.JAVA_INT, index * Integer.BYTES, value);
    }

    public IntBuffer reinterpret(long newSize) {
        return new IntBuffer(segment.reinterpret(newSize * Integer.BYTES));
    }

    public static IntBuffer allocate(Arena arena) {
        return allocate(arena, 1);
    }

    public static IntBuffer allocate(Arena arena, long size) {
        return new IntBuffer(arena.allocate(ValueLayout.JAVA_INT, size));
    }
}
