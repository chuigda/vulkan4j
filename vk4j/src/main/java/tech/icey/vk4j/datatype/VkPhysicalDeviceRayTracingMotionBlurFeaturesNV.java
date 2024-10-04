package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingMotionBlurFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingMotionBlur;
///     VkBool32 rayTracingMotionBlurPipelineTraceRaysIndirect;
/// } VkPhysicalDeviceRayTracingMotionBlurFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRayTracingMotionBlurFeaturesNV.html">VkPhysicalDeviceRayTracingMotionBlurFeaturesNV</a>
public record VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MOTION_BLUR_FEATURES_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[] ret = new VkPhysicalDeviceRayTracingMotionBlurFeaturesNV[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlur"),
        ValueLayout.JAVA_INT.withName("rayTracingMotionBlurPipelineTraceRaysIndirect")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayTracingMotionBlur = PathElement.groupElement("rayTracingMotionBlur");
    public static final PathElement PATH$rayTracingMotionBlurPipelineTraceRaysIndirect = PathElement.groupElement("rayTracingMotionBlurPipelineTraceRaysIndirect");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMotionBlur = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlur);
    public static final OfInt LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect = (OfInt) LAYOUT.select(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMotionBlur = LAYOUT.byteOffset(PATH$rayTracingMotionBlur);
    public static final long OFFSET$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT.byteOffset(PATH$rayTracingMotionBlurPipelineTraceRaysIndirect);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMotionBlur = LAYOUT$rayTracingMotionBlur.byteSize();
    public static final long SIZE$rayTracingMotionBlurPipelineTraceRaysIndirect = LAYOUT$rayTracingMotionBlurPipelineTraceRaysIndirect.byteSize();
}
