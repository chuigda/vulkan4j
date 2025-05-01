package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.IntBuffer;

@ValueBasedCandidate
public record IntPtr(MemorySegment segment) implements IPointer {
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
    public IntPtr reinterpret(long newSize) {
        return new IntPtr(segment.reinterpret(newSize * Integer.BYTES));
    }

    public IntPtr offset(long offset) {
        return new IntPtr(segment.asSlice(offset * Integer.BYTES));
    }

    public static IntPtr allocate(Arena arena) {
        return new IntPtr(arena.allocate(ValueLayout.JAVA_INT));
    }

    public static IntPtr allocate(Arena arena, long size) {
        return new IntPtr(arena.allocate(ValueLayout.JAVA_INT, size));
    }

    public static IntPtr allocate(Arena arena, int[] array) {
        return new IntPtr(arena.allocateFrom(ValueLayout.JAVA_INT, array));
    }

    /// Allocate a new {@link IntPtr} in the given {@link Arena} and copy the contents of the given
    /// {@link IntBuffer} into the newly allocated {@link IntPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param arena the {@link Arena} to allocate the new {@link IntPtr} in
    /// @param buffer the {@link IntBuffer} to copy the contents from
    /// @return a new {@link IntPtr} that contains the contents of the given {@link IntBuffer}
    public static IntPtr allocate(Arena arena, IntBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_INT, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new IntPtr(s);
    }

    /// Create a new {@link IntPtr} using the same backing storage as the given {@link IntBuffer}.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, IntBuffer)} method is
    /// that this method does not copy the contents of the given {@link IntBuffer} into a newly created
    /// {@link IntPtr}. Instead, the newly created {@link IntPtr} will use the same backing storage as the
    /// given {@link IntBuffer}. Please note that if the given {@link IntBuffer} is not
    /// native/direct, the newly created {@link IntPtr}  will not be able to be used in FFI operations since the
    /// backing storage does not reside in native memory and does not have a native address. Thus, this method is marked
    /// as {@link unsafe} because it can create inconsistency and cause very difficult to troubleshoot bugs.
    ///
    /// @param buffer the {@link IntBuffer} to use as the backing storage
    /// @return a new {@link IntPtr} that uses the given {@link IntBuffer} as its backing storage
    @unsafe
    public static IntPtr from(IntBuffer buffer) {
        return new IntPtr(MemorySegment.ofBuffer(buffer));
    }
}
