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

public record VkQueryPoolPerformanceQueryCreateInfoINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("performanceCountersSampling")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$performanceCountersSampling = PathElement.groupElement("performanceCountersSampling");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$performanceCountersSampling = (OfInt) LAYOUT.select(PATH$performanceCountersSampling);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$performanceCountersSampling = LAYOUT.byteOffset(PATH$performanceCountersSampling);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$performanceCountersSampling = LAYOUT$performanceCountersSampling.byteSize();

    public VkQueryPoolPerformanceQueryCreateInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUERY_POOL_PERFORMANCE_QUERY_CREATE_INFO_INTEL);
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

    public @enumtype(VkQueryPoolSamplingModeINTEL.class) int performanceCountersSampling() {
        return segment.get(LAYOUT$performanceCountersSampling, OFFSET$performanceCountersSampling);
    }

    public void performanceCountersSampling(@enumtype(VkQueryPoolSamplingModeINTEL.class) int value) {
        segment.set(LAYOUT$performanceCountersSampling, OFFSET$performanceCountersSampling, value);
    }

    public static VkQueryPoolPerformanceQueryCreateInfoINTEL allocate(Arena arena) {
        return new VkQueryPoolPerformanceQueryCreateInfoINTEL(arena.allocate(LAYOUT));
    }
    
    public static VkQueryPoolPerformanceQueryCreateInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryPoolPerformanceQueryCreateInfoINTEL[] ret = new VkQueryPoolPerformanceQueryCreateInfoINTEL[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkQueryPoolPerformanceQueryCreateInfoINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
