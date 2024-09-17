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

public record VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcr2plane444Formats")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$ycbcr2plane444Formats = PathElement.groupElement("ycbcr2plane444Formats");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$ycbcr2plane444Formats = (OfInt) LAYOUT.select(PATH$ycbcr2plane444Formats);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcr2plane444Formats = LAYOUT.byteOffset(PATH$ycbcr2plane444Formats);

    public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_2_PLANE_444_FORMATS_FEATURES_EXT);
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

    public @unsigned int ycbcr2plane444Formats() {
        return segment.get(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats);
    }

    public void ycbcr2plane444Formats(@unsigned int value) {
        segment.set(LAYOUT$ycbcr2plane444Formats, OFFSET$ycbcr2plane444Formats, value);
    }


    public static final class VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT> clazz() {
            return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXTFactory FACTORY = new VkPhysicalDeviceYcbcr2Plane444FormatsFeaturesEXTFactory();
}
