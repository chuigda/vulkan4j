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

public record VkPhysicalDeviceHostImageCopyFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("hostImageCopy")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$hostImageCopy = PathElement.groupElement("hostImageCopy");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$hostImageCopy = (OfInt) LAYOUT.select(PATH$hostImageCopy);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hostImageCopy = LAYOUT.byteOffset(PATH$hostImageCopy);

    public VkPhysicalDeviceHostImageCopyFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_HOST_IMAGE_COPY_FEATURES_EXT);
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

    public @unsigned int hostImageCopy() {
        return segment.get(LAYOUT$hostImageCopy, OFFSET$hostImageCopy);
    }

    public void hostImageCopy(@unsigned int value) {
        segment.set(LAYOUT$hostImageCopy, OFFSET$hostImageCopy, value);
    }


    public static final class VkPhysicalDeviceHostImageCopyFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceHostImageCopyFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceHostImageCopyFeaturesEXT> clazz() {
            return VkPhysicalDeviceHostImageCopyFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceHostImageCopyFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceHostImageCopyFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceHostImageCopyFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceHostImageCopyFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceHostImageCopyFeaturesEXTFactory FACTORY = new VkPhysicalDeviceHostImageCopyFeaturesEXTFactory();
}
