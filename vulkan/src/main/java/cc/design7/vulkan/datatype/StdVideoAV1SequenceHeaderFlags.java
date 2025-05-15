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

public record StdVideoAV1SequenceHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$still_picture_reserved = ValueLayout.JAVA_INT.withName("bitfield$still_picture_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$still_picture_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1SequenceHeaderFlags allocate(Arena arena) {
        return new StdVideoAV1SequenceHeaderFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1SequenceHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1SequenceHeaderFlags[] ret = new StdVideoAV1SequenceHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1SequenceHeaderFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1SequenceHeaderFlags clone(Arena arena, StdVideoAV1SequenceHeaderFlags src) {
        StdVideoAV1SequenceHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1SequenceHeaderFlags[] clone(Arena arena, StdVideoAV1SequenceHeaderFlags[] src) {
        StdVideoAV1SequenceHeaderFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$still_picture_reserved = PathElement.groupElement("PATH$bitfield$still_picture_reserved");


    public static final long OFFSET$still_picture_reserved = LAYOUT.byteOffset(PATH$bitfield$still_picture_reserved);

    public int still_picture() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void still_picture(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int reduced_still_picture_header() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void reduced_still_picture_header(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int use_128x128_superblock() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void use_128x128_superblock(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int enable_filter_intra() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void enable_filter_intra(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int enable_intra_edge_filter() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void enable_intra_edge_filter(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int enable_interintra_compound() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void enable_interintra_compound(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int enable_masked_compound() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void enable_masked_compound(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int enable_warped_motion() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void enable_warped_motion(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int enable_dual_filter() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void enable_dual_filter(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int enable_order_hint() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void enable_order_hint(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int enable_jnt_comp() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void enable_jnt_comp(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int enable_ref_frame_mvs() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void enable_ref_frame_mvs(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

    public int frame_id_numbers_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 12, 13);
    }

    public void frame_id_numbers_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 12, 13, value);
    }

    public int enable_superres() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 13, 14);
    }

    public void enable_superres(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 13, 14, value);
    }

    public int enable_cdef() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 14, 15);
    }

    public void enable_cdef(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 14, 15, value);
    }

    public int enable_restoration() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 15, 16);
    }

    public void enable_restoration(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 15, 16, value);
    }

    public int film_grain_params_present() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 16, 17);
    }

    public void film_grain_params_present(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 16, 17, value);
    }

    public int timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 17, 18);
    }

    public void timing_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 17, 18, value);
    }

    public int initial_display_delay_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 18, 19);
    }

    public void initial_display_delay_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 18, 19, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBits(s, 19, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBits(s, 19, 32, value);
    }

}
/// dummy, not implemented yet
