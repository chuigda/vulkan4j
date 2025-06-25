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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockStateML.html"><code>XrWorldMeshBlockStateML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshBlockStateML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrUuidEXT uuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuid" target="#uuid"
///     XrPosef meshBoundingBoxCenter; // @link substring="XrPosef" target="XrPosef" @link substring="meshBoundingBoxCenter" target="#meshBoundingBoxCenter"
///     XrExtent3DfEXT meshBoundingBoxExtents; // @link substring="XrExtent3DfEXT" target="XrExtent3DfEXT" @link substring="meshBoundingBoxExtents" target="#meshBoundingBoxExtents"
///     XrTime lastUpdateTime; // @link substring="lastUpdateTime" target="#lastUpdateTime"
///     XrWorldMeshBlockStatusML status; // @link substring="XrWorldMeshBlockStatusML" target="XrWorldMeshBlockStatusML" @link substring="status" target="#status"
/// } XrWorldMeshBlockStateML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_BLOCK_STATE_ML`
///
/// The {@code allocate} ({@link XrWorldMeshBlockStateML#allocate(Arena)}, {@link XrWorldMeshBlockStateML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshBlockStateML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockStateML.html"><code>XrWorldMeshBlockStateML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshBlockStateML(@NotNull MemorySegment segment) implements IXrWorldMeshBlockStateML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockStateML.html"><code>XrWorldMeshBlockStateML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshBlockStateML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshBlockStateML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshBlockStateML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshBlockStateML, Iterable<XrWorldMeshBlockStateML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshBlockStateML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshBlockStateML at(long index) {
            return new XrWorldMeshBlockStateML(segment.asSlice(index * XrWorldMeshBlockStateML.BYTES, XrWorldMeshBlockStateML.BYTES));
        }

        public void write(long index, @NotNull XrWorldMeshBlockStateML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshBlockStateML.BYTES, XrWorldMeshBlockStateML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshBlockStateML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshBlockStateML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshBlockStateML.BYTES,
                (end - start) * XrWorldMeshBlockStateML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshBlockStateML.BYTES));
        }

        public XrWorldMeshBlockStateML[] toArray() {
            XrWorldMeshBlockStateML[] ret = new XrWorldMeshBlockStateML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshBlockStateML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshBlockStateML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshBlockStateML.BYTES;
            }

            @Override
            public XrWorldMeshBlockStateML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshBlockStateML ret = new XrWorldMeshBlockStateML(segment.asSlice(0, XrWorldMeshBlockStateML.BYTES));
                segment = segment.asSlice(XrWorldMeshBlockStateML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshBlockStateML allocate(Arena arena) {
        XrWorldMeshBlockStateML ret = new XrWorldMeshBlockStateML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.WORLD_MESH_BLOCK_STATE_ML);
        return ret;
    }

    public static XrWorldMeshBlockStateML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshBlockStateML.Ptr ret = new XrWorldMeshBlockStateML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.WORLD_MESH_BLOCK_STATE_ML);
        }
        return ret;
    }

    public static XrWorldMeshBlockStateML clone(Arena arena, XrWorldMeshBlockStateML src) {
        XrWorldMeshBlockStateML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.WORLD_MESH_BLOCK_STATE_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshBlockStateML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshBlockStateML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshBlockStateML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrUuidEXT uuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$uuid, LAYOUT$uuid));
    }

    public XrWorldMeshBlockStateML uuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, SIZE$uuid);
        return this;
    }

    public XrWorldMeshBlockStateML uuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(uuid());
        return this;
    }

    public @NotNull XrPosef meshBoundingBoxCenter() {
        return new XrPosef(segment.asSlice(OFFSET$meshBoundingBoxCenter, LAYOUT$meshBoundingBoxCenter));
    }

    public XrWorldMeshBlockStateML meshBoundingBoxCenter(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$meshBoundingBoxCenter, SIZE$meshBoundingBoxCenter);
        return this;
    }

    public XrWorldMeshBlockStateML meshBoundingBoxCenter(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(meshBoundingBoxCenter());
        return this;
    }

    public @NotNull XrExtent3DfEXT meshBoundingBoxExtents() {
        return new XrExtent3DfEXT(segment.asSlice(OFFSET$meshBoundingBoxExtents, LAYOUT$meshBoundingBoxExtents));
    }

    public XrWorldMeshBlockStateML meshBoundingBoxExtents(@NotNull XrExtent3DfEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$meshBoundingBoxExtents, SIZE$meshBoundingBoxExtents);
        return this;
    }

    public XrWorldMeshBlockStateML meshBoundingBoxExtents(Consumer<@NotNull XrExtent3DfEXT> consumer) {
        consumer.accept(meshBoundingBoxExtents());
        return this;
    }

    public @NativeType("XrTime") long lastUpdateTime() {
        return segment.get(LAYOUT$lastUpdateTime, OFFSET$lastUpdateTime);
    }

    public XrWorldMeshBlockStateML lastUpdateTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$lastUpdateTime, OFFSET$lastUpdateTime, value);
        return this;
    }

    public @EnumType(XrWorldMeshBlockStatusML.class) int status() {
        return segment.get(LAYOUT$status, OFFSET$status);
    }

    public XrWorldMeshBlockStateML status(@EnumType(XrWorldMeshBlockStatusML.class) int value) {
        segment.set(LAYOUT$status, OFFSET$status, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrUuidEXT.LAYOUT.withName("uuid"),
        XrPosef.LAYOUT.withName("meshBoundingBoxCenter"),
        XrExtent3DfEXT.LAYOUT.withName("meshBoundingBoxExtents"),
        ValueLayout.JAVA_LONG.withName("lastUpdateTime"),
        ValueLayout.JAVA_INT.withName("status")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");
    public static final PathElement PATH$meshBoundingBoxCenter = PathElement.groupElement("meshBoundingBoxCenter");
    public static final PathElement PATH$meshBoundingBoxExtents = PathElement.groupElement("meshBoundingBoxExtents");
    public static final PathElement PATH$lastUpdateTime = PathElement.groupElement("lastUpdateTime");
    public static final PathElement PATH$status = PathElement.groupElement("status");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$uuid = (StructLayout) LAYOUT.select(PATH$uuid);
    public static final StructLayout LAYOUT$meshBoundingBoxCenter = (StructLayout) LAYOUT.select(PATH$meshBoundingBoxCenter);
    public static final StructLayout LAYOUT$meshBoundingBoxExtents = (StructLayout) LAYOUT.select(PATH$meshBoundingBoxExtents);
    public static final OfLong LAYOUT$lastUpdateTime = (OfLong) LAYOUT.select(PATH$lastUpdateTime);
    public static final OfInt LAYOUT$status = (OfInt) LAYOUT.select(PATH$status);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();
    public static final long SIZE$meshBoundingBoxCenter = LAYOUT$meshBoundingBoxCenter.byteSize();
    public static final long SIZE$meshBoundingBoxExtents = LAYOUT$meshBoundingBoxExtents.byteSize();
    public static final long SIZE$lastUpdateTime = LAYOUT$lastUpdateTime.byteSize();
    public static final long SIZE$status = LAYOUT$status.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
    public static final long OFFSET$meshBoundingBoxCenter = LAYOUT.byteOffset(PATH$meshBoundingBoxCenter);
    public static final long OFFSET$meshBoundingBoxExtents = LAYOUT.byteOffset(PATH$meshBoundingBoxExtents);
    public static final long OFFSET$lastUpdateTime = LAYOUT.byteOffset(PATH$lastUpdateTime);
    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
}
