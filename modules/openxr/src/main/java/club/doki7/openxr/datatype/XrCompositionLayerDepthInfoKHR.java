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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerDepthInfoKHR.html"><code>XrCompositionLayerDepthInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerDepthInfoKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSwapchainSubImage subImage; // @link substring="XrSwapchainSubImage" target="XrSwapchainSubImage" @link substring="subImage" target="#subImage"
///     float minDepth; // @link substring="minDepth" target="#minDepth"
///     float maxDepth; // @link substring="maxDepth" target="#maxDepth"
///     float nearZ; // @link substring="nearZ" target="#nearZ"
///     float farZ; // @link substring="farZ" target="#farZ"
/// } XrCompositionLayerDepthInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_DEPTH_INFO_KHR`
///
/// The {@code allocate} ({@link XrCompositionLayerDepthInfoKHR#allocate(Arena)}, {@link XrCompositionLayerDepthInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerDepthInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerDepthInfoKHR.html"><code>XrCompositionLayerDepthInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerDepthInfoKHR(@NotNull MemorySegment segment) implements IXrCompositionLayerDepthInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerDepthInfoKHR.html"><code>XrCompositionLayerDepthInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerDepthInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerDepthInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerDepthInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerDepthInfoKHR, Iterable<XrCompositionLayerDepthInfoKHR> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerDepthInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerDepthInfoKHR at(long index) {
            return new XrCompositionLayerDepthInfoKHR(segment.asSlice(index * XrCompositionLayerDepthInfoKHR.BYTES, XrCompositionLayerDepthInfoKHR.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrCompositionLayerDepthInfoKHR> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrCompositionLayerDepthInfoKHR value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerDepthInfoKHR.BYTES, XrCompositionLayerDepthInfoKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerDepthInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerDepthInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerDepthInfoKHR.BYTES,
                (end - start) * XrCompositionLayerDepthInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerDepthInfoKHR.BYTES));
        }

        public XrCompositionLayerDepthInfoKHR[] toArray() {
            XrCompositionLayerDepthInfoKHR[] ret = new XrCompositionLayerDepthInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerDepthInfoKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerDepthInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerDepthInfoKHR.BYTES;
            }

            @Override
            public XrCompositionLayerDepthInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerDepthInfoKHR ret = new XrCompositionLayerDepthInfoKHR(segment.asSlice(0, XrCompositionLayerDepthInfoKHR.BYTES));
                segment = segment.asSlice(XrCompositionLayerDepthInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerDepthInfoKHR allocate(Arena arena) {
        XrCompositionLayerDepthInfoKHR ret = new XrCompositionLayerDepthInfoKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COMPOSITION_LAYER_DEPTH_INFO_KHR);
        return ret;
    }

    public static XrCompositionLayerDepthInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerDepthInfoKHR.Ptr ret = new XrCompositionLayerDepthInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COMPOSITION_LAYER_DEPTH_INFO_KHR);
        }
        return ret;
    }

    public static XrCompositionLayerDepthInfoKHR clone(Arena arena, XrCompositionLayerDepthInfoKHR src) {
        XrCompositionLayerDepthInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COMPOSITION_LAYER_DEPTH_INFO_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerDepthInfoKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerDepthInfoKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerDepthInfoKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrSwapchainSubImage subImage() {
        return new XrSwapchainSubImage(segment.asSlice(OFFSET$subImage, LAYOUT$subImage));
    }

    public XrCompositionLayerDepthInfoKHR subImage(@NotNull XrSwapchainSubImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subImage, SIZE$subImage);
        return this;
    }

    public XrCompositionLayerDepthInfoKHR subImage(Consumer<@NotNull XrSwapchainSubImage> consumer) {
        consumer.accept(subImage());
        return this;
    }

    public float minDepth() {
        return segment.get(LAYOUT$minDepth, OFFSET$minDepth);
    }

    public XrCompositionLayerDepthInfoKHR minDepth(float value) {
        segment.set(LAYOUT$minDepth, OFFSET$minDepth, value);
        return this;
    }

    public float maxDepth() {
        return segment.get(LAYOUT$maxDepth, OFFSET$maxDepth);
    }

    public XrCompositionLayerDepthInfoKHR maxDepth(float value) {
        segment.set(LAYOUT$maxDepth, OFFSET$maxDepth, value);
        return this;
    }

    public float nearZ() {
        return segment.get(LAYOUT$nearZ, OFFSET$nearZ);
    }

    public XrCompositionLayerDepthInfoKHR nearZ(float value) {
        segment.set(LAYOUT$nearZ, OFFSET$nearZ, value);
        return this;
    }

    public float farZ() {
        return segment.get(LAYOUT$farZ, OFFSET$farZ);
    }

    public XrCompositionLayerDepthInfoKHR farZ(float value) {
        segment.set(LAYOUT$farZ, OFFSET$farZ, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrSwapchainSubImage.LAYOUT.withName("subImage"),
        ValueLayout.JAVA_FLOAT.withName("minDepth"),
        ValueLayout.JAVA_FLOAT.withName("maxDepth"),
        ValueLayout.JAVA_FLOAT.withName("nearZ"),
        ValueLayout.JAVA_FLOAT.withName("farZ")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$subImage = PathElement.groupElement("subImage");
    public static final PathElement PATH$minDepth = PathElement.groupElement("minDepth");
    public static final PathElement PATH$maxDepth = PathElement.groupElement("maxDepth");
    public static final PathElement PATH$nearZ = PathElement.groupElement("nearZ");
    public static final PathElement PATH$farZ = PathElement.groupElement("farZ");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$subImage = (StructLayout) LAYOUT.select(PATH$subImage);
    public static final OfFloat LAYOUT$minDepth = (OfFloat) LAYOUT.select(PATH$minDepth);
    public static final OfFloat LAYOUT$maxDepth = (OfFloat) LAYOUT.select(PATH$maxDepth);
    public static final OfFloat LAYOUT$nearZ = (OfFloat) LAYOUT.select(PATH$nearZ);
    public static final OfFloat LAYOUT$farZ = (OfFloat) LAYOUT.select(PATH$farZ);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$subImage = LAYOUT$subImage.byteSize();
    public static final long SIZE$minDepth = LAYOUT$minDepth.byteSize();
    public static final long SIZE$maxDepth = LAYOUT$maxDepth.byteSize();
    public static final long SIZE$nearZ = LAYOUT$nearZ.byteSize();
    public static final long SIZE$farZ = LAYOUT$farZ.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$subImage = LAYOUT.byteOffset(PATH$subImage);
    public static final long OFFSET$minDepth = LAYOUT.byteOffset(PATH$minDepth);
    public static final long OFFSET$maxDepth = LAYOUT.byteOffset(PATH$maxDepth);
    public static final long OFFSET$nearZ = LAYOUT.byteOffset(PATH$nearZ);
    public static final long OFFSET$farZ = LAYOUT.byteOffset(PATH$farZ);
}
