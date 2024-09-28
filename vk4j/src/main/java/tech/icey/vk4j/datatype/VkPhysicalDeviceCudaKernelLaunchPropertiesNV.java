package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceCudaKernelLaunchPropertiesNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMinor"),
        ValueLayout.JAVA_INT.withName("computeCapabilityMajor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$computeCapabilityMinor = PathElement.groupElement("computeCapabilityMinor");
    public static final PathElement PATH$computeCapabilityMajor = PathElement.groupElement("computeCapabilityMajor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$computeCapabilityMinor = (OfInt) LAYOUT.select(PATH$computeCapabilityMinor);
    public static final OfInt LAYOUT$computeCapabilityMajor = (OfInt) LAYOUT.select(PATH$computeCapabilityMajor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeCapabilityMinor = LAYOUT.byteOffset(PATH$computeCapabilityMinor);
    public static final long OFFSET$computeCapabilityMajor = LAYOUT.byteOffset(PATH$computeCapabilityMajor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeCapabilityMinor = LAYOUT$computeCapabilityMinor.byteSize();
    public static final long SIZE$computeCapabilityMajor = LAYOUT$computeCapabilityMajor.byteSize();

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

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] ret = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
