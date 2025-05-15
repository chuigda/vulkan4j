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

    public boolean first_slice_segment_in_pic_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void first_slice_segment_in_pic_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean dependent_slice_segment_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void dependent_slice_segment_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean slice_sao_luma_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void slice_sao_luma_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean slice_sao_chroma_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void slice_sao_chroma_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean num_ref_idx_active_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void num_ref_idx_active_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean mvd_l1_zero_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 5);
    }

    public void mvd_l1_zero_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean cabac_init_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 6);
    }

    public void cabac_init_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean cu_chroma_qp_offset_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 7);
    }

    public void cu_chroma_qp_offset_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean deblocking_filter_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 8);
    }

    public void deblocking_filter_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean slice_deblocking_filter_disabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 9);
    }

    public void slice_deblocking_filter_disabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean collocated_from_l0_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 10);
    }

    public void collocated_from_l0_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean slice_loop_filter_across_slices_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        return BitfieldUtil.readBit(s, 11);
    }

    public void slice_loop_filter_across_slices_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$first_slice_segment_in_pic_flag_reserved, LAYOUT$first_slice_segment_in_pic_flag_reserved);
        BitfieldUtil.writeBit(s, 11, value);
    }


}
