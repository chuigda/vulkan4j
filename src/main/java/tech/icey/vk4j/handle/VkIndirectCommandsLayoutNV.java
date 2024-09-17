package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkIndirectCommandsLayoutNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkIndirectCommandsLayoutNVFactory implements IFactory<VkIndirectCommandsLayoutNV> {
        @Override
        public Class<VkIndirectCommandsLayoutNV> clazz() {
            return VkIndirectCommandsLayoutNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkIndirectCommandsLayoutNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkIndirectCommandsLayoutNV createUninit(MemorySegment segment) {
            return new VkIndirectCommandsLayoutNV(segment);
        }
    }

    public static final VkIndirectCommandsLayoutNVFactory FACTORY = new VkIndirectCommandsLayoutNVFactory();
}