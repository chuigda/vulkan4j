package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkCommandBuffer(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkCommandBuffer> {
        @Override
        public Class<VkCommandBuffer> clazz() {
            return VkCommandBuffer.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCommandBuffer create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCommandBuffer createUninit(MemorySegment segment) {
            return new VkCommandBuffer(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
