package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkBuffer(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkBufferFactory implements IFactory<VkBuffer> {
        @Override
        public Class<VkBuffer> clazz() {
            return VkBuffer.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkBuffer create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBuffer createUninit(MemorySegment segment) {
            return new VkBuffer(segment);
        }
    }

    public static final VkBufferFactory FACTORY = new VkBufferFactory();
}