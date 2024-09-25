package tech.icey.vk4j.buffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / Long.BYTES;
    }

    public long read() {
        return read(0);
    }

    public void write(long value) {
        write(0, value);
    }

    public long read(long index) {
        return segment.get(ValueLayout.JAVA_LONG, index * Long.BYTES);
    }

    public void write(long index, long value) {
        segment.set(ValueLayout.JAVA_LONG, index * Long.BYTES, value);
    }

    public LongBuffer reinterpret(long newSize) {
        return new LongBuffer(segment.reinterpret(newSize * Long.BYTES));
    }

    public static LongBuffer allocate(Arena arena) {
        return allocate(arena, 1);
    }

    public static LongBuffer allocate(Arena arena, long size) {
        return new LongBuffer(arena.allocate(ValueLayout.JAVA_LONG, size));
    }
}
