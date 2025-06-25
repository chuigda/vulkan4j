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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrOffset2Di.html"><code>XrOffset2Di</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrOffset2Di {
///     int32_t x; // @link substring="x" target="#x"
///     int32_t y; // @link substring="y" target="#y"
/// } XrOffset2Di;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrOffset2Di.html"><code>XrOffset2Di</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrOffset2Di(@NotNull MemorySegment segment) implements IXrOffset2Di {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrOffset2Di.html"><code>XrOffset2Di</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrOffset2Di}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrOffset2Di to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrOffset2Di.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrOffset2Di, Iterable<XrOffset2Di> {
        public long size() {
            return segment.byteSize() / XrOffset2Di.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrOffset2Di at(long index) {
            return new XrOffset2Di(segment.asSlice(index * XrOffset2Di.BYTES, XrOffset2Di.BYTES));
        }

        public XrOffset2Di.Ptr at(long index, @NotNull Consumer<@NotNull XrOffset2Di> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrOffset2Di value) {
            MemorySegment s = segment.asSlice(index * XrOffset2Di.BYTES, XrOffset2Di.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrOffset2Di.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrOffset2Di.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrOffset2Di.BYTES,
                (end - start) * XrOffset2Di.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrOffset2Di.BYTES));
        }

        public XrOffset2Di[] toArray() {
            XrOffset2Di[] ret = new XrOffset2Di[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrOffset2Di> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrOffset2Di> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrOffset2Di.BYTES;
            }

            @Override
            public XrOffset2Di next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrOffset2Di ret = new XrOffset2Di(segment.asSlice(0, XrOffset2Di.BYTES));
                segment = segment.asSlice(XrOffset2Di.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrOffset2Di allocate(Arena arena) {
        return new XrOffset2Di(arena.allocate(LAYOUT));
    }

    public static XrOffset2Di.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrOffset2Di.Ptr(segment);
    }

    public static XrOffset2Di clone(Arena arena, XrOffset2Di src) {
        XrOffset2Di ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public XrOffset2Di x(int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public XrOffset2Di y(int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
}
