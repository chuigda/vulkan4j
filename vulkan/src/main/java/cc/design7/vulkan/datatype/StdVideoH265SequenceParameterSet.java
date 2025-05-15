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

public record StdVideoH265SequenceParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoH265SpsFlags.LAYOUT.withName("flags");
    public static final OfInt LAYOUT$chroma_format_idc = ValueLayout.JAVA_INT.withName("chroma_format_idc");
    public static final OfInt LAYOUT$pic_width_in_luma_samples = ValueLayout.JAVA_INT.withName("pic_width_in_luma_samples");
    public static final OfInt LAYOUT$pic_height_in_luma_samples = ValueLayout.JAVA_INT.withName("pic_height_in_luma_samples");
    public static final OfByte LAYOUT$sps_video_parameter_set_id = ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id");
    public static final OfByte LAYOUT$sps_max_sub_layers_minus1 = ValueLayout.JAVA_BYTE.withName("sps_max_sub_layers_minus1");
    public static final OfByte LAYOUT$sps_seq_parameter_set_id = ValueLayout.JAVA_BYTE.withName("sps_seq_parameter_set_id");
    public static final OfByte LAYOUT$bit_depth_luma_minus8 = ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8");
    public static final OfByte LAYOUT$bit_depth_chroma_minus8 = ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8");
    public static final OfByte LAYOUT$log2_max_pic_order_cnt_lsb_minus4 = ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4");
    public static final OfByte LAYOUT$log2_min_luma_coding_block_size_minus3 = ValueLayout.JAVA_BYTE.withName("log2_min_luma_coding_block_size_minus3");
    public static final OfByte LAYOUT$log2_diff_max_min_luma_coding_block_size = ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_coding_block_size");
    public static final OfByte LAYOUT$log2_min_luma_transform_block_size_minus2 = ValueLayout.JAVA_BYTE.withName("log2_min_luma_transform_block_size_minus2");
    public static final OfByte LAYOUT$log2_diff_max_min_luma_transform_block_size = ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_transform_block_size");
    public static final OfByte LAYOUT$max_transform_hierarchy_depth_inter = ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_inter");
    public static final OfByte LAYOUT$max_transform_hierarchy_depth_intra = ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_intra");
    public static final OfByte LAYOUT$num_short_term_ref_pic_sets = ValueLayout.JAVA_BYTE.withName("num_short_term_ref_pic_sets");
    public static final OfByte LAYOUT$num_long_term_ref_pics_sps = ValueLayout.JAVA_BYTE.withName("num_long_term_ref_pics_sps");
    public static final OfByte LAYOUT$pcm_sample_bit_depth_luma_minus1 = ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_luma_minus1");
    public static final OfByte LAYOUT$pcm_sample_bit_depth_chroma_minus1 = ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_chroma_minus1");
    public static final OfByte LAYOUT$log2_min_pcm_luma_coding_block_size_minus3 = ValueLayout.JAVA_BYTE.withName("log2_min_pcm_luma_coding_block_size_minus3");
    public static final OfByte LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size = ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_pcm_luma_coding_block_size");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final OfByte LAYOUT$reserved2 = ValueLayout.JAVA_BYTE.withName("reserved2");
    public static final OfByte LAYOUT$palette_max_size = ValueLayout.JAVA_BYTE.withName("palette_max_size");
    public static final OfByte LAYOUT$delta_palette_max_predictor_size = ValueLayout.JAVA_BYTE.withName("delta_palette_max_predictor_size");
    public static final OfByte LAYOUT$motion_vector_resolution_control_idc = ValueLayout.JAVA_BYTE.withName("motion_vector_resolution_control_idc");
    public static final OfByte LAYOUT$sps_num_palette_predictor_initializers_minus1 = ValueLayout.JAVA_BYTE.withName("sps_num_palette_predictor_initializers_minus1");
    public static final OfInt LAYOUT$conf_win_left_offset = ValueLayout.JAVA_INT.withName("conf_win_left_offset");
    public static final OfInt LAYOUT$conf_win_right_offset = ValueLayout.JAVA_INT.withName("conf_win_right_offset");
    public static final OfInt LAYOUT$conf_win_top_offset = ValueLayout.JAVA_INT.withName("conf_win_top_offset");
    public static final OfInt LAYOUT$conf_win_bottom_offset = ValueLayout.JAVA_INT.withName("conf_win_bottom_offset");
    public static final AddressLayout LAYOUT$pProfileTierLevel = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ProfileTierLevel.LAYOUT).withName("pProfileTierLevel");
    public static final AddressLayout LAYOUT$pDecPicBufMgr = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265DecPicBufMgr.LAYOUT).withName("pDecPicBufMgr");
    public static final AddressLayout LAYOUT$pScalingLists = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ScalingLists.LAYOUT).withName("pScalingLists");
    public static final AddressLayout LAYOUT$pShortTermRefPicSet = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ShortTermRefPicSet.LAYOUT).withName("pShortTermRefPicSet");
    public static final AddressLayout LAYOUT$pLongTermRefPicsSps = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265LongTermRefPicsSps.LAYOUT).withName("pLongTermRefPicsSps");
    public static final AddressLayout LAYOUT$pSequenceParameterSetVui = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSetVui.LAYOUT).withName("pSequenceParameterSetVui");
    public static final AddressLayout LAYOUT$pPredictorPaletteEntries = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PredictorPaletteEntries.LAYOUT).withName("pPredictorPaletteEntries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$chroma_format_idc, LAYOUT$pic_width_in_luma_samples, LAYOUT$pic_height_in_luma_samples, LAYOUT$sps_video_parameter_set_id, LAYOUT$sps_max_sub_layers_minus1, LAYOUT$sps_seq_parameter_set_id, LAYOUT$bit_depth_luma_minus8, LAYOUT$bit_depth_chroma_minus8, LAYOUT$log2_max_pic_order_cnt_lsb_minus4, LAYOUT$log2_min_luma_coding_block_size_minus3, LAYOUT$log2_diff_max_min_luma_coding_block_size, LAYOUT$log2_min_luma_transform_block_size_minus2, LAYOUT$log2_diff_max_min_luma_transform_block_size, LAYOUT$max_transform_hierarchy_depth_inter, LAYOUT$max_transform_hierarchy_depth_intra, LAYOUT$num_short_term_ref_pic_sets, LAYOUT$num_long_term_ref_pics_sps, LAYOUT$pcm_sample_bit_depth_luma_minus1, LAYOUT$pcm_sample_bit_depth_chroma_minus1, LAYOUT$log2_min_pcm_luma_coding_block_size_minus3, LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size, LAYOUT$reserved1, LAYOUT$reserved2, LAYOUT$palette_max_size, LAYOUT$delta_palette_max_predictor_size, LAYOUT$motion_vector_resolution_control_idc, LAYOUT$sps_num_palette_predictor_initializers_minus1, LAYOUT$conf_win_left_offset, LAYOUT$conf_win_right_offset, LAYOUT$conf_win_top_offset, LAYOUT$conf_win_bottom_offset, LAYOUT$pProfileTierLevel, LAYOUT$pDecPicBufMgr, LAYOUT$pScalingLists, LAYOUT$pShortTermRefPicSet, LAYOUT$pLongTermRefPicsSps, LAYOUT$pSequenceParameterSetVui, LAYOUT$pPredictorPaletteEntries);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265SequenceParameterSet allocate(Arena arena) {
        return new StdVideoH265SequenceParameterSet(arena.allocate(LAYOUT));
    }

    public static StdVideoH265SequenceParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SequenceParameterSet[] ret = new StdVideoH265SequenceParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSet(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265SequenceParameterSet clone(Arena arena, StdVideoH265SequenceParameterSet src) {
        StdVideoH265SequenceParameterSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265SequenceParameterSet[] clone(Arena arena, StdVideoH265SequenceParameterSet[] src) {
        StdVideoH265SequenceParameterSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$chroma_format_idc = PathElement.groupElement("PATH$chroma_format_idc");
    public static final PathElement PATH$pic_width_in_luma_samples = PathElement.groupElement("PATH$pic_width_in_luma_samples");
    public static final PathElement PATH$pic_height_in_luma_samples = PathElement.groupElement("PATH$pic_height_in_luma_samples");
    public static final PathElement PATH$sps_video_parameter_set_id = PathElement.groupElement("PATH$sps_video_parameter_set_id");
    public static final PathElement PATH$sps_max_sub_layers_minus1 = PathElement.groupElement("PATH$sps_max_sub_layers_minus1");
    public static final PathElement PATH$sps_seq_parameter_set_id = PathElement.groupElement("PATH$sps_seq_parameter_set_id");
    public static final PathElement PATH$bit_depth_luma_minus8 = PathElement.groupElement("PATH$bit_depth_luma_minus8");
    public static final PathElement PATH$bit_depth_chroma_minus8 = PathElement.groupElement("PATH$bit_depth_chroma_minus8");
    public static final PathElement PATH$log2_max_pic_order_cnt_lsb_minus4 = PathElement.groupElement("PATH$log2_max_pic_order_cnt_lsb_minus4");
    public static final PathElement PATH$log2_min_luma_coding_block_size_minus3 = PathElement.groupElement("PATH$log2_min_luma_coding_block_size_minus3");
    public static final PathElement PATH$log2_diff_max_min_luma_coding_block_size = PathElement.groupElement("PATH$log2_diff_max_min_luma_coding_block_size");
    public static final PathElement PATH$log2_min_luma_transform_block_size_minus2 = PathElement.groupElement("PATH$log2_min_luma_transform_block_size_minus2");
    public static final PathElement PATH$log2_diff_max_min_luma_transform_block_size = PathElement.groupElement("PATH$log2_diff_max_min_luma_transform_block_size");
    public static final PathElement PATH$max_transform_hierarchy_depth_inter = PathElement.groupElement("PATH$max_transform_hierarchy_depth_inter");
    public static final PathElement PATH$max_transform_hierarchy_depth_intra = PathElement.groupElement("PATH$max_transform_hierarchy_depth_intra");
    public static final PathElement PATH$num_short_term_ref_pic_sets = PathElement.groupElement("PATH$num_short_term_ref_pic_sets");
    public static final PathElement PATH$num_long_term_ref_pics_sps = PathElement.groupElement("PATH$num_long_term_ref_pics_sps");
    public static final PathElement PATH$pcm_sample_bit_depth_luma_minus1 = PathElement.groupElement("PATH$pcm_sample_bit_depth_luma_minus1");
    public static final PathElement PATH$pcm_sample_bit_depth_chroma_minus1 = PathElement.groupElement("PATH$pcm_sample_bit_depth_chroma_minus1");
    public static final PathElement PATH$log2_min_pcm_luma_coding_block_size_minus3 = PathElement.groupElement("PATH$log2_min_pcm_luma_coding_block_size_minus3");
    public static final PathElement PATH$log2_diff_max_min_pcm_luma_coding_block_size = PathElement.groupElement("PATH$log2_diff_max_min_pcm_luma_coding_block_size");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$palette_max_size = PathElement.groupElement("PATH$palette_max_size");
    public static final PathElement PATH$delta_palette_max_predictor_size = PathElement.groupElement("PATH$delta_palette_max_predictor_size");
    public static final PathElement PATH$motion_vector_resolution_control_idc = PathElement.groupElement("PATH$motion_vector_resolution_control_idc");
    public static final PathElement PATH$sps_num_palette_predictor_initializers_minus1 = PathElement.groupElement("PATH$sps_num_palette_predictor_initializers_minus1");
    public static final PathElement PATH$conf_win_left_offset = PathElement.groupElement("PATH$conf_win_left_offset");
    public static final PathElement PATH$conf_win_right_offset = PathElement.groupElement("PATH$conf_win_right_offset");
    public static final PathElement PATH$conf_win_top_offset = PathElement.groupElement("PATH$conf_win_top_offset");
    public static final PathElement PATH$conf_win_bottom_offset = PathElement.groupElement("PATH$conf_win_bottom_offset");
    public static final PathElement PATH$pProfileTierLevel = PathElement.groupElement("PATH$pProfileTierLevel");
    public static final PathElement PATH$pDecPicBufMgr = PathElement.groupElement("PATH$pDecPicBufMgr");
    public static final PathElement PATH$pScalingLists = PathElement.groupElement("PATH$pScalingLists");
    public static final PathElement PATH$pShortTermRefPicSet = PathElement.groupElement("PATH$pShortTermRefPicSet");
    public static final PathElement PATH$pLongTermRefPicsSps = PathElement.groupElement("PATH$pLongTermRefPicsSps");
    public static final PathElement PATH$pSequenceParameterSetVui = PathElement.groupElement("PATH$pSequenceParameterSetVui");
    public static final PathElement PATH$pPredictorPaletteEntries = PathElement.groupElement("PATH$pPredictorPaletteEntries");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$chroma_format_idc = LAYOUT$chroma_format_idc.byteSize();
    public static final long SIZE$pic_width_in_luma_samples = LAYOUT$pic_width_in_luma_samples.byteSize();
    public static final long SIZE$pic_height_in_luma_samples = LAYOUT$pic_height_in_luma_samples.byteSize();
    public static final long SIZE$sps_video_parameter_set_id = LAYOUT$sps_video_parameter_set_id.byteSize();
    public static final long SIZE$sps_max_sub_layers_minus1 = LAYOUT$sps_max_sub_layers_minus1.byteSize();
    public static final long SIZE$sps_seq_parameter_set_id = LAYOUT$sps_seq_parameter_set_id.byteSize();
    public static final long SIZE$bit_depth_luma_minus8 = LAYOUT$bit_depth_luma_minus8.byteSize();
    public static final long SIZE$bit_depth_chroma_minus8 = LAYOUT$bit_depth_chroma_minus8.byteSize();
    public static final long SIZE$log2_max_pic_order_cnt_lsb_minus4 = LAYOUT$log2_max_pic_order_cnt_lsb_minus4.byteSize();
    public static final long SIZE$log2_min_luma_coding_block_size_minus3 = LAYOUT$log2_min_luma_coding_block_size_minus3.byteSize();
    public static final long SIZE$log2_diff_max_min_luma_coding_block_size = LAYOUT$log2_diff_max_min_luma_coding_block_size.byteSize();
    public static final long SIZE$log2_min_luma_transform_block_size_minus2 = LAYOUT$log2_min_luma_transform_block_size_minus2.byteSize();
    public static final long SIZE$log2_diff_max_min_luma_transform_block_size = LAYOUT$log2_diff_max_min_luma_transform_block_size.byteSize();
    public static final long SIZE$max_transform_hierarchy_depth_inter = LAYOUT$max_transform_hierarchy_depth_inter.byteSize();
    public static final long SIZE$max_transform_hierarchy_depth_intra = LAYOUT$max_transform_hierarchy_depth_intra.byteSize();
    public static final long SIZE$num_short_term_ref_pic_sets = LAYOUT$num_short_term_ref_pic_sets.byteSize();
    public static final long SIZE$num_long_term_ref_pics_sps = LAYOUT$num_long_term_ref_pics_sps.byteSize();
    public static final long SIZE$pcm_sample_bit_depth_luma_minus1 = LAYOUT$pcm_sample_bit_depth_luma_minus1.byteSize();
    public static final long SIZE$pcm_sample_bit_depth_chroma_minus1 = LAYOUT$pcm_sample_bit_depth_chroma_minus1.byteSize();
    public static final long SIZE$log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT$log2_min_pcm_luma_coding_block_size_minus3.byteSize();
    public static final long SIZE$log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$palette_max_size = LAYOUT$palette_max_size.byteSize();
    public static final long SIZE$delta_palette_max_predictor_size = LAYOUT$delta_palette_max_predictor_size.byteSize();
    public static final long SIZE$motion_vector_resolution_control_idc = LAYOUT$motion_vector_resolution_control_idc.byteSize();
    public static final long SIZE$sps_num_palette_predictor_initializers_minus1 = LAYOUT$sps_num_palette_predictor_initializers_minus1.byteSize();
    public static final long SIZE$conf_win_left_offset = LAYOUT$conf_win_left_offset.byteSize();
    public static final long SIZE$conf_win_right_offset = LAYOUT$conf_win_right_offset.byteSize();
    public static final long SIZE$conf_win_top_offset = LAYOUT$conf_win_top_offset.byteSize();
    public static final long SIZE$conf_win_bottom_offset = LAYOUT$conf_win_bottom_offset.byteSize();
    public static final long SIZE$pProfileTierLevel = LAYOUT$pProfileTierLevel.byteSize();
    public static final long SIZE$pDecPicBufMgr = LAYOUT$pDecPicBufMgr.byteSize();
    public static final long SIZE$pScalingLists = LAYOUT$pScalingLists.byteSize();
    public static final long SIZE$pShortTermRefPicSet = LAYOUT$pShortTermRefPicSet.byteSize();
    public static final long SIZE$pLongTermRefPicsSps = LAYOUT$pLongTermRefPicsSps.byteSize();
    public static final long SIZE$pSequenceParameterSetVui = LAYOUT$pSequenceParameterSetVui.byteSize();
    public static final long SIZE$pPredictorPaletteEntries = LAYOUT$pPredictorPaletteEntries.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$chroma_format_idc = LAYOUT.byteOffset(PATH$chroma_format_idc);
    public static final long OFFSET$pic_width_in_luma_samples = LAYOUT.byteOffset(PATH$pic_width_in_luma_samples);
    public static final long OFFSET$pic_height_in_luma_samples = LAYOUT.byteOffset(PATH$pic_height_in_luma_samples);
    public static final long OFFSET$sps_video_parameter_set_id = LAYOUT.byteOffset(PATH$sps_video_parameter_set_id);
    public static final long OFFSET$sps_max_sub_layers_minus1 = LAYOUT.byteOffset(PATH$sps_max_sub_layers_minus1);
    public static final long OFFSET$sps_seq_parameter_set_id = LAYOUT.byteOffset(PATH$sps_seq_parameter_set_id);
    public static final long OFFSET$bit_depth_luma_minus8 = LAYOUT.byteOffset(PATH$bit_depth_luma_minus8);
    public static final long OFFSET$bit_depth_chroma_minus8 = LAYOUT.byteOffset(PATH$bit_depth_chroma_minus8);
    public static final long OFFSET$log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.byteOffset(PATH$log2_max_pic_order_cnt_lsb_minus4);
    public static final long OFFSET$log2_min_luma_coding_block_size_minus3 = LAYOUT.byteOffset(PATH$log2_min_luma_coding_block_size_minus3);
    public static final long OFFSET$log2_diff_max_min_luma_coding_block_size = LAYOUT.byteOffset(PATH$log2_diff_max_min_luma_coding_block_size);
    public static final long OFFSET$log2_min_luma_transform_block_size_minus2 = LAYOUT.byteOffset(PATH$log2_min_luma_transform_block_size_minus2);
    public static final long OFFSET$log2_diff_max_min_luma_transform_block_size = LAYOUT.byteOffset(PATH$log2_diff_max_min_luma_transform_block_size);
    public static final long OFFSET$max_transform_hierarchy_depth_inter = LAYOUT.byteOffset(PATH$max_transform_hierarchy_depth_inter);
    public static final long OFFSET$max_transform_hierarchy_depth_intra = LAYOUT.byteOffset(PATH$max_transform_hierarchy_depth_intra);
    public static final long OFFSET$num_short_term_ref_pic_sets = LAYOUT.byteOffset(PATH$num_short_term_ref_pic_sets);
    public static final long OFFSET$num_long_term_ref_pics_sps = LAYOUT.byteOffset(PATH$num_long_term_ref_pics_sps);
    public static final long OFFSET$pcm_sample_bit_depth_luma_minus1 = LAYOUT.byteOffset(PATH$pcm_sample_bit_depth_luma_minus1);
    public static final long OFFSET$pcm_sample_bit_depth_chroma_minus1 = LAYOUT.byteOffset(PATH$pcm_sample_bit_depth_chroma_minus1);
    public static final long OFFSET$log2_min_pcm_luma_coding_block_size_minus3 = LAYOUT.byteOffset(PATH$log2_min_pcm_luma_coding_block_size_minus3);
    public static final long OFFSET$log2_diff_max_min_pcm_luma_coding_block_size = LAYOUT.byteOffset(PATH$log2_diff_max_min_pcm_luma_coding_block_size);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$palette_max_size = LAYOUT.byteOffset(PATH$palette_max_size);
    public static final long OFFSET$delta_palette_max_predictor_size = LAYOUT.byteOffset(PATH$delta_palette_max_predictor_size);
    public static final long OFFSET$motion_vector_resolution_control_idc = LAYOUT.byteOffset(PATH$motion_vector_resolution_control_idc);
    public static final long OFFSET$sps_num_palette_predictor_initializers_minus1 = LAYOUT.byteOffset(PATH$sps_num_palette_predictor_initializers_minus1);
    public static final long OFFSET$conf_win_left_offset = LAYOUT.byteOffset(PATH$conf_win_left_offset);
    public static final long OFFSET$conf_win_right_offset = LAYOUT.byteOffset(PATH$conf_win_right_offset);
    public static final long OFFSET$conf_win_top_offset = LAYOUT.byteOffset(PATH$conf_win_top_offset);
    public static final long OFFSET$conf_win_bottom_offset = LAYOUT.byteOffset(PATH$conf_win_bottom_offset);
    public static final long OFFSET$pProfileTierLevel = LAYOUT.byteOffset(PATH$pProfileTierLevel);
    public static final long OFFSET$pDecPicBufMgr = LAYOUT.byteOffset(PATH$pDecPicBufMgr);
    public static final long OFFSET$pScalingLists = LAYOUT.byteOffset(PATH$pScalingLists);
    public static final long OFFSET$pShortTermRefPicSet = LAYOUT.byteOffset(PATH$pShortTermRefPicSet);
    public static final long OFFSET$pLongTermRefPicsSps = LAYOUT.byteOffset(PATH$pLongTermRefPicsSps);
    public static final long OFFSET$pSequenceParameterSetVui = LAYOUT.byteOffset(PATH$pSequenceParameterSetVui);
    public static final long OFFSET$pPredictorPaletteEntries = LAYOUT.byteOffset(PATH$pPredictorPaletteEntries);

    public StdVideoH265SpsFlags flags() {
        return new StdVideoH265SpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265SpsFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265ChromaFormatIdc.class) int chroma_format_idc() {
        return segment.get(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc);
    }

    public void chroma_format_idc(@enumtype(StdVideoH265ChromaFormatIdc.class) int value) {
        segment.set(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc, value);
    }

    public @unsigned int pic_width_in_luma_samples() {
        return segment.get(LAYOUT$pic_width_in_luma_samples, OFFSET$pic_width_in_luma_samples);
    }

    public void pic_width_in_luma_samples(@unsigned int value) {
        segment.set(LAYOUT$pic_width_in_luma_samples, OFFSET$pic_width_in_luma_samples, value);
    }

    public @unsigned int pic_height_in_luma_samples() {
        return segment.get(LAYOUT$pic_height_in_luma_samples, OFFSET$pic_height_in_luma_samples);
    }

    public void pic_height_in_luma_samples(@unsigned int value) {
        segment.set(LAYOUT$pic_height_in_luma_samples, OFFSET$pic_height_in_luma_samples, value);
    }

    public @unsigned byte sps_video_parameter_set_id() {
        return segment.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);
    }

    public void sps_video_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, value);
    }

    public @unsigned byte sps_max_sub_layers_minus1() {
        return segment.get(LAYOUT$sps_max_sub_layers_minus1, OFFSET$sps_max_sub_layers_minus1);
    }

    public void sps_max_sub_layers_minus1(@unsigned byte value) {
        segment.set(LAYOUT$sps_max_sub_layers_minus1, OFFSET$sps_max_sub_layers_minus1, value);
    }

    public @unsigned byte sps_seq_parameter_set_id() {
        return segment.get(LAYOUT$sps_seq_parameter_set_id, OFFSET$sps_seq_parameter_set_id);
    }

    public void sps_seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$sps_seq_parameter_set_id, OFFSET$sps_seq_parameter_set_id, value);
    }

    public @unsigned byte bit_depth_luma_minus8() {
        return segment.get(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8);
    }

    public void bit_depth_luma_minus8(@unsigned byte value) {
        segment.set(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8, value);
    }

    public @unsigned byte bit_depth_chroma_minus8() {
        return segment.get(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8);
    }

    public void bit_depth_chroma_minus8(@unsigned byte value) {
        segment.set(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8, value);
    }

    public @unsigned byte log2_max_pic_order_cnt_lsb_minus4() {
        return segment.get(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4);
    }

    public void log2_max_pic_order_cnt_lsb_minus4(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4, value);
    }

    public @unsigned byte log2_min_luma_coding_block_size_minus3() {
        return segment.get(LAYOUT$log2_min_luma_coding_block_size_minus3, OFFSET$log2_min_luma_coding_block_size_minus3);
    }

    public void log2_min_luma_coding_block_size_minus3(@unsigned byte value) {
        segment.set(LAYOUT$log2_min_luma_coding_block_size_minus3, OFFSET$log2_min_luma_coding_block_size_minus3, value);
    }

    public @unsigned byte log2_diff_max_min_luma_coding_block_size() {
        return segment.get(LAYOUT$log2_diff_max_min_luma_coding_block_size, OFFSET$log2_diff_max_min_luma_coding_block_size);
    }

    public void log2_diff_max_min_luma_coding_block_size(@unsigned byte value) {
        segment.set(LAYOUT$log2_diff_max_min_luma_coding_block_size, OFFSET$log2_diff_max_min_luma_coding_block_size, value);
    }

    public @unsigned byte log2_min_luma_transform_block_size_minus2() {
        return segment.get(LAYOUT$log2_min_luma_transform_block_size_minus2, OFFSET$log2_min_luma_transform_block_size_minus2);
    }

    public void log2_min_luma_transform_block_size_minus2(@unsigned byte value) {
        segment.set(LAYOUT$log2_min_luma_transform_block_size_minus2, OFFSET$log2_min_luma_transform_block_size_minus2, value);
    }

    public @unsigned byte log2_diff_max_min_luma_transform_block_size() {
        return segment.get(LAYOUT$log2_diff_max_min_luma_transform_block_size, OFFSET$log2_diff_max_min_luma_transform_block_size);
    }

    public void log2_diff_max_min_luma_transform_block_size(@unsigned byte value) {
        segment.set(LAYOUT$log2_diff_max_min_luma_transform_block_size, OFFSET$log2_diff_max_min_luma_transform_block_size, value);
    }

    public @unsigned byte max_transform_hierarchy_depth_inter() {
        return segment.get(LAYOUT$max_transform_hierarchy_depth_inter, OFFSET$max_transform_hierarchy_depth_inter);
    }

    public void max_transform_hierarchy_depth_inter(@unsigned byte value) {
        segment.set(LAYOUT$max_transform_hierarchy_depth_inter, OFFSET$max_transform_hierarchy_depth_inter, value);
    }

    public @unsigned byte max_transform_hierarchy_depth_intra() {
        return segment.get(LAYOUT$max_transform_hierarchy_depth_intra, OFFSET$max_transform_hierarchy_depth_intra);
    }

    public void max_transform_hierarchy_depth_intra(@unsigned byte value) {
        segment.set(LAYOUT$max_transform_hierarchy_depth_intra, OFFSET$max_transform_hierarchy_depth_intra, value);
    }

    public @unsigned byte num_short_term_ref_pic_sets() {
        return segment.get(LAYOUT$num_short_term_ref_pic_sets, OFFSET$num_short_term_ref_pic_sets);
    }

    public void num_short_term_ref_pic_sets(@unsigned byte value) {
        segment.set(LAYOUT$num_short_term_ref_pic_sets, OFFSET$num_short_term_ref_pic_sets, value);
    }

    public @unsigned byte num_long_term_ref_pics_sps() {
        return segment.get(LAYOUT$num_long_term_ref_pics_sps, OFFSET$num_long_term_ref_pics_sps);
    }

    public void num_long_term_ref_pics_sps(@unsigned byte value) {
        segment.set(LAYOUT$num_long_term_ref_pics_sps, OFFSET$num_long_term_ref_pics_sps, value);
    }

    public @unsigned byte pcm_sample_bit_depth_luma_minus1() {
        return segment.get(LAYOUT$pcm_sample_bit_depth_luma_minus1, OFFSET$pcm_sample_bit_depth_luma_minus1);
    }

    public void pcm_sample_bit_depth_luma_minus1(@unsigned byte value) {
        segment.set(LAYOUT$pcm_sample_bit_depth_luma_minus1, OFFSET$pcm_sample_bit_depth_luma_minus1, value);
    }

    public @unsigned byte pcm_sample_bit_depth_chroma_minus1() {
        return segment.get(LAYOUT$pcm_sample_bit_depth_chroma_minus1, OFFSET$pcm_sample_bit_depth_chroma_minus1);
    }

    public void pcm_sample_bit_depth_chroma_minus1(@unsigned byte value) {
        segment.set(LAYOUT$pcm_sample_bit_depth_chroma_minus1, OFFSET$pcm_sample_bit_depth_chroma_minus1, value);
    }

    public @unsigned byte log2_min_pcm_luma_coding_block_size_minus3() {
        return segment.get(LAYOUT$log2_min_pcm_luma_coding_block_size_minus3, OFFSET$log2_min_pcm_luma_coding_block_size_minus3);
    }

    public void log2_min_pcm_luma_coding_block_size_minus3(@unsigned byte value) {
        segment.set(LAYOUT$log2_min_pcm_luma_coding_block_size_minus3, OFFSET$log2_min_pcm_luma_coding_block_size_minus3, value);
    }

    public @unsigned byte log2_diff_max_min_pcm_luma_coding_block_size() {
        return segment.get(LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size, OFFSET$log2_diff_max_min_pcm_luma_coding_block_size);
    }

    public void log2_diff_max_min_pcm_luma_coding_block_size(@unsigned byte value) {
        segment.set(LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size, OFFSET$log2_diff_max_min_pcm_luma_coding_block_size, value);
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

    public @unsigned byte palette_max_size() {
        return segment.get(LAYOUT$palette_max_size, OFFSET$palette_max_size);
    }

    public void palette_max_size(@unsigned byte value) {
        segment.set(LAYOUT$palette_max_size, OFFSET$palette_max_size, value);
    }

    public @unsigned byte delta_palette_max_predictor_size() {
        return segment.get(LAYOUT$delta_palette_max_predictor_size, OFFSET$delta_palette_max_predictor_size);
    }

    public void delta_palette_max_predictor_size(@unsigned byte value) {
        segment.set(LAYOUT$delta_palette_max_predictor_size, OFFSET$delta_palette_max_predictor_size, value);
    }

    public @unsigned byte motion_vector_resolution_control_idc() {
        return segment.get(LAYOUT$motion_vector_resolution_control_idc, OFFSET$motion_vector_resolution_control_idc);
    }

    public void motion_vector_resolution_control_idc(@unsigned byte value) {
        segment.set(LAYOUT$motion_vector_resolution_control_idc, OFFSET$motion_vector_resolution_control_idc, value);
    }

    public @unsigned byte sps_num_palette_predictor_initializers_minus1() {
        return segment.get(LAYOUT$sps_num_palette_predictor_initializers_minus1, OFFSET$sps_num_palette_predictor_initializers_minus1);
    }

    public void sps_num_palette_predictor_initializers_minus1(@unsigned byte value) {
        segment.set(LAYOUT$sps_num_palette_predictor_initializers_minus1, OFFSET$sps_num_palette_predictor_initializers_minus1, value);
    }

    public @unsigned int conf_win_left_offset() {
        return segment.get(LAYOUT$conf_win_left_offset, OFFSET$conf_win_left_offset);
    }

    public void conf_win_left_offset(@unsigned int value) {
        segment.set(LAYOUT$conf_win_left_offset, OFFSET$conf_win_left_offset, value);
    }

    public @unsigned int conf_win_right_offset() {
        return segment.get(LAYOUT$conf_win_right_offset, OFFSET$conf_win_right_offset);
    }

    public void conf_win_right_offset(@unsigned int value) {
        segment.set(LAYOUT$conf_win_right_offset, OFFSET$conf_win_right_offset, value);
    }

    public @unsigned int conf_win_top_offset() {
        return segment.get(LAYOUT$conf_win_top_offset, OFFSET$conf_win_top_offset);
    }

    public void conf_win_top_offset(@unsigned int value) {
        segment.set(LAYOUT$conf_win_top_offset, OFFSET$conf_win_top_offset, value);
    }

    public @unsigned int conf_win_bottom_offset() {
        return segment.get(LAYOUT$conf_win_bottom_offset, OFFSET$conf_win_bottom_offset);
    }

    public void conf_win_bottom_offset(@unsigned int value) {
        segment.set(LAYOUT$conf_win_bottom_offset, OFFSET$conf_win_bottom_offset, value);
    }

    public @pointer(comment="StdVideoH265ProfileTierLevel*") MemorySegment pProfileTierLevelRaw() {
        return segment.get(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel);
    }

    public void pProfileTierLevelRaw(@pointer(comment="StdVideoH265ProfileTierLevel*") MemorySegment value) {
        segment.set(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel, value);
    }

    public @Nullable StdVideoH265ProfileTierLevel pProfileTierLevel() {
        MemorySegment s = pProfileTierLevelRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265ProfileTierLevel(s);
    }

    public void pProfileTierLevel(@Nullable StdVideoH265ProfileTierLevel value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pProfileTierLevelRaw(s);
    }

    @unsafe public @Nullable StdVideoH265ProfileTierLevel[] pProfileTierLevel(int assumedCount) {
        MemorySegment s = pProfileTierLevelRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ProfileTierLevel.SIZE);
        StdVideoH265ProfileTierLevel[] ret = new StdVideoH265ProfileTierLevel[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevel(s.asSlice(i * StdVideoH265ProfileTierLevel.SIZE, StdVideoH265ProfileTierLevel.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265DecPicBufMgr*") MemorySegment pDecPicBufMgrRaw() {
        return segment.get(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr);
    }

    public void pDecPicBufMgrRaw(@pointer(comment="StdVideoH265DecPicBufMgr*") MemorySegment value) {
        segment.set(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr, value);
    }

    public @Nullable StdVideoH265DecPicBufMgr pDecPicBufMgr() {
        MemorySegment s = pDecPicBufMgrRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265DecPicBufMgr(s);
    }

    public void pDecPicBufMgr(@Nullable StdVideoH265DecPicBufMgr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDecPicBufMgrRaw(s);
    }

    @unsafe public @Nullable StdVideoH265DecPicBufMgr[] pDecPicBufMgr(int assumedCount) {
        MemorySegment s = pDecPicBufMgrRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265DecPicBufMgr.SIZE);
        StdVideoH265DecPicBufMgr[] ret = new StdVideoH265DecPicBufMgr[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265DecPicBufMgr(s.asSlice(i * StdVideoH265DecPicBufMgr.SIZE, StdVideoH265DecPicBufMgr.SIZE));
        }
        return ret;
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

    public @pointer(comment="StdVideoH265ShortTermRefPicSet*") MemorySegment pShortTermRefPicSetRaw() {
        return segment.get(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet);
    }

    public void pShortTermRefPicSetRaw(@pointer(comment="StdVideoH265ShortTermRefPicSet*") MemorySegment value) {
        segment.set(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet, value);
    }

    public @Nullable StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
        MemorySegment s = pShortTermRefPicSetRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265ShortTermRefPicSet(s);
    }

    public void pShortTermRefPicSet(@Nullable StdVideoH265ShortTermRefPicSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShortTermRefPicSetRaw(s);
    }

    @unsafe public @Nullable StdVideoH265ShortTermRefPicSet[] pShortTermRefPicSet(int assumedCount) {
        MemorySegment s = pShortTermRefPicSetRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ShortTermRefPicSet.SIZE);
        StdVideoH265ShortTermRefPicSet[] ret = new StdVideoH265ShortTermRefPicSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ShortTermRefPicSet(s.asSlice(i * StdVideoH265ShortTermRefPicSet.SIZE, StdVideoH265ShortTermRefPicSet.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265LongTermRefPicsSps*") MemorySegment pLongTermRefPicsSpsRaw() {
        return segment.get(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps);
    }

    public void pLongTermRefPicsSpsRaw(@pointer(comment="StdVideoH265LongTermRefPicsSps*") MemorySegment value) {
        segment.set(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps, value);
    }

    public @Nullable StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
        MemorySegment s = pLongTermRefPicsSpsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265LongTermRefPicsSps(s);
    }

    public void pLongTermRefPicsSps(@Nullable StdVideoH265LongTermRefPicsSps value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLongTermRefPicsSpsRaw(s);
    }

    @unsafe public @Nullable StdVideoH265LongTermRefPicsSps[] pLongTermRefPicsSps(int assumedCount) {
        MemorySegment s = pLongTermRefPicsSpsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265LongTermRefPicsSps.SIZE);
        StdVideoH265LongTermRefPicsSps[] ret = new StdVideoH265LongTermRefPicsSps[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265LongTermRefPicsSps(s.asSlice(i * StdVideoH265LongTermRefPicsSps.SIZE, StdVideoH265LongTermRefPicsSps.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265SequenceParameterSetVui*") MemorySegment pSequenceParameterSetVuiRaw() {
        return segment.get(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui);
    }

    public void pSequenceParameterSetVuiRaw(@pointer(comment="StdVideoH265SequenceParameterSetVui*") MemorySegment value) {
        segment.set(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui, value);
    }

    public @Nullable StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
        MemorySegment s = pSequenceParameterSetVuiRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265SequenceParameterSetVui(s);
    }

    public void pSequenceParameterSetVui(@Nullable StdVideoH265SequenceParameterSetVui value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSequenceParameterSetVuiRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SequenceParameterSetVui[] pSequenceParameterSetVui(int assumedCount) {
        MemorySegment s = pSequenceParameterSetVuiRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SequenceParameterSetVui.SIZE);
        StdVideoH265SequenceParameterSetVui[] ret = new StdVideoH265SequenceParameterSetVui[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSetVui(s.asSlice(i * StdVideoH265SequenceParameterSetVui.SIZE, StdVideoH265SequenceParameterSetVui.SIZE));
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
