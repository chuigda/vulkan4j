package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDisplayKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDisplayKHRFactory implements IFactory<VkDisplayKHR> {
        @Override
        public Class<VkDisplayKHR> clazz() {
            return VkDisplayKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDisplayKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayKHR createUninit(MemorySegment segment) {
            return new VkDisplayKHR(segment);
        }
    }

    public static final VkDisplayKHRFactory FACTORY = new VkDisplayKHRFactory();
}