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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPolygon2DListEXT.html"><code>XrSpatialComponentPolygon2DListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentPolygon2DListEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t polygonCount; // @link substring="polygonCount" target="#polygonCount"
///     XrSpatialPolygon2DDataEXT* polygons; // @link substring="XrSpatialPolygon2DDataEXT" target="XrSpatialPolygon2DDataEXT" @link substring="polygons" target="#polygons"
/// } XrSpatialComponentPolygon2DListEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentPolygon2DListEXT#allocate(Arena)}, {@link XrSpatialComponentPolygon2DListEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentPolygon2DListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPolygon2DListEXT.html"><code>XrSpatialComponentPolygon2DListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentPolygon2DListEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentPolygon2DListEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentPolygon2DListEXT.html"><code>XrSpatialComponentPolygon2DListEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentPolygon2DListEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentPolygon2DListEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentPolygon2DListEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentPolygon2DListEXT, Iterable<XrSpatialComponentPolygon2DListEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentPolygon2DListEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentPolygon2DListEXT at(long index) {
            return new XrSpatialComponentPolygon2DListEXT(segment.asSlice(index * XrSpatialComponentPolygon2DListEXT.BYTES, XrSpatialComponentPolygon2DListEXT.BYTES));
        }

        public XrSpatialComponentPolygon2DListEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialComponentPolygon2DListEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialComponentPolygon2DListEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentPolygon2DListEXT.BYTES, XrSpatialComponentPolygon2DListEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentPolygon2DListEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentPolygon2DListEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentPolygon2DListEXT.BYTES,
                (end - start) * XrSpatialComponentPolygon2DListEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentPolygon2DListEXT.BYTES));
        }

        public XrSpatialComponentPolygon2DListEXT[] toArray() {
            XrSpatialComponentPolygon2DListEXT[] ret = new XrSpatialComponentPolygon2DListEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentPolygon2DListEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentPolygon2DListEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentPolygon2DListEXT.BYTES;
            }

            @Override
            public XrSpatialComponentPolygon2DListEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentPolygon2DListEXT ret = new XrSpatialComponentPolygon2DListEXT(segment.asSlice(0, XrSpatialComponentPolygon2DListEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentPolygon2DListEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentPolygon2DListEXT allocate(Arena arena) {
        XrSpatialComponentPolygon2DListEXT ret = new XrSpatialComponentPolygon2DListEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT);
        return ret;
    }

    public static XrSpatialComponentPolygon2DListEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentPolygon2DListEXT.Ptr ret = new XrSpatialComponentPolygon2DListEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentPolygon2DListEXT clone(Arena arena, XrSpatialComponentPolygon2DListEXT src) {
        XrSpatialComponentPolygon2DListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_COMPONENT_POLYGON_2D_LIST_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentPolygon2DListEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentPolygon2DListEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentPolygon2DListEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int polygonCount() {
        return segment.get(LAYOUT$polygonCount, OFFSET$polygonCount);
    }

    public XrSpatialComponentPolygon2DListEXT polygonCount(@Unsigned int value) {
        segment.set(LAYOUT$polygonCount, OFFSET$polygonCount, value);
        return this;
    }

    public XrSpatialComponentPolygon2DListEXT polygons(@Nullable IXrSpatialPolygon2DDataEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        polygonsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpatialPolygon2DDataEXT.Ptr polygons(int assumedCount) {
        MemorySegment s = polygonsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpatialPolygon2DDataEXT.BYTES);
        return new XrSpatialPolygon2DDataEXT.Ptr(s);
    }

    public @Nullable XrSpatialPolygon2DDataEXT polygons() {
        MemorySegment s = polygonsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialPolygon2DDataEXT(s);
    }

    public @Pointer(target=XrSpatialPolygon2DDataEXT.class) @NotNull MemorySegment polygonsRaw() {
        return segment.get(LAYOUT$polygons, OFFSET$polygons);
    }

    public void polygonsRaw(@Pointer(target=XrSpatialPolygon2DDataEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$polygons, OFFSET$polygons, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("polygonCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpatialPolygon2DDataEXT.LAYOUT).withName("polygons")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$polygonCount = PathElement.groupElement("polygonCount");
    public static final PathElement PATH$polygons = PathElement.groupElement("polygons");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$polygonCount = (OfInt) LAYOUT.select(PATH$polygonCount);
    public static final AddressLayout LAYOUT$polygons = (AddressLayout) LAYOUT.select(PATH$polygons);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$polygonCount = LAYOUT$polygonCount.byteSize();
    public static final long SIZE$polygons = LAYOUT$polygons.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$polygonCount = LAYOUT.byteOffset(PATH$polygonCount);
    public static final long OFFSET$polygons = LAYOUT.byteOffset(PATH$polygons);
}
