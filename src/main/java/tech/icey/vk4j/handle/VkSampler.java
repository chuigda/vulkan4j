package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkSampler(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkSamplerFactory implements IDataTypeFactory<VkSampler> {
        @Override
        public Class<VkSampler> clazz() {
            return VkSampler.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSampler create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSampler createUninit(MemorySegment segment) {
            return new VkSampler(segment);
        }
    }

    public static final VkSamplerFactory FACTORY = new VkSamplerFactory();
}