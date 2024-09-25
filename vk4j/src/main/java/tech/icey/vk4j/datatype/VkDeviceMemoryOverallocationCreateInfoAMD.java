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

public record VkDeviceMemoryOverallocationCreateInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("overallocationBehavior")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$overallocationBehavior = PathElement.groupElement("overallocationBehavior");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$overallocationBehavior = (OfInt) LAYOUT.select(PATH$overallocationBehavior);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$overallocationBehavior = LAYOUT.byteOffset(PATH$overallocationBehavior);

    public VkDeviceMemoryOverallocationCreateInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_MEMORY_OVERALLOCATION_CREATE_INFO_AMD);
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

    public @enumtype(VkMemoryOverallocationBehaviorAMD.class) int overallocationBehavior() {
        return segment.get(LAYOUT$overallocationBehavior, OFFSET$overallocationBehavior);
    }

    public void overallocationBehavior(@enumtype(VkMemoryOverallocationBehaviorAMD.class) int value) {
        segment.set(LAYOUT$overallocationBehavior, OFFSET$overallocationBehavior, value);
    }

    public static VkDeviceMemoryOverallocationCreateInfoAMD allocate(Arena arena) {
        return new VkDeviceMemoryOverallocationCreateInfoAMD(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceMemoryOverallocationCreateInfoAMD[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceMemoryOverallocationCreateInfoAMD[] ret = new VkDeviceMemoryOverallocationCreateInfoAMD[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceMemoryOverallocationCreateInfoAMD(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
