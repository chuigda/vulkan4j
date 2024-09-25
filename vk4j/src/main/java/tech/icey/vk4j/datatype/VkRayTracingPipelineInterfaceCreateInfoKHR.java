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

public record VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxPipelineRayPayloadSize = PathElement.groupElement("maxPipelineRayPayloadSize");
    public static final PathElement PATH$maxPipelineRayHitAttributeSize = PathElement.groupElement("maxPipelineRayHitAttributeSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxPipelineRayPayloadSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayPayloadSize);
    public static final OfInt LAYOUT$maxPipelineRayHitAttributeSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayHitAttributeSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxPipelineRayPayloadSize = LAYOUT.byteOffset(PATH$maxPipelineRayPayloadSize);
    public static final long OFFSET$maxPipelineRayHitAttributeSize = LAYOUT.byteOffset(PATH$maxPipelineRayHitAttributeSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxPipelineRayPayloadSize = LAYOUT$maxPipelineRayPayloadSize.byteSize();
    public static final long SIZE$maxPipelineRayHitAttributeSize = LAYOUT$maxPipelineRayHitAttributeSize.byteSize();

    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
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

    public @unsigned int maxPipelineRayPayloadSize() {
        return segment.get(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize);
    }

    public void maxPipelineRayPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize, value);
    }

    public @unsigned int maxPipelineRayHitAttributeSize() {
        return segment.get(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize);
    }

    public void maxPipelineRayHitAttributeSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize, value);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR allocate(Arena arena) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkRayTracingPipelineInterfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = new VkRayTracingPipelineInterfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
