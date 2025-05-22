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

/// Represents a pointer to a {@code StdVideoEncodeAV1DecoderModelInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1DecoderModelInfo {
///     uint8_t buffer_delay_length_minus_1; // @link substring="buffer_delay_length_minus_1" target="#buffer_delay_length_minus_1"
///     uint8_t buffer_removal_time_length_minus_1; // @link substring="buffer_removal_time_length_minus_1" target="#buffer_removal_time_length_minus_1"
///     uint8_t frame_presentation_time_length_minus_1; // @link substring="frame_presentation_time_length_minus_1" target="#frame_presentation_time_length_minus_1"
///     uint8_t reserved1;
///     uint32_t num_units_in_decoding_tick; // @link substring="num_units_in_decoding_tick" target="#num_units_in_decoding_tick"
/// } StdVideoEncodeAV1DecoderModelInfo;
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
public record StdVideoEncodeAV1DecoderModelInfo(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1DecoderModelInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeAV1DecoderModelInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeAV1DecoderModelInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeAV1DecoderModelInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1DecoderModelInfo {
        public long size() {
            return segment.byteSize() / StdVideoEncodeAV1DecoderModelInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeAV1DecoderModelInfo at(long index) {
            return new StdVideoEncodeAV1DecoderModelInfo(segment.asSlice(index * StdVideoEncodeAV1DecoderModelInfo.BYTES, StdVideoEncodeAV1DecoderModelInfo.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeAV1DecoderModelInfo value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeAV1DecoderModelInfo.BYTES, StdVideoEncodeAV1DecoderModelInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeAV1DecoderModelInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1DecoderModelInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1DecoderModelInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1DecoderModelInfo.Ptr ret = new StdVideoEncodeAV1DecoderModelInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeAV1DecoderModelInfo clone(Arena arena, StdVideoEncodeAV1DecoderModelInfo src) {
        StdVideoEncodeAV1DecoderModelInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned byte buffer_delay_length_minus_1() {
        return segment.get(LAYOUT$buffer_delay_length_minus_1, OFFSET$buffer_delay_length_minus_1);
    }

    public void buffer_delay_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$buffer_delay_length_minus_1, OFFSET$buffer_delay_length_minus_1, value);
    }

    public @unsigned byte buffer_removal_time_length_minus_1() {
        return segment.get(LAYOUT$buffer_removal_time_length_minus_1, OFFSET$buffer_removal_time_length_minus_1);
    }

    public void buffer_removal_time_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$buffer_removal_time_length_minus_1, OFFSET$buffer_removal_time_length_minus_1, value);
    }

    public @unsigned byte frame_presentation_time_length_minus_1() {
        return segment.get(LAYOUT$frame_presentation_time_length_minus_1, OFFSET$frame_presentation_time_length_minus_1);
    }

    public void frame_presentation_time_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$frame_presentation_time_length_minus_1, OFFSET$frame_presentation_time_length_minus_1, value);
    }


    public @unsigned int num_units_in_decoding_tick() {
        return segment.get(LAYOUT$num_units_in_decoding_tick, OFFSET$num_units_in_decoding_tick);
    }

    public void num_units_in_decoding_tick(@unsigned int value) {
        segment.set(LAYOUT$num_units_in_decoding_tick, OFFSET$num_units_in_decoding_tick, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("buffer_delay_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("buffer_removal_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("frame_presentation_time_length_minus_1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("num_units_in_decoding_tick")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$buffer_delay_length_minus_1 = PathElement.groupElement("buffer_delay_length_minus_1");
    public static final PathElement PATH$buffer_removal_time_length_minus_1 = PathElement.groupElement("buffer_removal_time_length_minus_1");
    public static final PathElement PATH$frame_presentation_time_length_minus_1 = PathElement.groupElement("frame_presentation_time_length_minus_1");
    public static final PathElement PATH$num_units_in_decoding_tick = PathElement.groupElement("num_units_in_decoding_tick");

    public static final OfByte LAYOUT$buffer_delay_length_minus_1 = (OfByte) LAYOUT.select(PATH$buffer_delay_length_minus_1);
    public static final OfByte LAYOUT$buffer_removal_time_length_minus_1 = (OfByte) LAYOUT.select(PATH$buffer_removal_time_length_minus_1);
    public static final OfByte LAYOUT$frame_presentation_time_length_minus_1 = (OfByte) LAYOUT.select(PATH$frame_presentation_time_length_minus_1);
    public static final OfInt LAYOUT$num_units_in_decoding_tick = (OfInt) LAYOUT.select(PATH$num_units_in_decoding_tick);

    public static final long SIZE$buffer_delay_length_minus_1 = LAYOUT$buffer_delay_length_minus_1.byteSize();
    public static final long SIZE$buffer_removal_time_length_minus_1 = LAYOUT$buffer_removal_time_length_minus_1.byteSize();
    public static final long SIZE$frame_presentation_time_length_minus_1 = LAYOUT$frame_presentation_time_length_minus_1.byteSize();
    public static final long SIZE$num_units_in_decoding_tick = LAYOUT$num_units_in_decoding_tick.byteSize();

    public static final long OFFSET$buffer_delay_length_minus_1 = LAYOUT.byteOffset(PATH$buffer_delay_length_minus_1);
    public static final long OFFSET$buffer_removal_time_length_minus_1 = LAYOUT.byteOffset(PATH$buffer_removal_time_length_minus_1);
    public static final long OFFSET$frame_presentation_time_length_minus_1 = LAYOUT.byteOffset(PATH$frame_presentation_time_length_minus_1);
    public static final long OFFSET$num_units_in_decoding_tick = LAYOUT.byteOffset(PATH$num_units_in_decoding_tick);
}
