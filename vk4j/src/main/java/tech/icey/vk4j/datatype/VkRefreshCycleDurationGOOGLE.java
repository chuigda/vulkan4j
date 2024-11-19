package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRefreshCycleDurationGOOGLE {
///     uint64_t refreshDuration;
/// } VkRefreshCycleDurationGOOGLE;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRefreshCycleDurationGOOGLE.html">VkRefreshCycleDurationGOOGLE</a>
public record VkRefreshCycleDurationGOOGLE(MemorySegment segment) implements IPointer {
    public VkRefreshCycleDurationGOOGLE(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long refreshDuration() {
        return segment.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);
    }

    public void refreshDuration(@unsigned long value) {
        segment.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);
    }

    public static VkRefreshCycleDurationGOOGLE allocate(Arena arena) {
        return new VkRefreshCycleDurationGOOGLE(arena.allocate(LAYOUT));
    }

    public static VkRefreshCycleDurationGOOGLE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRefreshCycleDurationGOOGLE[] ret = new VkRefreshCycleDurationGOOGLE[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("refreshDuration");

    public static final OfLong LAYOUT$refreshDuration = (OfLong) LAYOUT.select(PATH$refreshDuration);

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);

    public static final long SIZE$refreshDuration = LAYOUT$refreshDuration.byteSize();
}
