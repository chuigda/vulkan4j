package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IFactory;

public record VkOpticalFlowSessionNV(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkOpticalFlowSessionNVFactory implements IFactory<VkOpticalFlowSessionNV> {
        @Override
        public Class<VkOpticalFlowSessionNV> clazz() {
            return VkOpticalFlowSessionNV.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkOpticalFlowSessionNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOpticalFlowSessionNV createUninit(MemorySegment segment) {
            return new VkOpticalFlowSessionNV(segment);
        }
    }

    public static final VkOpticalFlowSessionNVFactory FACTORY = new VkOpticalFlowSessionNVFactory();
}