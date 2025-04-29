package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.ByteBuffer;

@ValueBasedCandidate
public record BytePtr(MemorySegment segment) implements IPointer {
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
    public BytePtr reinterpret(long newSize) {
        return new BytePtr(segment.reinterpret(newSize));
    }

    public BytePtr offset(long offset) {
        return new BytePtr(segment.asSlice(offset));
    }

    public static BytePtr allocate(Arena arena) {
        return new BytePtr(arena.allocate(1));
    }

    public static BytePtr allocate(Arena arena, long size) {
        return new BytePtr(arena.allocate(size));
    }

    public static BytePtr allocate(Arena arena, byte[] bytes) {
        return new BytePtr(arena.allocateFrom(ValueLayout.JAVA_BYTE, bytes));
    }

    /// Allocate a new {@link BytePtr} in the given {@link Arena} and copy the contents of the given
    /// {@link ByteBuffer} into the newly allocated {@link BytePtr}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link BytePtr} in
    /// @param buffer the {@link ByteBuffer} to copy the contents from
    /// @return a new {@link BytePtr} that contains the contents of the given {@link ByteBuffer}
    public static BytePtr allocate(Arena arena, ByteBuffer buffer) {
        var s = arena.allocate(buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new BytePtr(s);
    }

    public static BytePtr allocateAligned(Arena arena, long size, long alignment) {
        return new BytePtr(arena.allocate(size, alignment));
    }

    public static BytePtr allocateString(Arena arena, String s) {
        return new BytePtr(arena.allocateFrom(s));
    }

    /// Create a new {@link BytePtr} using the same backing storage as the given {@link ByteBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, ByteBuffer)} method is
    /// that this method does not copy the contents of the given {@link ByteBuffer} into the newly allocated
    /// {@link BytePtr}. Instead, the newly created {@link BytePtr} will use the same backing storage as the
    /// given {@link ByteBuffer}. Please note that if the given {@link ByteBuffer} is not
    /// native/direct, the created {@link BytePtr} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link ByteBuffer} to use as the backing storage
    /// @return a new {@link BytePtr} that uses the given {@link ByteBuffer} as its backing storage
    @unsafe
    public static BytePtr from(ByteBuffer buffer) {
        return new BytePtr(MemorySegment.ofBuffer(buffer));
    }
}
