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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryRequirements.html">VkMemoryRequirements</a>
@ValueBasedCandidate
public record VkMemoryRequirements(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$size = ValueLayout.JAVA_LONG.withName("size");
    public static final OfLong LAYOUT$alignment = ValueLayout.JAVA_LONG.withName("alignment");
    public static final OfInt LAYOUT$memoryTypeBits = ValueLayout.JAVA_INT.withName("memoryTypeBits");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$size, LAYOUT$alignment, LAYOUT$memoryTypeBits);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMemoryRequirements allocate(Arena arena) {
        return new VkMemoryRequirements(arena.allocate(LAYOUT));
    }

    public static VkMemoryRequirements[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryRequirements[] ret = new VkMemoryRequirements[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryRequirements(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryRequirements clone(Arena arena, VkMemoryRequirements src) {
        VkMemoryRequirements ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryRequirements[] clone(Arena arena, VkMemoryRequirements[] src) {
        VkMemoryRequirements[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");
    public static final PathElement PATH$alignment = PathElement.groupElement("PATH$alignment");
    public static final PathElement PATH$memoryTypeBits = PathElement.groupElement("PATH$memoryTypeBits");

    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$alignment = LAYOUT$alignment.byteSize();
    public static final long SIZE$memoryTypeBits = LAYOUT$memoryTypeBits.byteSize();

    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$alignment = LAYOUT.byteOffset(PATH$alignment);
    public static final long OFFSET$memoryTypeBits = LAYOUT.byteOffset(PATH$memoryTypeBits);

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long alignment() {
        return segment.get(LAYOUT$alignment, OFFSET$alignment);
    }

    public void alignment(@unsigned long value) {
        segment.set(LAYOUT$alignment, OFFSET$alignment, value);
    }

    public @unsigned int memoryTypeBits() {
        return segment.get(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits);
    }

    public void memoryTypeBits(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeBits, OFFSET$memoryTypeBits, value);
    }

}
