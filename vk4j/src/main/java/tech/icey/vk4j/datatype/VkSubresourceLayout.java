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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSubresourceLayout.html">VkSubresourceLayout</a>
public record VkSubresourceLayout(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$rowPitch = PathElement.groupElement("rowPitch");
    public static final PathElement PATH$arrayPitch = PathElement.groupElement("arrayPitch");
    public static final PathElement PATH$depthPitch = PathElement.groupElement("depthPitch");

    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$rowPitch = (OfLong) LAYOUT.select(PATH$rowPitch);
    public static final OfLong LAYOUT$arrayPitch = (OfLong) LAYOUT.select(PATH$arrayPitch);
    public static final OfLong LAYOUT$depthPitch = (OfLong) LAYOUT.select(PATH$depthPitch);

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$rowPitch = LAYOUT.byteOffset(PATH$rowPitch);
    public static final long OFFSET$arrayPitch = LAYOUT.byteOffset(PATH$arrayPitch);
    public static final long OFFSET$depthPitch = LAYOUT.byteOffset(PATH$depthPitch);

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$rowPitch = LAYOUT$rowPitch.byteSize();
    public static final long SIZE$arrayPitch = LAYOUT$arrayPitch.byteSize();
    public static final long SIZE$depthPitch = LAYOUT$depthPitch.byteSize();

    public VkSubresourceLayout(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long rowPitch() {
        return segment.get(LAYOUT$rowPitch, OFFSET$rowPitch);
    }

    public void rowPitch(@unsigned long value) {
        segment.set(LAYOUT$rowPitch, OFFSET$rowPitch, value);
    }

    public @unsigned long arrayPitch() {
        return segment.get(LAYOUT$arrayPitch, OFFSET$arrayPitch);
    }

    public void arrayPitch(@unsigned long value) {
        segment.set(LAYOUT$arrayPitch, OFFSET$arrayPitch, value);
    }

    public @unsigned long depthPitch() {
        return segment.get(LAYOUT$depthPitch, OFFSET$depthPitch);
    }

    public void depthPitch(@unsigned long value) {
        segment.set(LAYOUT$depthPitch, OFFSET$depthPitch, value);
    }

    public static VkSubresourceLayout allocate(Arena arena) {
        return new VkSubresourceLayout(arena.allocate(LAYOUT));
    }
    
    public static VkSubresourceLayout[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubresourceLayout[] ret = new VkSubresourceLayout[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubresourceLayout(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
