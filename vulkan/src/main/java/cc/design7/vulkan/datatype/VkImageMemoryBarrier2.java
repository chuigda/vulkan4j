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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageMemoryBarrier2.html">VkImageMemoryBarrier2</a>
@ValueBasedCandidate
public record VkImageMemoryBarrier2(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$srcStageMask = ValueLayout.JAVA_LONG.withName("srcStageMask");
    public static final OfLong LAYOUT$srcAccessMask = ValueLayout.JAVA_LONG.withName("srcAccessMask");
    public static final OfLong LAYOUT$dstStageMask = ValueLayout.JAVA_LONG.withName("dstStageMask");
    public static final OfLong LAYOUT$dstAccessMask = ValueLayout.JAVA_LONG.withName("dstAccessMask");
    public static final OfInt LAYOUT$oldLayout = ValueLayout.JAVA_INT.withName("oldLayout");
    public static final OfInt LAYOUT$newLayout = ValueLayout.JAVA_INT.withName("newLayout");
    public static final OfInt LAYOUT$srcQueueFamilyIndex = ValueLayout.JAVA_INT.withName("srcQueueFamilyIndex");
    public static final OfInt LAYOUT$dstQueueFamilyIndex = ValueLayout.JAVA_INT.withName("dstQueueFamilyIndex");
    public static final AddressLayout LAYOUT$image = ValueLayout.ADDRESS.withName("image");
    public static final StructLayout LAYOUT$subresourceRange = VkImageSubresourceRange.LAYOUT.withName("subresourceRange");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcStageMask, LAYOUT$srcAccessMask, LAYOUT$dstStageMask, LAYOUT$dstAccessMask, LAYOUT$oldLayout, LAYOUT$newLayout, LAYOUT$srcQueueFamilyIndex, LAYOUT$dstQueueFamilyIndex, LAYOUT$image, LAYOUT$subresourceRange);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageMemoryBarrier2 allocate(Arena arena) {
        return new VkImageMemoryBarrier2(arena.allocate(LAYOUT));
    }

    public static VkImageMemoryBarrier2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageMemoryBarrier2[] ret = new VkImageMemoryBarrier2[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageMemoryBarrier2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageMemoryBarrier2 clone(Arena arena, VkImageMemoryBarrier2 src) {
        VkImageMemoryBarrier2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageMemoryBarrier2[] clone(Arena arena, VkImageMemoryBarrier2[] src) {
        VkImageMemoryBarrier2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcStageMask = PathElement.groupElement("PATH$srcStageMask");
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement("PATH$srcAccessMask");
    public static final PathElement PATH$dstStageMask = PathElement.groupElement("PATH$dstStageMask");
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement("PATH$dstAccessMask");
    public static final PathElement PATH$oldLayout = PathElement.groupElement("PATH$oldLayout");
    public static final PathElement PATH$newLayout = PathElement.groupElement("PATH$newLayout");
    public static final PathElement PATH$srcQueueFamilyIndex = PathElement.groupElement("PATH$srcQueueFamilyIndex");
    public static final PathElement PATH$dstQueueFamilyIndex = PathElement.groupElement("PATH$dstQueueFamilyIndex");
    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$subresourceRange = PathElement.groupElement("PATH$subresourceRange");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcStageMask = LAYOUT$srcStageMask.byteSize();
    public static final long SIZE$srcAccessMask = LAYOUT$srcAccessMask.byteSize();
    public static final long SIZE$dstStageMask = LAYOUT$dstStageMask.byteSize();
    public static final long SIZE$dstAccessMask = LAYOUT$dstAccessMask.byteSize();
    public static final long SIZE$oldLayout = LAYOUT$oldLayout.byteSize();
    public static final long SIZE$newLayout = LAYOUT$newLayout.byteSize();
    public static final long SIZE$srcQueueFamilyIndex = LAYOUT$srcQueueFamilyIndex.byteSize();
    public static final long SIZE$dstQueueFamilyIndex = LAYOUT$dstQueueFamilyIndex.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$subresourceRange = LAYOUT$subresourceRange.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcStageMask = LAYOUT.byteOffset(PATH$srcStageMask);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstStageMask = LAYOUT.byteOffset(PATH$dstStageMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
    public static final long OFFSET$oldLayout = LAYOUT.byteOffset(PATH$oldLayout);
    public static final long OFFSET$newLayout = LAYOUT.byteOffset(PATH$newLayout);
    public static final long OFFSET$srcQueueFamilyIndex = LAYOUT.byteOffset(PATH$srcQueueFamilyIndex);
    public static final long OFFSET$dstQueueFamilyIndex = LAYOUT.byteOffset(PATH$dstQueueFamilyIndex);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$subresourceRange = LAYOUT.byteOffset(PATH$subresourceRange);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkPipelineStageFlags2.class) long srcStageMask() {
        return segment.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);
    }

    public void srcStageMask(@enumtype(VkPipelineStageFlags2.class) long value) {
        segment.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);
    }

    public @enumtype(VkAccessFlags2.class) long srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@enumtype(VkAccessFlags2.class) long value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @enumtype(VkPipelineStageFlags2.class) long dstStageMask() {
        return segment.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);
    }

    public void dstStageMask(@enumtype(VkPipelineStageFlags2.class) long value) {
        segment.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);
    }

    public @enumtype(VkAccessFlags2.class) long dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@enumtype(VkAccessFlags2.class) long value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public @enumtype(VkImageLayout.class) int oldLayout() {
        return segment.get(LAYOUT$oldLayout, OFFSET$oldLayout);
    }

    public void oldLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$oldLayout, OFFSET$oldLayout, value);
    }

    public @enumtype(VkImageLayout.class) int newLayout() {
        return segment.get(LAYOUT$newLayout, OFFSET$newLayout);
    }

    public void newLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$newLayout, OFFSET$newLayout, value);
    }

    public @unsigned int srcQueueFamilyIndex() {
        return segment.get(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex);
    }

    public void srcQueueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$srcQueueFamilyIndex, OFFSET$srcQueueFamilyIndex, value);
    }

    public @unsigned int dstQueueFamilyIndex() {
        return segment.get(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex);
    }

    public void dstQueueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$dstQueueFamilyIndex, OFFSET$dstQueueFamilyIndex, value);
    }

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
    }

    public VkImageSubresourceRange subresourceRange() {
        return new VkImageSubresourceRange(segment.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));
    }

    public void subresourceRange(VkImageSubresourceRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresourceRange, SIZE$subresourceRange);
    }

}
