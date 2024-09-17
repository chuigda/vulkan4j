package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkCommandPool(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkCommandPoolFactory implements IDataTypeFactory<VkCommandPool> {
        @Override
        public Class<VkCommandPool> clazz() {
            return VkCommandPool.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCommandPool create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCommandPool createUninit(MemorySegment segment) {
            return new VkCommandPool(segment);
        }
    }

    public static final VkCommandPoolFactory FACTORY = new VkCommandPoolFactory();
}