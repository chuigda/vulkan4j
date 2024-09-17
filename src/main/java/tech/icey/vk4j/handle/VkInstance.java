package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkInstance(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkInstanceFactory implements IFactory<VkInstance> {
        @Override
        public Class<VkInstance> clazz() {
            return VkInstance.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkInstance create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkInstance createUninit(MemorySegment segment) {
            return new VkInstance(segment);
        }
    }

    public static final VkInstanceFactory FACTORY = new VkInstanceFactory();
}