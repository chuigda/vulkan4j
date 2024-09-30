package tech.icey.vk4j.buffer;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Long.BYTES;
    }

    public long read() {
        return segment.get(ValueLayout.JAVA_LONG, 0);
    }

    public void write(long value) {
        segment.set(ValueLayout.JAVA_LONG, 0, value);
    }

    public long read(long index) {
        return segment.get(ValueLayout.JAVA_LONG, index * Long.BYTES);
    }

    public void write(long index, long value) {
        segment.set(ValueLayout.JAVA_LONG, index * Long.BYTES, value);
    }

    @unsafe
    public LongBuffer reinterpret(long newSize) {
        return new LongBuffer(segment.reinterpret(newSize * Long.BYTES));
    }

    public LongBuffer offset(long offset) {
        return new LongBuffer(segment.asSlice(offset * Long.BYTES));
    }

    public static LongBuffer allocate(Arena arena) {
        return new LongBuffer(arena.allocate(ValueLayout.JAVA_LONG));
    }

    public static LongBuffer allocate(Arena arena, long size) {
        return new LongBuffer(arena.allocate(ValueLayout.JAVA_LONG, size));
    }

    public static LongBuffer allocate(Arena arena, long[] array) {
        return new LongBuffer(arena.allocateFrom(ValueLayout.JAVA_LONG, array));
    }

    public static LongBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Long.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_LONG, bytes.length / Long.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new LongBuffer(s);
    }
}
