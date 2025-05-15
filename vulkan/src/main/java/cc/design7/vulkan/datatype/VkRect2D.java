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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRect2D.html">VkRect2D</a>
@ValueBasedCandidate
public record VkRect2D(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$offset = VkOffset2D.LAYOUT.withName("offset");
    public static final StructLayout LAYOUT$extent = VkExtent2D.LAYOUT.withName("extent");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$offset, LAYOUT$extent);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRect2D allocate(Arena arena) {
        return new VkRect2D(arena.allocate(LAYOUT));
    }

    public static VkRect2D[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRect2D[] ret = new VkRect2D[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRect2D(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRect2D clone(Arena arena, VkRect2D src) {
        VkRect2D ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRect2D[] clone(Arena arena, VkRect2D[] src) {
        VkRect2D[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);

    public VkOffset2D offset() {
        return new VkOffset2D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
    }

    public VkExtent2D extent() {
        return new VkExtent2D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
    }

}
