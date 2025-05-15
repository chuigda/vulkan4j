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

@ValueBasedCandidate
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

    public boolean transform_8x8_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void transform_8x8_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean redundant_pic_cnt_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void redundant_pic_cnt_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean constrained_intra_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void constrained_intra_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean deblocking_filter_control_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void deblocking_filter_control_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean weighted_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void weighted_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean bottom_field_pic_order_in_frame_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void bottom_field_pic_order_in_frame_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean entropy_coding_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void entropy_coding_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean pic_scaling_matrix_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void pic_scaling_matrix_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

}
