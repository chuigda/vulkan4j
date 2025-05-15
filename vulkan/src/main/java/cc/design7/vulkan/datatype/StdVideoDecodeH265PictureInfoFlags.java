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

public record StdVideoDecodeH265PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag = ValueLayout.JAVA_INT.withName("bitfield$IrapPicFlag_short_term_ref_pic_set_sps_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeH265PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH265PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH265PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH265PictureInfoFlags[] ret = new StdVideoDecodeH265PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH265PictureInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeH265PictureInfoFlags clone(Arena arena, StdVideoDecodeH265PictureInfoFlags src) {
        StdVideoDecodeH265PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH265PictureInfoFlags[] clone(Arena arena, StdVideoDecodeH265PictureInfoFlags[] src) {
        StdVideoDecodeH265PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$IrapPicFlag_short_term_ref_pic_set_sps_flag = PathElement.groupElement("PATH$bitfield$IrapPicFlag_short_term_ref_pic_set_sps_flag");


    public static final long OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag = LAYOUT.byteOffset(PATH$bitfield$IrapPicFlag_short_term_ref_pic_set_sps_flag);

    public int IrapPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void IrapPicFlag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void IdrPicFlag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int IsReference() {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void IsReference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int short_term_ref_pic_set_sps_flag() {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void short_term_ref_pic_set_sps_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IrapPicFlag_short_term_ref_pic_set_sps_flag, LAYOUT$IrapPicFlag_short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

}
/// dummy, not implemented yet
