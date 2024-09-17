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

public record VkDeviceGroupPresentInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceMasks"),
        ValueLayout.JAVA_INT.withName("mode")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pDeviceMasks = PathElement.groupElement("pDeviceMasks");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pDeviceMasks = (AddressLayout) LAYOUT.select(PATH$pDeviceMasks);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pDeviceMasks = LAYOUT.byteOffset(PATH$pDeviceMasks);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

    public VkDeviceGroupPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_INFO_KHR);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDeviceMasksRaw() {
        return segment.get(LAYOUT$pDeviceMasks, OFFSET$pDeviceMasks);
    }

    public void pDeviceMasksRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceMasks, OFFSET$pDeviceMasks, value);
    }
    
    public @unsigned IntPtr pDeviceMasks() {
        return new IntPtr(pDeviceMasksRaw());
    }

    public void pDeviceMasks(@unsigned IntPtr value) {
        pDeviceMasksRaw(value.segment());
    }

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }


    public static final class VkDeviceGroupPresentInfoKHRFactory implements IDataTypeFactory<VkDeviceGroupPresentInfoKHR> {
        @Override
        public Class<VkDeviceGroupPresentInfoKHR> clazz() {
            return VkDeviceGroupPresentInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceGroupPresentInfoKHR.LAYOUT;
        }

        @Override
        public VkDeviceGroupPresentInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceGroupPresentInfoKHR createUninit(MemorySegment segment) {
            return new VkDeviceGroupPresentInfoKHR(segment);
        }
    }

    public static final VkDeviceGroupPresentInfoKHRFactory FACTORY = new VkDeviceGroupPresentInfoKHRFactory();
}
