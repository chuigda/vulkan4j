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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneSemanticLabelListEXT.html"><code>XrSpatialComponentPlaneSemanticLabelListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentPlaneSemanticLabelListEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t semanticLabelCount; // @link substring="semanticLabelCount" target="#semanticLabelCount"
///     XrSpatialPlaneSemanticLabelEXT* semanticLabels; // @link substring="XrSpatialPlaneSemanticLabelEXT" target="XrSpatialPlaneSemanticLabelEXT" @link substring="semanticLabels" target="#semanticLabels"
/// } XrSpatialComponentPlaneSemanticLabelListEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentPlaneSemanticLabelListEXT#allocate(Arena)}, {@link XrSpatialComponentPlaneSemanticLabelListEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentPlaneSemanticLabelListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneSemanticLabelListEXT.html"><code>XrSpatialComponentPlaneSemanticLabelListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentPlaneSemanticLabelListEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentPlaneSemanticLabelListEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneSemanticLabelListEXT.html"><code>XrSpatialComponentPlaneSemanticLabelListEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentPlaneSemanticLabelListEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentPlaneSemanticLabelListEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentPlaneSemanticLabelListEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentPlaneSemanticLabelListEXT, Iterable<XrSpatialComponentPlaneSemanticLabelListEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentPlaneSemanticLabelListEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentPlaneSemanticLabelListEXT at(long index) {
            return new XrSpatialComponentPlaneSemanticLabelListEXT(segment.asSlice(index * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES, XrSpatialComponentPlaneSemanticLabelListEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialComponentPlaneSemanticLabelListEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES, XrSpatialComponentPlaneSemanticLabelListEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES,
                (end - start) * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentPlaneSemanticLabelListEXT.BYTES));
        }

        public XrSpatialComponentPlaneSemanticLabelListEXT[] toArray() {
            XrSpatialComponentPlaneSemanticLabelListEXT[] ret = new XrSpatialComponentPlaneSemanticLabelListEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentPlaneSemanticLabelListEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentPlaneSemanticLabelListEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentPlaneSemanticLabelListEXT.BYTES;
            }

            @Override
            public XrSpatialComponentPlaneSemanticLabelListEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentPlaneSemanticLabelListEXT ret = new XrSpatialComponentPlaneSemanticLabelListEXT(segment.asSlice(0, XrSpatialComponentPlaneSemanticLabelListEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentPlaneSemanticLabelListEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentPlaneSemanticLabelListEXT allocate(Arena arena) {
        XrSpatialComponentPlaneSemanticLabelListEXT ret = new XrSpatialComponentPlaneSemanticLabelListEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT);
        return ret;
    }

    public static XrSpatialComponentPlaneSemanticLabelListEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentPlaneSemanticLabelListEXT.Ptr ret = new XrSpatialComponentPlaneSemanticLabelListEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentPlaneSemanticLabelListEXT clone(Arena arena, XrSpatialComponentPlaneSemanticLabelListEXT src) {
        XrSpatialComponentPlaneSemanticLabelListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_PLANE_SEMANTIC_LABEL_LIST_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentPlaneSemanticLabelListEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentPlaneSemanticLabelListEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentPlaneSemanticLabelListEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int semanticLabelCount() {
        return segment.get(LAYOUT$semanticLabelCount, OFFSET$semanticLabelCount);
    }

    public XrSpatialComponentPlaneSemanticLabelListEXT semanticLabelCount(@Unsigned int value) {
        segment.set(LAYOUT$semanticLabelCount, OFFSET$semanticLabelCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSpatialPlaneSemanticLabelEXT.class) IntPtr semanticLabels() {
        MemorySegment s = semanticLabelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialComponentPlaneSemanticLabelListEXT semanticLabels(@Nullable @EnumType(XrSpatialPlaneSemanticLabelEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        semanticLabelsRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialPlaneSemanticLabelEXT.class) @NotNull MemorySegment semanticLabelsRaw() {
        return segment.get(LAYOUT$semanticLabels, OFFSET$semanticLabels);
    }

    public void semanticLabelsRaw(@Pointer(target=XrSpatialPlaneSemanticLabelEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$semanticLabels, OFFSET$semanticLabels, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("semanticLabelCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("semanticLabels")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$semanticLabelCount = PathElement.groupElement("semanticLabelCount");
    public static final PathElement PATH$semanticLabels = PathElement.groupElement("semanticLabels");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$semanticLabelCount = (OfInt) LAYOUT.select(PATH$semanticLabelCount);
    public static final AddressLayout LAYOUT$semanticLabels = (AddressLayout) LAYOUT.select(PATH$semanticLabels);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$semanticLabelCount = LAYOUT$semanticLabelCount.byteSize();
    public static final long SIZE$semanticLabels = LAYOUT$semanticLabels.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$semanticLabelCount = LAYOUT.byteOffset(PATH$semanticLabelCount);
    public static final long OFFSET$semanticLabels = LAYOUT.byteOffset(PATH$semanticLabels);
}
