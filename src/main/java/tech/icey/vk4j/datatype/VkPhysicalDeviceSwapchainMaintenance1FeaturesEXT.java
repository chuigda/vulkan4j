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

public record VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainMaintenance1")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$swapchainMaintenance1 = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainMaintenance1 = (OfInt) LAYOUT.select(PATH$swapchainMaintenance1);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainMaintenance1 = LAYOUT.byteOffset(PATH$swapchainMaintenance1);

    public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SWAPCHAIN_MAINTENANCE_1_FEATURES_EXT);
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

    public @unsigned int swapchainMaintenance1() {
        return segment.get(LAYOUT$swapchainMaintenance1, OFFSET$swapchainMaintenance1);
    }

    public void swapchainMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$swapchainMaintenance1, OFFSET$swapchainMaintenance1, value);
    }


    public static final class VkPhysicalDeviceSwapchainMaintenance1FeaturesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT> clazz() {
            return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceSwapchainMaintenance1FeaturesEXTFactory FACTORY = new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXTFactory();
}
