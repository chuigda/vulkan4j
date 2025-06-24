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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisInfoEXT.html"><code>XrFrameSynthesisInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFrameSynthesisInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrFrameSynthesisInfoFlagsEXT layerFlags; // optional // @link substring="XrFrameSynthesisInfoFlagsEXT" target="XrFrameSynthesisInfoFlagsEXT" @link substring="layerFlags" target="#layerFlags"
///     XrSwapchainSubImage motionVectorSubImage; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="motionVectorSubImage" target="#motionVectorSubImage"
///     XrVector4f motionVectorScale; // @link substring="XrVector4f" target="XrVector4f" @link substring="motionVectorScale" target="#motionVectorScale"
///     XrVector4f motionVectorOffset; // @link substring="XrVector4f" target="XrVector4f" @link substring="motionVectorOffset" target="#motionVectorOffset"
///     XrPosef appSpaceDeltaPose; // @link substring="XrPosef" target="XrPosef" @link substring="appSpaceDeltaPose" target="#appSpaceDeltaPose"
///     XrSwapchainSubImage depthSubImage; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="depthSubImage" target="#depthSubImage"
///     float minDepth; // @link substring="minDepth" target="#minDepth"
///     float maxDepth; // @link substring="maxDepth" target="#maxDepth"
///     float nearZ; // @link substring="nearZ" target="#nearZ"
///     float farZ; // @link substring="farZ" target="#farZ"
/// } XrFrameSynthesisInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FRAME_SYNTHESIS_INFO_EXT`
///
/// The {@code allocate} ({@link XrFrameSynthesisInfoEXT#allocate(Arena)}, {@link XrFrameSynthesisInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFrameSynthesisInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisInfoEXT.html"><code>XrFrameSynthesisInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFrameSynthesisInfoEXT(@NotNull MemorySegment segment) implements IXrFrameSynthesisInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisInfoEXT.html"><code>XrFrameSynthesisInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFrameSynthesisInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFrameSynthesisInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFrameSynthesisInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFrameSynthesisInfoEXT, Iterable<XrFrameSynthesisInfoEXT> {
        public long size() {
            return segment.byteSize() / XrFrameSynthesisInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFrameSynthesisInfoEXT at(long index) {
            return new XrFrameSynthesisInfoEXT(segment.asSlice(index * XrFrameSynthesisInfoEXT.BYTES, XrFrameSynthesisInfoEXT.BYTES));
        }

        public void write(long index, @NotNull XrFrameSynthesisInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrFrameSynthesisInfoEXT.BYTES, XrFrameSynthesisInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFrameSynthesisInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFrameSynthesisInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFrameSynthesisInfoEXT.BYTES,
                (end - start) * XrFrameSynthesisInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFrameSynthesisInfoEXT.BYTES));
        }

        public XrFrameSynthesisInfoEXT[] toArray() {
            XrFrameSynthesisInfoEXT[] ret = new XrFrameSynthesisInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFrameSynthesisInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFrameSynthesisInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFrameSynthesisInfoEXT.BYTES;
            }

            @Override
            public XrFrameSynthesisInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFrameSynthesisInfoEXT ret = new XrFrameSynthesisInfoEXT(segment.asSlice(0, XrFrameSynthesisInfoEXT.BYTES));
                segment = segment.asSlice(XrFrameSynthesisInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFrameSynthesisInfoEXT allocate(Arena arena) {
        XrFrameSynthesisInfoEXT ret = new XrFrameSynthesisInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_INFO_EXT);
        return ret;
    }

    public static XrFrameSynthesisInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFrameSynthesisInfoEXT.Ptr ret = new XrFrameSynthesisInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_INFO_EXT);
        }
        return ret;
    }

    public static XrFrameSynthesisInfoEXT clone(Arena arena, XrFrameSynthesisInfoEXT src) {
        XrFrameSynthesisInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFrameSynthesisInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFrameSynthesisInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFrameSynthesisInfoEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrFrameSynthesisInfoFlagsEXT.class) int layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrFrameSynthesisInfoEXT layerFlags(@Bitmask(XrFrameSynthesisInfoFlagsEXT.class) int value) {
        segment.set(LAYOUT$layerFlags, OFFSET$layerFlags, value);
        return this;
    }

    public @NotNull XrSwapchainSubImage motionVectorSubImage() {
        return new XrSwapchainSubImage(segment.asSlice(OFFSET$motionVectorSubImage, LAYOUT$motionVectorSubImage));
    }

    public XrFrameSynthesisInfoEXT motionVectorSubImage(@NotNull XrSwapchainSubImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$motionVectorSubImage, SIZE$motionVectorSubImage);
        return this;
    }

    public XrFrameSynthesisInfoEXT motionVectorSubImage(Consumer<@NotNull XrSwapchainSubImage> consumer) {
        consumer.accept(motionVectorSubImage());
        return this;
    }

    public @NotNull XrVector4f motionVectorScale() {
        return new XrVector4f(segment.asSlice(OFFSET$motionVectorScale, LAYOUT$motionVectorScale));
    }

    public XrFrameSynthesisInfoEXT motionVectorScale(@NotNull XrVector4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$motionVectorScale, SIZE$motionVectorScale);
        return this;
    }

    public XrFrameSynthesisInfoEXT motionVectorScale(Consumer<@NotNull XrVector4f> consumer) {
        consumer.accept(motionVectorScale());
        return this;
    }

    public @NotNull XrVector4f motionVectorOffset() {
        return new XrVector4f(segment.asSlice(OFFSET$motionVectorOffset, LAYOUT$motionVectorOffset));
    }

    public XrFrameSynthesisInfoEXT motionVectorOffset(@NotNull XrVector4f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$motionVectorOffset, SIZE$motionVectorOffset);
        return this;
    }

    public XrFrameSynthesisInfoEXT motionVectorOffset(Consumer<@NotNull XrVector4f> consumer) {
        consumer.accept(motionVectorOffset());
        return this;
    }

    public @NotNull XrPosef appSpaceDeltaPose() {
        return new XrPosef(segment.asSlice(OFFSET$appSpaceDeltaPose, LAYOUT$appSpaceDeltaPose));
    }

    public XrFrameSynthesisInfoEXT appSpaceDeltaPose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$appSpaceDeltaPose, SIZE$appSpaceDeltaPose);
        return this;
    }

    public XrFrameSynthesisInfoEXT appSpaceDeltaPose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(appSpaceDeltaPose());
        return this;
    }

    public @NotNull XrSwapchainSubImage depthSubImage() {
        return new XrSwapchainSubImage(segment.asSlice(OFFSET$depthSubImage, LAYOUT$depthSubImage));
    }

    public XrFrameSynthesisInfoEXT depthSubImage(@NotNull XrSwapchainSubImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthSubImage, SIZE$depthSubImage);
        return this;
    }

    public XrFrameSynthesisInfoEXT depthSubImage(Consumer<@NotNull XrSwapchainSubImage> consumer) {
        consumer.accept(depthSubImage());
        return this;
    }

    public float minDepth() {
        return segment.get(LAYOUT$minDepth, OFFSET$minDepth);
    }

    public XrFrameSynthesisInfoEXT minDepth(float value) {
        segment.set(LAYOUT$minDepth, OFFSET$minDepth, value);
        return this;
    }

    public float maxDepth() {
        return segment.get(LAYOUT$maxDepth, OFFSET$maxDepth);
    }

    public XrFrameSynthesisInfoEXT maxDepth(float value) {
        segment.set(LAYOUT$maxDepth, OFFSET$maxDepth, value);
        return this;
    }

    public float nearZ() {
        return segment.get(LAYOUT$nearZ, OFFSET$nearZ);
    }

    public XrFrameSynthesisInfoEXT nearZ(float value) {
        segment.set(LAYOUT$nearZ, OFFSET$nearZ, value);
        return this;
    }

    public float farZ() {
        return segment.get(LAYOUT$farZ, OFFSET$farZ);
    }

    public XrFrameSynthesisInfoEXT farZ(float value) {
        segment.set(LAYOUT$farZ, OFFSET$farZ, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("layerFlags"),
        XrSwapchainSubImage.LAYOUT.withName("motionVectorSubImage"),
        XrVector4f.LAYOUT.withName("motionVectorScale"),
        XrVector4f.LAYOUT.withName("motionVectorOffset"),
        XrPosef.LAYOUT.withName("appSpaceDeltaPose"),
        XrSwapchainSubImage.LAYOUT.withName("depthSubImage"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth"),
        ValueLayout.JAVA_FLOAT.withName("nearZ"),
        ValueLayout.JAVA_FLOAT.withName("farZ")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerFlags = PathElement.groupElement("layerFlags");
    public static final PathElement PATH$motionVectorSubImage = PathElement.groupElement("motionVectorSubImage");
    public static final PathElement PATH$motionVectorScale = PathElement.groupElement("motionVectorScale");
    public static final PathElement PATH$motionVectorOffset = PathElement.groupElement("motionVectorOffset");
    public static final PathElement PATH$appSpaceDeltaPose = PathElement.groupElement("appSpaceDeltaPose");
    public static final PathElement PATH$depthSubImage = PathElement.groupElement("depthSubImage");
    public static final PathElement PATH$minDepth = PathElement.groupElement("minDepth");
    public static final PathElement PATH$maxDepth = PathElement.groupElement("maxDepth");
    public static final PathElement PATH$nearZ = PathElement.groupElement("nearZ");
    public static final PathElement PATH$farZ = PathElement.groupElement("farZ");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$layerFlags = (OfInt) LAYOUT.select(PATH$layerFlags);
    public static final StructLayout LAYOUT$motionVectorSubImage = (StructLayout) LAYOUT.select(PATH$motionVectorSubImage);
    public static final StructLayout LAYOUT$motionVectorScale = (StructLayout) LAYOUT.select(PATH$motionVectorScale);
    public static final StructLayout LAYOUT$motionVectorOffset = (StructLayout) LAYOUT.select(PATH$motionVectorOffset);
    public static final StructLayout LAYOUT$appSpaceDeltaPose = (StructLayout) LAYOUT.select(PATH$appSpaceDeltaPose);
    public static final StructLayout LAYOUT$depthSubImage = (StructLayout) LAYOUT.select(PATH$depthSubImage);
    public static final OfFloat LAYOUT$minDepth = (OfFloat) LAYOUT.select(PATH$minDepth);
    public static final OfFloat LAYOUT$maxDepth = (OfFloat) LAYOUT.select(PATH$maxDepth);
    public static final OfFloat LAYOUT$nearZ = (OfFloat) LAYOUT.select(PATH$nearZ);
    public static final OfFloat LAYOUT$farZ = (OfFloat) LAYOUT.select(PATH$farZ);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$motionVectorSubImage = LAYOUT$motionVectorSubImage.byteSize();
    public static final long SIZE$motionVectorScale = LAYOUT$motionVectorScale.byteSize();
    public static final long SIZE$motionVectorOffset = LAYOUT$motionVectorOffset.byteSize();
    public static final long SIZE$appSpaceDeltaPose = LAYOUT$appSpaceDeltaPose.byteSize();
    public static final long SIZE$depthSubImage = LAYOUT$depthSubImage.byteSize();
    public static final long SIZE$minDepth = LAYOUT$minDepth.byteSize();
    public static final long SIZE$maxDepth = LAYOUT$maxDepth.byteSize();
    public static final long SIZE$nearZ = LAYOUT$nearZ.byteSize();
    public static final long SIZE$farZ = LAYOUT$farZ.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$motionVectorSubImage = LAYOUT.byteOffset(PATH$motionVectorSubImage);
    public static final long OFFSET$motionVectorScale = LAYOUT.byteOffset(PATH$motionVectorScale);
    public static final long OFFSET$motionVectorOffset = LAYOUT.byteOffset(PATH$motionVectorOffset);
    public static final long OFFSET$appSpaceDeltaPose = LAYOUT.byteOffset(PATH$appSpaceDeltaPose);
    public static final long OFFSET$depthSubImage = LAYOUT.byteOffset(PATH$depthSubImage);
    public static final long OFFSET$minDepth = LAYOUT.byteOffset(PATH$minDepth);
    public static final long OFFSET$maxDepth = LAYOUT.byteOffset(PATH$maxDepth);
    public static final long OFFSET$nearZ = LAYOUT.byteOffset(PATH$nearZ);
    public static final long OFFSET$farZ = LAYOUT.byteOffset(PATH$farZ);
}
