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

public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$rayTracingMotionBlur = ValueLayout.JAVA_INT.withName("rayTracingMotionBlur");
    public static final OfInt LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect = ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$rayTracingMotionBlur, LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] ret = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV clone(Arena arena, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV src) {
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] clone(Arena arena, VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] src) {
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rayTracingMotionBlur = PathElement.groupElement("PATH$rayTracingMotionBlur");
    public static final PathElement PATH$rayTracingMotionBlurPipelineTraceRaysIndirect = PathElement.groupElement("PATH$rayTracingMotionBlurPipelineTraceRaysIndirect");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMotionBlur = LAYOUT$rayTracingMotionBlur.byteSize();
    public static final long SIZE$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMotionBlur = LAYOUT.byteOffset(PATH$rayTracingMotionBlur);
    public static final long OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

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

    public @unsigned int rayTracingMotionBlur() {
        return segment.get(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur);
    }

    public void rayTracingMotionBlur(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlur, OFFSET$rayTracingMotionBlur, value);
    }

    public @unsigned int rayTracingMotionBlurPipelineTraceRaysIndirect() {
        return segment.get(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect);
    }

    public void rayTracingMotionBlurPipelineTraceRaysIndirect(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect, OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect, value);
    }

}
/// dummy, not implemented yet
