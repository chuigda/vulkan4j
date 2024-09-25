package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkDisplayKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkDisplayKHR> {
        @Override
        public Class<VkDisplayKHR> clazz() {
            return VkDisplayKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDisplayKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayKHR createUninit(MemorySegment segment) {
            return new VkDisplayKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
