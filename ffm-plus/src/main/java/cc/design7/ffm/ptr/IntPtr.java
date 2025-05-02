package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.UnsafeConstructor;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.IntBuffer;

/// Represents a pointer to integer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment() != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link ValueLayout.OfInt#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it neither checks
/// if the given {@link MemorySegment} is {@link MemorySegment#NULL}, nor checks the alignment of
/// the given {@link MemorySegment} (technically, it can not do this). The constructor is still very
/// suitable for automatic code generators. For normal users, {@link #checked} is a good safe
/// alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record IntPtr(@NotNull MemorySegment segment) implements IPointer {
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
    public @NotNull IntPtr reinterpret(long newSize) {
        return new IntPtr(segment.reinterpret(newSize * Integer.BYTES));
    }

    public @NotNull IntPtr offset(long offset) {
        return new IntPtr(segment.asSlice(offset * Integer.BYTES));
    }

    /// Create a new {@link IntPtr} using the given {@link MemorySegment}. The alignment of the
    /// given {@link MemorySegment} will be checked. {@code null} will be returned for both
    /// {@code null} and {@link MemorySegment#NULL} input.
    ///
    /// This function does not ensure the segment's size is a multiple of {@link Integer#BYTES},
    /// since that several trailing bytes could be automatically ignored by {@link #size()} method,
    /// and usually these bytes does not interfere with FFI operations. If the given segment is even
    /// not big enough to hold at least one integer, the resulting pointer is simply considered
    /// "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if the given {@link MemorySegment} is {@code null} or
    /// {@link MemorySegment#NULL}, otherwise a new {@link IntPtr} that uses the given
    /// {@code segment} as backing storage
    /// @throws IllegalArgumentException if the given {@link MemorySegment} is not properly aligned
    @Contract("null -> null")
    public static @Nullable IntPtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (segment.address() % ValueLayout.OfInt.JAVA_INT.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + ValueLayout.OfInt.JAVA_INT.byteAlignment() + " bytes");
        }

        return new IntPtr(segment);
    }

    /// Create a new {@link IntPtr} using the same backing storage as the given {@link IntBuffer}.
    /// The buffer must be direct.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, IntBuffer)}
    /// method is that this method does not copy the contents of the given {@link IntBuffer} into a
    /// newly allocated {@link MemorySegment}. Instead, the newly created {@link IntPtr} will use
    /// the same backing storage as the given {@link IntBuffer}. Thus, modifications from one side
    /// will be visible on the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// @param buffer the {@link IntBuffer} to use as the backing storage
    /// @return a new {@link IntPtr} that uses the given {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if the given {@link IntBuffer} is not direct
    public static @NotNull IntPtr checked(@NotNull IntBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        return new IntPtr(MemorySegment.ofBuffer(buffer));
    }

    public static @NotNull IntPtr allocate(@NotNull Arena arena) {
        return new IntPtr(arena.allocate(ValueLayout.JAVA_INT));
    }

    public static @NotNull IntPtr allocate(@NotNull Arena arena, long size) {
        return new IntPtr(arena.allocate(ValueLayout.JAVA_INT, size));
    }

    public static @NotNull IntPtr allocate(@NotNull Arena arena, int @NotNull [] array) {
        return new IntPtr(arena.allocateFrom(ValueLayout.JAVA_INT, array));
    }

    /// Allocate a new {@link IntPtr} in the given {@link Arena} and copy the contents of the given
    /// {@link IntBuffer} into the newly allocated {@link IntPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link IntPtr} in
    /// @param buffer the {@link IntBuffer} to copy the contents from
    /// @return a new {@link IntPtr} that contains the contents of the given {@link IntBuffer}
    public static @NotNull IntPtr allocate(@NotNull Arena arena, @NotNull IntBuffer buffer) {
        var s = arena.allocate(ValueLayout.JAVA_INT, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new IntPtr(s);
    }
}
