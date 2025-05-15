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

/// Represents a pointer to a {@code StdVideoH264HrdParameters} structure in native memory.
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
public record StdVideoH264HrdParameters(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264HrdParameters allocate(Arena arena) {
        return new StdVideoH264HrdParameters(arena.allocate(LAYOUT));
    }

    public static StdVideoH264HrdParameters[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264HrdParameters[] ret = new StdVideoH264HrdParameters[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264HrdParameters(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH264HrdParameters clone(Arena arena, StdVideoH264HrdParameters src) {
        StdVideoH264HrdParameters ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264HrdParameters[] clone(Arena arena, StdVideoH264HrdParameters[] src) {
        StdVideoH264HrdParameters[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$cpb_cnt_minus1 = PathElement.groupElement("PATH$cpb_cnt_minus1");
    public static final PathElement PATH$bit_rate_scale = PathElement.groupElement("PATH$bit_rate_scale");
    public static final PathElement PATH$cpb_size_scale = PathElement.groupElement("PATH$cpb_size_scale");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$bit_rate_value_minus1 = PathElement.groupElement("PATH$bit_rate_value_minus1");
    public static final PathElement PATH$cpb_size_value_minus1 = PathElement.groupElement("PATH$cpb_size_value_minus1");
    public static final PathElement PATH$cbr_flag = PathElement.groupElement("PATH$cbr_flag");
    public static final PathElement PATH$initial_cpb_removal_delay_length_minus1 = PathElement.groupElement("PATH$initial_cpb_removal_delay_length_minus1");
    public static final PathElement PATH$cpb_removal_delay_length_minus1 = PathElement.groupElement("PATH$cpb_removal_delay_length_minus1");
    public static final PathElement PATH$dpb_output_delay_length_minus1 = PathElement.groupElement("PATH$dpb_output_delay_length_minus1");
    public static final PathElement PATH$time_offset_length = PathElement.groupElement("PATH$time_offset_length");

    public static final OfByte LAYOUT$cpb_cnt_minus1 = (OfByte) LAYOUT.select(PATH$cpb_cnt_minus1);
    public static final OfByte LAYOUT$bit_rate_scale = (OfByte) LAYOUT.select(PATH$bit_rate_scale);
    public static final OfByte LAYOUT$cpb_size_scale = (OfByte) LAYOUT.select(PATH$cpb_size_scale);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
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
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
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
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$bit_rate_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_value_minus1);
    public static final long OFFSET$cpb_size_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_value_minus1);
    public static final long OFFSET$cbr_flag = LAYOUT.byteOffset(PATH$cbr_flag);
    public static final long OFFSET$initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$initial_cpb_removal_delay_length_minus1);
    public static final long OFFSET$cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$cpb_removal_delay_length_minus1);
    public static final long OFFSET$dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PATH$dpb_output_delay_length_minus1);
    public static final long OFFSET$time_offset_length = LAYOUT.byteOffset(PATH$time_offset_length);

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

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
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

}
