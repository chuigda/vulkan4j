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

public record StdVideoH264PpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = ValueLayout.JAVA_INT.withName("bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH264PpsFlags allocate(Arena arena) {
        return new StdVideoH264PpsFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH264PpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264PpsFlags[] ret = new StdVideoH264PpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264PpsFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH264PpsFlags clone(Arena arena, StdVideoH264PpsFlags src) {
        StdVideoH264PpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264PpsFlags[] clone(Arena arena, StdVideoH264PpsFlags[] src) {
        StdVideoH264PpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = PathElement.groupElement("PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag");


    public static final long OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = LAYOUT.byteOffset(PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);

    public int transform_8x8_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void transform_8x8_mode_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int redundant_pic_cnt_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void redundant_pic_cnt_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int constrained_intra_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void constrained_intra_pred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int deblocking_filter_control_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void deblocking_filter_control_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int weighted_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void weighted_pred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int bottom_field_pic_order_in_frame_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void bottom_field_pic_order_in_frame_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int entropy_coding_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void entropy_coding_mode_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int pic_scaling_matrix_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void pic_scaling_matrix_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

}
/// dummy, not implemented yet
