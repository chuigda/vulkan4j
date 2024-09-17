package tech.icey.vk4j.handle;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import tech.icey.vk4j.IDataTypeFactory;

public record VkSamplerYcbcrConversion(MemorySegment segment) {
    public MemorySegment handle() {
        return segment.get(ValueLayout.ADDRESS, 0);
    }

    public static final class VkSamplerYcbcrConversionFactory implements IDataTypeFactory<VkSamplerYcbcrConversion> {
        @Override
        public Class<VkSamplerYcbcrConversion> clazz() {
            return VkSamplerYcbcrConversion.class;
        }        

        @Override
        public MemoryLayout layout() {
            return ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS);
        }

        @Override
        public VkSamplerYcbcrConversion create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSamplerYcbcrConversion createUninit(MemorySegment segment) {
            return new VkSamplerYcbcrConversion(segment);
        }
    }

    public static final VkSamplerYcbcrConversionFactory FACTORY = new VkSamplerYcbcrConversionFactory();
}