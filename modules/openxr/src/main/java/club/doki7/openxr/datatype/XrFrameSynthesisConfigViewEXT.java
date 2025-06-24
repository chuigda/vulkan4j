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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisConfigViewEXT.html"><code>XrFrameSynthesisConfigViewEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFrameSynthesisConfigViewEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t recommendedMotionVectorImageRectWidth; // @link substring="recommendedMotionVectorImageRectWidth" target="#recommendedMotionVectorImageRectWidth"
///     uint32_t recommendedMotionVectorImageRectHeight; // @link substring="recommendedMotionVectorImageRectHeight" target="#recommendedMotionVectorImageRectHeight"
/// } XrFrameSynthesisConfigViewEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT`
///
/// The {@code allocate} ({@link XrFrameSynthesisConfigViewEXT#allocate(Arena)}, {@link XrFrameSynthesisConfigViewEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFrameSynthesisConfigViewEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisConfigViewEXT.html"><code>XrFrameSynthesisConfigViewEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFrameSynthesisConfigViewEXT(@NotNull MemorySegment segment) implements IXrFrameSynthesisConfigViewEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisConfigViewEXT.html"><code>XrFrameSynthesisConfigViewEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFrameSynthesisConfigViewEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFrameSynthesisConfigViewEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFrameSynthesisConfigViewEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFrameSynthesisConfigViewEXT, Iterable<XrFrameSynthesisConfigViewEXT> {
        public long size() {
            return segment.byteSize() / XrFrameSynthesisConfigViewEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFrameSynthesisConfigViewEXT at(long index) {
            return new XrFrameSynthesisConfigViewEXT(segment.asSlice(index * XrFrameSynthesisConfigViewEXT.BYTES, XrFrameSynthesisConfigViewEXT.BYTES));
        }

        public void write(long index, @NotNull XrFrameSynthesisConfigViewEXT value) {
            MemorySegment s = segment.asSlice(index * XrFrameSynthesisConfigViewEXT.BYTES, XrFrameSynthesisConfigViewEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFrameSynthesisConfigViewEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFrameSynthesisConfigViewEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFrameSynthesisConfigViewEXT.BYTES,
                (end - start) * XrFrameSynthesisConfigViewEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFrameSynthesisConfigViewEXT.BYTES));
        }

        public XrFrameSynthesisConfigViewEXT[] toArray() {
            XrFrameSynthesisConfigViewEXT[] ret = new XrFrameSynthesisConfigViewEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFrameSynthesisConfigViewEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFrameSynthesisConfigViewEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFrameSynthesisConfigViewEXT.BYTES;
            }

            @Override
            public XrFrameSynthesisConfigViewEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFrameSynthesisConfigViewEXT ret = new XrFrameSynthesisConfigViewEXT(segment.asSlice(0, XrFrameSynthesisConfigViewEXT.BYTES));
                segment = segment.asSlice(XrFrameSynthesisConfigViewEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFrameSynthesisConfigViewEXT allocate(Arena arena) {
        XrFrameSynthesisConfigViewEXT ret = new XrFrameSynthesisConfigViewEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT);
        return ret;
    }

    public static XrFrameSynthesisConfigViewEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFrameSynthesisConfigViewEXT.Ptr ret = new XrFrameSynthesisConfigViewEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT);
        }
        return ret;
    }

    public static XrFrameSynthesisConfigViewEXT clone(Arena arena, XrFrameSynthesisConfigViewEXT src) {
        XrFrameSynthesisConfigViewEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_FRAME_SYNTHESIS_CONFIG_VIEW_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFrameSynthesisConfigViewEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFrameSynthesisConfigViewEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFrameSynthesisConfigViewEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int recommendedMotionVectorImageRectWidth() {
        return segment.get(LAYOUT$recommendedMotionVectorImageRectWidth, OFFSET$recommendedMotionVectorImageRectWidth);
    }

    public XrFrameSynthesisConfigViewEXT recommendedMotionVectorImageRectWidth(@Unsigned int value) {
        segment.set(LAYOUT$recommendedMotionVectorImageRectWidth, OFFSET$recommendedMotionVectorImageRectWidth, value);
        return this;
    }

    public @Unsigned int recommendedMotionVectorImageRectHeight() {
        return segment.get(LAYOUT$recommendedMotionVectorImageRectHeight, OFFSET$recommendedMotionVectorImageRectHeight);
    }

    public XrFrameSynthesisConfigViewEXT recommendedMotionVectorImageRectHeight(@Unsigned int value) {
        segment.set(LAYOUT$recommendedMotionVectorImageRectHeight, OFFSET$recommendedMotionVectorImageRectHeight, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("recommendedMotionVectorImageRectWidth"),
        ValueLayout.JAVA_INT.withName("recommendedMotionVectorImageRectHeight")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$recommendedMotionVectorImageRectWidth = PathElement.groupElement("recommendedMotionVectorImageRectWidth");
    public static final PathElement PATH$recommendedMotionVectorImageRectHeight = PathElement.groupElement("recommendedMotionVectorImageRectHeight");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$recommendedMotionVectorImageRectWidth = (OfInt) LAYOUT.select(PATH$recommendedMotionVectorImageRectWidth);
    public static final OfInt LAYOUT$recommendedMotionVectorImageRectHeight = (OfInt) LAYOUT.select(PATH$recommendedMotionVectorImageRectHeight);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$recommendedMotionVectorImageRectWidth = LAYOUT$recommendedMotionVectorImageRectWidth.byteSize();
    public static final long SIZE$recommendedMotionVectorImageRectHeight = LAYOUT$recommendedMotionVectorImageRectHeight.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$recommendedMotionVectorImageRectWidth = LAYOUT.byteOffset(PATH$recommendedMotionVectorImageRectWidth);
    public static final long OFFSET$recommendedMotionVectorImageRectHeight = LAYOUT.byteOffset(PATH$recommendedMotionVectorImageRectHeight);
}
