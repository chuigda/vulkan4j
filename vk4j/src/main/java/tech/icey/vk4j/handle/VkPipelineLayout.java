package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkPipelineLayout(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkPipelineLayout> {
        @Override
        public Class<VkPipelineLayout> clazz() {
            return VkPipelineLayout.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPipelineLayout create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineLayout createUninit(MemorySegment segment) {
            return new VkPipelineLayout(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}