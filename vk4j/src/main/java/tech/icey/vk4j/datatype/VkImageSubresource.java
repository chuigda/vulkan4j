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

public record VkImageSubresource(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("arrayLayer")
    );

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$mipLevel = PathElement.groupElement("mipLevel");
    public static final PathElement PATH$arrayLayer = PathElement.groupElement("arrayLayer");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$mipLevel = (OfInt) LAYOUT.select(PATH$mipLevel);
    public static final OfInt LAYOUT$arrayLayer = (OfInt) LAYOUT.select(PATH$arrayLayer);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$mipLevel = LAYOUT.byteOffset(PATH$mipLevel);
    public static final long OFFSET$arrayLayer = LAYOUT.byteOffset(PATH$arrayLayer);

    public VkImageSubresource(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int mipLevel() {
        return segment.get(LAYOUT$mipLevel, OFFSET$mipLevel);
    }

    public void mipLevel(@unsigned int value) {
        segment.set(LAYOUT$mipLevel, OFFSET$mipLevel, value);
    }

    public @unsigned int arrayLayer() {
        return segment.get(LAYOUT$arrayLayer, OFFSET$arrayLayer);
    }

    public void arrayLayer(@unsigned int value) {
        segment.set(LAYOUT$arrayLayer, OFFSET$arrayLayer, value);
    }

    public static VkImageSubresource allocate(Arena arena) {
        return new VkImageSubresource(arena.allocate(LAYOUT));
    }
    
    public static VkImageSubresource[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresource[] ret = new VkImageSubresource[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageSubresource(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
