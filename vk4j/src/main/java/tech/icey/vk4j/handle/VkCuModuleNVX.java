package tech.icey.vk4j.handle;

import tech.icey.vk4j.IFactory;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public record VkCuModuleNVX(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class Factory implements IFactory<VkCuModuleNVX> {
        @Override
        public Class<VkCuModuleNVX> clazz() {
            return VkCuModuleNVX.class;
        }

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkCuModuleNVX create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCuModuleNVX createUninit(MemorySegment segment) {
            return new VkCuModuleNVX(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
