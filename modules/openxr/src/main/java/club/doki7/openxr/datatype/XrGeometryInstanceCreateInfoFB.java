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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGeometryInstanceCreateInfoFB.html"><code>XrGeometryInstanceCreateInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrGeometryInstanceCreateInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPassthroughLayerFB layer; // @link substring="XrPassthroughLayerFB" target="XrPassthroughLayerFB" @link substring="layer" target="#layer"
///     XrTriangleMeshFB mesh; // @link substring="XrTriangleMeshFB" target="XrTriangleMeshFB" @link substring="mesh" target="#mesh"
///     XrSpace baseSpace; // @link substring="XrSpace" target="XrSpace" @link substring="baseSpace" target="#baseSpace"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     XrVector3f scale; // @link substring="XrVector3f" target="XrVector3f" @link substring="scale" target="#scale"
/// } XrGeometryInstanceCreateInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB`
///
/// The {@code allocate} ({@link XrGeometryInstanceCreateInfoFB#allocate(Arena)}, {@link XrGeometryInstanceCreateInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrGeometryInstanceCreateInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGeometryInstanceCreateInfoFB.html"><code>XrGeometryInstanceCreateInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrGeometryInstanceCreateInfoFB(@NotNull MemorySegment segment) implements IXrGeometryInstanceCreateInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGeometryInstanceCreateInfoFB.html"><code>XrGeometryInstanceCreateInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrGeometryInstanceCreateInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrGeometryInstanceCreateInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrGeometryInstanceCreateInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrGeometryInstanceCreateInfoFB, Iterable<XrGeometryInstanceCreateInfoFB> {
        public long size() {
            return segment.byteSize() / XrGeometryInstanceCreateInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrGeometryInstanceCreateInfoFB at(long index) {
            return new XrGeometryInstanceCreateInfoFB(segment.asSlice(index * XrGeometryInstanceCreateInfoFB.BYTES, XrGeometryInstanceCreateInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrGeometryInstanceCreateInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrGeometryInstanceCreateInfoFB.BYTES, XrGeometryInstanceCreateInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrGeometryInstanceCreateInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrGeometryInstanceCreateInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrGeometryInstanceCreateInfoFB.BYTES,
                (end - start) * XrGeometryInstanceCreateInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrGeometryInstanceCreateInfoFB.BYTES));
        }

        public XrGeometryInstanceCreateInfoFB[] toArray() {
            XrGeometryInstanceCreateInfoFB[] ret = new XrGeometryInstanceCreateInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrGeometryInstanceCreateInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrGeometryInstanceCreateInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrGeometryInstanceCreateInfoFB.BYTES;
            }

            @Override
            public XrGeometryInstanceCreateInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrGeometryInstanceCreateInfoFB ret = new XrGeometryInstanceCreateInfoFB(segment.asSlice(0, XrGeometryInstanceCreateInfoFB.BYTES));
                segment = segment.asSlice(XrGeometryInstanceCreateInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrGeometryInstanceCreateInfoFB allocate(Arena arena) {
        XrGeometryInstanceCreateInfoFB ret = new XrGeometryInstanceCreateInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB);
        return ret;
    }

    public static XrGeometryInstanceCreateInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrGeometryInstanceCreateInfoFB.Ptr ret = new XrGeometryInstanceCreateInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB);
        }
        return ret;
    }

    public static XrGeometryInstanceCreateInfoFB clone(Arena arena, XrGeometryInstanceCreateInfoFB src) {
        XrGeometryInstanceCreateInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_GEOMETRY_INSTANCE_CREATE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrGeometryInstanceCreateInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrGeometryInstanceCreateInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrGeometryInstanceCreateInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrPassthroughLayerFB layer() {
        MemorySegment s = segment.asSlice(OFFSET$layer, SIZE$layer);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrPassthroughLayerFB(s);
    }

    public XrGeometryInstanceCreateInfoFB layer(@Nullable XrPassthroughLayerFB value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrTriangleMeshFB mesh() {
        MemorySegment s = segment.asSlice(OFFSET$mesh, SIZE$mesh);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrTriangleMeshFB(s);
    }

    public XrGeometryInstanceCreateInfoFB mesh(@Nullable XrTriangleMeshFB value) {
        segment.set(LAYOUT$mesh, OFFSET$mesh, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSpace baseSpace() {
        MemorySegment s = segment.asSlice(OFFSET$baseSpace, SIZE$baseSpace);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrGeometryInstanceCreateInfoFB baseSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$baseSpace, OFFSET$baseSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrGeometryInstanceCreateInfoFB pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrGeometryInstanceCreateInfoFB pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public @NotNull XrVector3f scale() {
        return new XrVector3f(segment.asSlice(OFFSET$scale, LAYOUT$scale));
    }

    public XrGeometryInstanceCreateInfoFB scale(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$scale, SIZE$scale);
        return this;
    }

    public XrGeometryInstanceCreateInfoFB scale(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(scale());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("layer"),
        ValueLayout.ADDRESS.withName("mesh"),
        ValueLayout.ADDRESS.withName("baseSpace"),
        XrPosef.LAYOUT.withName("pose"),
        XrVector3f.LAYOUT.withName("scale")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layer = PathElement.groupElement("layer");
    public static final PathElement PATH$mesh = PathElement.groupElement("mesh");
    public static final PathElement PATH$baseSpace = PathElement.groupElement("baseSpace");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$scale = PathElement.groupElement("scale");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$layer = (AddressLayout) LAYOUT.select(PATH$layer);
    public static final AddressLayout LAYOUT$mesh = (AddressLayout) LAYOUT.select(PATH$mesh);
    public static final AddressLayout LAYOUT$baseSpace = (AddressLayout) LAYOUT.select(PATH$baseSpace);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final StructLayout LAYOUT$scale = (StructLayout) LAYOUT.select(PATH$scale);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layer = LAYOUT$layer.byteSize();
    public static final long SIZE$mesh = LAYOUT$mesh.byteSize();
    public static final long SIZE$baseSpace = LAYOUT$baseSpace.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$scale = LAYOUT$scale.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);
    public static final long OFFSET$mesh = LAYOUT.byteOffset(PATH$mesh);
    public static final long OFFSET$baseSpace = LAYOUT.byteOffset(PATH$baseSpace);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$scale = LAYOUT.byteOffset(PATH$scale);
}
