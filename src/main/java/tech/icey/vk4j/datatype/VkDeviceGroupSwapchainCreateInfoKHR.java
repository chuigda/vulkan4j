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

public record VkDeviceGroupSwapchainCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("modes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$modes = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$modes = (OfInt) LAYOUT.select(PATH$modes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$modes = LAYOUT.byteOffset(PATH$modes);

    public VkDeviceGroupSwapchainCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_SWAPCHAIN_CREATE_INFO_KHR);
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

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int modes() {
        return segment.get(LAYOUT$modes, OFFSET$modes);
    }

    public void modes(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$modes, OFFSET$modes, value);
    }


    public static final class VkDeviceGroupSwapchainCreateInfoKHRFactory implements IDataTypeFactory<VkDeviceGroupSwapchainCreateInfoKHR> {
        @Override
        public Class<VkDeviceGroupSwapchainCreateInfoKHR> clazz() {
            return VkDeviceGroupSwapchainCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceGroupSwapchainCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkDeviceGroupSwapchainCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceGroupSwapchainCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkDeviceGroupSwapchainCreateInfoKHR(segment);
        }
    }

    public static final VkDeviceGroupSwapchainCreateInfoKHRFactory FACTORY = new VkDeviceGroupSwapchainCreateInfoKHRFactory();
}
