package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExtent3Df.html"><code>XrExtent3Df</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrExtent3Df {
///     float width; // @link substring="width" target="#width"
///     float height; // @link substring="height" target="#height"
///     float depth; // @link substring="depth" target="#depth"
/// } XrExtent3Df;
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
///
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExtent3Df.html"><code>XrExtent3Df</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrExtent3Df(@NotNull MemorySegment segment) implements IXrExtent3Df {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExtent3Df.html"><code>XrExtent3Df</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrExtent3Df}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrExtent3Df to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrExtent3Df.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrExtent3Df, Iterable<XrExtent3Df> {
        public long size() {
            return segment.byteSize() / XrExtent3Df.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrExtent3Df at(long index) {
            return new XrExtent3Df(segment.asSlice(index * XrExtent3Df.BYTES, XrExtent3Df.BYTES));
        }

        public void write(long index, @NotNull XrExtent3Df value) {
            MemorySegment s = segment.asSlice(index * XrExtent3Df.BYTES, XrExtent3Df.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrExtent3Df.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrExtent3Df.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrExtent3Df.BYTES,
                (end - start) * XrExtent3Df.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrExtent3Df.BYTES));
        }

        public XrExtent3Df[] toArray() {
            XrExtent3Df[] ret = new XrExtent3Df[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrExtent3Df> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrExtent3Df> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrExtent3Df.BYTES;
            }

            @Override
            public XrExtent3Df next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrExtent3Df ret = new XrExtent3Df(segment.asSlice(0, XrExtent3Df.BYTES));
                segment = segment.asSlice(XrExtent3Df.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrExtent3Df allocate(Arena arena) {
        return new XrExtent3Df(arena.allocate(LAYOUT));
    }

    public static XrExtent3Df.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrExtent3Df.Ptr(segment);
    }

    public static XrExtent3Df clone(Arena arena, XrExtent3Df src) {
        XrExtent3Df ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public XrExtent3Df width(float value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public float height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public XrExtent3Df height(float value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public float depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public XrExtent3Df depth(float value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("width"),
        ValueLayout.JAVA_FLOAT.withName("height"),
        ValueLayout.JAVA_FLOAT.withName("depth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$depth = PathElement.groupElement("depth");

    public static final OfFloat LAYOUT$width = (OfFloat) LAYOUT.select(PATH$width);
    public static final OfFloat LAYOUT$height = (OfFloat) LAYOUT.select(PATH$height);
    public static final OfFloat LAYOUT$depth = (OfFloat) LAYOUT.select(PATH$depth);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$depth = LAYOUT$depth.byteSize();

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);
}
