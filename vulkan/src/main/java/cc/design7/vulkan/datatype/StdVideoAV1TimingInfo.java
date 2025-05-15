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

@ValueBasedCandidate
public record StdVideoAV1TimingInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoAV1TimingInfoFlags.LAYOUT.withName("flags");
    public static final OfInt LAYOUT$num_units_in_display_tick = ValueLayout.JAVA_INT.withName("num_units_in_display_tick");
    public static final OfInt LAYOUT$time_scale = ValueLayout.JAVA_INT.withName("time_scale");
    public static final OfInt LAYOUT$num_ticks_per_picture_minus_1 = ValueLayout.JAVA_INT.withName("num_ticks_per_picture_minus_1");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$num_units_in_display_tick, LAYOUT$time_scale, LAYOUT$num_ticks_per_picture_minus_1);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1TimingInfo allocate(Arena arena) {
        return new StdVideoAV1TimingInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TimingInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfo[] ret = new StdVideoAV1TimingInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TimingInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1TimingInfo clone(Arena arena, StdVideoAV1TimingInfo src) {
        StdVideoAV1TimingInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1TimingInfo[] clone(Arena arena, StdVideoAV1TimingInfo[] src) {
        StdVideoAV1TimingInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$num_units_in_display_tick = PathElement.groupElement("PATH$num_units_in_display_tick");
    public static final PathElement PATH$time_scale = PathElement.groupElement("PATH$time_scale");
    public static final PathElement PATH$num_ticks_per_picture_minus_1 = PathElement.groupElement("PATH$num_ticks_per_picture_minus_1");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$num_units_in_display_tick = LAYOUT$num_units_in_display_tick.byteSize();
    public static final long SIZE$time_scale = LAYOUT$time_scale.byteSize();
    public static final long SIZE$num_ticks_per_picture_minus_1 = LAYOUT$num_ticks_per_picture_minus_1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$num_units_in_display_tick = LAYOUT.byteOffset(PATH$num_units_in_display_tick);
    public static final long OFFSET$time_scale = LAYOUT.byteOffset(PATH$time_scale);
    public static final long OFFSET$num_ticks_per_picture_minus_1 = LAYOUT.byteOffset(PATH$num_ticks_per_picture_minus_1);

    public StdVideoAV1TimingInfoFlags flags() {
        return new StdVideoAV1TimingInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoAV1TimingInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned int num_units_in_display_tick() {
        return segment.get(LAYOUT$num_units_in_display_tick, OFFSET$num_units_in_display_tick);
    }

    public void num_units_in_display_tick(@unsigned int value) {
        segment.set(LAYOUT$num_units_in_display_tick, OFFSET$num_units_in_display_tick, value);
    }

    public @unsigned int time_scale() {
        return segment.get(LAYOUT$time_scale, OFFSET$time_scale);
    }

    public void time_scale(@unsigned int value) {
        segment.set(LAYOUT$time_scale, OFFSET$time_scale, value);
    }

    public @unsigned int num_ticks_per_picture_minus_1() {
        return segment.get(LAYOUT$num_ticks_per_picture_minus_1, OFFSET$num_ticks_per_picture_minus_1);
    }

    public void num_ticks_per_picture_minus_1(@unsigned int value) {
        segment.set(LAYOUT$num_ticks_per_picture_minus_1, OFFSET$num_ticks_per_picture_minus_1, value);
    }

}
