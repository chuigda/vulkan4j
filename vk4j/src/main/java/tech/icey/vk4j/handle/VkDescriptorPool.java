package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDescriptorPool(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDescriptorPoolFactory implements IFactory<VkDescriptorPool> {
        @Override
        public Class<VkDescriptorPool> clazz() {
            return VkDescriptorPool.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDescriptorPool create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorPool createUninit(MemorySegment segment) {
            return new VkDescriptorPool(segment);
        }
    }

    public static final VkDescriptorPoolFactory FACTORY = new VkDescriptorPoolFactory();
}