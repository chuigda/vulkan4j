package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkPerformanceConfigurationINTEL(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkPerformanceConfigurationINTEL> {
        @Override
        public Class<VkPerformanceConfigurationINTEL> clazz() {
            return VkPerformanceConfigurationINTEL.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPerformanceConfigurationINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceConfigurationINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceConfigurationINTEL(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}