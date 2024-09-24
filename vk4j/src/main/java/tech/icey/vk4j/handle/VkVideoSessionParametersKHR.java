package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkVideoSessionParametersKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkVideoSessionParametersKHR> {
        @Override
        public Class<VkVideoSessionParametersKHR> clazz() {
            return VkVideoSessionParametersKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkVideoSessionParametersKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkVideoSessionParametersKHR createUninit(MemorySegment segment) {
            return new VkVideoSessionParametersKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}