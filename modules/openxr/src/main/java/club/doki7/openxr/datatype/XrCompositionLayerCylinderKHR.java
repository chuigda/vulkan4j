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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCylinderKHR.html"><code>XrCompositionLayerCylinderKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerCylinderKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrCompositionLayerFlags layerFlags; // optional // @link substring="XrCompositionLayerFlags" target="XrCompositionLayerFlags" @link substring="layerFlags" target="#layerFlags"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrEyeVisibility eyeVisibility; // @link substring="XrEyeVisibility" target="XrEyeVisibility" @link substring="eyeVisibility" target="#eyeVisibility"
///     XrSwapchainSubImage subImage; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="subImage" target="#subImage"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     float radius; // @link substring="radius" target="#radius"
///     float centralAngle; // @link substring="centralAngle" target="#centralAngle"
///     float aspectRatio; // @link substring="aspectRatio" target="#aspectRatio"
/// } XrCompositionLayerCylinderKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR`
///
/// The {@code allocate} ({@link XrCompositionLayerCylinderKHR#allocate(Arena)}, {@link XrCompositionLayerCylinderKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerCylinderKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCylinderKHR.html"><code>XrCompositionLayerCylinderKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerCylinderKHR(@NotNull MemorySegment segment) implements IXrCompositionLayerCylinderKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCylinderKHR.html"><code>XrCompositionLayerCylinderKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerCylinderKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerCylinderKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerCylinderKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerCylinderKHR, Iterable<XrCompositionLayerCylinderKHR> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerCylinderKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerCylinderKHR at(long index) {
            return new XrCompositionLayerCylinderKHR(segment.asSlice(index * XrCompositionLayerCylinderKHR.BYTES, XrCompositionLayerCylinderKHR.BYTES));
        }

        public void write(long index, @NotNull XrCompositionLayerCylinderKHR value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerCylinderKHR.BYTES, XrCompositionLayerCylinderKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerCylinderKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerCylinderKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerCylinderKHR.BYTES,
                (end - start) * XrCompositionLayerCylinderKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerCylinderKHR.BYTES));
        }

        public XrCompositionLayerCylinderKHR[] toArray() {
            XrCompositionLayerCylinderKHR[] ret = new XrCompositionLayerCylinderKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerCylinderKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerCylinderKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerCylinderKHR.BYTES;
            }

            @Override
            public XrCompositionLayerCylinderKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerCylinderKHR ret = new XrCompositionLayerCylinderKHR(segment.asSlice(0, XrCompositionLayerCylinderKHR.BYTES));
                segment = segment.asSlice(XrCompositionLayerCylinderKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerCylinderKHR allocate(Arena arena) {
        XrCompositionLayerCylinderKHR ret = new XrCompositionLayerCylinderKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR);
        return ret;
    }

    public static XrCompositionLayerCylinderKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerCylinderKHR.Ptr ret = new XrCompositionLayerCylinderKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR);
        }
        return ret;
    }

    public static XrCompositionLayerCylinderKHR clone(Arena arena, XrCompositionLayerCylinderKHR src) {
        XrCompositionLayerCylinderKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CYLINDER_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerCylinderKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerCylinderKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerCylinderKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrCompositionLayerFlags.class) int layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrCompositionLayerCylinderKHR layerFlags(@Bitmask(XrCompositionLayerFlags.class) int value) {
        segment.set(LAYOUT$layerFlags, OFFSET$layerFlags, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrCompositionLayerCylinderKHR space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrEyeVisibility.class) int eyeVisibility() {
        return segment.get(LAYOUT$eyeVisibility, OFFSET$eyeVisibility);
    }

    public XrCompositionLayerCylinderKHR eyeVisibility(@EnumType(XrEyeVisibility.class) int value) {
        segment.set(LAYOUT$eyeVisibility, OFFSET$eyeVisibility, value);
        return this;
    }

    public @NotNull XrSwapchainSubImage subImage() {
        return new XrSwapchainSubImage(segment.asSlice(OFFSET$subImage, LAYOUT$subImage));
    }

    public XrCompositionLayerCylinderKHR subImage(@NotNull XrSwapchainSubImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subImage, SIZE$subImage);
        return this;
    }

    public XrCompositionLayerCylinderKHR subImage(Consumer<@NotNull XrSwapchainSubImage> consumer) {
        consumer.accept(subImage());
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrCompositionLayerCylinderKHR pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrCompositionLayerCylinderKHR pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public float radius() {
        return segment.get(LAYOUT$radius, OFFSET$radius);
    }

    public XrCompositionLayerCylinderKHR radius(float value) {
        segment.set(LAYOUT$radius, OFFSET$radius, value);
        return this;
    }

    public float centralAngle() {
        return segment.get(LAYOUT$centralAngle, OFFSET$centralAngle);
    }

    public XrCompositionLayerCylinderKHR centralAngle(float value) {
        segment.set(LAYOUT$centralAngle, OFFSET$centralAngle, value);
        return this;
    }

    public float aspectRatio() {
        return segment.get(LAYOUT$aspectRatio, OFFSET$aspectRatio);
    }

    public XrCompositionLayerCylinderKHR aspectRatio(float value) {
        segment.set(LAYOUT$aspectRatio, OFFSET$aspectRatio, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("layerFlags"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("eyeVisibility"),
        XrSwapchainSubImage.LAYOUT.withName("subImage"),
        XrPosef.LAYOUT.withName("pose"),
        ValueLayout.JAVA_FLOAT.withName("radius"),
        ValueLayout.JAVA_FLOAT.withName("centralAngle"),
        ValueLayout.JAVA_FLOAT.withName("aspectRatio")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerFlags = PathElement.groupElement("layerFlags");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$eyeVisibility = PathElement.groupElement("eyeVisibility");
    public static final PathElement PATH$subImage = PathElement.groupElement("subImage");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$radius = PathElement.groupElement("radius");
    public static final PathElement PATH$centralAngle = PathElement.groupElement("centralAngle");
    public static final PathElement PATH$aspectRatio = PathElement.groupElement("aspectRatio");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$layerFlags = (OfInt) LAYOUT.select(PATH$layerFlags);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$eyeVisibility = (OfInt) LAYOUT.select(PATH$eyeVisibility);
    public static final StructLayout LAYOUT$subImage = (StructLayout) LAYOUT.select(PATH$subImage);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final OfFloat LAYOUT$radius = (OfFloat) LAYOUT.select(PATH$radius);
    public static final OfFloat LAYOUT$centralAngle = (OfFloat) LAYOUT.select(PATH$centralAngle);
    public static final OfFloat LAYOUT$aspectRatio = (OfFloat) LAYOUT.select(PATH$aspectRatio);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$eyeVisibility = LAYOUT$eyeVisibility.byteSize();
    public static final long SIZE$subImage = LAYOUT$subImage.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$radius = LAYOUT$radius.byteSize();
    public static final long SIZE$centralAngle = LAYOUT$centralAngle.byteSize();
    public static final long SIZE$aspectRatio = LAYOUT$aspectRatio.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$eyeVisibility = LAYOUT.byteOffset(PATH$eyeVisibility);
    public static final long OFFSET$subImage = LAYOUT.byteOffset(PATH$subImage);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$radius = LAYOUT.byteOffset(PATH$radius);
    public static final long OFFSET$centralAngle = LAYOUT.byteOffset(PATH$centralAngle);
    public static final long OFFSET$aspectRatio = LAYOUT.byteOffset(PATH$aspectRatio);
}
