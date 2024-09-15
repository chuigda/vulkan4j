package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("enableYDegamma"),
        ValueLayout.JAVA_INT.withName("enableCbCrDegamma")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$enableYDegamma = PathElement.groupElement(2);
    public static final PathElement PATH$enableCbCrDegamma = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$enableYDegamma = (OfInt) LAYOUT.select(PATH$enableYDegamma);
    public static final OfInt LAYOUT$enableCbCrDegamma = (OfInt) LAYOUT.select(PATH$enableCbCrDegamma);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$enableYDegamma = LAYOUT.byteOffset(PATH$enableYDegamma);
    public static final long OFFSET$enableCbCrDegamma = LAYOUT.byteOffset(PATH$enableCbCrDegamma);

    public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_YCBCR_DEGAMMA_CREATE_INFO_QCOM);
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

    public @unsigned int enableYDegamma() {
        return segment.get(LAYOUT$enableYDegamma, OFFSET$enableYDegamma);
    }

    public void enableYDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableYDegamma, OFFSET$enableYDegamma, value);
    }

    public @unsigned int enableCbCrDegamma() {
        return segment.get(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma);
    }

    public void enableCbCrDegamma(@unsigned int value) {
        segment.set(LAYOUT$enableCbCrDegamma, OFFSET$enableCbCrDegamma, value);
    }


    public static final class VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOMFactory implements IDataTypeFactory<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> {
        @Override
        public Class<VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM> clazz() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM.LAYOUT;
        }

        @Override
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM createUninit(MemorySegment segment) {
            return new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOM(segment);
        }
    }

    public static final VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOMFactory FACTORY = new VkSamplerYcbcrConversionYcbcrDegammaCreateInfoQCOMFactory();
}
