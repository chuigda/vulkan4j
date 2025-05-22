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

/// Represents a pointer to a {@code StdVideoH264HrdParameters} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264HrdParameters {
///     uint8_t cpb_cnt_minus1; // @link substring="cpb_cnt_minus1" target="#cpb_cnt_minus1"
///     uint8_t bit_rate_scale; // @link substring="bit_rate_scale" target="#bit_rate_scale"
///     uint8_t cpb_size_scale; // @link substring="cpb_size_scale" target="#cpb_size_scale"
///     uint8_t reserved1;
///     uint32_t bit_rate_value_minus1; // @link substring="bit_rate_value_minus1" target="#bit_rate_value_minus1"
///     uint32_t cpb_size_value_minus1; // @link substring="cpb_size_value_minus1" target="#cpb_size_value_minus1"
///     uint8_t cbr_flag; // @link substring="cbr_flag" target="#cbr_flag"
///     uint32_t initial_cpb_removal_delay_length_minus1; // @link substring="initial_cpb_removal_delay_length_minus1" target="#initial_cpb_removal_delay_length_minus1"
///     uint32_t cpb_removal_delay_length_minus1; // @link substring="cpb_removal_delay_length_minus1" target="#cpb_removal_delay_length_minus1"
///     uint32_t dpb_output_delay_length_minus1; // @link substring="dpb_output_delay_length_minus1" target="#dpb_output_delay_length_minus1"
///     uint32_t time_offset_length; // @link substring="time_offset_length" target="#time_offset_length"
/// } StdVideoH264HrdParameters;
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
public record StdVideoH264HrdParameters(@NotNull MemorySegment segment) implements IStdVideoH264HrdParameters {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH264HrdParameters}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH264HrdParameters to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH264HrdParameters.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH264HrdParameters {
        public long size() {
            return segment.byteSize() / StdVideoH264HrdParameters.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH264HrdParameters at(long index) {
            return new StdVideoH264HrdParameters(segment.asSlice(index * StdVideoH264HrdParameters.BYTES, StdVideoH264HrdParameters.BYTES));
        }
        public void write(long index, @NotNull StdVideoH264HrdParameters value) {
            MemorySegment s = segment.asSlice(index * StdVideoH264HrdParameters.BYTES, StdVideoH264HrdParameters.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoH264HrdParameters allocate(Arena arena) {
        return new StdVideoH264HrdParameters(arena.allocate(LAYOUT));
    }

    public static StdVideoH264HrdParameters.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264HrdParameters.Ptr ret = new StdVideoH264HrdParameters.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoH264HrdParameters clone(Arena arena, StdVideoH264HrdParameters src) {
        StdVideoH264HrdParameters ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned byte cpb_cnt_minus1() {
        return segment.get(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1);
    }

    public void cpb_cnt_minus1(@unsigned byte value) {
        segment.set(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1, value);
    }

    public @unsigned byte bit_rate_scale() {
        return segment.get(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale);
    }

    public void bit_rate_scale(@unsigned byte value) {
        segment.set(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale, value);
    }

    public @unsigned byte cpb_size_scale() {
        return segment.get(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale);
    }

    public void cpb_size_scale(@unsigned byte value) {
        segment.set(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale, value);
    }


    public @unsigned int bit_rate_value_minus1() {
        return segment.get(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1);
    }

    public void bit_rate_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1, value);
    }

    public @unsigned int cpb_size_value_minus1() {
        return segment.get(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1);
    }

    public void cpb_size_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1, value);
    }

    public @unsigned byte cbr_flag() {
        return segment.get(LAYOUT$cbr_flag, OFFSET$cbr_flag);
    }

    public void cbr_flag(@unsigned byte value) {
        segment.set(LAYOUT$cbr_flag, OFFSET$cbr_flag, value);
    }

    public @unsigned int initial_cpb_removal_delay_length_minus1() {
        return segment.get(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1);
    }

    public void initial_cpb_removal_delay_length_minus1(@unsigned int value) {
        segment.set(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1, value);
    }

    public @unsigned int cpb_removal_delay_length_minus1() {
        return segment.get(LAYOUT$cpb_removal_delay_length_minus1, OFFSET$cpb_removal_delay_length_minus1);
    }

    public void cpb_removal_delay_length_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_removal_delay_length_minus1, OFFSET$cpb_removal_delay_length_minus1, value);
    }

    public @unsigned int dpb_output_delay_length_minus1() {
        return segment.get(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1);
    }

    public void dpb_output_delay_length_minus1(@unsigned int value) {
        segment.set(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1, value);
    }

    public @unsigned int time_offset_length() {
        return segment.get(LAYOUT$time_offset_length, OFFSET$time_offset_length);
    }

    public void time_offset_length(@unsigned int value) {
        segment.set(LAYOUT$time_offset_length, OFFSET$time_offset_length, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1"),
        ValueLayout.JAVA_BYTE.withName("bit_rate_scale"),
        ValueLayout.JAVA_BYTE.withName("cpb_size_scale"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("bit_rate_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_value_minus1"),
        ValueLayout.JAVA_BYTE.withName("cbr_flag"),
        ValueLayout.JAVA_INT.withName("initial_cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_removal_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("dpb_output_delay_length_minus1"),
        ValueLayout.JAVA_INT.withName("time_offset_length")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$cpb_cnt_minus1 = PathElement.groupElement("cpb_cnt_minus1");
    public static final PathElement PATH$bit_rate_scale = PathElement.groupElement("bit_rate_scale");
    public static final PathElement PATH$cpb_size_scale = PathElement.groupElement("cpb_size_scale");
    public static final PathElement PATH$bit_rate_value_minus1 = PathElement.groupElement("bit_rate_value_minus1");
    public static final PathElement PATH$cpb_size_value_minus1 = PathElement.groupElement("cpb_size_value_minus1");
    public static final PathElement PATH$cbr_flag = PathElement.groupElement("cbr_flag");
    public static final PathElement PATH$initial_cpb_removal_delay_length_minus1 = PathElement.groupElement("initial_cpb_removal_delay_length_minus1");
    public static final PathElement PATH$cpb_removal_delay_length_minus1 = PathElement.groupElement("cpb_removal_delay_length_minus1");
    public static final PathElement PATH$dpb_output_delay_length_minus1 = PathElement.groupElement("dpb_output_delay_length_minus1");
    public static final PathElement PATH$time_offset_length = PathElement.groupElement("time_offset_length");

    public static final OfByte LAYOUT$cpb_cnt_minus1 = (OfByte) LAYOUT.select(PATH$cpb_cnt_minus1);
    public static final OfByte LAYOUT$bit_rate_scale = (OfByte) LAYOUT.select(PATH$bit_rate_scale);
    public static final OfByte LAYOUT$cpb_size_scale = (OfByte) LAYOUT.select(PATH$cpb_size_scale);
    public static final OfInt LAYOUT$bit_rate_value_minus1 = (OfInt) LAYOUT.select(PATH$bit_rate_value_minus1);
    public static final OfInt LAYOUT$cpb_size_value_minus1 = (OfInt) LAYOUT.select(PATH$cpb_size_value_minus1);
    public static final OfByte LAYOUT$cbr_flag = (OfByte) LAYOUT.select(PATH$cbr_flag);
    public static final OfInt LAYOUT$initial_cpb_removal_delay_length_minus1 = (OfInt) LAYOUT.select(PATH$initial_cpb_removal_delay_length_minus1);
    public static final OfInt LAYOUT$cpb_removal_delay_length_minus1 = (OfInt) LAYOUT.select(PATH$cpb_removal_delay_length_minus1);
    public static final OfInt LAYOUT$dpb_output_delay_length_minus1 = (OfInt) LAYOUT.select(PATH$dpb_output_delay_length_minus1);
    public static final OfInt LAYOUT$time_offset_length = (OfInt) LAYOUT.select(PATH$time_offset_length);

    public static final long SIZE$cpb_cnt_minus1 = LAYOUT$cpb_cnt_minus1.byteSize();
    public static final long SIZE$bit_rate_scale = LAYOUT$bit_rate_scale.byteSize();
    public static final long SIZE$cpb_size_scale = LAYOUT$cpb_size_scale.byteSize();
    public static final long SIZE$bit_rate_value_minus1 = LAYOUT$bit_rate_value_minus1.byteSize();
    public static final long SIZE$cpb_size_value_minus1 = LAYOUT$cpb_size_value_minus1.byteSize();
    public static final long SIZE$cbr_flag = LAYOUT$cbr_flag.byteSize();
    public static final long SIZE$initial_cpb_removal_delay_length_minus1 = LAYOUT$initial_cpb_removal_delay_length_minus1.byteSize();
    public static final long SIZE$cpb_removal_delay_length_minus1 = LAYOUT$cpb_removal_delay_length_minus1.byteSize();
    public static final long SIZE$dpb_output_delay_length_minus1 = LAYOUT$dpb_output_delay_length_minus1.byteSize();
    public static final long SIZE$time_offset_length = LAYOUT$time_offset_length.byteSize();

    public static final long OFFSET$cpb_cnt_minus1 = LAYOUT.byteOffset(PATH$cpb_cnt_minus1);
    public static final long OFFSET$bit_rate_scale = LAYOUT.byteOffset(PATH$bit_rate_scale);
    public static final long OFFSET$cpb_size_scale = LAYOUT.byteOffset(PATH$cpb_size_scale);
    public static final long OFFSET$bit_rate_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_value_minus1);
    public static final long OFFSET$cpb_size_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_value_minus1);
    public static final long OFFSET$cbr_flag = LAYOUT.byteOffset(PATH$cbr_flag);
    public static final long OFFSET$initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$initial_cpb_removal_delay_length_minus1);
    public static final long OFFSET$cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$cpb_removal_delay_length_minus1);
    public static final long OFFSET$dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PATH$dpb_output_delay_length_minus1);
    public static final long OFFSET$time_offset_length = LAYOUT.byteOffset(PATH$time_offset_length);
}
