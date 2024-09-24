package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkRenderPass(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkRenderPass> {
        @Override
        public Class<VkRenderPass> clazz() {
            return VkRenderPass.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkRenderPass create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRenderPass createUninit(MemorySegment segment) {
            return new VkRenderPass(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}