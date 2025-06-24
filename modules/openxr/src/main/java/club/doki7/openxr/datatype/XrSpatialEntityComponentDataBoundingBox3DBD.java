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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataBoundingBox3DBD.html"><code>XrSpatialEntityComponentDataBoundingBox3DBD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialEntityComponentDataBoundingBox3DBD {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBoxf boundingBox3D; // @link substring="XrBoxf" target="XrBoxf" @link substring="boundingBox3D" target="#boundingBox3D"
/// } XrSpatialEntityComponentDataBoundingBox3DBD;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD`
///
/// The {@code allocate} ({@link XrSpatialEntityComponentDataBoundingBox3DBD#allocate(Arena)}, {@link XrSpatialEntityComponentDataBoundingBox3DBD#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialEntityComponentDataBoundingBox3DBD#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataBoundingBox3DBD.html"><code>XrSpatialEntityComponentDataBoundingBox3DBD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialEntityComponentDataBoundingBox3DBD(@NotNull MemorySegment segment) implements IXrSpatialEntityComponentDataBoundingBox3DBD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataBoundingBox3DBD.html"><code>XrSpatialEntityComponentDataBoundingBox3DBD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialEntityComponentDataBoundingBox3DBD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialEntityComponentDataBoundingBox3DBD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialEntityComponentDataBoundingBox3DBD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialEntityComponentDataBoundingBox3DBD, Iterable<XrSpatialEntityComponentDataBoundingBox3DBD> {
        public long size() {
            return segment.byteSize() / XrSpatialEntityComponentDataBoundingBox3DBD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialEntityComponentDataBoundingBox3DBD at(long index) {
            return new XrSpatialEntityComponentDataBoundingBox3DBD(segment.asSlice(index * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES, XrSpatialEntityComponentDataBoundingBox3DBD.BYTES));
        }

        public void write(long index, @NotNull XrSpatialEntityComponentDataBoundingBox3DBD value) {
            MemorySegment s = segment.asSlice(index * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES, XrSpatialEntityComponentDataBoundingBox3DBD.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES,
                (end - start) * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialEntityComponentDataBoundingBox3DBD.BYTES));
        }

        public XrSpatialEntityComponentDataBoundingBox3DBD[] toArray() {
            XrSpatialEntityComponentDataBoundingBox3DBD[] ret = new XrSpatialEntityComponentDataBoundingBox3DBD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialEntityComponentDataBoundingBox3DBD> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialEntityComponentDataBoundingBox3DBD> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialEntityComponentDataBoundingBox3DBD.BYTES;
            }

            @Override
            public XrSpatialEntityComponentDataBoundingBox3DBD next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialEntityComponentDataBoundingBox3DBD ret = new XrSpatialEntityComponentDataBoundingBox3DBD(segment.asSlice(0, XrSpatialEntityComponentDataBoundingBox3DBD.BYTES));
                segment = segment.asSlice(XrSpatialEntityComponentDataBoundingBox3DBD.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialEntityComponentDataBoundingBox3DBD allocate(Arena arena) {
        XrSpatialEntityComponentDataBoundingBox3DBD ret = new XrSpatialEntityComponentDataBoundingBox3DBD(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD);
        return ret;
    }

    public static XrSpatialEntityComponentDataBoundingBox3DBD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialEntityComponentDataBoundingBox3DBD.Ptr ret = new XrSpatialEntityComponentDataBoundingBox3DBD.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD);
        }
        return ret;
    }

    public static XrSpatialEntityComponentDataBoundingBox3DBD clone(Arena arena, XrSpatialEntityComponentDataBoundingBox3DBD src) {
        XrSpatialEntityComponentDataBoundingBox3DBD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_BOUNDING_BOX_3D_BD);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialEntityComponentDataBoundingBox3DBD type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialEntityComponentDataBoundingBox3DBD next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialEntityComponentDataBoundingBox3DBD next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrBoxf boundingBox3D() {
        return new XrBoxf(segment.asSlice(OFFSET$boundingBox3D, LAYOUT$boundingBox3D));
    }

    public XrSpatialEntityComponentDataBoundingBox3DBD boundingBox3D(@NotNull XrBoxf value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$boundingBox3D, SIZE$boundingBox3D);
        return this;
    }

    public XrSpatialEntityComponentDataBoundingBox3DBD boundingBox3D(Consumer<@NotNull XrBoxf> consumer) {
        consumer.accept(boundingBox3D());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrBoxf.LAYOUT.withName("boundingBox3D")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$boundingBox3D = PathElement.groupElement("boundingBox3D");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$boundingBox3D = (StructLayout) LAYOUT.select(PATH$boundingBox3D);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$boundingBox3D = LAYOUT$boundingBox3D.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$boundingBox3D = LAYOUT.byteOffset(PATH$boundingBox3D);
}
