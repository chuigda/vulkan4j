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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMicromapUsageEXT.html">VkMicromapUsageEXT</a>
@ValueBasedCandidate
public record VkMicromapUsageEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$count = ValueLayout.JAVA_INT.withName("count");
    public static final OfInt LAYOUT$subdivisionLevel = ValueLayout.JAVA_INT.withName("subdivisionLevel");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$count, LAYOUT$subdivisionLevel, LAYOUT$format);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkMicromapUsageEXT allocate(Arena arena) {
        return new VkMicromapUsageEXT(arena.allocate(LAYOUT));
    }

    public static VkMicromapUsageEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMicromapUsageEXT[] ret = new VkMicromapUsageEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMicromapUsageEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMicromapUsageEXT clone(Arena arena, VkMicromapUsageEXT src) {
        VkMicromapUsageEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMicromapUsageEXT[] clone(Arena arena, VkMicromapUsageEXT[] src) {
        VkMicromapUsageEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$count = PathElement.groupElement("PATH$count");
    public static final PathElement PATH$subdivisionLevel = PathElement.groupElement("PATH$subdivisionLevel");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");

    public static final long SIZE$count = LAYOUT$count.byteSize();
    public static final long SIZE$subdivisionLevel = LAYOUT$subdivisionLevel.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$subdivisionLevel = LAYOUT.byteOffset(PATH$subdivisionLevel);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public @unsigned int subdivisionLevel() {
        return segment.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);
    }

    public void subdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);
    }

    public @unsigned int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@unsigned int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

}
