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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryHeap.html">VkMemoryHeap</a>
@ValueBasedCandidate
public record VkMemoryHeap(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$size, LAYOUT$flags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMemoryHeap allocate(Arena arena) {
        return new VkMemoryHeap(arena.allocate(LAYOUT));
    }

    public static VkMemoryHeap[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryHeap[] ret = new VkMemoryHeap[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryHeap(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryHeap clone(Arena arena, VkMemoryHeap src) {
        VkMemoryHeap ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryHeap[] clone(Arena arena, VkMemoryHeap[] src) {
        VkMemoryHeap[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");

    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkMemoryHeapFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkMemoryHeapFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

}
