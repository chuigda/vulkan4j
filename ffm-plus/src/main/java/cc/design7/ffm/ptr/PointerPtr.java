package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

@ValueBasedCandidate
public record PointerPtr(MemorySegment segment) implements IPointer {
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
    public PointerPtr reinterpret(long newSize) {
        return new PointerPtr(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
    }

    public static PointerPtr allocate(Arena arena) {
        return new PointerPtr(arena.allocate(ValueLayout.ADDRESS));
    }

    public static PointerPtr allocate(Arena arena, long size) {
        return new PointerPtr(arena.allocate(ValueLayout.ADDRESS, size));
    }
}
