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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughMeshTransformInfoHTC.html"><code>XrPassthroughMeshTransformInfoHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPassthroughMeshTransformInfoHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t vertexCount; // @link substring="vertexCount" target="#vertexCount"
///     XrVector3f const* vertices; // @link substring="XrVector3f" target="XrVector3f" @link substring="vertices" target="#vertices"
///     uint32_t indexCount; // @link substring="indexCount" target="#indexCount"
///     uint32_t const* indices; // @link substring="indices" target="#indices"
///     XrSpace baseSpace; // @link substring="XrSpace" target="XrSpace" @link substring="baseSpace" target="#baseSpace"
///     XrTime time; // @link substring="time" target="#time"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     XrVector3f scale; // @link substring="XrVector3f" target="XrVector3f" @link substring="scale" target="#scale"
/// } XrPassthroughMeshTransformInfoHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC`
///
/// The {@code allocate} ({@link XrPassthroughMeshTransformInfoHTC#allocate(Arena)}, {@link XrPassthroughMeshTransformInfoHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPassthroughMeshTransformInfoHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughMeshTransformInfoHTC.html"><code>XrPassthroughMeshTransformInfoHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPassthroughMeshTransformInfoHTC(@NotNull MemorySegment segment) implements IXrPassthroughMeshTransformInfoHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughMeshTransformInfoHTC.html"><code>XrPassthroughMeshTransformInfoHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPassthroughMeshTransformInfoHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPassthroughMeshTransformInfoHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPassthroughMeshTransformInfoHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPassthroughMeshTransformInfoHTC, Iterable<XrPassthroughMeshTransformInfoHTC> {
        public long size() {
            return segment.byteSize() / XrPassthroughMeshTransformInfoHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPassthroughMeshTransformInfoHTC at(long index) {
            return new XrPassthroughMeshTransformInfoHTC(segment.asSlice(index * XrPassthroughMeshTransformInfoHTC.BYTES, XrPassthroughMeshTransformInfoHTC.BYTES));
        }

        public void write(long index, @NotNull XrPassthroughMeshTransformInfoHTC value) {
            MemorySegment s = segment.asSlice(index * XrPassthroughMeshTransformInfoHTC.BYTES, XrPassthroughMeshTransformInfoHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPassthroughMeshTransformInfoHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPassthroughMeshTransformInfoHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPassthroughMeshTransformInfoHTC.BYTES,
                (end - start) * XrPassthroughMeshTransformInfoHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPassthroughMeshTransformInfoHTC.BYTES));
        }

        public XrPassthroughMeshTransformInfoHTC[] toArray() {
            XrPassthroughMeshTransformInfoHTC[] ret = new XrPassthroughMeshTransformInfoHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPassthroughMeshTransformInfoHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPassthroughMeshTransformInfoHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPassthroughMeshTransformInfoHTC.BYTES;
            }

            @Override
            public XrPassthroughMeshTransformInfoHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPassthroughMeshTransformInfoHTC ret = new XrPassthroughMeshTransformInfoHTC(segment.asSlice(0, XrPassthroughMeshTransformInfoHTC.BYTES));
                segment = segment.asSlice(XrPassthroughMeshTransformInfoHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPassthroughMeshTransformInfoHTC allocate(Arena arena) {
        XrPassthroughMeshTransformInfoHTC ret = new XrPassthroughMeshTransformInfoHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC);
        return ret;
    }

    public static XrPassthroughMeshTransformInfoHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPassthroughMeshTransformInfoHTC.Ptr ret = new XrPassthroughMeshTransformInfoHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC);
        }
        return ret;
    }

    public static XrPassthroughMeshTransformInfoHTC clone(Arena arena, XrPassthroughMeshTransformInfoHTC src) {
        XrPassthroughMeshTransformInfoHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_PASSTHROUGH_MESH_TRANSFORM_INFO_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPassthroughMeshTransformInfoHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPassthroughMeshTransformInfoHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPassthroughMeshTransformInfoHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public XrPassthroughMeshTransformInfoHTC vertexCount(@Unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
        return this;
    }

    public XrPassthroughMeshTransformInfoHTC vertices(@Nullable IXrVector3f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        verticesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector3f.Ptr vertices(int assumedCount) {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector3f.BYTES);
        return new XrVector3f.Ptr(s);
    }

    public @Nullable XrVector3f vertices() {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector3f(s);
    }

    public @Pointer(target=XrVector3f.class) @NotNull MemorySegment verticesRaw() {
        return segment.get(LAYOUT$vertices, OFFSET$vertices);
    }

    public void verticesRaw(@Pointer(target=XrVector3f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertices, OFFSET$vertices, value);
    }

    public @Unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public XrPassthroughMeshTransformInfoHTC indexCount(@Unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr indices() {
        MemorySegment s = indicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrPassthroughMeshTransformInfoHTC indices(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        indicesRaw(s);
        return this;
    }

    public @Pointer(comment="uint32_t*") @NotNull MemorySegment indicesRaw() {
        return segment.get(LAYOUT$indices, OFFSET$indices);
    }

    public void indicesRaw(@Pointer(comment="uint32_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$indices, OFFSET$indices, value);
    }

    public @Nullable XrSpace baseSpace() {
        MemorySegment s = segment.asSlice(OFFSET$baseSpace, SIZE$baseSpace);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrPassthroughMeshTransformInfoHTC baseSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$baseSpace, OFFSET$baseSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrPassthroughMeshTransformInfoHTC time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrPassthroughMeshTransformInfoHTC pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrPassthroughMeshTransformInfoHTC pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public @NotNull XrVector3f scale() {
        return new XrVector3f(segment.asSlice(OFFSET$scale, LAYOUT$scale));
    }

    public XrPassthroughMeshTransformInfoHTC scale(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scale, SIZE$scale);
        return this;
    }

    public XrPassthroughMeshTransformInfoHTC scale(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(scale());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("vertices"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("indices"),
        ValueLayout.ADDRESS.withName("baseSpace"),
        ValueLayout.JAVA_LONG.withName("time"),
        XrPosef.LAYOUT.withName("pose"),
        XrVector3f.LAYOUT.withName("scale")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$vertices = PathElement.groupElement("vertices");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$indices = PathElement.groupElement("indices");
    public static final PathElement PATH$baseSpace = PathElement.groupElement("baseSpace");
    public static final PathElement PATH$time = PathElement.groupElement("time");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$scale = PathElement.groupElement("scale");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final AddressLayout LAYOUT$vertices = (AddressLayout) LAYOUT.select(PATH$vertices);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final AddressLayout LAYOUT$indices = (AddressLayout) LAYOUT.select(PATH$indices);
    public static final AddressLayout LAYOUT$baseSpace = (AddressLayout) LAYOUT.select(PATH$baseSpace);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final StructLayout LAYOUT$scale = (StructLayout) LAYOUT.select(PATH$scale);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();
    public static final long SIZE$vertices = LAYOUT$vertices.byteSize();
    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$indices = LAYOUT$indices.byteSize();
    public static final long SIZE$baseSpace = LAYOUT$baseSpace.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$scale = LAYOUT$scale.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$vertices = LAYOUT.byteOffset(PATH$vertices);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$indices = LAYOUT.byteOffset(PATH$indices);
    public static final long OFFSET$baseSpace = LAYOUT.byteOffset(PATH$baseSpace);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$scale = LAYOUT.byteOffset(PATH$scale);
}
