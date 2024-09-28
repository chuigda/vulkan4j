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

public record VkBindImageMemoryInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("memoryOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();

    public VkBindImageMemoryInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO);
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

    public VkImage image() {
        return new VkImage(segment.get(LAYOUT$image, OFFSET$image));
    }

    public void image(VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value.segment());
    }

    public VkDeviceMemory memory() {
        return new VkDeviceMemory(segment.get(LAYOUT$memory, OFFSET$memory));
    }

    public void memory(VkDeviceMemory value) {
        segment.set(LAYOUT$memory, OFFSET$memory, value.segment());
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public static VkBindImageMemoryInfo allocate(Arena arena) {
        return new VkBindImageMemoryInfo(arena.allocate(LAYOUT));
    }
    
    public static VkBindImageMemoryInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemoryInfo[] ret = new VkBindImageMemoryInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindImageMemoryInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
