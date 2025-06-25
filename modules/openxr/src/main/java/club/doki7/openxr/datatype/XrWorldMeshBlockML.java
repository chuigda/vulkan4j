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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockML.html"><code>XrWorldMeshBlockML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshBlockML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrUuidEXT uuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuid" target="#uuid"
///     XrWorldMeshBlockResultML blockResult; // @link substring="XrWorldMeshBlockResultML" target="XrWorldMeshBlockResultML" @link substring="blockResult" target="#blockResult"
///     XrWorldMeshDetectorLodML lod; // @link substring="XrWorldMeshDetectorLodML" target="XrWorldMeshDetectorLodML" @link substring="lod" target="#lod"
///     XrWorldMeshDetectorFlagsML flags; // @link substring="XrWorldMeshDetectorFlagsML" target="XrWorldMeshDetectorFlagsML" @link substring="flags" target="#flags"
///     uint32_t indexCount; // @link substring="indexCount" target="#indexCount"
///     uint16_t* indexBuffer; // @link substring="indexBuffer" target="#indexBuffer"
///     uint32_t vertexCount; // @link substring="vertexCount" target="#vertexCount"
///     XrVector3f* vertexBuffer; // @link substring="XrVector3f" target="XrVector3f" @link substring="vertexBuffer" target="#vertexBuffer"
///     uint32_t normalCount; // @link substring="normalCount" target="#normalCount"
///     XrVector3f* normalBuffer; // @link substring="XrVector3f" target="XrVector3f" @link substring="normalBuffer" target="#normalBuffer"
///     uint32_t confidenceCount; // @link substring="confidenceCount" target="#confidenceCount"
///     float* confidenceBuffer; // @link substring="confidenceBuffer" target="#confidenceBuffer"
/// } XrWorldMeshBlockML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_BLOCK_ML`
///
/// The {@code allocate} ({@link XrWorldMeshBlockML#allocate(Arena)}, {@link XrWorldMeshBlockML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshBlockML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockML.html"><code>XrWorldMeshBlockML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshBlockML(@NotNull MemorySegment segment) implements IXrWorldMeshBlockML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshBlockML.html"><code>XrWorldMeshBlockML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshBlockML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshBlockML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshBlockML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshBlockML, Iterable<XrWorldMeshBlockML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshBlockML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshBlockML at(long index) {
            return new XrWorldMeshBlockML(segment.asSlice(index * XrWorldMeshBlockML.BYTES, XrWorldMeshBlockML.BYTES));
        }

        public void write(long index, @NotNull XrWorldMeshBlockML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshBlockML.BYTES, XrWorldMeshBlockML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshBlockML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshBlockML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshBlockML.BYTES,
                (end - start) * XrWorldMeshBlockML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshBlockML.BYTES));
        }

        public XrWorldMeshBlockML[] toArray() {
            XrWorldMeshBlockML[] ret = new XrWorldMeshBlockML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshBlockML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshBlockML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshBlockML.BYTES;
            }

            @Override
            public XrWorldMeshBlockML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshBlockML ret = new XrWorldMeshBlockML(segment.asSlice(0, XrWorldMeshBlockML.BYTES));
                segment = segment.asSlice(XrWorldMeshBlockML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshBlockML allocate(Arena arena) {
        XrWorldMeshBlockML ret = new XrWorldMeshBlockML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_WORLD_MESH_BLOCK_ML);
        return ret;
    }

    public static XrWorldMeshBlockML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshBlockML.Ptr ret = new XrWorldMeshBlockML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_WORLD_MESH_BLOCK_ML);
        }
        return ret;
    }

    public static XrWorldMeshBlockML clone(Arena arena, XrWorldMeshBlockML src) {
        XrWorldMeshBlockML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_WORLD_MESH_BLOCK_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshBlockML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshBlockML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshBlockML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrUuidEXT uuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$uuid, LAYOUT$uuid));
    }

    public XrWorldMeshBlockML uuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, SIZE$uuid);
        return this;
    }

    public XrWorldMeshBlockML uuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(uuid());
        return this;
    }

    public @EnumType(XrWorldMeshBlockResultML.class) int blockResult() {
        return segment.get(LAYOUT$blockResult, OFFSET$blockResult);
    }

    public XrWorldMeshBlockML blockResult(@EnumType(XrWorldMeshBlockResultML.class) int value) {
        segment.set(LAYOUT$blockResult, OFFSET$blockResult, value);
        return this;
    }

    public @EnumType(XrWorldMeshDetectorLodML.class) int lod() {
        return segment.get(LAYOUT$lod, OFFSET$lod);
    }

    public XrWorldMeshBlockML lod(@EnumType(XrWorldMeshDetectorLodML.class) int value) {
        segment.set(LAYOUT$lod, OFFSET$lod, value);
        return this;
    }

    public @Bitmask(XrWorldMeshDetectorFlagsML.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrWorldMeshBlockML flags(@Bitmask(XrWorldMeshDetectorFlagsML.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public XrWorldMeshBlockML indexCount(@Unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
        return this;
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned ShortPtr indexBuffer() {
        MemorySegment s = indexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public XrWorldMeshBlockML indexBuffer(@Nullable @Unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        indexBufferRaw(s);
        return this;
    }

    public @Pointer(comment="uint16_t*") @NotNull MemorySegment indexBufferRaw() {
        return segment.get(LAYOUT$indexBuffer, OFFSET$indexBuffer);
    }

    public void indexBufferRaw(@Pointer(comment="uint16_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$indexBuffer, OFFSET$indexBuffer, value);
    }

    public @Unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public XrWorldMeshBlockML vertexCount(@Unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
        return this;
    }

    public XrWorldMeshBlockML vertexBuffer(@Nullable IXrVector3f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexBufferRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector3f.Ptr vertexBuffer(int assumedCount) {
        MemorySegment s = vertexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector3f.BYTES);
        return new XrVector3f.Ptr(s);
    }

    public @Nullable XrVector3f vertexBuffer() {
        MemorySegment s = vertexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector3f(s);
    }

    public @Pointer(target=XrVector3f.class) @NotNull MemorySegment vertexBufferRaw() {
        return segment.get(LAYOUT$vertexBuffer, OFFSET$vertexBuffer);
    }

    public void vertexBufferRaw(@Pointer(target=XrVector3f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexBuffer, OFFSET$vertexBuffer, value);
    }

    public @Unsigned int normalCount() {
        return segment.get(LAYOUT$normalCount, OFFSET$normalCount);
    }

    public XrWorldMeshBlockML normalCount(@Unsigned int value) {
        segment.set(LAYOUT$normalCount, OFFSET$normalCount, value);
        return this;
    }

    public XrWorldMeshBlockML normalBuffer(@Nullable IXrVector3f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        normalBufferRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector3f.Ptr normalBuffer(int assumedCount) {
        MemorySegment s = normalBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector3f.BYTES);
        return new XrVector3f.Ptr(s);
    }

    public @Nullable XrVector3f normalBuffer() {
        MemorySegment s = normalBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector3f(s);
    }

    public @Pointer(target=XrVector3f.class) @NotNull MemorySegment normalBufferRaw() {
        return segment.get(LAYOUT$normalBuffer, OFFSET$normalBuffer);
    }

    public void normalBufferRaw(@Pointer(target=XrVector3f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$normalBuffer, OFFSET$normalBuffer, value);
    }

    public @Unsigned int confidenceCount() {
        return segment.get(LAYOUT$confidenceCount, OFFSET$confidenceCount);
    }

    public XrWorldMeshBlockML confidenceCount(@Unsigned int value) {
        segment.set(LAYOUT$confidenceCount, OFFSET$confidenceCount, value);
        return this;
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr confidenceBuffer() {
        MemorySegment s = confidenceBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrWorldMeshBlockML confidenceBuffer(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        confidenceBufferRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment confidenceBufferRaw() {
        return segment.get(LAYOUT$confidenceBuffer, OFFSET$confidenceBuffer);
    }

    public void confidenceBufferRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$confidenceBuffer, OFFSET$confidenceBuffer, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrUuidEXT.LAYOUT.withName("uuid"),
        ValueLayout.JAVA_INT.withName("blockResult"),
        ValueLayout.JAVA_INT.withName("lod"),
        ValueLayout.JAVA_LONG.withName("flags"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("indexBuffer"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("vertexBuffer"),
        ValueLayout.JAVA_INT.withName("normalCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("normalBuffer"),
        ValueLayout.JAVA_INT.withName("confidenceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("confidenceBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");
    public static final PathElement PATH$blockResult = PathElement.groupElement("blockResult");
    public static final PathElement PATH$lod = PathElement.groupElement("lod");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("indexBuffer");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("vertexBuffer");
    public static final PathElement PATH$normalCount = PathElement.groupElement("normalCount");
    public static final PathElement PATH$normalBuffer = PathElement.groupElement("normalBuffer");
    public static final PathElement PATH$confidenceCount = PathElement.groupElement("confidenceCount");
    public static final PathElement PATH$confidenceBuffer = PathElement.groupElement("confidenceBuffer");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$uuid = (StructLayout) LAYOUT.select(PATH$uuid);
    public static final OfInt LAYOUT$blockResult = (OfInt) LAYOUT.select(PATH$blockResult);
    public static final OfInt LAYOUT$lod = (OfInt) LAYOUT.select(PATH$lod);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final AddressLayout LAYOUT$indexBuffer = (AddressLayout) LAYOUT.select(PATH$indexBuffer);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final AddressLayout LAYOUT$vertexBuffer = (AddressLayout) LAYOUT.select(PATH$vertexBuffer);
    public static final OfInt LAYOUT$normalCount = (OfInt) LAYOUT.select(PATH$normalCount);
    public static final AddressLayout LAYOUT$normalBuffer = (AddressLayout) LAYOUT.select(PATH$normalBuffer);
    public static final OfInt LAYOUT$confidenceCount = (OfInt) LAYOUT.select(PATH$confidenceCount);
    public static final AddressLayout LAYOUT$confidenceBuffer = (AddressLayout) LAYOUT.select(PATH$confidenceBuffer);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();
    public static final long SIZE$blockResult = LAYOUT$blockResult.byteSize();
    public static final long SIZE$lod = LAYOUT$lod.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();
    public static final long SIZE$normalCount = LAYOUT$normalCount.byteSize();
    public static final long SIZE$normalBuffer = LAYOUT$normalBuffer.byteSize();
    public static final long SIZE$confidenceCount = LAYOUT$confidenceCount.byteSize();
    public static final long SIZE$confidenceBuffer = LAYOUT$confidenceBuffer.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
    public static final long OFFSET$blockResult = LAYOUT.byteOffset(PATH$blockResult);
    public static final long OFFSET$lod = LAYOUT.byteOffset(PATH$lod);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
    public static final long OFFSET$normalCount = LAYOUT.byteOffset(PATH$normalCount);
    public static final long OFFSET$normalBuffer = LAYOUT.byteOffset(PATH$normalBuffer);
    public static final long OFFSET$confidenceCount = LAYOUT.byteOffset(PATH$confidenceCount);
    public static final long OFFSET$confidenceBuffer = LAYOUT.byteOffset(PATH$confidenceBuffer);
}
