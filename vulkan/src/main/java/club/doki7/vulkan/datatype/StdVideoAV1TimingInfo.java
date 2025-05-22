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
///     StdVideoAV1TimingInfoFlags flags; // @link substring="StdVideoAV1TimingInfoFlags" target="StdVideoAV1TimingInfoFlags" @link substring="flags" target="#flags"
///     uint32_t num_units_in_display_tick; // @link substring="num_units_in_display_tick" target="#num_units_in_display_tick"
///     uint32_t time_scale; // @link substring="time_scale" target="#time_scale"
///     uint32_t num_ticks_per_picture_minus_1; // @link substring="num_ticks_per_picture_minus_1" target="#num_ticks_per_picture_minus_1"
/// } StdVideoAV1TimingInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1TimingInfo(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1TimingInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1TimingInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1TimingInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfo {
        public long size() {
            return segment.byteSize() / StdVideoAV1TimingInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1TimingInfo at(long index) {
            return new StdVideoAV1TimingInfo(segment.asSlice(index * StdVideoAV1TimingInfo.BYTES, StdVideoAV1TimingInfo.BYTES));
        }
        public void write(long index, @NotNull StdVideoAV1TimingInfo value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1TimingInfo.BYTES, StdVideoAV1TimingInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoAV1TimingInfo allocate(Arena arena) {
        return new StdVideoAV1TimingInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TimingInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfo.Ptr ret = new StdVideoAV1TimingInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoAV1TimingInfo clone(Arena arena, StdVideoAV1TimingInfo src) {
        StdVideoAV1TimingInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoAV1TimingInfoFlags flags() {
        return new StdVideoAV1TimingInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoAV1TimingInfoFlags value) {
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

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$num_units_in_display_tick = PathElement.groupElement("num_units_in_display_tick");
    public static final PathElement PATH$time_scale = PathElement.groupElement("time_scale");
    public static final PathElement PATH$num_ticks_per_picture_minus_1 = PathElement.groupElement("num_ticks_per_picture_minus_1");

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
