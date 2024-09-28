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

public record VkMemoryRequirements2(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memoryRequirements = PathElement.groupElement("memoryRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$memoryRequirements = (StructLayout) LAYOUT.select(PATH$memoryRequirements);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryRequirements = LAYOUT.byteOffset(PATH$memoryRequirements);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryRequirements = LAYOUT$memoryRequirements.byteSize();

    public VkMemoryRequirements2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_REQUIREMENTS_2);
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

    public VkMemoryRequirements memoryRequirements() {
        return new VkMemoryRequirements(segment.asSlice(OFFSET$memoryRequirements, LAYOUT$memoryRequirements));
    }

    public void memoryRequirements(VkMemoryRequirements value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryRequirements, SIZE$memoryRequirements);
    }

    public static VkMemoryRequirements2 allocate(Arena arena) {
        return new VkMemoryRequirements2(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryRequirements2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryRequirements2[] ret = new VkMemoryRequirements2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryRequirements2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
