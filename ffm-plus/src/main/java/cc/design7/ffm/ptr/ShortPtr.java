package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.ShortBuffer;

@ValueBasedCandidate
public record ShortPtr(MemorySegment segment) implements IPointer {
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

    @unsafe
    public ShortPtr reinterpret(long newSize) {
        return new ShortPtr(segment.reinterpret(newSize * Short.BYTES));
    }

    public ShortPtr offset(long offset) {
        return new ShortPtr(segment.asSlice(offset * Short.BYTES));
    }

    public static ShortPtr allocate(Arena arena) {
        return new ShortPtr(arena.allocate(ValueLayout.JAVA_SHORT));
    }

    public static ShortPtr allocate(Arena arena, long size) {
        return new ShortPtr(arena.allocate(ValueLayout.JAVA_SHORT, size));
    }

    public static ShortPtr allocate(Arena arena, short[] array) {
        return new ShortPtr(arena.allocateFrom(ValueLayout.JAVA_SHORT, array));
    }

    public static ShortPtr allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Short.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_SHORT, bytes.length / Short.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new ShortPtr(s);
    }

    /// Allocate a new {@link ShortPtr} in the given {@link Arena} and copy the contents of the given
    /// {@link ShortBuffer} into the newly allocated {@link ShortPtr}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link ShortPtr} in
    /// @param buffer the {@link ShortBuffer} to copy the contents from
    /// @return a new {@link ShortPtr} that contains the contents of the given {@link ShortBuffer}
    public static ShortPtr allocate(Arena arena, ShortBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_SHORT, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new ShortPtr(s);
    }

    /// Create a new {@link ShortPtr} using the same backing storage as the given {@link ShortBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, ShortBuffer)} method is
    /// that this method does not copy the contents of the given {@link ShortBuffer} into a newly allocated
    /// {@link ShortPtr}. Instead, this method creates a new {@link ShortPtr} that uses the same backing storage
    /// as the given {@link ShortBuffer}. Please note that if the given {@link ShortBuffer} is not
    /// native/direct, the created {@link ShortPtr} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link ShortBuffer} to use as the backing storage
    /// @return a new {@link ShortPtr} that uses the given {@link ShortBuffer} as its backing storage
    @unsafe
    public static ShortPtr from(ShortBuffer buffer) {
        return new ShortPtr(MemorySegment.ofBuffer(buffer));
    }
}
