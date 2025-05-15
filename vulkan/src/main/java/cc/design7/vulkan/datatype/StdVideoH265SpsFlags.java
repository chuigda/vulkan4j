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

public record StdVideoH265SpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = ValueLayout.JAVA_INT.withName("bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265SpsFlags allocate(Arena arena) {
        return new StdVideoH265SpsFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265SpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SpsFlags[] ret = new StdVideoH265SpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SpsFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265SpsFlags clone(Arena arena, StdVideoH265SpsFlags src) {
        StdVideoH265SpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265SpsFlags[] clone(Arena arena, StdVideoH265SpsFlags[] src) {
        StdVideoH265SpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = PathElement.groupElement("PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag");


    public static final long OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = LAYOUT.byteOffset(PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);

    public int sps_temporal_id_nesting_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void sps_temporal_id_nesting_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int separate_colour_plane_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void separate_colour_plane_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int conformance_window_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void conformance_window_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int sps_sub_layer_ordering_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void sps_sub_layer_ordering_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int scaling_list_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void scaling_list_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int sps_scaling_list_data_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void sps_scaling_list_data_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int amp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void amp_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int sample_adaptive_offset_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void sample_adaptive_offset_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int pcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void pcm_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int pcm_loop_filter_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void pcm_loop_filter_disabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int long_term_ref_pics_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void long_term_ref_pics_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int sps_temporal_mvp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void sps_temporal_mvp_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int strong_intra_smoothing_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 12, 13);
    }

    public void strong_intra_smoothing_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 12, 13, value);
    }

    public int vui_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 13, 14);
    }

    public void vui_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 13, 14, value);
    }

    public int sps_extension_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 14, 15);
    }

    public void sps_extension_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 14, 15, value);
    }

    public int sps_range_extension_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 15, 16);
    }

    public void sps_range_extension_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 15, 16, value);
    }

    public int transform_skip_rotation_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 16, 17);
    }

    public void transform_skip_rotation_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 16, 17, value);
    }

    public int transform_skip_context_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 17, 18);
    }

    public void transform_skip_context_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 17, 18, value);
    }

    public int implicit_rdpcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 18, 19);
    }

    public void implicit_rdpcm_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 18, 19, value);
    }

    public int explicit_rdpcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 19, 20);
    }

    public void explicit_rdpcm_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 19, 20, value);
    }

    public int extended_precision_processing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 20, 21);
    }

    public void extended_precision_processing_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 20, 21, value);
    }

    public int intra_smoothing_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 21, 22);
    }

    public void intra_smoothing_disabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 21, 22, value);
    }

    public int high_precision_offsets_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 22, 23);
    }

    public void high_precision_offsets_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 22, 23, value);
    }

    public int persistent_rice_adaptation_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 23, 24);
    }

    public void persistent_rice_adaptation_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 23, 24, value);
    }

    public int cabac_bypass_alignment_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 24, 25);
    }

    public void cabac_bypass_alignment_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 24, 25, value);
    }

    public int sps_scc_extension_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 25, 26);
    }

    public void sps_scc_extension_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 25, 26, value);
    }

    public int sps_curr_pic_ref_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 26, 27);
    }

    public void sps_curr_pic_ref_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 26, 27, value);
    }

    public int palette_mode_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 27, 28);
    }

    public void palette_mode_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 27, 28, value);
    }

    public int sps_palette_predictor_initializers_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 28, 29);
    }

    public void sps_palette_predictor_initializers_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 28, 29, value);
    }

    public int intra_boundary_filtering_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBits(s, 29, 30);
    }

    public void intra_boundary_filtering_disabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBits(s, 29, 30, value);
    }

}
/// dummy, not implemented yet
