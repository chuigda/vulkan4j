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

public record VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("descriptorUpdateEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkDescriptorUpdateTemplateEntry.LAYOUT).withName("pDescriptorUpdateEntries"),
        ValueLayout.JAVA_INT.withName("templateType"),
        ValueLayout.ADDRESS.withName("descriptorSetLayout"),
        ValueLayout.JAVA_INT.withName("pipelineBindPoint"),
        ValueLayout.ADDRESS.withName("pipelineLayout"),
        ValueLayout.JAVA_INT.withName("set")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$descriptorUpdateEntryCount = PathElement.groupElement("descriptorUpdateEntryCount");
    public static final PathElement PATH$pDescriptorUpdateEntries = PathElement.groupElement("pDescriptorUpdateEntries");
    public static final PathElement PATH$templateType = PathElement.groupElement("templateType");
    public static final PathElement PATH$descriptorSetLayout = PathElement.groupElement("descriptorSetLayout");
    public static final PathElement PATH$pipelineBindPoint = PathElement.groupElement("pipelineBindPoint");
    public static final PathElement PATH$pipelineLayout = PathElement.groupElement("pipelineLayout");
    public static final PathElement PATH$set = PathElement.groupElement("set");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$descriptorUpdateEntryCount = (OfInt) LAYOUT.select(PATH$descriptorUpdateEntryCount);
    public static final AddressLayout LAYOUT$pDescriptorUpdateEntries = (AddressLayout) LAYOUT.select(PATH$pDescriptorUpdateEntries);
    public static final OfInt LAYOUT$templateType = (OfInt) LAYOUT.select(PATH$templateType);
    public static final AddressLayout LAYOUT$descriptorSetLayout = (AddressLayout) LAYOUT.select(PATH$descriptorSetLayout);
    public static final OfInt LAYOUT$pipelineBindPoint = (OfInt) LAYOUT.select(PATH$pipelineBindPoint);
    public static final AddressLayout LAYOUT$pipelineLayout = (AddressLayout) LAYOUT.select(PATH$pipelineLayout);
    public static final OfInt LAYOUT$set = (OfInt) LAYOUT.select(PATH$set);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$descriptorUpdateEntryCount = LAYOUT.byteOffset(PATH$descriptorUpdateEntryCount);
    public static final long OFFSET$pDescriptorUpdateEntries = LAYOUT.byteOffset(PATH$pDescriptorUpdateEntries);
    public static final long OFFSET$templateType = LAYOUT.byteOffset(PATH$templateType);
    public static final long OFFSET$descriptorSetLayout = LAYOUT.byteOffset(PATH$descriptorSetLayout);
    public static final long OFFSET$pipelineBindPoint = LAYOUT.byteOffset(PATH$pipelineBindPoint);
    public static final long OFFSET$pipelineLayout = LAYOUT.byteOffset(PATH$pipelineLayout);
    public static final long OFFSET$set = LAYOUT.byteOffset(PATH$set);

    public VkDescriptorUpdateTemplateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_CREATE_INFO);
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

    public @enumtype(VkDescriptorUpdateTemplateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDescriptorUpdateTemplateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int descriptorUpdateEntryCount() {
        return segment.get(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount);
    }

    public void descriptorUpdateEntryCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorUpdateEntryCount, OFFSET$descriptorUpdateEntryCount, value);
    }

    public @pointer(comment="VkDescriptorUpdateTemplateEntry*") MemorySegment pDescriptorUpdateEntriesRaw() {
        return segment.get(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries);
    }

    public void pDescriptorUpdateEntriesRaw(@pointer(comment="VkDescriptorUpdateTemplateEntry*") MemorySegment value) {
        segment.set(LAYOUT$pDescriptorUpdateEntries, OFFSET$pDescriptorUpdateEntries, value);
    }
    
    public @nullable VkDescriptorUpdateTemplateEntry pDescriptorUpdateEntries() {
        MemorySegment s = pDescriptorUpdateEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkDescriptorUpdateTemplateEntry(s);
    }

    public void pDescriptorUpdateEntries(@nullable VkDescriptorUpdateTemplateEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDescriptorUpdateEntriesRaw(s);
    }

    public @enumtype(VkDescriptorUpdateTemplateType.class) int templateType() {
        return segment.get(LAYOUT$templateType, OFFSET$templateType);
    }

    public void templateType(@enumtype(VkDescriptorUpdateTemplateType.class) int value) {
        segment.set(LAYOUT$templateType, OFFSET$templateType, value);
    }

    public VkDescriptorSetLayout descriptorSetLayout() {
        return new VkDescriptorSetLayout(segment.asSlice(OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout));
    }

    public void descriptorSetLayout(VkDescriptorSetLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$descriptorSetLayout, LAYOUT$descriptorSetLayout.byteSize());
    }

    public @enumtype(VkPipelineBindPoint.class) int pipelineBindPoint() {
        return segment.get(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint);
    }

    public void pipelineBindPoint(@enumtype(VkPipelineBindPoint.class) int value) {
        segment.set(LAYOUT$pipelineBindPoint, OFFSET$pipelineBindPoint, value);
    }

    public VkPipelineLayout pipelineLayout() {
        return new VkPipelineLayout(segment.asSlice(OFFSET$pipelineLayout, LAYOUT$pipelineLayout));
    }

    public void pipelineLayout(VkPipelineLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineLayout, LAYOUT$pipelineLayout.byteSize());
    }

    public @unsigned int set() {
        return segment.get(LAYOUT$set, OFFSET$set);
    }

    public void set(@unsigned int value) {
        segment.set(LAYOUT$set, OFFSET$set, value);
    }


    public static final class VkDescriptorUpdateTemplateCreateInfoFactory implements IFactory<VkDescriptorUpdateTemplateCreateInfo> {
        @Override
        public Class<VkDescriptorUpdateTemplateCreateInfo> clazz() {
            return VkDescriptorUpdateTemplateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorUpdateTemplateCreateInfo.LAYOUT;
        }

        @Override
        public VkDescriptorUpdateTemplateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorUpdateTemplateCreateInfo createUninit(MemorySegment segment) {
            return new VkDescriptorUpdateTemplateCreateInfo(segment);
        }
    }

    public static final VkDescriptorUpdateTemplateCreateInfoFactory FACTORY = new VkDescriptorUpdateTemplateCreateInfoFactory();
}
