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

public record VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicRangeClamp")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$cubicRangeClamp = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cubicRangeClamp = (OfInt) LAYOUT.select(PATH$cubicRangeClamp);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cubicRangeClamp = LAYOUT.byteOffset(PATH$cubicRangeClamp);

    public VkPhysicalDeviceCubicClampFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUBIC_CLAMP_FEATURES_QCOM);
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

    public @unsigned int cubicRangeClamp() {
        return segment.get(LAYOUT$cubicRangeClamp, OFFSET$cubicRangeClamp);
    }

    public void cubicRangeClamp(@unsigned int value) {
        segment.set(LAYOUT$cubicRangeClamp, OFFSET$cubicRangeClamp, value);
    }


    public static final class VkPhysicalDeviceCubicClampFeaturesQCOMFactory implements IDataTypeFactory<VkPhysicalDeviceCubicClampFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceCubicClampFeaturesQCOM> clazz() {
            return VkPhysicalDeviceCubicClampFeaturesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCubicClampFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCubicClampFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceCubicClampFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCubicClampFeaturesQCOM(segment);
        }
    }

    public static final VkPhysicalDeviceCubicClampFeaturesQCOMFactory FACTORY = new VkPhysicalDeviceCubicClampFeaturesQCOMFactory();
}
