package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkSwapchainKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkSwapchainKHR> {
        @Override
        public Class<VkSwapchainKHR> clazz() {
            return VkSwapchainKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSwapchainKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSwapchainKHR createUninit(MemorySegment segment) {
            return new VkSwapchainKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}