package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkAccelerationStructureNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkAccelerationStructureNVFactory implements IDataTypeFactory<VkAccelerationStructureNV> {
        @Override
        public Class<VkAccelerationStructureNV> clazz() {
            return VkAccelerationStructureNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkAccelerationStructureNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureNV(segment);
        }
    }

    public static final VkAccelerationStructureNVFactory FACTORY = new VkAccelerationStructureNVFactory();
}