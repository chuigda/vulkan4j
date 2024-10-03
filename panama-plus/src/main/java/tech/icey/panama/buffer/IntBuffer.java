package tech.icey.panama.buffer;

import tech.icey.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record IntBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Integer.BYTES;
    }

    public int read() {
        return segment.get(ValueLayout.JAVA_INT, 0);
    }

    public void write(int value) {
        segment.set(ValueLayout.JAVA_INT, 0, value);
    }

    public int read(long index) {
        return segment.get(ValueLayout.JAVA_INT, index * Integer.BYTES);
    }

    public void write(long index, int value) {
        segment.set(ValueLayout.JAVA_INT, index * Integer.BYTES, value);
    }

    @unsafe
    public IntBuffer reinterpret(long newSize) {
        return new IntBuffer(segment.reinterpret(newSize * Integer.BYTES));
    }

    public IntBuffer offset(long offset) {
        return new IntBuffer(segment.asSlice(offset * Integer.BYTES));
    }

    public static IntBuffer allocate(Arena arena) {
        return new IntBuffer(arena.allocate(ValueLayout.JAVA_INT));
    }

    public static IntBuffer allocate(Arena arena, long size) {
        return new IntBuffer(arena.allocate(ValueLayout.JAVA_INT, size));
    }

    public static IntBuffer allocate(Arena arena, int[] array) {
        return new IntBuffer(arena.allocateFrom(ValueLayout.JAVA_INT, array));
    }

    public static IntBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Integer.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_INT, bytes.length / Integer.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new IntBuffer(s);
    }

    /// Allocate a new {@link IntBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.IntBuffer} into the newly allocated {@link IntBuffer}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link IntBuffer} in
    /// @param buffer the {@link java.nio.IntBuffer} to copy the contents from
    /// @return a new {@link IntBuffer} that contains the contents of the given {@link java.nio.IntBuffer}
    public static IntBuffer allocate(Arena arena, java.nio.IntBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_INT, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new IntBuffer(s);
    }

    /// Create a new {@link IntBuffer} using the same backing storage as the given {@link java.nio.IntBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.IntBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.IntBuffer} into a newly created
    /// {@link IntBuffer}. Instead, the newly created {@link IntBuffer} will use the same backing storage as the
    /// given {@link java.nio.IntBuffer}. Please note that if the given {@link java.nio.IntBuffer} is not
    /// native/direct, the newly created {@link IntBuffer}  will not be able to be used in FFI operations since the
    /// backing storage does not reside in native memory and does not have a native address. Thus, this method is marked
    /// as {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link java.nio.IntBuffer} to use as the backing storage
    /// @return a new {@link IntBuffer} that uses the given {@link java.nio.IntBuffer} as its backing storage
    @unsafe
    public static IntBuffer from(java.nio.IntBuffer buffer) {
        return new IntBuffer(MemorySegment.ofBuffer(buffer));
    }
}
