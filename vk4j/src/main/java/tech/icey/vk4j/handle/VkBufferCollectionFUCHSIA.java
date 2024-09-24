package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkBufferCollectionFUCHSIA(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkBufferCollectionFUCHSIA> {
        @Override
        public Class<VkBufferCollectionFUCHSIA> clazz() {
            return VkBufferCollectionFUCHSIA.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkBufferCollectionFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBufferCollectionFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferCollectionFUCHSIA(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}