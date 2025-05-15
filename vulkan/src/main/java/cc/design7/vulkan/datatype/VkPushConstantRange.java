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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPushConstantRange.html">VkPushConstantRange</a>
@ValueBasedCandidate
public record VkPushConstantRange(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$stageFlags = ValueLayout.JAVA_INT.withName("stageFlags");
    public static final OfInt LAYOUT$offset = ValueLayout.JAVA_INT.withName("offset");
    public static final OfInt LAYOUT$size = ValueLayout.JAVA_INT.withName("size");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$stageFlags, LAYOUT$offset, LAYOUT$size);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPushConstantRange allocate(Arena arena) {
        return new VkPushConstantRange(arena.allocate(LAYOUT));
    }

    public static VkPushConstantRange[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPushConstantRange[] ret = new VkPushConstantRange[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPushConstantRange(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPushConstantRange clone(Arena arena, VkPushConstantRange src) {
        VkPushConstantRange ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPushConstantRange[] clone(Arena arena, VkPushConstantRange[] src) {
        VkPushConstantRange[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$stageFlags = PathElement.groupElement("PATH$stageFlags");
    public static final PathElement PATH$offset = PathElement.groupElement("PATH$offset");
    public static final PathElement PATH$size = PathElement.groupElement("PATH$size");

    public static final long SIZE$stageFlags = LAYOUT$stageFlags.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$stageFlags = LAYOUT.byteOffset(PATH$stageFlags);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public @enumtype(VkShaderStageFlags.class) int stageFlags() {
        return segment.get(LAYOUT$stageFlags, OFFSET$stageFlags);
    }

    public void stageFlags(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stageFlags, OFFSET$stageFlags, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

}
