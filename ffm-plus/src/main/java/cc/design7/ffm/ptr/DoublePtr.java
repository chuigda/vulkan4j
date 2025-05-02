package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.UnsafeConstructor;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.DoubleBuffer;

@ValueBasedCandidate
@UnsafeConstructor
public record DoublePtr(MemorySegment segment) implements IPointer {
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
    public DoublePtr reinterpret(long newSize) {
        return new DoublePtr(segment.reinterpret(newSize * Double.BYTES));
    }

    public DoublePtr offset(long offset) {
        return new DoublePtr(segment.asSlice(offset * Double.BYTES));
    }

    public static DoublePtr allocate(Arena arena) {
        return new DoublePtr(arena.allocate(ValueLayout.JAVA_DOUBLE));
    }

    public static DoublePtr allocate(Arena arena, long size) {
        return new DoublePtr(arena.allocate(ValueLayout.JAVA_DOUBLE, size));
    }

    public static DoublePtr allocate(Arena arena, double[] array) {
        return new DoublePtr(arena.allocateFrom(ValueLayout.JAVA_DOUBLE, array));
    }

    /// Allocate a new {@link DoublePtr} in the given {@link Arena} and copy the contents of the
    /// given {@link DoubleBuffer} into the newly allocated {@link DoublePtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param arena The {@link Arena} to allocate the new {@link DoublePtr} in
    /// @param buffer The {@link DoubleBuffer} to copy the contents from
    /// @return A new {@link DoublePtr} that contains the contents of the given {@link DoubleBuffer}
    public static DoublePtr allocate(Arena arena, DoubleBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_DOUBLE, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new DoublePtr(s);
    }

    /// Create a new {@link DoublePtr} using the same backing storage as the given {@link DoubleBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, DoubleBuffer)} method is
    /// that this method does not copy the contents of the given {@link DoubleBuffer} into the newly allocated
    /// {@link DoublePtr}. Instead, the newly allocated {@link DoublePtr} will share the same backing storage as
    /// the given {@link DoubleBuffer}. Please note that if the given {@link DoubleBuffer} is not
    /// native/direct, the created {@link DoublePtr} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param buffer The {@link DoubleBuffer} to use as the backing storage
    /// @return A new {@link DoublePtr} that uses the given {@link DoubleBuffer} as its backing storage
    @unsafe
    public static DoublePtr from(DoubleBuffer buffer) {
        return new DoublePtr(MemorySegment.ofBuffer(buffer));
    }
}
