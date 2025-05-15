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

/// Represents a pointer to a {@code VkPhysicalDeviceMeshShaderPropertiesEXT} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderPropertiesEXT.html">VkPhysicalDeviceMeshShaderPropertiesEXT</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceMeshShaderPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMeshShaderPropertiesEXT {
        sType(VkStructureType.PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderPropertiesEXT[] ret = new VkPhysicalDeviceMeshShaderPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT clone(Arena arena, VkPhysicalDeviceMeshShaderPropertiesEXT src) {
        VkPhysicalDeviceMeshShaderPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceMeshShaderPropertiesEXT[] src) {
        VkPhysicalDeviceMeshShaderPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshPayloadAndOutputMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputComponents"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputLayers"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity"),
        ValueLayout.JAVA_INT.withName("maxPreferredTaskWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("maxPreferredMeshWorkGroupInvocations"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersLocalInvocationPrimitiveOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactVertexOutput"),
        ValueLayout.JAVA_INT.withName("prefersCompactPrimitiveOutput")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxTaskWorkGroupTotalCount = PathElement.groupElement("PATH$maxTaskWorkGroupTotalCount");
    public static final PathElement PATH$maxTaskWorkGroupCount = PathElement.groupElement("PATH$maxTaskWorkGroupCount");
    public static final PathElement PATH$maxTaskWorkGroupInvocations = PathElement.groupElement("PATH$maxTaskWorkGroupInvocations");
    public static final PathElement PATH$maxTaskWorkGroupSize = PathElement.groupElement("PATH$maxTaskWorkGroupSize");
    public static final PathElement PATH$maxTaskPayloadSize = PathElement.groupElement("PATH$maxTaskPayloadSize");
    public static final PathElement PATH$maxTaskSharedMemorySize = PathElement.groupElement("PATH$maxTaskSharedMemorySize");
    public static final PathElement PATH$maxTaskPayloadAndSharedMemorySize = PathElement.groupElement("PATH$maxTaskPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshWorkGroupTotalCount = PathElement.groupElement("PATH$maxMeshWorkGroupTotalCount");
    public static final PathElement PATH$maxMeshWorkGroupCount = PathElement.groupElement("PATH$maxMeshWorkGroupCount");
    public static final PathElement PATH$maxMeshWorkGroupInvocations = PathElement.groupElement("PATH$maxMeshWorkGroupInvocations");
    public static final PathElement PATH$maxMeshWorkGroupSize = PathElement.groupElement("PATH$maxMeshWorkGroupSize");
    public static final PathElement PATH$maxMeshSharedMemorySize = PathElement.groupElement("PATH$maxMeshSharedMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndSharedMemorySize = PathElement.groupElement("PATH$maxMeshPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshOutputMemorySize = PathElement.groupElement("PATH$maxMeshOutputMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndOutputMemorySize = PathElement.groupElement("PATH$maxMeshPayloadAndOutputMemorySize");
    public static final PathElement PATH$maxMeshOutputComponents = PathElement.groupElement("PATH$maxMeshOutputComponents");
    public static final PathElement PATH$maxMeshOutputVertices = PathElement.groupElement("PATH$maxMeshOutputVertices");
    public static final PathElement PATH$maxMeshOutputPrimitives = PathElement.groupElement("PATH$maxMeshOutputPrimitives");
    public static final PathElement PATH$maxMeshOutputLayers = PathElement.groupElement("PATH$maxMeshOutputLayers");
    public static final PathElement PATH$maxMeshMultiviewViewCount = PathElement.groupElement("PATH$maxMeshMultiviewViewCount");
    public static final PathElement PATH$meshOutputPerVertexGranularity = PathElement.groupElement("PATH$meshOutputPerVertexGranularity");
    public static final PathElement PATH$meshOutputPerPrimitiveGranularity = PathElement.groupElement("PATH$meshOutputPerPrimitiveGranularity");
    public static final PathElement PATH$maxPreferredTaskWorkGroupInvocations = PathElement.groupElement("PATH$maxPreferredTaskWorkGroupInvocations");
    public static final PathElement PATH$maxPreferredMeshWorkGroupInvocations = PathElement.groupElement("PATH$maxPreferredMeshWorkGroupInvocations");
    public static final PathElement PATH$prefersLocalInvocationVertexOutput = PathElement.groupElement("PATH$prefersLocalInvocationVertexOutput");
    public static final PathElement PATH$prefersLocalInvocationPrimitiveOutput = PathElement.groupElement("PATH$prefersLocalInvocationPrimitiveOutput");
    public static final PathElement PATH$prefersCompactVertexOutput = PathElement.groupElement("PATH$prefersCompactVertexOutput");
    public static final PathElement PATH$prefersCompactPrimitiveOutput = PathElement.groupElement("PATH$prefersCompactPrimitiveOutput");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxTaskWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupTotalCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupCount = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupInvocations);
    public static final OfInt LAYOUT$maxTaskWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupSize);
    public static final OfInt LAYOUT$maxTaskPayloadSize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadSize);
    public static final OfInt LAYOUT$maxTaskSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskSharedMemorySize);
    public static final OfInt LAYOUT$maxTaskPayloadAndSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadAndSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupTotalCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupCount = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupInvocations);
    public static final OfInt LAYOUT$maxMeshWorkGroupSize = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupSize);
    public static final OfInt LAYOUT$maxMeshSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshPayloadAndSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshPayloadAndSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshOutputMemorySize);
    public static final OfInt LAYOUT$maxMeshPayloadAndOutputMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshPayloadAndOutputMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputComponents = (OfInt) LAYOUT.select(PATH$maxMeshOutputComponents);
    public static final OfInt LAYOUT$maxMeshOutputVertices = (OfInt) LAYOUT.select(PATH$maxMeshOutputVertices);
    public static final OfInt LAYOUT$maxMeshOutputPrimitives = (OfInt) LAYOUT.select(PATH$maxMeshOutputPrimitives);
    public static final OfInt LAYOUT$maxMeshOutputLayers = (OfInt) LAYOUT.select(PATH$maxMeshOutputLayers);
    public static final OfInt LAYOUT$maxMeshMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMeshMultiviewViewCount);
    public static final OfInt LAYOUT$meshOutputPerVertexGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerVertexGranularity);
    public static final OfInt LAYOUT$meshOutputPerPrimitiveGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerPrimitiveGranularity);
    public static final OfInt LAYOUT$maxPreferredTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxPreferredTaskWorkGroupInvocations);
    public static final OfInt LAYOUT$maxPreferredMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxPreferredMeshWorkGroupInvocations);
    public static final OfInt LAYOUT$prefersLocalInvocationVertexOutput = (OfInt) LAYOUT.select(PATH$prefersLocalInvocationVertexOutput);
    public static final OfInt LAYOUT$prefersLocalInvocationPrimitiveOutput = (OfInt) LAYOUT.select(PATH$prefersLocalInvocationPrimitiveOutput);
    public static final OfInt LAYOUT$prefersCompactVertexOutput = (OfInt) LAYOUT.select(PATH$prefersCompactVertexOutput);
    public static final OfInt LAYOUT$prefersCompactPrimitiveOutput = (OfInt) LAYOUT.select(PATH$prefersCompactPrimitiveOutput);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxTaskWorkGroupTotalCount = LAYOUT$maxTaskWorkGroupTotalCount.byteSize();
    public static final long SIZE$maxTaskWorkGroupCount = LAYOUT$maxTaskWorkGroupCount.byteSize();
    public static final long SIZE$maxTaskWorkGroupInvocations = LAYOUT$maxTaskWorkGroupInvocations.byteSize();
    public static final long SIZE$maxTaskWorkGroupSize = LAYOUT$maxTaskWorkGroupSize.byteSize();
    public static final long SIZE$maxTaskPayloadSize = LAYOUT$maxTaskPayloadSize.byteSize();
    public static final long SIZE$maxTaskSharedMemorySize = LAYOUT$maxTaskSharedMemorySize.byteSize();
    public static final long SIZE$maxTaskPayloadAndSharedMemorySize = LAYOUT$maxTaskPayloadAndSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshWorkGroupTotalCount = LAYOUT$maxMeshWorkGroupTotalCount.byteSize();
    public static final long SIZE$maxMeshWorkGroupCount = LAYOUT$maxMeshWorkGroupCount.byteSize();
    public static final long SIZE$maxMeshWorkGroupInvocations = LAYOUT$maxMeshWorkGroupInvocations.byteSize();
    public static final long SIZE$maxMeshWorkGroupSize = LAYOUT$maxMeshWorkGroupSize.byteSize();
    public static final long SIZE$maxMeshSharedMemorySize = LAYOUT$maxMeshSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshPayloadAndSharedMemorySize = LAYOUT$maxMeshPayloadAndSharedMemorySize.byteSize();
    public static final long SIZE$maxMeshOutputMemorySize = LAYOUT$maxMeshOutputMemorySize.byteSize();
    public static final long SIZE$maxMeshPayloadAndOutputMemorySize = LAYOUT$maxMeshPayloadAndOutputMemorySize.byteSize();
    public static final long SIZE$maxMeshOutputComponents = LAYOUT$maxMeshOutputComponents.byteSize();
    public static final long SIZE$maxMeshOutputVertices = LAYOUT$maxMeshOutputVertices.byteSize();
    public static final long SIZE$maxMeshOutputPrimitives = LAYOUT$maxMeshOutputPrimitives.byteSize();
    public static final long SIZE$maxMeshOutputLayers = LAYOUT$maxMeshOutputLayers.byteSize();
    public static final long SIZE$maxMeshMultiviewViewCount = LAYOUT$maxMeshMultiviewViewCount.byteSize();
    public static final long SIZE$meshOutputPerVertexGranularity = LAYOUT$meshOutputPerVertexGranularity.byteSize();
    public static final long SIZE$meshOutputPerPrimitiveGranularity = LAYOUT$meshOutputPerPrimitiveGranularity.byteSize();
    public static final long SIZE$maxPreferredTaskWorkGroupInvocations = LAYOUT$maxPreferredTaskWorkGroupInvocations.byteSize();
    public static final long SIZE$maxPreferredMeshWorkGroupInvocations = LAYOUT$maxPreferredMeshWorkGroupInvocations.byteSize();
    public static final long SIZE$prefersLocalInvocationVertexOutput = LAYOUT$prefersLocalInvocationVertexOutput.byteSize();
    public static final long SIZE$prefersLocalInvocationPrimitiveOutput = LAYOUT$prefersLocalInvocationPrimitiveOutput.byteSize();
    public static final long SIZE$prefersCompactVertexOutput = LAYOUT$prefersCompactVertexOutput.byteSize();
    public static final long SIZE$prefersCompactPrimitiveOutput = LAYOUT$prefersCompactPrimitiveOutput.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxTaskWorkGroupTotalCount = LAYOUT.byteOffset(PATH$maxTaskWorkGroupTotalCount);
    public static final long OFFSET$maxTaskWorkGroupCount = LAYOUT.byteOffset(PATH$maxTaskWorkGroupCount);
    public static final long OFFSET$maxTaskWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxTaskWorkGroupInvocations);
    public static final long OFFSET$maxTaskWorkGroupSize = LAYOUT.byteOffset(PATH$maxTaskWorkGroupSize);
    public static final long OFFSET$maxTaskPayloadSize = LAYOUT.byteOffset(PATH$maxTaskPayloadSize);
    public static final long OFFSET$maxTaskSharedMemorySize = LAYOUT.byteOffset(PATH$maxTaskSharedMemorySize);
    public static final long OFFSET$maxTaskPayloadAndSharedMemorySize = LAYOUT.byteOffset(PATH$maxTaskPayloadAndSharedMemorySize);
    public static final long OFFSET$maxMeshWorkGroupTotalCount = LAYOUT.byteOffset(PATH$maxMeshWorkGroupTotalCount);
    public static final long OFFSET$maxMeshWorkGroupCount = LAYOUT.byteOffset(PATH$maxMeshWorkGroupCount);
    public static final long OFFSET$maxMeshWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxMeshWorkGroupInvocations);
    public static final long OFFSET$maxMeshWorkGroupSize = LAYOUT.byteOffset(PATH$maxMeshWorkGroupSize);
    public static final long OFFSET$maxMeshSharedMemorySize = LAYOUT.byteOffset(PATH$maxMeshSharedMemorySize);
    public static final long OFFSET$maxMeshPayloadAndSharedMemorySize = LAYOUT.byteOffset(PATH$maxMeshPayloadAndSharedMemorySize);
    public static final long OFFSET$maxMeshOutputMemorySize = LAYOUT.byteOffset(PATH$maxMeshOutputMemorySize);
    public static final long OFFSET$maxMeshPayloadAndOutputMemorySize = LAYOUT.byteOffset(PATH$maxMeshPayloadAndOutputMemorySize);
    public static final long OFFSET$maxMeshOutputComponents = LAYOUT.byteOffset(PATH$maxMeshOutputComponents);
    public static final long OFFSET$maxMeshOutputVertices = LAYOUT.byteOffset(PATH$maxMeshOutputVertices);
    public static final long OFFSET$maxMeshOutputPrimitives = LAYOUT.byteOffset(PATH$maxMeshOutputPrimitives);
    public static final long OFFSET$maxMeshOutputLayers = LAYOUT.byteOffset(PATH$maxMeshOutputLayers);
    public static final long OFFSET$maxMeshMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMeshMultiviewViewCount);
    public static final long OFFSET$meshOutputPerVertexGranularity = LAYOUT.byteOffset(PATH$meshOutputPerVertexGranularity);
    public static final long OFFSET$meshOutputPerPrimitiveGranularity = LAYOUT.byteOffset(PATH$meshOutputPerPrimitiveGranularity);
    public static final long OFFSET$maxPreferredTaskWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxPreferredTaskWorkGroupInvocations);
    public static final long OFFSET$maxPreferredMeshWorkGroupInvocations = LAYOUT.byteOffset(PATH$maxPreferredMeshWorkGroupInvocations);
    public static final long OFFSET$prefersLocalInvocationVertexOutput = LAYOUT.byteOffset(PATH$prefersLocalInvocationVertexOutput);
    public static final long OFFSET$prefersLocalInvocationPrimitiveOutput = LAYOUT.byteOffset(PATH$prefersLocalInvocationPrimitiveOutput);
    public static final long OFFSET$prefersCompactVertexOutput = LAYOUT.byteOffset(PATH$prefersCompactVertexOutput);
    public static final long OFFSET$prefersCompactPrimitiveOutput = LAYOUT.byteOffset(PATH$prefersCompactPrimitiveOutput);

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

    public @unsigned int maxTaskWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount);
    }

    public void maxTaskWorkGroupTotalCount(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount, value);
    }

    public @unsigned int maxTaskWorkGroupCount() {
        return segment.get(LAYOUT$maxTaskWorkGroupCount, OFFSET$maxTaskWorkGroupCount);
    }

    public void maxTaskWorkGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupCount, OFFSET$maxTaskWorkGroupCount, value);
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

    public @unsigned int maxTaskPayloadSize() {
        return segment.get(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize);
    }

    public void maxTaskPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxTaskPayloadSize, OFFSET$maxTaskPayloadSize, value);
    }

    public @unsigned int maxTaskSharedMemorySize() {
        return segment.get(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize);
    }

    public void maxTaskSharedMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxTaskSharedMemorySize, OFFSET$maxTaskSharedMemorySize, value);
    }

    public @unsigned int maxTaskPayloadAndSharedMemorySize() {
        return segment.get(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize);
    }

    public void maxTaskPayloadAndSharedMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxTaskPayloadAndSharedMemorySize, OFFSET$maxTaskPayloadAndSharedMemorySize, value);
    }

    public @unsigned int maxMeshWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount);
    }

    public void maxMeshWorkGroupTotalCount(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupTotalCount, OFFSET$maxMeshWorkGroupTotalCount, value);
    }

    public @unsigned int maxMeshWorkGroupCount() {
        return segment.get(LAYOUT$maxMeshWorkGroupCount, OFFSET$maxMeshWorkGroupCount);
    }

    public void maxMeshWorkGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupCount, OFFSET$maxMeshWorkGroupCount, value);
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

    public @unsigned int maxMeshSharedMemorySize() {
        return segment.get(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize);
    }

    public void maxMeshSharedMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshSharedMemorySize, OFFSET$maxMeshSharedMemorySize, value);
    }

    public @unsigned int maxMeshPayloadAndSharedMemorySize() {
        return segment.get(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize);
    }

    public void maxMeshPayloadAndSharedMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshPayloadAndSharedMemorySize, OFFSET$maxMeshPayloadAndSharedMemorySize, value);
    }

    public @unsigned int maxMeshOutputMemorySize() {
        return segment.get(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize);
    }

    public void maxMeshOutputMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputMemorySize, OFFSET$maxMeshOutputMemorySize, value);
    }

    public @unsigned int maxMeshPayloadAndOutputMemorySize() {
        return segment.get(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize);
    }

    public void maxMeshPayloadAndOutputMemorySize(@unsigned int value) {
        segment.set(LAYOUT$maxMeshPayloadAndOutputMemorySize, OFFSET$maxMeshPayloadAndOutputMemorySize, value);
    }

    public @unsigned int maxMeshOutputComponents() {
        return segment.get(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents);
    }

    public void maxMeshOutputComponents(@unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputComponents, OFFSET$maxMeshOutputComponents, value);
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

    public @unsigned int maxMeshOutputLayers() {
        return segment.get(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers);
    }

    public void maxMeshOutputLayers(@unsigned int value) {
        segment.set(LAYOUT$maxMeshOutputLayers, OFFSET$maxMeshOutputLayers, value);
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

    public @unsigned int maxPreferredTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations);
    }

    public void maxPreferredTaskWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxPreferredTaskWorkGroupInvocations, OFFSET$maxPreferredTaskWorkGroupInvocations, value);
    }

    public @unsigned int maxPreferredMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations);
    }

    public void maxPreferredMeshWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxPreferredMeshWorkGroupInvocations, OFFSET$maxPreferredMeshWorkGroupInvocations, value);
    }

    public @unsigned int prefersLocalInvocationVertexOutput() {
        return segment.get(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput);
    }

    public void prefersLocalInvocationVertexOutput(@unsigned int value) {
        segment.set(LAYOUT$prefersLocalInvocationVertexOutput, OFFSET$prefersLocalInvocationVertexOutput, value);
    }

    public @unsigned int prefersLocalInvocationPrimitiveOutput() {
        return segment.get(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput);
    }

    public void prefersLocalInvocationPrimitiveOutput(@unsigned int value) {
        segment.set(LAYOUT$prefersLocalInvocationPrimitiveOutput, OFFSET$prefersLocalInvocationPrimitiveOutput, value);
    }

    public @unsigned int prefersCompactVertexOutput() {
        return segment.get(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput);
    }

    public void prefersCompactVertexOutput(@unsigned int value) {
        segment.set(LAYOUT$prefersCompactVertexOutput, OFFSET$prefersCompactVertexOutput, value);
    }

    public @unsigned int prefersCompactPrimitiveOutput() {
        return segment.get(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput);
    }

    public void prefersCompactPrimitiveOutput(@unsigned int value) {
        segment.set(LAYOUT$prefersCompactPrimitiveOutput, OFFSET$prefersCompactPrimitiveOutput, value);
    }

}
