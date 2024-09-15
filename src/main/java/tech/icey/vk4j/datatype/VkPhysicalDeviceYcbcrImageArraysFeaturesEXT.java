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

public record VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrImageArrays")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$ycbcrImageArrays = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$ycbcrImageArrays = (OfInt) LAYOUT.select(PATH$ycbcrImageArrays);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcrImageArrays = LAYOUT.byteOffset(PATH$ycbcrImageArrays);

    public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_IMAGE_ARRAYS_FEATURES_EXT);
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

    public @unsigned int ycbcrImageArrays() {
        return segment.get(LAYOUT$ycbcrImageArrays, OFFSET$ycbcrImageArrays);
    }

    public void ycbcrImageArrays(@unsigned int value) {
        segment.set(LAYOUT$ycbcrImageArrays, OFFSET$ycbcrImageArrays, value);
    }


    public static final class VkPhysicalDeviceYcbcrImageArraysFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceYcbcrImageArraysFeaturesEXT> clazz() {
            return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceYcbcrImageArraysFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceYcbcrImageArraysFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceYcbcrImageArraysFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceYcbcrImageArraysFeaturesEXTFactory FACTORY = new VkPhysicalDeviceYcbcrImageArraysFeaturesEXTFactory();
}
