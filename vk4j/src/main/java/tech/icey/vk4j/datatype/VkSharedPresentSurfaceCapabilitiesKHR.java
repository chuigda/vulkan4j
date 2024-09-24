package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSharedPresentSurfaceCapabilitiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sharedPresentSupportedUsageFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sharedPresentSupportedUsageFlags = PathElement.groupElement("sharedPresentSupportedUsageFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sharedPresentSupportedUsageFlags = (OfInt) LAYOUT.select(PATH$sharedPresentSupportedUsageFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sharedPresentSupportedUsageFlags = LAYOUT.byteOffset(PATH$sharedPresentSupportedUsageFlags);

    public VkSharedPresentSurfaceCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SHARED_PRESENT_SURFACE_CAPABILITIES_KHR);
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

    public @enumtype(VkImageUsageFlags.class) int sharedPresentSupportedUsageFlags() {
        return segment.get(LAYOUT$sharedPresentSupportedUsageFlags, OFFSET$sharedPresentSupportedUsageFlags);
    }

    public void sharedPresentSupportedUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$sharedPresentSupportedUsageFlags, OFFSET$sharedPresentSupportedUsageFlags, value);
    }


    public static final class Factory implements IFactory<VkSharedPresentSurfaceCapabilitiesKHR> {
        @Override
        public Class<VkSharedPresentSurfaceCapabilitiesKHR> clazz() {
            return VkSharedPresentSurfaceCapabilitiesKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSharedPresentSurfaceCapabilitiesKHR.LAYOUT;
        }

        @Override
        public VkSharedPresentSurfaceCapabilitiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSharedPresentSurfaceCapabilitiesKHR createUninit(MemorySegment segment) {
            return new VkSharedPresentSurfaceCapabilitiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
