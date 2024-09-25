package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkValidationCacheEXT(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkValidationCacheEXT> {
        @Override
        public Class<VkValidationCacheEXT> clazz() {
            return VkValidationCacheEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkValidationCacheEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkValidationCacheEXT createUninit(MemorySegment segment) {
            return new VkValidationCacheEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
