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

/// Represents a pointer to a {@code stbtt_vertex} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct stbtt_vertex {
///     stbtt_vertex_type x; // @link substring="x" target="#x"
///     stbtt_vertex_type y; // @link substring="y" target="#y"
///     stbtt_vertex_type cx; // @link substring="cx" target="#cx"
///     stbtt_vertex_type cy; // @link substring="cy" target="#cy"
///     stbtt_vertex_type cx1; // @link substring="cx1" target="#cx1"
///     stbtt_vertex_type cy1; // @link substring="cy1" target="#cy1"
///     char type; // @link substring="type" target="#type"
///     char padding; // @link substring="padding" target="#padding"
/// } stbtt_vertex;
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
public record STBTT_Vertex(@NotNull MemorySegment segment) implements ISTBTT_Vertex {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link STBTT_Vertex}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISTBTT_Vertex to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code STBTT_Vertex.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISTBTT_Vertex, Iterable<STBTT_Vertex> {
        public long size() {
            return segment.byteSize() / STBTT_Vertex.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull STBTT_Vertex at(long index) {
            return new STBTT_Vertex(segment.asSlice(index * STBTT_Vertex.BYTES, STBTT_Vertex.BYTES));
        }

        public void write(long index, @NotNull STBTT_Vertex value) {
            MemorySegment s = segment.asSlice(index * STBTT_Vertex.BYTES, STBTT_Vertex.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * STBTT_Vertex.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * STBTT_Vertex.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * STBTT_Vertex.BYTES,
                (end - start) * STBTT_Vertex.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * STBTT_Vertex.BYTES));
        }

        public STBTT_Vertex[] toArray() {
            STBTT_Vertex[] ret = new STBTT_Vertex[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<STBTT_Vertex> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<STBTT_Vertex> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= STBTT_Vertex.BYTES;
            }

            @Override
            public STBTT_Vertex next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                STBTT_Vertex ret = new STBTT_Vertex(segment.asSlice(0, STBTT_Vertex.BYTES));
                segment = segment.asSlice(STBTT_Vertex.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static STBTT_Vertex allocate(Arena arena) {
        return new STBTT_Vertex(arena.allocate(LAYOUT));
    }

    public static STBTT_Vertex.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new STBTT_Vertex.Ptr(segment);
    }

    public static STBTT_Vertex clone(Arena arena, STBTT_Vertex src) {
        STBTT_Vertex ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("stbtt_vertex_type") short x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public STBTT_Vertex x(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public @NativeType("stbtt_vertex_type") short y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public STBTT_Vertex y(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public @NativeType("stbtt_vertex_type") short cx() {
        return segment.get(LAYOUT$cx, OFFSET$cx);
    }

    public STBTT_Vertex cx(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$cx, OFFSET$cx, value);
        return this;
    }

    public @NativeType("stbtt_vertex_type") short cy() {
        return segment.get(LAYOUT$cy, OFFSET$cy);
    }

    public STBTT_Vertex cy(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$cy, OFFSET$cy, value);
        return this;
    }

    public @NativeType("stbtt_vertex_type") short cx1() {
        return segment.get(LAYOUT$cx1, OFFSET$cx1);
    }

    public STBTT_Vertex cx1(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$cx1, OFFSET$cx1, value);
        return this;
    }

    public @NativeType("stbtt_vertex_type") short cy1() {
        return segment.get(LAYOUT$cy1, OFFSET$cy1);
    }

    public STBTT_Vertex cy1(@NativeType("stbtt_vertex_type") short value) {
        segment.set(LAYOUT$cy1, OFFSET$cy1, value);
        return this;
    }

    public byte type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public STBTT_Vertex type(byte value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public byte padding() {
        return segment.get(LAYOUT$padding, OFFSET$padding);
    }

    public STBTT_Vertex padding(byte value) {
        segment.set(LAYOUT$padding, OFFSET$padding, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("x"),
        ValueLayout.JAVA_SHORT.withName("y"),
        ValueLayout.JAVA_SHORT.withName("cx"),
        ValueLayout.JAVA_SHORT.withName("cy"),
        ValueLayout.JAVA_SHORT.withName("cx1"),
        ValueLayout.JAVA_SHORT.withName("cy1"),
        ValueLayout.JAVA_BYTE.withName("type"),
        ValueLayout.JAVA_BYTE.withName("padding")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$cx = PathElement.groupElement("cx");
    public static final PathElement PATH$cy = PathElement.groupElement("cy");
    public static final PathElement PATH$cx1 = PathElement.groupElement("cx1");
    public static final PathElement PATH$cy1 = PathElement.groupElement("cy1");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");

    public static final OfShort LAYOUT$x = (OfShort) LAYOUT.select(PATH$x);
    public static final OfShort LAYOUT$y = (OfShort) LAYOUT.select(PATH$y);
    public static final OfShort LAYOUT$cx = (OfShort) LAYOUT.select(PATH$cx);
    public static final OfShort LAYOUT$cy = (OfShort) LAYOUT.select(PATH$cy);
    public static final OfShort LAYOUT$cx1 = (OfShort) LAYOUT.select(PATH$cx1);
    public static final OfShort LAYOUT$cy1 = (OfShort) LAYOUT.select(PATH$cy1);
    public static final OfByte LAYOUT$type = (OfByte) LAYOUT.select(PATH$type);
    public static final OfByte LAYOUT$padding = (OfByte) LAYOUT.select(PATH$padding);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$cx = LAYOUT$cx.byteSize();
    public static final long SIZE$cy = LAYOUT$cy.byteSize();
    public static final long SIZE$cx1 = LAYOUT$cx1.byteSize();
    public static final long SIZE$cy1 = LAYOUT$cy1.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$cx = LAYOUT.byteOffset(PATH$cx);
    public static final long OFFSET$cy = LAYOUT.byteOffset(PATH$cy);
    public static final long OFFSET$cx1 = LAYOUT.byteOffset(PATH$cx1);
    public static final long OFFSET$cy1 = LAYOUT.byteOffset(PATH$cy1);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
}
