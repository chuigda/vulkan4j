package club.doki7.ffm.ptr;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.annotation.ValueBasedCandidate;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/// Represents a pointer to 32-bit integer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code NativeLayout.C_LONG.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked(MemorySegment)} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record CLongPtr(MemorySegment segment) implements IPointer, Iterable<Long> {
    public long size() {
        return segment.byteSize() / NativeLayout.C_LONG_SIZE;
    }

    public long read() {
        return NativeLayout.readCLong(segment, 0);
    }

    public void write(long value) {
        NativeLayout.writeCLong(segment, 0, value);
    }

    public long read(long index) {
        return NativeLayout.readCLong(segment, index);
    }

    public void write(long index, long value) {
        NativeLayout.writeCLong(segment, index, value);
    }

    /// Assume the {@link CLongPtr} is capable of holding at least {@code newSize} elements, create
    /// a new view {@link CLongPtr} that uses the same backing storage as this {@link CLongPtr}, but
    /// with the new size. Since there is actually no way to really check whether the new size is
    /// valid, while buffer overflow is undefined behavior, this method is marked as {@link Unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    ///
    /// If the size of the underlying segment is actually known in advance and correctly set, and
    /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
    /// instead.
    @Unsafe
    public @NotNull CLongPtr reinterpret(long newSize) {
        return new CLongPtr(segment.reinterpret(newSize * NativeLayout.C_LONG_SIZE));
    }

    public @NotNull CLongPtr offset(long offset) {
        return new CLongPtr(segment.asSlice(offset * NativeLayout.C_LONG_SIZE));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull CLongPtr slice(long start, long end) {
        return new CLongPtr(segment.asSlice(
                start * NativeLayout.C_LONG_SIZE,
                (end - start) * NativeLayout.C_LONG_SIZE
        ));
    }

    public @NotNull CLongPtr slice(long end) {
        return new CLongPtr(segment.asSlice(0, end * NativeLayout.C_LONG_SIZE));
    }

    public @NotNull Iterator<Long> iterator() {
        return new Iter(segment);
    }

    /// Create a new {@link CLongPtr} with the given {@link MemorySegment} as the backing storage,
    /// with argument validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link NativeLayout#C_LONG_SIZE}, since that several trailing bytes could be automatically
    /// ignored by {@link #size()} method, and usually these bytes does not interfere with FFI
    /// operations. If {@code segment} is not big enough to hold at least one element, that segment
    /// is simply considered "empty". See the documentation of {@link IPointer#segment()} for more
    /// details.
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link CLongPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    @Contract("null -> null")
    public static @Nullable CLongPtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.address() % NativeLayout.C_LONG.byteAlignment() != 0) {
            throw new IllegalArgumentException("Segment address must be aligned to " + NativeLayout.C_LONG.byteAlignment() + " bytes");
        }

        return new CLongPtr(segment);
    }

    public static @NotNull CLongPtr allocate(@NotNull Arena arena) {
        return new CLongPtr(arena.allocate(NativeLayout.C_LONG));
    }

    public static @NotNull CLongPtr allocate(@NotNull Arena arena, long size) {
        return new CLongPtr(arena.allocate(NativeLayout.C_LONG, size));
    }

    /// An iterator over the integers.
    private static final class Iter implements Iterator<Long> {
        Iter(@NotNull MemorySegment segment) {
            this.segment = segment;
        }

        @Override
        public boolean hasNext() {
            return segment.byteSize() >= NativeLayout.C_LONG_SIZE;
        }

        @Override
        public Long next() {
            if (!hasNext()) {
                throw new NoSuchElementException("No more elements to read");
            }
            long value = NativeLayout.readCLong(segment, 0);
            segment = segment.asSlice(NativeLayout.C_LONG_SIZE);
            return value;
        }

        private @NotNull MemorySegment segment;
    }
}
