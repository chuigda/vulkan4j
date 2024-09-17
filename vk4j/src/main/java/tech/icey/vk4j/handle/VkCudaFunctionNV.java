package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkCudaFunctionNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkCudaFunctionNVFactory implements IFactory<VkCudaFunctionNV> {
        @Override
        public Class<VkCudaFunctionNV> clazz() {
            return VkCudaFunctionNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCudaFunctionNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCudaFunctionNV createUninit(MemorySegment segment) {
            return new VkCudaFunctionNV(segment);
        }
    }

    public static final VkCudaFunctionNVFactory FACTORY = new VkCudaFunctionNVFactory();
}