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

public record VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorPoolOverallocation")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorPoolOverallocation = PathElement.groupElement("descriptorPoolOverallocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorPoolOverallocation = (OfInt) LAYOUT.select(PATH$descriptorPoolOverallocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorPoolOverallocation = LAYOUT.byteOffset(PATH$descriptorPoolOverallocation);

    public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_POOL_OVERALLOCATION_FEATURES_NV);
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

    public @unsigned int descriptorPoolOverallocation() {
        return segment.get(LAYOUT$descriptorPoolOverallocation, OFFSET$descriptorPoolOverallocation);
    }

    public void descriptorPoolOverallocation(@unsigned int value) {
        segment.set(LAYOUT$descriptorPoolOverallocation, OFFSET$descriptorPoolOverallocation, value);
    }


    public static final class VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV> clazz() {
            return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNVFactory FACTORY = new VkPhysicalDeviceDescriptorPoolOverallocationFeaturesNVFactory();
}
