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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationLayerInfoMSFT.html"><code>XrSecondaryViewConfigurationLayerInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSecondaryViewConfigurationLayerInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrViewConfigurationType viewConfigurationType; // @link substring="XrViewConfigurationType" target="XrViewConfigurationType" @link substring="viewConfigurationType" target="#viewConfigurationType"
///     XrEnvironmentBlendMode environmentBlendMode; // @link substring="XrEnvironmentBlendMode" target="XrEnvironmentBlendMode" @link substring="environmentBlendMode" target="#environmentBlendMode"
///     uint32_t layerCount; // @link substring="layerCount" target="#layerCount"
///     XrCompositionLayerBaseHeader const* const* layers; // @link substring="XrCompositionLayerBaseHeader" target="XrCompositionLayerBaseHeader" @link substring="layers" target="#layers"
/// } XrSecondaryViewConfigurationLayerInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSecondaryViewConfigurationLayerInfoMSFT#allocate(Arena)}, {@link XrSecondaryViewConfigurationLayerInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSecondaryViewConfigurationLayerInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationLayerInfoMSFT.html"><code>XrSecondaryViewConfigurationLayerInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSecondaryViewConfigurationLayerInfoMSFT(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationLayerInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSecondaryViewConfigurationLayerInfoMSFT.html"><code>XrSecondaryViewConfigurationLayerInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSecondaryViewConfigurationLayerInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSecondaryViewConfigurationLayerInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSecondaryViewConfigurationLayerInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSecondaryViewConfigurationLayerInfoMSFT, Iterable<XrSecondaryViewConfigurationLayerInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSecondaryViewConfigurationLayerInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSecondaryViewConfigurationLayerInfoMSFT at(long index) {
            return new XrSecondaryViewConfigurationLayerInfoMSFT(segment.asSlice(index * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES, XrSecondaryViewConfigurationLayerInfoMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSecondaryViewConfigurationLayerInfoMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSecondaryViewConfigurationLayerInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES, XrSecondaryViewConfigurationLayerInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES,
                (end - start) * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSecondaryViewConfigurationLayerInfoMSFT.BYTES));
        }

        public XrSecondaryViewConfigurationLayerInfoMSFT[] toArray() {
            XrSecondaryViewConfigurationLayerInfoMSFT[] ret = new XrSecondaryViewConfigurationLayerInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSecondaryViewConfigurationLayerInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSecondaryViewConfigurationLayerInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSecondaryViewConfigurationLayerInfoMSFT.BYTES;
            }

            @Override
            public XrSecondaryViewConfigurationLayerInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSecondaryViewConfigurationLayerInfoMSFT ret = new XrSecondaryViewConfigurationLayerInfoMSFT(segment.asSlice(0, XrSecondaryViewConfigurationLayerInfoMSFT.BYTES));
                segment = segment.asSlice(XrSecondaryViewConfigurationLayerInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSecondaryViewConfigurationLayerInfoMSFT allocate(Arena arena) {
        XrSecondaryViewConfigurationLayerInfoMSFT ret = new XrSecondaryViewConfigurationLayerInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT);
        return ret;
    }

    public static XrSecondaryViewConfigurationLayerInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSecondaryViewConfigurationLayerInfoMSFT.Ptr ret = new XrSecondaryViewConfigurationLayerInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT);
        }
        return ret;
    }

    public static XrSecondaryViewConfigurationLayerInfoMSFT clone(Arena arena, XrSecondaryViewConfigurationLayerInfoMSFT src) {
        XrSecondaryViewConfigurationLayerInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SECONDARY_VIEW_CONFIGURATION_LAYER_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrViewConfigurationType.class) int viewConfigurationType() {
        return segment.get(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT viewConfigurationType(@EnumType(XrViewConfigurationType.class) int value) {
        segment.set(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType, value);
        return this;
    }

    public @EnumType(XrEnvironmentBlendMode.class) int environmentBlendMode() {
        return segment.get(LAYOUT$environmentBlendMode, OFFSET$environmentBlendMode);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT environmentBlendMode(@EnumType(XrEnvironmentBlendMode.class) int value) {
        segment.set(LAYOUT$environmentBlendMode, OFFSET$environmentBlendMode, value);
        return this;
    }

    public @Unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT layerCount(@Unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
        return this;
    }

    /// Note: the returned {@link PointerPtr} does not have correct {@link PointerPtr#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerPtr#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerPtr layers() {
        MemorySegment s = layersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new PointerPtr(s);
    }

    public XrSecondaryViewConfigurationLayerInfoMSFT layers(@Nullable PointerPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        layersRaw(s);
        return this;
    }

    public @Pointer(comment="void**") @NotNull MemorySegment layersRaw() {
        return segment.get(LAYOUT$layers, OFFSET$layers);
    }

    public void layersRaw(@Pointer(comment="void**") @NotNull MemorySegment value) {
        segment.set(LAYOUT$layers, OFFSET$layers, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("viewConfigurationType"),
        ValueLayout.JAVA_INT.withName("environmentBlendMode"),
        ValueLayout.JAVA_INT.withName("layerCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(XrCompositionLayerBaseHeader.LAYOUT)).withName("layers")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$viewConfigurationType = PathElement.groupElement("viewConfigurationType");
    public static final PathElement PATH$environmentBlendMode = PathElement.groupElement("environmentBlendMode");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");
    public static final PathElement PATH$layers = PathElement.groupElement("layers");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$viewConfigurationType = (OfInt) LAYOUT.select(PATH$viewConfigurationType);
    public static final OfInt LAYOUT$environmentBlendMode = (OfInt) LAYOUT.select(PATH$environmentBlendMode);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);
    public static final AddressLayout LAYOUT$layers = (AddressLayout) LAYOUT.select(PATH$layers);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$viewConfigurationType = LAYOUT$viewConfigurationType.byteSize();
    public static final long SIZE$environmentBlendMode = LAYOUT$environmentBlendMode.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();
    public static final long SIZE$layers = LAYOUT$layers.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$viewConfigurationType = LAYOUT.byteOffset(PATH$viewConfigurationType);
    public static final long OFFSET$environmentBlendMode = LAYOUT.byteOffset(PATH$environmentBlendMode);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);
    public static final long OFFSET$layers = LAYOUT.byteOffset(PATH$layers);
}
