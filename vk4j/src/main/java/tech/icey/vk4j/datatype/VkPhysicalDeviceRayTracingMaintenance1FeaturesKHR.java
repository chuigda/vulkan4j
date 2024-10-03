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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 rayTracingMaintenance1;
///     VkBool32 rayTracingPipelineTraceRaysIndirect2;
/// } VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html">VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</a>
public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_MAINTENANCE_1_FEATURES_KHR);
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

    public @unsigned int rayTracingMaintenance1() {
        return segment.get(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1);
    }

    public void rayTracingMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$rayTracingMaintenance1, OFFSET$rayTracingMaintenance1, value);
    }

    public @unsigned int rayTracingPipelineTraceRaysIndirect2() {
        return segment.get(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2);
    }

    public void rayTracingPipelineTraceRaysIndirect2(@unsigned int value) {
        segment.set(LAYOUT$rayTracingPipelineTraceRaysIndirect2, OFFSET$rayTracingPipelineTraceRaysIndirect2, value);
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR clone(Arena arena, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR src) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] clone(Arena arena, VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] src) {
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingMaintenance1"),
        ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayTracingMaintenance1 = PathElement.groupElement("rayTracingMaintenance1");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect2 = PathElement.groupElement("rayTracingPipelineTraceRaysIndirect2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingMaintenance1 = (OfInt) LAYOUT.select(PATH$rayTracingMaintenance1);
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = (OfInt) LAYOUT.select(PATH$rayTracingPipelineTraceRaysIndirect2);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMaintenance1 = LAYOUT.byteOffset(PATH$rayTracingMaintenance1);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect2);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMaintenance1 = LAYOUT$rayTracingMaintenance1.byteSize();
    public static final long SIZE$rayTracingPipelineTraceRaysIndirect2 = LAYOUT$rayTracingPipelineTraceRaysIndirect2.byteSize();
}
