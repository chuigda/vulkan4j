package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkAccelerationStructureKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkAccelerationStructureKHR> {
        @Override
        public Class<VkAccelerationStructureKHR> clazz() {
            return VkAccelerationStructureKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkAccelerationStructureKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}