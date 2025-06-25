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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrColor3fKHR.html"><code>XrColor3fKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrColor3fKHR {
///     float r; // @link substring="r" target="#r"
///     float g; // @link substring="g" target="#g"
///     float b; // @link substring="b" target="#b"
/// } XrColor3fKHR;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrColor3fKHR.html"><code>XrColor3fKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrColor3fKHR(@NotNull MemorySegment segment) implements IXrColor3fKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrColor3fKHR.html"><code>XrColor3fKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrColor3fKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrColor3fKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrColor3fKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrColor3fKHR, Iterable<XrColor3fKHR> {
        public long size() {
            return segment.byteSize() / XrColor3fKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrColor3fKHR at(long index) {
            return new XrColor3fKHR(segment.asSlice(index * XrColor3fKHR.BYTES, XrColor3fKHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrColor3fKHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrColor3fKHR value) {
            MemorySegment s = segment.asSlice(index * XrColor3fKHR.BYTES, XrColor3fKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrColor3fKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrColor3fKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrColor3fKHR.BYTES,
                (end - start) * XrColor3fKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrColor3fKHR.BYTES));
        }

        public XrColor3fKHR[] toArray() {
            XrColor3fKHR[] ret = new XrColor3fKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrColor3fKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrColor3fKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrColor3fKHR.BYTES;
            }

            @Override
            public XrColor3fKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrColor3fKHR ret = new XrColor3fKHR(segment.asSlice(0, XrColor3fKHR.BYTES));
                segment = segment.asSlice(XrColor3fKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrColor3fKHR allocate(Arena arena) {
        return new XrColor3fKHR(arena.allocate(LAYOUT));
    }

    public static XrColor3fKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrColor3fKHR.Ptr(segment);
    }

    public static XrColor3fKHR clone(Arena arena, XrColor3fKHR src) {
        XrColor3fKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float r() {
        return segment.get(LAYOUT$r, OFFSET$r);
    }

    public XrColor3fKHR r(float value) {
        segment.set(LAYOUT$r, OFFSET$r, value);
        return this;
    }

    public float g() {
        return segment.get(LAYOUT$g, OFFSET$g);
    }

    public XrColor3fKHR g(float value) {
        segment.set(LAYOUT$g, OFFSET$g, value);
        return this;
    }

    public float b() {
        return segment.get(LAYOUT$b, OFFSET$b);
    }

    public XrColor3fKHR b(float value) {
        segment.set(LAYOUT$b, OFFSET$b, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("r"),
        ValueLayout.JAVA_FLOAT.withName("g"),
        ValueLayout.JAVA_FLOAT.withName("b")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$r = PathElement.groupElement("r");
    public static final PathElement PATH$g = PathElement.groupElement("g");
    public static final PathElement PATH$b = PathElement.groupElement("b");

    public static final OfFloat LAYOUT$r = (OfFloat) LAYOUT.select(PATH$r);
    public static final OfFloat LAYOUT$g = (OfFloat) LAYOUT.select(PATH$g);
    public static final OfFloat LAYOUT$b = (OfFloat) LAYOUT.select(PATH$b);

    public static final long SIZE$r = LAYOUT$r.byteSize();
    public static final long SIZE$g = LAYOUT$g.byteSize();
    public static final long SIZE$b = LAYOUT$b.byteSize();

    public static final long OFFSET$r = LAYOUT.byteOffset(PATH$r);
    public static final long OFFSET$g = LAYOUT.byteOffset(PATH$g);
    public static final long OFFSET$b = LAYOUT.byteOffset(PATH$b);
}
