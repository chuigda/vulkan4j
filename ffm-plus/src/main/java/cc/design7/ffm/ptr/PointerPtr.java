package cc.design7.ffm.ptr;

import cc.design7.ffm.IPointer;
import cc.design7.ffm.annotation.UnsafeConstructor;
import cc.design7.ffm.annotation.ValueBasedCandidate;
import cc.design7.ffm.annotation.unsafe;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.List;

/// Reperesents a pointer to pointer(s) in native memory.
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@link AddressLayout#byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators. For
/// normal users, {@link #checked} is a good safe alternative.
@ValueBasedCandidate
@UnsafeConstructor
public record PointerPtr(@NotNull MemorySegment segment) implements IPointer {
    public long size() {
        return segment.byteSize() / ValueLayout.ADDRESS.byteSize();
    }

    public @NotNull MemorySegment read() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public void write(@NotNull MemorySegment value) {
        segment.set(ValueLayout.ADDRESS, 0, value);
    }

    public void write(@Nullable IPointer pointer) {
        if (pointer != null) {
            write(pointer.segment());
        } else {
            write(MemorySegment.NULL);
        }
    }

    public @NotNull MemorySegment read(long index) {
        return segment.get(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize());
    }

    public void write(long index, @NotNull MemorySegment value) {
        segment.set(ValueLayout.ADDRESS, index * ValueLayout.ADDRESS.byteSize(), value);
    }

    public void write(long index, @Nullable IPointer pointer) {
        if (pointer != null) {
            write(index, pointer.segment());
        } else {
            write(index, MemorySegment.NULL);
        }
    }

    /// Assume the {@link PointerPtr} is capable of holding at least {@code newSize} pointers,
    /// create a new view {@link PointerPtr} that uses the same backing storage as this
    /// {@link PointerPtr}, but with the new size. Since there is actually no way to really check
    /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
    /// marked as {@link unsafe}.
    ///
    /// This method could be useful when handling data returned from some C API, where the size of
    /// the data is not known in advance.
    @unsafe
    public @NotNull PointerPtr reinterpret(long newSize) {
        return new PointerPtr(segment.reinterpret(newSize * ValueLayout.ADDRESS.byteSize()));
    }

    public @NotNull PointerPtr offset(long offset) {
        return new PointerPtr(segment.asSlice(offset * ValueLayout.ADDRESS.byteSize()));
    }

    /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
    /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
    /// (offset + newSize). Be careful with the difference.
    public @NotNull PointerPtr slice(long start, long end) {
        return new PointerPtr(segment.asSlice(
                start * ValueLayout.ADDRESS.byteSize(),
                (end - start) * ValueLayout.ADDRESS.byteSize()
        ));
    }

    public @NotNull PointerPtr slice(long end) {
        return new PointerPtr(segment.asSlice(0, end * ValueLayout.ADDRESS.byteSize()));
    }

    /// Creata a new {@link PointerPtr} using {@code segment} as backing storage, with argument
    /// validation.
    ///
    /// This function does not ensure {@code segment}'s size to be a multiple of
    /// {@link AddressLayout#byteSize()}, since that several trailing bytes could be automatically
    /// ignored by {@link #size()} method, and usually these bytes does not interfere with FFI
    /// operations. If {@code segment} is not big enough to hold at least one pointer, that segment
    /// is simply considered "empty". See the documentation of {@link IPointer#segment()} for more
    /// details.
    ///
    /// @param segment the {@link MemorySegment} to use as the backing storage
    /// @return {@code null} if {@code segment} is {@code null} or {@link MemorySegment#NULL},
    /// otherwise a new {@link PointerPtr} that uses {@code segment} as backing storage
    /// @throws IllegalArgumentException if {@code segment} is not native or not properly aligned
    @Contract("null -> null")
    public static @Nullable PointerPtr checked(@Nullable MemorySegment segment) {
        if (segment == null || segment.equals(MemorySegment.NULL)) {
            return null;
        }

        if (!segment.isNative()) {
            throw new IllegalArgumentException("Segment must be native");
        }

        if (segment.byteSize() % ValueLayout.ADDRESS.byteSize() != 0) {
            throw new IllegalArgumentException("Segment size must be a multiple of " + ValueLayout.ADDRESS.byteSize());
        }

        return new PointerPtr(segment);
    }

    public static @NotNull PointerPtr allocate(@NotNull Arena arena) {
        return new PointerPtr(arena.allocate(ValueLayout.ADDRESS));
    }

    public static @NotNull PointerPtr allocate(@NotNull Arena arena, long size) {
        return new PointerPtr(arena.allocate(ValueLayout.ADDRESS, size));
    }
}
