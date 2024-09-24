package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDevice(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkDevice> {
        @Override
        public Class<VkDevice> clazz() {
            return VkDevice.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDevice create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDevice createUninit(MemorySegment segment) {
            return new VkDevice(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}