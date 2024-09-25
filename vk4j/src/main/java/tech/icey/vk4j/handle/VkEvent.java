package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkEvent(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkEvent> {
        @Override
        public Class<VkEvent> clazz() {
            return VkEvent.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkEvent create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkEvent createUninit(MemorySegment segment) {
            return new VkEvent(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
