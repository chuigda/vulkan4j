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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorPolygonBufferEXT.html"><code>XrPlaneDetectorPolygonBufferEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPlaneDetectorPolygonBufferEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t vertexCapacityInput; // optional // @link substring="vertexCapacityInput" target="#vertexCapacityInput"
///     uint32_t vertexCountOutput; // optional // @link substring="vertexCountOutput" target="#vertexCountOutput"
///     XrVector2f* vertices; // optional // @link substring="XrVector2f" target="XrVector2f" @link substring="vertices" target="#vertices"
/// } XrPlaneDetectorPolygonBufferEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PLANE_DETECTOR_POLYGON_BUFFER_EXT`
///
/// The {@code allocate} ({@link XrPlaneDetectorPolygonBufferEXT#allocate(Arena)}, {@link XrPlaneDetectorPolygonBufferEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPlaneDetectorPolygonBufferEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorPolygonBufferEXT.html"><code>XrPlaneDetectorPolygonBufferEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPlaneDetectorPolygonBufferEXT(@NotNull MemorySegment segment) implements IXrPlaneDetectorPolygonBufferEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorPolygonBufferEXT.html"><code>XrPlaneDetectorPolygonBufferEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPlaneDetectorPolygonBufferEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPlaneDetectorPolygonBufferEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPlaneDetectorPolygonBufferEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPlaneDetectorPolygonBufferEXT, Iterable<XrPlaneDetectorPolygonBufferEXT> {
        public long size() {
            return segment.byteSize() / XrPlaneDetectorPolygonBufferEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPlaneDetectorPolygonBufferEXT at(long index) {
            return new XrPlaneDetectorPolygonBufferEXT(segment.asSlice(index * XrPlaneDetectorPolygonBufferEXT.BYTES, XrPlaneDetectorPolygonBufferEXT.BYTES));
        }

        public XrPlaneDetectorPolygonBufferEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrPlaneDetectorPolygonBufferEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrPlaneDetectorPolygonBufferEXT value) {
            MemorySegment s = segment.asSlice(index * XrPlaneDetectorPolygonBufferEXT.BYTES, XrPlaneDetectorPolygonBufferEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPlaneDetectorPolygonBufferEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPlaneDetectorPolygonBufferEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPlaneDetectorPolygonBufferEXT.BYTES,
                (end - start) * XrPlaneDetectorPolygonBufferEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPlaneDetectorPolygonBufferEXT.BYTES));
        }

        public XrPlaneDetectorPolygonBufferEXT[] toArray() {
            XrPlaneDetectorPolygonBufferEXT[] ret = new XrPlaneDetectorPolygonBufferEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPlaneDetectorPolygonBufferEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPlaneDetectorPolygonBufferEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPlaneDetectorPolygonBufferEXT.BYTES;
            }

            @Override
            public XrPlaneDetectorPolygonBufferEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPlaneDetectorPolygonBufferEXT ret = new XrPlaneDetectorPolygonBufferEXT(segment.asSlice(0, XrPlaneDetectorPolygonBufferEXT.BYTES));
                segment = segment.asSlice(XrPlaneDetectorPolygonBufferEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPlaneDetectorPolygonBufferEXT allocate(Arena arena) {
        XrPlaneDetectorPolygonBufferEXT ret = new XrPlaneDetectorPolygonBufferEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.PLANE_DETECTOR_POLYGON_BUFFER_EXT);
        return ret;
    }

    public static XrPlaneDetectorPolygonBufferEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPlaneDetectorPolygonBufferEXT.Ptr ret = new XrPlaneDetectorPolygonBufferEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.PLANE_DETECTOR_POLYGON_BUFFER_EXT);
        }
        return ret;
    }

    public static XrPlaneDetectorPolygonBufferEXT clone(Arena arena, XrPlaneDetectorPolygonBufferEXT src) {
        XrPlaneDetectorPolygonBufferEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.PLANE_DETECTOR_POLYGON_BUFFER_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPlaneDetectorPolygonBufferEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPlaneDetectorPolygonBufferEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPlaneDetectorPolygonBufferEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int vertexCapacityInput() {
        return segment.get(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput);
    }

    public XrPlaneDetectorPolygonBufferEXT vertexCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput, value);
        return this;
    }

    public @Unsigned int vertexCountOutput() {
        return segment.get(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput);
    }

    public XrPlaneDetectorPolygonBufferEXT vertexCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput, value);
        return this;
    }

    public XrPlaneDetectorPolygonBufferEXT vertices(@Nullable IXrVector2f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        verticesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector2f.Ptr vertices(int assumedCount) {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector2f.BYTES);
        return new XrVector2f.Ptr(s);
    }

    public @Nullable XrVector2f vertices() {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector2f(s);
    }

    public @Pointer(target=XrVector2f.class) @NotNull MemorySegment verticesRaw() {
        return segment.get(LAYOUT$vertices, OFFSET$vertices);
    }

    public void verticesRaw(@Pointer(target=XrVector2f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertices, OFFSET$vertices, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("vertexCapacityInput"),
        ValueLayout.JAVA_INT.withName("vertexCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector2f.LAYOUT).withName("vertices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$vertexCapacityInput = PathElement.groupElement("vertexCapacityInput");
    public static final PathElement PATH$vertexCountOutput = PathElement.groupElement("vertexCountOutput");
    public static final PathElement PATH$vertices = PathElement.groupElement("vertices");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$vertexCapacityInput = (OfInt) LAYOUT.select(PATH$vertexCapacityInput);
    public static final OfInt LAYOUT$vertexCountOutput = (OfInt) LAYOUT.select(PATH$vertexCountOutput);
    public static final AddressLayout LAYOUT$vertices = (AddressLayout) LAYOUT.select(PATH$vertices);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$vertexCapacityInput = LAYOUT$vertexCapacityInput.byteSize();
    public static final long SIZE$vertexCountOutput = LAYOUT$vertexCountOutput.byteSize();
    public static final long SIZE$vertices = LAYOUT$vertices.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$vertexCapacityInput = LAYOUT.byteOffset(PATH$vertexCapacityInput);
    public static final long OFFSET$vertexCountOutput = LAYOUT.byteOffset(PATH$vertexCountOutput);
    public static final long OFFSET$vertices = LAYOUT.byteOffset(PATH$vertices);
}
