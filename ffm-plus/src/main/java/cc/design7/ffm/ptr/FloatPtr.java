package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.UnsafeConstructor;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.FloatBuffer;

@ValueBasedCandidate
@UnsafeConstructor
public record FloatPtr(MemorySegment segment) implements IPointer {
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
    public FloatPtr reinterpret(long newSize) {
        return new FloatPtr(segment.reinterpret(newSize * Float.BYTES));
    }

    public FloatPtr offset(long offset) {
        return new FloatPtr(segment.asSlice(offset * Float.BYTES));
    }

    public static FloatPtr allocate(Arena arena) {
        return new FloatPtr(arena.allocate(ValueLayout.JAVA_FLOAT));
    }

    public static FloatPtr allocate(Arena arena, long size) {
        return new FloatPtr(arena.allocate(ValueLayout.JAVA_FLOAT, size));
    }

    public static FloatPtr allocate(Arena arena, float[] array) {
        return new FloatPtr(arena.allocateFrom(ValueLayout.JAVA_FLOAT, array));
    }

    /// Allocate a new {@link FloatPtr} in the given {@link Arena} and copy the contents of the given
    /// {@link FloatBuffer} into the newly allocated {@link FloatPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param arena the {@link Arena} to allocate the new {@link FloatPtr} in
    /// @param buffer the {@link FloatBuffer} to copy the contents from
    /// @return a new {@link FloatPtr} that contains the contents of the given {@link FloatBuffer}
    public static FloatPtr allocate(Arena arena, FloatBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_FLOAT, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new FloatPtr(s);
    }

    /// Create a new {@link FloatPtr} using the same backing storage as the given {@link FloatBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, FloatBuffer)} method is
    /// that this method does not copy the contents of the given {@link FloatBuffer} into a newly allocated
    /// {@link FloatPtr}. Instead, this method creates a new {@link FloatPtr} that uses the same backing storage
    /// as the given {@link FloatBuffer}. Please note that if the given {@link FloatBuffer} is not
    /// native/direct, the created {@link FloatPtr} will not be able to be used in FFI operations since the backing
    /// storage does not reside in native memory and does not have a native address. Thus, this method is marked as
    /// {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param buffer the {@link FloatBuffer} to use for the backing storage
    /// @return a new {@link FloatPtr} that uses the given {@link FloatBuffer} as its backing storage
    @unsafe
    public static FloatPtr from(FloatBuffer buffer) {
        return new FloatPtr(MemorySegment.ofBuffer(buffer));
    }
}
