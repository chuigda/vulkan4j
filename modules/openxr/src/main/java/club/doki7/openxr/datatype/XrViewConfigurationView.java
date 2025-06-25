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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewConfigurationView.html"><code>XrViewConfigurationView</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrViewConfigurationView {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t recommendedImageRectWidth; // @link substring="recommendedImageRectWidth" target="#recommendedImageRectWidth"
///     uint32_t maxImageRectWidth; // @link substring="maxImageRectWidth" target="#maxImageRectWidth"
///     uint32_t recommendedImageRectHeight; // @link substring="recommendedImageRectHeight" target="#recommendedImageRectHeight"
///     uint32_t maxImageRectHeight; // @link substring="maxImageRectHeight" target="#maxImageRectHeight"
///     uint32_t recommendedSwapchainSampleCount; // @link substring="recommendedSwapchainSampleCount" target="#recommendedSwapchainSampleCount"
///     uint32_t maxSwapchainSampleCount; // @link substring="maxSwapchainSampleCount" target="#maxSwapchainSampleCount"
/// } XrViewConfigurationView;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIEW_CONFIGURATION_VIEW`
///
/// The {@code allocate} ({@link XrViewConfigurationView#allocate(Arena)}, {@link XrViewConfigurationView#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrViewConfigurationView#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewConfigurationView.html"><code>XrViewConfigurationView</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrViewConfigurationView(@NotNull MemorySegment segment) implements IXrViewConfigurationView {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewConfigurationView.html"><code>XrViewConfigurationView</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrViewConfigurationView}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrViewConfigurationView to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrViewConfigurationView.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrViewConfigurationView, Iterable<XrViewConfigurationView> {
        public long size() {
            return segment.byteSize() / XrViewConfigurationView.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrViewConfigurationView at(long index) {
            return new XrViewConfigurationView(segment.asSlice(index * XrViewConfigurationView.BYTES, XrViewConfigurationView.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrViewConfigurationView> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrViewConfigurationView value) {
            MemorySegment s = segment.asSlice(index * XrViewConfigurationView.BYTES, XrViewConfigurationView.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrViewConfigurationView.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrViewConfigurationView.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrViewConfigurationView.BYTES,
                (end - start) * XrViewConfigurationView.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrViewConfigurationView.BYTES));
        }

        public XrViewConfigurationView[] toArray() {
            XrViewConfigurationView[] ret = new XrViewConfigurationView[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrViewConfigurationView> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrViewConfigurationView> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrViewConfigurationView.BYTES;
            }

            @Override
            public XrViewConfigurationView next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrViewConfigurationView ret = new XrViewConfigurationView(segment.asSlice(0, XrViewConfigurationView.BYTES));
                segment = segment.asSlice(XrViewConfigurationView.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrViewConfigurationView allocate(Arena arena) {
        XrViewConfigurationView ret = new XrViewConfigurationView(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VIEW_CONFIGURATION_VIEW);
        return ret;
    }

    public static XrViewConfigurationView.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrViewConfigurationView.Ptr ret = new XrViewConfigurationView.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VIEW_CONFIGURATION_VIEW);
        }
        return ret;
    }

    public static XrViewConfigurationView clone(Arena arena, XrViewConfigurationView src) {
        XrViewConfigurationView ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VIEW_CONFIGURATION_VIEW);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrViewConfigurationView type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrViewConfigurationView next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrViewConfigurationView next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int recommendedImageRectWidth() {
        return segment.get(LAYOUT$recommendedImageRectWidth, OFFSET$recommendedImageRectWidth);
    }

    public XrViewConfigurationView recommendedImageRectWidth(@Unsigned int value) {
        segment.set(LAYOUT$recommendedImageRectWidth, OFFSET$recommendedImageRectWidth, value);
        return this;
    }

    public @Unsigned int maxImageRectWidth() {
        return segment.get(LAYOUT$maxImageRectWidth, OFFSET$maxImageRectWidth);
    }

    public XrViewConfigurationView maxImageRectWidth(@Unsigned int value) {
        segment.set(LAYOUT$maxImageRectWidth, OFFSET$maxImageRectWidth, value);
        return this;
    }

    public @Unsigned int recommendedImageRectHeight() {
        return segment.get(LAYOUT$recommendedImageRectHeight, OFFSET$recommendedImageRectHeight);
    }

    public XrViewConfigurationView recommendedImageRectHeight(@Unsigned int value) {
        segment.set(LAYOUT$recommendedImageRectHeight, OFFSET$recommendedImageRectHeight, value);
        return this;
    }

    public @Unsigned int maxImageRectHeight() {
        return segment.get(LAYOUT$maxImageRectHeight, OFFSET$maxImageRectHeight);
    }

    public XrViewConfigurationView maxImageRectHeight(@Unsigned int value) {
        segment.set(LAYOUT$maxImageRectHeight, OFFSET$maxImageRectHeight, value);
        return this;
    }

    public @Unsigned int recommendedSwapchainSampleCount() {
        return segment.get(LAYOUT$recommendedSwapchainSampleCount, OFFSET$recommendedSwapchainSampleCount);
    }

    public XrViewConfigurationView recommendedSwapchainSampleCount(@Unsigned int value) {
        segment.set(LAYOUT$recommendedSwapchainSampleCount, OFFSET$recommendedSwapchainSampleCount, value);
        return this;
    }

    public @Unsigned int maxSwapchainSampleCount() {
        return segment.get(LAYOUT$maxSwapchainSampleCount, OFFSET$maxSwapchainSampleCount);
    }

    public XrViewConfigurationView maxSwapchainSampleCount(@Unsigned int value) {
        segment.set(LAYOUT$maxSwapchainSampleCount, OFFSET$maxSwapchainSampleCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("recommendedImageRectWidth"),
        ValueLayout.JAVA_INT.withName("maxImageRectWidth"),
        ValueLayout.JAVA_INT.withName("recommendedImageRectHeight"),
        ValueLayout.JAVA_INT.withName("maxImageRectHeight"),
        ValueLayout.JAVA_INT.withName("recommendedSwapchainSampleCount"),
        ValueLayout.JAVA_INT.withName("maxSwapchainSampleCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$recommendedImageRectWidth = PathElement.groupElement("recommendedImageRectWidth");
    public static final PathElement PATH$maxImageRectWidth = PathElement.groupElement("maxImageRectWidth");
    public static final PathElement PATH$recommendedImageRectHeight = PathElement.groupElement("recommendedImageRectHeight");
    public static final PathElement PATH$maxImageRectHeight = PathElement.groupElement("maxImageRectHeight");
    public static final PathElement PATH$recommendedSwapchainSampleCount = PathElement.groupElement("recommendedSwapchainSampleCount");
    public static final PathElement PATH$maxSwapchainSampleCount = PathElement.groupElement("maxSwapchainSampleCount");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$recommendedImageRectWidth = (OfInt) LAYOUT.select(PATH$recommendedImageRectWidth);
    public static final OfInt LAYOUT$maxImageRectWidth = (OfInt) LAYOUT.select(PATH$maxImageRectWidth);
    public static final OfInt LAYOUT$recommendedImageRectHeight = (OfInt) LAYOUT.select(PATH$recommendedImageRectHeight);
    public static final OfInt LAYOUT$maxImageRectHeight = (OfInt) LAYOUT.select(PATH$maxImageRectHeight);
    public static final OfInt LAYOUT$recommendedSwapchainSampleCount = (OfInt) LAYOUT.select(PATH$recommendedSwapchainSampleCount);
    public static final OfInt LAYOUT$maxSwapchainSampleCount = (OfInt) LAYOUT.select(PATH$maxSwapchainSampleCount);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$recommendedImageRectWidth = LAYOUT$recommendedImageRectWidth.byteSize();
    public static final long SIZE$maxImageRectWidth = LAYOUT$maxImageRectWidth.byteSize();
    public static final long SIZE$recommendedImageRectHeight = LAYOUT$recommendedImageRectHeight.byteSize();
    public static final long SIZE$maxImageRectHeight = LAYOUT$maxImageRectHeight.byteSize();
    public static final long SIZE$recommendedSwapchainSampleCount = LAYOUT$recommendedSwapchainSampleCount.byteSize();
    public static final long SIZE$maxSwapchainSampleCount = LAYOUT$maxSwapchainSampleCount.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$recommendedImageRectWidth = LAYOUT.byteOffset(PATH$recommendedImageRectWidth);
    public static final long OFFSET$maxImageRectWidth = LAYOUT.byteOffset(PATH$maxImageRectWidth);
    public static final long OFFSET$recommendedImageRectHeight = LAYOUT.byteOffset(PATH$recommendedImageRectHeight);
    public static final long OFFSET$maxImageRectHeight = LAYOUT.byteOffset(PATH$maxImageRectHeight);
    public static final long OFFSET$recommendedSwapchainSampleCount = LAYOUT.byteOffset(PATH$recommendedSwapchainSampleCount);
    public static final long OFFSET$maxSwapchainSampleCount = LAYOUT.byteOffset(PATH$maxSwapchainSampleCount);
}
