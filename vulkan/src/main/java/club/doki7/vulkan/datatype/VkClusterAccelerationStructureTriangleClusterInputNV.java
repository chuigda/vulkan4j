package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureTriangleClusterInputNV.html"><code>VkClusterAccelerationStructureTriangleClusterInputNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkClusterAccelerationStructureTriangleClusterInputNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFormat vertexFormat; // @link substring="VkFormat" target="VkFormat" @link substring="vertexFormat" target="#vertexFormat"
///     uint32_t maxGeometryIndexValue; // @link substring="maxGeometryIndexValue" target="#maxGeometryIndexValue"
///     uint32_t maxClusterUniqueGeometryCount; // @link substring="maxClusterUniqueGeometryCount" target="#maxClusterUniqueGeometryCount"
///     uint32_t maxClusterTriangleCount; // @link substring="maxClusterTriangleCount" target="#maxClusterTriangleCount"
///     uint32_t maxClusterVertexCount; // @link substring="maxClusterVertexCount" target="#maxClusterVertexCount"
///     uint32_t maxTotalTriangleCount; // @link substring="maxTotalTriangleCount" target="#maxTotalTriangleCount"
///     uint32_t maxTotalVertexCount; // @link substring="maxTotalVertexCount" target="#maxTotalVertexCount"
///     uint32_t minPositionTruncateBitCount; // @link substring="minPositionTruncateBitCount" target="#minPositionTruncateBitCount"
/// } VkClusterAccelerationStructureTriangleClusterInputNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV`
///
/// The {@code allocate} ({@link VkClusterAccelerationStructureTriangleClusterInputNV#allocate(Arena)}, {@link VkClusterAccelerationStructureTriangleClusterInputNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkClusterAccelerationStructureTriangleClusterInputNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureTriangleClusterInputNV.html"><code>VkClusterAccelerationStructureTriangleClusterInputNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkClusterAccelerationStructureTriangleClusterInputNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkClusterAccelerationStructureTriangleClusterInputNV allocate(Arena arena) {
        VkClusterAccelerationStructureTriangleClusterInputNV ret = new VkClusterAccelerationStructureTriangleClusterInputNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
        return ret;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureTriangleClusterInputNV[] ret = new VkClusterAccelerationStructureTriangleClusterInputNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureTriangleClusterInputNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
        }
        return ret;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV clone(Arena arena, VkClusterAccelerationStructureTriangleClusterInputNV src) {
        VkClusterAccelerationStructureTriangleClusterInputNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureTriangleClusterInputNV[] clone(Arena arena, VkClusterAccelerationStructureTriangleClusterInputNV[] src) {
        VkClusterAccelerationStructureTriangleClusterInputNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.CLUSTER_ACCELERATION_STRUCTURE_TRIANGLE_CLUSTER_INPUT_NV);
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

    public @unsigned int maxGeometryIndexValue() {
        return segment.get(LAYOUT$maxGeometryIndexValue, OFFSET$maxGeometryIndexValue);
    }

    public void maxGeometryIndexValue(@unsigned int value) {
        segment.set(LAYOUT$maxGeometryIndexValue, OFFSET$maxGeometryIndexValue, value);
    }

    public @unsigned int maxClusterUniqueGeometryCount() {
        return segment.get(LAYOUT$maxClusterUniqueGeometryCount, OFFSET$maxClusterUniqueGeometryCount);
    }

    public void maxClusterUniqueGeometryCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterUniqueGeometryCount, OFFSET$maxClusterUniqueGeometryCount, value);
    }

    public @unsigned int maxClusterTriangleCount() {
        return segment.get(LAYOUT$maxClusterTriangleCount, OFFSET$maxClusterTriangleCount);
    }

    public void maxClusterTriangleCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterTriangleCount, OFFSET$maxClusterTriangleCount, value);
    }

    public @unsigned int maxClusterVertexCount() {
        return segment.get(LAYOUT$maxClusterVertexCount, OFFSET$maxClusterVertexCount);
    }

    public void maxClusterVertexCount(@unsigned int value) {
        segment.set(LAYOUT$maxClusterVertexCount, OFFSET$maxClusterVertexCount, value);
    }

    public @unsigned int maxTotalTriangleCount() {
        return segment.get(LAYOUT$maxTotalTriangleCount, OFFSET$maxTotalTriangleCount);
    }

    public void maxTotalTriangleCount(@unsigned int value) {
        segment.set(LAYOUT$maxTotalTriangleCount, OFFSET$maxTotalTriangleCount, value);
    }

    public @unsigned int maxTotalVertexCount() {
        return segment.get(LAYOUT$maxTotalVertexCount, OFFSET$maxTotalVertexCount);
    }

    public void maxTotalVertexCount(@unsigned int value) {
        segment.set(LAYOUT$maxTotalVertexCount, OFFSET$maxTotalVertexCount, value);
    }

    public @unsigned int minPositionTruncateBitCount() {
        return segment.get(LAYOUT$minPositionTruncateBitCount, OFFSET$minPositionTruncateBitCount);
    }

    public void minPositionTruncateBitCount(@unsigned int value) {
        segment.set(LAYOUT$minPositionTruncateBitCount, OFFSET$minPositionTruncateBitCount, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        ValueLayout.JAVA_INT.withName("maxGeometryIndexValue"),
        ValueLayout.JAVA_INT.withName("maxClusterUniqueGeometryCount"),
        ValueLayout.JAVA_INT.withName("maxClusterTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxClusterVertexCount"),
        ValueLayout.JAVA_INT.withName("maxTotalTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxTotalVertexCount"),
        ValueLayout.JAVA_INT.withName("minPositionTruncateBitCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("PATH$vertexFormat");
    public static final PathElement PATH$maxGeometryIndexValue = PathElement.groupElement("PATH$maxGeometryIndexValue");
    public static final PathElement PATH$maxClusterUniqueGeometryCount = PathElement.groupElement("PATH$maxClusterUniqueGeometryCount");
    public static final PathElement PATH$maxClusterTriangleCount = PathElement.groupElement("PATH$maxClusterTriangleCount");
    public static final PathElement PATH$maxClusterVertexCount = PathElement.groupElement("PATH$maxClusterVertexCount");
    public static final PathElement PATH$maxTotalTriangleCount = PathElement.groupElement("PATH$maxTotalTriangleCount");
    public static final PathElement PATH$maxTotalVertexCount = PathElement.groupElement("PATH$maxTotalVertexCount");
    public static final PathElement PATH$minPositionTruncateBitCount = PathElement.groupElement("PATH$minPositionTruncateBitCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final OfInt LAYOUT$maxGeometryIndexValue = (OfInt) LAYOUT.select(PATH$maxGeometryIndexValue);
    public static final OfInt LAYOUT$maxClusterUniqueGeometryCount = (OfInt) LAYOUT.select(PATH$maxClusterUniqueGeometryCount);
    public static final OfInt LAYOUT$maxClusterTriangleCount = (OfInt) LAYOUT.select(PATH$maxClusterTriangleCount);
    public static final OfInt LAYOUT$maxClusterVertexCount = (OfInt) LAYOUT.select(PATH$maxClusterVertexCount);
    public static final OfInt LAYOUT$maxTotalTriangleCount = (OfInt) LAYOUT.select(PATH$maxTotalTriangleCount);
    public static final OfInt LAYOUT$maxTotalVertexCount = (OfInt) LAYOUT.select(PATH$maxTotalVertexCount);
    public static final OfInt LAYOUT$minPositionTruncateBitCount = (OfInt) LAYOUT.select(PATH$minPositionTruncateBitCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$maxGeometryIndexValue = LAYOUT$maxGeometryIndexValue.byteSize();
    public static final long SIZE$maxClusterUniqueGeometryCount = LAYOUT$maxClusterUniqueGeometryCount.byteSize();
    public static final long SIZE$maxClusterTriangleCount = LAYOUT$maxClusterTriangleCount.byteSize();
    public static final long SIZE$maxClusterVertexCount = LAYOUT$maxClusterVertexCount.byteSize();
    public static final long SIZE$maxTotalTriangleCount = LAYOUT$maxTotalTriangleCount.byteSize();
    public static final long SIZE$maxTotalVertexCount = LAYOUT$maxTotalVertexCount.byteSize();
    public static final long SIZE$minPositionTruncateBitCount = LAYOUT$minPositionTruncateBitCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$maxGeometryIndexValue = LAYOUT.byteOffset(PATH$maxGeometryIndexValue);
    public static final long OFFSET$maxClusterUniqueGeometryCount = LAYOUT.byteOffset(PATH$maxClusterUniqueGeometryCount);
    public static final long OFFSET$maxClusterTriangleCount = LAYOUT.byteOffset(PATH$maxClusterTriangleCount);
    public static final long OFFSET$maxClusterVertexCount = LAYOUT.byteOffset(PATH$maxClusterVertexCount);
    public static final long OFFSET$maxTotalTriangleCount = LAYOUT.byteOffset(PATH$maxTotalTriangleCount);
    public static final long OFFSET$maxTotalVertexCount = LAYOUT.byteOffset(PATH$maxTotalVertexCount);
    public static final long OFFSET$minPositionTruncateBitCount = LAYOUT.byteOffset(PATH$minPositionTruncateBitCount);
}
