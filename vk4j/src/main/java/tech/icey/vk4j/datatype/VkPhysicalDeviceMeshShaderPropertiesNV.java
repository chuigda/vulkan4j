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

public record VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxDrawMeshTasksCount"),
        ValueLayout.JAVA_INT.withName("maxTaskWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxTaskWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxTaskTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxTaskOutputCount"),
        ValueLayout.JAVA_INT.withName("maxMeshWorkGroupInvocations"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxMeshWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxMeshTotalMemorySize"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputVertices"),
        ValueLayout.JAVA_INT.withName("maxMeshOutputPrimitives"),
        ValueLayout.JAVA_INT.withName("maxMeshMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("meshOutputPerVertexGranularity"),
        ValueLayout.JAVA_INT.withName("meshOutputPerPrimitiveGranularity")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxDrawMeshTasksCount = PathElement.groupElement("maxDrawMeshTasksCount");
    public static final PathElement PATH$maxTaskWorkGroupInvocations = PathElement.groupElement("maxTaskWorkGroupInvocations");
    public static final PathElement PATH$maxTaskWorkGroupSize = PathElement.groupElement("maxTaskWorkGroupSize");
    public static final PathElement PATH$maxTaskTotalMemorySize = PathElement.groupElement("maxTaskTotalMemorySize");
    public static final PathElement PATH$maxTaskOutputCount = PathElement.groupElement("maxTaskOutputCount");
    public static final PathElement PATH$maxMeshWorkGroupInvocations = PathElement.groupElement("maxMeshWorkGroupInvocations");
    public static final PathElement PATH$maxMeshWorkGroupSize = PathElement.groupElement("maxMeshWorkGroupSize");
    public static final PathElement PATH$maxMeshTotalMemorySize = PathElement.groupElement("maxMeshTotalMemorySize");
    public static final PathElement PATH$maxMeshOutputVertices = PathElement.groupElement("maxMeshOutputVertices");
    public static final PathElement PATH$maxMeshOutputPrimitives = PathElement.groupElement("maxMeshOutputPrimitives");
    public static final PathElement PATH$maxMeshMultiviewViewCount = PathElement.groupElement("maxMeshMultiviewViewCount");
    public static final PathElement PATH$meshOutputPerVertexGranularity = PathElement.groupElement("meshOutputPerVertexGranularity");
    public static final PathElement PATH$meshOutputPerPrimitiveGranularity = PathElement.groupElement("meshOutputPerPrimitiveGranularity");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxDrawMeshTasksCount = (OfInt) LAYOUT.select(PATH$maxDrawMeshTasksCount);
    public static final OfInt LAYOUT$maxTaskWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxTaskWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxTaskWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxTaskWorkGroupSize);
    public static final OfInt LAYOUT$maxTaskTotalMemorySize = (OfInt) LAYOUT.select(PATH$maxTaskTotalMemorySize);
    public static final OfInt LAYOUT$maxTaskOutputCount = (OfInt) LAYOUT.select(PATH$maxTaskOutputCount);
    public static final OfInt LAYOUT$maxMeshWorkGroupInvocations = (OfInt) LAYOUT.select(PATH$maxMeshWorkGroupInvocations);
    public static final SequenceLayout LAYOUT$maxMeshWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxMeshWorkGroupSize);
    public static final OfInt LAYOUT$maxMeshTotalMemorySize = (OfInt) LAYOUT.select(PATH$maxMeshTotalMemorySize);
    public static final OfInt LAYOUT$maxMeshOutputVertices = (OfInt) LAYOUT.select(PATH$maxMeshOutputVertices);
    public static final OfInt LAYOUT$maxMeshOutputPrimitives = (OfInt) LAYOUT.select(PATH$maxMeshOutputPrimitives);
    public static final OfInt LAYOUT$maxMeshMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMeshMultiviewViewCount);
    public static final OfInt LAYOUT$meshOutputPerVertexGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerVertexGranularity);
    public static final OfInt LAYOUT$meshOutputPerPrimitiveGranularity = (OfInt) LAYOUT.select(PATH$meshOutputPerPrimitiveGranularity);

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

    public VkPhysicalDeviceMeshShaderPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_PROPERTIES_NV);
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

    public MemorySegment maxTaskWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize.byteSize());
    }

    public @unsigned IntArray maxTaskWorkGroupSize() {
        return new IntArray(maxTaskWorkGroupSizeRaw(), LAYOUT$maxTaskWorkGroupSize.elementCount());
    }

    public void maxTaskWorkGroupSize(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxTaskWorkGroupSize, LAYOUT$maxTaskWorkGroupSize.byteSize());
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

    public MemorySegment maxMeshWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize.byteSize());
    }

    public @unsigned IntArray maxMeshWorkGroupSize() {
        return new IntArray(maxMeshWorkGroupSizeRaw(), LAYOUT$maxMeshWorkGroupSize.elementCount());
    }

    public void maxMeshWorkGroupSize(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxMeshWorkGroupSize, LAYOUT$maxMeshWorkGroupSize.byteSize());
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


    public static final class VkPhysicalDeviceMeshShaderPropertiesNVFactory implements IFactory<VkPhysicalDeviceMeshShaderPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceMeshShaderPropertiesNV> clazz() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMeshShaderPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMeshShaderPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMeshShaderPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMeshShaderPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceMeshShaderPropertiesNVFactory FACTORY = new VkPhysicalDeviceMeshShaderPropertiesNVFactory();
}