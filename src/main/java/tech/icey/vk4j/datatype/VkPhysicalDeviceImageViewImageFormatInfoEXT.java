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

public record VkPhysicalDeviceImageViewImageFormatInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageViewType")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$imageViewType = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageViewType = (OfInt) LAYOUT.select(PATH$imageViewType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageViewType = LAYOUT.byteOffset(PATH$imageViewType);

    public VkPhysicalDeviceImageViewImageFormatInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_VIEW_IMAGE_FORMAT_INFO_EXT);
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

    public @enumtype(VkImageViewType.class) int imageViewType() {
        return segment.get(LAYOUT$imageViewType, OFFSET$imageViewType);
    }

    public void imageViewType(@enumtype(VkImageViewType.class) int value) {
        segment.set(LAYOUT$imageViewType, OFFSET$imageViewType, value);
    }


    public static final class VkPhysicalDeviceImageViewImageFormatInfoEXTFactory implements IDataTypeFactory<VkPhysicalDeviceImageViewImageFormatInfoEXT> {
        @Override
        public Class<VkPhysicalDeviceImageViewImageFormatInfoEXT> clazz() {
            return VkPhysicalDeviceImageViewImageFormatInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageViewImageFormatInfoEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageViewImageFormatInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceImageViewImageFormatInfoEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageViewImageFormatInfoEXT(segment);
        }
    }

    public static final VkPhysicalDeviceImageViewImageFormatInfoEXTFactory FACTORY = new VkPhysicalDeviceImageViewImageFormatInfoEXTFactory();
}