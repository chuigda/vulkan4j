package tech.icey.vk4j.buffer;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record ByteBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize();
    }

    public byte read() {
        return segment.get(ValueLayout.JAVA_BYTE, 0);
    }

    public void write(byte value) {
        segment.set(ValueLayout.JAVA_BYTE, 0, value);
    }

    public byte read(long index) {
        return segment.get(ValueLayout.JAVA_BYTE, index);
    }

    public void write(long index, byte value) {
        segment.set(ValueLayout.JAVA_BYTE, index, value);
    }

    /// Note: this function is unsafe because it technically cannot do any boundary. It just assumes that the pointed
    /// memory is a null-terminated string and reads it until the first null byte.
    @unsafe
    public String readString() {
        MemorySegment reinterpreted = segment.reinterpret(Long.MAX_VALUE);
        return reinterpreted.getString(0);
    }

    @unsafe
    public ByteBuffer reinterpret(long newSize) {
        return new ByteBuffer(segment.reinterpret(newSize));
    }

    public ByteBuffer offset(long offset) {
        return new ByteBuffer(segment.asSlice(offset));
    }

    public static ByteBuffer allocate(Arena arena) {
        return new ByteBuffer(arena.allocate(1));
    }

    public static ByteBuffer allocate(Arena arena, long size) {
        return new ByteBuffer(arena.allocate(size));
    }

    public static ByteBuffer allocate(Arena arena, byte[] bytes) {
        return new ByteBuffer(arena.allocateFrom(ValueLayout.JAVA_BYTE, bytes));
    }

    /// Allocate a new {@link ByteBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.ByteBuffer} into the newly allocated {@link ByteBuffer}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link ByteBuffer} in
    /// @param buffer the {@link java.nio.ByteBuffer} to copy the contents from
    /// @return a new {@link ByteBuffer} that contains the contents of the given {@link java.nio.ByteBuffer}
    public static ByteBuffer allocate(Arena arena, java.nio.ByteBuffer buffer) {
        var s = arena.allocate(buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new ByteBuffer(s);
    }

    public static ByteBuffer allocateAligned(Arena arena, long size, long alignment) {
        return new ByteBuffer(arena.allocate(size, alignment));
    }

    public static ByteBuffer allocateString(Arena arena, String s) {
        return new ByteBuffer(arena.allocateFrom(s));
    }

    /// Create a new {@link ByteBuffer} using the same backing storage as the given {@link java.nio.ByteBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.ByteBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.ByteBuffer} into the newly allocated
    /// {@link ByteBuffer}. Instead, the newly created {@link ByteBuffer} will use the same backing storage as the
    /// given {@link java.nio.ByteBuffer}. Please note that if the given {@link java.nio.ByteBuffer} is not
    /// native/direct, the created {@link ByteBuffer} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link java.nio.ByteBuffer} to use as the backing storage
    /// @return a new {@link ByteBuffer} that uses the given {@link java.nio.ByteBuffer} as its backing storage
    @unsafe
    public static ByteBuffer from(java.nio.ByteBuffer buffer) {
        return new ByteBuffer(MemorySegment.ofBuffer(buffer));
    }
}
