package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkImage(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkImage> {
        @Override
        public Class<VkImage> clazz() {
            return VkImage.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkImage create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImage createUninit(MemorySegment segment) {
            return new VkImage(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
