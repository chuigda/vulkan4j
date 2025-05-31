package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryMotionTrianglesDataNV.html"><code>VkAccelerationStructureGeometryMotionTrianglesDataNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureGeometryMotionTrianglesDataNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDeviceOrHostAddressConstKHR vertexData; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="vertexData" target="#vertexData"
/// } VkAccelerationStructureGeometryMotionTrianglesDataNV;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV`
///
/// The {@code allocate} ({@link VkAccelerationStructureGeometryMotionTrianglesDataNV#allocate(Arena)}, {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAccelerationStructureGeometryMotionTrianglesDataNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryMotionTrianglesDataNV.html"><code>VkAccelerationStructureGeometryMotionTrianglesDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureGeometryMotionTrianglesDataNV(@NotNull MemorySegment segment) implements IVkAccelerationStructureGeometryMotionTrianglesDataNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryMotionTrianglesDataNV.html"><code>VkAccelerationStructureGeometryMotionTrianglesDataNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureGeometryMotionTrianglesDataNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureGeometryMotionTrianglesDataNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureGeometryMotionTrianglesDataNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureGeometryMotionTrianglesDataNV, Iterable<VkAccelerationStructureGeometryMotionTrianglesDataNV> {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureGeometryMotionTrianglesDataNV at(long index) {
            return new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment.asSlice(index * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES, VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES));
        }

        public void write(long index, @NotNull VkAccelerationStructureGeometryMotionTrianglesDataNV value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES, VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES,
                (end - start) * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES));
        }

        public VkAccelerationStructureGeometryMotionTrianglesDataNV[] toArray() {
            VkAccelerationStructureGeometryMotionTrianglesDataNV[] ret = new VkAccelerationStructureGeometryMotionTrianglesDataNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkAccelerationStructureGeometryMotionTrianglesDataNV> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES;
            }

            @Override
            public VkAccelerationStructureGeometryMotionTrianglesDataNV next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkAccelerationStructureGeometryMotionTrianglesDataNV ret = new VkAccelerationStructureGeometryMotionTrianglesDataNV(segment.asSlice(0, VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES));
                segment = segment.asSlice(VkAccelerationStructureGeometryMotionTrianglesDataNV.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV allocate(Arena arena) {
        VkAccelerationStructureGeometryMotionTrianglesDataNV ret = new VkAccelerationStructureGeometryMotionTrianglesDataNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
        return ret;
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryMotionTrianglesDataNV.Ptr ret = new VkAccelerationStructureGeometryMotionTrianglesDataNV.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryMotionTrianglesDataNV clone(Arena arena, VkAccelerationStructureGeometryMotionTrianglesDataNV src) {
        VkAccelerationStructureGeometryMotionTrianglesDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_MOTION_TRIANGLES_DATA_NV);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, SIZE$vertexData);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexData = PathElement.groupElement("vertexData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$vertexData = (UnionLayout) LAYOUT.select(PATH$vertexData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexData = LAYOUT$vertexData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
}
