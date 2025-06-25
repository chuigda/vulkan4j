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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneAlignmentListEXT.html"><code>XrSpatialComponentPlaneAlignmentListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentPlaneAlignmentListEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t planeAlignmentCount; // @link substring="planeAlignmentCount" target="#planeAlignmentCount"
///     XrSpatialPlaneAlignmentEXT* planeAlignments; // @link substring="XrSpatialPlaneAlignmentEXT" target="XrSpatialPlaneAlignmentEXT" @link substring="planeAlignments" target="#planeAlignments"
/// } XrSpatialComponentPlaneAlignmentListEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentPlaneAlignmentListEXT#allocate(Arena)}, {@link XrSpatialComponentPlaneAlignmentListEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentPlaneAlignmentListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneAlignmentListEXT.html"><code>XrSpatialComponentPlaneAlignmentListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentPlaneAlignmentListEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentPlaneAlignmentListEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPlaneAlignmentListEXT.html"><code>XrSpatialComponentPlaneAlignmentListEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentPlaneAlignmentListEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentPlaneAlignmentListEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentPlaneAlignmentListEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentPlaneAlignmentListEXT, Iterable<XrSpatialComponentPlaneAlignmentListEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentPlaneAlignmentListEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentPlaneAlignmentListEXT at(long index) {
            return new XrSpatialComponentPlaneAlignmentListEXT(segment.asSlice(index * XrSpatialComponentPlaneAlignmentListEXT.BYTES, XrSpatialComponentPlaneAlignmentListEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialComponentPlaneAlignmentListEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialComponentPlaneAlignmentListEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentPlaneAlignmentListEXT.BYTES, XrSpatialComponentPlaneAlignmentListEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentPlaneAlignmentListEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentPlaneAlignmentListEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentPlaneAlignmentListEXT.BYTES,
                (end - start) * XrSpatialComponentPlaneAlignmentListEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentPlaneAlignmentListEXT.BYTES));
        }

        public XrSpatialComponentPlaneAlignmentListEXT[] toArray() {
            XrSpatialComponentPlaneAlignmentListEXT[] ret = new XrSpatialComponentPlaneAlignmentListEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentPlaneAlignmentListEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentPlaneAlignmentListEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentPlaneAlignmentListEXT.BYTES;
            }

            @Override
            public XrSpatialComponentPlaneAlignmentListEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentPlaneAlignmentListEXT ret = new XrSpatialComponentPlaneAlignmentListEXT(segment.asSlice(0, XrSpatialComponentPlaneAlignmentListEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentPlaneAlignmentListEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentPlaneAlignmentListEXT allocate(Arena arena) {
        XrSpatialComponentPlaneAlignmentListEXT ret = new XrSpatialComponentPlaneAlignmentListEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT);
        return ret;
    }

    public static XrSpatialComponentPlaneAlignmentListEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentPlaneAlignmentListEXT.Ptr ret = new XrSpatialComponentPlaneAlignmentListEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentPlaneAlignmentListEXT clone(Arena arena, XrSpatialComponentPlaneAlignmentListEXT src) {
        XrSpatialComponentPlaneAlignmentListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_COMPONENT_PLANE_ALIGNMENT_LIST_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentPlaneAlignmentListEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentPlaneAlignmentListEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentPlaneAlignmentListEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int planeAlignmentCount() {
        return segment.get(LAYOUT$planeAlignmentCount, OFFSET$planeAlignmentCount);
    }

    public XrSpatialComponentPlaneAlignmentListEXT planeAlignmentCount(@Unsigned int value) {
        segment.set(LAYOUT$planeAlignmentCount, OFFSET$planeAlignmentCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSpatialPlaneAlignmentEXT.class) IntPtr planeAlignments() {
        MemorySegment s = planeAlignmentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialComponentPlaneAlignmentListEXT planeAlignments(@Nullable @EnumType(XrSpatialPlaneAlignmentEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        planeAlignmentsRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialPlaneAlignmentEXT.class) @NotNull MemorySegment planeAlignmentsRaw() {
        return segment.get(LAYOUT$planeAlignments, OFFSET$planeAlignments);
    }

    public void planeAlignmentsRaw(@Pointer(target=XrSpatialPlaneAlignmentEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$planeAlignments, OFFSET$planeAlignments, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("planeAlignmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("planeAlignments")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$planeAlignmentCount = PathElement.groupElement("planeAlignmentCount");
    public static final PathElement PATH$planeAlignments = PathElement.groupElement("planeAlignments");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$planeAlignmentCount = (OfInt) LAYOUT.select(PATH$planeAlignmentCount);
    public static final AddressLayout LAYOUT$planeAlignments = (AddressLayout) LAYOUT.select(PATH$planeAlignments);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$planeAlignmentCount = LAYOUT$planeAlignmentCount.byteSize();
    public static final long SIZE$planeAlignments = LAYOUT$planeAlignments.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$planeAlignmentCount = LAYOUT.byteOffset(PATH$planeAlignmentCount);
    public static final long OFFSET$planeAlignments = LAYOUT.byteOffset(PATH$planeAlignments);
}
