package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1TimingInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TimingInfo {
///     StdVideoAV1TimingInfoFlags flags;
///     uint32_t num_units_in_display_tick;
///     uint32_t time_scale;
///     uint32_t num_ticks_per_picture_minus_1;
/// } StdVideoAV1TimingInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1TimingInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1TimingInfo allocate(Arena arena) {
        StdVideoAV1TimingInfo ret = new StdVideoAV1TimingInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1TimingInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfo[] ret = new StdVideoAV1TimingInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TimingInfo(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1TimingInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("num_units_in_display_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_INT.withName("num_ticks_per_picture_minus_1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$num_units_in_display_tick = PathElement.groupElement("PATH$num_units_in_display_tick");
    public static final PathElement PATH$time_scale = PathElement.groupElement("PATH$time_scale");
    public static final PathElement PATH$num_ticks_per_picture_minus_1 = PathElement.groupElement("PATH$num_ticks_per_picture_minus_1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$num_units_in_display_tick = (OfInt) LAYOUT.select(PATH$num_units_in_display_tick);
    public static final OfInt LAYOUT$time_scale = (OfInt) LAYOUT.select(PATH$time_scale);
    public static final OfInt LAYOUT$num_ticks_per_picture_minus_1 = (OfInt) LAYOUT.select(PATH$num_ticks_per_picture_minus_1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$num_units_in_display_tick = LAYOUT$num_units_in_display_tick.byteSize();
    public static final long SIZE$time_scale = LAYOUT$time_scale.byteSize();
    public static final long SIZE$num_ticks_per_picture_minus_1 = LAYOUT$num_ticks_per_picture_minus_1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$num_units_in_display_tick = LAYOUT.byteOffset(PATH$num_units_in_display_tick);
    public static final long OFFSET$time_scale = LAYOUT.byteOffset(PATH$time_scale);
    public static final long OFFSET$num_ticks_per_picture_minus_1 = LAYOUT.byteOffset(PATH$num_ticks_per_picture_minus_1);
}
