package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDescriptorSet(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDescriptorSetFactory implements IFactory<VkDescriptorSet> {
        @Override
        public Class<VkDescriptorSet> clazz() {
            return VkDescriptorSet.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDescriptorSet create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorSet createUninit(MemorySegment segment) {
            return new VkDescriptorSet(segment);
        }
    }

    public static final VkDescriptorSetFactory FACTORY = new VkDescriptorSetFactory();
}