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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCubeKHR.html"><code>XrCompositionLayerCubeKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerCubeKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrCompositionLayerFlags layerFlags; // optional // @link substring="XrCompositionLayerFlags" target="XrCompositionLayerFlags" @link substring="layerFlags" target="#layerFlags"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrEyeVisibility eyeVisibility; // @link substring="XrEyeVisibility" target="XrEyeVisibility" @link substring="eyeVisibility" target="#eyeVisibility"
///     XrSwapchain swapchain; // @link substring="XrSwapchain" target="XrSwapchain" @link substring="swapchain" target="#swapchain"
///     uint32_t imageArrayIndex; // @link substring="imageArrayIndex" target="#imageArrayIndex"
///     XrQuaternionf orientation; // @link substring="XrQuaternionf" target="XrQuaternionf" @link substring="orientation" target="#orientation"
/// } XrCompositionLayerCubeKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_CUBE_KHR`
///
/// The {@code allocate} ({@link XrCompositionLayerCubeKHR#allocate(Arena)}, {@link XrCompositionLayerCubeKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerCubeKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCubeKHR.html"><code>XrCompositionLayerCubeKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerCubeKHR(@NotNull MemorySegment segment) implements IXrCompositionLayerCubeKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerCubeKHR.html"><code>XrCompositionLayerCubeKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerCubeKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerCubeKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerCubeKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerCubeKHR, Iterable<XrCompositionLayerCubeKHR> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerCubeKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerCubeKHR at(long index) {
            return new XrCompositionLayerCubeKHR(segment.asSlice(index * XrCompositionLayerCubeKHR.BYTES, XrCompositionLayerCubeKHR.BYTES));
        }

        public void write(long index, @NotNull XrCompositionLayerCubeKHR value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerCubeKHR.BYTES, XrCompositionLayerCubeKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerCubeKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerCubeKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerCubeKHR.BYTES,
                (end - start) * XrCompositionLayerCubeKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerCubeKHR.BYTES));
        }

        public XrCompositionLayerCubeKHR[] toArray() {
            XrCompositionLayerCubeKHR[] ret = new XrCompositionLayerCubeKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerCubeKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerCubeKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerCubeKHR.BYTES;
            }

            @Override
            public XrCompositionLayerCubeKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerCubeKHR ret = new XrCompositionLayerCubeKHR(segment.asSlice(0, XrCompositionLayerCubeKHR.BYTES));
                segment = segment.asSlice(XrCompositionLayerCubeKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerCubeKHR allocate(Arena arena) {
        XrCompositionLayerCubeKHR ret = new XrCompositionLayerCubeKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CUBE_KHR);
        return ret;
    }

    public static XrCompositionLayerCubeKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerCubeKHR.Ptr ret = new XrCompositionLayerCubeKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CUBE_KHR);
        }
        return ret;
    }

    public static XrCompositionLayerCubeKHR clone(Arena arena, XrCompositionLayerCubeKHR src) {
        XrCompositionLayerCubeKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_COMPOSITION_LAYER_CUBE_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerCubeKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerCubeKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerCubeKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrCompositionLayerFlags.class) int layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrCompositionLayerCubeKHR layerFlags(@Bitmask(XrCompositionLayerFlags.class) int value) {
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

    public XrCompositionLayerCubeKHR space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrEyeVisibility.class) int eyeVisibility() {
        return segment.get(LAYOUT$eyeVisibility, OFFSET$eyeVisibility);
    }

    public XrCompositionLayerCubeKHR eyeVisibility(@EnumType(XrEyeVisibility.class) int value) {
        segment.set(LAYOUT$eyeVisibility, OFFSET$eyeVisibility, value);
        return this;
    }

    public @Nullable XrSwapchain swapchain() {
        MemorySegment s = segment.asSlice(OFFSET$swapchain, SIZE$swapchain);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSwapchain(s);
    }

    public XrCompositionLayerCubeKHR swapchain(@Nullable XrSwapchain value) {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int imageArrayIndex() {
        return segment.get(LAYOUT$imageArrayIndex, OFFSET$imageArrayIndex);
    }

    public XrCompositionLayerCubeKHR imageArrayIndex(@Unsigned int value) {
        segment.set(LAYOUT$imageArrayIndex, OFFSET$imageArrayIndex, value);
        return this;
    }

    public @NotNull XrQuaternionf orientation() {
        return new XrQuaternionf(segment.asSlice(OFFSET$orientation, LAYOUT$orientation));
    }

    public XrCompositionLayerCubeKHR orientation(@NotNull XrQuaternionf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$orientation, SIZE$orientation);
        return this;
    }

    public XrCompositionLayerCubeKHR orientation(Consumer<@NotNull XrQuaternionf> consumer) {
        consumer.accept(orientation());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("layerFlags"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("eyeVisibility"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageArrayIndex"),
        XrQuaternionf.LAYOUT.withName("orientation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerFlags = PathElement.groupElement("layerFlags");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$eyeVisibility = PathElement.groupElement("eyeVisibility");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$imageArrayIndex = PathElement.groupElement("imageArrayIndex");
    public static final PathElement PATH$orientation = PathElement.groupElement("orientation");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$layerFlags = (OfInt) LAYOUT.select(PATH$layerFlags);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$eyeVisibility = (OfInt) LAYOUT.select(PATH$eyeVisibility);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageArrayIndex = (OfInt) LAYOUT.select(PATH$imageArrayIndex);
    public static final StructLayout LAYOUT$orientation = (StructLayout) LAYOUT.select(PATH$orientation);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$eyeVisibility = LAYOUT$eyeVisibility.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$imageArrayIndex = LAYOUT$imageArrayIndex.byteSize();
    public static final long SIZE$orientation = LAYOUT$orientation.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$eyeVisibility = LAYOUT.byteOffset(PATH$eyeVisibility);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageArrayIndex = LAYOUT.byteOffset(PATH$imageArrayIndex);
    public static final long OFFSET$orientation = LAYOUT.byteOffset(PATH$orientation);
}
