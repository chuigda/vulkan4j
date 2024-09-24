package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMap"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapDynamic"),
        ValueLayout.JAVA_INT.withName("fragmentDensityMapNonSubsampledImages")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityMap = PathElement.groupElement("fragmentDensityMap");
    public static final PathElement PATH$fragmentDensityMapDynamic = PathElement.groupElement("fragmentDensityMapDynamic");
    public static final PathElement PATH$fragmentDensityMapNonSubsampledImages = PathElement.groupElement("fragmentDensityMapNonSubsampledImages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityMap = (OfInt) LAYOUT.select(PATH$fragmentDensityMap);
    public static final OfInt LAYOUT$fragmentDensityMapDynamic = (OfInt) LAYOUT.select(PATH$fragmentDensityMapDynamic);
    public static final OfInt LAYOUT$fragmentDensityMapNonSubsampledImages = (OfInt) LAYOUT.select(PATH$fragmentDensityMapNonSubsampledImages);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityMap = LAYOUT.byteOffset(PATH$fragmentDensityMap);
    public static final long OFFSET$fragmentDensityMapDynamic = LAYOUT.byteOffset(PATH$fragmentDensityMapDynamic);
    public static final long OFFSET$fragmentDensityMapNonSubsampledImages = LAYOUT.byteOffset(PATH$fragmentDensityMapNonSubsampledImages);

    public VkPhysicalDeviceFragmentDensityMapFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_FEATURES_EXT);
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

    public @unsigned int fragmentDensityMap() {
        return segment.get(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap);
    }

    public void fragmentDensityMap(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMap, OFFSET$fragmentDensityMap, value);
    }

    public @unsigned int fragmentDensityMapDynamic() {
        return segment.get(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic);
    }

    public void fragmentDensityMapDynamic(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapDynamic, OFFSET$fragmentDensityMapDynamic, value);
    }

    public @unsigned int fragmentDensityMapNonSubsampledImages() {
        return segment.get(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages);
    }

    public void fragmentDensityMapNonSubsampledImages(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityMapNonSubsampledImages, OFFSET$fragmentDensityMapNonSubsampledImages, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceFragmentDensityMapFeaturesEXT> clazz() {
            return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentDensityMapFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMapFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentDensityMapFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
