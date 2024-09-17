package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkPrivateDataSlot(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkPrivateDataSlotFactory implements IFactory<VkPrivateDataSlot> {
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

    public static final VkPrivateDataSlotFactory FACTORY = new VkPrivateDataSlotFactory();
}