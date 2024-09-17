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

public record VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("imageCompressionControl")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageCompressionControl = PathElement.groupElement("imageCompressionControl");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$imageCompressionControl = (OfInt) LAYOUT.select(PATH$imageCompressionControl);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCompressionControl = LAYOUT.byteOffset(PATH$imageCompressionControl);

    public VkPhysicalDeviceImageCompressionControlFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_COMPRESSION_CONTROL_FEATURES_EXT);
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

    public @unsigned int imageCompressionControl() {
        return segment.get(LAYOUT$imageCompressionControl, OFFSET$imageCompressionControl);
    }

    public void imageCompressionControl(@unsigned int value) {
        segment.set(LAYOUT$imageCompressionControl, OFFSET$imageCompressionControl, value);
    }


    public static final class VkPhysicalDeviceImageCompressionControlFeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceImageCompressionControlFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceImageCompressionControlFeaturesEXT> clazz() {
            return VkPhysicalDeviceImageCompressionControlFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageCompressionControlFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceImageCompressionControlFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageCompressionControlFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceImageCompressionControlFeaturesEXTFactory FACTORY = new VkPhysicalDeviceImageCompressionControlFeaturesEXTFactory();
}
