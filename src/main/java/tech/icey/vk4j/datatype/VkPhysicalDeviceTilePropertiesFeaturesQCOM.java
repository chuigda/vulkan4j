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

public record VkPhysicalDeviceTilePropertiesFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("tileProperties")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$tileProperties = PathElement.groupElement(2);

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


    public static final class VkPhysicalDeviceTilePropertiesFeaturesQCOMFactory implements IDataTypeFactory<VkPhysicalDeviceTilePropertiesFeaturesQCOM> {
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

    public static final VkPhysicalDeviceTilePropertiesFeaturesQCOMFactory FACTORY = new VkPhysicalDeviceTilePropertiesFeaturesQCOMFactory();
}