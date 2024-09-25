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

public record VkSparseImageFormatProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$imageGranularity = PathElement.groupElement("imageGranularity");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final StructLayout LAYOUT$imageGranularity = (StructLayout) LAYOUT.select(PATH$imageGranularity);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$imageGranularity = LAYOUT.byteOffset(PATH$imageGranularity);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkSparseImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public VkExtent3D imageGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageGranularity, LAYOUT$imageGranularity));
    }

    public void imageGranularity(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageGranularity, LAYOUT$imageGranularity.byteSize());
    }

    public @enumtype(VkSparseImageFormatFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseImageFormatFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkSparseImageFormatProperties allocate(Arena arena) {
        return new VkSparseImageFormatProperties(arena.allocate(LAYOUT));
    }
    
    public static VkSparseImageFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageFormatProperties[] ret = new VkSparseImageFormatProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageFormatProperties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
