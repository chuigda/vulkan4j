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

/// Represents a pointer to 32-bit integer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link ValueLayout.OfInt#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked} is a good safe alternative.
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

    /// Assume the {@link IntPtr} is capable of holding at least {@code newSize} integers, create
    /// a new view {@link IntPtr} that uses the same backing storage as this {@link IntPtr}, but
    /// with the new size. Since there is actually no way to really check whether the new size is
    /// valid, while buffer overflow is undefined behavior, this method is marked as {@link unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    @unsafe
    public @NotNull IntPtr reinterpret(long newSize) {
        return new IntPtr(segment.reinterpret(newSize * Integer.BYTES));
    }

    public @NotNull IntPtr offset(long offset) {
        return new IntPtr(segment.asSlice(offset * Integer.BYTES));
    }

    /// Create a new {@link IntPtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link Integer#BYTES}, since that several trailing bytes could be automatically ignored by
    /// {@link #size()} method, and usually these bytes does not interfere with FFI operations.
    /// If {@code segment} is not big enough to hold at least one integer, that segment is simply
    /// considered "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link IntPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    @Contract("null -> null")
    public static @Nullable IntPtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % ValueLayout.JAVA_INT.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + ValueLayout.JAVA_INT.byteAlignment() + " bytes");
        }

        return new IntPtr(segment);
    }

    /// Create a new {@link IntPtr} using the same backing storage as {@code buffer}, with argument
    /// validation.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, IntBuffer)}
    /// method is that this method does not copy the contents of {@code buffer} into a newly
    /// allocated {@link MemorySegment}. Instead, the newly created {@link IntPtr} will use the same
    /// backing storage as {@code buffer}. Thus, modifications from one side will be visible on the
    /// other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be referred. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be referred, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link IntBuffer#order()} property. {@link IntPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param buffer the {@link IntBuffer} to use as the backing storage
    /// @return a new {@link IntPtr} that uses {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if {@code buffer} is not direct, or its backing storage is
    /// not properly aligned
    public static @NotNull IntPtr checked(@NotNull IntBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        MemorySegment segment = MemorySegment.ofBuffer(buffer);
        if (segment.address() % ValueLayout.JAVA_INT.byteAlignment() != 0) {
            throw new IllegalArgumentException("Buffer address must be aligned to " + ValueLayout.JAVA_INT.byteAlignment() + " bytes");
        }

        return new IntPtr(segment);
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

    /// Allocate a new {@link IntPtr} in {@code arena} and copy the contents of {@code buffer} into
    /// the newly allocated {@link IntPtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be copied. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// When handling data types consisting of multiple bytes, also be careful with endianness and
    /// {@link IntBuffer#order()} property. {@link IntPtr} always uses the native endianness. So
    /// if {@code buffer} uses a different endianness, you may want to convert it to the native
    /// endianness first.
    ///
    /// @param arena the {@link Arena} to allocate the new {@link IntPtr} in
    /// @param buffer the {@link IntBuffer} to copy the contents from
    /// @return a new {@link IntPtr} that contains the contents of {@code buffer}
    public static @NotNull IntPtr allocate(@NotNull Arena arena, @NotNull IntBuffer buffer) {
        MemorySegment s = arena.allocate(ValueLayout.JAVA_INT, buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));

        return new IntPtr(s);
    }
}
