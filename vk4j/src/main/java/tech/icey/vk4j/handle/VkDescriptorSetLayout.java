package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDescriptorSetLayout(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkDescriptorSetLayout> {
        @Override
        public Class<VkDescriptorSetLayout> clazz() {
            return VkDescriptorSetLayout.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDescriptorSetLayout create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorSetLayout createUninit(MemorySegment segment) {
            return new VkDescriptorSetLayout(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}