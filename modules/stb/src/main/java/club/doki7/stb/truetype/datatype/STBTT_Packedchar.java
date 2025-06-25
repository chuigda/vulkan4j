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

/// Represents a pointer to a {@code stbtt_packedchar} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_packedchar {
///     short x0; // @link substring="x0" target="#x0"
///     short y0; // @link substring="y0" target="#y0"
///     short x1; // @link substring="x1" target="#x1"
///     short y1; // @link substring="y1" target="#y1"
///     float xoff; // @link substring="xoff" target="#xoff"
///     float yoff; // @link substring="yoff" target="#yoff"
///     float xadvance; // @link substring="xadvance" target="#xadvance"
///     float xoff2; // @link substring="xoff2" target="#xoff2"
///     float yoff2; // @link substring="yoff2" target="#yoff2"
/// } stbtt_packedchar;
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
public record STBTT_Packedchar(@NotNull MemorySegment segment) implements ISTBTT_Packedchar {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Packedchar}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Packedchar to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Packedchar.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Packedchar, Iterable<STBTT_Packedchar> {
        public long size() {
            return segment.byteSize() / STBTT_Packedchar.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Packedchar at(long index) {
            return new STBTT_Packedchar(segment.asSlice(index * STBTT_Packedchar.BYTES, STBTT_Packedchar.BYTES));
        }

        public STBTT_Packedchar.Ptr at(long index, @NotNull Consumer<@NotNull STBTT_Packedchar> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull STBTT_Packedchar value) {
            MemorySegment s = segment.asSlice(index * STBTT_Packedchar.BYTES, STBTT_Packedchar.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Packedchar.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Packedchar.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Packedchar.BYTES,
                (end - start) * STBTT_Packedchar.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Packedchar.BYTES));
        }

        public STBTT_Packedchar[] toArray() {
            STBTT_Packedchar[] ret = new STBTT_Packedchar[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Packedchar> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Packedchar> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Packedchar.BYTES;
            }

            @Override
            public STBTT_Packedchar next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Packedchar ret = new STBTT_Packedchar(segment.asSlice(0, STBTT_Packedchar.BYTES));
                segment = segment.asSlice(STBTT_Packedchar.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Packedchar allocate(Arena arena) {
        return new STBTT_Packedchar(arena.allocate(LAYOUT));
    }

    public static STBTT_Packedchar.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Packedchar.Ptr(segment);
    }

    public static STBTT_Packedchar clone(Arena arena, STBTT_Packedchar src) {
        STBTT_Packedchar ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public short x0() {
        return segment.get(LAYOUT$x0, OFFSET$x0);
    }

    public STBTT_Packedchar x0(short value) {
        segment.set(LAYOUT$x0, OFFSET$x0, value);
        return this;
    }

    public short y0() {
        return segment.get(LAYOUT$y0, OFFSET$y0);
    }

    public STBTT_Packedchar y0(short value) {
        segment.set(LAYOUT$y0, OFFSET$y0, value);
        return this;
    }

    public short x1() {
        return segment.get(LAYOUT$x1, OFFSET$x1);
    }

    public STBTT_Packedchar x1(short value) {
        segment.set(LAYOUT$x1, OFFSET$x1, value);
        return this;
    }

    public short y1() {
        return segment.get(LAYOUT$y1, OFFSET$y1);
    }

    public STBTT_Packedchar y1(short value) {
        segment.set(LAYOUT$y1, OFFSET$y1, value);
        return this;
    }

    public float xoff() {
        return segment.get(LAYOUT$xoff, OFFSET$xoff);
    }

    public STBTT_Packedchar xoff(float value) {
        segment.set(LAYOUT$xoff, OFFSET$xoff, value);
        return this;
    }

    public float yoff() {
        return segment.get(LAYOUT$yoff, OFFSET$yoff);
    }

    public STBTT_Packedchar yoff(float value) {
        segment.set(LAYOUT$yoff, OFFSET$yoff, value);
        return this;
    }

    public float xadvance() {
        return segment.get(LAYOUT$xadvance, OFFSET$xadvance);
    }

    public STBTT_Packedchar xadvance(float value) {
        segment.set(LAYOUT$xadvance, OFFSET$xadvance, value);
        return this;
    }

    public float xoff2() {
        return segment.get(LAYOUT$xoff2, OFFSET$xoff2);
    }

    public STBTT_Packedchar xoff2(float value) {
        segment.set(LAYOUT$xoff2, OFFSET$xoff2, value);
        return this;
    }

    public float yoff2() {
        return segment.get(LAYOUT$yoff2, OFFSET$yoff2);
    }

    public STBTT_Packedchar yoff2(float value) {
        segment.set(LAYOUT$yoff2, OFFSET$yoff2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("x0"),
        ValueLayout.JAVA_SHORT.withName("y0"),
        ValueLayout.JAVA_SHORT.withName("x1"),
        ValueLayout.JAVA_SHORT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("xoff"),
        ValueLayout.JAVA_FLOAT.withName("yoff"),
        ValueLayout.JAVA_FLOAT.withName("xadvance"),
        ValueLayout.JAVA_FLOAT.withName("xoff2"),
        ValueLayout.JAVA_FLOAT.withName("yoff2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x0 = PathElement.groupElement("x0");
    public static final PathElement PATH$y0 = PathElement.groupElement("y0");
    public static final PathElement PATH$x1 = PathElement.groupElement("x1");
    public static final PathElement PATH$y1 = PathElement.groupElement("y1");
    public static final PathElement PATH$xoff = PathElement.groupElement("xoff");
    public static final PathElement PATH$yoff = PathElement.groupElement("yoff");
    public static final PathElement PATH$xadvance = PathElement.groupElement("xadvance");
    public static final PathElement PATH$xoff2 = PathElement.groupElement("xoff2");
    public static final PathElement PATH$yoff2 = PathElement.groupElement("yoff2");

    public static final OfShort LAYOUT$x0 = (OfShort) LAYOUT.select(PATH$x0);
    public static final OfShort LAYOUT$y0 = (OfShort) LAYOUT.select(PATH$y0);
    public static final OfShort LAYOUT$x1 = (OfShort) LAYOUT.select(PATH$x1);
    public static final OfShort LAYOUT$y1 = (OfShort) LAYOUT.select(PATH$y1);
    public static final OfFloat LAYOUT$xoff = (OfFloat) LAYOUT.select(PATH$xoff);
    public static final OfFloat LAYOUT$yoff = (OfFloat) LAYOUT.select(PATH$yoff);
    public static final OfFloat LAYOUT$xadvance = (OfFloat) LAYOUT.select(PATH$xadvance);
    public static final OfFloat LAYOUT$xoff2 = (OfFloat) LAYOUT.select(PATH$xoff2);
    public static final OfFloat LAYOUT$yoff2 = (OfFloat) LAYOUT.select(PATH$yoff2);

    public static final long SIZE$x0 = LAYOUT$x0.byteSize();
    public static final long SIZE$y0 = LAYOUT$y0.byteSize();
    public static final long SIZE$x1 = LAYOUT$x1.byteSize();
    public static final long SIZE$y1 = LAYOUT$y1.byteSize();
    public static final long SIZE$xoff = LAYOUT$xoff.byteSize();
    public static final long SIZE$yoff = LAYOUT$yoff.byteSize();
    public static final long SIZE$xadvance = LAYOUT$xadvance.byteSize();
    public static final long SIZE$xoff2 = LAYOUT$xoff2.byteSize();
    public static final long SIZE$yoff2 = LAYOUT$yoff2.byteSize();

    public static final long OFFSET$x0 = LAYOUT.byteOffset(PATH$x0);
    public static final long OFFSET$y0 = LAYOUT.byteOffset(PATH$y0);
    public static final long OFFSET$x1 = LAYOUT.byteOffset(PATH$x1);
    public static final long OFFSET$y1 = LAYOUT.byteOffset(PATH$y1);
    public static final long OFFSET$xoff = LAYOUT.byteOffset(PATH$xoff);
    public static final long OFFSET$yoff = LAYOUT.byteOffset(PATH$yoff);
    public static final long OFFSET$xadvance = LAYOUT.byteOffset(PATH$xadvance);
    public static final long OFFSET$xoff2 = LAYOUT.byteOffset(PATH$xoff2);
    public static final long OFFSET$yoff2 = LAYOUT.byteOffset(PATH$yoff2);
}
