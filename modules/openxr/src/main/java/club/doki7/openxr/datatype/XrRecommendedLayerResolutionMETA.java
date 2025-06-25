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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRecommendedLayerResolutionMETA.html"><code>XrRecommendedLayerResolutionMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRecommendedLayerResolutionMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrExtent2Di recommendedImageDimensions; // @link substring="XrExtent2Di" target="XrExtent2Di" @link substring="recommendedImageDimensions" target="#recommendedImageDimensions"
///     XrBool32 isValid; // @link substring="isValid" target="#isValid"
/// } XrRecommendedLayerResolutionMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_RECOMMENDED_LAYER_RESOLUTION_META`
///
/// The {@code allocate} ({@link XrRecommendedLayerResolutionMETA#allocate(Arena)}, {@link XrRecommendedLayerResolutionMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrRecommendedLayerResolutionMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRecommendedLayerResolutionMETA.html"><code>XrRecommendedLayerResolutionMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRecommendedLayerResolutionMETA(@NotNull MemorySegment segment) implements IXrRecommendedLayerResolutionMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRecommendedLayerResolutionMETA.html"><code>XrRecommendedLayerResolutionMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRecommendedLayerResolutionMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRecommendedLayerResolutionMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRecommendedLayerResolutionMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRecommendedLayerResolutionMETA, Iterable<XrRecommendedLayerResolutionMETA> {
        public long size() {
            return segment.byteSize() / XrRecommendedLayerResolutionMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRecommendedLayerResolutionMETA at(long index) {
            return new XrRecommendedLayerResolutionMETA(segment.asSlice(index * XrRecommendedLayerResolutionMETA.BYTES, XrRecommendedLayerResolutionMETA.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrRecommendedLayerResolutionMETA> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrRecommendedLayerResolutionMETA value) {
            MemorySegment s = segment.asSlice(index * XrRecommendedLayerResolutionMETA.BYTES, XrRecommendedLayerResolutionMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRecommendedLayerResolutionMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRecommendedLayerResolutionMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRecommendedLayerResolutionMETA.BYTES,
                (end - start) * XrRecommendedLayerResolutionMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRecommendedLayerResolutionMETA.BYTES));
        }

        public XrRecommendedLayerResolutionMETA[] toArray() {
            XrRecommendedLayerResolutionMETA[] ret = new XrRecommendedLayerResolutionMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRecommendedLayerResolutionMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRecommendedLayerResolutionMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRecommendedLayerResolutionMETA.BYTES;
            }

            @Override
            public XrRecommendedLayerResolutionMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRecommendedLayerResolutionMETA ret = new XrRecommendedLayerResolutionMETA(segment.asSlice(0, XrRecommendedLayerResolutionMETA.BYTES));
                segment = segment.asSlice(XrRecommendedLayerResolutionMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRecommendedLayerResolutionMETA allocate(Arena arena) {
        XrRecommendedLayerResolutionMETA ret = new XrRecommendedLayerResolutionMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.RECOMMENDED_LAYER_RESOLUTION_META);
        return ret;
    }

    public static XrRecommendedLayerResolutionMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrRecommendedLayerResolutionMETA.Ptr ret = new XrRecommendedLayerResolutionMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.RECOMMENDED_LAYER_RESOLUTION_META);
        }
        return ret;
    }

    public static XrRecommendedLayerResolutionMETA clone(Arena arena, XrRecommendedLayerResolutionMETA src) {
        XrRecommendedLayerResolutionMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.RECOMMENDED_LAYER_RESOLUTION_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrRecommendedLayerResolutionMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrRecommendedLayerResolutionMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrRecommendedLayerResolutionMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrExtent2Di recommendedImageDimensions() {
        return new XrExtent2Di(segment.asSlice(OFFSET$recommendedImageDimensions, LAYOUT$recommendedImageDimensions));
    }

    public XrRecommendedLayerResolutionMETA recommendedImageDimensions(@NotNull XrExtent2Di value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$recommendedImageDimensions, SIZE$recommendedImageDimensions);
        return this;
    }

    public XrRecommendedLayerResolutionMETA recommendedImageDimensions(Consumer<@NotNull XrExtent2Di> consumer) {
        consumer.accept(recommendedImageDimensions());
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isValid() {
        return segment.get(LAYOUT$isValid, OFFSET$isValid);
    }

    public XrRecommendedLayerResolutionMETA isValid(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isValid, OFFSET$isValid, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrExtent2Di.LAYOUT.withName("recommendedImageDimensions"),
        ValueLayout.JAVA_INT.withName("isValid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$recommendedImageDimensions = PathElement.groupElement("recommendedImageDimensions");
    public static final PathElement PATH$isValid = PathElement.groupElement("isValid");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$recommendedImageDimensions = (StructLayout) LAYOUT.select(PATH$recommendedImageDimensions);
    public static final OfInt LAYOUT$isValid = (OfInt) LAYOUT.select(PATH$isValid);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$recommendedImageDimensions = LAYOUT$recommendedImageDimensions.byteSize();
    public static final long SIZE$isValid = LAYOUT$isValid.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$recommendedImageDimensions = LAYOUT.byteOffset(PATH$recommendedImageDimensions);
    public static final long OFFSET$isValid = LAYOUT.byteOffset(PATH$isValid);
}
