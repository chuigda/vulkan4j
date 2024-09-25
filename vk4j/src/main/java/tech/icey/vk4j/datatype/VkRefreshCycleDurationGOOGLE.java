package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkRefreshCycleDurationGOOGLE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("refreshDuration");

    public static final OfLong LAYOUT$refreshDuration = (OfLong) LAYOUT.select(PATH$refreshDuration);

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);

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
            ret[i] = new VkRefreshCycleDurationGOOGLE(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
