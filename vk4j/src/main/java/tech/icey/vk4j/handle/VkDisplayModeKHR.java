package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDisplayModeKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDisplayModeKHRFactory implements IFactory<VkDisplayModeKHR> {
        @Override
        public Class<VkDisplayModeKHR> clazz() {
            return VkDisplayModeKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDisplayModeKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayModeKHR createUninit(MemorySegment segment) {
            return new VkDisplayModeKHR(segment);
        }
    }

    public static final VkDisplayModeKHRFactory FACTORY = new VkDisplayModeKHRFactory();
}