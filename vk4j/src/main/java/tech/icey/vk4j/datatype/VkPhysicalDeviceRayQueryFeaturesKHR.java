package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceRayQueryFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayQuery")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayQuery = PathElement.groupElement("rayQuery");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayQuery = (OfInt) LAYOUT.select(PATH$rayQuery);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayQuery = LAYOUT.byteOffset(PATH$rayQuery);

    public VkPhysicalDeviceRayQueryFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_QUERY_FEATURES_KHR);
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

    public @unsigned int rayQuery() {
        return segment.get(LAYOUT$rayQuery, OFFSET$rayQuery);
    }

    public void rayQuery(@unsigned int value) {
        segment.set(LAYOUT$rayQuery, OFFSET$rayQuery, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceRayQueryFeaturesKHR> {
        @Override
        public Class<VkPhysicalDeviceRayQueryFeaturesKHR> clazz() {
            return VkPhysicalDeviceRayQueryFeaturesKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRayQueryFeaturesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRayQueryFeaturesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRayQueryFeaturesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRayQueryFeaturesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
