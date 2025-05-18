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

/// Represents a pointer to a {@code StdVideoEncodeH265SliceSegmentHeaderFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265SliceSegmentHeaderFlags {
///     uint32_t first_slice_segment_in_pic_flag : 1; // @link substring="first_slice_segment_in_pic_flag" target="#first_slice_segment_in_pic_flag"
///     uint32_t dependent_slice_segment_flag : 1; // @link substring="dependent_slice_segment_flag" target="#dependent_slice_segment_flag"
///     uint32_t slice_sao_luma_flag : 1; // @link substring="slice_sao_luma_flag" target="#slice_sao_luma_flag"
///     uint32_t slice_sao_chroma_flag : 1; // @link substring="slice_sao_chroma_flag" target="#slice_sao_chroma_flag"
///     uint32_t num_ref_idx_active_override_flag : 1; // @link substring="num_ref_idx_active_override_flag" target="#num_ref_idx_active_override_flag"
///     uint32_t mvd_l1_zero_flag : 1; // @link substring="mvd_l1_zero_flag" target="#mvd_l1_zero_flag"
///     uint32_t cabac_init_flag : 1; // @link substring="cabac_init_flag" target="#cabac_init_flag"
///     uint32_t cu_chroma_qp_offset_enabled_flag : 1; // @link substring="cu_chroma_qp_offset_enabled_flag" target="#cu_chroma_qp_offset_enabled_flag"
///     uint32_t deblocking_filter_override_flag : 1; // @link substring="deblocking_filter_override_flag" target="#deblocking_filter_override_flag"
///     uint32_t slice_deblocking_filter_disabled_flag : 1; // @link substring="slice_deblocking_filter_disabled_flag" target="#slice_deblocking_filter_disabled_flag"
///     uint32_t collocated_from_l0_flag : 1; // @link substring="collocated_from_l0_flag" target="#collocated_from_l0_flag"
///     uint32_t slice_loop_filter_across_slices_enabled_flag : 1; // @link substring="slice_loop_filter_across_slices_enabled_flag" target="#slice_loop_filter_across_slices_enabled_flag"
///     uint32_t reserved : 20;
/// } StdVideoEncodeH265SliceSegmentHeaderFlags;
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
public record StdVideoEncodeH265SliceSegmentHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265SliceSegmentHeaderFlags allocate(Arena arena) {
        StdVideoEncodeH265SliceSegmentHeaderFlags ret = new StdVideoEncodeH265SliceSegmentHeaderFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265SliceSegmentHeaderFlags[] ret = new StdVideoEncodeH265SliceSegmentHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$first_slice_segment_in_pic_flag_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$first_slice_segment_in_pic_flag_reserved = PathElement.groupElement("PATH$bitfield$first_slice_segment_in_pic_flag_reserved");

    public static final OfInt LAYOUT$first_slice_segment_in_pic_flag_reserved = (OfInt) LAYOUT.select(PATH$bitfield$first_slice_segment_in_pic_flag_reserved);


    public static final long OFFSET$first_slice_segment_in_pic_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$first_slice_segment_in_pic_flag_reserved);
}
