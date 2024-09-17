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

public record VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("robustFragmentShadingRateAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("separateDepthStencilAttachmentAccess"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetTotalBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$robustFragmentShadingRateAttachmentAccess = PathElement.groupElement("robustFragmentShadingRateAttachmentAccess");
    public static final PathElement PATH$separateDepthStencilAttachmentAccess = PathElement.groupElement("separateDepthStencilAttachmentAccess");
    public static final PathElement PATH$maxDescriptorSetTotalUniformBuffersDynamic = PathElement.groupElement("maxDescriptorSetTotalUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetTotalStorageBuffersDynamic = PathElement.groupElement("maxDescriptorSetTotalStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetTotalBuffersDynamic = PathElement.groupElement("maxDescriptorSetTotalBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = PathElement.groupElement("maxDescriptorSetUpdateAfterBindTotalBuffersDynamic");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$robustFragmentShadingRateAttachmentAccess = (OfInt) LAYOUT.select(PATH$robustFragmentShadingRateAttachmentAccess);
    public static final OfInt LAYOUT$separateDepthStencilAttachmentAccess = (OfInt) LAYOUT.select(PATH$separateDepthStencilAttachmentAccess);
    public static final OfInt LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetTotalUniformBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetTotalStorageBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetTotalBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetTotalBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustFragmentShadingRateAttachmentAccess = LAYOUT.byteOffset(PATH$robustFragmentShadingRateAttachmentAccess);
    public static final long OFFSET$separateDepthStencilAttachmentAccess = LAYOUT.byteOffset(PATH$separateDepthStencilAttachmentAccess);
    public static final long OFFSET$maxDescriptorSetTotalUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetTotalStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetTotalBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetTotalBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);

    public VkPhysicalDeviceMaintenance7PropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MAINTENANCE_7_PROPERTIES_KHR);
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

    public @unsigned int robustFragmentShadingRateAttachmentAccess() {
        return segment.get(LAYOUT$robustFragmentShadingRateAttachmentAccess, OFFSET$robustFragmentShadingRateAttachmentAccess);
    }

    public void robustFragmentShadingRateAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$robustFragmentShadingRateAttachmentAccess, OFFSET$robustFragmentShadingRateAttachmentAccess, value);
    }

    public @unsigned int separateDepthStencilAttachmentAccess() {
        return segment.get(LAYOUT$separateDepthStencilAttachmentAccess, OFFSET$separateDepthStencilAttachmentAccess);
    }

    public void separateDepthStencilAttachmentAccess(@unsigned int value) {
        segment.set(LAYOUT$separateDepthStencilAttachmentAccess, OFFSET$separateDepthStencilAttachmentAccess, value);
    }

    public @unsigned int maxDescriptorSetTotalUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetTotalUniformBuffersDynamic);
    }

    public void maxDescriptorSetTotalUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetTotalUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetTotalStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetTotalStorageBuffersDynamic);
    }

    public void maxDescriptorSetTotalStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetTotalStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetTotalBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetTotalBuffersDynamic, OFFSET$maxDescriptorSetTotalBuffersDynamic);
    }

    public void maxDescriptorSetTotalBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetTotalBuffersDynamic, OFFSET$maxDescriptorSetTotalBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalUniformBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalStorageBuffersDynamic, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindTotalBuffersDynamic() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic);
    }

    public void maxDescriptorSetUpdateAfterBindTotalBuffersDynamic(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, OFFSET$maxDescriptorSetUpdateAfterBindTotalBuffersDynamic, value);
    }


    public static final class VkPhysicalDeviceMaintenance7PropertiesKHRFactory implements IDataTypeFactory<VkPhysicalDeviceMaintenance7PropertiesKHR> {
        @Override
        public Class<VkPhysicalDeviceMaintenance7PropertiesKHR> clazz() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMaintenance7PropertiesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMaintenance7PropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMaintenance7PropertiesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMaintenance7PropertiesKHR(segment);
        }
    }

    public static final VkPhysicalDeviceMaintenance7PropertiesKHRFactory FACTORY = new VkPhysicalDeviceMaintenance7PropertiesKHRFactory();
}
