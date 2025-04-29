package cc.design7.panama.buffer;

import cc.design7.panama.IPointer;
import cc.design7.panama.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record LongBuffer(MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / Long.BYTES;
    }

    public long read() {
        return segment.get(ValueLayout.JAVA_LONG, 0);
    }

    public void write(long value) {
        segment.set(ValueLayout.JAVA_LONG, 0, value);
    }

    public long read(long index) {
        return segment.get(ValueLayout.JAVA_LONG, index * Long.BYTES);
    }

    public void write(long index, long value) {
        segment.set(ValueLayout.JAVA_LONG, index * Long.BYTES, value);
    }

    @unsafe
    public LongBuffer reinterpret(long newSize) {
        return new LongBuffer(segment.reinterpret(newSize * Long.BYTES));
    }

    public LongBuffer offset(long offset) {
        return new LongBuffer(segment.asSlice(offset * Long.BYTES));
    }

    public static LongBuffer allocate(Arena arena) {
        return new LongBuffer(arena.allocate(ValueLayout.JAVA_LONG));
    }

    public static LongBuffer allocate(Arena arena, long size) {
        return new LongBuffer(arena.allocate(ValueLayout.JAVA_LONG, size));
    }

    public static LongBuffer allocate(Arena arena, long[] array) {
        return new LongBuffer(arena.allocateFrom(ValueLayout.JAVA_LONG, array));
    }

    public static LongBuffer allocate(Arena arena, byte[] bytes) {
        assert bytes.length % Long.BYTES == 0;
        var s = arena.allocate(ValueLayout.JAVA_LONG, bytes.length / Long.BYTES);
        s.copyFrom(MemorySegment.ofArray(bytes));
        return new LongBuffer(s);
    }

    /// Allocate a new {@link LongBuffer} in the given {@link Arena} and copy the contents of the given
    /// {@link java.nio.LongBuffer} into the newly allocated {@link LongBuffer}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link LongBuffer} in
    /// @param buffer the {@link java.nio.LongBuffer} to copy the contents from
    /// @return a new {@link LongBuffer} that contains the contents of the given {@link java.nio.LongBuffer}
    public static LongBuffer allocate(Arena arena, java.nio.LongBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_LONG, buffer.capacity());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new LongBuffer(s);
    }

    /// Create a new {@link LongBuffer} using the same backing storage as the given {@link java.nio.LongBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, java.nio.LongBuffer)} method is
    /// that this method does not copy the contents of the given {@link java.nio.LongBuffer} into the newly allocated
    /// {@link LongBuffer}. Instead, the newly allocated {@link LongBuffer} will share the same backing storage as
    /// the given {@link java.nio.LongBuffer}. Please note that if the given {@link java.nio.LongBuffer} is not
    /// native/direct, the created {@link LongBuffer} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link java.nio.LongBuffer} to create a new {@link LongBuffer} from
    /// @return a new {@link LongBuffer} that uses the same backing storage as the given {@link java.nio.LongBuffer}
    @unsafe
    public static LongBuffer from(java.nio.LongBuffer buffer) {
        return new LongBuffer(MemorySegment.ofBuffer(buffer));
    }
}
