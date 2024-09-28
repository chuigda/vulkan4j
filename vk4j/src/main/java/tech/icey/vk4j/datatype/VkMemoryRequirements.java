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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMemoryRequirements.html">VkMemoryRequirements</a>
public record VkMemoryRequirements(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("alignment"),
        ValueLayout.JAVA_INT.withName("memoryTypeBits")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$alignment = PathElement.groupElement("alignment");
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement("memoryTypeBits");

    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$alignment = (OfLong) LAYOUT.select(PATH$alignment);
    public static final OfInt LAYOUT$memoryTypeBits = (OfInt) LAYOUT.select(PATH$memoryTypeBits);

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$alignment = LAYOUT.byteOffset(PATH$alignment);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);

    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$alignment = LAYOUT$alignment.byteSize();
    public static final long SIZE$memoryTypeBits = LAYOUT$memoryTypeBits.byteSize();

    public VkMemoryRequirements(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long alignment() {
        return segment.get(LAYOUT$alignment, OFFSET$alignment);
    }

    public void alignment(@unsigned long value) {
        segment.set(LAYOUT$alignment, OFFSET$alignment, value);
    }

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

    public static VkMemoryRequirements allocate(Arena arena) {
        return new VkMemoryRequirements(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryRequirements[] ret = new VkMemoryRequirements[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
