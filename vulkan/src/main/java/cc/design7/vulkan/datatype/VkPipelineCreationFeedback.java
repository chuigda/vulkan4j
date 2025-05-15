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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineCreationFeedback.html">VkPipelineCreationFeedback</a>
@ValueBasedCandidate
public record VkPipelineCreationFeedback(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfLong LAYOUT$duration = ValueLayout.JAVA_LONG.withName("duration");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$duration);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineCreationFeedback allocate(Arena arena) {
        return new VkPipelineCreationFeedback(arena.allocate(LAYOUT));
    }

    public static VkPipelineCreationFeedback[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCreationFeedback[] ret = new VkPipelineCreationFeedback[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineCreationFeedback(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineCreationFeedback clone(Arena arena, VkPipelineCreationFeedback src) {
        VkPipelineCreationFeedback ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineCreationFeedback[] clone(Arena arena, VkPipelineCreationFeedback[] src) {
        VkPipelineCreationFeedback[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$duration = PathElement.groupElement("PATH$duration");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$duration = LAYOUT$duration.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$duration = LAYOUT.byteOffset(PATH$duration);

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

}
