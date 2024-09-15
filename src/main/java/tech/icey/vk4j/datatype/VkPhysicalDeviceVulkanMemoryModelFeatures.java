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

public record VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModel"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope"),
        ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$vulkanMemoryModel = PathElement.groupElement(2);
    public static final PathElement PATH$vulkanMemoryModelDeviceScope = PathElement.groupElement(3);
    public static final PathElement PATH$vulkanMemoryModelAvailabilityVisibilityChains = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vulkanMemoryModel = (OfInt) LAYOUT.select(PATH$vulkanMemoryModel);
    public static final OfInt LAYOUT$vulkanMemoryModelDeviceScope = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelDeviceScope);
    public static final OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = (OfInt) LAYOUT.select(PATH$vulkanMemoryModelAvailabilityVisibilityChains);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vulkanMemoryModel = LAYOUT.byteOffset(PATH$vulkanMemoryModel);
    public static final long OFFSET$vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PATH$vulkanMemoryModelDeviceScope);
    public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PATH$vulkanMemoryModelAvailabilityVisibilityChains);

    public VkPhysicalDeviceVulkanMemoryModelFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_MEMORY_MODEL_FEATURES);
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

    public @unsigned int vulkanMemoryModel() {
        return segment.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);
    }

    public void vulkanMemoryModel(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);
    }

    public @unsigned int vulkanMemoryModelDeviceScope() {
        return segment.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);
    }

    public void vulkanMemoryModelDeviceScope(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);
    }

    public @unsigned int vulkanMemoryModelAvailabilityVisibilityChains() {
        return segment.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);
    }

    public void vulkanMemoryModelAvailabilityVisibilityChains(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);
    }


    public static final class VkPhysicalDeviceVulkanMemoryModelFeaturesFactory implements IDataTypeFactory<VkPhysicalDeviceVulkanMemoryModelFeatures> {
        @Override
        public Class<VkPhysicalDeviceVulkanMemoryModelFeatures> clazz() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceVulkanMemoryModelFeatures.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeatures create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceVulkanMemoryModelFeatures createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceVulkanMemoryModelFeatures(segment);
        }
    }

    public static final VkPhysicalDeviceVulkanMemoryModelFeaturesFactory FACTORY = new VkPhysicalDeviceVulkanMemoryModelFeaturesFactory();
}
