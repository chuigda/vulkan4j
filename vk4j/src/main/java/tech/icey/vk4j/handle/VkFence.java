package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkFence(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkFence> {
        @Override
        public Class<VkFence> clazz() {
            return VkFence.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkFence create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkFence createUninit(MemorySegment segment) {
            return new VkFence(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
