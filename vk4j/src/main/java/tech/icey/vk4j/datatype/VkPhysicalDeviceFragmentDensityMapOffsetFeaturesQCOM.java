package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapOffset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityMapOffset = PathElement.groupElement("fragmentDensityMapOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityMapOffset = (OfInt) LAYOUT.select(PATH$fragmentDensityMapOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMapOffset = LAYOUT.byteOffset(PATH$fragmentDensityMapOffset);

    public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_FEATURES_QCOM);
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

    public @unsigned int fragmentDensityMapOffset() {
        return segment.get(LAYOUT$fragmentDensityMapOffset, OFFSET$fragmentDensityMapOffset);
    }

    public void fragmentDensityMapOffset(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapOffset, OFFSET$fragmentDensityMapOffset, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM> {
        @Override
        public Class<VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM> clazz() {
            return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentDensityMapOffsetFeaturesQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
