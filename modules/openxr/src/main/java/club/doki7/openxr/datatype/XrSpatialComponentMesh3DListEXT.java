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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentMesh3DListEXT.html"><code>XrSpatialComponentMesh3DListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentMesh3DListEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t meshCount; // @link substring="meshCount" target="#meshCount"
///     XrSpatialMeshDataEXT* meshes; // @link substring="XrSpatialMeshDataEXT" target="XrSpatialMeshDataEXT" @link substring="meshes" target="#meshes"
/// } XrSpatialComponentMesh3DListEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_MESH_3D_LIST_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentMesh3DListEXT#allocate(Arena)}, {@link XrSpatialComponentMesh3DListEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentMesh3DListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentMesh3DListEXT.html"><code>XrSpatialComponentMesh3DListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentMesh3DListEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentMesh3DListEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentMesh3DListEXT.html"><code>XrSpatialComponentMesh3DListEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentMesh3DListEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentMesh3DListEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentMesh3DListEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentMesh3DListEXT, Iterable<XrSpatialComponentMesh3DListEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentMesh3DListEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentMesh3DListEXT at(long index) {
            return new XrSpatialComponentMesh3DListEXT(segment.asSlice(index * XrSpatialComponentMesh3DListEXT.BYTES, XrSpatialComponentMesh3DListEXT.BYTES));
        }

        public XrSpatialComponentMesh3DListEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialComponentMesh3DListEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialComponentMesh3DListEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentMesh3DListEXT.BYTES, XrSpatialComponentMesh3DListEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentMesh3DListEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentMesh3DListEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentMesh3DListEXT.BYTES,
                (end - start) * XrSpatialComponentMesh3DListEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentMesh3DListEXT.BYTES));
        }

        public XrSpatialComponentMesh3DListEXT[] toArray() {
            XrSpatialComponentMesh3DListEXT[] ret = new XrSpatialComponentMesh3DListEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentMesh3DListEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentMesh3DListEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentMesh3DListEXT.BYTES;
            }

            @Override
            public XrSpatialComponentMesh3DListEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentMesh3DListEXT ret = new XrSpatialComponentMesh3DListEXT(segment.asSlice(0, XrSpatialComponentMesh3DListEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentMesh3DListEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentMesh3DListEXT allocate(Arena arena) {
        XrSpatialComponentMesh3DListEXT ret = new XrSpatialComponentMesh3DListEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_COMPONENT_MESH_3D_LIST_EXT);
        return ret;
    }

    public static XrSpatialComponentMesh3DListEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentMesh3DListEXT.Ptr ret = new XrSpatialComponentMesh3DListEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_COMPONENT_MESH_3D_LIST_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentMesh3DListEXT clone(Arena arena, XrSpatialComponentMesh3DListEXT src) {
        XrSpatialComponentMesh3DListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_COMPONENT_MESH_3D_LIST_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentMesh3DListEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentMesh3DListEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentMesh3DListEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int meshCount() {
        return segment.get(LAYOUT$meshCount, OFFSET$meshCount);
    }

    public XrSpatialComponentMesh3DListEXT meshCount(@Unsigned int value) {
        segment.set(LAYOUT$meshCount, OFFSET$meshCount, value);
        return this;
    }

    public XrSpatialComponentMesh3DListEXT meshes(@Nullable IXrSpatialMeshDataEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        meshesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpatialMeshDataEXT.Ptr meshes(int assumedCount) {
        MemorySegment s = meshesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpatialMeshDataEXT.BYTES);
        return new XrSpatialMeshDataEXT.Ptr(s);
    }

    public @Nullable XrSpatialMeshDataEXT meshes() {
        MemorySegment s = meshesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialMeshDataEXT(s);
    }

    public @Pointer(target=XrSpatialMeshDataEXT.class) @NotNull MemorySegment meshesRaw() {
        return segment.get(LAYOUT$meshes, OFFSET$meshes);
    }

    public void meshesRaw(@Pointer(target=XrSpatialMeshDataEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$meshes, OFFSET$meshes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("meshCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpatialMeshDataEXT.LAYOUT).withName("meshes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$meshCount = PathElement.groupElement("meshCount");
    public static final PathElement PATH$meshes = PathElement.groupElement("meshes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$meshCount = (OfInt) LAYOUT.select(PATH$meshCount);
    public static final AddressLayout LAYOUT$meshes = (AddressLayout) LAYOUT.select(PATH$meshes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$meshCount = LAYOUT$meshCount.byteSize();
    public static final long SIZE$meshes = LAYOUT$meshes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$meshCount = LAYOUT.byteOffset(PATH$meshCount);
    public static final long OFFSET$meshes = LAYOUT.byteOffset(PATH$meshes);
}
