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

public record VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("textureBlockMatch2")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$textureBlockMatch2 = PathElement.groupElement("textureBlockMatch2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$textureBlockMatch2 = (OfInt) LAYOUT.select(PATH$textureBlockMatch2);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$textureBlockMatch2 = LAYOUT.byteOffset(PATH$textureBlockMatch2);

    public VkPhysicalDeviceImageProcessing2FeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_IMAGE_PROCESSING_2_FEATURES_QCOM);
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

    public @unsigned int textureBlockMatch2() {
        return segment.get(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2);
    }

    public void textureBlockMatch2(@unsigned int value) {
        segment.set(LAYOUT$textureBlockMatch2, OFFSET$textureBlockMatch2, value);
    }


    public static final class VkPhysicalDeviceImageProcessing2FeaturesQCOMFactory implements IFactory<VkPhysicalDeviceImageProcessing2FeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceImageProcessing2FeaturesQCOM> clazz() {
            return VkPhysicalDeviceImageProcessing2FeaturesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceImageProcessing2FeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceImageProcessing2FeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceImageProcessing2FeaturesQCOM(segment);
        }
    }

    public static final VkPhysicalDeviceImageProcessing2FeaturesQCOMFactory FACTORY = new VkPhysicalDeviceImageProcessing2FeaturesQCOMFactory();
}
