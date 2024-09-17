package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkShaderModule(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkShaderModuleFactory implements IDataTypeFactory<VkShaderModule> {
        @Override
        public Class<VkShaderModule> clazz() {
            return VkShaderModule.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkShaderModule create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkShaderModule createUninit(MemorySegment segment) {
            return new VkShaderModule(segment);
        }
    }

    public static final VkShaderModuleFactory FACTORY = new VkShaderModuleFactory();
}