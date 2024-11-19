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
/// typedef struct VkImageSubresourceLayers {
///     VkImageAspectFlags aspectMask;
///     uint32_t mipLevel;
///     uint32_t baseArrayLayer;
///     uint32_t layerCount;
/// } VkImageSubresourceLayers;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageSubresourceLayers.html">VkImageSubresourceLayers</a>
public record VkImageSubresourceLayers(MemorySegment segment) implements IPointer {
    public VkImageSubresourceLayers(MemorySegment segment) {
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

    public static VkImageSubresourceLayers allocate(Arena arena) {
        return new VkImageSubresourceLayers(arena.allocate(LAYOUT));
    }

    public static VkImageSubresourceLayers[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresourceLayers[] ret = new VkImageSubresourceLayers[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageSubresourceLayers(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageSubresourceLayers clone(Arena arena, VkImageSubresourceLayers src) {
        VkImageSubresourceLayers ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageSubresourceLayers[] clone(Arena arena, VkImageSubresourceLayers[] src) {
        VkImageSubresourceLayers[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("mipLevel"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$mipLevel = PathElement.groupElement("mipLevel");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$mipLevel = (OfInt) LAYOUT.select(PATH$mipLevel);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$mipLevel = LAYOUT.byteOffset(PATH$mipLevel);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$mipLevel = LAYOUT$mipLevel.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$layerCount = LAYOUT$layerCount.byteSize();
}
