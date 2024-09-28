package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkMemoryDedicatedRequirements(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("prefersDedicatedAllocation"),
        ValueLayout.JAVA_INT.withName("requiresDedicatedAllocation")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$prefersDedicatedAllocation = PathElement.groupElement("prefersDedicatedAllocation");
    public static final PathElement PATH$requiresDedicatedAllocation = PathElement.groupElement("requiresDedicatedAllocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$prefersDedicatedAllocation = (OfInt) LAYOUT.select(PATH$prefersDedicatedAllocation);
    public static final OfInt LAYOUT$requiresDedicatedAllocation = (OfInt) LAYOUT.select(PATH$requiresDedicatedAllocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$prefersDedicatedAllocation = LAYOUT.byteOffset(PATH$prefersDedicatedAllocation);
    public static final long OFFSET$requiresDedicatedAllocation = LAYOUT.byteOffset(PATH$requiresDedicatedAllocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$prefersDedicatedAllocation = LAYOUT$prefersDedicatedAllocation.byteSize();
    public static final long SIZE$requiresDedicatedAllocation = LAYOUT$requiresDedicatedAllocation.byteSize();

    public VkMemoryDedicatedRequirements(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_DEDICATED_REQUIREMENTS);
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

    public @unsigned int prefersDedicatedAllocation() {
        return segment.get(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation);
    }

    public void prefersDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$prefersDedicatedAllocation, OFFSET$prefersDedicatedAllocation, value);
    }

    public @unsigned int requiresDedicatedAllocation() {
        return segment.get(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation);
    }

    public void requiresDedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$requiresDedicatedAllocation, OFFSET$requiresDedicatedAllocation, value);
    }

    public static VkMemoryDedicatedRequirements allocate(Arena arena) {
        return new VkMemoryDedicatedRequirements(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryDedicatedRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryDedicatedRequirements[] ret = new VkMemoryDedicatedRequirements[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryDedicatedRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
