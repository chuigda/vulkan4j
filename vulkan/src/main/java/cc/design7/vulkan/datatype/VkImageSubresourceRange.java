package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkImageSubresourceRange(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$aspectMask = ValueLayout.JAVA_INT.withName("aspectMask");
    public static final OfInt LAYOUT$baseMipLevel = ValueLayout.JAVA_INT.withName("baseMipLevel");
    public static final OfInt LAYOUT$levelCount = ValueLayout.JAVA_INT.withName("levelCount");
    public static final OfInt LAYOUT$baseArrayLayer = ValueLayout.JAVA_INT.withName("baseArrayLayer");
    public static final OfInt LAYOUT$layerCount = ValueLayout.JAVA_INT.withName("layerCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$aspectMask, LAYOUT$baseMipLevel, LAYOUT$levelCount, LAYOUT$baseArrayLayer, LAYOUT$layerCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageSubresourceRange allocate(Arena arena) {
        return new VkImageSubresourceRange(arena.allocate(LAYOUT));
    }

    public static VkImageSubresourceRange[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresourceRange[] ret = new VkImageSubresourceRange[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageSubresourceRange(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageSubresourceRange clone(Arena arena, VkImageSubresourceRange src) {
        VkImageSubresourceRange ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageSubresourceRange[] clone(Arena arena, VkImageSubresourceRange[] src) {
        VkImageSubresourceRange[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$baseMipLevel = PathElement.groupElement("PATH$baseMipLevel");
    public static final PathElement PATH$levelCount = PathElement.groupElement("PATH$levelCount");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("PATH$layerCount");

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$baseMipLevel = LAYOUT$baseMipLevel.byteSize();
    public static final long SIZE$levelCount = LAYOUT$levelCount.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$baseMipLevel = LAYOUT.byteOffset(PATH$baseMipLevel);
    public static final long OFFSET$levelCount = LAYOUT.byteOffset(PATH$levelCount);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int baseMipLevel() {
        return segment.get(LAYOUT$baseMipLevel, OFFSET$baseMipLevel);
    }

    public void baseMipLevel(@unsigned int value) {
        segment.set(LAYOUT$baseMipLevel, OFFSET$baseMipLevel, value);
    }

    public @unsigned int levelCount() {
        return segment.get(LAYOUT$levelCount, OFFSET$levelCount);
    }

    public void levelCount(@unsigned int value) {
        segment.set(LAYOUT$levelCount, OFFSET$levelCount, value);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }

}
/// dummy, not implemented yet
