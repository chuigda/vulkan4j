package tech.icey.vk4j.datatype;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfLong;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkBufferCopy(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcOffset"),
        ValueLayout.JAVA_LONG.withName("dstOffset"),
        ValueLayout.JAVA_LONG.withName("size")
    );

    public static final PathElement PATH$srcOffset = PathElement.groupElement("srcOffset");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("dstOffset");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfLong LAYOUT$srcOffset = (OfLong) LAYOUT.select(PATH$srcOffset);
    public static final OfLong LAYOUT$dstOffset = (OfLong) LAYOUT.select(PATH$dstOffset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

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
            ret[i] = new VkBufferCopy(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
