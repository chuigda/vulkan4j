package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkSemaphoreSciSyncPoolNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkSemaphoreSciSyncPoolNVFactory implements IFactory<VkSemaphoreSciSyncPoolNV> {
        @Override
        public Class<VkSemaphoreSciSyncPoolNV> clazz() {
            return VkSemaphoreSciSyncPoolNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSemaphoreSciSyncPoolNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSemaphoreSciSyncPoolNV createUninit(MemorySegment segment) {
            return new VkSemaphoreSciSyncPoolNV(segment);
        }
    }

    public static final VkSemaphoreSciSyncPoolNVFactory FACTORY = new VkSemaphoreSciSyncPoolNVFactory();
}