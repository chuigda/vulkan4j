package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkImageView(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkImageView> {
        @Override
        public Class<VkImageView> clazz() {
            return VkImageView.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkImageView create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageView createUninit(MemorySegment segment) {
            return new VkImageView(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
