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

public record VkImageCopy(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$srcSubresource = VkImageSubresourceLayers.LAYOUT.withName("srcSubresource");
    public static final StructLayout LAYOUT$srcOffset = VkOffset3D.LAYOUT.withName("srcOffset");
    public static final StructLayout LAYOUT$dstSubresource = VkImageSubresourceLayers.LAYOUT.withName("dstSubresource");
    public static final StructLayout LAYOUT$dstOffset = VkOffset3D.LAYOUT.withName("dstOffset");
    public static final StructLayout LAYOUT$extent = VkExtent3D.LAYOUT.withName("extent");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$srcSubresource, LAYOUT$srcOffset, LAYOUT$dstSubresource, LAYOUT$dstOffset, LAYOUT$extent);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageCopy allocate(Arena arena) {
        return new VkImageCopy(arena.allocate(LAYOUT));
    }

    public static VkImageCopy[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCopy[] ret = new VkImageCopy[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageCopy(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCopy clone(Arena arena, VkImageCopy src) {
        VkImageCopy ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCopy[] clone(Arena arena, VkImageCopy[] src) {
        VkImageCopy[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$srcSubresource = PathElement.groupElement("PATH$srcSubresource");
    public static final PathElement PATH$srcOffset = PathElement.groupElement("PATH$srcOffset");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("PATH$dstSubresource");
    public static final PathElement PATH$dstOffset = PathElement.groupElement("PATH$dstOffset");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");

    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffset = LAYOUT$srcOffset.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffset = LAYOUT$dstOffset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();

    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffset = LAYOUT.byteOffset(PATH$srcOffset);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffset = LAYOUT.byteOffset(PATH$dstOffset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);

    public VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, SIZE$srcSubresource);
    }

    public VkOffset3D srcOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$srcOffset, LAYOUT$srcOffset));
    }

    public void srcOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcOffset, SIZE$srcOffset);
    }

    public VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, SIZE$dstSubresource);
    }

    public VkOffset3D dstOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$dstOffset, LAYOUT$dstOffset));
    }

    public void dstOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstOffset, SIZE$dstOffset);
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

}
/// dummy, not implemented yet
