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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainSubImage.html"><code>XrSwapchainSubImage</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSwapchainSubImage {
///     XrSwapchain swapchain; // @link substring="XrSwapchain" target="XrSwapchain" @link substring="swapchain" target="#swapchain"
///     XrRect2Di imageRect; // @link substring="XrRect2Di" target="XrRect2Di" @link substring="imageRect" target="#imageRect"
///     uint32_t imageArrayIndex; // @link substring="imageArrayIndex" target="#imageArrayIndex"
/// } XrSwapchainSubImage;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainSubImage.html"><code>XrSwapchainSubImage</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSwapchainSubImage(@NotNull MemorySegment segment) implements IXrSwapchainSubImage {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainSubImage.html"><code>XrSwapchainSubImage</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSwapchainSubImage}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSwapchainSubImage to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSwapchainSubImage.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSwapchainSubImage, Iterable<XrSwapchainSubImage> {
        public long size() {
            return segment.byteSize() / XrSwapchainSubImage.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSwapchainSubImage at(long index) {
            return new XrSwapchainSubImage(segment.asSlice(index * XrSwapchainSubImage.BYTES, XrSwapchainSubImage.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSwapchainSubImage> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSwapchainSubImage value) {
            MemorySegment s = segment.asSlice(index * XrSwapchainSubImage.BYTES, XrSwapchainSubImage.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSwapchainSubImage.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSwapchainSubImage.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSwapchainSubImage.BYTES,
                (end - start) * XrSwapchainSubImage.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSwapchainSubImage.BYTES));
        }

        public XrSwapchainSubImage[] toArray() {
            XrSwapchainSubImage[] ret = new XrSwapchainSubImage[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSwapchainSubImage> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSwapchainSubImage> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSwapchainSubImage.BYTES;
            }

            @Override
            public XrSwapchainSubImage next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSwapchainSubImage ret = new XrSwapchainSubImage(segment.asSlice(0, XrSwapchainSubImage.BYTES));
                segment = segment.asSlice(XrSwapchainSubImage.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSwapchainSubImage allocate(Arena arena) {
        return new XrSwapchainSubImage(arena.allocate(LAYOUT));
    }

    public static XrSwapchainSubImage.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSwapchainSubImage.Ptr(segment);
    }

    public static XrSwapchainSubImage clone(Arena arena, XrSwapchainSubImage src) {
        XrSwapchainSubImage ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable XrSwapchain swapchain() {
        MemorySegment s = segment.asSlice(OFFSET$swapchain, SIZE$swapchain);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSwapchain(s);
    }

    public XrSwapchainSubImage swapchain(@Nullable XrSwapchain value) {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrRect2Di imageRect() {
        return new XrRect2Di(segment.asSlice(OFFSET$imageRect, LAYOUT$imageRect));
    }

    public XrSwapchainSubImage imageRect(@NotNull XrRect2Di value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageRect, SIZE$imageRect);
        return this;
    }

    public XrSwapchainSubImage imageRect(Consumer<@NotNull XrRect2Di> consumer) {
        consumer.accept(imageRect());
        return this;
    }

    public @Unsigned int imageArrayIndex() {
        return segment.get(LAYOUT$imageArrayIndex, OFFSET$imageArrayIndex);
    }

    public XrSwapchainSubImage imageArrayIndex(@Unsigned int value) {
        segment.set(LAYOUT$imageArrayIndex, OFFSET$imageArrayIndex, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("swapchain"),
        XrRect2Di.LAYOUT.withName("imageRect"),
        ValueLayout.JAVA_INT.withName("imageArrayIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$imageRect = PathElement.groupElement("imageRect");
    public static final PathElement PATH$imageArrayIndex = PathElement.groupElement("imageArrayIndex");

    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final StructLayout LAYOUT$imageRect = (StructLayout) LAYOUT.select(PATH$imageRect);
    public static final OfInt LAYOUT$imageArrayIndex = (OfInt) LAYOUT.select(PATH$imageArrayIndex);

    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$imageRect = LAYOUT$imageRect.byteSize();
    public static final long SIZE$imageArrayIndex = LAYOUT$imageArrayIndex.byteSize();

    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageRect = LAYOUT.byteOffset(PATH$imageRect);
    public static final long OFFSET$imageArrayIndex = LAYOUT.byteOffset(PATH$imageArrayIndex);
}
