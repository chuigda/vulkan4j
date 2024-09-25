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

public record VkBufferImageCopy(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferOffset"),
        ValueLayout.JAVA_INT.withName("bufferRowLength"),
        ValueLayout.JAVA_INT.withName("bufferImageHeight"),
        VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        VkOffset3D.LAYOUT.withName("imageOffset"),
        VkExtent3D.LAYOUT.withName("imageExtent")
    );

    public static final PathElement PATH$bufferOffset = PathElement.groupElement("bufferOffset");
    public static final PathElement PATH$bufferRowLength = PathElement.groupElement("bufferRowLength");
    public static final PathElement PATH$bufferImageHeight = PathElement.groupElement("bufferImageHeight");
    public static final PathElement PATH$imageSubresource = PathElement.groupElement("imageSubresource");
    public static final PathElement PATH$imageOffset = PathElement.groupElement("imageOffset");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("imageExtent");

    public static final OfLong LAYOUT$bufferOffset = (OfLong) LAYOUT.select(PATH$bufferOffset);
    public static final OfInt LAYOUT$bufferRowLength = (OfInt) LAYOUT.select(PATH$bufferRowLength);
    public static final OfInt LAYOUT$bufferImageHeight = (OfInt) LAYOUT.select(PATH$bufferImageHeight);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);
    public static final StructLayout LAYOUT$imageOffset = (StructLayout) LAYOUT.select(PATH$imageOffset);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long OFFSET$bufferOffset = LAYOUT.byteOffset(PATH$bufferOffset);
    public static final long OFFSET$bufferRowLength = LAYOUT.byteOffset(PATH$bufferRowLength);
    public static final long OFFSET$bufferImageHeight = LAYOUT.byteOffset(PATH$bufferImageHeight);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);
    public static final long OFFSET$imageOffset = LAYOUT.byteOffset(PATH$imageOffset);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);

    public VkBufferImageCopy(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long bufferOffset() {
        return segment.get(LAYOUT$bufferOffset, OFFSET$bufferOffset);
    }

    public void bufferOffset(@unsigned long value) {
        segment.set(LAYOUT$bufferOffset, OFFSET$bufferOffset, value);
    }

    public @unsigned int bufferRowLength() {
        return segment.get(LAYOUT$bufferRowLength, OFFSET$bufferRowLength);
    }

    public void bufferRowLength(@unsigned int value) {
        segment.set(LAYOUT$bufferRowLength, OFFSET$bufferRowLength, value);
    }

    public @unsigned int bufferImageHeight() {
        return segment.get(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight);
    }

    public void bufferImageHeight(@unsigned int value) {
        segment.set(LAYOUT$bufferImageHeight, OFFSET$bufferImageHeight, value);
    }

    public VkImageSubresourceLayers imageSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));
    }

    public void imageSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSubresource, LAYOUT$imageSubresource.byteSize());
    }

    public VkOffset3D imageOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));
    }

    public void imageOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageOffset, LAYOUT$imageOffset.byteSize());
    }

    public VkExtent3D imageExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, LAYOUT$imageExtent.byteSize());
    }

    public static VkBufferImageCopy allocate(Arena arena) {
        return new VkBufferImageCopy(arena.allocate(LAYOUT));
    }
    
    public static VkBufferImageCopy[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferImageCopy[] ret = new VkBufferImageCopy[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBufferImageCopy(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
