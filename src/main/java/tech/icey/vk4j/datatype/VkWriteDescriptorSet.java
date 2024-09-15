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

public record VkWriteDescriptorSet(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorImageInfo.LAYOUT).withName("pImageInfo"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorBufferInfo.LAYOUT).withName("pBufferInfo"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pTexelBufferView")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$dstSet = PathElement.groupElement(2);
    public static final PathElement PATH$dstBinding = PathElement.groupElement(3);
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement(4);
    public static final PathElement PATH$descriptorCount = PathElement.groupElement(5);
    public static final PathElement PATH$descriptorType = PathElement.groupElement(6);
    public static final PathElement PATH$pImageInfo = PathElement.groupElement(7);
    public static final PathElement PATH$pBufferInfo = PathElement.groupElement(8);
    public static final PathElement PATH$pTexelBufferView = PathElement.groupElement(9);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$dstSet = (AddressLayout) LAYOUT.select(PATH$dstSet);
    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);
    public static final AddressLayout LAYOUT$pImageInfo = (AddressLayout) LAYOUT.select(PATH$pImageInfo);
    public static final AddressLayout LAYOUT$pBufferInfo = (AddressLayout) LAYOUT.select(PATH$pBufferInfo);
    public static final AddressLayout LAYOUT$pTexelBufferView = (AddressLayout) LAYOUT.select(PATH$pTexelBufferView);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dstSet = LAYOUT.byteOffset(PATH$dstSet);
    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$pImageInfo = LAYOUT.byteOffset(PATH$pImageInfo);
    public static final long OFFSET$pBufferInfo = LAYOUT.byteOffset(PATH$pBufferInfo);
    public static final long OFFSET$pTexelBufferView = LAYOUT.byteOffset(PATH$pTexelBufferView);

    public VkWriteDescriptorSet(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_WRITE_DESCRIPTOR_SET);
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

    public VkDescriptorSet dstSet() {
        return new VkDescriptorSet(segment.asSlice(OFFSET$dstSet, LAYOUT$dstSet));
    }

    public void dstSet(VkDescriptorSet value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSet, LAYOUT$dstSet.byteSize());
    }

    public @unsigned int dstBinding() {
        return segment.get(LAYOUT$dstBinding, OFFSET$dstBinding);
    }

    public void dstBinding(@unsigned int value) {
        segment.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);
    }

    public @unsigned int dstArrayElement() {
        return segment.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);
    }

    public void dstArrayElement(@unsigned int value) {
        segment.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @pointer(comment="VkDescriptorImageInfo*") MemorySegment pImageInfoRaw() {
        return segment.get(LAYOUT$pImageInfo, OFFSET$pImageInfo);
    }

    public void pImageInfoRaw(@pointer(comment="VkDescriptorImageInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageInfo, OFFSET$pImageInfo, value);
    }
    
    public VkDescriptorImageInfo pImageInfo() {
        MemorySegment s = pImageInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorImageInfo(s);
    }

    public void pImageInfo(VkDescriptorImageInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageInfoRaw(s);
    }

    public @pointer(comment="VkDescriptorBufferInfo*") MemorySegment pBufferInfoRaw() {
        return segment.get(LAYOUT$pBufferInfo, OFFSET$pBufferInfo);
    }

    public void pBufferInfoRaw(@pointer(comment="VkDescriptorBufferInfo*") MemorySegment value) {
        segment.set(LAYOUT$pBufferInfo, OFFSET$pBufferInfo, value);
    }
    
    public VkDescriptorBufferInfo pBufferInfo() {
        MemorySegment s = pBufferInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorBufferInfo(s);
    }

    public void pBufferInfo(VkDescriptorBufferInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferInfoRaw(s);
    }

    public @pointer(comment="VkBufferView*") MemorySegment pTexelBufferViewRaw() {
        return segment.get(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView);
    }

    public void pTexelBufferViewRaw(@pointer(comment="VkBufferView*") MemorySegment value) {
        segment.set(LAYOUT$pTexelBufferView, OFFSET$pTexelBufferView, value);
    }
    
    public VkBufferView pTexelBufferView() {
        MemorySegment s = pTexelBufferViewRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferView(s);
    }

    public void pTexelBufferView(VkBufferView value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTexelBufferViewRaw(s);
    }


    public static final class VkWriteDescriptorSetFactory implements IDataTypeFactory<VkWriteDescriptorSet> {
        @Override
        public Class<VkWriteDescriptorSet> clazz() {
            return VkWriteDescriptorSet.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkWriteDescriptorSet.LAYOUT;
        }

        @Override
        public VkWriteDescriptorSet create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkWriteDescriptorSet createUninit(MemorySegment segment) {
            return new VkWriteDescriptorSet(segment);
        }
    }

    public static final VkWriteDescriptorSetFactory FACTORY = new VkWriteDescriptorSetFactory();
}
