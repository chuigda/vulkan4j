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

public record VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$computeCapabilityMinor = PathElement.groupElement(2);
    public static final PathElement PATH$computeCapabilityMajor = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$computeCapabilityMinor = (OfInt) LAYOUT.select(PATH$computeCapabilityMinor);
    public static final OfInt LAYOUT$computeCapabilityMajor = (OfInt) LAYOUT.select(PATH$computeCapabilityMajor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeCapabilityMinor = LAYOUT.byteOffset(PATH$computeCapabilityMinor);
    public static final long OFFSET$computeCapabilityMajor = LAYOUT.byteOffset(PATH$computeCapabilityMajor);

    public VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_PROPERTIES_NV);
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

    public @unsigned int computeCapabilityMinor() {
        return segment.get(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor);
    }

    public void computeCapabilityMinor(@unsigned int value) {
        segment.set(LAYOUT$computeCapabilityMinor, OFFSET$computeCapabilityMinor, value);
    }

    public @unsigned int computeCapabilityMajor() {
        return segment.get(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor);
    }

    public void computeCapabilityMajor(@unsigned int value) {
        segment.set(LAYOUT$computeCapabilityMajor, OFFSET$computeCapabilityMajor, value);
    }


    public static final class VkPhysicalDeviceCudaKernelLaunchPropertiesNVFactory implements IDataTypeFactory<VkPhysicalDeviceCudaKernelLaunchPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceCudaKernelLaunchPropertiesNV> clazz() {
            return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCudaKernelLaunchPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCudaKernelLaunchPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceCudaKernelLaunchPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceCudaKernelLaunchPropertiesNVFactory FACTORY = new VkPhysicalDeviceCudaKernelLaunchPropertiesNVFactory();
}
