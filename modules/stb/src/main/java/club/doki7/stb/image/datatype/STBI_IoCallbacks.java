package club.doki7.stb.image.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import static club.doki7.stb.image.STBImageConstants.*;

/// Represents a pointer to a {@code stbi_io_callbacks} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbi_io_callbacks {
///     PFN_stbi_io_callbacks_read read; // @link substring="read" target="#read"
///     PFN_stbi_io_callbacks_skip skip; // @link substring="skip" target="#skip"
///     PFN_stbi_io_callbacks_eof eof; // @link substring="eof" target="#eof"
/// } stbi_io_callbacks;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record STBI_IoCallbacks(@NotNull MemorySegment segment) implements ISTBI_IoCallbacks {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBI_IoCallbacks}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBI_IoCallbacks to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBI_IoCallbacks.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBI_IoCallbacks, Iterable<STBI_IoCallbacks> {
        public long size() {
            return segment.byteSize() / STBI_IoCallbacks.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBI_IoCallbacks at(long index) {
            return new STBI_IoCallbacks(segment.asSlice(index * STBI_IoCallbacks.BYTES, STBI_IoCallbacks.BYTES));
        }

        public void write(long index, @NotNull STBI_IoCallbacks value) {
            MemorySegment s = segment.asSlice(index * STBI_IoCallbacks.BYTES, STBI_IoCallbacks.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * STBI_IoCallbacks.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBI_IoCallbacks.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBI_IoCallbacks.BYTES,
                (end - start) * STBI_IoCallbacks.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBI_IoCallbacks.BYTES));
        }

        public STBI_IoCallbacks[] toArray() {
            STBI_IoCallbacks[] ret = new STBI_IoCallbacks[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBI_IoCallbacks> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBI_IoCallbacks> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBI_IoCallbacks.BYTES;
            }

            @Override
            public STBI_IoCallbacks next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBI_IoCallbacks ret = new STBI_IoCallbacks(segment.asSlice(0, STBI_IoCallbacks.BYTES));
                segment = segment.asSlice(STBI_IoCallbacks.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBI_IoCallbacks allocate(Arena arena) {
        return new STBI_IoCallbacks(arena.allocate(LAYOUT));
    }

    public static STBI_IoCallbacks.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBI_IoCallbacks.Ptr(segment);
    }

    public static STBI_IoCallbacks clone(Arena arena, STBI_IoCallbacks src) {
        STBI_IoCallbacks ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="PFN_stbi_io_callbacks_read") MemorySegment read() {
        return segment.get(LAYOUT$read, OFFSET$read);
    }

    public void read(@Pointer(comment="PFN_stbi_io_callbacks_read") MemorySegment value) {
        segment.set(LAYOUT$read, OFFSET$read, value);
    }

    public STBI_IoCallbacks read(@Nullable IPointer pointer) {
        read(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_stbi_io_callbacks_skip") MemorySegment skip() {
        return segment.get(LAYOUT$skip, OFFSET$skip);
    }

    public void skip(@Pointer(comment="PFN_stbi_io_callbacks_skip") MemorySegment value) {
        segment.set(LAYOUT$skip, OFFSET$skip, value);
    }

    public STBI_IoCallbacks skip(@Nullable IPointer pointer) {
        skip(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_stbi_io_callbacks_eof") MemorySegment eof() {
        return segment.get(LAYOUT$eof, OFFSET$eof);
    }

    public void eof(@Pointer(comment="PFN_stbi_io_callbacks_eof") MemorySegment value) {
        segment.set(LAYOUT$eof, OFFSET$eof, value);
    }

    public STBI_IoCallbacks eof(@Nullable IPointer pointer) {
        eof(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("read"),
        ValueLayout.ADDRESS.withName("skip"),
        ValueLayout.ADDRESS.withName("eof")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$read = PathElement.groupElement("read");
    public static final PathElement PATH$skip = PathElement.groupElement("skip");
    public static final PathElement PATH$eof = PathElement.groupElement("eof");

    public static final AddressLayout LAYOUT$read = (AddressLayout) LAYOUT.select(PATH$read);
    public static final AddressLayout LAYOUT$skip = (AddressLayout) LAYOUT.select(PATH$skip);
    public static final AddressLayout LAYOUT$eof = (AddressLayout) LAYOUT.select(PATH$eof);

    public static final long SIZE$read = LAYOUT$read.byteSize();
    public static final long SIZE$skip = LAYOUT$skip.byteSize();
    public static final long SIZE$eof = LAYOUT$eof.byteSize();

    public static final long OFFSET$read = LAYOUT.byteOffset(PATH$read);
    public static final long OFFSET$skip = LAYOUT.byteOffset(PATH$skip);
    public static final long OFFSET$eof = LAYOUT.byteOffset(PATH$eof);
}
