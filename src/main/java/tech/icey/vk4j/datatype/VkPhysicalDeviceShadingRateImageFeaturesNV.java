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

public record VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImage"),
        ValueLayout.JAVA_INT.withName("shadingRateCoarseSampleOrder")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$shadingRateImage = PathElement.groupElement(2);
    public static final PathElement PATH$shadingRateCoarseSampleOrder = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateImage = (OfInt) LAYOUT.select(PATH$shadingRateImage);
    public static final OfInt LAYOUT$shadingRateCoarseSampleOrder = (OfInt) LAYOUT.select(PATH$shadingRateCoarseSampleOrder);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateImage = LAYOUT.byteOffset(PATH$shadingRateImage);
    public static final long OFFSET$shadingRateCoarseSampleOrder = LAYOUT.byteOffset(PATH$shadingRateCoarseSampleOrder);

    public VkPhysicalDeviceShadingRateImageFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_FEATURES_NV);
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

    public @unsigned int shadingRateImage() {
        return segment.get(LAYOUT$shadingRateImage, OFFSET$shadingRateImage);
    }

    public void shadingRateImage(@unsigned int value) {
        segment.set(LAYOUT$shadingRateImage, OFFSET$shadingRateImage, value);
    }

    public @unsigned int shadingRateCoarseSampleOrder() {
        return segment.get(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder);
    }

    public void shadingRateCoarseSampleOrder(@unsigned int value) {
        segment.set(LAYOUT$shadingRateCoarseSampleOrder, OFFSET$shadingRateCoarseSampleOrder, value);
    }


    public static final class VkPhysicalDeviceShadingRateImageFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceShadingRateImageFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceShadingRateImageFeaturesNV> clazz() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShadingRateImageFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShadingRateImageFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShadingRateImageFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShadingRateImageFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceShadingRateImageFeaturesNVFactory FACTORY = new VkPhysicalDeviceShadingRateImageFeaturesNVFactory();
}
