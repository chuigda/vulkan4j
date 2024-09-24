package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSamplerYcbcrConversionInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("conversion")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$conversion = PathElement.groupElement("conversion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$conversion = (AddressLayout) LAYOUT.select(PATH$conversion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conversion = LAYOUT.byteOffset(PATH$conversion);

    public VkSamplerYcbcrConversionInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_INFO);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkSamplerYcbcrConversion conversion() {
        return new VkSamplerYcbcrConversion(segment.asSlice(OFFSET$conversion, LAYOUT$conversion));
    }

    public void conversion(VkSamplerYcbcrConversion value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$conversion, LAYOUT$conversion.byteSize());
    }


    public static final class Factory implements IFactory<VkSamplerYcbcrConversionInfo> {
        @Override
        public Class<VkSamplerYcbcrConversionInfo> clazz() {
            return VkSamplerYcbcrConversionInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSamplerYcbcrConversionInfo.LAYOUT;
        }

        @Override
        public VkSamplerYcbcrConversionInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSamplerYcbcrConversionInfo createUninit(MemorySegment segment) {
            return new VkSamplerYcbcrConversionInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
