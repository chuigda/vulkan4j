package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkQueue(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkQueueFactory implements IFactory<VkQueue> {
        @Override
        public Class<VkQueue> clazz() {
            return VkQueue.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkQueue create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkQueue createUninit(MemorySegment segment) {
            return new VkQueue(segment);
        }
    }

    public static final VkQueueFactory FACTORY = new VkQueueFactory();
}