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

public record StdVideoEncodeH265PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$is_reference_reserved = ValueLayout.JAVA_INT.withName("bitfield$is_reference_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$is_reference_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH265PictureInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH265PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265PictureInfoFlags[] ret = new StdVideoEncodeH265PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265PictureInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265PictureInfoFlags clone(Arena arena, StdVideoEncodeH265PictureInfoFlags src) {
        StdVideoEncodeH265PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265PictureInfoFlags[] clone(Arena arena, StdVideoEncodeH265PictureInfoFlags[] src) {
        StdVideoEncodeH265PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$is_reference_reserved = PathElement.groupElement("PATH$bitfield$is_reference_reserved");


    public static final long OFFSET$is_reference_reserved = LAYOUT.byteOffset(PATH$bitfield$is_reference_reserved);

    public int is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void is_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int IrapPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void IrapPicFlag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void used_for_long_term_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int discardable_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void discardable_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int cross_layer_bla_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void cross_layer_bla_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int pic_output_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void pic_output_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int no_output_of_prior_pics_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void no_output_of_prior_pics_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int short_term_ref_pic_set_sps_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void short_term_ref_pic_set_sps_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int slice_temporal_mvp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void slice_temporal_mvp_enabled_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBits(s, 9, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBits(s, 9, 32, value);
    }

}
/// dummy, not implemented yet
