package tech.icey.vk4j.buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ShortBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / Short.BYTES;
    }

    public short read() {
        return segment.get(ValueLayout.JAVA_SHORT, 0);
    }

    public void write(short value) {
        segment.set(ValueLayout.JAVA_SHORT, 0, value);
    }

    public short read(long index) {
        return segment.get(ValueLayout.JAVA_SHORT, index * Short.BYTES);
    }

    public void write(long index, short value) {
        segment.set(ValueLayout.JAVA_SHORT, index * Short.BYTES, value);
    }

    public ShortBuffer reinterpret(long newSize) {
        return new ShortBuffer(segment.reinterpret(newSize * Short.BYTES));
    }

    public static ShortBuffer allocate(Arena arena) {
        return new ShortBuffer(arena.allocate(ValueLayout.JAVA_SHORT));
    }

    public static ShortBuffer allocate(Arena arena, long size) {
        return new ShortBuffer(arena.allocate(ValueLayout.JAVA_SHORT, size));
    }
}
