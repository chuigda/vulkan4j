package tech.icey.vk4j.buffer;

import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ByteBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize();
    }

    public byte read() {
        return read(0);
    }

    public void write(byte value) {
        write(0, value);
    }

    public byte read(long index) {
        return segment.get(ValueLayout.JAVA_BYTE, index);
    }

    public void write(long index, byte value) {
        segment.set(ValueLayout.JAVA_BYTE, index, value);
    }

    @unsafe
    public String readString() {
        MemorySegment reinterpreted = segment.reinterpret(Long.MAX_VALUE);
        return reinterpreted.getString(0);
    }

    public ByteBuffer reinterpret(long newSize) {
        return new ByteBuffer(segment.reinterpret(newSize));
    }

    public ByteBuffer allocate(Arena arena) {
        return new ByteBuffer(arena.allocate(1));
    }

    public ByteBuffer allocate(Arena arena, long size) {
        return new ByteBuffer(arena.allocate(size));
    }

    public static ByteBuffer allocateUtf8(Arena arena, String s) {
        return new ByteBuffer(arena.allocateFrom(s));
    }
}
