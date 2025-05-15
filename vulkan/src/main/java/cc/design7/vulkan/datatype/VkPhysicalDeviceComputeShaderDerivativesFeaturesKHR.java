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

public record VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$computeDerivativeGroupQuads = ValueLayout.JAVA_INT.withName("computeDerivativeGroupQuads");
    public static final OfInt LAYOUT$computeDerivativeGroupLinear = ValueLayout.JAVA_INT.withName("computeDerivativeGroupLinear");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$computeDerivativeGroupQuads, LAYOUT$computeDerivativeGroupLinear);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] src) {
        VkPhysicalDeviceComputeShaderDerivativesFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$computeDerivativeGroupQuads = PathElement.groupElement("PATH$computeDerivativeGroupQuads");
    public static final PathElement PATH$computeDerivativeGroupLinear = PathElement.groupElement("PATH$computeDerivativeGroupLinear");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$computeDerivativeGroupQuads = LAYOUT$computeDerivativeGroupQuads.byteSize();
    public static final long SIZE$computeDerivativeGroupLinear = LAYOUT$computeDerivativeGroupLinear.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$computeDerivativeGroupQuads = LAYOUT.byteOffset(PATH$computeDerivativeGroupQuads);
    public static final long OFFSET$computeDerivativeGroupLinear = LAYOUT.byteOffset(PATH$computeDerivativeGroupLinear);

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

    public @unsigned int computeDerivativeGroupQuads() {
        return segment.get(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads);
    }

    public void computeDerivativeGroupQuads(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupQuads, OFFSET$computeDerivativeGroupQuads, value);
    }

    public @unsigned int computeDerivativeGroupLinear() {
        return segment.get(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear);
    }

    public void computeDerivativeGroupLinear(@unsigned int value) {
        segment.set(LAYOUT$computeDerivativeGroupLinear, OFFSET$computeDerivativeGroupLinear, value);
    }

}
/// dummy, not implemented yet
