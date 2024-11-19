package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMeshShaderPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxTaskWorkGroupTotalCount;
///     uint32_t maxTaskWorkGroupCount[3];
///     uint32_t maxTaskWorkGroupInvocations;
///     uint32_t maxTaskWorkGroupSize[3];
///     uint32_t maxTaskPayloadSize;
///     uint32_t maxTaskSharedMemorySize;
///     uint32_t maxTaskPayloadAndSharedMemorySize;
///     uint32_t maxMeshWorkGroupTotalCount;
///     uint32_t maxMeshWorkGroupCount[3];
///     uint32_t maxMeshWorkGroupInvocations;
///     uint32_t maxMeshWorkGroupSize[3];
///     uint32_t maxMeshSharedMemorySize;
///     uint32_t maxMeshPayloadAndSharedMemorySize;
///     uint32_t maxMeshOutputMemorySize;
///     uint32_t maxMeshPayloadAndOutputMemorySize;
///     uint32_t maxMeshOutputComponents;
///     uint32_t maxMeshOutputVertices;
///     uint32_t maxMeshOutputPrimitives;
///     uint32_t maxMeshOutputLayers;
///     uint32_t maxMeshMultiviewViewCount;
///     uint32_t meshOutputPerVertexGranularity;
///     uint32_t meshOutputPerPrimitiveGranularity;
///     uint32_t maxPreferredTaskWorkGroupInvocations;
///     uint32_t maxPreferredMeshWorkGroupInvocations;
///     VkBool32 prefersLocalInvocationVertexOutput;
///     VkBool32 prefersLocalInvocationPrimitiveOutput;
///     VkBool32 prefersCompactVertexOutput;
///     VkBool32 prefersCompactPrimitiveOutput;
/// } VkPhysicalDeviceMeshShaderPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMeshShaderPropertiesEXT.html">VkPhysicalDeviceMeshShaderPropertiesEXT</a>
public record VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_EXT);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int maxTaskWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount);
    }

    public void maxTaskWorkGroupTotalCount(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount, value);
    }

    public MemorySegment maxTaskWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupCount, SIZE$maxTaskWorkGroupCount);
    }

    public @unsigned IntBuffer maxTaskWorkGroupCount() {
        return new IntBuffer(maxTaskWorkGroupCountRaw());
    }

    public void maxTaskWorkGroupCount(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupCount, SIZE$maxTaskWorkGroupCount);
    }

    public @unsigned int maxTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);
    }

    public void maxTaskWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);
    }

    public MemorySegment maxTaskWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupSize, SIZE$maxTaskWorkGroupSize);
    }

    public @unsigned IntBuffer maxTaskWorkGroupSize() {
        return new IntBuffer(maxTaskWorkGroupSizeRaw());
    }

    public void maxTaskWorkGroupSize(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupSize, SIZE$maxTaskWorkGroupSize);
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

    public MemorySegment maxMeshWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupCount, SIZE$maxMeshWorkGroupCount);
    }

    public @unsigned IntBuffer maxMeshWorkGroupCount() {
        return new IntBuffer(maxMeshWorkGroupCountRaw());
    }

    public void maxMeshWorkGroupCount(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupCount, SIZE$maxMeshWorkGroupCount);
    }

    public @unsigned int maxMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);
    }

    public void maxMeshWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);
    }

    public MemorySegment maxMeshWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupSize, SIZE$maxMeshWorkGroupSize);
    }

    public @unsigned IntBuffer maxMeshWorkGroupSize() {
        return new IntBuffer(maxMeshWorkGroupSizeRaw());
    }

    public void maxMeshWorkGroupSize(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupSize, SIZE$maxMeshWorkGroupSize);
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

    public static VkPhysicalDeviceMeshShaderPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMeshShaderPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMeshShaderPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderPropertiesEXT[] ret = new VkPhysicalDeviceMeshShaderPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMeshShaderPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxTaskSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskPayloadAndSharedMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupTotalCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxTaskWorkGroupTotalCount = PathElement.groupElement("maxTaskWorkGroupTotalCount");
    public static final PathElement PATH$maxTaskWorkGroupCount = PathElement.groupElement("maxTaskWorkGroupCount");
    public static final PathElement PATH$maxTaskWorkGroupInvocations = PathElement.groupElement("maxTaskWorkGroupInvocations");
    public static final PathElement PATH$maxTaskWorkGroupSize = PathElement.groupElement("maxTaskWorkGroupSize");
    public static final PathElement PATH$maxTaskPayloadSize = PathElement.groupElement("maxTaskPayloadSize");
    public static final PathElement PATH$maxTaskSharedMemorySize = PathElement.groupElement("maxTaskSharedMemorySize");
    public static final PathElement PATH$maxTaskPayloadAndSharedMemorySize = PathElement.groupElement("maxTaskPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshWorkGroupTotalCount = PathElement.groupElement("maxMeshWorkGroupTotalCount");
    public static final PathElement PATH$maxMeshWorkGroupCount = PathElement.groupElement("maxMeshWorkGroupCount");
    public static final PathElement PATH$maxMeshWorkGroupInvocations = PathElement.groupElement("maxMeshWorkGroupInvocations");
    public static final PathElement PATH$maxMeshWorkGroupSize = PathElement.groupElement("maxMeshWorkGroupSize");
    public static final PathElement PATH$maxMeshSharedMemorySize = PathElement.groupElement("maxMeshSharedMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndSharedMemorySize = PathElement.groupElement("maxMeshPayloadAndSharedMemorySize");
    public static final PathElement PATH$maxMeshOutputMemorySize = PathElement.groupElement("maxMeshOutputMemorySize");
    public static final PathElement PATH$maxMeshPayloadAndOutputMemorySize = PathElement.groupElement("maxMeshPayloadAndOutputMemorySize");
    public static final PathElement PATH$maxMeshOutputComponents = PathElement.groupElement("maxMeshOutputComponents");
    public static final PathElement PATH$maxMeshOutputVertices = PathElement.groupElement("maxMeshOutputVertices");
    public static final PathElement PATH$maxMeshOutputPrimitives = PathElement.groupElement("maxMeshOutputPrimitives");
    public static final PathElement PATH$maxMeshOutputLayers = PathElement.groupElement("maxMeshOutputLayers");
    public static final PathElement PATH$maxMeshMultiviewViewCount = PathElement.groupElement("maxMeshMultiviewViewCount");
    public static final PathElement PATH$meshOutputPerVertexGranularity = PathElement.groupElement("meshOutputPerVertexGranularity");
    public static final PathElement PATH$meshOutputPerPrimitiveGranularity = PathElement.groupElement("meshOutputPerPrimitiveGranularity");
    public static final PathElement PATH$maxPreferredTaskWorkGroupInvocations = PathElement.groupElement("maxPreferredTaskWorkGroupInvocations");
    public static final PathElement PATH$maxPreferredMeshWorkGroupInvocations = PathElement.groupElement("maxPreferredMeshWorkGroupInvocations");
    public static final PathElement PATH$prefersLocalInvocationVertexOutput = PathElement.groupElement("prefersLocalInvocationVertexOutput");
    public static final PathElement PATH$prefersLocalInvocationPrimitiveOutput = PathElement.groupElement("prefersLocalInvocationPrimitiveOutput");
    public static final PathElement PATH$prefersCompactVertexOutput = PathElement.groupElement("prefersCompactVertexOutput");
    public static final PathElement PATH$prefersCompactPrimitiveOutput = PathElement.groupElement("prefersCompactPrimitiveOutput");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxTaskWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupTotalCount);
    public static final SequenceLayout LAYOUT$maxTaskWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxTaskWorkGroupCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxTaskWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxTaskWorkGroupSize);
    public static final OfInt LAYOUT$maxTaskPayloadSize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadSize);
    public static final OfInt LAYOUT$maxTaskSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskSharedMemorySize);
    public static final OfInt LAYOUT$maxTaskPayloadAndSharedMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskPayloadAndSharedMemorySize);
    public static final OfInt LAYOUT$maxMeshWorkGroupTotalCount = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupTotalCount);
    public static final SequenceLayout LAYOUT$maxMeshWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxMeshWorkGroupCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxMeshWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxMeshWorkGroupSize);
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
}
