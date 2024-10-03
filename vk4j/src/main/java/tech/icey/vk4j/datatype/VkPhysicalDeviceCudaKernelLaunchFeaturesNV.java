package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CUDA_KERNEL_LAUNCH_FEATURES_NV;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceCudaKernelLaunchFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 cudaKernelLaunchFeatures;
/// } VkPhysicalDeviceCudaKernelLaunchFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceCudaKernelLaunchFeaturesNV.html">VkPhysicalDeviceCudaKernelLaunchFeaturesNV</a>
public record VkPhysicalDeviceCudaKernelLaunchFeaturesNV(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int cudaKernelLaunchFeatures() {
        return segment.get(LAYOUT$cudaKernelLaunchFeatures, OFFSET$cudaKernelLaunchFeatures);
    }

    public void cudaKernelLaunchFeatures(@unsigned int value) {
        segment.set(LAYOUT$cudaKernelLaunchFeatures, OFFSET$cudaKernelLaunchFeatures, value);
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCudaKernelLaunchFeaturesNV[] ret = new VkPhysicalDeviceCudaKernelLaunchFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceCudaKernelLaunchFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchFeaturesNV src) {
        VkPhysicalDeviceCudaKernelLaunchFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchFeaturesNV[] clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchFeaturesNV[] src) {
        VkPhysicalDeviceCudaKernelLaunchFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cudaKernelLaunchFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$cudaKernelLaunchFeatures = PathElement.groupElement("cudaKernelLaunchFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cudaKernelLaunchFeatures = (OfInt) LAYOUT.select(PATH$cudaKernelLaunchFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cudaKernelLaunchFeatures = LAYOUT.byteOffset(PATH$cudaKernelLaunchFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cudaKernelLaunchFeatures = LAYOUT$cudaKernelLaunchFeatures.byteSize();
}
