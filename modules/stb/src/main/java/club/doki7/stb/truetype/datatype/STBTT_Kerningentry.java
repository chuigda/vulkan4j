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

/// Represents a pointer to a {@code stbtt_kerningentry} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_kerningentry {
///     int glyph1; // @link substring="glyph1" target="#glyph1"
///     int glyph2; // @link substring="glyph2" target="#glyph2"
///     int advance; // @link substring="advance" target="#advance"
/// } stbtt_kerningentry;
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
public record STBTT_Kerningentry(@NotNull MemorySegment segment) implements ISTBTT_Kerningentry {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Kerningentry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Kerningentry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Kerningentry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Kerningentry, Iterable<STBTT_Kerningentry> {
        public long size() {
            return segment.byteSize() / STBTT_Kerningentry.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Kerningentry at(long index) {
            return new STBTT_Kerningentry(segment.asSlice(index * STBTT_Kerningentry.BYTES, STBTT_Kerningentry.BYTES));
        }

        public void write(long index, @NotNull STBTT_Kerningentry value) {
            MemorySegment s = segment.asSlice(index * STBTT_Kerningentry.BYTES, STBTT_Kerningentry.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Kerningentry.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Kerningentry.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Kerningentry.BYTES,
                (end - start) * STBTT_Kerningentry.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Kerningentry.BYTES));
        }

        public STBTT_Kerningentry[] toArray() {
            STBTT_Kerningentry[] ret = new STBTT_Kerningentry[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Kerningentry> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Kerningentry> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Kerningentry.BYTES;
            }

            @Override
            public STBTT_Kerningentry next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Kerningentry ret = new STBTT_Kerningentry(segment.asSlice(0, STBTT_Kerningentry.BYTES));
                segment = segment.asSlice(STBTT_Kerningentry.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Kerningentry allocate(Arena arena) {
        return new STBTT_Kerningentry(arena.allocate(LAYOUT));
    }

    public static STBTT_Kerningentry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Kerningentry.Ptr(segment);
    }

    public static STBTT_Kerningentry clone(Arena arena, STBTT_Kerningentry src) {
        STBTT_Kerningentry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int glyph1() {
        return segment.get(LAYOUT$glyph1, OFFSET$glyph1);
    }

    public STBTT_Kerningentry glyph1(int value) {
        segment.set(LAYOUT$glyph1, OFFSET$glyph1, value);
        return this;
    }

    public int glyph2() {
        return segment.get(LAYOUT$glyph2, OFFSET$glyph2);
    }

    public STBTT_Kerningentry glyph2(int value) {
        segment.set(LAYOUT$glyph2, OFFSET$glyph2, value);
        return this;
    }

    public int advance() {
        return segment.get(LAYOUT$advance, OFFSET$advance);
    }

    public STBTT_Kerningentry advance(int value) {
        segment.set(LAYOUT$advance, OFFSET$advance, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("glyph1"),
        ValueLayout.JAVA_INT.withName("glyph2"),
        ValueLayout.JAVA_INT.withName("advance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$glyph1 = PathElement.groupElement("glyph1");
    public static final PathElement PATH$glyph2 = PathElement.groupElement("glyph2");
    public static final PathElement PATH$advance = PathElement.groupElement("advance");

    public static final OfInt LAYOUT$glyph1 = (OfInt) LAYOUT.select(PATH$glyph1);
    public static final OfInt LAYOUT$glyph2 = (OfInt) LAYOUT.select(PATH$glyph2);
    public static final OfInt LAYOUT$advance = (OfInt) LAYOUT.select(PATH$advance);

    public static final long SIZE$glyph1 = LAYOUT$glyph1.byteSize();
    public static final long SIZE$glyph2 = LAYOUT$glyph2.byteSize();
    public static final long SIZE$advance = LAYOUT$advance.byteSize();

    public static final long OFFSET$glyph1 = LAYOUT.byteOffset(PATH$glyph1);
    public static final long OFFSET$glyph2 = LAYOUT.byteOffset(PATH$glyph2);
    public static final long OFFSET$advance = LAYOUT.byteOffset(PATH$advance);
}
