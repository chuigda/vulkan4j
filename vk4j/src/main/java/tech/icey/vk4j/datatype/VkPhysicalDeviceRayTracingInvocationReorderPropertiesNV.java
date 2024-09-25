package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("rayTracingInvocationReorderReorderingHint")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$rayTracingInvocationReorderReorderingHint = PathElement.groupElement("rayTracingInvocationReorderReorderingHint");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$rayTracingInvocationReorderReorderingHint = (OfInt) LAYOUT.select(PATH$rayTracingInvocationReorderReorderingHint);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rayTracingInvocationReorderReorderingHint = LAYOUT.byteOffset(PATH$rayTracingInvocationReorderReorderingHint);

    public VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_INVOCATION_REORDER_PROPERTIES_NV);
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

    public @enumtype(VkRayTracingInvocationReorderModeNV.class) int rayTracingInvocationReorderReorderingHint() {
        return segment.get(LAYOUT$rayTracingInvocationReorderReorderingHint, OFFSET$rayTracingInvocationReorderReorderingHint);
    }

    public void rayTracingInvocationReorderReorderingHint(@enumtype(VkRayTracingInvocationReorderModeNV.class) int value) {
        segment.set(LAYOUT$rayTracingInvocationReorderReorderingHint, OFFSET$rayTracingInvocationReorderReorderingHint, value);
    }

    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV[] ret = new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRayTracingInvocationReorderPropertiesNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
