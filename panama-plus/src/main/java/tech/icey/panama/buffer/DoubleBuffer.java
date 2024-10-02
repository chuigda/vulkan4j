package tech.icey.panama.buffer;

import tech.icey.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record DoubleBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Double.BYTES;
    }

    public double read() {
        return segment.get(ValueLayout.JAVA_DOUBLE, 0);
    }

    public void write(double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, 0, value);
    }

    public double read(long index) {
        return segment.get(ValueLayout.JAVA_DOUBLE, index * Double.BYTES);
    }

    public void write(long index, double value) {
        segment.set(ValueLayout.JAVA_DOUBLE, index * Double.BYTES, value);
    }

    @unsafe
    public DoubleBuffer reinterpret(long newSize) {
        return new DoubleBuffer(segment.reinterpret(newSize * Double.BYTES));
    }

    public DoubleBuffer offset(long offset) {
        return new DoubleBuffer(segment.asSlice(offset * Double.BYTES));
    }

    public static DoubleBuffer allocate(Arena arena) {
        return new DoubleBuffer(arena.allocate(ValueLayout.JAVA_DOUBLE));
    }

    public static DoubleBuffer allocate(Arena arena, long size) {
        return new DoubleBuffer(arena.allocate(ValueLayout.JAVA_DOUBLE, size));
    }

    public static DoubleBuffer allocate(Arena arena, double[] array) {
        return new DoubleBuffer(arena.allocateFrom(ValueLayout.JAVA_DOUBLE, array));
    }

    public static DoubleBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Double.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_DOUBLE, bytes.length / Double.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new DoubleBuffer(s);
    }

    /// Allocate a new {@link DoubleBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.DoubleBuffer} into the newly allocated {@link DoubleBuffer}.
    ///
    /// @param arena The {@link Arena} to allocate the new {@link DoubleBuffer} in
    /// @param buffer The {@link java.nio.DoubleBuffer} to copy the contents from
    /// @return A new {@link DoubleBuffer} that contains the contents of the given {@link java.nio.DoubleBuffer}
    public static DoubleBuffer allocate(Arena arena, java.nio.DoubleBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_DOUBLE, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new DoubleBuffer(s);
    }

    /// Create a new {@link DoubleBuffer} using the same backing storage as the given {@link java.nio.DoubleBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.DoubleBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.DoubleBuffer} into the newly allocated
    /// {@link DoubleBuffer}. Instead, the newly allocated {@link DoubleBuffer} will share the same backing storage as
    /// the given {@link java.nio.DoubleBuffer}. Please note that if the given {@link java.nio.DoubleBuffer} is not
    /// native/direct, the created {@link DoubleBuffer} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer The {@link java.nio.DoubleBuffer} to use as the backing storage
    /// @return A new {@link DoubleBuffer} that uses the given {@link java.nio.DoubleBuffer} as its backing storage
    @unsafe
    public static DoubleBuffer from(java.nio.DoubleBuffer buffer) {
        return new DoubleBuffer(MemorySegment.ofBuffer(buffer));
    }
}
