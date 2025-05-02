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
import java.nio.ByteBuffer;

/// Represents a pointer to byte(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment() != NULL && !segment.equals(MemorySegment.NULL)}). To represent a null pointer,
/// you may use a Java {@code null} instead. See the documentation of {@link IPointer#segment()}
/// for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not check
/// if the given {@link MemorySegment} is {@link MemorySegment#NULL} (technically, it can not do
/// this). The constructor is still very suitable for automatic code generators. For normal users,
/// {@link #checked} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record BytePtr(@NotNull MemorySegment segment) implements IPointer {
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

    /// Assume the {@link BytePtr} is a null-terminated string, reads the string from the beginning
    /// of the underlying memory segment, until the first null byte is encountered or the end of the
    /// segment is reached.
    ///
    /// This function requires the size of the underlying memory segment to be set correctly. If the
    /// size is not pre-ly known and correctly set (for example, the {@link BytePtr} or the
    /// underlying {@link MemorySegment} is returned from some C API), you may use
    /// {@link BytePtr#readString} (note that it is {@link unsafe}) instead.
    public @NotNull String readStringSafe() {
        return segment.getString(0);
    }

    /// Assumes the {@link BytePtr} is a null-terminated string, reads the string from the beginning
    /// of the underlying memory segment, until the first null byte is encountered.
    ///
    /// This function is {@link unsafe} because it does not check the size of the underlying memory
    /// segment. This function is suitable for the cases that the size of the underlying memory
    /// segment is pre-ly known and correctly set (for example, the {@link BytePtr} or the
    /// underlying {@link MemorySegment} is returned from some C API). If the size is pre-ly known
    /// and correctly set, you may use {@link BytePtr#readStringSafe} instead.
    @unsafe
    public @NotNull String readString() {
        MemorySegment reinterpreted = segment.reinterpret(Long.MAX_VALUE);
        return reinterpreted.getString(0);
    }

    @unsafe
    public @NotNull BytePtr reinterpret(long newSize) {
        return new BytePtr(segment.reinterpret(newSize));
    }

    public @NotNull BytePtr offset(long offset) {
        return new BytePtr(segment.asSlice(offset));
    }

    /// Create a new {@link BytePtr} using the given {@link MemorySegment}. {@code null} will be
    /// returned for both {@code null} and {@link MemorySegment#NULL} input.
    ///
    /// If the given segment is not big enough to hold at least one byte, that segment is simply
    /// considered "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if the given {@link MemorySegment} is {@code null} or
    /// {@link MemorySegment#NULL}, otherwise a new {@link BytePtr} that uses the given
    /// {@code segment} as its backing storage
    @Contract("null -> null")
    public @Nullable BytePtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        return new BytePtr(segment);
    }

    /// Create a new {@link BytePtr} using the same backing storage as the given {@link ByteBuffer}.
    /// The buffer must be direct.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, ByteBuffer)}
    /// method is that this method does not copy the contents of the given {@link ByteBuffer} into a
    /// newly allocated {@link BytePtr}. Instead, the newly created {@link BytePtr} will use the
    /// same backing storage as the given {@link ByteBuffer}. Thus, modifications from one side will
    /// be visible from the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    /// @param buffer the {@link ByteBuffer} to use as the backing storage
    /// @return a new {@link BytePtr} that uses the given {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if the given {@link ByteBuffer} is not direct
    public static @NotNull BytePtr checked(@NotNull ByteBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        return new BytePtr(MemorySegment.ofBuffer(buffer));
    }

    public static @NotNull BytePtr allocate(@NotNull Arena arena) {
        return new BytePtr(arena.allocate(1));
    }

    public static @NotNull BytePtr allocate(@NotNull Arena arena, long size) {
        return new BytePtr(arena.allocate(size));
    }

    public static @NotNull BytePtr allocate(@NotNull Arena arena, byte @NotNull [] bytes) {
        return new BytePtr(arena.allocateFrom(ValueLayout.JAVA_BYTE, bytes));
    }

    /// Allocate a new {@link BytePtr} in the given {@link Arena} and copy the contents of the given
    /// {@link ByteBuffer} into the newly allocated {@link BytePtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: if you
    /// have ever read from the {@link Buffer}, and you want all the contents of the
    /// {@link Buffer} to be copied, you need to call {@link Buffer#rewind()}
    ///
    /// @param arena the {@link Arena} to allocate the new {@link BytePtr} in
    /// @param buffer the {@link ByteBuffer} to copy the contents from
    /// @return a new {@link BytePtr} that contains the contents of the given {@link ByteBuffer}
    public static @NotNull BytePtr allocate(@NotNull Arena arena, @NotNull ByteBuffer buffer) {
        var s = arena.allocate(buffer.remaining());
        s.copyFrom(MemorySegment.ofBuffer(buffer));
        return new BytePtr(s);
    }

    public static @NotNull BytePtr allocateAligned(
            @NotNull Arena arena,
            long size,
            long alignment
    ) {
        return new BytePtr(arena.allocate(size, alignment));
    }

    public static @NotNull BytePtr allocateString(@NotNull Arena arena, @NotNull String s) {
        return new BytePtr(arena.allocateFrom(s));
    }
}
