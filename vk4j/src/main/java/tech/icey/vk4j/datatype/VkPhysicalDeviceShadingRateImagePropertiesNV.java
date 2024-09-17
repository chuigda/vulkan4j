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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("shadingRateTexelSize"),
        ValueLayout.JAVA_INT.withName("shadingRatePaletteSize"),
        ValueLayout.JAVA_INT.withName("shadingRateMaxCoarseSamples")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateTexelSize = PathElement.groupElement("shadingRateTexelSize");
    public static final PathElement PATH$shadingRatePaletteSize = PathElement.groupElement("shadingRatePaletteSize");
    public static final PathElement PATH$shadingRateMaxCoarseSamples = PathElement.groupElement("shadingRateMaxCoarseSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$shadingRateTexelSize = (StructLayout) LAYOUT.select(PATH$shadingRateTexelSize);
    public static final OfInt LAYOUT$shadingRatePaletteSize = (OfInt) LAYOUT.select(PATH$shadingRatePaletteSize);
    public static final OfInt LAYOUT$shadingRateMaxCoarseSamples = (OfInt) LAYOUT.select(PATH$shadingRateMaxCoarseSamples);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateTexelSize = LAYOUT.byteOffset(PATH$shadingRateTexelSize);
    public static final long OFFSET$shadingRatePaletteSize = LAYOUT.byteOffset(PATH$shadingRatePaletteSize);
    public static final long OFFSET$shadingRateMaxCoarseSamples = LAYOUT.byteOffset(PATH$shadingRateMaxCoarseSamples);

    public VkPhysicalDeviceShadingRateImagePropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADING_RATE_IMAGE_PROPERTIES_NV);
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

    public VkExtent2D shadingRateTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize));
    }

    public void shadingRateTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateTexelSize, LAYOUT$shadingRateTexelSize.byteSize());
    }

    public @unsigned int shadingRatePaletteSize() {
        return segment.get(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize);
    }

    public void shadingRatePaletteSize(@unsigned int value) {
        segment.set(LAYOUT$shadingRatePaletteSize, OFFSET$shadingRatePaletteSize, value);
    }

    public @unsigned int shadingRateMaxCoarseSamples() {
        return segment.get(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples);
    }

    public void shadingRateMaxCoarseSamples(@unsigned int value) {
        segment.set(LAYOUT$shadingRateMaxCoarseSamples, OFFSET$shadingRateMaxCoarseSamples, value);
    }


    public static final class VkPhysicalDeviceShadingRateImagePropertiesNVFactory implements IFactory<VkPhysicalDeviceShadingRateImagePropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceShadingRateImagePropertiesNV> clazz() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceShadingRateImagePropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceShadingRateImagePropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceShadingRateImagePropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceShadingRateImagePropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceShadingRateImagePropertiesNVFactory FACTORY = new VkPhysicalDeviceShadingRateImagePropertiesNVFactory();
}
