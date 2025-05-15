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

public record StdVideoH265PictureParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoH265PpsFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$pps_pic_parameter_set_id = ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id");
    public static final OfByte LAYOUT$pps_seq_parameter_set_id = ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id");
    public static final OfByte LAYOUT$sps_video_parameter_set_id = ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id");
    public static final OfByte LAYOUT$num_extra_slice_header_bits = ValueLayout.JAVA_BYTE.withName("num_extra_slice_header_bits");
    public static final OfByte LAYOUT$num_ref_idx_l0_default_active_minus1 = ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1");
    public static final OfByte LAYOUT$num_ref_idx_l1_default_active_minus1 = ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1");
    public static final OfByte LAYOUT$init_qp_minus26 = ValueLayout.JAVA_BYTE.withName("init_qp_minus26");
    public static final OfByte LAYOUT$diff_cu_qp_delta_depth = ValueLayout.JAVA_BYTE.withName("diff_cu_qp_delta_depth");
    public static final OfByte LAYOUT$pps_cb_qp_offset = ValueLayout.JAVA_BYTE.withName("pps_cb_qp_offset");
    public static final OfByte LAYOUT$pps_cr_qp_offset = ValueLayout.JAVA_BYTE.withName("pps_cr_qp_offset");
    public static final OfByte LAYOUT$pps_beta_offset_div2 = ValueLayout.JAVA_BYTE.withName("pps_beta_offset_div2");
    public static final OfByte LAYOUT$pps_tc_offset_div2 = ValueLayout.JAVA_BYTE.withName("pps_tc_offset_div2");
    public static final OfByte LAYOUT$log2_parallel_merge_level_minus2 = ValueLayout.JAVA_BYTE.withName("log2_parallel_merge_level_minus2");
    public static final OfByte LAYOUT$log2_max_transform_skip_block_size_minus2 = ValueLayout.JAVA_BYTE.withName("log2_max_transform_skip_block_size_minus2");
    public static final OfByte LAYOUT$diff_cu_chroma_qp_offset_depth = ValueLayout.JAVA_BYTE.withName("diff_cu_chroma_qp_offset_depth");
    public static final OfByte LAYOUT$chroma_qp_offset_list_len_minus1 = ValueLayout.JAVA_BYTE.withName("chroma_qp_offset_list_len_minus1");
    public static final OfByte LAYOUT$cb_qp_offset_list = ValueLayout.JAVA_BYTE.withName("cb_qp_offset_list");
    public static final OfByte LAYOUT$cr_qp_offset_list = ValueLayout.JAVA_BYTE.withName("cr_qp_offset_list");
    public static final OfByte LAYOUT$log2_sao_offset_scale_luma = ValueLayout.JAVA_BYTE.withName("log2_sao_offset_scale_luma");
    public static final OfByte LAYOUT$log2_sao_offset_scale_chroma = ValueLayout.JAVA_BYTE.withName("log2_sao_offset_scale_chroma");
    public static final OfByte LAYOUT$pps_act_y_qp_offset_plus5 = ValueLayout.JAVA_BYTE.withName("pps_act_y_qp_offset_plus5");
    public static final OfByte LAYOUT$pps_act_cb_qp_offset_plus5 = ValueLayout.JAVA_BYTE.withName("pps_act_cb_qp_offset_plus5");
    public static final OfByte LAYOUT$pps_act_cr_qp_offset_plus3 = ValueLayout.JAVA_BYTE.withName("pps_act_cr_qp_offset_plus3");
    public static final OfByte LAYOUT$pps_num_palette_predictor_initializers = ValueLayout.JAVA_BYTE.withName("pps_num_palette_predictor_initializers");
    public static final OfByte LAYOUT$luma_bit_depth_entry_minus8 = ValueLayout.JAVA_BYTE.withName("luma_bit_depth_entry_minus8");
    public static final OfByte LAYOUT$chroma_bit_depth_entry_minus8 = ValueLayout.JAVA_BYTE.withName("chroma_bit_depth_entry_minus8");
    public static final OfByte LAYOUT$num_tile_columns_minus1 = ValueLayout.JAVA_BYTE.withName("num_tile_columns_minus1");
    public static final OfByte LAYOUT$num_tile_rows_minus1 = ValueLayout.JAVA_BYTE.withName("num_tile_rows_minus1");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final OfByte LAYOUT$reserved2 = ValueLayout.JAVA_BYTE.withName("reserved2");
    public static final OfShort LAYOUT$column_width_minus1 = ValueLayout.JAVA_SHORT.withName("column_width_minus1");
    public static final OfShort LAYOUT$row_height_minus1 = ValueLayout.JAVA_SHORT.withName("row_height_minus1");
    public static final OfInt LAYOUT$reserved3 = ValueLayout.JAVA_INT.withName("reserved3");
    public static final AddressLayout LAYOUT$pScalingLists = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ScalingLists.LAYOUT).withName("pScalingLists");
    public static final AddressLayout LAYOUT$pPredictorPaletteEntries = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PredictorPaletteEntries.LAYOUT).withName("pPredictorPaletteEntries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$pps_pic_parameter_set_id, LAYOUT$pps_seq_parameter_set_id, LAYOUT$sps_video_parameter_set_id, LAYOUT$num_extra_slice_header_bits, LAYOUT$num_ref_idx_l0_default_active_minus1, LAYOUT$num_ref_idx_l1_default_active_minus1, LAYOUT$init_qp_minus26, LAYOUT$diff_cu_qp_delta_depth, LAYOUT$pps_cb_qp_offset, LAYOUT$pps_cr_qp_offset, LAYOUT$pps_beta_offset_div2, LAYOUT$pps_tc_offset_div2, LAYOUT$log2_parallel_merge_level_minus2, LAYOUT$log2_max_transform_skip_block_size_minus2, LAYOUT$diff_cu_chroma_qp_offset_depth, LAYOUT$chroma_qp_offset_list_len_minus1, LAYOUT$cb_qp_offset_list, LAYOUT$cr_qp_offset_list, LAYOUT$log2_sao_offset_scale_luma, LAYOUT$log2_sao_offset_scale_chroma, LAYOUT$pps_act_y_qp_offset_plus5, LAYOUT$pps_act_cb_qp_offset_plus5, LAYOUT$pps_act_cr_qp_offset_plus3, LAYOUT$pps_num_palette_predictor_initializers, LAYOUT$luma_bit_depth_entry_minus8, LAYOUT$chroma_bit_depth_entry_minus8, LAYOUT$num_tile_columns_minus1, LAYOUT$num_tile_rows_minus1, LAYOUT$reserved1, LAYOUT$reserved2, LAYOUT$column_width_minus1, LAYOUT$row_height_minus1, LAYOUT$reserved3, LAYOUT$pScalingLists, LAYOUT$pPredictorPaletteEntries);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265PictureParameterSet allocate(Arena arena) {
        return new StdVideoH265PictureParameterSet(arena.allocate(LAYOUT));
    }

    public static StdVideoH265PictureParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265PictureParameterSet[] ret = new StdVideoH265PictureParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265PictureParameterSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265PictureParameterSet clone(Arena arena, StdVideoH265PictureParameterSet src) {
        StdVideoH265PictureParameterSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265PictureParameterSet[] clone(Arena arena, StdVideoH265PictureParameterSet[] src) {
        StdVideoH265PictureParameterSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pps_pic_parameter_set_id = PathElement.groupElement("PATH$pps_pic_parameter_set_id");
    public static final PathElement PATH$pps_seq_parameter_set_id = PathElement.groupElement("PATH$pps_seq_parameter_set_id");
    public static final PathElement PATH$sps_video_parameter_set_id = PathElement.groupElement("PATH$sps_video_parameter_set_id");
    public static final PathElement PATH$num_extra_slice_header_bits = PathElement.groupElement("PATH$num_extra_slice_header_bits");
    public static final PathElement PATH$num_ref_idx_l0_default_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l0_default_active_minus1");
    public static final PathElement PATH$num_ref_idx_l1_default_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l1_default_active_minus1");
    public static final PathElement PATH$init_qp_minus26 = PathElement.groupElement("PATH$init_qp_minus26");
    public static final PathElement PATH$diff_cu_qp_delta_depth = PathElement.groupElement("PATH$diff_cu_qp_delta_depth");
    public static final PathElement PATH$pps_cb_qp_offset = PathElement.groupElement("PATH$pps_cb_qp_offset");
    public static final PathElement PATH$pps_cr_qp_offset = PathElement.groupElement("PATH$pps_cr_qp_offset");
    public static final PathElement PATH$pps_beta_offset_div2 = PathElement.groupElement("PATH$pps_beta_offset_div2");
    public static final PathElement PATH$pps_tc_offset_div2 = PathElement.groupElement("PATH$pps_tc_offset_div2");
    public static final PathElement PATH$log2_parallel_merge_level_minus2 = PathElement.groupElement("PATH$log2_parallel_merge_level_minus2");
    public static final PathElement PATH$log2_max_transform_skip_block_size_minus2 = PathElement.groupElement("PATH$log2_max_transform_skip_block_size_minus2");
    public static final PathElement PATH$diff_cu_chroma_qp_offset_depth = PathElement.groupElement("PATH$diff_cu_chroma_qp_offset_depth");
    public static final PathElement PATH$chroma_qp_offset_list_len_minus1 = PathElement.groupElement("PATH$chroma_qp_offset_list_len_minus1");
    public static final PathElement PATH$cb_qp_offset_list = PathElement.groupElement("PATH$cb_qp_offset_list");
    public static final PathElement PATH$cr_qp_offset_list = PathElement.groupElement("PATH$cr_qp_offset_list");
    public static final PathElement PATH$log2_sao_offset_scale_luma = PathElement.groupElement("PATH$log2_sao_offset_scale_luma");
    public static final PathElement PATH$log2_sao_offset_scale_chroma = PathElement.groupElement("PATH$log2_sao_offset_scale_chroma");
    public static final PathElement PATH$pps_act_y_qp_offset_plus5 = PathElement.groupElement("PATH$pps_act_y_qp_offset_plus5");
    public static final PathElement PATH$pps_act_cb_qp_offset_plus5 = PathElement.groupElement("PATH$pps_act_cb_qp_offset_plus5");
    public static final PathElement PATH$pps_act_cr_qp_offset_plus3 = PathElement.groupElement("PATH$pps_act_cr_qp_offset_plus3");
    public static final PathElement PATH$pps_num_palette_predictor_initializers = PathElement.groupElement("PATH$pps_num_palette_predictor_initializers");
    public static final PathElement PATH$luma_bit_depth_entry_minus8 = PathElement.groupElement("PATH$luma_bit_depth_entry_minus8");
    public static final PathElement PATH$chroma_bit_depth_entry_minus8 = PathElement.groupElement("PATH$chroma_bit_depth_entry_minus8");
    public static final PathElement PATH$num_tile_columns_minus1 = PathElement.groupElement("PATH$num_tile_columns_minus1");
    public static final PathElement PATH$num_tile_rows_minus1 = PathElement.groupElement("PATH$num_tile_rows_minus1");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$column_width_minus1 = PathElement.groupElement("PATH$column_width_minus1");
    public static final PathElement PATH$row_height_minus1 = PathElement.groupElement("PATH$row_height_minus1");
    public static final PathElement PATH$reserved3 = PathElement.groupElement("PATH$reserved3");
    public static final PathElement PATH$pScalingLists = PathElement.groupElement("PATH$pScalingLists");
    public static final PathElement PATH$pPredictorPaletteEntries = PathElement.groupElement("PATH$pPredictorPaletteEntries");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pps_pic_parameter_set_id = LAYOUT$pps_pic_parameter_set_id.byteSize();
    public static final long SIZE$pps_seq_parameter_set_id = LAYOUT$pps_seq_parameter_set_id.byteSize();
    public static final long SIZE$sps_video_parameter_set_id = LAYOUT$sps_video_parameter_set_id.byteSize();
    public static final long SIZE$num_extra_slice_header_bits = LAYOUT$num_extra_slice_header_bits.byteSize();
    public static final long SIZE$num_ref_idx_l0_default_active_minus1 = LAYOUT$num_ref_idx_l0_default_active_minus1.byteSize();
    public static final long SIZE$num_ref_idx_l1_default_active_minus1 = LAYOUT$num_ref_idx_l1_default_active_minus1.byteSize();
    public static final long SIZE$init_qp_minus26 = LAYOUT$init_qp_minus26.byteSize();
    public static final long SIZE$diff_cu_qp_delta_depth = LAYOUT$diff_cu_qp_delta_depth.byteSize();
    public static final long SIZE$pps_cb_qp_offset = LAYOUT$pps_cb_qp_offset.byteSize();
    public static final long SIZE$pps_cr_qp_offset = LAYOUT$pps_cr_qp_offset.byteSize();
    public static final long SIZE$pps_beta_offset_div2 = LAYOUT$pps_beta_offset_div2.byteSize();
    public static final long SIZE$pps_tc_offset_div2 = LAYOUT$pps_tc_offset_div2.byteSize();
    public static final long SIZE$log2_parallel_merge_level_minus2 = LAYOUT$log2_parallel_merge_level_minus2.byteSize();
    public static final long SIZE$log2_max_transform_skip_block_size_minus2 = LAYOUT$log2_max_transform_skip_block_size_minus2.byteSize();
    public static final long SIZE$diff_cu_chroma_qp_offset_depth = LAYOUT$diff_cu_chroma_qp_offset_depth.byteSize();
    public static final long SIZE$chroma_qp_offset_list_len_minus1 = LAYOUT$chroma_qp_offset_list_len_minus1.byteSize();
    public static final long SIZE$cb_qp_offset_list = LAYOUT$cb_qp_offset_list.byteSize();
    public static final long SIZE$cr_qp_offset_list = LAYOUT$cr_qp_offset_list.byteSize();
    public static final long SIZE$log2_sao_offset_scale_luma = LAYOUT$log2_sao_offset_scale_luma.byteSize();
    public static final long SIZE$log2_sao_offset_scale_chroma = LAYOUT$log2_sao_offset_scale_chroma.byteSize();
    public static final long SIZE$pps_act_y_qp_offset_plus5 = LAYOUT$pps_act_y_qp_offset_plus5.byteSize();
    public static final long SIZE$pps_act_cb_qp_offset_plus5 = LAYOUT$pps_act_cb_qp_offset_plus5.byteSize();
    public static final long SIZE$pps_act_cr_qp_offset_plus3 = LAYOUT$pps_act_cr_qp_offset_plus3.byteSize();
    public static final long SIZE$pps_num_palette_predictor_initializers = LAYOUT$pps_num_palette_predictor_initializers.byteSize();
    public static final long SIZE$luma_bit_depth_entry_minus8 = LAYOUT$luma_bit_depth_entry_minus8.byteSize();
    public static final long SIZE$chroma_bit_depth_entry_minus8 = LAYOUT$chroma_bit_depth_entry_minus8.byteSize();
    public static final long SIZE$num_tile_columns_minus1 = LAYOUT$num_tile_columns_minus1.byteSize();
    public static final long SIZE$num_tile_rows_minus1 = LAYOUT$num_tile_rows_minus1.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$column_width_minus1 = LAYOUT$column_width_minus1.byteSize();
    public static final long SIZE$row_height_minus1 = LAYOUT$row_height_minus1.byteSize();
    public static final long SIZE$reserved3 = LAYOUT$reserved3.byteSize();
    public static final long SIZE$pScalingLists = LAYOUT$pScalingLists.byteSize();
    public static final long SIZE$pPredictorPaletteEntries = LAYOUT$pPredictorPaletteEntries.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pps_pic_parameter_set_id = LAYOUT.byteOffset(PATH$pps_pic_parameter_set_id);
    public static final long OFFSET$pps_seq_parameter_set_id = LAYOUT.byteOffset(PATH$pps_seq_parameter_set_id);
    public static final long OFFSET$sps_video_parameter_set_id = LAYOUT.byteOffset(PATH$sps_video_parameter_set_id);
    public static final long OFFSET$num_extra_slice_header_bits = LAYOUT.byteOffset(PATH$num_extra_slice_header_bits);
    public static final long OFFSET$num_ref_idx_l0_default_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l0_default_active_minus1);
    public static final long OFFSET$num_ref_idx_l1_default_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l1_default_active_minus1);
    public static final long OFFSET$init_qp_minus26 = LAYOUT.byteOffset(PATH$init_qp_minus26);
    public static final long OFFSET$diff_cu_qp_delta_depth = LAYOUT.byteOffset(PATH$diff_cu_qp_delta_depth);
    public static final long OFFSET$pps_cb_qp_offset = LAYOUT.byteOffset(PATH$pps_cb_qp_offset);
    public static final long OFFSET$pps_cr_qp_offset = LAYOUT.byteOffset(PATH$pps_cr_qp_offset);
    public static final long OFFSET$pps_beta_offset_div2 = LAYOUT.byteOffset(PATH$pps_beta_offset_div2);
    public static final long OFFSET$pps_tc_offset_div2 = LAYOUT.byteOffset(PATH$pps_tc_offset_div2);
    public static final long OFFSET$log2_parallel_merge_level_minus2 = LAYOUT.byteOffset(PATH$log2_parallel_merge_level_minus2);
    public static final long OFFSET$log2_max_transform_skip_block_size_minus2 = LAYOUT.byteOffset(PATH$log2_max_transform_skip_block_size_minus2);
    public static final long OFFSET$diff_cu_chroma_qp_offset_depth = LAYOUT.byteOffset(PATH$diff_cu_chroma_qp_offset_depth);
    public static final long OFFSET$chroma_qp_offset_list_len_minus1 = LAYOUT.byteOffset(PATH$chroma_qp_offset_list_len_minus1);
    public static final long OFFSET$cb_qp_offset_list = LAYOUT.byteOffset(PATH$cb_qp_offset_list);
    public static final long OFFSET$cr_qp_offset_list = LAYOUT.byteOffset(PATH$cr_qp_offset_list);
    public static final long OFFSET$log2_sao_offset_scale_luma = LAYOUT.byteOffset(PATH$log2_sao_offset_scale_luma);
    public static final long OFFSET$log2_sao_offset_scale_chroma = LAYOUT.byteOffset(PATH$log2_sao_offset_scale_chroma);
    public static final long OFFSET$pps_act_y_qp_offset_plus5 = LAYOUT.byteOffset(PATH$pps_act_y_qp_offset_plus5);
    public static final long OFFSET$pps_act_cb_qp_offset_plus5 = LAYOUT.byteOffset(PATH$pps_act_cb_qp_offset_plus5);
    public static final long OFFSET$pps_act_cr_qp_offset_plus3 = LAYOUT.byteOffset(PATH$pps_act_cr_qp_offset_plus3);
    public static final long OFFSET$pps_num_palette_predictor_initializers = LAYOUT.byteOffset(PATH$pps_num_palette_predictor_initializers);
    public static final long OFFSET$luma_bit_depth_entry_minus8 = LAYOUT.byteOffset(PATH$luma_bit_depth_entry_minus8);
    public static final long OFFSET$chroma_bit_depth_entry_minus8 = LAYOUT.byteOffset(PATH$chroma_bit_depth_entry_minus8);
    public static final long OFFSET$num_tile_columns_minus1 = LAYOUT.byteOffset(PATH$num_tile_columns_minus1);
    public static final long OFFSET$num_tile_rows_minus1 = LAYOUT.byteOffset(PATH$num_tile_rows_minus1);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$column_width_minus1 = LAYOUT.byteOffset(PATH$column_width_minus1);
    public static final long OFFSET$row_height_minus1 = LAYOUT.byteOffset(PATH$row_height_minus1);
    public static final long OFFSET$reserved3 = LAYOUT.byteOffset(PATH$reserved3);
    public static final long OFFSET$pScalingLists = LAYOUT.byteOffset(PATH$pScalingLists);
    public static final long OFFSET$pPredictorPaletteEntries = LAYOUT.byteOffset(PATH$pPredictorPaletteEntries);

    public StdVideoH265PpsFlags flags() {
        return new StdVideoH265PpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265PpsFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte pps_pic_parameter_set_id() {
        return segment.get(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id);
    }

    public void pps_pic_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id, value);
    }

    public @unsigned byte pps_seq_parameter_set_id() {
        return segment.get(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id);
    }

    public void pps_seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id, value);
    }

    public @unsigned byte sps_video_parameter_set_id() {
        return segment.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);
    }

    public void sps_video_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, value);
    }

    public @unsigned byte num_extra_slice_header_bits() {
        return segment.get(LAYOUT$num_extra_slice_header_bits, OFFSET$num_extra_slice_header_bits);
    }

    public void num_extra_slice_header_bits(@unsigned byte value) {
        segment.set(LAYOUT$num_extra_slice_header_bits, OFFSET$num_extra_slice_header_bits, value);
    }

    public @unsigned byte num_ref_idx_l0_default_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1);
    }

    public void num_ref_idx_l0_default_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1, value);
    }

    public @unsigned byte num_ref_idx_l1_default_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1);
    }

    public void num_ref_idx_l1_default_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1, value);
    }

    public byte init_qp_minus26() {
        return segment.get(LAYOUT$init_qp_minus26, OFFSET$init_qp_minus26);
    }

    public void init_qp_minus26(byte value) {
        segment.set(LAYOUT$init_qp_minus26, OFFSET$init_qp_minus26, value);
    }

    public @unsigned byte diff_cu_qp_delta_depth() {
        return segment.get(LAYOUT$diff_cu_qp_delta_depth, OFFSET$diff_cu_qp_delta_depth);
    }

    public void diff_cu_qp_delta_depth(@unsigned byte value) {
        segment.set(LAYOUT$diff_cu_qp_delta_depth, OFFSET$diff_cu_qp_delta_depth, value);
    }

    public byte pps_cb_qp_offset() {
        return segment.get(LAYOUT$pps_cb_qp_offset, OFFSET$pps_cb_qp_offset);
    }

    public void pps_cb_qp_offset(byte value) {
        segment.set(LAYOUT$pps_cb_qp_offset, OFFSET$pps_cb_qp_offset, value);
    }

    public byte pps_cr_qp_offset() {
        return segment.get(LAYOUT$pps_cr_qp_offset, OFFSET$pps_cr_qp_offset);
    }

    public void pps_cr_qp_offset(byte value) {
        segment.set(LAYOUT$pps_cr_qp_offset, OFFSET$pps_cr_qp_offset, value);
    }

    public byte pps_beta_offset_div2() {
        return segment.get(LAYOUT$pps_beta_offset_div2, OFFSET$pps_beta_offset_div2);
    }

    public void pps_beta_offset_div2(byte value) {
        segment.set(LAYOUT$pps_beta_offset_div2, OFFSET$pps_beta_offset_div2, value);
    }

    public byte pps_tc_offset_div2() {
        return segment.get(LAYOUT$pps_tc_offset_div2, OFFSET$pps_tc_offset_div2);
    }

    public void pps_tc_offset_div2(byte value) {
        segment.set(LAYOUT$pps_tc_offset_div2, OFFSET$pps_tc_offset_div2, value);
    }

    public @unsigned byte log2_parallel_merge_level_minus2() {
        return segment.get(LAYOUT$log2_parallel_merge_level_minus2, OFFSET$log2_parallel_merge_level_minus2);
    }

    public void log2_parallel_merge_level_minus2(@unsigned byte value) {
        segment.set(LAYOUT$log2_parallel_merge_level_minus2, OFFSET$log2_parallel_merge_level_minus2, value);
    }

    public @unsigned byte log2_max_transform_skip_block_size_minus2() {
        return segment.get(LAYOUT$log2_max_transform_skip_block_size_minus2, OFFSET$log2_max_transform_skip_block_size_minus2);
    }

    public void log2_max_transform_skip_block_size_minus2(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_transform_skip_block_size_minus2, OFFSET$log2_max_transform_skip_block_size_minus2, value);
    }

    public @unsigned byte diff_cu_chroma_qp_offset_depth() {
        return segment.get(LAYOUT$diff_cu_chroma_qp_offset_depth, OFFSET$diff_cu_chroma_qp_offset_depth);
    }

    public void diff_cu_chroma_qp_offset_depth(@unsigned byte value) {
        segment.set(LAYOUT$diff_cu_chroma_qp_offset_depth, OFFSET$diff_cu_chroma_qp_offset_depth, value);
    }

    public @unsigned byte chroma_qp_offset_list_len_minus1() {
        return segment.get(LAYOUT$chroma_qp_offset_list_len_minus1, OFFSET$chroma_qp_offset_list_len_minus1);
    }

    public void chroma_qp_offset_list_len_minus1(@unsigned byte value) {
        segment.set(LAYOUT$chroma_qp_offset_list_len_minus1, OFFSET$chroma_qp_offset_list_len_minus1, value);
    }

    public byte cb_qp_offset_list() {
        return segment.get(LAYOUT$cb_qp_offset_list, OFFSET$cb_qp_offset_list);
    }

    public void cb_qp_offset_list(byte value) {
        segment.set(LAYOUT$cb_qp_offset_list, OFFSET$cb_qp_offset_list, value);
    }

    public byte cr_qp_offset_list() {
        return segment.get(LAYOUT$cr_qp_offset_list, OFFSET$cr_qp_offset_list);
    }

    public void cr_qp_offset_list(byte value) {
        segment.set(LAYOUT$cr_qp_offset_list, OFFSET$cr_qp_offset_list, value);
    }

    public @unsigned byte log2_sao_offset_scale_luma() {
        return segment.get(LAYOUT$log2_sao_offset_scale_luma, OFFSET$log2_sao_offset_scale_luma);
    }

    public void log2_sao_offset_scale_luma(@unsigned byte value) {
        segment.set(LAYOUT$log2_sao_offset_scale_luma, OFFSET$log2_sao_offset_scale_luma, value);
    }

    public @unsigned byte log2_sao_offset_scale_chroma() {
        return segment.get(LAYOUT$log2_sao_offset_scale_chroma, OFFSET$log2_sao_offset_scale_chroma);
    }

    public void log2_sao_offset_scale_chroma(@unsigned byte value) {
        segment.set(LAYOUT$log2_sao_offset_scale_chroma, OFFSET$log2_sao_offset_scale_chroma, value);
    }

    public byte pps_act_y_qp_offset_plus5() {
        return segment.get(LAYOUT$pps_act_y_qp_offset_plus5, OFFSET$pps_act_y_qp_offset_plus5);
    }

    public void pps_act_y_qp_offset_plus5(byte value) {
        segment.set(LAYOUT$pps_act_y_qp_offset_plus5, OFFSET$pps_act_y_qp_offset_plus5, value);
    }

    public byte pps_act_cb_qp_offset_plus5() {
        return segment.get(LAYOUT$pps_act_cb_qp_offset_plus5, OFFSET$pps_act_cb_qp_offset_plus5);
    }

    public void pps_act_cb_qp_offset_plus5(byte value) {
        segment.set(LAYOUT$pps_act_cb_qp_offset_plus5, OFFSET$pps_act_cb_qp_offset_plus5, value);
    }

    public byte pps_act_cr_qp_offset_plus3() {
        return segment.get(LAYOUT$pps_act_cr_qp_offset_plus3, OFFSET$pps_act_cr_qp_offset_plus3);
    }

    public void pps_act_cr_qp_offset_plus3(byte value) {
        segment.set(LAYOUT$pps_act_cr_qp_offset_plus3, OFFSET$pps_act_cr_qp_offset_plus3, value);
    }

    public @unsigned byte pps_num_palette_predictor_initializers() {
        return segment.get(LAYOUT$pps_num_palette_predictor_initializers, OFFSET$pps_num_palette_predictor_initializers);
    }

    public void pps_num_palette_predictor_initializers(@unsigned byte value) {
        segment.set(LAYOUT$pps_num_palette_predictor_initializers, OFFSET$pps_num_palette_predictor_initializers, value);
    }

    public @unsigned byte luma_bit_depth_entry_minus8() {
        return segment.get(LAYOUT$luma_bit_depth_entry_minus8, OFFSET$luma_bit_depth_entry_minus8);
    }

    public void luma_bit_depth_entry_minus8(@unsigned byte value) {
        segment.set(LAYOUT$luma_bit_depth_entry_minus8, OFFSET$luma_bit_depth_entry_minus8, value);
    }

    public @unsigned byte chroma_bit_depth_entry_minus8() {
        return segment.get(LAYOUT$chroma_bit_depth_entry_minus8, OFFSET$chroma_bit_depth_entry_minus8);
    }

    public void chroma_bit_depth_entry_minus8(@unsigned byte value) {
        segment.set(LAYOUT$chroma_bit_depth_entry_minus8, OFFSET$chroma_bit_depth_entry_minus8, value);
    }

    public @unsigned byte num_tile_columns_minus1() {
        return segment.get(LAYOUT$num_tile_columns_minus1, OFFSET$num_tile_columns_minus1);
    }

    public void num_tile_columns_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_tile_columns_minus1, OFFSET$num_tile_columns_minus1, value);
    }

    public @unsigned byte num_tile_rows_minus1() {
        return segment.get(LAYOUT$num_tile_rows_minus1, OFFSET$num_tile_rows_minus1);
    }

    public void num_tile_rows_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_tile_rows_minus1, OFFSET$num_tile_rows_minus1, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned byte reserved2() {
        return segment.get(LAYOUT$reserved2, OFFSET$reserved2);
    }

    public void reserved2(@unsigned byte value) {
        segment.set(LAYOUT$reserved2, OFFSET$reserved2, value);
    }

    public @unsigned short column_width_minus1() {
        return segment.get(LAYOUT$column_width_minus1, OFFSET$column_width_minus1);
    }

    public void column_width_minus1(@unsigned short value) {
        segment.set(LAYOUT$column_width_minus1, OFFSET$column_width_minus1, value);
    }

    public @unsigned short row_height_minus1() {
        return segment.get(LAYOUT$row_height_minus1, OFFSET$row_height_minus1);
    }

    public void row_height_minus1(@unsigned short value) {
        segment.set(LAYOUT$row_height_minus1, OFFSET$row_height_minus1, value);
    }

    public @unsigned int reserved3() {
        return segment.get(LAYOUT$reserved3, OFFSET$reserved3);
    }

    public void reserved3(@unsigned int value) {
        segment.set(LAYOUT$reserved3, OFFSET$reserved3, value);
    }

    public @pointer(comment="StdVideoH265ScalingLists*") MemorySegment pScalingListsRaw() {
        return segment.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);
    }

    public void pScalingListsRaw(@pointer(comment="StdVideoH265ScalingLists*") MemorySegment value) {
        segment.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);
    }

    public @Nullable StdVideoH265ScalingLists pScalingLists() {
        MemorySegment s = pScalingListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265ScalingLists(s);
    }

    public void pScalingLists(@Nullable StdVideoH265ScalingLists value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pScalingListsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265ScalingLists[] pScalingLists(int assumedCount) {
        MemorySegment s = pScalingListsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ScalingLists.SIZE);
        StdVideoH265ScalingLists[] ret = new StdVideoH265ScalingLists[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ScalingLists(s.asSlice(i * StdVideoH265ScalingLists.SIZE, StdVideoH265ScalingLists.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265PredictorPaletteEntries*") MemorySegment pPredictorPaletteEntriesRaw() {
        return segment.get(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries);
    }

    public void pPredictorPaletteEntriesRaw(@pointer(comment="StdVideoH265PredictorPaletteEntries*") MemorySegment value) {
        segment.set(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries, value);
    }

    public @Nullable StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
        MemorySegment s = pPredictorPaletteEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265PredictorPaletteEntries(s);
    }

    public void pPredictorPaletteEntries(@Nullable StdVideoH265PredictorPaletteEntries value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPredictorPaletteEntriesRaw(s);
    }

    @unsafe public @Nullable StdVideoH265PredictorPaletteEntries[] pPredictorPaletteEntries(int assumedCount) {
        MemorySegment s = pPredictorPaletteEntriesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265PredictorPaletteEntries.SIZE);
        StdVideoH265PredictorPaletteEntries[] ret = new StdVideoH265PredictorPaletteEntries[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265PredictorPaletteEntries(s.asSlice(i * StdVideoH265PredictorPaletteEntries.SIZE, StdVideoH265PredictorPaletteEntries.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
