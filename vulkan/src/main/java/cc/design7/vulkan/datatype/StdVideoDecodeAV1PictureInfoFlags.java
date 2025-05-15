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
public record StdVideoDecodeAV1PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$error_resilient_mode_reserved = ValueLayout.JAVA_INT.withName("bitfield$error_resilient_mode_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$error_resilient_mode_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeAV1PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeAV1PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeAV1PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeAV1PictureInfoFlags[] ret = new StdVideoDecodeAV1PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeAV1PictureInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeAV1PictureInfoFlags clone(Arena arena, StdVideoDecodeAV1PictureInfoFlags src) {
        StdVideoDecodeAV1PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeAV1PictureInfoFlags[] clone(Arena arena, StdVideoDecodeAV1PictureInfoFlags[] src) {
        StdVideoDecodeAV1PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$error_resilient_mode_reserved = PathElement.groupElement("PATH$bitfield$error_resilient_mode_reserved");


    public static final long OFFSET$error_resilient_mode_reserved = LAYOUT.byteOffset(PATH$bitfield$error_resilient_mode_reserved);

    public boolean error_resilient_mode() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void error_resilient_mode(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean disable_cdf_update() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void disable_cdf_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean use_superres() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void use_superres(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean render_and_frame_size_different() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void render_and_frame_size_different(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean allow_screen_content_tools() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void allow_screen_content_tools(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean is_filter_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 5);
    }

    public void is_filter_switchable(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean force_integer_mv() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 6);
    }

    public void force_integer_mv(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean frame_size_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 7);
    }

    public void frame_size_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean buffer_removal_time_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 8);
    }

    public void buffer_removal_time_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean allow_intrabc() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 9);
    }

    public void allow_intrabc(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean frame_refs_short_signaling() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 10);
    }

    public void frame_refs_short_signaling(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean allow_high_precision_mv() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 11);
    }

    public void allow_high_precision_mv(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean is_motion_mode_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 12);
    }

    public void is_motion_mode_switchable(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean use_ref_frame_mvs() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 13);
    }

    public void use_ref_frame_mvs(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean disable_frame_end_update_cdf() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 14);
    }

    public void disable_frame_end_update_cdf(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean allow_warped_motion() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 15);
    }

    public void allow_warped_motion(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public boolean reduced_tx_set() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 16);
    }

    public void reduced_tx_set(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 16, value);
    }

    public boolean reference_select() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 17);
    }

    public void reference_select(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 17, value);
    }

    public boolean skip_mode_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 18);
    }

    public void skip_mode_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 18, value);
    }

    public boolean delta_q_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 19);
    }

    public void delta_q_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 19, value);
    }

    public boolean delta_lf_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 20);
    }

    public void delta_lf_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 20, value);
    }

    public boolean delta_lf_multi() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 21);
    }

    public void delta_lf_multi(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 21, value);
    }

    public boolean segmentation_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 22);
    }

    public void segmentation_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 22, value);
    }

    public boolean segmentation_update_map() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 23);
    }

    public void segmentation_update_map(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 23, value);
    }

    public boolean segmentation_temporal_update() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 24);
    }

    public void segmentation_temporal_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 24, value);
    }

    public boolean segmentation_update_data() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 25);
    }

    public void segmentation_update_data(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 25, value);
    }

    public boolean UsesLr() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 26);
    }

    public void UsesLr(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 26, value);
    }

    public boolean usesChromaLr() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 27);
    }

    public void usesChromaLr(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 27, value);
    }

    public boolean apply_grain() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBit(s, 28);
    }

    public void apply_grain(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBit(s, 28, value);
    }


}
