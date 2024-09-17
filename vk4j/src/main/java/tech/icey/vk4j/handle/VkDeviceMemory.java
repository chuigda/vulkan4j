package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDeviceMemory(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDeviceMemoryFactory implements IFactory<VkDeviceMemory> {
        @Override
        public Class<VkDeviceMemory> clazz() {
            return VkDeviceMemory.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDeviceMemory create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceMemory createUninit(MemorySegment segment) {
            return new VkDeviceMemory(segment);
        }
    }

    public static final VkDeviceMemoryFactory FACTORY = new VkDeviceMemoryFactory();
}