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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQuaternionf.html"><code>XrQuaternionf</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrQuaternionf {
///     float x; // @link substring="x" target="#x"
///     float y; // @link substring="y" target="#y"
///     float z; // @link substring="z" target="#z"
///     float w; // @link substring="w" target="#w"
/// } XrQuaternionf;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQuaternionf.html"><code>XrQuaternionf</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrQuaternionf(@NotNull MemorySegment segment) implements IXrQuaternionf {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQuaternionf.html"><code>XrQuaternionf</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrQuaternionf}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrQuaternionf to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrQuaternionf.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrQuaternionf, Iterable<XrQuaternionf> {
        public long size() {
            return segment.byteSize() / XrQuaternionf.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrQuaternionf at(long index) {
            return new XrQuaternionf(segment.asSlice(index * XrQuaternionf.BYTES, XrQuaternionf.BYTES));
        }

        public void write(long index, @NotNull XrQuaternionf value) {
            MemorySegment s = segment.asSlice(index * XrQuaternionf.BYTES, XrQuaternionf.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrQuaternionf.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrQuaternionf.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrQuaternionf.BYTES,
                (end - start) * XrQuaternionf.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrQuaternionf.BYTES));
        }

        public XrQuaternionf[] toArray() {
            XrQuaternionf[] ret = new XrQuaternionf[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrQuaternionf> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrQuaternionf> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrQuaternionf.BYTES;
            }

            @Override
            public XrQuaternionf next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrQuaternionf ret = new XrQuaternionf(segment.asSlice(0, XrQuaternionf.BYTES));
                segment = segment.asSlice(XrQuaternionf.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrQuaternionf allocate(Arena arena) {
        return new XrQuaternionf(arena.allocate(LAYOUT));
    }

    public static XrQuaternionf.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrQuaternionf.Ptr(segment);
    }

    public static XrQuaternionf clone(Arena arena, XrQuaternionf src) {
        XrQuaternionf ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public XrQuaternionf x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public XrQuaternionf y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public float z() {
        return segment.get(LAYOUT$z, OFFSET$z);
    }

    public XrQuaternionf z(float value) {
        segment.set(LAYOUT$z, OFFSET$z, value);
        return this;
    }

    public float w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public XrQuaternionf w(float value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("z"),
        ValueLayout.JAVA_FLOAT.withName("w")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$z = PathElement.groupElement("z");
    public static final PathElement PATH$w = PathElement.groupElement("w");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$z = (OfFloat) LAYOUT.select(PATH$z);
    public static final OfFloat LAYOUT$w = (OfFloat) LAYOUT.select(PATH$w);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$z = LAYOUT$z.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$z = LAYOUT.byteOffset(PATH$z);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
}
