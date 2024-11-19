package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkImageSubresourceRange {
///     VkImageAspectFlags aspectMask;
///     uint32_t baseMipLevel;
///     uint32_t levelCount;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// } VkImageSubresourceRange;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageSubresourceRange.html">VkImageSubresourceRange</a>
public record VkImageSubresourceRange(MemorySegment segment) implements IPointer {
    public VkImageSubresourceRange(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkImageSubresourceRange allocate(Arena arena) {
        return new VkImageSubresourceRange(arena.allocate(LAYOUT));
    }

    public static VkImageSubresourceRange[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresourceRange[] ret = new VkImageSubresourceRange[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("levelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$baseMipLevel = PathElement.groupElement("baseMipLevel");
    public static final PathElement PATH$levelCount = PathElement.groupElement("levelCount");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$baseMipLevel = (OfInt) LAYOUT.select(PATH$baseMipLevel);
    public static final OfInt LAYOUT$levelCount = (OfInt) LAYOUT.select(PATH$levelCount);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$baseMipLevel = LAYOUT.byteOffset(PATH$baseMipLevel);
    public static final long OFFSET$levelCount = LAYOUT.byteOffset(PATH$levelCount);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$baseMipLevel = LAYOUT$baseMipLevel.byteSize();
    public static final long SIZE$levelCount = LAYOUT$levelCount.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();
}
