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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFovf.html"><code>XrFovf</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFovf {
///     float angleLeft; // @link substring="angleLeft" target="#angleLeft"
///     float angleRight; // @link substring="angleRight" target="#angleRight"
///     float angleUp; // @link substring="angleUp" target="#angleUp"
///     float angleDown; // @link substring="angleDown" target="#angleDown"
/// } XrFovf;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFovf.html"><code>XrFovf</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFovf(@NotNull MemorySegment segment) implements IXrFovf {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFovf.html"><code>XrFovf</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFovf}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFovf to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFovf.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFovf, Iterable<XrFovf> {
        public long size() {
            return segment.byteSize() / XrFovf.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFovf at(long index) {
            return new XrFovf(segment.asSlice(index * XrFovf.BYTES, XrFovf.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrFovf> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrFovf value) {
            MemorySegment s = segment.asSlice(index * XrFovf.BYTES, XrFovf.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFovf.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFovf.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFovf.BYTES,
                (end - start) * XrFovf.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFovf.BYTES));
        }

        public XrFovf[] toArray() {
            XrFovf[] ret = new XrFovf[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFovf> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFovf> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFovf.BYTES;
            }

            @Override
            public XrFovf next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFovf ret = new XrFovf(segment.asSlice(0, XrFovf.BYTES));
                segment = segment.asSlice(XrFovf.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFovf allocate(Arena arena) {
        return new XrFovf(arena.allocate(LAYOUT));
    }

    public static XrFovf.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrFovf.Ptr(segment);
    }

    public static XrFovf clone(Arena arena, XrFovf src) {
        XrFovf ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float angleLeft() {
        return segment.get(LAYOUT$angleLeft, OFFSET$angleLeft);
    }

    public XrFovf angleLeft(float value) {
        segment.set(LAYOUT$angleLeft, OFFSET$angleLeft, value);
        return this;
    }

    public float angleRight() {
        return segment.get(LAYOUT$angleRight, OFFSET$angleRight);
    }

    public XrFovf angleRight(float value) {
        segment.set(LAYOUT$angleRight, OFFSET$angleRight, value);
        return this;
    }

    public float angleUp() {
        return segment.get(LAYOUT$angleUp, OFFSET$angleUp);
    }

    public XrFovf angleUp(float value) {
        segment.set(LAYOUT$angleUp, OFFSET$angleUp, value);
        return this;
    }

    public float angleDown() {
        return segment.get(LAYOUT$angleDown, OFFSET$angleDown);
    }

    public XrFovf angleDown(float value) {
        segment.set(LAYOUT$angleDown, OFFSET$angleDown, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("angleLeft"),
        ValueLayout.JAVA_FLOAT.withName("angleRight"),
        ValueLayout.JAVA_FLOAT.withName("angleUp"),
        ValueLayout.JAVA_FLOAT.withName("angleDown")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$angleLeft = PathElement.groupElement("angleLeft");
    public static final PathElement PATH$angleRight = PathElement.groupElement("angleRight");
    public static final PathElement PATH$angleUp = PathElement.groupElement("angleUp");
    public static final PathElement PATH$angleDown = PathElement.groupElement("angleDown");

    public static final OfFloat LAYOUT$angleLeft = (OfFloat) LAYOUT.select(PATH$angleLeft);
    public static final OfFloat LAYOUT$angleRight = (OfFloat) LAYOUT.select(PATH$angleRight);
    public static final OfFloat LAYOUT$angleUp = (OfFloat) LAYOUT.select(PATH$angleUp);
    public static final OfFloat LAYOUT$angleDown = (OfFloat) LAYOUT.select(PATH$angleDown);

    public static final long SIZE$angleLeft = LAYOUT$angleLeft.byteSize();
    public static final long SIZE$angleRight = LAYOUT$angleRight.byteSize();
    public static final long SIZE$angleUp = LAYOUT$angleUp.byteSize();
    public static final long SIZE$angleDown = LAYOUT$angleDown.byteSize();

    public static final long OFFSET$angleLeft = LAYOUT.byteOffset(PATH$angleLeft);
    public static final long OFFSET$angleRight = LAYOUT.byteOffset(PATH$angleRight);
    public static final long OFFSET$angleUp = LAYOUT.byteOffset(PATH$angleUp);
    public static final long OFFSET$angleDown = LAYOUT.byteOffset(PATH$angleDown);
}
