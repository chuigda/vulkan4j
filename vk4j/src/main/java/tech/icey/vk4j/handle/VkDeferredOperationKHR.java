package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkDeferredOperationKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkDeferredOperationKHR> {
        @Override
        public Class<VkDeferredOperationKHR> clazz() {
            return VkDeferredOperationKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDeferredOperationKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeferredOperationKHR createUninit(MemorySegment segment) {
            return new VkDeferredOperationKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
