package club.doki7.stb.truetype.datatype;

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
import club.doki7.stb.truetype.handle.*;
import static club.doki7.stb.truetype.STBTrueTypeConstants.*;

/// Represents a pointer to a {@code stbtt__buf} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt__buf {
///     char* data; // @link substring="data" target="#data"
///     int cursor; // @link substring="cursor" target="#cursor"
///     int size; // @link substring="size" target="#size"
/// } stbtt__buf;
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
public record STBTT_Buf(@NotNull MemorySegment segment) implements ISTBTT_Buf {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Buf}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Buf to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Buf.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Buf, Iterable<STBTT_Buf> {
        public long size() {
            return segment.byteSize() / STBTT_Buf.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Buf at(long index) {
            return new STBTT_Buf(segment.asSlice(index * STBTT_Buf.BYTES, STBTT_Buf.BYTES));
        }

        public void write(long index, @NotNull STBTT_Buf value) {
            MemorySegment s = segment.asSlice(index * STBTT_Buf.BYTES, STBTT_Buf.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Buf.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Buf.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Buf.BYTES,
                (end - start) * STBTT_Buf.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Buf.BYTES));
        }

        public STBTT_Buf[] toArray() {
            STBTT_Buf[] ret = new STBTT_Buf[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Buf> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Buf> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Buf.BYTES;
            }

            @Override
            public STBTT_Buf next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Buf ret = new STBTT_Buf(segment.asSlice(0, STBTT_Buf.BYTES));
                segment = segment.asSlice(STBTT_Buf.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Buf allocate(Arena arena) {
        return new STBTT_Buf(arena.allocate(LAYOUT));
    }

    public static STBTT_Buf.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Buf.Ptr(segment);
    }

    public static STBTT_Buf clone(Arena arena, STBTT_Buf src) {
        STBTT_Buf ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr data() {
        MemorySegment s = dataRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public STBTT_Buf data(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dataRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment dataRaw() {
        return segment.get(LAYOUT$data, OFFSET$data);
    }

    public void dataRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$data, OFFSET$data, value);
    }

    public int cursor() {
        return segment.get(LAYOUT$cursor, OFFSET$cursor);
    }

    public STBTT_Buf cursor(int value) {
        segment.set(LAYOUT$cursor, OFFSET$cursor, value);
        return this;
    }

    public int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public STBTT_Buf size(int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("data"),
        ValueLayout.JAVA_INT.withName("cursor"),
        ValueLayout.JAVA_INT.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$data = PathElement.groupElement("data");
    public static final PathElement PATH$cursor = PathElement.groupElement("cursor");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final AddressLayout LAYOUT$data = (AddressLayout) LAYOUT.select(PATH$data);
    public static final OfInt LAYOUT$cursor = (OfInt) LAYOUT.select(PATH$cursor);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);

    public static final long SIZE$data = LAYOUT$data.byteSize();
    public static final long SIZE$cursor = LAYOUT$cursor.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
    public static final long OFFSET$cursor = LAYOUT.byteOffset(PATH$cursor);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
}
