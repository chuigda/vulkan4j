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

/// Represents a pointer to a {@code StdVideoH265SequenceParameterSet} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265SequenceParameterSet {
///     StdVideoH265SpsFlags flags; // @link substring="StdVideoH265SpsFlags" target="StdVideoH265SpsFlags" @link substring="flags" target="#flags"
///     StdVideoH265ChromaFormatIdc chroma_format_idc; // @link substring="StdVideoH265ChromaFormatIdc" target="StdVideoH265ChromaFormatIdc" @link substring="chroma_format_idc" target="#chroma_format_idc"
///     uint32_t pic_width_in_luma_samples; // @link substring="pic_width_in_luma_samples" target="#pic_width_in_luma_samples"
///     uint32_t pic_height_in_luma_samples; // @link substring="pic_height_in_luma_samples" target="#pic_height_in_luma_samples"
///     uint8_t sps_video_parameter_set_id; // @link substring="sps_video_parameter_set_id" target="#sps_video_parameter_set_id"
///     uint8_t sps_max_sub_layers_minus1; // @link substring="sps_max_sub_layers_minus1" target="#sps_max_sub_layers_minus1"
///     uint8_t sps_seq_parameter_set_id; // @link substring="sps_seq_parameter_set_id" target="#sps_seq_parameter_set_id"
///     uint8_t bit_depth_luma_minus8; // @link substring="bit_depth_luma_minus8" target="#bit_depth_luma_minus8"
///     uint8_t bit_depth_chroma_minus8; // @link substring="bit_depth_chroma_minus8" target="#bit_depth_chroma_minus8"
///     uint8_t log2_max_pic_order_cnt_lsb_minus4; // @link substring="log2_max_pic_order_cnt_lsb_minus4" target="#log2_max_pic_order_cnt_lsb_minus4"
///     uint8_t log2_min_luma_coding_block_size_minus3; // @link substring="log2_min_luma_coding_block_size_minus3" target="#log2_min_luma_coding_block_size_minus3"
///     uint8_t log2_diff_max_min_luma_coding_block_size; // @link substring="log2_diff_max_min_luma_coding_block_size" target="#log2_diff_max_min_luma_coding_block_size"
///     uint8_t log2_min_luma_transform_block_size_minus2; // @link substring="log2_min_luma_transform_block_size_minus2" target="#log2_min_luma_transform_block_size_minus2"
///     uint8_t log2_diff_max_min_luma_transform_block_size; // @link substring="log2_diff_max_min_luma_transform_block_size" target="#log2_diff_max_min_luma_transform_block_size"
///     uint8_t max_transform_hierarchy_depth_inter; // @link substring="max_transform_hierarchy_depth_inter" target="#max_transform_hierarchy_depth_inter"
///     uint8_t max_transform_hierarchy_depth_intra; // @link substring="max_transform_hierarchy_depth_intra" target="#max_transform_hierarchy_depth_intra"
///     uint8_t num_short_term_ref_pic_sets; // @link substring="num_short_term_ref_pic_sets" target="#num_short_term_ref_pic_sets"
///     uint8_t num_long_term_ref_pics_sps; // @link substring="num_long_term_ref_pics_sps" target="#num_long_term_ref_pics_sps"
///     uint8_t pcm_sample_bit_depth_luma_minus1; // @link substring="pcm_sample_bit_depth_luma_minus1" target="#pcm_sample_bit_depth_luma_minus1"
///     uint8_t pcm_sample_bit_depth_chroma_minus1; // @link substring="pcm_sample_bit_depth_chroma_minus1" target="#pcm_sample_bit_depth_chroma_minus1"
///     uint8_t log2_min_pcm_luma_coding_block_size_minus3; // @link substring="log2_min_pcm_luma_coding_block_size_minus3" target="#log2_min_pcm_luma_coding_block_size_minus3"
///     uint8_t log2_diff_max_min_pcm_luma_coding_block_size; // @link substring="log2_diff_max_min_pcm_luma_coding_block_size" target="#log2_diff_max_min_pcm_luma_coding_block_size"
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint8_t palette_max_size; // @link substring="palette_max_size" target="#palette_max_size"
///     uint8_t delta_palette_max_predictor_size; // @link substring="delta_palette_max_predictor_size" target="#delta_palette_max_predictor_size"
///     uint8_t motion_vector_resolution_control_idc; // @link substring="motion_vector_resolution_control_idc" target="#motion_vector_resolution_control_idc"
///     uint8_t sps_num_palette_predictor_initializers_minus1; // @link substring="sps_num_palette_predictor_initializers_minus1" target="#sps_num_palette_predictor_initializers_minus1"
///     uint32_t conf_win_left_offset; // @link substring="conf_win_left_offset" target="#conf_win_left_offset"
///     uint32_t conf_win_right_offset; // @link substring="conf_win_right_offset" target="#conf_win_right_offset"
///     uint32_t conf_win_top_offset; // @link substring="conf_win_top_offset" target="#conf_win_top_offset"
///     uint32_t conf_win_bottom_offset; // @link substring="conf_win_bottom_offset" target="#conf_win_bottom_offset"
///     StdVideoH265ProfileTierLevel const* pProfileTierLevel; // @link substring="StdVideoH265ProfileTierLevel" target="StdVideoH265ProfileTierLevel" @link substring="pProfileTierLevel" target="#pProfileTierLevel"
///     StdVideoH265DecPicBufMgr const* pDecPicBufMgr; // @link substring="StdVideoH265DecPicBufMgr" target="StdVideoH265DecPicBufMgr" @link substring="pDecPicBufMgr" target="#pDecPicBufMgr"
///     StdVideoH265ScalingLists const* pScalingLists; // @link substring="StdVideoH265ScalingLists" target="StdVideoH265ScalingLists" @link substring="pScalingLists" target="#pScalingLists"
///     StdVideoH265ShortTermRefPicSet const* pShortTermRefPicSet; // @link substring="StdVideoH265ShortTermRefPicSet" target="StdVideoH265ShortTermRefPicSet" @link substring="pShortTermRefPicSet" target="#pShortTermRefPicSet"
///     StdVideoH265LongTermRefPicsSps const* pLongTermRefPicsSps; // @link substring="StdVideoH265LongTermRefPicsSps" target="StdVideoH265LongTermRefPicsSps" @link substring="pLongTermRefPicsSps" target="#pLongTermRefPicsSps"
///     StdVideoH265SequenceParameterSetVui const* pSequenceParameterSetVui; // @link substring="StdVideoH265SequenceParameterSetVui" target="StdVideoH265SequenceParameterSetVui" @link substring="pSequenceParameterSetVui" target="#pSequenceParameterSetVui"
///     StdVideoH265PredictorPaletteEntries const* pPredictorPaletteEntries; // @link substring="StdVideoH265PredictorPaletteEntries" target="StdVideoH265PredictorPaletteEntries" @link substring="pPredictorPaletteEntries" target="#pPredictorPaletteEntries"
/// } StdVideoH265SequenceParameterSet;
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
public record StdVideoH265SequenceParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265SequenceParameterSet allocate(Arena arena) {
        return new StdVideoH265SequenceParameterSet(arena.allocate(LAYOUT));
    }

    public static StdVideoH265SequenceParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SequenceParameterSet[] ret = new StdVideoH265SequenceParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSet(segment.asSlice(i * BYTES, BYTES));
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

    public @NotNull StdVideoH265SpsFlags flags() {
        return new StdVideoH265SpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoH265SpsFlags value) {
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

    public @Nullable StdVideoH265ProfileTierLevel pProfileTierLevel() {
        MemorySegment s = pProfileTierLevelRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ProfileTierLevel.BYTES);
        StdVideoH265ProfileTierLevel[] ret = new StdVideoH265ProfileTierLevel[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevel(s.asSlice(i * StdVideoH265ProfileTierLevel.BYTES, StdVideoH265ProfileTierLevel.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265ProfileTierLevel.class) MemorySegment pProfileTierLevelRaw() {
        return segment.get(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel);
    }

    public void pProfileTierLevelRaw(@pointer(target=StdVideoH265ProfileTierLevel.class) MemorySegment value) {
        segment.set(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel, value);
    }

    public @Nullable StdVideoH265DecPicBufMgr pDecPicBufMgr() {
        MemorySegment s = pDecPicBufMgrRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265DecPicBufMgr.BYTES);
        StdVideoH265DecPicBufMgr[] ret = new StdVideoH265DecPicBufMgr[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265DecPicBufMgr(s.asSlice(i * StdVideoH265DecPicBufMgr.BYTES, StdVideoH265DecPicBufMgr.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265DecPicBufMgr.class) MemorySegment pDecPicBufMgrRaw() {
        return segment.get(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr);
    }

    public void pDecPicBufMgrRaw(@pointer(target=StdVideoH265DecPicBufMgr.class) MemorySegment value) {
        segment.set(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr, value);
    }

    public @Nullable StdVideoH265ScalingLists pScalingLists() {
        MemorySegment s = pScalingListsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ScalingLists.BYTES);
        StdVideoH265ScalingLists[] ret = new StdVideoH265ScalingLists[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ScalingLists(s.asSlice(i * StdVideoH265ScalingLists.BYTES, StdVideoH265ScalingLists.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265ScalingLists.class) MemorySegment pScalingListsRaw() {
        return segment.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);
    }

    public void pScalingListsRaw(@pointer(target=StdVideoH265ScalingLists.class) MemorySegment value) {
        segment.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);
    }

    public @Nullable StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
        MemorySegment s = pShortTermRefPicSetRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ShortTermRefPicSet.BYTES);
        StdVideoH265ShortTermRefPicSet[] ret = new StdVideoH265ShortTermRefPicSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ShortTermRefPicSet(s.asSlice(i * StdVideoH265ShortTermRefPicSet.BYTES, StdVideoH265ShortTermRefPicSet.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265ShortTermRefPicSet.class) MemorySegment pShortTermRefPicSetRaw() {
        return segment.get(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet);
    }

    public void pShortTermRefPicSetRaw(@pointer(target=StdVideoH265ShortTermRefPicSet.class) MemorySegment value) {
        segment.set(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet, value);
    }

    public @Nullable StdVideoH265LongTermRefPicsSps pLongTermRefPicsSps() {
        MemorySegment s = pLongTermRefPicsSpsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265LongTermRefPicsSps.BYTES);
        StdVideoH265LongTermRefPicsSps[] ret = new StdVideoH265LongTermRefPicsSps[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265LongTermRefPicsSps(s.asSlice(i * StdVideoH265LongTermRefPicsSps.BYTES, StdVideoH265LongTermRefPicsSps.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265LongTermRefPicsSps.class) MemorySegment pLongTermRefPicsSpsRaw() {
        return segment.get(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps);
    }

    public void pLongTermRefPicsSpsRaw(@pointer(target=StdVideoH265LongTermRefPicsSps.class) MemorySegment value) {
        segment.set(LAYOUT$pLongTermRefPicsSps, OFFSET$pLongTermRefPicsSps, value);
    }

    public @Nullable StdVideoH265SequenceParameterSetVui pSequenceParameterSetVui() {
        MemorySegment s = pSequenceParameterSetVuiRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SequenceParameterSetVui.BYTES);
        StdVideoH265SequenceParameterSetVui[] ret = new StdVideoH265SequenceParameterSetVui[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSetVui(s.asSlice(i * StdVideoH265SequenceParameterSetVui.BYTES, StdVideoH265SequenceParameterSetVui.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265SequenceParameterSetVui.class) MemorySegment pSequenceParameterSetVuiRaw() {
        return segment.get(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui);
    }

    public void pSequenceParameterSetVuiRaw(@pointer(target=StdVideoH265SequenceParameterSetVui.class) MemorySegment value) {
        segment.set(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui, value);
    }

    public @Nullable StdVideoH265PredictorPaletteEntries pPredictorPaletteEntries() {
        MemorySegment s = pPredictorPaletteEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265PredictorPaletteEntries.BYTES);
        StdVideoH265PredictorPaletteEntries[] ret = new StdVideoH265PredictorPaletteEntries[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265PredictorPaletteEntries(s.asSlice(i * StdVideoH265PredictorPaletteEntries.BYTES, StdVideoH265PredictorPaletteEntries.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265PredictorPaletteEntries.class) MemorySegment pPredictorPaletteEntriesRaw() {
        return segment.get(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries);
    }

    public void pPredictorPaletteEntriesRaw(@pointer(target=StdVideoH265PredictorPaletteEntries.class) MemorySegment value) {
        segment.set(LAYOUT$pPredictorPaletteEntries, OFFSET$pPredictorPaletteEntries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH265SpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("chroma_format_idc"),
        ValueLayout.JAVA_INT.withName("pic_width_in_luma_samples"),
        ValueLayout.JAVA_INT.withName("pic_height_in_luma_samples"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("sps_max_sub_layers_minus1"),
        ValueLayout.JAVA_BYTE.withName("sps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8"),
        ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
        ValueLayout.JAVA_BYTE.withName("log2_min_luma_coding_block_size_minus3"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_coding_block_size"),
        ValueLayout.JAVA_BYTE.withName("log2_min_luma_transform_block_size_minus2"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_luma_transform_block_size"),
        ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_inter"),
        ValueLayout.JAVA_BYTE.withName("max_transform_hierarchy_depth_intra"),
        ValueLayout.JAVA_BYTE.withName("num_short_term_ref_pic_sets"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_ref_pics_sps"),
        ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_luma_minus1"),
        ValueLayout.JAVA_BYTE.withName("pcm_sample_bit_depth_chroma_minus1"),
        ValueLayout.JAVA_BYTE.withName("log2_min_pcm_luma_coding_block_size_minus3"),
        ValueLayout.JAVA_BYTE.withName("log2_diff_max_min_pcm_luma_coding_block_size"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_BYTE.withName("palette_max_size"),
        ValueLayout.JAVA_BYTE.withName("delta_palette_max_predictor_size"),
        ValueLayout.JAVA_BYTE.withName("motion_vector_resolution_control_idc"),
        ValueLayout.JAVA_BYTE.withName("sps_num_palette_predictor_initializers_minus1"),
        ValueLayout.JAVA_INT.withName("conf_win_left_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_right_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_top_offset"),
        ValueLayout.JAVA_INT.withName("conf_win_bottom_offset"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ProfileTierLevel.LAYOUT).withName("pProfileTierLevel"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265DecPicBufMgr.LAYOUT).withName("pDecPicBufMgr"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ScalingLists.LAYOUT).withName("pScalingLists"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ShortTermRefPicSet.LAYOUT).withName("pShortTermRefPicSet"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265LongTermRefPicsSps.LAYOUT).withName("pLongTermRefPicsSps"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SequenceParameterSetVui.LAYOUT).withName("pSequenceParameterSetVui"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265PredictorPaletteEntries.LAYOUT).withName("pPredictorPaletteEntries")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$chroma_format_idc = (OfInt) LAYOUT.select(PATH$chroma_format_idc);
    public static final OfInt LAYOUT$pic_width_in_luma_samples = (OfInt) LAYOUT.select(PATH$pic_width_in_luma_samples);
    public static final OfInt LAYOUT$pic_height_in_luma_samples = (OfInt) LAYOUT.select(PATH$pic_height_in_luma_samples);
    public static final OfByte LAYOUT$sps_video_parameter_set_id = (OfByte) LAYOUT.select(PATH$sps_video_parameter_set_id);
    public static final OfByte LAYOUT$sps_max_sub_layers_minus1 = (OfByte) LAYOUT.select(PATH$sps_max_sub_layers_minus1);
    public static final OfByte LAYOUT$sps_seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$sps_seq_parameter_set_id);
    public static final OfByte LAYOUT$bit_depth_luma_minus8 = (OfByte) LAYOUT.select(PATH$bit_depth_luma_minus8);
    public static final OfByte LAYOUT$bit_depth_chroma_minus8 = (OfByte) LAYOUT.select(PATH$bit_depth_chroma_minus8);
    public static final OfByte LAYOUT$log2_max_pic_order_cnt_lsb_minus4 = (OfByte) LAYOUT.select(PATH$log2_max_pic_order_cnt_lsb_minus4);
    public static final OfByte LAYOUT$log2_min_luma_coding_block_size_minus3 = (OfByte) LAYOUT.select(PATH$log2_min_luma_coding_block_size_minus3);
    public static final OfByte LAYOUT$log2_diff_max_min_luma_coding_block_size = (OfByte) LAYOUT.select(PATH$log2_diff_max_min_luma_coding_block_size);
    public static final OfByte LAYOUT$log2_min_luma_transform_block_size_minus2 = (OfByte) LAYOUT.select(PATH$log2_min_luma_transform_block_size_minus2);
    public static final OfByte LAYOUT$log2_diff_max_min_luma_transform_block_size = (OfByte) LAYOUT.select(PATH$log2_diff_max_min_luma_transform_block_size);
    public static final OfByte LAYOUT$max_transform_hierarchy_depth_inter = (OfByte) LAYOUT.select(PATH$max_transform_hierarchy_depth_inter);
    public static final OfByte LAYOUT$max_transform_hierarchy_depth_intra = (OfByte) LAYOUT.select(PATH$max_transform_hierarchy_depth_intra);
    public static final OfByte LAYOUT$num_short_term_ref_pic_sets = (OfByte) LAYOUT.select(PATH$num_short_term_ref_pic_sets);
    public static final OfByte LAYOUT$num_long_term_ref_pics_sps = (OfByte) LAYOUT.select(PATH$num_long_term_ref_pics_sps);
    public static final OfByte LAYOUT$pcm_sample_bit_depth_luma_minus1 = (OfByte) LAYOUT.select(PATH$pcm_sample_bit_depth_luma_minus1);
    public static final OfByte LAYOUT$pcm_sample_bit_depth_chroma_minus1 = (OfByte) LAYOUT.select(PATH$pcm_sample_bit_depth_chroma_minus1);
    public static final OfByte LAYOUT$log2_min_pcm_luma_coding_block_size_minus3 = (OfByte) LAYOUT.select(PATH$log2_min_pcm_luma_coding_block_size_minus3);
    public static final OfByte LAYOUT$log2_diff_max_min_pcm_luma_coding_block_size = (OfByte) LAYOUT.select(PATH$log2_diff_max_min_pcm_luma_coding_block_size);
    public static final OfByte LAYOUT$palette_max_size = (OfByte) LAYOUT.select(PATH$palette_max_size);
    public static final OfByte LAYOUT$delta_palette_max_predictor_size = (OfByte) LAYOUT.select(PATH$delta_palette_max_predictor_size);
    public static final OfByte LAYOUT$motion_vector_resolution_control_idc = (OfByte) LAYOUT.select(PATH$motion_vector_resolution_control_idc);
    public static final OfByte LAYOUT$sps_num_palette_predictor_initializers_minus1 = (OfByte) LAYOUT.select(PATH$sps_num_palette_predictor_initializers_minus1);
    public static final OfInt LAYOUT$conf_win_left_offset = (OfInt) LAYOUT.select(PATH$conf_win_left_offset);
    public static final OfInt LAYOUT$conf_win_right_offset = (OfInt) LAYOUT.select(PATH$conf_win_right_offset);
    public static final OfInt LAYOUT$conf_win_top_offset = (OfInt) LAYOUT.select(PATH$conf_win_top_offset);
    public static final OfInt LAYOUT$conf_win_bottom_offset = (OfInt) LAYOUT.select(PATH$conf_win_bottom_offset);
    public static final AddressLayout LAYOUT$pProfileTierLevel = (AddressLayout) LAYOUT.select(PATH$pProfileTierLevel);
    public static final AddressLayout LAYOUT$pDecPicBufMgr = (AddressLayout) LAYOUT.select(PATH$pDecPicBufMgr);
    public static final AddressLayout LAYOUT$pScalingLists = (AddressLayout) LAYOUT.select(PATH$pScalingLists);
    public static final AddressLayout LAYOUT$pShortTermRefPicSet = (AddressLayout) LAYOUT.select(PATH$pShortTermRefPicSet);
    public static final AddressLayout LAYOUT$pLongTermRefPicsSps = (AddressLayout) LAYOUT.select(PATH$pLongTermRefPicsSps);
    public static final AddressLayout LAYOUT$pSequenceParameterSetVui = (AddressLayout) LAYOUT.select(PATH$pSequenceParameterSetVui);
    public static final AddressLayout LAYOUT$pPredictorPaletteEntries = (AddressLayout) LAYOUT.select(PATH$pPredictorPaletteEntries);

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
}
