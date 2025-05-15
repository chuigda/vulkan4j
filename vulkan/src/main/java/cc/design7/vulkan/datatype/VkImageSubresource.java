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

public record VkImageSubresource(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$aspectMask = ValueLayout.JAVA_INT.withName("aspectMask");
    public static final OfInt LAYOUT$mipLevel = ValueLayout.JAVA_INT.withName("mipLevel");
    public static final OfInt LAYOUT$arrayLayer = ValueLayout.JAVA_INT.withName("arrayLayer");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$aspectMask, LAYOUT$mipLevel, LAYOUT$arrayLayer);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageSubresource allocate(Arena arena) {
        return new VkImageSubresource(arena.allocate(LAYOUT));
    }

    public static VkImageSubresource[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSubresource[] ret = new VkImageSubresource[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageSubresource(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageSubresource clone(Arena arena, VkImageSubresource src) {
        VkImageSubresource ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageSubresource[] clone(Arena arena, VkImageSubresource[] src) {
        VkImageSubresource[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$mipLevel = PathElement.groupElement("PATH$mipLevel");
    public static final PathElement PATH$arrayLayer = PathElement.groupElement("PATH$arrayLayer");

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$mipLevel = LAYOUT$mipLevel.byteSize();
    public static final long SIZE$arrayLayer = LAYOUT$arrayLayer.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$mipLevel = LAYOUT.byteOffset(PATH$mipLevel);
    public static final long OFFSET$arrayLayer = LAYOUT.byteOffset(PATH$arrayLayer);

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

}
/// dummy, not implemented yet
