package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkVideoSessionKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkVideoSessionKHRFactory implements IFactory<VkVideoSessionKHR> {
        @Override
        public Class<VkVideoSessionKHR> clazz() {
            return VkVideoSessionKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkVideoSessionKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkVideoSessionKHR createUninit(MemorySegment segment) {
            return new VkVideoSessionKHR(segment);
        }
    }

    public static final VkVideoSessionKHRFactory FACTORY = new VkVideoSessionKHRFactory();
}