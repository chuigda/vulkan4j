package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkFramebuffer(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkFramebufferFactory implements IFactory<VkFramebuffer> {
        @Override
        public Class<VkFramebuffer> clazz() {
            return VkFramebuffer.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkFramebuffer create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkFramebuffer createUninit(MemorySegment segment) {
            return new VkFramebuffer(segment);
        }
    }

    public static final VkFramebufferFactory FACTORY = new VkFramebufferFactory();
}