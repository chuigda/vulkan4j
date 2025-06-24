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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemGraphicsProperties.html"><code>XrSystemGraphicsProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemGraphicsProperties {
///     uint32_t maxSwapchainImageHeight; // @link substring="maxSwapchainImageHeight" target="#maxSwapchainImageHeight"
///     uint32_t maxSwapchainImageWidth; // @link substring="maxSwapchainImageWidth" target="#maxSwapchainImageWidth"
///     uint32_t maxLayerCount; // @link substring="maxLayerCount" target="#maxLayerCount"
/// } XrSystemGraphicsProperties;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemGraphicsProperties.html"><code>XrSystemGraphicsProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemGraphicsProperties(@NotNull MemorySegment segment) implements IXrSystemGraphicsProperties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemGraphicsProperties.html"><code>XrSystemGraphicsProperties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemGraphicsProperties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemGraphicsProperties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemGraphicsProperties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemGraphicsProperties, Iterable<XrSystemGraphicsProperties> {
        public long size() {
            return segment.byteSize() / XrSystemGraphicsProperties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemGraphicsProperties at(long index) {
            return new XrSystemGraphicsProperties(segment.asSlice(index * XrSystemGraphicsProperties.BYTES, XrSystemGraphicsProperties.BYTES));
        }

        public void write(long index, @NotNull XrSystemGraphicsProperties value) {
            MemorySegment s = segment.asSlice(index * XrSystemGraphicsProperties.BYTES, XrSystemGraphicsProperties.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemGraphicsProperties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemGraphicsProperties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemGraphicsProperties.BYTES,
                (end - start) * XrSystemGraphicsProperties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemGraphicsProperties.BYTES));
        }

        public XrSystemGraphicsProperties[] toArray() {
            XrSystemGraphicsProperties[] ret = new XrSystemGraphicsProperties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemGraphicsProperties> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemGraphicsProperties> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemGraphicsProperties.BYTES;
            }

            @Override
            public XrSystemGraphicsProperties next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemGraphicsProperties ret = new XrSystemGraphicsProperties(segment.asSlice(0, XrSystemGraphicsProperties.BYTES));
                segment = segment.asSlice(XrSystemGraphicsProperties.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemGraphicsProperties allocate(Arena arena) {
        return new XrSystemGraphicsProperties(arena.allocate(LAYOUT));
    }

    public static XrSystemGraphicsProperties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSystemGraphicsProperties.Ptr(segment);
    }

    public static XrSystemGraphicsProperties clone(Arena arena, XrSystemGraphicsProperties src) {
        XrSystemGraphicsProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int maxSwapchainImageHeight() {
        return segment.get(LAYOUT$maxSwapchainImageHeight, OFFSET$maxSwapchainImageHeight);
    }

    public XrSystemGraphicsProperties maxSwapchainImageHeight(@Unsigned int value) {
        segment.set(LAYOUT$maxSwapchainImageHeight, OFFSET$maxSwapchainImageHeight, value);
        return this;
    }

    public @Unsigned int maxSwapchainImageWidth() {
        return segment.get(LAYOUT$maxSwapchainImageWidth, OFFSET$maxSwapchainImageWidth);
    }

    public XrSystemGraphicsProperties maxSwapchainImageWidth(@Unsigned int value) {
        segment.set(LAYOUT$maxSwapchainImageWidth, OFFSET$maxSwapchainImageWidth, value);
        return this;
    }

    public @Unsigned int maxLayerCount() {
        return segment.get(LAYOUT$maxLayerCount, OFFSET$maxLayerCount);
    }

    public XrSystemGraphicsProperties maxLayerCount(@Unsigned int value) {
        segment.set(LAYOUT$maxLayerCount, OFFSET$maxLayerCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("maxSwapchainImageHeight"),
        ValueLayout.JAVA_INT.withName("maxSwapchainImageWidth"),
        ValueLayout.JAVA_INT.withName("maxLayerCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$maxSwapchainImageHeight = PathElement.groupElement("maxSwapchainImageHeight");
    public static final PathElement PATH$maxSwapchainImageWidth = PathElement.groupElement("maxSwapchainImageWidth");
    public static final PathElement PATH$maxLayerCount = PathElement.groupElement("maxLayerCount");

    public static final OfInt LAYOUT$maxSwapchainImageHeight = (OfInt) LAYOUT.select(PATH$maxSwapchainImageHeight);
    public static final OfInt LAYOUT$maxSwapchainImageWidth = (OfInt) LAYOUT.select(PATH$maxSwapchainImageWidth);
    public static final OfInt LAYOUT$maxLayerCount = (OfInt) LAYOUT.select(PATH$maxLayerCount);

    public static final long SIZE$maxSwapchainImageHeight = LAYOUT$maxSwapchainImageHeight.byteSize();
    public static final long SIZE$maxSwapchainImageWidth = LAYOUT$maxSwapchainImageWidth.byteSize();
    public static final long SIZE$maxLayerCount = LAYOUT$maxLayerCount.byteSize();

    public static final long OFFSET$maxSwapchainImageHeight = LAYOUT.byteOffset(PATH$maxSwapchainImageHeight);
    public static final long OFFSET$maxSwapchainImageWidth = LAYOUT.byteOffset(PATH$maxSwapchainImageWidth);
    public static final long OFFSET$maxLayerCount = LAYOUT.byteOffset(PATH$maxLayerCount);
}
