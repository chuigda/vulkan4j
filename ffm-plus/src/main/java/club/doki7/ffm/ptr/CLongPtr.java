package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

@ValueBasedCandidate
@UnsafeConstructor
public record CLongPtr(MemorySegment segment) implements IPointer {
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

    @Unsafe
    public CLongPtr reinterpret(long newSize) {
        return new CLongPtr(segment.reinterpret(newSize * NativeLayout.C_LONG_SIZE));
    }

    public static CLongPtr allocate(Arena arena) {
        return new CLongPtr(arena.allocate(NativeLayout.C_LONG));
    }

    public static CLongPtr allocate(Arena arena, long size) {
        return new CLongPtr(arena.allocate(NativeLayout.C_LONG, size));
    }
}
