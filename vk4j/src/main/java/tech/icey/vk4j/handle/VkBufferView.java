package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkBufferView(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkBufferViewFactory implements IFactory<VkBufferView> {
        @Override
        public Class<VkBufferView> clazz() {
            return VkBufferView.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkBufferView create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBufferView createUninit(MemorySegment segment) {
            return new VkBufferView(segment);
        }
    }

    public static final VkBufferViewFactory FACTORY = new VkBufferViewFactory();
}