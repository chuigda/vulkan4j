package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import club.doki7.ffm.annotation.unsafe;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.List;

/// Represents a pointer to byte(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}). To represent null pointer,
/// you may use a Java {@code null} instead. See the documentation of {@link IPointer#segment()}
/// for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked} is a good safe alternative.
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
    /// of the underlying memory segment, until the first NUL byte is encountered or the end of the
    /// segment is reached.
    ///
    /// This function requires the size of the underlying memory segment to be set correctly. If the
    /// size is not known in advance and correctly set (for example, the {@link BytePtr} or the
    /// underlying {@link MemorySegment} is returned from some C API), you may use
    /// {@link BytePtr#readString} (note that it is {@link unsafe}) instead.
    public @NotNull String readStringSafe() {
        return segment.getString(0);
    }

    /// Assumes the {@link BytePtr} is a null-terminated string, reads the string from the beginning
    /// of the underlying memory segment, until the first NUL byte is encountered.
    ///
    /// This function is {@link unsafe} because it does not check the size of the underlying memory
    /// segment. This function is suitable for the cases that the size of the underlying memory
    /// segment is not known in advance and correctly set (for example, the {@link BytePtr} or the
    /// underlying {@link MemorySegment} is returned from some C API). If the size is correctly set,
    /// you may use {@link BytePtr#readStringSafe} instead.
    @unsafe
    public @NotNull String readString() {
        MemorySegment reinterpreted = segment.reinterpret(Long.MAX_VALUE);
        return reinterpreted.getString(0);
    }

    /// Assume the {@link BytePtr} is capable of holding at least {@code newSize} bytes, create a
    /// new view {@link BytePtr} that uses the same backing storage as this {@link BytePtr}, but
    /// with the new size. Since there is actually no way to really check whether the new size is
    /// valid, while buffer overflow is undefined behavior, this method is marked as {@link unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// data is not known in advance.
    ///
    /// If the size of the underlying segment is actually known in advance and correctly set, and
    /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
    /// instead.
    @unsafe
    public @NotNull BytePtr reinterpret(long newSize) {
        return new BytePtr(segment.reinterpret(newSize));
    }

    public @NotNull BytePtr offset(long offset) {
        return new BytePtr(segment.asSlice(offset));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull BytePtr slice(long start, long end) {
        return new BytePtr(segment.asSlice(start, end - start));
    }

    public @NotNull BytePtr slice(long end) {
        return new BytePtr(segment.asSlice(0, end));
    }

    /// Create a new {@link BytePtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// If {@code segment} is not big enough to hold at least one byte, that segment is simply
    /// considered "empty". See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link BytePtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native
    @Contract("null -> null")
    public @Nullable BytePtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        return new BytePtr(segment);
    }

    /// Create a new {@link BytePtr} using the same backing storage as {@code buffer}, with argument
    /// validation.
    ///
    /// The main difference between this static method and the {@link #allocate(Arena, ByteBuffer)}
    /// method is that this method does not copy the contents of {@code buffer} into a newly
    /// allocated {@link MemorySegment}. Instead, the newly created {@link BytePtr} will use the
    /// same backing storage as {@code buffer}. Thus, modifications from one side will be visible on
    /// the other side.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be referred. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be referred, you may want to call {@link Buffer#rewind()}.
    ///
    /// @param buffer the {@link ByteBuffer} to use as the backing storage
    /// @return a new {@link BytePtr} that uses {@code buffer} as its backing storage
    /// @throws IllegalArgumentException if {@code buffer} is not direct
    public static @NotNull BytePtr checked(@NotNull ByteBuffer buffer) {
        if (!buffer.isDirect()) {
            throw new IllegalArgumentException("Buffer must be direct");
        }

        return new BytePtr(MemorySegment.ofBuffer(buffer));
    }

    public static @NotNull BytePtr from(@NotNull IPointer ptr) {
        return new BytePtr(ptr.segment());
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

    /// Allocate a new {@link BytePtr} in {@code arena} and copy the contents of {@code buffer} into
    /// the newly allocated {@link BytePtr}.
    ///
    /// Be careful with {@link java.nio} buffer types' {@link Buffer#position()} property: only the
    /// "remaining" (from {@link Buffer#position()} to {@link Buffer#limit()}) part of
    /// {@code buffer} will be copied. If you have ever read from {@code buffer}, and you want all
    /// the contents of {@code buffer} to be copied, you may want to call {@link Buffer#rewind()}.
    ///
    ///
    /// @param arena the {@link Arena} to allocate the new {@link BytePtr} in
    /// @param buffer the {@link ByteBuffer} to copy the contents from
    /// @return a new {@link BytePtr} that contains the contents of {@code buffer}
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
