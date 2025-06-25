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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationApplyInfoHTC.html"><code>XrFoveationApplyInfoHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFoveationApplyInfoHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrFoveationModeHTC mode; // @link substring="XrFoveationModeHTC" target="XrFoveationModeHTC" @link substring="mode" target="#mode"
///     uint32_t subImageCount; // @link substring="subImageCount" target="#subImageCount"
///     XrSwapchainSubImage* subImages; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="subImages" target="#subImages"
/// } XrFoveationApplyInfoHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FOVEATION_APPLY_INFO_HTC`
///
/// The {@code allocate} ({@link XrFoveationApplyInfoHTC#allocate(Arena)}, {@link XrFoveationApplyInfoHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFoveationApplyInfoHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationApplyInfoHTC.html"><code>XrFoveationApplyInfoHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFoveationApplyInfoHTC(@NotNull MemorySegment segment) implements IXrFoveationApplyInfoHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationApplyInfoHTC.html"><code>XrFoveationApplyInfoHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFoveationApplyInfoHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFoveationApplyInfoHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFoveationApplyInfoHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFoveationApplyInfoHTC, Iterable<XrFoveationApplyInfoHTC> {
        public long size() {
            return segment.byteSize() / XrFoveationApplyInfoHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFoveationApplyInfoHTC at(long index) {
            return new XrFoveationApplyInfoHTC(segment.asSlice(index * XrFoveationApplyInfoHTC.BYTES, XrFoveationApplyInfoHTC.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrFoveationApplyInfoHTC> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrFoveationApplyInfoHTC value) {
            MemorySegment s = segment.asSlice(index * XrFoveationApplyInfoHTC.BYTES, XrFoveationApplyInfoHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFoveationApplyInfoHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFoveationApplyInfoHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFoveationApplyInfoHTC.BYTES,
                (end - start) * XrFoveationApplyInfoHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFoveationApplyInfoHTC.BYTES));
        }

        public XrFoveationApplyInfoHTC[] toArray() {
            XrFoveationApplyInfoHTC[] ret = new XrFoveationApplyInfoHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFoveationApplyInfoHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFoveationApplyInfoHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFoveationApplyInfoHTC.BYTES;
            }

            @Override
            public XrFoveationApplyInfoHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFoveationApplyInfoHTC ret = new XrFoveationApplyInfoHTC(segment.asSlice(0, XrFoveationApplyInfoHTC.BYTES));
                segment = segment.asSlice(XrFoveationApplyInfoHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFoveationApplyInfoHTC allocate(Arena arena) {
        XrFoveationApplyInfoHTC ret = new XrFoveationApplyInfoHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FOVEATION_APPLY_INFO_HTC);
        return ret;
    }

    public static XrFoveationApplyInfoHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFoveationApplyInfoHTC.Ptr ret = new XrFoveationApplyInfoHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FOVEATION_APPLY_INFO_HTC);
        }
        return ret;
    }

    public static XrFoveationApplyInfoHTC clone(Arena arena, XrFoveationApplyInfoHTC src) {
        XrFoveationApplyInfoHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FOVEATION_APPLY_INFO_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFoveationApplyInfoHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFoveationApplyInfoHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFoveationApplyInfoHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrFoveationModeHTC.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public XrFoveationApplyInfoHTC mode(@EnumType(XrFoveationModeHTC.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
        return this;
    }

    public @Unsigned int subImageCount() {
        return segment.get(LAYOUT$subImageCount, OFFSET$subImageCount);
    }

    public XrFoveationApplyInfoHTC subImageCount(@Unsigned int value) {
        segment.set(LAYOUT$subImageCount, OFFSET$subImageCount, value);
        return this;
    }

    public XrFoveationApplyInfoHTC subImages(@Nullable IXrSwapchainSubImage value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        subImagesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSwapchainSubImage.Ptr subImages(int assumedCount) {
        MemorySegment s = subImagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSwapchainSubImage.BYTES);
        return new XrSwapchainSubImage.Ptr(s);
    }

    public @Nullable XrSwapchainSubImage subImages() {
        MemorySegment s = subImagesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSwapchainSubImage(s);
    }

    public @Pointer(target=XrSwapchainSubImage.class) @NotNull MemorySegment subImagesRaw() {
        return segment.get(LAYOUT$subImages, OFFSET$subImages);
    }

    public void subImagesRaw(@Pointer(target=XrSwapchainSubImage.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$subImages, OFFSET$subImages, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("mode"),
        ValueLayout.JAVA_INT.withName("subImageCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSwapchainSubImage.LAYOUT).withName("subImages")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");
    public static final PathElement PATH$subImageCount = PathElement.groupElement("subImageCount");
    public static final PathElement PATH$subImages = PathElement.groupElement("subImages");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);
    public static final OfInt LAYOUT$subImageCount = (OfInt) LAYOUT.select(PATH$subImageCount);
    public static final AddressLayout LAYOUT$subImages = (AddressLayout) LAYOUT.select(PATH$subImages);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$subImageCount = LAYOUT$subImageCount.byteSize();
    public static final long SIZE$subImages = LAYOUT$subImages.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$subImageCount = LAYOUT.byteOffset(PATH$subImageCount);
    public static final long OFFSET$subImages = LAYOUT.byteOffset(PATH$subImages);
}
