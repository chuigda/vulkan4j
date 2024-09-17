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

public record VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stageFlags"),
        ValueLayout.ADDRESS.withName("layout"),
        ValueLayout.JAVA_INT.withName("firstSet"),
        ValueLayout.JAVA_INT.withName("setCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBufferIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pOffsets")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stageFlags = PathElement.groupElement("stageFlags");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");
    public static final PathElement PATH$firstSet = PathElement.groupElement("firstSet");
    public static final PathElement PATH$setCount = PathElement.groupElement("setCount");
    public static final PathElement PATH$pBufferIndices = PathElement.groupElement("pBufferIndices");
    public static final PathElement PATH$pOffsets = PathElement.groupElement("pOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stageFlags = (OfInt) LAYOUT.select(PATH$stageFlags);
    public static final AddressLayout LAYOUT$layout = (AddressLayout) LAYOUT.select(PATH$layout);
    public static final OfInt LAYOUT$firstSet = (OfInt) LAYOUT.select(PATH$firstSet);
    public static final OfInt LAYOUT$setCount = (OfInt) LAYOUT.select(PATH$setCount);
    public static final AddressLayout LAYOUT$pBufferIndices = (AddressLayout) LAYOUT.select(PATH$pBufferIndices);
    public static final AddressLayout LAYOUT$pOffsets = (AddressLayout) LAYOUT.select(PATH$pOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);
    public static final long OFFSET$firstSet = LAYOUT.byteOffset(PATH$firstSet);
    public static final long OFFSET$setCount = LAYOUT.byteOffset(PATH$setCount);
    public static final long OFFSET$pBufferIndices = LAYOUT.byteOffset(PATH$pBufferIndices);
    public static final long OFFSET$pOffsets = LAYOUT.byteOffset(PATH$pOffsets);

    public VkSetDescriptorBufferOffsetsInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SET_DESCRIPTOR_BUFFER_OFFSETS_INFO_EXT);
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

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public VkPipelineLayout layout() {
        return new VkPipelineLayout(segment.asSlice(OFFSET$layout, LAYOUT$layout));
    }

    public void layout(VkPipelineLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layout, LAYOUT$layout.byteSize());
    }

    public @unsigned int firstSet() {
        return segment.get(LAYOUT$firstSet, OFFSET$firstSet);
    }

    public void firstSet(@unsigned int value) {
        segment.set(LAYOUT$firstSet, OFFSET$firstSet, value);
    }

    public @unsigned int setCount() {
        return segment.get(LAYOUT$setCount, OFFSET$setCount);
    }

    public void setCount(@unsigned int value) {
        segment.set(LAYOUT$setCount, OFFSET$setCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pBufferIndicesRaw() {
        return segment.get(LAYOUT$pBufferIndices, OFFSET$pBufferIndices);
    }

    public void pBufferIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pBufferIndices, OFFSET$pBufferIndices, value);
    }
    
    public @unsigned IntPtr pBufferIndices() {
        return new IntPtr(pBufferIndicesRaw());
    }

    public void pBufferIndices(@unsigned IntPtr value) {
        pBufferIndicesRaw(value.segment());
    }

    public @pointer(comment="uint64_t*") MemorySegment pOffsetsRaw() {
        return segment.get(LAYOUT$pOffsets, OFFSET$pOffsets);
    }

    public void pOffsetsRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pOffsets, OFFSET$pOffsets, value);
    }
    
    public @unsigned LongPtr pOffsets() {
        return new LongPtr(pOffsetsRaw());
    }

    public void pOffsets(@unsigned LongPtr value) {
        pOffsetsRaw(value.segment());
    }


    public static final class VkSetDescriptorBufferOffsetsInfoEXTFactory implements IDataTypeFactory<VkSetDescriptorBufferOffsetsInfoEXT> {
        @Override
        public Class<VkSetDescriptorBufferOffsetsInfoEXT> clazz() {
            return VkSetDescriptorBufferOffsetsInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSetDescriptorBufferOffsetsInfoEXT.LAYOUT;
        }

        @Override
        public VkSetDescriptorBufferOffsetsInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSetDescriptorBufferOffsetsInfoEXT createUninit(MemorySegment segment) {
            return new VkSetDescriptorBufferOffsetsInfoEXT(segment);
        }
    }

    public static final VkSetDescriptorBufferOffsetsInfoEXTFactory FACTORY = new VkSetDescriptorBufferOffsetsInfoEXTFactory();
}
