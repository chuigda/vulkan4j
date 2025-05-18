package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoH264SpsFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264SpsFlags {
///     uint32_t constraint_set0_flag : 1; // @link substring="constraint_set0_flag" target="#constraint_set0_flag"
///     uint32_t constraint_set1_flag : 1; // @link substring="constraint_set1_flag" target="#constraint_set1_flag"
///     uint32_t constraint_set2_flag : 1; // @link substring="constraint_set2_flag" target="#constraint_set2_flag"
///     uint32_t constraint_set3_flag : 1; // @link substring="constraint_set3_flag" target="#constraint_set3_flag"
///     uint32_t constraint_set4_flag : 1; // @link substring="constraint_set4_flag" target="#constraint_set4_flag"
///     uint32_t constraint_set5_flag : 1; // @link substring="constraint_set5_flag" target="#constraint_set5_flag"
///     uint32_t direct_8x8_inference_flag : 1; // @link substring="direct_8x8_inference_flag" target="#direct_8x8_inference_flag"
///     uint32_t mb_adaptive_frame_field_flag : 1; // @link substring="mb_adaptive_frame_field_flag" target="#mb_adaptive_frame_field_flag"
///     uint32_t frame_mbs_only_flag : 1; // @link substring="frame_mbs_only_flag" target="#frame_mbs_only_flag"
///     uint32_t delta_pic_order_always_zero_flag : 1; // @link substring="delta_pic_order_always_zero_flag" target="#delta_pic_order_always_zero_flag"
///     uint32_t separate_colour_plane_flag : 1; // @link substring="separate_colour_plane_flag" target="#separate_colour_plane_flag"
///     uint32_t gaps_in_frame_num_value_allowed_flag : 1; // @link substring="gaps_in_frame_num_value_allowed_flag" target="#gaps_in_frame_num_value_allowed_flag"
///     uint32_t qpprime_y_zero_transform_bypass_flag : 1; // @link substring="qpprime_y_zero_transform_bypass_flag" target="#qpprime_y_zero_transform_bypass_flag"
///     uint32_t frame_cropping_flag : 1; // @link substring="frame_cropping_flag" target="#frame_cropping_flag"
///     uint32_t seq_scaling_matrix_present_flag : 1; // @link substring="seq_scaling_matrix_present_flag" target="#seq_scaling_matrix_present_flag"
///     uint32_t vui_parameters_present_flag : 1; // @link substring="vui_parameters_present_flag" target="#vui_parameters_present_flag"
/// } StdVideoH264SpsFlags;
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
public record StdVideoH264SpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264SpsFlags allocate(Arena arena) {
        StdVideoH264SpsFlags ret = new StdVideoH264SpsFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264SpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SpsFlags[] ret = new StdVideoH264SpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SpsFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264SpsFlags clone(Arena arena, StdVideoH264SpsFlags src) {
        StdVideoH264SpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264SpsFlags[] clone(Arena arena, StdVideoH264SpsFlags[] src) {
        StdVideoH264SpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean constraint_set0_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void constraint_set0_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean constraint_set1_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void constraint_set1_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean constraint_set2_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void constraint_set2_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean constraint_set3_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void constraint_set3_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean constraint_set4_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void constraint_set4_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean constraint_set5_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void constraint_set5_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean direct_8x8_inference_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void direct_8x8_inference_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean mb_adaptive_frame_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void mb_adaptive_frame_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean frame_mbs_only_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 8);
    }

    public void frame_mbs_only_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean delta_pic_order_always_zero_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 9);
    }

    public void delta_pic_order_always_zero_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean separate_colour_plane_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 10);
    }

    public void separate_colour_plane_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean gaps_in_frame_num_value_allowed_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 11);
    }

    public void gaps_in_frame_num_value_allowed_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean qpprime_y_zero_transform_bypass_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 12);
    }

    public void qpprime_y_zero_transform_bypass_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean frame_cropping_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 13);
    }

    public void frame_cropping_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean seq_scaling_matrix_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 14);
    }

    public void seq_scaling_matrix_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean vui_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBit(s, 15);
    }

    public void vui_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$constraint_set0_flag_vui_parameters_present_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag = PathElement.groupElement("PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag");

    public static final OfInt LAYOUT$constraint_set0_flag_vui_parameters_present_flag = (OfInt) LAYOUT.select(PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag);


    public static final long OFFSET$bitfield$constraint_set0_flag_vui_parameters_present_flag = LAYOUT.byteOffset(PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag);
}
