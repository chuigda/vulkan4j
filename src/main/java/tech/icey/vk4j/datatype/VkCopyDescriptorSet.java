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

public record VkCopyDescriptorSet(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcSet"),
        ValueLayout.JAVA_INT.withName("srcBinding"),
        ValueLayout.JAVA_INT.withName("srcArrayElement"),
        ValueLayout.ADDRESS.withName("dstSet"),
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$srcSet = PathElement.groupElement(2);
    public static final PathElement PATH$srcBinding = PathElement.groupElement(3);
    public static final PathElement PATH$srcArrayElement = PathElement.groupElement(4);
    public static final PathElement PATH$dstSet = PathElement.groupElement(5);
    public static final PathElement PATH$dstBinding = PathElement.groupElement(6);
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement(7);
    public static final PathElement PATH$descriptorCount = PathElement.groupElement(8);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$srcSet = (AddressLayout) LAYOUT.select(PATH$srcSet);
    public static final OfInt LAYOUT$srcBinding = (OfInt) LAYOUT.select(PATH$srcBinding);
    public static final OfInt LAYOUT$srcArrayElement = (OfInt) LAYOUT.select(PATH$srcArrayElement);
    public static final AddressLayout LAYOUT$dstSet = (AddressLayout) LAYOUT.select(PATH$dstSet);
    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcSet = LAYOUT.byteOffset(PATH$srcSet);
    public static final long OFFSET$srcBinding = LAYOUT.byteOffset(PATH$srcBinding);
    public static final long OFFSET$srcArrayElement = LAYOUT.byteOffset(PATH$srcArrayElement);
    public static final long OFFSET$dstSet = LAYOUT.byteOffset(PATH$dstSet);
    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);

    public VkCopyDescriptorSet(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_DESCRIPTOR_SET);
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

    public VkDescriptorSet srcSet() {
        return new VkDescriptorSet(segment.asSlice(OFFSET$srcSet, LAYOUT$srcSet));
    }

    public void srcSet(VkDescriptorSet value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSet, LAYOUT$srcSet.byteSize());
    }

    public @unsigned int srcBinding() {
        return segment.get(LAYOUT$srcBinding, OFFSET$srcBinding);
    }

    public void srcBinding(@unsigned int value) {
        segment.set(LAYOUT$srcBinding, OFFSET$srcBinding, value);
    }

    public @unsigned int srcArrayElement() {
        return segment.get(LAYOUT$srcArrayElement, OFFSET$srcArrayElement);
    }

    public void srcArrayElement(@unsigned int value) {
        segment.set(LAYOUT$srcArrayElement, OFFSET$srcArrayElement, value);
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


    public static final class VkCopyDescriptorSetFactory implements IDataTypeFactory<VkCopyDescriptorSet> {
        @Override
        public Class<VkCopyDescriptorSet> clazz() {
            return VkCopyDescriptorSet.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCopyDescriptorSet.LAYOUT;
        }

        @Override
        public VkCopyDescriptorSet create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCopyDescriptorSet createUninit(MemorySegment segment) {
            return new VkCopyDescriptorSet(segment);
        }
    }

    public static final VkCopyDescriptorSetFactory FACTORY = new VkCopyDescriptorSetFactory();
}