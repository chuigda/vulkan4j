package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkPipelineBinaryKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkPipelineBinaryKHR> {
        @Override
        public Class<VkPipelineBinaryKHR> clazz() {
            return VkPipelineBinaryKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPipelineBinaryKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineBinaryKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
