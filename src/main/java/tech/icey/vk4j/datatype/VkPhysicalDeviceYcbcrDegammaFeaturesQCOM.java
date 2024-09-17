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

public record VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("ycbcrDegamma")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$ycbcrDegamma = PathElement.groupElement("ycbcrDegamma");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$ycbcrDegamma = (OfInt) LAYOUT.select(PATH$ycbcrDegamma);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ycbcrDegamma = LAYOUT.byteOffset(PATH$ycbcrDegamma);

    public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_YCBCR_DEGAMMA_FEATURES_QCOM);
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

    public @unsigned int ycbcrDegamma() {
        return segment.get(LAYOUT$ycbcrDegamma, OFFSET$ycbcrDegamma);
    }

    public void ycbcrDegamma(@unsigned int value) {
        segment.set(LAYOUT$ycbcrDegamma, OFFSET$ycbcrDegamma, value);
    }


    public static final class VkPhysicalDeviceYcbcrDegammaFeaturesQCOMFactory implements IFactory<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceYcbcrDegammaFeaturesQCOM> clazz() {
            return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceYcbcrDegammaFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceYcbcrDegammaFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceYcbcrDegammaFeaturesQCOM(segment);
        }
    }

    public static final VkPhysicalDeviceYcbcrDegammaFeaturesQCOMFactory FACTORY = new VkPhysicalDeviceYcbcrDegammaFeaturesQCOMFactory();
}
