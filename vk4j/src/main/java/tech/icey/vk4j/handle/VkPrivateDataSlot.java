package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkPrivateDataSlot(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkPrivateDataSlot> {
        @Override
        public Class<VkPrivateDataSlot> clazz() {
            return VkPrivateDataSlot.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPrivateDataSlot create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPrivateDataSlot createUninit(MemorySegment segment) {
            return new VkPrivateDataSlot(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
