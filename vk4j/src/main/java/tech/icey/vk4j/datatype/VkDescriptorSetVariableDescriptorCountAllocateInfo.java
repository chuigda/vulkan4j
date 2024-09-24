package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDescriptorSetVariableDescriptorCountAllocateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDescriptorCounts")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetCount = PathElement.groupElement("descriptorSetCount");
    public static final PathElement PATH$pDescriptorCounts = PathElement.groupElement("pDescriptorCounts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSetCount = (OfInt) LAYOUT.select(PATH$descriptorSetCount);
    public static final AddressLayout LAYOUT$pDescriptorCounts = (AddressLayout) LAYOUT.select(PATH$pDescriptorCounts);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetCount = LAYOUT.byteOffset(PATH$descriptorSetCount);
    public static final long OFFSET$pDescriptorCounts = LAYOUT.byteOffset(PATH$pDescriptorCounts);

    public VkDescriptorSetVariableDescriptorCountAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_SET_VARIABLE_DESCRIPTOR_COUNT_ALLOCATE_INFO);
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

    public @unsigned int descriptorSetCount() {
        return segment.get(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount);
    }

    public void descriptorSetCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetCount, OFFSET$descriptorSetCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDescriptorCountsRaw() {
        return segment.get(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts);
    }

    public void pDescriptorCountsRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorCounts, OFFSET$pDescriptorCounts, value);
    }

    public @unsigned IntPtr pDescriptorCounts() {
        return new IntPtr(pDescriptorCountsRaw());
    }

    public void pDescriptorCounts(@unsigned IntPtr value) {
        pDescriptorCountsRaw(value.segment());
    }


    public static final class Factory implements IFactory<VkDescriptorSetVariableDescriptorCountAllocateInfo> {
        @Override
        public Class<VkDescriptorSetVariableDescriptorCountAllocateInfo> clazz() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDescriptorSetVariableDescriptorCountAllocateInfo.LAYOUT;
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorSetVariableDescriptorCountAllocateInfo createUninit(MemorySegment segment) {
            return new VkDescriptorSetVariableDescriptorCountAllocateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
