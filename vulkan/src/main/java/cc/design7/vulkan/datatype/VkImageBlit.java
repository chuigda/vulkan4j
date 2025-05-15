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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageBlit.html">VkImageBlit</a>
@ValueBasedCandidate
public record VkImageBlit(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$srcSubresource = VkImageSubresourceLayers.LAYOUT.withName("srcSubresource");
    public static final StructLayout LAYOUT$srcOffsets = VkOffset3D.LAYOUT.withName("srcOffsets");
    public static final StructLayout LAYOUT$dstSubresource = VkImageSubresourceLayers.LAYOUT.withName("dstSubresource");
    public static final StructLayout LAYOUT$dstOffsets = VkOffset3D.LAYOUT.withName("dstOffsets");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$srcSubresource, LAYOUT$srcOffsets, LAYOUT$dstSubresource, LAYOUT$dstOffsets);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageBlit allocate(Arena arena) {
        return new VkImageBlit(arena.allocate(LAYOUT));
    }

    public static VkImageBlit[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageBlit[] ret = new VkImageBlit[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageBlit(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageBlit clone(Arena arena, VkImageBlit src) {
        VkImageBlit ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageBlit[] clone(Arena arena, VkImageBlit[] src) {
        VkImageBlit[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$srcSubresource = PathElement.groupElement("PATH$srcSubresource");
    public static final PathElement PATH$srcOffsets = PathElement.groupElement("PATH$srcOffsets");
    public static final PathElement PATH$dstSubresource = PathElement.groupElement("PATH$dstSubresource");
    public static final PathElement PATH$dstOffsets = PathElement.groupElement("PATH$dstOffsets");

    public static final long SIZE$srcSubresource = LAYOUT$srcSubresource.byteSize();
    public static final long SIZE$srcOffsets = LAYOUT$srcOffsets.byteSize();
    public static final long SIZE$dstSubresource = LAYOUT$dstSubresource.byteSize();
    public static final long SIZE$dstOffsets = LAYOUT$dstOffsets.byteSize();

    public static final long OFFSET$srcSubresource = LAYOUT.byteOffset(PATH$srcSubresource);
    public static final long OFFSET$srcOffsets = LAYOUT.byteOffset(PATH$srcOffsets);
    public static final long OFFSET$dstSubresource = LAYOUT.byteOffset(PATH$dstSubresource);
    public static final long OFFSET$dstOffsets = LAYOUT.byteOffset(PATH$dstOffsets);

    public VkImageSubresourceLayers srcSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$srcSubresource, LAYOUT$srcSubresource));
    }

    public void srcSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcSubresource, SIZE$srcSubresource);
    }

    public VkOffset3D srcOffsets() {
        return new VkOffset3D(segment.asSlice(OFFSET$srcOffsets, LAYOUT$srcOffsets));
    }

    public void srcOffsets(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcOffsets, SIZE$srcOffsets);
    }

    public VkImageSubresourceLayers dstSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$dstSubresource, LAYOUT$dstSubresource));
    }

    public void dstSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstSubresource, SIZE$dstSubresource);
    }

    public VkOffset3D dstOffsets() {
        return new VkOffset3D(segment.asSlice(OFFSET$dstOffsets, LAYOUT$dstOffsets));
    }

    public void dstOffsets(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstOffsets, SIZE$dstOffsets);
    }

}
