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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerEquirectKHR.html"><code>XrCompositionLayerEquirectKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerEquirectKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrCompositionLayerFlags layerFlags; // optional // @link substring="XrCompositionLayerFlags" target="XrCompositionLayerFlags" @link substring="layerFlags" target="#layerFlags"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrEyeVisibility eyeVisibility; // @link substring="XrEyeVisibility" target="XrEyeVisibility" @link substring="eyeVisibility" target="#eyeVisibility"
///     XrSwapchainSubImage subImage; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="subImage" target="#subImage"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     float radius; // @link substring="radius" target="#radius"
///     XrVector2f scale; // @link substring="XrVector2f" target="XrVector2f" @link substring="scale" target="#scale"
///     XrVector2f bias; // @link substring="XrVector2f" target="XrVector2f" @link substring="bias" target="#bias"
/// } XrCompositionLayerEquirectKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_EQUIRECT_KHR`
///
/// The {@code allocate} ({@link XrCompositionLayerEquirectKHR#allocate(Arena)}, {@link XrCompositionLayerEquirectKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerEquirectKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerEquirectKHR.html"><code>XrCompositionLayerEquirectKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerEquirectKHR(@NotNull MemorySegment segment) implements IXrCompositionLayerEquirectKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerEquirectKHR.html"><code>XrCompositionLayerEquirectKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerEquirectKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerEquirectKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerEquirectKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerEquirectKHR, Iterable<XrCompositionLayerEquirectKHR> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerEquirectKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerEquirectKHR at(long index) {
            return new XrCompositionLayerEquirectKHR(segment.asSlice(index * XrCompositionLayerEquirectKHR.BYTES, XrCompositionLayerEquirectKHR.BYTES));
        }

        public XrCompositionLayerEquirectKHR.Ptr at(long index, @NotNull Consumer<@NotNull XrCompositionLayerEquirectKHR> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrCompositionLayerEquirectKHR value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerEquirectKHR.BYTES, XrCompositionLayerEquirectKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerEquirectKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerEquirectKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerEquirectKHR.BYTES,
                (end - start) * XrCompositionLayerEquirectKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerEquirectKHR.BYTES));
        }

        public XrCompositionLayerEquirectKHR[] toArray() {
            XrCompositionLayerEquirectKHR[] ret = new XrCompositionLayerEquirectKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerEquirectKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerEquirectKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerEquirectKHR.BYTES;
            }

            @Override
            public XrCompositionLayerEquirectKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerEquirectKHR ret = new XrCompositionLayerEquirectKHR(segment.asSlice(0, XrCompositionLayerEquirectKHR.BYTES));
                segment = segment.asSlice(XrCompositionLayerEquirectKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerEquirectKHR allocate(Arena arena) {
        XrCompositionLayerEquirectKHR ret = new XrCompositionLayerEquirectKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COMPOSITION_LAYER_EQUIRECT_KHR);
        return ret;
    }

    public static XrCompositionLayerEquirectKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerEquirectKHR.Ptr ret = new XrCompositionLayerEquirectKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COMPOSITION_LAYER_EQUIRECT_KHR);
        }
        return ret;
    }

    public static XrCompositionLayerEquirectKHR clone(Arena arena, XrCompositionLayerEquirectKHR src) {
        XrCompositionLayerEquirectKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COMPOSITION_LAYER_EQUIRECT_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerEquirectKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerEquirectKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerEquirectKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrCompositionLayerFlags.class) long layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrCompositionLayerEquirectKHR layerFlags(@Bitmask(XrCompositionLayerFlags.class) long value) {
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

    public XrCompositionLayerEquirectKHR space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrEyeVisibility.class) int eyeVisibility() {
        return segment.get(LAYOUT$eyeVisibility, OFFSET$eyeVisibility);
    }

    public XrCompositionLayerEquirectKHR eyeVisibility(@EnumType(XrEyeVisibility.class) int value) {
        segment.set(LAYOUT$eyeVisibility, OFFSET$eyeVisibility, value);
        return this;
    }

    public @NotNull XrSwapchainSubImage subImage() {
        return new XrSwapchainSubImage(segment.asSlice(OFFSET$subImage, LAYOUT$subImage));
    }

    public XrCompositionLayerEquirectKHR subImage(@NotNull XrSwapchainSubImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subImage, SIZE$subImage);
        return this;
    }

    public XrCompositionLayerEquirectKHR subImage(Consumer<@NotNull XrSwapchainSubImage> consumer) {
        consumer.accept(subImage());
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrCompositionLayerEquirectKHR pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrCompositionLayerEquirectKHR pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public float radius() {
        return segment.get(LAYOUT$radius, OFFSET$radius);
    }

    public XrCompositionLayerEquirectKHR radius(float value) {
        segment.set(LAYOUT$radius, OFFSET$radius, value);
        return this;
    }

    public @NotNull XrVector2f scale() {
        return new XrVector2f(segment.asSlice(OFFSET$scale, LAYOUT$scale));
    }

    public XrCompositionLayerEquirectKHR scale(@NotNull XrVector2f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scale, SIZE$scale);
        return this;
    }

    public XrCompositionLayerEquirectKHR scale(Consumer<@NotNull XrVector2f> consumer) {
        consumer.accept(scale());
        return this;
    }

    public @NotNull XrVector2f bias() {
        return new XrVector2f(segment.asSlice(OFFSET$bias, LAYOUT$bias));
    }

    public XrCompositionLayerEquirectKHR bias(@NotNull XrVector2f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$bias, SIZE$bias);
        return this;
    }

    public XrCompositionLayerEquirectKHR bias(Consumer<@NotNull XrVector2f> consumer) {
        consumer.accept(bias());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("layerFlags"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("eyeVisibility"),
        XrSwapchainSubImage.LAYOUT.withName("subImage"),
        XrPosef.LAYOUT.withName("pose"),
        ValueLayout.JAVA_FLOAT.withName("radius"),
        XrVector2f.LAYOUT.withName("scale"),
        XrVector2f.LAYOUT.withName("bias")
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
    public static final PathElement PATH$scale = PathElement.groupElement("scale");
    public static final PathElement PATH$bias = PathElement.groupElement("bias");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$layerFlags = (OfLong) LAYOUT.select(PATH$layerFlags);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$eyeVisibility = (OfInt) LAYOUT.select(PATH$eyeVisibility);
    public static final StructLayout LAYOUT$subImage = (StructLayout) LAYOUT.select(PATH$subImage);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final OfFloat LAYOUT$radius = (OfFloat) LAYOUT.select(PATH$radius);
    public static final StructLayout LAYOUT$scale = (StructLayout) LAYOUT.select(PATH$scale);
    public static final StructLayout LAYOUT$bias = (StructLayout) LAYOUT.select(PATH$bias);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$eyeVisibility = LAYOUT$eyeVisibility.byteSize();
    public static final long SIZE$subImage = LAYOUT$subImage.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$radius = LAYOUT$radius.byteSize();
    public static final long SIZE$scale = LAYOUT$scale.byteSize();
    public static final long SIZE$bias = LAYOUT$bias.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$eyeVisibility = LAYOUT.byteOffset(PATH$eyeVisibility);
    public static final long OFFSET$subImage = LAYOUT.byteOffset(PATH$subImage);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$radius = LAYOUT.byteOffset(PATH$radius);
    public static final long OFFSET$scale = LAYOUT.byteOffset(PATH$scale);
    public static final long OFFSET$bias = LAYOUT.byteOffset(PATH$bias);
}
