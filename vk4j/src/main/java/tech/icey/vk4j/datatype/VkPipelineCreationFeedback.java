package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineCreationFeedback.html">VkPipelineCreationFeedback</a>
public record VkPipelineCreationFeedback(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$duration = PathElement.groupElement("duration");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$duration = (OfLong) LAYOUT.select(PATH$duration);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$duration = LAYOUT.byteOffset(PATH$duration);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$duration = LAYOUT$duration.byteSize();

    public VkPipelineCreationFeedback(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkPipelineCreationFeedbackFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCreationFeedbackFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long duration() {
        return segment.get(LAYOUT$duration, OFFSET$duration);
    }

    public void duration(@unsigned long value) {
        segment.set(LAYOUT$duration, OFFSET$duration, value);
    }

    public static VkPipelineCreationFeedback allocate(Arena arena) {
        return new VkPipelineCreationFeedback(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineCreationFeedback[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCreationFeedback[] ret = new VkPipelineCreationFeedback[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCreationFeedback(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
