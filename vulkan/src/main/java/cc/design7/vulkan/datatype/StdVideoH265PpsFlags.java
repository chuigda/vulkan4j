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

public record StdVideoH265PpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag = ValueLayout.JAVA_INT.withName("bitfield$dependent_slice_segments_enabled_flag_pps_range_extension_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265PpsFlags allocate(Arena arena) {
        return new StdVideoH265PpsFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265PpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265PpsFlags[] ret = new StdVideoH265PpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265PpsFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265PpsFlags clone(Arena arena, StdVideoH265PpsFlags src) {
        StdVideoH265PpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265PpsFlags[] clone(Arena arena, StdVideoH265PpsFlags[] src) {
        StdVideoH265PpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$dependent_slice_segments_enabled_flag_pps_range_extension_flag = PathElement.groupElement("PATH$bitfield$dependent_slice_segments_enabled_flag_pps_range_extension_flag");


    public static final long OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag = LAYOUT.byteOffset(PATH$bitfield$dependent_slice_segments_enabled_flag_pps_range_extension_flag);

    public int dependent_slice_segments_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void dependent_slice_segments_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int output_flag_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void output_flag_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int sign_data_hiding_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void sign_data_hiding_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int cabac_init_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void cabac_init_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int constrained_intra_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void constrained_intra_pred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int transform_skip_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void transform_skip_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int cu_qp_delta_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void cu_qp_delta_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int pps_slice_chroma_qp_offsets_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void pps_slice_chroma_qp_offsets_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int weighted_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void weighted_pred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int weighted_bipred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void weighted_bipred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int transquant_bypass_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void transquant_bypass_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int tiles_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void tiles_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int entropy_coding_sync_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 12, 13);
    }

    public void entropy_coding_sync_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 12, 13, value);
    }

    public int uniform_spacing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 13, 14);
    }

    public void uniform_spacing_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 13, 14, value);
    }

    public int loop_filter_across_tiles_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 14, 15);
    }

    public void loop_filter_across_tiles_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 14, 15, value);
    }

    public int pps_loop_filter_across_slices_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 15, 16);
    }

    public void pps_loop_filter_across_slices_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 15, 16, value);
    }

    public int deblocking_filter_control_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 16, 17);
    }

    public void deblocking_filter_control_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 16, 17, value);
    }

    public int deblocking_filter_override_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 17, 18);
    }

    public void deblocking_filter_override_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 17, 18, value);
    }

    public int pps_deblocking_filter_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 18, 19);
    }

    public void pps_deblocking_filter_disabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 18, 19, value);
    }

    public int pps_scaling_list_data_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 19, 20);
    }

    public void pps_scaling_list_data_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 19, 20, value);
    }

    public int lists_modification_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 20, 21);
    }

    public void lists_modification_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 20, 21, value);
    }

    public int slice_segment_header_extension_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 21, 22);
    }

    public void slice_segment_header_extension_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 21, 22, value);
    }

    public int pps_extension_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 22, 23);
    }

    public void pps_extension_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 22, 23, value);
    }

    public int cross_component_prediction_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 23, 24);
    }

    public void cross_component_prediction_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 23, 24, value);
    }

    public int chroma_qp_offset_list_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 24, 25);
    }

    public void chroma_qp_offset_list_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 24, 25, value);
    }

    public int pps_curr_pic_ref_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 25, 26);
    }

    public void pps_curr_pic_ref_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 25, 26, value);
    }

    public int residual_adaptive_colour_transform_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 26, 27);
    }

    public void residual_adaptive_colour_transform_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 26, 27, value);
    }

    public int pps_slice_act_qp_offsets_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 27, 28);
    }

    public void pps_slice_act_qp_offsets_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 27, 28, value);
    }

    public int pps_palette_predictor_initializers_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 28, 29);
    }

    public void pps_palette_predictor_initializers_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 28, 29, value);
    }

    public int monochrome_palette_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 29, 30);
    }

    public void monochrome_palette_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 29, 30, value);
    }

    public int pps_range_extension_flag() {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        return BitfieldUtil.readBits(s, 30, 31);
    }

    public void pps_range_extension_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$dependent_slice_segments_enabled_flag_pps_range_extension_flag, LAYOUT$dependent_slice_segments_enabled_flag_pps_range_extension_flag);
        BitfieldUtil.writeBits(s, 30, 31, value);
    }

}
/// dummy, not implemented yet
