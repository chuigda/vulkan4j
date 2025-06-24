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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentAnchorListEXT.html"><code>XrSpatialComponentAnchorListEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentAnchorListEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t locationCount; // @link substring="locationCount" target="#locationCount"
///     XrPosef* locations; // @link substring="XrPosef" target="XrPosef" @link substring="locations" target="#locations"
/// } XrSpatialComponentAnchorListEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentAnchorListEXT#allocate(Arena)}, {@link XrSpatialComponentAnchorListEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentAnchorListEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentAnchorListEXT.html"><code>XrSpatialComponentAnchorListEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentAnchorListEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentAnchorListEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentAnchorListEXT.html"><code>XrSpatialComponentAnchorListEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentAnchorListEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentAnchorListEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentAnchorListEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentAnchorListEXT, Iterable<XrSpatialComponentAnchorListEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentAnchorListEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentAnchorListEXT at(long index) {
            return new XrSpatialComponentAnchorListEXT(segment.asSlice(index * XrSpatialComponentAnchorListEXT.BYTES, XrSpatialComponentAnchorListEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialComponentAnchorListEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentAnchorListEXT.BYTES, XrSpatialComponentAnchorListEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentAnchorListEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentAnchorListEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentAnchorListEXT.BYTES,
                (end - start) * XrSpatialComponentAnchorListEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentAnchorListEXT.BYTES));
        }

        public XrSpatialComponentAnchorListEXT[] toArray() {
            XrSpatialComponentAnchorListEXT[] ret = new XrSpatialComponentAnchorListEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentAnchorListEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentAnchorListEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentAnchorListEXT.BYTES;
            }

            @Override
            public XrSpatialComponentAnchorListEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentAnchorListEXT ret = new XrSpatialComponentAnchorListEXT(segment.asSlice(0, XrSpatialComponentAnchorListEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentAnchorListEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentAnchorListEXT allocate(Arena arena) {
        XrSpatialComponentAnchorListEXT ret = new XrSpatialComponentAnchorListEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT);
        return ret;
    }

    public static XrSpatialComponentAnchorListEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentAnchorListEXT.Ptr ret = new XrSpatialComponentAnchorListEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentAnchorListEXT clone(Arena arena, XrSpatialComponentAnchorListEXT src) {
        XrSpatialComponentAnchorListEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_ANCHOR_LIST_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentAnchorListEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentAnchorListEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentAnchorListEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int locationCount() {
        return segment.get(LAYOUT$locationCount, OFFSET$locationCount);
    }

    public XrSpatialComponentAnchorListEXT locationCount(@Unsigned int value) {
        segment.set(LAYOUT$locationCount, OFFSET$locationCount, value);
        return this;
    }

    public XrSpatialComponentAnchorListEXT locations(@Nullable IXrPosef value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        locationsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrPosef.Ptr locations(int assumedCount) {
        MemorySegment s = locationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrPosef.BYTES);
        return new XrPosef.Ptr(s);
    }

    public @Nullable XrPosef locations() {
        MemorySegment s = locationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrPosef(s);
    }

    public @Pointer(target=XrPosef.class) @NotNull MemorySegment locationsRaw() {
        return segment.get(LAYOUT$locations, OFFSET$locations);
    }

    public void locationsRaw(@Pointer(target=XrPosef.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$locations, OFFSET$locations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("locationCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrPosef.LAYOUT).withName("locations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$locationCount = PathElement.groupElement("locationCount");
    public static final PathElement PATH$locations = PathElement.groupElement("locations");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$locationCount = (OfInt) LAYOUT.select(PATH$locationCount);
    public static final AddressLayout LAYOUT$locations = (AddressLayout) LAYOUT.select(PATH$locations);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$locationCount = LAYOUT$locationCount.byteSize();
    public static final long SIZE$locations = LAYOUT$locations.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$locationCount = LAYOUT.byteOffset(PATH$locationCount);
    public static final long OFFSET$locations = LAYOUT.byteOffset(PATH$locations);
}
