package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkCudaModuleNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkCudaModuleNVFactory implements IFactory<VkCudaModuleNV> {
        @Override
        public Class<VkCudaModuleNV> clazz() {
            return VkCudaModuleNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCudaModuleNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCudaModuleNV createUninit(MemorySegment segment) {
            return new VkCudaModuleNV(segment);
        }
    }

    public static final VkCudaModuleNVFactory FACTORY = new VkCudaModuleNVFactory();
}