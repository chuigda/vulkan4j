package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkCuFunctionNVX(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkCuFunctionNVXFactory implements IDataTypeFactory<VkCuFunctionNVX> {
        @Override
        public Class<VkCuFunctionNVX> clazz() {
            return VkCuFunctionNVX.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCuFunctionNVX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCuFunctionNVX createUninit(MemorySegment segment) {
            return new VkCuFunctionNVX(segment);
        }
    }

    public static final VkCuFunctionNVXFactory FACTORY = new VkCuFunctionNVXFactory();
}