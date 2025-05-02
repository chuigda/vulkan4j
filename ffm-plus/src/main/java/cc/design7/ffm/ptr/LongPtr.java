package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.UnsafeConstructor;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.LongBuffer;

@ValueBasedCandidate
@UnsafeConstructor
public record LongPtr(MemorySegment segment) implements IPointer {
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
    public LongPtr reinterpret(long newSize) {
        return new LongPtr(segment.reinterpret(newSize * Long.BYTES));
    }

    public LongPtr offset(long offset) {
        return new LongPtr(segment.asSlice(offset * Long.BYTES));
    }

    public static LongPtr allocate(Arena arena) {
        return new LongPtr(arena.allocate(ValueLayout.JAVA_LONG));
    }

    public static LongPtr allocate(Arena arena, long size) {
        return new LongPtr(arena.allocate(ValueLayout.JAVA_LONG, size));
    }

    public static LongPtr allocate(Arena arena, long[] array) {
        return new LongPtr(arena.allocateFrom(ValueLayout.JAVA_LONG, array));
    }

    /// Allocate a new {@link LongPtr} in the given {@link Arena} and copy the contents of the given
    /// {@link LongBuffer} into the newly allocated {@link LongPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param arena the {@link Arena} to allocate the new {@link LongPtr} in
    /// @param buffer the {@link LongBuffer} to copy the contents from
    /// @return a new {@link LongPtr} that contains the contents of the given {@link LongBuffer}
    public static LongPtr allocate(Arena arena, LongBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_LONG, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new LongPtr(s);
    }

    /// Create a new {@link LongPtr} using the same backing storage as the given {@link LongBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, LongBuffer)} method is
    /// that this method does not copy the contents of the given {@link LongBuffer} into the newly allocated
    /// {@link LongPtr}. Instead, the newly allocated {@link LongPtr} will share the same backing storage as
    /// the given {@link LongBuffer}. Please note that if the given {@link LongBuffer} is not
    /// native/direct, the created {@link LongPtr} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param buffer the {@link LongBuffer} to create a new {@link LongPtr} from
    /// @return a new {@link LongPtr} that uses the same backing storage as the given {@link LongBuffer}
    @unsafe
    public static LongPtr from(LongBuffer buffer) {
        return new LongPtr(MemorySegment.ofBuffer(buffer));
    }
}
