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

public record StdVideoDecodeH264PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$field_pic_flag_complementary_field_pair = ValueLayout.JAVA_INT.withName("bitfield$field_pic_flag_complementary_field_pair");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$field_pic_flag_complementary_field_pair);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeH264PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH264PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264PictureInfoFlags[] ret = new StdVideoDecodeH264PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264PictureInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeH264PictureInfoFlags clone(Arena arena, StdVideoDecodeH264PictureInfoFlags src) {
        StdVideoDecodeH264PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264PictureInfoFlags[] clone(Arena arena, StdVideoDecodeH264PictureInfoFlags[] src) {
        StdVideoDecodeH264PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$field_pic_flag_complementary_field_pair = PathElement.groupElement("PATH$bitfield$field_pic_flag_complementary_field_pair");


    public static final long OFFSET$field_pic_flag_complementary_field_pair = LAYOUT.byteOffset(PATH$bitfield$field_pic_flag_complementary_field_pair);

    public int field_pic_flag() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void field_pic_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int is_intra() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void is_intra(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void IdrPicFlag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void bottom_field_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void is_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int complementary_field_pair() {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void complementary_field_pair(int value) {
        MemorySegment s = segment.asSlice(OFFSET$field_pic_flag_complementary_field_pair, LAYOUT$field_pic_flag_complementary_field_pair);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

}
/// dummy, not implemented yet
