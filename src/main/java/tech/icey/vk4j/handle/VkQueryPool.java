package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkQueryPool(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkQueryPoolFactory implements IDataTypeFactory<VkQueryPool> {
        @Override
        public Class<VkQueryPool> clazz() {
            return VkQueryPool.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkQueryPool create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkQueryPool createUninit(MemorySegment segment) {
            return new VkQueryPool(segment);
        }
    }

    public static final VkQueryPoolFactory FACTORY = new VkQueryPoolFactory();
}