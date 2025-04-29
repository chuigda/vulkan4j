package cc.design7.panama.buffer;

import cc.design7.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record PointerBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
    }

    public MemorySegment read() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public void write(MemorySegment value) {
        segment.set(ValueLayout.ADDRESS, 0, value);
    }

    public void write(IPointer pointer) {
        write(pointer.segment());
    }

    public MemorySegment read(long index) {
        return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
    }

    public void write(long index, MemorySegment value) {
        segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
    }

    public void write(long index, IPointer pointer) {
        write(index, pointer.segment());
    }

    @unsafe
    public PointerBuffer reinterpret(long newSize) {
        return new PointerBuffer(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
    }

    public static PointerBuffer allocate(Arena arena) {
        return new PointerBuffer(arena.allocate(ValueLayout.ADDRESS));
    }

    public static PointerBuffer allocate(Arena arena, long size) {
        return new PointerBuffer(arena.allocate(ValueLayout.ADDRESS, size));
    }
}
