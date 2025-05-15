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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRefreshCycleDurationGOOGLE.html">VkRefreshCycleDurationGOOGLE</a>
@ValueBasedCandidate
public record VkRefreshCycleDurationGOOGLE(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$refreshDuration = ValueLayout.JAVA_LONG.withName("refreshDuration");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$refreshDuration);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRefreshCycleDurationGOOGLE allocate(Arena arena) {
        return new VkRefreshCycleDurationGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkRefreshCycleDurationGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshCycleDurationGOOGLE[] ret = new VkRefreshCycleDurationGOOGLE[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRefreshCycleDurationGOOGLE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRefreshCycleDurationGOOGLE clone(Arena arena, VkRefreshCycleDurationGOOGLE src) {
        VkRefreshCycleDurationGOOGLE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRefreshCycleDurationGOOGLE[] clone(Arena arena, VkRefreshCycleDurationGOOGLE[] src) {
        VkRefreshCycleDurationGOOGLE[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("PATH$refreshDuration");

    public static final long SIZE$refreshDuration = LAYOUT$refreshDuration.byteSize();

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);

    public @unsigned long refreshDuration() {
        return segment.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);
    }

    public void refreshDuration(@unsigned long value) {
        segment.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);
    }

}
