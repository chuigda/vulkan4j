package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkPipelineCache(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkPipelineCache> {
        @Override
        public Class<VkPipelineCache> clazz() {
            return VkPipelineCache.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPipelineCache create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineCache createUninit(MemorySegment segment) {
            return new VkPipelineCache(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
