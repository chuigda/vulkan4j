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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR.html">VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR</a>
@ValueBasedCandidate
public record VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$rayTracingMaintenance1 = ValueLayout.JAVA_INT.withName("rayTracingMaintenance1");
    public static final OfInt LAYOUT$rayTracingPipelineTraceRaysIndirect2 = ValueLayout.JAVA_INT.withName("rayTracingPipelineTraceRaysIndirect2");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$rayTracingMaintenance1, LAYOUT$rayTracingPipelineTraceRaysIndirect2);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[] ret = new VkPhysicalDeviceRayTracingMaintenance1FeaturesKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rayTracingMaintenance1 = PathElement.groupElement("PATH$rayTracingMaintenance1");
    public static final PathElement PATH$rayTracingPipelineTraceRaysIndirect2 = PathElement.groupElement("PATH$rayTracingPipelineTraceRaysIndirect2");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rayTracingMaintenance1 = LAYOUT$rayTracingMaintenance1.byteSize();
    public static final long SIZE$rayTracingPipelineTraceRaysIndirect2 = LAYOUT$rayTracingPipelineTraceRaysIndirect2.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingMaintenance1 = LAYOUT.byteOffset(PATH$rayTracingMaintenance1);
    public static final long OFFSET$rayTracingPipelineTraceRaysIndirect2 = LAYOUT.byteOffset(PATH$rayTracingPipelineTraceRaysIndirect2);

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

}
