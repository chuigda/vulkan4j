package cc.design7.panama.buffer;

import cc.design7.panama.IPointer;
import tech.icey.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record FloatBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Float.BYTES;
    }

    public float read() {
        return segment.get(ValueLayout.JAVA_FLOAT, 0);
    }

    public void write(float value) {
        segment.set(ValueLayout.JAVA_FLOAT, 0, value);
    }

    public float read(long index) {
        return segment.get(ValueLayout.JAVA_FLOAT, index * Float.BYTES);
    }

    public void write(long index, float value) {
        segment.set(ValueLayout.JAVA_FLOAT, index * Float.BYTES, value);
    }

    @unsafe
    public FloatBuffer reinterpret(long newSize) {
        return new FloatBuffer(segment.reinterpret(newSize * Float.BYTES));
    }

    public FloatBuffer offset(long offset) {
        return new FloatBuffer(segment.asSlice(offset * Float.BYTES));
    }

    public static FloatBuffer allocate(Arena arena) {
        return new FloatBuffer(arena.allocate(ValueLayout.JAVA_FLOAT));
    }

    public static FloatBuffer allocate(Arena arena, long size) {
        return new FloatBuffer(arena.allocate(ValueLayout.JAVA_FLOAT, size));
    }

    public static FloatBuffer allocate(Arena arena, float[] array) {
        return new FloatBuffer(arena.allocateFrom(ValueLayout.JAVA_FLOAT, array));
    }

    public static FloatBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Float.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_FLOAT, bytes.length / Float.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new FloatBuffer(s);
    }

    /// Allocate a new {@link FloatBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.FloatBuffer} into the newly allocated {@link FloatBuffer}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link FloatBuffer} in
    /// @param buffer the {@link java.nio.FloatBuffer} to copy the contents from
    /// @return a new {@link FloatBuffer} that contains the contents of the given {@link java.nio.FloatBuffer}
    public static FloatBuffer allocate(Arena arena, java.nio.FloatBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_FLOAT, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new FloatBuffer(s);
    }

    /// Create a new {@link FloatBuffer} using the same backing storage as the given {@link java.nio.FloatBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.FloatBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.FloatBuffer} into a newly allocated
    /// {@link FloatBuffer}. Instead, this method creates a new {@link FloatBuffer} that uses the same backing storage
    /// as the given {@link java.nio.FloatBuffer}. Please note that if the given {@link java.nio.FloatBuffer} is not
    /// native/direct, the created {@link FloatBuffer} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link java.nio.FloatBuffer} to use for the backing storage
    /// @return a new {@link FloatBuffer} that uses the given {@link java.nio.FloatBuffer} as its backing storage
    @unsafe
    public static FloatBuffer from(java.nio.FloatBuffer buffer) {
        return new FloatBuffer(MemorySegment.ofBuffer(buffer));
    }
}
