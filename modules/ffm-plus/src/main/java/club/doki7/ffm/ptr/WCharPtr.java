package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.PrimitiveIterator;

/// Represents a pointer to C `wchar_t` element(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code NativeLayout.WCHAR_T.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked(MemorySegment)} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record WCharPtr(@Override @NotNull MemorySegment segment) implements IPointer, Iterable<Integer> {
    public long size() {
        return segment.byteSize() / NativeLayout.WCHAR_SIZE;
    }

    public int read() {
        return NativeLayout.readWCharT(segment, 0);
    }

    public void write(int value) {
        NativeLayout.writeWCharT(segment, 0, value);
    }

    public int read(long index) {
        return NativeLayout.readWCharT(segment, index * NativeLayout.WCHAR_SIZE);
    }

    public void write(long index, int value) {
        NativeLayout.writeWCharT(segment, index * NativeLayout.WCHAR_SIZE, value);
    }

    /// **(Windows only)** Assume the {@link WCharPtr} is a Windows wide character string, reads the
    /// string from the beginning of the underlying memory segment, until the first NUL byte is
    /// encountered or the end of the segment is reached.
    ///
    /// This function requires the size of the underlying segment to be a set correctly. If the
    /// size is not known in advance and correctly set (for example, the {@link WCharPtr} or the
    /// underlying {@link MemorySegment} is returned from some C API), you may use
    /// {@link WCharPtr#readWString()} (note that it is {@link Unsafe}) instead.
    public @NotNull String readWStringSafe() {
        if (NativeLayout.WCHAR_SIZE != 2) {
            throw new UnsupportedOperationException("readWStringSafe only supports 2-byte wchar_t");
        }

        long size = size();
        for (long i = 0; i < size; i++) {
            if (read(i) == 0) {
                return createStringFromSegment(segment, i);
            }
        }

        return createStringFromSegment(segment, size);
    }

    /// **(Windows only)** Assume the {@link WCharPtr} is a Windows wide character string, reads the
    /// wide string from the beginning of the underlying memory segment, until the first NUL byte is
    /// encountered.
    ///
    /// This function is {@link Unsafe} because it does not check the size of the underlying
    /// memory segment. This function is suitable for the cases that the size of the underlying
    /// memory segment is now known in advance or correctly set (for example, the {@link WCharPtr}
    /// or the underlying {@link MemorySegment} is returned from some C API). If the size is
    /// correctly set, you may use {@link #readWStringSafe()} instead.
    @Unsafe
    public @NotNull String readWString() {
        if (NativeLayout.WCHAR_SIZE != 2) {
            throw new UnsupportedOperationException("readWString only supports 2-byte wchar_t");
        }

        MemorySegment unsizedSegment = segment.reinterpret(Long.MAX_VALUE);
        for (long i = 0; i < unsizedSegment.byteSize() / NativeLayout.WCHAR_SIZE; i++) {
            if (NativeLayout.readWCharT(unsizedSegment, i * NativeLayout.WCHAR_SIZE) == 0) {
                return createStringFromSegment(unsizedSegment, i);
            }
        }

        throw new IllegalArgumentException("Segment size is too large to read as a string");
    }

    /// Assume the {@link WCharPtr} is capable of holding at least {@code newSize} elements, create
    /// a new view {@link WCharPtr} that uses the same backing storage as this {@link WCharPtr}, but
    /// with the new size. Since there is actually no way to really check whether the new size is
    /// valid, while buffer overflow is undefined behavior, this method is marked as {@link Unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    ///
    /// If the size of the underlying segment is actually known in advance and correctly set, and
    /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
    /// instead.
    public @NotNull WCharPtr reinterpret(long newSize) {
        return new WCharPtr(segment.reinterpret(newSize * NativeLayout.WCHAR_SIZE));
    }

    public @NotNull WCharPtr offset(long offset) {
        return new WCharPtr(segment.asSlice(offset * NativeLayout.WCHAR_SIZE));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull WCharPtr slice(long start, long end) {
        return new WCharPtr(segment.asSlice(
                start * NativeLayout.WCHAR_SIZE,
                (end - start) * NativeLayout.WCHAR_SIZE
        ));
    }

    public @NotNull WCharPtr slice(long end) {
        return new WCharPtr(segment.asSlice(0, end * NativeLayout.WCHAR_SIZE));
    }

    @Override
    public @NotNull PrimitiveIterator.OfInt iterator() {
        return new Iter(segment);
    }

    /// Create a new {@link WCharPtr} with the given {@link MemorySegment} as the backing storage,
    /// with argument validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link NativeLayout#WCHAR_SIZE}, since that several trailing bytes could be automatically
    /// ignored by {@link #size()} method, and usually these bytes does not interfere with FFI
    /// operations. If {@code segment} is not big enough to hold at least one element, that segment
    /// is simply considered "empty". See the documentation of {@link IPointer#segment()} for more
    /// details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@link MemorySegment#NULL},
    /// otherwise a new {@link WCharPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    public static @Nullable WCharPtr checked(@NotNull MemorySegment segment) {
        if (segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % NativeLayout.WCHAR_T.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + NativeLayout.WCHAR_T.byteAlignment() + " bytes");
        }

        return new WCharPtr(segment);
    }

    public static @NotNull WCharPtr allocate(@NotNull Arena arena) {
        return new WCharPtr(arena.allocate(NativeLayout.WCHAR_T));
    }

    public static @NotNull WCharPtr allocate(@NotNull Arena arena, long size) {
        return new WCharPtr(arena.allocate(NativeLayout.WCHAR_T, size));
    }

    /// **(Windows only)** allocate a new {@link WCharPtr} with the given string as the content.
    public static @NotNull WCharPtr allocateWString(@NotNull Arena arena, @NotNull String string) {
        if (NativeLayout.WCHAR_SIZE != 2) {
            throw new UnsupportedOperationException("allocateWString only supports 2-byte wchar_t");
        }

        char[] charArray = string.toCharArray();
        MemorySegment segment = arena.allocate(NativeLayout.WCHAR_T, charArray.length + 1);
        segment.copyFrom(MemorySegment.ofArray(charArray));
        segment.set(ValueLayout.JAVA_SHORT, (long) charArray.length * NativeLayout.WCHAR_SIZE, (short) 0);
        return new WCharPtr(segment);
    }

    private static final class Iter implements PrimitiveIterator.OfInt {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        private @NotNull MemorySegment segment;

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= NativeLayout.WCHAR_SIZE;
        }

        @Override
        public int nextInt() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements to read");
            }

            int value = NativeLayout.readWCharT(segment, 0);
            segment = segment.asSlice(NativeLayout.WCHAR_SIZE);
            return value;
        }
    }

    private static String createStringFromSegment(MemorySegment s, long charCount) {
        if (charCount > Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Segment size is too large to read as a string");
        }

        char[] characters = new char[(int) charCount];
        MemorySegment.ofArray(characters)
                .copyFrom(s.asSlice(0, charCount * NativeLayout.WCHAR_SIZE));
        return new String(characters);
    }
}
