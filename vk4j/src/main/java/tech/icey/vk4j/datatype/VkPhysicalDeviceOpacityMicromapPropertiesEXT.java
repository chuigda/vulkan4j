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

public record VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel"),
        ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxOpacity2StateSubdivisionLevel = PathElement.groupElement("maxOpacity2StateSubdivisionLevel");
    public static final PathElement PATH$maxOpacity4StateSubdivisionLevel = PathElement.groupElement("maxOpacity4StateSubdivisionLevel");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxOpacity2StateSubdivisionLevel = (OfInt) LAYOUT.select(PATH$maxOpacity2StateSubdivisionLevel);
    public static final OfInt LAYOUT$maxOpacity4StateSubdivisionLevel = (OfInt) LAYOUT.select(PATH$maxOpacity4StateSubdivisionLevel);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxOpacity2StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity2StateSubdivisionLevel);
    public static final long OFFSET$maxOpacity4StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity4StateSubdivisionLevel);

    public VkPhysicalDeviceOpacityMicromapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_PROPERTIES_EXT);
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

    public @unsigned int maxOpacity2StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel);
    }

    public void maxOpacity2StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel, value);
    }

    public @unsigned int maxOpacity4StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel);
    }

    public void maxOpacity4StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceOpacityMicromapPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceOpacityMicromapPropertiesEXT> clazz() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceOpacityMicromapPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceOpacityMicromapPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
