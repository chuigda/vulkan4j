package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkMicromapEXT(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkMicromapEXTFactory implements IFactory<VkMicromapEXT> {
        @Override
        public Class<VkMicromapEXT> clazz() {
            return VkMicromapEXT.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkMicromapEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMicromapEXT createUninit(MemorySegment segment) {
            return new VkMicromapEXT(segment);
        }
    }

    public static final VkMicromapEXTFactory FACTORY = new VkMicromapEXTFactory();
}