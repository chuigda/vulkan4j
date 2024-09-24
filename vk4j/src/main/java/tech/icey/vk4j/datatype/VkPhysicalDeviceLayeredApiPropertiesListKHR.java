package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("layeredApiCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceLayeredApiPropertiesKHR.LAYOUT).withName("pLayeredApis")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$layeredApiCount = PathElement.groupElement("layeredApiCount");
    public static final PathElement PATH$pLayeredApis = PathElement.groupElement("pLayeredApis");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$layeredApiCount = (OfInt) LAYOUT.select(PATH$layeredApiCount);
    public static final AddressLayout LAYOUT$pLayeredApis = (AddressLayout) LAYOUT.select(PATH$pLayeredApis);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$layeredApiCount = LAYOUT.byteOffset(PATH$layeredApiCount);
    public static final long OFFSET$pLayeredApis = LAYOUT.byteOffset(PATH$pLayeredApis);

    public VkPhysicalDeviceLayeredApiPropertiesListKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_LAYERED_API_PROPERTIES_LIST_KHR);
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

    public @unsigned int layeredApiCount() {
        return segment.get(LAYOUT$layeredApiCount, OFFSET$layeredApiCount);
    }

    public void layeredApiCount(@unsigned int value) {
        segment.set(LAYOUT$layeredApiCount, OFFSET$layeredApiCount, value);
    }

    public @pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment pLayeredApisRaw() {
        return segment.get(LAYOUT$pLayeredApis, OFFSET$pLayeredApis);
    }

    public void pLayeredApisRaw(@pointer(comment="VkPhysicalDeviceLayeredApiPropertiesKHR*") MemorySegment value) {
        segment.set(LAYOUT$pLayeredApis, OFFSET$pLayeredApis, value);
    }

    public @nullable VkPhysicalDeviceLayeredApiPropertiesKHR pLayeredApis() {
        MemorySegment s = pLayeredApisRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDeviceLayeredApiPropertiesKHR(s);
    }

    public void pLayeredApis(@nullable VkPhysicalDeviceLayeredApiPropertiesKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLayeredApisRaw(s);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceLayeredApiPropertiesListKHR> {
        @Override
        public Class<VkPhysicalDeviceLayeredApiPropertiesListKHR> clazz() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceLayeredApiPropertiesListKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceLayeredApiPropertiesListKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceLayeredApiPropertiesListKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceLayeredApiPropertiesListKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
