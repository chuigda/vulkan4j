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
import static club.doki7.stb.truetype.STBTrueTypeConstants.*;

/// Represents a pointer to a {@code stbtt_aligned_quad} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_aligned_quad {
///     float x0; // @link substring="x0" target="#x0"
///     float y0; // @link substring="y0" target="#y0"
///     float s0; // @link substring="s0" target="#s0"
///     float t0; // @link substring="t0" target="#t0"
///     float x1; // @link substring="x1" target="#x1"
///     float y1; // @link substring="y1" target="#y1"
///     float s1; // @link substring="s1" target="#s1"
///     float t1; // @link substring="t1" target="#t1"
/// } stbtt_aligned_quad;
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
public record STBTT_AlignedQuad(@NotNull MemorySegment segment) implements ISTBTT_AlignedQuad {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_AlignedQuad}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_AlignedQuad to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_AlignedQuad.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_AlignedQuad, Iterable<STBTT_AlignedQuad> {
        public long size() {
            return segment.byteSize() / STBTT_AlignedQuad.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_AlignedQuad at(long index) {
            return new STBTT_AlignedQuad(segment.asSlice(index * STBTT_AlignedQuad.BYTES, STBTT_AlignedQuad.BYTES));
        }

        public void write(long index, @NotNull STBTT_AlignedQuad value) {
            MemorySegment s = segment.asSlice(index * STBTT_AlignedQuad.BYTES, STBTT_AlignedQuad.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_AlignedQuad.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_AlignedQuad.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_AlignedQuad.BYTES,
                (end - start) * STBTT_AlignedQuad.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_AlignedQuad.BYTES));
        }

        public STBTT_AlignedQuad[] toArray() {
            STBTT_AlignedQuad[] ret = new STBTT_AlignedQuad[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_AlignedQuad> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_AlignedQuad> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_AlignedQuad.BYTES;
            }

            @Override
            public STBTT_AlignedQuad next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_AlignedQuad ret = new STBTT_AlignedQuad(segment.asSlice(0, STBTT_AlignedQuad.BYTES));
                segment = segment.asSlice(STBTT_AlignedQuad.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_AlignedQuad allocate(Arena arena) {
        return new STBTT_AlignedQuad(arena.allocate(LAYOUT));
    }

    public static STBTT_AlignedQuad.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_AlignedQuad.Ptr(segment);
    }

    public static STBTT_AlignedQuad clone(Arena arena, STBTT_AlignedQuad src) {
        STBTT_AlignedQuad ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float x0() {
        return segment.get(LAYOUT$x0, OFFSET$x0);
    }

    public STBTT_AlignedQuad x0(float value) {
        segment.set(LAYOUT$x0, OFFSET$x0, value);
        return this;
    }

    public float y0() {
        return segment.get(LAYOUT$y0, OFFSET$y0);
    }

    public STBTT_AlignedQuad y0(float value) {
        segment.set(LAYOUT$y0, OFFSET$y0, value);
        return this;
    }

    public float s0() {
        return segment.get(LAYOUT$s0, OFFSET$s0);
    }

    public STBTT_AlignedQuad s0(float value) {
        segment.set(LAYOUT$s0, OFFSET$s0, value);
        return this;
    }

    public float t0() {
        return segment.get(LAYOUT$t0, OFFSET$t0);
    }

    public STBTT_AlignedQuad t0(float value) {
        segment.set(LAYOUT$t0, OFFSET$t0, value);
        return this;
    }

    public float x1() {
        return segment.get(LAYOUT$x1, OFFSET$x1);
    }

    public STBTT_AlignedQuad x1(float value) {
        segment.set(LAYOUT$x1, OFFSET$x1, value);
        return this;
    }

    public float y1() {
        return segment.get(LAYOUT$y1, OFFSET$y1);
    }

    public STBTT_AlignedQuad y1(float value) {
        segment.set(LAYOUT$y1, OFFSET$y1, value);
        return this;
    }

    public float s1() {
        return segment.get(LAYOUT$s1, OFFSET$s1);
    }

    public STBTT_AlignedQuad s1(float value) {
        segment.set(LAYOUT$s1, OFFSET$s1, value);
        return this;
    }

    public float t1() {
        return segment.get(LAYOUT$t1, OFFSET$t1);
    }

    public STBTT_AlignedQuad t1(float value) {
        segment.set(LAYOUT$t1, OFFSET$t1, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x0"),
        ValueLayout.JAVA_FLOAT.withName("y0"),
        ValueLayout.JAVA_FLOAT.withName("s0"),
        ValueLayout.JAVA_FLOAT.withName("t0"),
        ValueLayout.JAVA_FLOAT.withName("x1"),
        ValueLayout.JAVA_FLOAT.withName("y1"),
        ValueLayout.JAVA_FLOAT.withName("s1"),
        ValueLayout.JAVA_FLOAT.withName("t1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x0 = PathElement.groupElement("x0");
    public static final PathElement PATH$y0 = PathElement.groupElement("y0");
    public static final PathElement PATH$s0 = PathElement.groupElement("s0");
    public static final PathElement PATH$t0 = PathElement.groupElement("t0");
    public static final PathElement PATH$x1 = PathElement.groupElement("x1");
    public static final PathElement PATH$y1 = PathElement.groupElement("y1");
    public static final PathElement PATH$s1 = PathElement.groupElement("s1");
    public static final PathElement PATH$t1 = PathElement.groupElement("t1");

    public static final OfFloat LAYOUT$x0 = (OfFloat) LAYOUT.select(PATH$x0);
    public static final OfFloat LAYOUT$y0 = (OfFloat) LAYOUT.select(PATH$y0);
    public static final OfFloat LAYOUT$s0 = (OfFloat) LAYOUT.select(PATH$s0);
    public static final OfFloat LAYOUT$t0 = (OfFloat) LAYOUT.select(PATH$t0);
    public static final OfFloat LAYOUT$x1 = (OfFloat) LAYOUT.select(PATH$x1);
    public static final OfFloat LAYOUT$y1 = (OfFloat) LAYOUT.select(PATH$y1);
    public static final OfFloat LAYOUT$s1 = (OfFloat) LAYOUT.select(PATH$s1);
    public static final OfFloat LAYOUT$t1 = (OfFloat) LAYOUT.select(PATH$t1);

    public static final long SIZE$x0 = LAYOUT$x0.byteSize();
    public static final long SIZE$y0 = LAYOUT$y0.byteSize();
    public static final long SIZE$s0 = LAYOUT$s0.byteSize();
    public static final long SIZE$t0 = LAYOUT$t0.byteSize();
    public static final long SIZE$x1 = LAYOUT$x1.byteSize();
    public static final long SIZE$y1 = LAYOUT$y1.byteSize();
    public static final long SIZE$s1 = LAYOUT$s1.byteSize();
    public static final long SIZE$t1 = LAYOUT$t1.byteSize();

    public static final long OFFSET$x0 = LAYOUT.byteOffset(PATH$x0);
    public static final long OFFSET$y0 = LAYOUT.byteOffset(PATH$y0);
    public static final long OFFSET$s0 = LAYOUT.byteOffset(PATH$s0);
    public static final long OFFSET$t0 = LAYOUT.byteOffset(PATH$t0);
    public static final long OFFSET$x1 = LAYOUT.byteOffset(PATH$x1);
    public static final long OFFSET$y1 = LAYOUT.byteOffset(PATH$y1);
    public static final long OFFSET$s1 = LAYOUT.byteOffset(PATH$s1);
    public static final long OFFSET$t1 = LAYOUT.byteOffset(PATH$t1);
}
