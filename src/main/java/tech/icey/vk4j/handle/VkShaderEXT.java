package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkShaderEXT(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkShaderEXTFactory implements IDataTypeFactory<VkShaderEXT> {
        @Override
        public Class<VkShaderEXT> clazz() {
            return VkShaderEXT.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkShaderEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkShaderEXT createUninit(MemorySegment segment) {
            return new VkShaderEXT(segment);
        }
    }

    public static final VkShaderEXTFactory FACTORY = new VkShaderEXTFactory();
}