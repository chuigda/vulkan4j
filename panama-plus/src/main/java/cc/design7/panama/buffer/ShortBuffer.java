package cc.design7.panama.buffer;

import cc.design7.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ShortBuffer(MemorySegment segment) implements IPointer {
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
    public ShortBuffer reinterpret(long newSize) {
        return new ShortBuffer(segment.reinterpret(newSize * Short.BYTES));
    }

    public ShortBuffer offset(long offset) {
        return new ShortBuffer(segment.asSlice(offset * Short.BYTES));
    }

    public static ShortBuffer allocate(Arena arena) {
        return new ShortBuffer(arena.allocate(ValueLayout.JAVA_SHORT));
    }

    public static ShortBuffer allocate(Arena arena, long size) {
        return new ShortBuffer(arena.allocate(ValueLayout.JAVA_SHORT, size));
    }

    public static ShortBuffer allocate(Arena arena, short[] array) {
        return new ShortBuffer(arena.allocateFrom(ValueLayout.JAVA_SHORT, array));
    }

    public static ShortBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Short.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_SHORT, bytes.length / Short.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new ShortBuffer(s);
    }

    /// Allocate a new {@link ShortBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.ShortBuffer} into the newly allocated {@link ShortBuffer}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link ShortBuffer} in
    /// @param buffer the {@link java.nio.ShortBuffer} to copy the contents from
    /// @return a new {@link ShortBuffer} that contains the contents of the given {@link java.nio.ShortBuffer}
    public static ShortBuffer allocate(Arena arena, java.nio.ShortBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_SHORT, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new ShortBuffer(s);
    }

    /// Create a new {@link ShortBuffer} using the same backing storage as the given {@link java.nio.ShortBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.ShortBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.ShortBuffer} into a newly allocated
    /// {@link ShortBuffer}. Instead, this method creates a new {@link ShortBuffer} that uses the same backing storage
    /// as the given {@link java.nio.ShortBuffer}. Please note that if the given {@link java.nio.ShortBuffer} is not
    /// native/direct, the created {@link ShortBuffer} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link java.nio.ShortBuffer} to use as the backing storage
    /// @return a new {@link ShortBuffer} that uses the given {@link java.nio.ShortBuffer} as its backing storage
    @unsafe
    public static ShortBuffer from(java.nio.ShortBuffer buffer) {
        return new ShortBuffer(MemorySegment.ofBuffer(buffer));
    }
}
