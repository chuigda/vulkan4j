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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrForceFeedbackCurlApplyLocationMNDX.html"><code>XrForceFeedbackCurlApplyLocationMNDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrForceFeedbackCurlApplyLocationMNDX {
///     XrForceFeedbackCurlLocationMNDX location; // @link substring="XrForceFeedbackCurlLocationMNDX" target="XrForceFeedbackCurlLocationMNDX" @link substring="location" target="#location"
///     float value; // @link substring="value" target="#value"
/// } XrForceFeedbackCurlApplyLocationMNDX;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrForceFeedbackCurlApplyLocationMNDX.html"><code>XrForceFeedbackCurlApplyLocationMNDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrForceFeedbackCurlApplyLocationMNDX(@NotNull MemorySegment segment) implements IXrForceFeedbackCurlApplyLocationMNDX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrForceFeedbackCurlApplyLocationMNDX.html"><code>XrForceFeedbackCurlApplyLocationMNDX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrForceFeedbackCurlApplyLocationMNDX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrForceFeedbackCurlApplyLocationMNDX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrForceFeedbackCurlApplyLocationMNDX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrForceFeedbackCurlApplyLocationMNDX, Iterable<XrForceFeedbackCurlApplyLocationMNDX> {
        public long size() {
            return segment.byteSize() / XrForceFeedbackCurlApplyLocationMNDX.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrForceFeedbackCurlApplyLocationMNDX at(long index) {
            return new XrForceFeedbackCurlApplyLocationMNDX(segment.asSlice(index * XrForceFeedbackCurlApplyLocationMNDX.BYTES, XrForceFeedbackCurlApplyLocationMNDX.BYTES));
        }

        public XrForceFeedbackCurlApplyLocationMNDX.Ptr at(long index, @NotNull Consumer<@NotNull XrForceFeedbackCurlApplyLocationMNDX> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrForceFeedbackCurlApplyLocationMNDX value) {
            MemorySegment s = segment.asSlice(index * XrForceFeedbackCurlApplyLocationMNDX.BYTES, XrForceFeedbackCurlApplyLocationMNDX.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrForceFeedbackCurlApplyLocationMNDX.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrForceFeedbackCurlApplyLocationMNDX.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrForceFeedbackCurlApplyLocationMNDX.BYTES,
                (end - start) * XrForceFeedbackCurlApplyLocationMNDX.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrForceFeedbackCurlApplyLocationMNDX.BYTES));
        }

        public XrForceFeedbackCurlApplyLocationMNDX[] toArray() {
            XrForceFeedbackCurlApplyLocationMNDX[] ret = new XrForceFeedbackCurlApplyLocationMNDX[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrForceFeedbackCurlApplyLocationMNDX> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrForceFeedbackCurlApplyLocationMNDX> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrForceFeedbackCurlApplyLocationMNDX.BYTES;
            }

            @Override
            public XrForceFeedbackCurlApplyLocationMNDX next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrForceFeedbackCurlApplyLocationMNDX ret = new XrForceFeedbackCurlApplyLocationMNDX(segment.asSlice(0, XrForceFeedbackCurlApplyLocationMNDX.BYTES));
                segment = segment.asSlice(XrForceFeedbackCurlApplyLocationMNDX.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrForceFeedbackCurlApplyLocationMNDX allocate(Arena arena) {
        return new XrForceFeedbackCurlApplyLocationMNDX(arena.allocate(LAYOUT));
    }

    public static XrForceFeedbackCurlApplyLocationMNDX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrForceFeedbackCurlApplyLocationMNDX.Ptr(segment);
    }

    public static XrForceFeedbackCurlApplyLocationMNDX clone(Arena arena, XrForceFeedbackCurlApplyLocationMNDX src) {
        XrForceFeedbackCurlApplyLocationMNDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrForceFeedbackCurlLocationMNDX.class) int location() {
        return segment.get(LAYOUT$location, OFFSET$location);
    }

    public XrForceFeedbackCurlApplyLocationMNDX location(@EnumType(XrForceFeedbackCurlLocationMNDX.class) int value) {
        segment.set(LAYOUT$location, OFFSET$location, value);
        return this;
    }

    public float value() {
        return segment.get(LAYOUT$value, OFFSET$value);
    }

    public XrForceFeedbackCurlApplyLocationMNDX value(float value) {
        segment.set(LAYOUT$value, OFFSET$value, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_FLOAT.withName("value")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$location = PathElement.groupElement("location");
    public static final PathElement PATH$value = PathElement.groupElement("value");

    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);
    public static final OfFloat LAYOUT$value = (OfFloat) LAYOUT.select(PATH$value);

    public static final long SIZE$location = LAYOUT$location.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);
}
