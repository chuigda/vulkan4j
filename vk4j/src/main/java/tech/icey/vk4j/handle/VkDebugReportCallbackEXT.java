package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkDebugReportCallbackEXT(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkDebugReportCallbackEXTFactory implements IFactory<VkDebugReportCallbackEXT> {
        @Override
        public Class<VkDebugReportCallbackEXT> clazz() {
            return VkDebugReportCallbackEXT.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkDebugReportCallbackEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDebugReportCallbackEXT createUninit(MemorySegment segment) {
            return new VkDebugReportCallbackEXT(segment);
        }
    }

    public static final VkDebugReportCallbackEXTFactory FACTORY = new VkDebugReportCallbackEXTFactory();
}