package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkSemaphore(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkSemaphore> {
        @Override
        public Class<VkSemaphore> clazz() {
            return VkSemaphore.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSemaphore create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSemaphore createUninit(MemorySegment segment) {
            return new VkSemaphore(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
