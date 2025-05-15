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

/// Represents a pointer to a {@code StdVideoH265SpsFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265SpsFlags {
///     uint32_t sps_temporal_id_nesting_flag : 1;
///     uint32_t separate_colour_plane_flag : 1;
///     uint32_t conformance_window_flag : 1;
///     uint32_t sps_sub_layer_ordering_info_present_flag : 1;
///     uint32_t scaling_list_enabled_flag : 1;
///     uint32_t sps_scaling_list_data_present_flag : 1;
///     uint32_t amp_enabled_flag : 1;
///     uint32_t sample_adaptive_offset_enabled_flag : 1;
///     uint32_t pcm_enabled_flag : 1;
///     uint32_t pcm_loop_filter_disabled_flag : 1;
///     uint32_t long_term_ref_pics_present_flag : 1;
///     uint32_t sps_temporal_mvp_enabled_flag : 1;
///     uint32_t strong_intra_smoothing_enabled_flag : 1;
///     uint32_t vui_parameters_present_flag : 1;
///     uint32_t sps_extension_present_flag : 1;
///     uint32_t sps_range_extension_flag : 1;
///     uint32_t transform_skip_rotation_enabled_flag : 1;
///     uint32_t transform_skip_context_enabled_flag : 1;
///     uint32_t implicit_rdpcm_enabled_flag : 1;
///     uint32_t explicit_rdpcm_enabled_flag : 1;
///     uint32_t extended_precision_processing_flag : 1;
///     uint32_t intra_smoothing_disabled_flag : 1;
///     uint32_t high_precision_offsets_enabled_flag : 1;
///     uint32_t persistent_rice_adaptation_enabled_flag : 1;
///     uint32_t cabac_bypass_alignment_enabled_flag : 1;
///     uint32_t sps_scc_extension_flag : 1;
///     uint32_t sps_curr_pic_ref_enabled_flag : 1;
///     uint32_t palette_mode_enabled_flag : 1;
///     uint32_t sps_palette_predictor_initializers_present_flag : 1;
///     uint32_t intra_boundary_filtering_disabled_flag : 1;
/// } StdVideoH265SpsFlags;
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
public record StdVideoH265SpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265SpsFlags allocate(Arena arena) {
        StdVideoH265SpsFlags ret = new StdVideoH265SpsFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265SpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SpsFlags[] ret = new StdVideoH265SpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SpsFlags(segment.asSlice(i * BYTES, BYTES));
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

    public boolean sps_temporal_id_nesting_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void sps_temporal_id_nesting_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean separate_colour_plane_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void separate_colour_plane_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean conformance_window_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void conformance_window_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean sps_sub_layer_ordering_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void sps_sub_layer_ordering_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean scaling_list_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void scaling_list_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean sps_scaling_list_data_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void sps_scaling_list_data_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean amp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void amp_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean sample_adaptive_offset_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void sample_adaptive_offset_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean pcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 8);
    }

    public void pcm_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean pcm_loop_filter_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 9);
    }

    public void pcm_loop_filter_disabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean long_term_ref_pics_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 10);
    }

    public void long_term_ref_pics_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean sps_temporal_mvp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 11);
    }

    public void sps_temporal_mvp_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean strong_intra_smoothing_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 12);
    }

    public void strong_intra_smoothing_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean vui_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 13);
    }

    public void vui_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean sps_extension_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 14);
    }

    public void sps_extension_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean sps_range_extension_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 15);
    }

    public void sps_range_extension_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public boolean transform_skip_rotation_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 16);
    }

    public void transform_skip_rotation_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 16, value);
    }

    public boolean transform_skip_context_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 17);
    }

    public void transform_skip_context_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 17, value);
    }

    public boolean implicit_rdpcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 18);
    }

    public void implicit_rdpcm_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 18, value);
    }

    public boolean explicit_rdpcm_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 19);
    }

    public void explicit_rdpcm_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 19, value);
    }

    public boolean extended_precision_processing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 20);
    }

    public void extended_precision_processing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 20, value);
    }

    public boolean intra_smoothing_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 21);
    }

    public void intra_smoothing_disabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 21, value);
    }

    public boolean high_precision_offsets_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 22);
    }

    public void high_precision_offsets_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 22, value);
    }

    public boolean persistent_rice_adaptation_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 23);
    }

    public void persistent_rice_adaptation_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 23, value);
    }

    public boolean cabac_bypass_alignment_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 24);
    }

    public void cabac_bypass_alignment_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 24, value);
    }

    public boolean sps_scc_extension_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 25);
    }

    public void sps_scc_extension_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 25, value);
    }

    public boolean sps_curr_pic_ref_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 26);
    }

    public void sps_curr_pic_ref_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 26, value);
    }

    public boolean palette_mode_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 27);
    }

    public void palette_mode_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 27, value);
    }

    public boolean sps_palette_predictor_initializers_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 28);
    }

    public void sps_palette_predictor_initializers_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 28, value);
    }

    public boolean intra_boundary_filtering_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        return BitfieldUtil.readBit(s, 29);
    }

    public void intra_boundary_filtering_disabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag, LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
        BitfieldUtil.writeBit(s, 29, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = PathElement.groupElement("PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag");

    public static final OfInt LAYOUT$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = (OfInt) LAYOUT.select(PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);


    public static final long OFFSET$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag = LAYOUT.byteOffset(PATH$bitfield$sps_temporal_id_nesting_flag_intra_boundary_filtering_disabled_flag);
}
