package tech.icey.vk4j.buffer;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public record CLongBuffer(MemorySegment segment) {
    public long size() {
        return segment.byteSize() / NativeLayout.C_LONG_SIZE;
    }

    public long read() {
        return NativeLayout.readCLong(segment, 0);
    }

    public void write(long value) {
        NativeLayout.writeCLong(segment, 0, value);
    }

    public long read(long index) {
        return NativeLayout.readCLong(segment, index);
    }

    public void write(long index, long value) {
        NativeLayout.writeCLong(segment, index, value);
    }

    @unsafe
    public CLongBuffer reinterpret(long newSize) {
        return new CLongBuffer(segment.reinterpret(newSize * NativeLayout.C_LONG_SIZE));
    }

    public static CLongBuffer allocate(Arena arena) {
        return new CLongBuffer(arena.allocate(NativeLayout.C_LONG));
    }

    public static CLongBuffer allocate(Arena arena, long size) {
        return new CLongBuffer(arena.allocate(NativeLayout.C_LONG, size));
    }
}
