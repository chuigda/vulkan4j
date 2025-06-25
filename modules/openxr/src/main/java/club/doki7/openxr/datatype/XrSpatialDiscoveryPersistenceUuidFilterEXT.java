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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialDiscoveryPersistenceUuidFilterEXT.html"><code>XrSpatialDiscoveryPersistenceUuidFilterEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialDiscoveryPersistenceUuidFilterEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t persistedUuidCount; // @link substring="persistedUuidCount" target="#persistedUuidCount"
///     XrUuid const* persistedUuids; // @link substring="XrUuid" target="XrUuid" @link substring="persistedUuids" target="#persistedUuids"
/// } XrSpatialDiscoveryPersistenceUuidFilterEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT`
///
/// The {@code allocate} ({@link XrSpatialDiscoveryPersistenceUuidFilterEXT#allocate(Arena)}, {@link XrSpatialDiscoveryPersistenceUuidFilterEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialDiscoveryPersistenceUuidFilterEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialDiscoveryPersistenceUuidFilterEXT.html"><code>XrSpatialDiscoveryPersistenceUuidFilterEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialDiscoveryPersistenceUuidFilterEXT(@NotNull MemorySegment segment) implements IXrSpatialDiscoveryPersistenceUuidFilterEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialDiscoveryPersistenceUuidFilterEXT.html"><code>XrSpatialDiscoveryPersistenceUuidFilterEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialDiscoveryPersistenceUuidFilterEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialDiscoveryPersistenceUuidFilterEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialDiscoveryPersistenceUuidFilterEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialDiscoveryPersistenceUuidFilterEXT, Iterable<XrSpatialDiscoveryPersistenceUuidFilterEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialDiscoveryPersistenceUuidFilterEXT at(long index) {
            return new XrSpatialDiscoveryPersistenceUuidFilterEXT(segment.asSlice(index * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES, XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialDiscoveryPersistenceUuidFilterEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES, XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES,
                (end - start) * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES));
        }

        public XrSpatialDiscoveryPersistenceUuidFilterEXT[] toArray() {
            XrSpatialDiscoveryPersistenceUuidFilterEXT[] ret = new XrSpatialDiscoveryPersistenceUuidFilterEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialDiscoveryPersistenceUuidFilterEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialDiscoveryPersistenceUuidFilterEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES;
            }

            @Override
            public XrSpatialDiscoveryPersistenceUuidFilterEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialDiscoveryPersistenceUuidFilterEXT ret = new XrSpatialDiscoveryPersistenceUuidFilterEXT(segment.asSlice(0, XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES));
                segment = segment.asSlice(XrSpatialDiscoveryPersistenceUuidFilterEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialDiscoveryPersistenceUuidFilterEXT allocate(Arena arena) {
        XrSpatialDiscoveryPersistenceUuidFilterEXT ret = new XrSpatialDiscoveryPersistenceUuidFilterEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT);
        return ret;
    }

    public static XrSpatialDiscoveryPersistenceUuidFilterEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialDiscoveryPersistenceUuidFilterEXT.Ptr ret = new XrSpatialDiscoveryPersistenceUuidFilterEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT);
        }
        return ret;
    }

    public static XrSpatialDiscoveryPersistenceUuidFilterEXT clone(Arena arena, XrSpatialDiscoveryPersistenceUuidFilterEXT src) {
        XrSpatialDiscoveryPersistenceUuidFilterEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_DISCOVERY_PERSISTENCE_UUID_FILTER_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialDiscoveryPersistenceUuidFilterEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialDiscoveryPersistenceUuidFilterEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialDiscoveryPersistenceUuidFilterEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int persistedUuidCount() {
        return segment.get(LAYOUT$persistedUuidCount, OFFSET$persistedUuidCount);
    }

    public XrSpatialDiscoveryPersistenceUuidFilterEXT persistedUuidCount(@Unsigned int value) {
        segment.set(LAYOUT$persistedUuidCount, OFFSET$persistedUuidCount, value);
        return this;
    }

    public XrSpatialDiscoveryPersistenceUuidFilterEXT persistedUuids(@Nullable IXrUuid value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        persistedUuidsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrUuid.Ptr persistedUuids(int assumedCount) {
        MemorySegment s = persistedUuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrUuid.BYTES);
        return new XrUuid.Ptr(s);
    }

    public @Nullable XrUuid persistedUuids() {
        MemorySegment s = persistedUuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrUuid(s);
    }

    public @Pointer(target=XrUuid.class) @NotNull MemorySegment persistedUuidsRaw() {
        return segment.get(LAYOUT$persistedUuids, OFFSET$persistedUuids);
    }

    public void persistedUuidsRaw(@Pointer(target=XrUuid.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$persistedUuids, OFFSET$persistedUuids, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("persistedUuidCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrUuid.LAYOUT).withName("persistedUuids")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$persistedUuidCount = PathElement.groupElement("persistedUuidCount");
    public static final PathElement PATH$persistedUuids = PathElement.groupElement("persistedUuids");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$persistedUuidCount = (OfInt) LAYOUT.select(PATH$persistedUuidCount);
    public static final AddressLayout LAYOUT$persistedUuids = (AddressLayout) LAYOUT.select(PATH$persistedUuids);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$persistedUuidCount = LAYOUT$persistedUuidCount.byteSize();
    public static final long SIZE$persistedUuids = LAYOUT$persistedUuids.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$persistedUuidCount = LAYOUT.byteOffset(PATH$persistedUuidCount);
    public static final long OFFSET$persistedUuids = LAYOUT.byteOffset(PATH$persistedUuids);
}
