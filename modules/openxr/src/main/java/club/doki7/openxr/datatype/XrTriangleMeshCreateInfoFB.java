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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTriangleMeshCreateInfoFB.html"><code>XrTriangleMeshCreateInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrTriangleMeshCreateInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrTriangleMeshFlagsFB flags; // optional // @link substring="XrTriangleMeshFlagsFB" target="XrTriangleMeshFlagsFB" @link substring="flags" target="#flags"
///     XrWindingOrderFB windingOrder; // @link substring="XrWindingOrderFB" target="XrWindingOrderFB" @link substring="windingOrder" target="#windingOrder"
///     uint32_t vertexCount; // @link substring="vertexCount" target="#vertexCount"
///     XrVector3f const* vertexBuffer; // optional // @link substring="XrVector3f" target="XrVector3f" @link substring="vertexBuffer" target="#vertexBuffer"
///     uint32_t triangleCount; // @link substring="triangleCount" target="#triangleCount"
///     uint32_t const* indexBuffer; // optional // @link substring="indexBuffer" target="#indexBuffer"
/// } XrTriangleMeshCreateInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB`
///
/// The {@code allocate} ({@link XrTriangleMeshCreateInfoFB#allocate(Arena)}, {@link XrTriangleMeshCreateInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrTriangleMeshCreateInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTriangleMeshCreateInfoFB.html"><code>XrTriangleMeshCreateInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrTriangleMeshCreateInfoFB(@NotNull MemorySegment segment) implements IXrTriangleMeshCreateInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTriangleMeshCreateInfoFB.html"><code>XrTriangleMeshCreateInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrTriangleMeshCreateInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrTriangleMeshCreateInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrTriangleMeshCreateInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrTriangleMeshCreateInfoFB, Iterable<XrTriangleMeshCreateInfoFB> {
        public long size() {
            return segment.byteSize() / XrTriangleMeshCreateInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrTriangleMeshCreateInfoFB at(long index) {
            return new XrTriangleMeshCreateInfoFB(segment.asSlice(index * XrTriangleMeshCreateInfoFB.BYTES, XrTriangleMeshCreateInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrTriangleMeshCreateInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrTriangleMeshCreateInfoFB.BYTES, XrTriangleMeshCreateInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrTriangleMeshCreateInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrTriangleMeshCreateInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrTriangleMeshCreateInfoFB.BYTES,
                (end - start) * XrTriangleMeshCreateInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrTriangleMeshCreateInfoFB.BYTES));
        }

        public XrTriangleMeshCreateInfoFB[] toArray() {
            XrTriangleMeshCreateInfoFB[] ret = new XrTriangleMeshCreateInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrTriangleMeshCreateInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrTriangleMeshCreateInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrTriangleMeshCreateInfoFB.BYTES;
            }

            @Override
            public XrTriangleMeshCreateInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrTriangleMeshCreateInfoFB ret = new XrTriangleMeshCreateInfoFB(segment.asSlice(0, XrTriangleMeshCreateInfoFB.BYTES));
                segment = segment.asSlice(XrTriangleMeshCreateInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrTriangleMeshCreateInfoFB allocate(Arena arena) {
        XrTriangleMeshCreateInfoFB ret = new XrTriangleMeshCreateInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB);
        return ret;
    }

    public static XrTriangleMeshCreateInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrTriangleMeshCreateInfoFB.Ptr ret = new XrTriangleMeshCreateInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB);
        }
        return ret;
    }

    public static XrTriangleMeshCreateInfoFB clone(Arena arena, XrTriangleMeshCreateInfoFB src) {
        XrTriangleMeshCreateInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_TRIANGLE_MESH_CREATE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrTriangleMeshCreateInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrTriangleMeshCreateInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrTriangleMeshCreateInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrTriangleMeshFlagsFB.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrTriangleMeshCreateInfoFB flags(@Bitmask(XrTriangleMeshFlagsFB.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @EnumType(XrWindingOrderFB.class) int windingOrder() {
        return segment.get(LAYOUT$windingOrder, OFFSET$windingOrder);
    }

    public XrTriangleMeshCreateInfoFB windingOrder(@EnumType(XrWindingOrderFB.class) int value) {
        segment.set(LAYOUT$windingOrder, OFFSET$windingOrder, value);
        return this;
    }

    public @Unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public XrTriangleMeshCreateInfoFB vertexCount(@Unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
        return this;
    }

    public XrTriangleMeshCreateInfoFB vertexBuffer(@Nullable IXrVector3f value) {
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

    public @Unsigned int triangleCount() {
        return segment.get(LAYOUT$triangleCount, OFFSET$triangleCount);
    }

    public XrTriangleMeshCreateInfoFB triangleCount(@Unsigned int value) {
        segment.set(LAYOUT$triangleCount, OFFSET$triangleCount, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr indexBuffer() {
        MemorySegment s = indexBufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrTriangleMeshCreateInfoFB indexBuffer(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        indexBufferRaw(s);
        return this;
    }

    public @Pointer(comment="uint32_t*") @NotNull MemorySegment indexBufferRaw() {
        return segment.get(LAYOUT$indexBuffer, OFFSET$indexBuffer);
    }

    public void indexBufferRaw(@Pointer(comment="uint32_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$indexBuffer, OFFSET$indexBuffer, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("windingOrder"),
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("vertexBuffer"),
        ValueLayout.JAVA_INT.withName("triangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("indexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$windingOrder = PathElement.groupElement("windingOrder");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("vertexBuffer");
    public static final PathElement PATH$triangleCount = PathElement.groupElement("triangleCount");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("indexBuffer");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$windingOrder = (OfInt) LAYOUT.select(PATH$windingOrder);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final AddressLayout LAYOUT$vertexBuffer = (AddressLayout) LAYOUT.select(PATH$vertexBuffer);
    public static final OfInt LAYOUT$triangleCount = (OfInt) LAYOUT.select(PATH$triangleCount);
    public static final AddressLayout LAYOUT$indexBuffer = (AddressLayout) LAYOUT.select(PATH$indexBuffer);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$windingOrder = LAYOUT$windingOrder.byteSize();
    public static final long SIZE$vertexCount = LAYOUT$vertexCount.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();
    public static final long SIZE$triangleCount = LAYOUT$triangleCount.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$windingOrder = LAYOUT.byteOffset(PATH$windingOrder);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
    public static final long OFFSET$triangleCount = LAYOUT.byteOffset(PATH$triangleCount);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
}
