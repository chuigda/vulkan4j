package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record StdVideoH264SpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$constraint_set0_flag_vui_parameters_present_flag = ValueLayout.JAVA_INT.withName("bitfield$constraint_set0_flag_vui_parameters_present_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH264SpsFlags allocate(Arena arena) {
        return new StdVideoH264SpsFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH264SpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SpsFlags[] ret = new StdVideoH264SpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SpsFlags(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag = PathElement.groupElement("PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag");


    public static final long OFFSET$constraint_set0_flag_vui_parameters_present_flag = LAYOUT.byteOffset(PATH$bitfield$constraint_set0_flag_vui_parameters_present_flag);

    public int constraint_set0_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void constraint_set0_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int constraint_set1_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void constraint_set1_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int constraint_set2_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void constraint_set2_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int constraint_set3_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void constraint_set3_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int constraint_set4_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void constraint_set4_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int constraint_set5_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void constraint_set5_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int direct_8x8_inference_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void direct_8x8_inference_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int mb_adaptive_frame_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void mb_adaptive_frame_field_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int frame_mbs_only_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void frame_mbs_only_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int delta_pic_order_always_zero_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void delta_pic_order_always_zero_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int separate_colour_plane_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void separate_colour_plane_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int gaps_in_frame_num_value_allowed_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void gaps_in_frame_num_value_allowed_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int qpprime_y_zero_transform_bypass_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 12, 13);
    }

    public void qpprime_y_zero_transform_bypass_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 12, 13, value);
    }

    public int frame_cropping_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 13, 14);
    }

    public void frame_cropping_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 13, 14, value);
    }

    public int seq_scaling_matrix_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 14, 15);
    }

    public void seq_scaling_matrix_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 14, 15, value);
    }

    public int vui_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        return BitfieldUtil.readBits(s, 15, 16);
    }

    public void vui_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$constraint_set0_flag_vui_parameters_present_flag, LAYOUT$constraint_set0_flag_vui_parameters_present_flag);
        BitfieldUtil.writeBits(s, 15, 16, value);
    }

}
/// dummy, not implemented yet
