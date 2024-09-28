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

/// {@snippet lang=c :
/// typedef struct VkBufferCopy {
///     VkDeviceSize srcOffset;
///     VkDeviceSize dstOffset;
///     VkDeviceSize size;
/// } VkBufferCopy;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBufferCopy.html">VkBufferCopy</a>
public record VkBufferCopy(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$srcOffset = PathElement.groupElement("srcOffset");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("dstOffset");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfLong LAYOUT$srcOffset = (OfLong) LAYOUT.select(PATH$srcOffset);
    public static final OfLong LAYOUT$dstOffset = (OfLong) LAYOUT.select(PATH$dstOffset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public static final long SIZE$srcOffset = LAYOUT$srcOffset.byteSize();
    public static final long SIZE$dstOffset = LAYOUT$dstOffset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public VkBufferCopy(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long srcOffset() {
        return segment.get(LAYOUT$srcOffset, OFFSET$srcOffset);
    }

    public void srcOffset(@unsigned long value) {
        segment.set(LAYOUT$srcOffset, OFFSET$srcOffset, value);
    }

    public @unsigned long dstOffset() {
        return segment.get(LAYOUT$dstOffset, OFFSET$dstOffset);
    }

    public void dstOffset(@unsigned long value) {
        segment.set(LAYOUT$dstOffset, OFFSET$dstOffset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public static VkBufferCopy allocate(Arena arena) {
        return new VkBufferCopy(arena.allocate(LAYOUT));
    }
    
    public static VkBufferCopy[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCopy[] ret = new VkBufferCopy[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBufferCopy(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
