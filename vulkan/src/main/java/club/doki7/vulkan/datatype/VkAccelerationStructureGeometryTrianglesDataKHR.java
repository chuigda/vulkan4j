package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryTrianglesDataKHR.html"><code>VkAccelerationStructureGeometryTrianglesDataKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureGeometryTrianglesDataKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFormat vertexFormat; // @link substring="VkFormat" target="VkFormat" @link substring="vertexFormat" target="#vertexFormat"
///     VkDeviceOrHostAddressConstKHR vertexData; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="vertexData" target="#vertexData"
///     VkDeviceSize vertexStride; // @link substring="vertexStride" target="#vertexStride"
///     uint32_t maxVertex; // @link substring="maxVertex" target="#maxVertex"
///     VkIndexType indexType; // @link substring="VkIndexType" target="VkIndexType" @link substring="indexType" target="#indexType"
///     VkDeviceOrHostAddressConstKHR indexData; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="indexData" target="#indexData"
///     VkDeviceOrHostAddressConstKHR transformData; // @link substring="VkDeviceOrHostAddressConstKHR" target="VkDeviceOrHostAddressConstKHR" @link substring="transformData" target="#transformData"
/// } VkAccelerationStructureGeometryTrianglesDataKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR`
///
/// The {@code allocate} ({@link VkAccelerationStructureGeometryTrianglesDataKHR#allocate(Arena)}, {@link VkAccelerationStructureGeometryTrianglesDataKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAccelerationStructureGeometryTrianglesDataKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryTrianglesDataKHR.html"><code>VkAccelerationStructureGeometryTrianglesDataKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureGeometryTrianglesDataKHR(@NotNull MemorySegment segment) implements IVkAccelerationStructureGeometryTrianglesDataKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryTrianglesDataKHR.html"><code>VkAccelerationStructureGeometryTrianglesDataKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkAccelerationStructureGeometryTrianglesDataKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkAccelerationStructureGeometryTrianglesDataKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkAccelerationStructureGeometryTrianglesDataKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkAccelerationStructureGeometryTrianglesDataKHR {
        public long size() {
            return segment.byteSize() / VkAccelerationStructureGeometryTrianglesDataKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkAccelerationStructureGeometryTrianglesDataKHR at(long index) {
            return new VkAccelerationStructureGeometryTrianglesDataKHR(segment.asSlice(index * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES, VkAccelerationStructureGeometryTrianglesDataKHR.BYTES));
        }

        public void write(long index, @NotNull VkAccelerationStructureGeometryTrianglesDataKHR value) {
            MemorySegment s = segment.asSlice(index * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES, VkAccelerationStructureGeometryTrianglesDataKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES, VkAccelerationStructureGeometryTrianglesDataKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES,
                (end - start) * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkAccelerationStructureGeometryTrianglesDataKHR.BYTES));
        }

        public VkAccelerationStructureGeometryTrianglesDataKHR[] toArray() {
            VkAccelerationStructureGeometryTrianglesDataKHR[] ret = new VkAccelerationStructureGeometryTrianglesDataKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR allocate(Arena arena) {
        VkAccelerationStructureGeometryTrianglesDataKHR ret = new VkAccelerationStructureGeometryTrianglesDataKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
        return ret;
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryTrianglesDataKHR.Ptr ret = new VkAccelerationStructureGeometryTrianglesDataKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryTrianglesDataKHR clone(Arena arena, VkAccelerationStructureGeometryTrianglesDataKHR src) {
        VkAccelerationStructureGeometryTrianglesDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_TRIANGLES_DATA_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, SIZE$vertexData);
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @unsigned int maxVertex() {
        return segment.get(LAYOUT$maxVertex, OFFSET$maxVertex);
    }

    public void maxVertex(@unsigned int value) {
        segment.set(LAYOUT$maxVertex, OFFSET$maxVertex, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR indexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexData, LAYOUT$indexData));
    }

    public void indexData(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexData, SIZE$indexData);
    }

    public @NotNull VkDeviceOrHostAddressConstKHR transformData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$transformData, LAYOUT$transformData));
    }

    public void transformData(@NotNull VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transformData, SIZE$transformData);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("maxVertex"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("transformData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("vertexFormat");
    public static final PathElement PATH$vertexData = PathElement.groupElement("vertexData");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("vertexStride");
    public static final PathElement PATH$maxVertex = PathElement.groupElement("maxVertex");
    public static final PathElement PATH$indexType = PathElement.groupElement("indexType");
    public static final PathElement PATH$indexData = PathElement.groupElement("indexData");
    public static final PathElement PATH$transformData = PathElement.groupElement("transformData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final StructLayout LAYOUT$vertexData = (StructLayout) LAYOUT.select(PATH$vertexData);
    public static final OfLong LAYOUT$vertexStride = (OfLong) LAYOUT.select(PATH$vertexStride);
    public static final OfInt LAYOUT$maxVertex = (OfInt) LAYOUT.select(PATH$maxVertex);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final StructLayout LAYOUT$indexData = (StructLayout) LAYOUT.select(PATH$indexData);
    public static final StructLayout LAYOUT$transformData = (StructLayout) LAYOUT.select(PATH$transformData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$vertexData = LAYOUT$vertexData.byteSize();
    public static final long SIZE$vertexStride = LAYOUT$vertexStride.byteSize();
    public static final long SIZE$maxVertex = LAYOUT$maxVertex.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$indexData = LAYOUT$indexData.byteSize();
    public static final long SIZE$transformData = LAYOUT$transformData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$maxVertex = LAYOUT.byteOffset(PATH$maxVertex);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$transformData = LAYOUT.byteOffset(PATH$transformData);
}
