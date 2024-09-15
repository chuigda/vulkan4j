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

public record VkPhysicalDeviceLegacyDitheringFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("legacyDithering")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$legacyDithering = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$legacyDithering = (OfInt) LAYOUT.select(PATH$legacyDithering);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$legacyDithering = LAYOUT.byteOffset(PATH$legacyDithering);

    public VkPhysicalDeviceLegacyDitheringFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LEGACY_DITHERING_FEATURES_EXT);
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

    public @unsigned int legacyDithering() {
        return segment.get(LAYOUT$legacyDithering, OFFSET$legacyDithering);
    }

    public void legacyDithering(@unsigned int value) {
        segment.set(LAYOUT$legacyDithering, OFFSET$legacyDithering, value);
    }


    public static final class VkPhysicalDeviceLegacyDitheringFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceLegacyDitheringFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceLegacyDitheringFeaturesEXT> clazz() {
            return VkPhysicalDeviceLegacyDitheringFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceLegacyDitheringFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceLegacyDitheringFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceLegacyDitheringFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceLegacyDitheringFeaturesEXTFactory FACTORY = new VkPhysicalDeviceLegacyDitheringFeaturesEXTFactory();
}
