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

public record VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("formatRgba10x6WithoutYCbCrSampler")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatRgba10x6WithoutYCbCrSampler = PathElement.groupElement("formatRgba10x6WithoutYCbCrSampler");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$formatRgba10x6WithoutYCbCrSampler = (OfInt) LAYOUT.select(PATH$formatRgba10x6WithoutYCbCrSampler);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatRgba10x6WithoutYCbCrSampler = LAYOUT.byteOffset(PATH$formatRgba10x6WithoutYCbCrSampler);

    public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RGBA10X6_FORMATS_FEATURES_EXT);
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

    public @unsigned int formatRgba10x6WithoutYCbCrSampler() {
        return segment.get(LAYOUT$formatRgba10x6WithoutYCbCrSampler, OFFSET$formatRgba10x6WithoutYCbCrSampler);
    }

    public void formatRgba10x6WithoutYCbCrSampler(@unsigned int value) {
        segment.set(LAYOUT$formatRgba10x6WithoutYCbCrSampler, OFFSET$formatRgba10x6WithoutYCbCrSampler, value);
    }


    public static final class VkPhysicalDeviceRGBA10X6FormatsFeaturesEXTFactory implements IFactory<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT> clazz() {
            return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceRGBA10X6FormatsFeaturesEXTFactory FACTORY = new VkPhysicalDeviceRGBA10X6FormatsFeaturesEXTFactory();
}
