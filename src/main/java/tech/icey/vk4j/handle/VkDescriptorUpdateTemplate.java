package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkDescriptorUpdateTemplate(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDescriptorUpdateTemplateFactory implements IDataTypeFactory<VkDescriptorUpdateTemplate> {
        @Override
        public Class<VkDescriptorUpdateTemplate> clazz() {
            return VkDescriptorUpdateTemplate.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDescriptorUpdateTemplate create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorUpdateTemplate createUninit(MemorySegment segment) {
            return new VkDescriptorUpdateTemplate(segment);
        }
    }

    public static final VkDescriptorUpdateTemplateFactory FACTORY = new VkDescriptorUpdateTemplateFactory();
}