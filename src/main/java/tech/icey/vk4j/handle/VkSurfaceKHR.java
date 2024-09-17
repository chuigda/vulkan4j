package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkSurfaceKHR(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkSurfaceKHRFactory implements IDataTypeFactory<VkSurfaceKHR> {
        @Override
        public Class<VkSurfaceKHR> clazz() {
            return VkSurfaceKHR.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSurfaceKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceKHR createUninit(MemorySegment segment) {
            return new VkSurfaceKHR(segment);
        }
    }

    public static final VkSurfaceKHRFactory FACTORY = new VkSurfaceKHRFactory();
}