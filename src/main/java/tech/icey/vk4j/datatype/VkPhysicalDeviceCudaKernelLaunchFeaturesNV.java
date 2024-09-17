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

public record VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cudaKernelLaunchFeatures")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$cudaKernelLaunchFeatures = PathElement.groupElement("cudaKernelLaunchFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cudaKernelLaunchFeatures = (OfInt) LAYOUT.select(PATH$cudaKernelLaunchFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cudaKernelLaunchFeatures = LAYOUT.byteOffset(PATH$cudaKernelLaunchFeatures);

    public VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV);
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

    public @unsigned int cudaKernelLaunchFeatures() {
        return segment.get(LAYOUT$cudaKernelLaunchFeatures, OFFSET$cudaKernelLaunchFeatures);
    }

    public void cudaKernelLaunchFeatures(@unsigned int value) {
        segment.set(LAYOUT$cudaKernelLaunchFeatures, OFFSET$cudaKernelLaunchFeatures, value);
    }


    public static final class VkPhysicalDeviceCudaKernelLaunchFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceCudaKernelLaunchFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceCudaKernelLaunchFeaturesNV> clazz() {
            return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCudaKernelLaunchFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceCudaKernelLaunchFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceCudaKernelLaunchFeaturesNVFactory FACTORY = new VkPhysicalDeviceCudaKernelLaunchFeaturesNVFactory();
}
