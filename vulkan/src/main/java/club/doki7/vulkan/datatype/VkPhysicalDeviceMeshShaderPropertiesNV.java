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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesNV.html"><code>VkPhysicalDeviceMeshShaderPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMeshShaderPropertiesNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t maxDrawMeshTasksCount; // @link substring="maxDrawMeshTasksCount" target="#maxDrawMeshTasksCount"
///     uint32_t maxTaskWorkGroupInvocations; // @link substring="maxTaskWorkGroupInvocations" target="#maxTaskWorkGroupInvocations"
///     uint32_t maxTaskWorkGroupSize; // @link substring="maxTaskWorkGroupSize" target="#maxTaskWorkGroupSize"
///     uint32_t maxTaskTotalMemorySize; // @link substring="maxTaskTotalMemorySize" target="#maxTaskTotalMemorySize"
///     uint32_t maxTaskOutputCount; // @link substring="maxTaskOutputCount" target="#maxTaskOutputCount"
///     uint32_t maxMeshWorkGroupInvocations; // @link substring="maxMeshWorkGroupInvocations" target="#maxMeshWorkGroupInvocations"
///     uint32_t maxMeshWorkGroupSize; // @link substring="maxMeshWorkGroupSize" target="#maxMeshWorkGroupSize"
///     uint32_t maxMeshTotalMemorySize; // @link substring="maxMeshTotalMemorySize" target="#maxMeshTotalMemorySize"
///     uint32_t maxMeshOutputVertices; // @link substring="maxMeshOutputVertices" target="#maxMeshOutputVertices"
///     uint32_t maxMeshOutputPrimitives; // @link substring="maxMeshOutputPrimitives" target="#maxMeshOutputPrimitives"
///     uint32_t maxMeshMultiviewViewCount; // @link substring="maxMeshMultiviewViewCount" target="#maxMeshMultiviewViewCount"
///     uint32_t meshOutputPerVertexGranularity; // @link substring="meshOutputPerVertexGranularity" target="#meshOutputPerVertexGranularity"
///     uint32_t meshOutputPerPrimitiveGranularity; // @link substring="meshOutputPerPrimitiveGranularity" target="#meshOutputPerPrimitiveGranularity"
/// } VkPhysicalDeviceMeshShaderPropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV`
///
/// The {@code allocate} ({@link VkPhysicalDeviceMeshShaderPropertiesNV#allocate(Arena)}, {@link VkPhysicalDeviceMeshShaderPropertiesNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceMeshShaderPropertiesNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesNV.html"><code>VkPhysicalDeviceMeshShaderPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMeshShaderPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceMeshShaderPropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceMeshShaderPropertiesNV ret = new VkPhysicalDeviceMeshShaderPropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderPropertiesNV[] ret = new VkPhysicalDeviceMeshShaderPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMeshShaderPropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV clone(Arena arena, VkPhysicalDeviceMeshShaderPropertiesNV src) {
        VkPhysicalDeviceMeshShaderPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesNV[] clone(Arena arena, VkPhysicalDeviceMeshShaderPropertiesNV[] src) {
        VkPhysicalDeviceMeshShaderPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
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

    public @unsigned int maxDrawMeshTasksCount() {
        return segment.get(LAYOUT$maxDrawMeshTasksCount, OFFSET$maxDrawMeshTasksCount);
    }

    public void maxDrawMeshTasksCount(@unsigned int value) {
        segment.set(LAYOUT$maxDrawMeshTasksCount, OFFSET$maxDrawMeshTasksCount, value);
    }

    public @unsigned int maxTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);
    }

    public void maxTaskWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);
    }

    public @unsigned int maxTaskWorkGroupSize() {
        return segment.get(LAYOUT$maxTaskWorkGroupSize, OFFSET$maxTaskWorkGroupSize);
    }

    public void maxTaskWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupSize, OFFSET$maxTaskWorkGroupSize, value);
    }

    public @unsigned int maxTaskTotalMemorySize() {
        return segment.get(LAYOUT$maxTaskTotalMemorySize, OFFSET$maxTaskTotalMemorySize);
    }

    public void maxTaskTotalMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxTaskTotalMemorySize, OFFSET$maxTaskTotalMemorySize, value);
    }

    public @unsigned int maxTaskOutputCount() {
        return segment.get(LAYOUT$maxTaskOutputCount, OFFSET$maxTaskOutputCount);
    }

    public void maxTaskOutputCount(@unsigned int value) {
        segment.set(LAYOUT$maxTaskOutputCount, OFFSET$maxTaskOutputCount, value);
    }

    public @unsigned int maxMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);
    }

    public void maxMeshWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);
    }

    public @unsigned int maxMeshWorkGroupSize() {
        return segment.get(LAYOUT$maxMeshWorkGroupSize, OFFSET$maxMeshWorkGroupSize);
    }

    public void maxMeshWorkGroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupSize, OFFSET$maxMeshWorkGroupSize, value);
    }

    public @unsigned int maxMeshTotalMemorySize() {
        return segment.get(LAYOUT$maxMeshTotalMemorySize, OFFSET$maxMeshTotalMemorySize);
    }

    public void maxMeshTotalMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshTotalMemorySize, OFFSET$maxMeshTotalMemorySize, value);
    }

    public @unsigned int maxMeshOutputVertices() {
        return segment.get(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices);
    }

    public void maxMeshOutputVertices(@unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputVertices, OFFSET$maxMeshOutputVertices, value);
    }

    public @unsigned int maxMeshOutputPrimitives() {
        return segment.get(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives);
    }

    public void maxMeshOutputPrimitives(@unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputPrimitives, OFFSET$maxMeshOutputPrimitives, value);
    }

    public @unsigned int maxMeshMultiviewViewCount() {
        return segment.get(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount);
    }

    public void maxMeshMultiviewViewCount(@unsigned int value) {
        segment.set(LAYOUT$maxMeshMultiviewViewCount, OFFSET$maxMeshMultiviewViewCount, value);
    }

    public @unsigned int meshOutputPerVertexGranularity() {
        return segment.get(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity);
    }

    public void meshOutputPerVertexGranularity(@unsigned int value) {
        segment.set(LAYOUT$meshOutputPerVertexGranularity, OFFSET$meshOutputPerVertexGranularity, value);
    }

    public @unsigned int meshOutputPerPrimitiveGranularity() {
        return segment.get(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity);
    }

    public void meshOutputPerPrimitiveGranularity(@unsigned int value) {
        segment.set(LAYOUT$meshOutputPerPrimitiveGranularity, OFFSET$meshOutputPerPrimitiveGranularity, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDrawMeshTasksCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskOutputCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxDrawMeshTasksCount = PathElement.groupElement("PATH$maxDrawMeshTasksCount");
    public static final PathElement PATH$maxTaskWorkGroupInvocations = PathElement.groupElement("PATH$maxTaskWorkGroupInvocations");
    public static final PathElement PATH$maxTaskWorkGroupSize = PathElement.groupElement("PATH$maxTaskWorkGroupSize");
    public static final PathElement PATH$maxTaskTotalMemorySize = PathElement.groupElement("PATH$maxTaskTotalMemorySize");
    public static final PathElement PATH$maxTaskOutputCount = PathElement.groupElement("PATH$maxTaskOutputCount");
    public static final PathElement PATH$maxMeshWorkGroupInvocations = PathElement.groupElement("PATH$maxMeshWorkGroupInvocations");
    public static final PathElement PATH$maxMeshWorkGroupSize = PathElement.groupElement("PATH$maxMeshWorkGroupSize");
    public static final PathElement PATH$maxMeshTotalMemorySize = PathElement.groupElement("PATH$maxMeshTotalMemorySize");
    public static final PathElement PATH$maxMeshOutputVertices = PathElement.groupElement("PATH$maxMeshOutputVertices");
    public static final PathElement PATH$maxMeshOutputPrimitives = PathElement.groupElement("PATH$maxMeshOutputPrimitives");
    public static final PathElement PATH$maxMeshMultiviewViewCount = PathElement.groupElement("PATH$maxMeshMultiviewViewCount");
    public static final PathElement PATH$meshOutputPerVertexGranularity = PathElement.groupElement("PATH$meshOutputPerVertexGranularity");
    public static final PathElement PATH$meshOutputPerPrimitiveGranularity = PathElement.groupElement("PATH$meshOutputPerPrimitiveGranularity");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxDrawMeshTasksCount = (OfInt) LAYOUT.select(PATH$maxDrawMeshTasksCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupInvocations);
    public static final OfInt LAYOUT$maxTaskWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupSize);
    public static final OfInt LAYOUT$maxTaskTotalMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskTotalMemorySize);
    public static final OfInt LAYOUT$maxTaskOutputCount = (OfInt) LAYOUT.select(PATH$maxTaskOutputCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupInvocations);
    public static final OfInt LAYOUT$maxMeshWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupSize);
    public static final OfInt LAYOUT$maxMeshTotalMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshTotalMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputVertices = (OfInt) LAYOUT.select(PATH$maxMeshOutputVertices);
    public static final OfInt LAYOUT$maxMeshOutputPrimitives = (OfInt) LAYOUT.select(PATH$maxMeshOutputPrimitives);
    public static final OfInt LAYOUT$maxMeshMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMeshMultiviewViewCount);
    public static final OfInt LAYOUT$meshOutputPerVertexGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerVertexGranularity);
    public static final OfInt LAYOUT$meshOutputPerPrimitiveGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerPrimitiveGranularity);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxDrawMeshTasksCount = LAYOUT$maxDrawMeshTasksCount.byteSize();
    public static final long SIZE$maxTaskWorkGroupInvocations = LAYOUT$maxTaskWorkGroupInvocations.byteSize();
    public static final long SIZE$maxTaskWorkGroupSize = LAYOUT$maxTaskWorkGroupSize.byteSize();
    public static final long SIZE$maxTaskTotalMemorySize = LAYOUT$maxTaskTotalMemorySize.byteSize();
    public static final long SIZE$maxTaskOutputCount = LAYOUT$maxTaskOutputCount.byteSize();
    public static final long SIZE$maxMeshWorkGroupInvocations = LAYOUT$maxMeshWorkGroupInvocations.byteSize();
    public static final long SIZE$maxMeshWorkGroupSize = LAYOUT$maxMeshWorkGroupSize.byteSize();
    public static final long SIZE$maxMeshTotalMemorySize = LAYOUT$maxMeshTotalMemorySize.byteSize();
    public static final long SIZE$maxMeshOutputVertices = LAYOUT$maxMeshOutputVertices.byteSize();
    public static final long SIZE$maxMeshOutputPrimitives = LAYOUT$maxMeshOutputPrimitives.byteSize();
    public static final long SIZE$maxMeshMultiviewViewCount = LAYOUT$maxMeshMultiviewViewCount.byteSize();
    public static final long SIZE$meshOutputPerVertexGranularity = LAYOUT$meshOutputPerVertexGranularity.byteSize();
    public static final long SIZE$meshOutputPerPrimitiveGranularity = LAYOUT$meshOutputPerPrimitiveGranularity.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxDrawMeshTasksCount = LAYOUT.byteOffset(PATH$maxDrawMeshTasksCount);
    public static final long OFFSET$maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxTaskWorkGroupInvocations);
    public static final long OFFSET$maxTaskWorkGroupSize = LAYOUT.byteOffset(PATH$maxTaskWorkGroupSize);
    public static final long OFFSET$maxTaskTotalMemorySize = LAYOUT.byteOffset(PATH$maxTaskTotalMemorySize);
    public static final long OFFSET$maxTaskOutputCount = LAYOUT.byteOffset(PATH$maxTaskOutputCount);
    public static final long OFFSET$maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxMeshWorkGroupInvocations);
    public static final long OFFSET$maxMeshWorkGroupSize = LAYOUT.byteOffset(PATH$maxMeshWorkGroupSize);
    public static final long OFFSET$maxMeshTotalMemorySize = LAYOUT.byteOffset(PATH$maxMeshTotalMemorySize);
    public static final long OFFSET$maxMeshOutputVertices = LAYOUT.byteOffset(PATH$maxMeshOutputVertices);
    public static final long OFFSET$maxMeshOutputPrimitives = LAYOUT.byteOffset(PATH$maxMeshOutputPrimitives);
    public static final long OFFSET$maxMeshMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMeshMultiviewViewCount);
    public static final long OFFSET$meshOutputPerVertexGranularity = LAYOUT.byteOffset(PATH$meshOutputPerVertexGranularity);
    public static final long OFFSET$meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PATH$meshOutputPerPrimitiveGranularity);
}
