package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$tileProperties = PathElement.groupElement("tileProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$tileProperties = (OfInt) LAYOUT.select(PATH$tileProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileProperties = LAYOUT.byteOffset(PATH$tileProperties);

    public VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TILE_PROPERTIES_FEATURES_QCOM);
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

    public @unsigned int tileProperties() {
        return segment.get(LAYOUT$tileProperties, OFFSET$tileProperties);
    }

    public void tileProperties(@unsigned int value) {
        segment.set(LAYOUT$tileProperties, OFFSET$tileProperties, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceTilePropertiesFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceTilePropertiesFeaturesQCOM> clazz() {
            return VkPhysicalDeviceTilePropertiesFeaturesQCOM.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceTilePropertiesFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceTilePropertiesFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
