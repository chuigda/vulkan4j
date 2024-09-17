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

public record VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dedicatedAllocationImageAliasing")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dedicatedAllocationImageAliasing = PathElement.groupElement("dedicatedAllocationImageAliasing");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dedicatedAllocationImageAliasing = (OfInt) LAYOUT.select(PATH$dedicatedAllocationImageAliasing);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dedicatedAllocationImageAliasing = LAYOUT.byteOffset(PATH$dedicatedAllocationImageAliasing);

    public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEDICATED_ALLOCATION_IMAGE_ALIASING_FEATURES_NV);
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

    public @unsigned int dedicatedAllocationImageAliasing() {
        return segment.get(LAYOUT$dedicatedAllocationImageAliasing, OFFSET$dedicatedAllocationImageAliasing);
    }

    public void dedicatedAllocationImageAliasing(@unsigned int value) {
        segment.set(LAYOUT$dedicatedAllocationImageAliasing, OFFSET$dedicatedAllocationImageAliasing, value);
    }


    public static final class VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV> clazz() {
            return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNVFactory FACTORY = new VkPhysicalDeviceDedicatedAllocationImageAliasingFeaturesNVFactory();
}
