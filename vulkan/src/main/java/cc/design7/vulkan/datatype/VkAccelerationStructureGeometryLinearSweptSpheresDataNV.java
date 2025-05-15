package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryLinearSweptSpheresDataNV.html"><code>VkAccelerationStructureGeometryLinearSweptSpheresDataNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAccelerationStructureGeometryLinearSweptSpheresDataNV {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkFormat vertexFormat;
///     VkDeviceOrHostAddressConstKHR vertexData;
///     VkDeviceSize vertexStride;
///     VkFormat radiusFormat;
///     VkDeviceOrHostAddressConstKHR radiusData;
///     VkDeviceSize radiusStride;
///     VkIndexType indexType;
///     VkDeviceOrHostAddressConstKHR indexData;
///     VkDeviceSize indexStride;
///     VkRayTracingLssIndexingModeNV indexingMode;
///     VkRayTracingLssPrimitiveEndCapsModeNV endCapsMode;
/// } VkAccelerationStructureGeometryLinearSweptSpheresDataNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV`
///
/// The {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkAccelerationStructureGeometryLinearSweptSpheresDataNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccelerationStructureGeometryLinearSweptSpheresDataNV.html"><code>VkAccelerationStructureGeometryLinearSweptSpheresDataNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAccelerationStructureGeometryLinearSweptSpheresDataNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV allocate(Arena arena) {
        VkAccelerationStructureGeometryLinearSweptSpheresDataNV ret = new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
        return ret;
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAccelerationStructureGeometryLinearSweptSpheresDataNV[] ret = new VkAccelerationStructureGeometryLinearSweptSpheresDataNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAccelerationStructureGeometryLinearSweptSpheresDataNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
        }
        return ret;
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV clone(Arena arena, VkAccelerationStructureGeometryLinearSweptSpheresDataNV src) {
        VkAccelerationStructureGeometryLinearSweptSpheresDataNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAccelerationStructureGeometryLinearSweptSpheresDataNV[] clone(Arena arena, VkAccelerationStructureGeometryLinearSweptSpheresDataNV[] src) {
        VkAccelerationStructureGeometryLinearSweptSpheresDataNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ACCELERATION_STRUCTURE_GEOMETRY_LINEAR_SWEPT_SPHERES_DATA_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkFormat.class) int vertexFormat() {
        return segment.get(LAYOUT$vertexFormat, OFFSET$vertexFormat);
    }

    public void vertexFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$vertexFormat, OFFSET$vertexFormat, value);
    }

    public VkDeviceOrHostAddressConstKHR vertexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$vertexData, LAYOUT$vertexData));
    }

    public void vertexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexData, SIZE$vertexData);
    }

    public @unsigned long vertexStride() {
        return segment.get(LAYOUT$vertexStride, OFFSET$vertexStride);
    }

    public void vertexStride(@unsigned long value) {
        segment.set(LAYOUT$vertexStride, OFFSET$vertexStride, value);
    }

    public @enumtype(VkFormat.class) int radiusFormat() {
        return segment.get(LAYOUT$radiusFormat, OFFSET$radiusFormat);
    }

    public void radiusFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$radiusFormat, OFFSET$radiusFormat, value);
    }

    public VkDeviceOrHostAddressConstKHR radiusData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$radiusData, LAYOUT$radiusData));
    }

    public void radiusData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$radiusData, SIZE$radiusData);
    }

    public @unsigned long radiusStride() {
        return segment.get(LAYOUT$radiusStride, OFFSET$radiusStride);
    }

    public void radiusStride(@unsigned long value) {
        segment.set(LAYOUT$radiusStride, OFFSET$radiusStride, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }

    public VkDeviceOrHostAddressConstKHR indexData() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$indexData, LAYOUT$indexData));
    }

    public void indexData(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexData, SIZE$indexData);
    }

    public @unsigned long indexStride() {
        return segment.get(LAYOUT$indexStride, OFFSET$indexStride);
    }

    public void indexStride(@unsigned long value) {
        segment.set(LAYOUT$indexStride, OFFSET$indexStride, value);
    }

    public @enumtype(VkRayTracingLssIndexingModeNV.class) int indexingMode() {
        return segment.get(LAYOUT$indexingMode, OFFSET$indexingMode);
    }

    public void indexingMode(@enumtype(VkRayTracingLssIndexingModeNV.class) int value) {
        segment.set(LAYOUT$indexingMode, OFFSET$indexingMode, value);
    }

    public @enumtype(VkRayTracingLssPrimitiveEndCapsModeNV.class) int endCapsMode() {
        return segment.get(LAYOUT$endCapsMode, OFFSET$endCapsMode);
    }

    public void endCapsMode(@enumtype(VkRayTracingLssPrimitiveEndCapsModeNV.class) int value) {
        segment.set(LAYOUT$endCapsMode, OFFSET$endCapsMode, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("vertexData"),
        ValueLayout.JAVA_LONG.withName("vertexStride"),
        ValueLayout.JAVA_INT.withName("radiusFormat"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("radiusData"),
        ValueLayout.JAVA_LONG.withName("radiusStride"),
        ValueLayout.JAVA_INT.withName("indexType"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("indexData"),
        ValueLayout.JAVA_LONG.withName("indexStride"),
        ValueLayout.JAVA_INT.withName("indexingMode"),
        ValueLayout.JAVA_INT.withName("endCapsMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vertexFormat = PathElement.groupElement("PATH$vertexFormat");
    public static final PathElement PATH$vertexData = PathElement.groupElement("PATH$vertexData");
    public static final PathElement PATH$vertexStride = PathElement.groupElement("PATH$vertexStride");
    public static final PathElement PATH$radiusFormat = PathElement.groupElement("PATH$radiusFormat");
    public static final PathElement PATH$radiusData = PathElement.groupElement("PATH$radiusData");
    public static final PathElement PATH$radiusStride = PathElement.groupElement("PATH$radiusStride");
    public static final PathElement PATH$indexType = PathElement.groupElement("PATH$indexType");
    public static final PathElement PATH$indexData = PathElement.groupElement("PATH$indexData");
    public static final PathElement PATH$indexStride = PathElement.groupElement("PATH$indexStride");
    public static final PathElement PATH$indexingMode = PathElement.groupElement("PATH$indexingMode");
    public static final PathElement PATH$endCapsMode = PathElement.groupElement("PATH$endCapsMode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexFormat = (OfInt) LAYOUT.select(PATH$vertexFormat);
    public static final StructLayout LAYOUT$vertexData = (StructLayout) LAYOUT.select(PATH$vertexData);
    public static final OfLong LAYOUT$vertexStride = (OfLong) LAYOUT.select(PATH$vertexStride);
    public static final OfInt LAYOUT$radiusFormat = (OfInt) LAYOUT.select(PATH$radiusFormat);
    public static final StructLayout LAYOUT$radiusData = (StructLayout) LAYOUT.select(PATH$radiusData);
    public static final OfLong LAYOUT$radiusStride = (OfLong) LAYOUT.select(PATH$radiusStride);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);
    public static final StructLayout LAYOUT$indexData = (StructLayout) LAYOUT.select(PATH$indexData);
    public static final OfLong LAYOUT$indexStride = (OfLong) LAYOUT.select(PATH$indexStride);
    public static final OfInt LAYOUT$indexingMode = (OfInt) LAYOUT.select(PATH$indexingMode);
    public static final OfInt LAYOUT$endCapsMode = (OfInt) LAYOUT.select(PATH$endCapsMode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vertexFormat = LAYOUT$vertexFormat.byteSize();
    public static final long SIZE$vertexData = LAYOUT$vertexData.byteSize();
    public static final long SIZE$vertexStride = LAYOUT$vertexStride.byteSize();
    public static final long SIZE$radiusFormat = LAYOUT$radiusFormat.byteSize();
    public static final long SIZE$radiusData = LAYOUT$radiusData.byteSize();
    public static final long SIZE$radiusStride = LAYOUT$radiusStride.byteSize();
    public static final long SIZE$indexType = LAYOUT$indexType.byteSize();
    public static final long SIZE$indexData = LAYOUT$indexData.byteSize();
    public static final long SIZE$indexStride = LAYOUT$indexStride.byteSize();
    public static final long SIZE$indexingMode = LAYOUT$indexingMode.byteSize();
    public static final long SIZE$endCapsMode = LAYOUT$endCapsMode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexFormat = LAYOUT.byteOffset(PATH$vertexFormat);
    public static final long OFFSET$vertexData = LAYOUT.byteOffset(PATH$vertexData);
    public static final long OFFSET$vertexStride = LAYOUT.byteOffset(PATH$vertexStride);
    public static final long OFFSET$radiusFormat = LAYOUT.byteOffset(PATH$radiusFormat);
    public static final long OFFSET$radiusData = LAYOUT.byteOffset(PATH$radiusData);
    public static final long OFFSET$radiusStride = LAYOUT.byteOffset(PATH$radiusStride);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);
    public static final long OFFSET$indexData = LAYOUT.byteOffset(PATH$indexData);
    public static final long OFFSET$indexStride = LAYOUT.byteOffset(PATH$indexStride);
    public static final long OFFSET$indexingMode = LAYOUT.byteOffset(PATH$indexingMode);
    public static final long OFFSET$endCapsMode = LAYOUT.byteOffset(PATH$endCapsMode);
}
