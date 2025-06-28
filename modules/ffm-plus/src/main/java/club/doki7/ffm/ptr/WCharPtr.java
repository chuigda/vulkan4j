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
import java.util.Iterator;
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

    /// The user may use {@link PrimitiveIterator.OfInt#nextInt()} rather than {@link Iterator#next()}
    /// to avoid unnecessary boxing.
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
}
