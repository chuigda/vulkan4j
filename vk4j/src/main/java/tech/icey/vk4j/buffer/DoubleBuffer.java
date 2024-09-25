package tech.icey.vk4j.buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DoubleBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / Double.BYTES;
    }

    public double read() {
        return read(0);
    }

    public void write(double value) {
        write(0, value);
    }

    public double read(long index) {
        return segment.get(ValueLayout.JAVA_DOUBLE, index * Double.BYTES);
    }

    public void write(long index, double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, index * Double.BYTES, value);
    }

    public DoubleBuffer reinterpret(long newSize) {
        return new DoubleBuffer(segment.reinterpret(newSize * Double.BYTES));
    }

    public static DoubleBuffer allocate(Arena arena) {
        return allocate(arena, 1);
    }

    public static DoubleBuffer allocate(Arena arena, long size) {
        return new DoubleBuffer(arena.allocate(ValueLayout.JAVA_DOUBLE, size));
    }
}
