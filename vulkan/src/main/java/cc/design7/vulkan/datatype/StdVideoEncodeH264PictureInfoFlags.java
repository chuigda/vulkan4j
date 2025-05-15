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

public record StdVideoEncodeH264PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$IdrPicFlag_reserved = ValueLayout.JAVA_INT.withName("bitfield$IdrPicFlag_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$IdrPicFlag_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264PictureInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH264PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264PictureInfoFlags[] ret = new StdVideoEncodeH264PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264PictureInfoFlags clone(Arena arena, StdVideoEncodeH264PictureInfoFlags src) {
        StdVideoEncodeH264PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264PictureInfoFlags[] clone(Arena arena, StdVideoEncodeH264PictureInfoFlags[] src) {
        StdVideoEncodeH264PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$IdrPicFlag_reserved = PathElement.groupElement("PATH$bitfield$IdrPicFlag_reserved");


    public static final long OFFSET$IdrPicFlag_reserved = LAYOUT.byteOffset(PATH$bitfield$IdrPicFlag_reserved);

    public int IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void IdrPicFlag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void is_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int no_output_of_prior_pics_flag() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void no_output_of_prior_pics_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int long_term_reference_flag() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void long_term_reference_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int adaptive_ref_pic_marking_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void adaptive_ref_pic_marking_mode_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        return BitfieldUtil.readBits(s, 5, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$IdrPicFlag_reserved, LAYOUT$IdrPicFlag_reserved);
        BitfieldUtil.writeBits(s, 5, 32, value);
    }

}
/// dummy, not implemented yet
