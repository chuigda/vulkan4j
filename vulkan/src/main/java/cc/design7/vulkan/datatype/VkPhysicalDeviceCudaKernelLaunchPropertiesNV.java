package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCudaKernelLaunchPropertiesNV.html">VkPhysicalDeviceCudaKernelLaunchPropertiesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceCudaKernelLaunchPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$computeCapabilityMinor = ValueLayout.JAVA_INT.withName("computeCapabilityMinor");
    public static final OfInt LAYOUT$computeCapabilityMajor = ValueLayout.JAVA_INT.withName("computeCapabilityMajor");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$computeCapabilityMinor, LAYOUT$computeCapabilityMajor);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] ret = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCudaKernelLaunchPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchPropertiesNV src) {
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] clone(Arena arena, VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] src) {
        VkPhysicalDeviceCudaKernelLaunchPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$computeCapabilityMinor = PathElement.groupElement("PATH$computeCapabilityMinor");
    public static final PathElement PATH$computeCapabilityMajor = PathElement.groupElement("PATH$computeCapabilityMajor");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeCapabilityMinor = LAYOUT$computeCapabilityMinor.byteSize();
    public static final long SIZE$computeCapabilityMajor = LAYOUT$computeCapabilityMajor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeCapabilityMinor = LAYOUT.byteOffset(PATH$computeCapabilityMinor);
    public static final long OFFSET$computeCapabilityMajor = LAYOUT.byteOffset(PATH$computeCapabilityMajor);

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

}
