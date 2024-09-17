package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkDebugUtilsMessengerEXT(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDebugUtilsMessengerEXTFactory implements IDataTypeFactory<VkDebugUtilsMessengerEXT> {
        @Override
        public Class<VkDebugUtilsMessengerEXT> clazz() {
            return VkDebugUtilsMessengerEXT.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDebugUtilsMessengerEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDebugUtilsMessengerEXT createUninit(MemorySegment segment) {
            return new VkDebugUtilsMessengerEXT(segment);
        }
    }

    public static final VkDebugUtilsMessengerEXTFactory FACTORY = new VkDebugUtilsMessengerEXTFactory();
}