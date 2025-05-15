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

public record StdVideoEncodeH265SliceSegmentHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$first_slice_segment_in_pic_flag_reserved = ValueLayout.JAVA_INT.withName("bitfield$first_slice_segment_in_pic_flag_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$first_slice_segment_in_pic_flag_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH265SliceSegmentHeaderFlags allocate(Arena arena) {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265SliceSegmentHeaderFlags[] ret = new StdVideoEncodeH265SliceSegmentHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags clone(Arena arena, StdVideoEncodeH265SliceSegmentHeaderFlags src) {
        StdVideoEncodeH265SliceSegmentHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags[] clone(Arena arena, StdVideoEncodeH265SliceSegmentHeaderFlags[] src) {
        StdVideoEncodeH265SliceSegmentHeaderFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$first_slice_segment_in_pic_flag_reserved = PathElement.groupElement("PATH$bitfield$first_slice_segment_in_pic_flag_reserved");


    public static final long OFFSET$first_slice_segment_in_pic_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$first_slice_segment_in_pic_flag_reserved);

    public int first_slice_segment_in_pic_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void first_slice_segment_in_pic_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int dependent_slice_segment_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void dependent_slice_segment_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int slice_sao_luma_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void slice_sao_luma_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int slice_sao_chroma_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void slice_sao_chroma_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int num_ref_idx_active_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void num_ref_idx_active_override_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int mvd_l1_zero_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void mvd_l1_zero_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int cabac_init_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void cabac_init_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int cu_chroma_qp_offset_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void cu_chroma_qp_offset_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int deblocking_filter_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void deblocking_filter_override_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int slice_deblocking_filter_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void slice_deblocking_filter_disabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int collocated_from_l0_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void collocated_from_l0_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int slice_loop_filter_across_slices_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void slice_loop_filter_across_slices_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBits(s, 12, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBits(s, 12, 32, value);
    }

}
/// dummy, not implemented yet
