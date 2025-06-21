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

/// Represents a pointer to a {@code stbtt_bakedchar} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_bakedchar {
///     short x0; // @link substring="x0" target="#x0"
///     short y0; // @link substring="y0" target="#y0"
///     short x1; // @link substring="x1" target="#x1"
///     short y1; // @link substring="y1" target="#y1"
///     float xoff; // @link substring="xoff" target="#xoff"
///     float yoff; // @link substring="yoff" target="#yoff"
///     float xadvance; // @link substring="xadvance" target="#xadvance"
/// } stbtt_bakedchar;
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
public record STBTT_Bakedchar(@NotNull MemorySegment segment) implements ISTBTT_Bakedchar {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Bakedchar}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Bakedchar to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Bakedchar.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Bakedchar, Iterable<STBTT_Bakedchar> {
        public long size() {
            return segment.byteSize() / STBTT_Bakedchar.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Bakedchar at(long index) {
            return new STBTT_Bakedchar(segment.asSlice(index * STBTT_Bakedchar.BYTES, STBTT_Bakedchar.BYTES));
        }

        public void write(long index, @NotNull STBTT_Bakedchar value) {
            MemorySegment s = segment.asSlice(index * STBTT_Bakedchar.BYTES, STBTT_Bakedchar.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Bakedchar.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Bakedchar.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Bakedchar.BYTES,
                (end - start) * STBTT_Bakedchar.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Bakedchar.BYTES));
        }

        public STBTT_Bakedchar[] toArray() {
            STBTT_Bakedchar[] ret = new STBTT_Bakedchar[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Bakedchar> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Bakedchar> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Bakedchar.BYTES;
            }

            @Override
            public STBTT_Bakedchar next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Bakedchar ret = new STBTT_Bakedchar(segment.asSlice(0, STBTT_Bakedchar.BYTES));
                segment = segment.asSlice(STBTT_Bakedchar.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Bakedchar allocate(Arena arena) {
        return new STBTT_Bakedchar(arena.allocate(LAYOUT));
    }

    public static STBTT_Bakedchar.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Bakedchar.Ptr(segment);
    }

    public static STBTT_Bakedchar clone(Arena arena, STBTT_Bakedchar src) {
        STBTT_Bakedchar ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public short x0() {
        return segment.get(LAYOUT$x0, OFFSET$x0);
    }

    public STBTT_Bakedchar x0(short value) {
        segment.set(LAYOUT$x0, OFFSET$x0, value);
        return this;
    }

    public short y0() {
        return segment.get(LAYOUT$y0, OFFSET$y0);
    }

    public STBTT_Bakedchar y0(short value) {
        segment.set(LAYOUT$y0, OFFSET$y0, value);
        return this;
    }

    public short x1() {
        return segment.get(LAYOUT$x1, OFFSET$x1);
    }

    public STBTT_Bakedchar x1(short value) {
        segment.set(LAYOUT$x1, OFFSET$x1, value);
        return this;
    }

    public short y1() {
        return segment.get(LAYOUT$y1, OFFSET$y1);
    }

    public STBTT_Bakedchar y1(short value) {
        segment.set(LAYOUT$y1, OFFSET$y1, value);
        return this;
    }

    public float xoff() {
        return segment.get(LAYOUT$xoff, OFFSET$xoff);
    }

    public STBTT_Bakedchar xoff(float value) {
        segment.set(LAYOUT$xoff, OFFSET$xoff, value);
        return this;
    }

    public float yoff() {
        return segment.get(LAYOUT$yoff, OFFSET$yoff);
    }

    public STBTT_Bakedchar yoff(float value) {
        segment.set(LAYOUT$yoff, OFFSET$yoff, value);
        return this;
    }

    public float xadvance() {
        return segment.get(LAYOUT$xadvance, OFFSET$xadvance);
    }

    public STBTT_Bakedchar xadvance(float value) {
        segment.set(LAYOUT$xadvance, OFFSET$xadvance, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("x0"),
        ValueLayout.JAVA_SHORT.withName("y0"),
        ValueLayout.JAVA_SHORT.withName("x1"),
        ValueLayout.JAVA_SHORT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("xoff"),
        ValueLayout.JAVA_FLOAT.withName("yoff"),
        ValueLayout.JAVA_FLOAT.withName("xadvance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x0 = PathElement.groupElement("x0");
    public static final PathElement PATH$y0 = PathElement.groupElement("y0");
    public static final PathElement PATH$x1 = PathElement.groupElement("x1");
    public static final PathElement PATH$y1 = PathElement.groupElement("y1");
    public static final PathElement PATH$xoff = PathElement.groupElement("xoff");
    public static final PathElement PATH$yoff = PathElement.groupElement("yoff");
    public static final PathElement PATH$xadvance = PathElement.groupElement("xadvance");

    public static final OfShort LAYOUT$x0 = (OfShort) LAYOUT.select(PATH$x0);
    public static final OfShort LAYOUT$y0 = (OfShort) LAYOUT.select(PATH$y0);
    public static final OfShort LAYOUT$x1 = (OfShort) LAYOUT.select(PATH$x1);
    public static final OfShort LAYOUT$y1 = (OfShort) LAYOUT.select(PATH$y1);
    public static final OfFloat LAYOUT$xoff = (OfFloat) LAYOUT.select(PATH$xoff);
    public static final OfFloat LAYOUT$yoff = (OfFloat) LAYOUT.select(PATH$yoff);
    public static final OfFloat LAYOUT$xadvance = (OfFloat) LAYOUT.select(PATH$xadvance);

    public static final long SIZE$x0 = LAYOUT$x0.byteSize();
    public static final long SIZE$y0 = LAYOUT$y0.byteSize();
    public static final long SIZE$x1 = LAYOUT$x1.byteSize();
    public static final long SIZE$y1 = LAYOUT$y1.byteSize();
    public static final long SIZE$xoff = LAYOUT$xoff.byteSize();
    public static final long SIZE$yoff = LAYOUT$yoff.byteSize();
    public static final long SIZE$xadvance = LAYOUT$xadvance.byteSize();

    public static final long OFFSET$x0 = LAYOUT.byteOffset(PATH$x0);
    public static final long OFFSET$y0 = LAYOUT.byteOffset(PATH$y0);
    public static final long OFFSET$x1 = LAYOUT.byteOffset(PATH$x1);
    public static final long OFFSET$y1 = LAYOUT.byteOffset(PATH$y1);
    public static final long OFFSET$xoff = LAYOUT.byteOffset(PATH$xoff);
    public static final long OFFSET$yoff = LAYOUT.byteOffset(PATH$yoff);
    public static final long OFFSET$xadvance = LAYOUT.byteOffset(PATH$xadvance);
}
