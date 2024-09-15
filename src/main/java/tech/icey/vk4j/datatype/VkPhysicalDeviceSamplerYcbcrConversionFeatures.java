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

public record VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("samplerYcbcrConversion")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$samplerYcbcrConversion = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$samplerYcbcrConversion = (OfInt) LAYOUT.select(PATH$samplerYcbcrConversion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$samplerYcbcrConversion = LAYOUT.byteOffset(PATH$samplerYcbcrConversion);

    public VkPhysicalDeviceSamplerYcbcrConversionFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLER_YCBCR_CONVERSION_FEATURES);
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

    public @unsigned int samplerYcbcrConversion() {
        return segment.get(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion);
    }

    public void samplerYcbcrConversion(@unsigned int value) {
        segment.set(LAYOUT$samplerYcbcrConversion, OFFSET$samplerYcbcrConversion, value);
    }


    public static final class VkPhysicalDeviceSamplerYcbcrConversionFeaturesFactory implements IDataTypeFactory<VkPhysicalDeviceSamplerYcbcrConversionFeatures> {
        @Override
        public Class<VkPhysicalDeviceSamplerYcbcrConversionFeatures> clazz() {
            return VkPhysicalDeviceSamplerYcbcrConversionFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSamplerYcbcrConversionFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSamplerYcbcrConversionFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSamplerYcbcrConversionFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceSamplerYcbcrConversionFeaturesFactory FACTORY = new VkPhysicalDeviceSamplerYcbcrConversionFeaturesFactory();
}
