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

    public int error_resilient_mode() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void error_resilient_mode(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int disable_cdf_update() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void disable_cdf_update(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int use_superres() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void use_superres(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int render_and_frame_size_different() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void render_and_frame_size_different(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int allow_screen_content_tools() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void allow_screen_content_tools(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int is_filter_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void is_filter_switchable(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int force_integer_mv() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void force_integer_mv(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int frame_size_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void frame_size_override_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int buffer_removal_time_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void buffer_removal_time_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int allow_intrabc() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void allow_intrabc(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int frame_refs_short_signaling() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void frame_refs_short_signaling(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int allow_high_precision_mv() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void allow_high_precision_mv(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int is_motion_mode_switchable() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 12, 13);
    }

    public void is_motion_mode_switchable(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 12, 13, value);
    }

    public int use_ref_frame_mvs() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 13, 14);
    }

    public void use_ref_frame_mvs(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 13, 14, value);
    }

    public int disable_frame_end_update_cdf() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 14, 15);
    }

    public void disable_frame_end_update_cdf(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 14, 15, value);
    }

    public int allow_warped_motion() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 15, 16);
    }

    public void allow_warped_motion(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 15, 16, value);
    }

    public int reduced_tx_set() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 16, 17);
    }

    public void reduced_tx_set(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 16, 17, value);
    }

    public int reference_select() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 17, 18);
    }

    public void reference_select(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 17, 18, value);
    }

    public int skip_mode_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 18, 19);
    }

    public void skip_mode_present(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 18, 19, value);
    }

    public int delta_q_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 19, 20);
    }

    public void delta_q_present(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 19, 20, value);
    }

    public int delta_lf_present() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 20, 21);
    }

    public void delta_lf_present(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 20, 21, value);
    }

    public int delta_lf_multi() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 21, 22);
    }

    public void delta_lf_multi(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 21, 22, value);
    }

    public int segmentation_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 22, 23);
    }

    public void segmentation_enabled(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 22, 23, value);
    }

    public int segmentation_update_map() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 23, 24);
    }

    public void segmentation_update_map(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 23, 24, value);
    }

    public int segmentation_temporal_update() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 24, 25);
    }

    public void segmentation_temporal_update(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 24, 25, value);
    }

    public int segmentation_update_data() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 25, 26);
    }

    public void segmentation_update_data(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 25, 26, value);
    }

    public int UsesLr() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 26, 27);
    }

    public void UsesLr(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 26, 27, value);
    }

    public int usesChromaLr() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 27, 28);
    }

    public void usesChromaLr(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 27, 28, value);
    }

    public int apply_grain() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 28, 29);
    }

    public void apply_grain(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 28, 29, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        return BitfieldUtil.readBits(s, 29, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$error_resilient_mode_reserved, LAYOUT$error_resilient_mode_reserved);
        BitfieldUtil.writeBits(s, 29, 32, value);
    }

}
/// dummy, not implemented yet
