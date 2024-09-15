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

public record VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$minSubgroupSize = PathElement.groupElement(2);
    public static final PathElement PATH$maxSubgroupSize = PathElement.groupElement(3);
    public static final PathElement PATH$maxComputeWorkgroupSubgroups = PathElement.groupElement(4);
    public static final PathElement PATH$requiredSubgroupSizeStages = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$minSubgroupSize = (OfInt) LAYOUT.select(PATH$minSubgroupSize);
    public static final OfInt LAYOUT$maxSubgroupSize = (OfInt) LAYOUT.select(PATH$maxSubgroupSize);
    public static final OfInt LAYOUT$maxComputeWorkgroupSubgroups = (OfInt) LAYOUT.select(PATH$maxComputeWorkgroupSubgroups);
    public static final OfInt LAYOUT$requiredSubgroupSizeStages = (OfInt) LAYOUT.select(PATH$requiredSubgroupSizeStages);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minSubgroupSize = LAYOUT.byteOffset(PATH$minSubgroupSize);
    public static final long OFFSET$maxSubgroupSize = LAYOUT.byteOffset(PATH$maxSubgroupSize);
    public static final long OFFSET$maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSubgroups);
    public static final long OFFSET$requiredSubgroupSizeStages = LAYOUT.byteOffset(PATH$requiredSubgroupSizeStages);

    public VkPhysicalDeviceSubgroupSizeControlProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_SIZE_CONTROL_PROPERTIES);
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

    public @unsigned int minSubgroupSize() {
        return segment.get(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize);
    }

    public void minSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize, value);
    }

    public @unsigned int maxSubgroupSize() {
        return segment.get(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize);
    }

    public void maxSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize, value);
    }

    public @unsigned int maxComputeWorkgroupSubgroups() {
        return segment.get(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups);
    }

    public void maxComputeWorkgroupSubgroups(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups, value);
    }

    public @enumtype(VkShaderStageFlags.class) int requiredSubgroupSizeStages() {
        return segment.get(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages);
    }

    public void requiredSubgroupSizeStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages, value);
    }


    public static final class VkPhysicalDeviceSubgroupSizeControlPropertiesFactory implements IDataTypeFactory<VkPhysicalDeviceSubgroupSizeControlProperties> {
        @Override
        public Class<VkPhysicalDeviceSubgroupSizeControlProperties> clazz() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSubgroupSizeControlProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSubgroupSizeControlProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSubgroupSizeControlProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSubgroupSizeControlProperties(segment);
        }
    }

    public static final VkPhysicalDeviceSubgroupSizeControlPropertiesFactory FACTORY = new VkPhysicalDeviceSubgroupSizeControlPropertiesFactory();
}
