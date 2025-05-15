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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageFormatProperties.html">VkSparseImageFormatProperties</a>
@ValueBasedCandidate
public record VkSparseImageFormatProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$aspectMask = ValueLayout.JAVA_INT.withName("aspectMask");
    public static final StructLayout LAYOUT$imageGranularity = VkExtent3D.LAYOUT.withName("imageGranularity");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$aspectMask, LAYOUT$imageGranularity, LAYOUT$flags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSparseImageFormatProperties allocate(Arena arena) {
        return new VkSparseImageFormatProperties(arena.allocate(LAYOUT));
    }

    public static VkSparseImageFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageFormatProperties[] ret = new VkSparseImageFormatProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSparseImageFormatProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageFormatProperties clone(Arena arena, VkSparseImageFormatProperties src) {
        VkSparseImageFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageFormatProperties[] clone(Arena arena, VkSparseImageFormatProperties[] src) {
        VkSparseImageFormatProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");
    public static final PathElement PATH$imageGranularity = PathElement.groupElement("PATH$imageGranularity");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$imageGranularity = LAYOUT$imageGranularity.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$imageGranularity = LAYOUT.byteOffset(PATH$imageGranularity);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageGranularity, SIZE$imageGranularity);
    }

    public @enumtype(VkSparseImageFormatFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseImageFormatFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

}
