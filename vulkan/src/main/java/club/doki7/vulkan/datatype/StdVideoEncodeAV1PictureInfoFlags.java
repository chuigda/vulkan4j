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

/// Represents a pointer to a {@code StdVideoEncodeAV1PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1PictureInfoFlags {
///     uint32_t error_resilient_mode : 1; // @link substring="error_resilient_mode" target="#error_resilient_mode"
///     uint32_t disable_cdf_update : 1; // @link substring="disable_cdf_update" target="#disable_cdf_update"
///     uint32_t use_superres : 1; // @link substring="use_superres" target="#use_superres"
///     uint32_t render_and_frame_size_different : 1; // @link substring="render_and_frame_size_different" target="#render_and_frame_size_different"
///     uint32_t allow_screen_content_tools : 1; // @link substring="allow_screen_content_tools" target="#allow_screen_content_tools"
///     uint32_t is_filter_switchable : 1; // @link substring="is_filter_switchable" target="#is_filter_switchable"
///     uint32_t force_integer_mv : 1; // @link substring="force_integer_mv" target="#force_integer_mv"
///     uint32_t frame_size_override_flag : 1; // @link substring="frame_size_override_flag" target="#frame_size_override_flag"
///     uint32_t buffer_removal_time_present_flag : 1; // @link substring="buffer_removal_time_present_flag" target="#buffer_removal_time_present_flag"
///     uint32_t allow_intrabc : 1; // @link substring="allow_intrabc" target="#allow_intrabc"
///     uint32_t frame_refs_short_signaling : 1; // @link substring="frame_refs_short_signaling" target="#frame_refs_short_signaling"
///     uint32_t allow_high_precision_mv : 1; // @link substring="allow_high_precision_mv" target="#allow_high_precision_mv"
///     uint32_t is_motion_mode_switchable : 1; // @link substring="is_motion_mode_switchable" target="#is_motion_mode_switchable"
///     uint32_t use_ref_frame_mvs : 1; // @link substring="use_ref_frame_mvs" target="#use_ref_frame_mvs"
///     uint32_t disable_frame_end_update_cdf : 1; // @link substring="disable_frame_end_update_cdf" target="#disable_frame_end_update_cdf"
///     uint32_t allow_warped_motion : 1; // @link substring="allow_warped_motion" target="#allow_warped_motion"
///     uint32_t reduced_tx_set : 1; // @link substring="reduced_tx_set" target="#reduced_tx_set"
///     uint32_t skip_mode_present : 1; // @link substring="skip_mode_present" target="#skip_mode_present"
///     uint32_t delta_q_present : 1; // @link substring="delta_q_present" target="#delta_q_present"
///     uint32_t delta_lf_present : 1; // @link substring="delta_lf_present" target="#delta_lf_present"
///     uint32_t delta_lf_multi : 1; // @link substring="delta_lf_multi" target="#delta_lf_multi"
///     uint32_t segmentation_enabled : 1; // @link substring="segmentation_enabled" target="#segmentation_enabled"
///     uint32_t segmentation_update_map : 1; // @link substring="segmentation_update_map" target="#segmentation_update_map"
///     uint32_t segmentation_temporal_update : 1; // @link substring="segmentation_temporal_update" target="#segmentation_temporal_update"
///     uint32_t segmentation_update_data : 1; // @link substring="segmentation_update_data" target="#segmentation_update_data"
///     uint32_t UsesLr : 1; // @link substring="UsesLr" target="#UsesLr"
///     uint32_t usesChromaLr : 1; // @link substring="usesChromaLr" target="#usesChromaLr"
///     uint32_t show_frame : 1; // @link substring="show_frame" target="#show_frame"
///     uint32_t showable_frame : 1; // @link substring="showable_frame" target="#showable_frame"
///     uint32_t reserved : 3;
/// } StdVideoEncodeAV1PictureInfoFlags;
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
public record StdVideoEncodeAV1PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1PictureInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeAV1PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1PictureInfoFlags[] ret = new StdVideoEncodeAV1PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1PictureInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeAV1PictureInfoFlags clone(Arena arena, StdVideoEncodeAV1PictureInfoFlags src) {
        StdVideoEncodeAV1PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1PictureInfoFlags[] clone(Arena arena, StdVideoEncodeAV1PictureInfoFlags[] src) {
        StdVideoEncodeAV1PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean error_resilient_mode() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void error_resilient_mode(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean disable_cdf_update() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void disable_cdf_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean use_superres() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void use_superres(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean render_and_frame_size_different() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void render_and_frame_size_different(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean allow_screen_content_tools() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void allow_screen_content_tools(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean is_filter_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 5);
    }

    public void is_filter_switchable(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean force_integer_mv() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 6);
    }

    public void force_integer_mv(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean frame_size_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 7);
    }

    public void frame_size_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean buffer_removal_time_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 8);
    }

    public void buffer_removal_time_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean allow_intrabc() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 9);
    }

    public void allow_intrabc(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean frame_refs_short_signaling() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 10);
    }

    public void frame_refs_short_signaling(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean allow_high_precision_mv() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 11);
    }

    public void allow_high_precision_mv(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean is_motion_mode_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 12);
    }

    public void is_motion_mode_switchable(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean use_ref_frame_mvs() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 13);
    }

    public void use_ref_frame_mvs(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean disable_frame_end_update_cdf() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 14);
    }

    public void disable_frame_end_update_cdf(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean allow_warped_motion() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 15);
    }

    public void allow_warped_motion(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public boolean reduced_tx_set() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 16);
    }

    public void reduced_tx_set(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 16, value);
    }

    public boolean skip_mode_present() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 17);
    }

    public void skip_mode_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 17, value);
    }

    public boolean delta_q_present() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 18);
    }

    public void delta_q_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 18, value);
    }

    public boolean delta_lf_present() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 19);
    }

    public void delta_lf_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 19, value);
    }

    public boolean delta_lf_multi() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 20);
    }

    public void delta_lf_multi(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 20, value);
    }

    public boolean segmentation_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 21);
    }

    public void segmentation_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 21, value);
    }

    public boolean segmentation_update_map() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 22);
    }

    public void segmentation_update_map(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 22, value);
    }

    public boolean segmentation_temporal_update() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 23);
    }

    public void segmentation_temporal_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 23, value);
    }

    public boolean segmentation_update_data() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 24);
    }

    public void segmentation_update_data(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 24, value);
    }

    public boolean UsesLr() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 25);
    }

    public void UsesLr(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 25, value);
    }

    public boolean usesChromaLr() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 26);
    }

    public void usesChromaLr(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 26, value);
    }

    public boolean show_frame() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 27);
    }

    public void show_frame(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 27, value);
    }

    public boolean showable_frame() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        return BitfieldUtil.readBit(s, 28);
    }

    public void showable_frame(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$error_resilient_mode$reserved, LAYOUT$bitfield$error_resilient_mode$reserved);
        BitfieldUtil.writeBit(s, 28, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$error_resilient_mode$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$error_resilient_mode$reserved = PathElement.groupElement("PATH$bitfield$error_resilient_mode$reserved");

    public static final OfInt LAYOUT$bitfield$error_resilient_mode$reserved = (OfInt) LAYOUT.select(PATH$bitfield$error_resilient_mode$reserved);


    public static final long OFFSET$bitfield$error_resilient_mode$reserved = LAYOUT.byteOffset(PATH$bitfield$error_resilient_mode$reserved);
}
