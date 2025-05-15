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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyMemoryIndirectCommandNV.html">VkCopyMemoryIndirectCommandNV</a>
@ValueBasedCandidate
public record VkCopyMemoryIndirectCommandNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$srcAddress = ValueLayout.JAVA_LONG.withName("srcAddress");
    public static final OfLong LAYOUT$dstAddress = ValueLayout.JAVA_LONG.withName("dstAddress");
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$srcAddress, LAYOUT$dstAddress, LAYOUT$size);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCopyMemoryIndirectCommandNV allocate(Arena arena) {
        return new VkCopyMemoryIndirectCommandNV(arena.allocate(LAYOUT));
    }

    public static VkCopyMemoryIndirectCommandNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyMemoryIndirectCommandNV[] ret = new VkCopyMemoryIndirectCommandNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyMemoryIndirectCommandNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyMemoryIndirectCommandNV clone(Arena arena, VkCopyMemoryIndirectCommandNV src) {
        VkCopyMemoryIndirectCommandNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyMemoryIndirectCommandNV[] clone(Arena arena, VkCopyMemoryIndirectCommandNV[] src) {
        VkCopyMemoryIndirectCommandNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$srcAddress = PathElement.groupElement("PATH$srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("PATH$dstAddress");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final long SIZE$srcAddress = LAYOUT$srcAddress.byteSize();
    public static final long SIZE$dstAddress = LAYOUT$dstAddress.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public @unsigned long srcAddress() {
        return segment.get(LAYOUT$srcAddress, OFFSET$srcAddress);
    }

    public void srcAddress(@unsigned long value) {
        segment.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);
    }

    public @unsigned long dstAddress() {
        return segment.get(LAYOUT$dstAddress, OFFSET$dstAddress);
    }

    public void dstAddress(@unsigned long value) {
        segment.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

}
