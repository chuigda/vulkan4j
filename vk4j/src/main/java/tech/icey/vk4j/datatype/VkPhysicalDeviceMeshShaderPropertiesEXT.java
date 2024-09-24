package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMeshShaderPropertiesEXT(MemorySegment segment) {
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

    public @unsigned int maxTaskWorkGroupTotalCount() {
        return segment.get(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount);
    }

    public void maxTaskWorkGroupTotalCount(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupTotalCount, OFFSET$maxTaskWorkGroupTotalCount, value);
    }

    public MemorySegment maxTaskWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupCount, LAYOUT$maxTaskWorkGroupCount.byteSize());
    }

    public @unsigned IntArray maxTaskWorkGroupCount() {
        return new IntArray(maxTaskWorkGroupCountRaw(), LAYOUT$maxTaskWorkGroupCount.elementCount());
    }

    public void maxTaskWorkGroupCount(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupCount, LAYOUT$maxTaskWorkGroupCount.byteSize());
    }

    public @unsigned int maxTaskWorkGroupInvocations() {
        return segment.get(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations);
    }

    public void maxTaskWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxTaskWorkGroupInvocations, OFFSET$maxTaskWorkGroupInvocations, value);
    }

    public MemorySegment maxTaskWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize.byteSize());
    }

    public @unsigned IntArray maxTaskWorkGroupSize() {
        return new IntArray(maxTaskWorkGroupSizeRaw(), LAYOUT$maxTaskWorkGroupSize.elementCount());
    }

    public void maxTaskWorkGroupSize(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize.byteSize());
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
        return segment.asSlice(OFFSET$maxMeshWorkGroupCount, LAYOUT$maxMeshWorkGroupCount.byteSize());
    }

    public @unsigned IntArray maxMeshWorkGroupCount() {
        return new IntArray(maxMeshWorkGroupCountRaw(), LAYOUT$maxMeshWorkGroupCount.elementCount());
    }

    public void maxMeshWorkGroupCount(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupCount, LAYOUT$maxMeshWorkGroupCount.byteSize());
    }

    public @unsigned int maxMeshWorkGroupInvocations() {
        return segment.get(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations);
    }

    public void maxMeshWorkGroupInvocations(@unsigned int value) {
        segment.set(LAYOUT$maxMeshWorkGroupInvocations, OFFSET$maxMeshWorkGroupInvocations, value);
    }

    public MemorySegment maxMeshWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize.byteSize());
    }

    public @unsigned IntArray maxMeshWorkGroupSize() {
        return new IntArray(maxMeshWorkGroupSizeRaw(), LAYOUT$maxMeshWorkGroupSize.elementCount());
    }

    public void maxMeshWorkGroupSize(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize.byteSize());
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


    public static final class VkPhysicalDeviceMeshShaderPropertiesEXTFactory implements IFactory<VkPhysicalDeviceMeshShaderPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceMeshShaderPropertiesEXT> clazz() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMeshShaderPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMeshShaderPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMeshShaderPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMeshShaderPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceMeshShaderPropertiesEXTFactory FACTORY = new VkPhysicalDeviceMeshShaderPropertiesEXTFactory();
}
