package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkPipeline(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkPipelineFactory implements IFactory<VkPipeline> {
        @Override
        public Class<VkPipeline> clazz() {
            return VkPipeline.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPipeline create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipeline createUninit(MemorySegment segment) {
            return new VkPipeline(segment);
        }
    }

    public static final VkPipelineFactory FACTORY = new VkPipelineFactory();
}