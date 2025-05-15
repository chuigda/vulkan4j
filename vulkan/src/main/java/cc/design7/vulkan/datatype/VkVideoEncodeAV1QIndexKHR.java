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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QIndexKHR.html">VkVideoEncodeAV1QIndexKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeAV1QIndexKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$intraQIndex = ValueLayout.JAVA_INT.withName("intraQIndex");
    public static final OfInt LAYOUT$predictiveQIndex = ValueLayout.JAVA_INT.withName("predictiveQIndex");
    public static final OfInt LAYOUT$bipredictiveQIndex = ValueLayout.JAVA_INT.withName("bipredictiveQIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$intraQIndex, LAYOUT$predictiveQIndex, LAYOUT$bipredictiveQIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeAV1QIndexKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1QIndexKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1QIndexKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1QIndexKHR[] ret = new VkVideoEncodeAV1QIndexKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1QIndexKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1QIndexKHR clone(Arena arena, VkVideoEncodeAV1QIndexKHR src) {
        VkVideoEncodeAV1QIndexKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1QIndexKHR[] clone(Arena arena, VkVideoEncodeAV1QIndexKHR[] src) {
        VkVideoEncodeAV1QIndexKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$intraQIndex = PathElement.groupElement("PATH$intraQIndex");
    public static final PathElement PATH$predictiveQIndex = PathElement.groupElement("PATH$predictiveQIndex");
    public static final PathElement PATH$bipredictiveQIndex = PathElement.groupElement("PATH$bipredictiveQIndex");

    public static final long SIZE$intraQIndex = LAYOUT$intraQIndex.byteSize();
    public static final long SIZE$predictiveQIndex = LAYOUT$predictiveQIndex.byteSize();
    public static final long SIZE$bipredictiveQIndex = LAYOUT$bipredictiveQIndex.byteSize();

    public static final long OFFSET$intraQIndex = LAYOUT.byteOffset(PATH$intraQIndex);
    public static final long OFFSET$predictiveQIndex = LAYOUT.byteOffset(PATH$predictiveQIndex);
    public static final long OFFSET$bipredictiveQIndex = LAYOUT.byteOffset(PATH$bipredictiveQIndex);

    public @unsigned int intraQIndex() {
        return segment.get(LAYOUT$intraQIndex, OFFSET$intraQIndex);
    }

    public void intraQIndex(@unsigned int value) {
        segment.set(LAYOUT$intraQIndex, OFFSET$intraQIndex, value);
    }

    public @unsigned int predictiveQIndex() {
        return segment.get(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex);
    }

    public void predictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$predictiveQIndex, OFFSET$predictiveQIndex, value);
    }

    public @unsigned int bipredictiveQIndex() {
        return segment.get(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex);
    }

    public void bipredictiveQIndex(@unsigned int value) {
        segment.set(LAYOUT$bipredictiveQIndex, OFFSET$bipredictiveQIndex, value);
    }

}
