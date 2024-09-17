package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkPhysicalDevice(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkPhysicalDeviceFactory implements IDataTypeFactory<VkPhysicalDevice> {
        @Override
        public Class<VkPhysicalDevice> clazz() {
            return VkPhysicalDevice.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkPhysicalDevice create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDevice createUninit(MemorySegment segment) {
            return new VkPhysicalDevice(segment);
        }
    }

    public static final VkPhysicalDeviceFactory FACTORY = new VkPhysicalDeviceFactory();
}