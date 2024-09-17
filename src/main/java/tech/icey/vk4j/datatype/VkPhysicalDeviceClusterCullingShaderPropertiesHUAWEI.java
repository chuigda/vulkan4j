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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupCount"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("maxWorkGroupSize"),
        ValueLayout.JAVA_INT.withName("maxOutputClusterCount"),
        ValueLayout.JAVA_LONG.withName("indirectBufferOffsetAlignment")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxWorkGroupCount = PathElement.groupElement("maxWorkGroupCount");
    public static final PathElement PATH$maxWorkGroupSize = PathElement.groupElement("maxWorkGroupSize");
    public static final PathElement PATH$maxOutputClusterCount = PathElement.groupElement("maxOutputClusterCount");
    public static final PathElement PATH$indirectBufferOffsetAlignment = PathElement.groupElement("indirectBufferOffsetAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$maxWorkGroupCount = (SequenceLayout) LAYOUT.select(PATH$maxWorkGroupCount);
    public static final SequenceLayout LAYOUT$maxWorkGroupSize = (SequenceLayout) LAYOUT.select(PATH$maxWorkGroupSize);
    public static final OfInt LAYOUT$maxOutputClusterCount = (OfInt) LAYOUT.select(PATH$maxOutputClusterCount);
    public static final OfLong LAYOUT$indirectBufferOffsetAlignment = (OfLong) LAYOUT.select(PATH$indirectBufferOffsetAlignment);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxWorkGroupCount = LAYOUT.byteOffset(PATH$maxWorkGroupCount);
    public static final long OFFSET$maxWorkGroupSize = LAYOUT.byteOffset(PATH$maxWorkGroupSize);
    public static final long OFFSET$maxOutputClusterCount = LAYOUT.byteOffset(PATH$maxOutputClusterCount);
    public static final long OFFSET$indirectBufferOffsetAlignment = LAYOUT.byteOffset(PATH$indirectBufferOffsetAlignment);

    public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_PROPERTIES_HUAWEI);
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

    public MemorySegment maxWorkGroupCountRaw() {
        return segment.asSlice(OFFSET$maxWorkGroupCount, LAYOUT$maxWorkGroupCount.byteSize());
    }

    public @unsigned IntArray maxWorkGroupCount() {
        return new IntArray(maxWorkGroupCountRaw(), LAYOUT$maxWorkGroupCount.elementCount());
    }

    public void maxWorkGroupCount(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxWorkGroupCount, LAYOUT$maxWorkGroupCount.byteSize());
    }

    public MemorySegment maxWorkGroupSizeRaw() {
        return segment.asSlice(OFFSET$maxWorkGroupSize, LAYOUT$maxWorkGroupSize.byteSize());
    }

    public @unsigned IntArray maxWorkGroupSize() {
        return new IntArray(maxWorkGroupSizeRaw(), LAYOUT$maxWorkGroupSize.elementCount());
    }

    public void maxWorkGroupSize(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxWorkGroupSize, LAYOUT$maxWorkGroupSize.byteSize());
    }

    public @unsigned int maxOutputClusterCount() {
        return segment.get(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount);
    }

    public void maxOutputClusterCount(@unsigned int value) {
        segment.set(LAYOUT$maxOutputClusterCount, OFFSET$maxOutputClusterCount, value);
    }

    public @unsigned long indirectBufferOffsetAlignment() {
        return segment.get(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment);
    }

    public void indirectBufferOffsetAlignment(@unsigned long value) {
        segment.set(LAYOUT$indirectBufferOffsetAlignment, OFFSET$indirectBufferOffsetAlignment, value);
    }


    public static final class VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEIFactory implements IDataTypeFactory<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> {
        @Override
        public Class<VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI> clazz() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEI(segment);
        }
    }

    public static final VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEIFactory FACTORY = new VkPhysicalDeviceClusterCullingShaderPropertiesHUAWEIFactory();
}
