package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkPipelineBinaryKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkPipelineBinaryKHRFactory implements IFactory<VkPipelineBinaryKHR> {
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

    public static final VkPipelineBinaryKHRFactory FACTORY = new VkPipelineBinaryKHRFactory();
}