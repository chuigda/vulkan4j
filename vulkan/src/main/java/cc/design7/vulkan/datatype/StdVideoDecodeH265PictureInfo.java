package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

@ValueBasedCandidate
public record StdVideoDecodeH265PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoDecodeH265PictureInfoFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$sps_video_parameter_set_id = ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id");
    public static final OfByte LAYOUT$pps_seq_parameter_set_id = ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id");
    public static final OfByte LAYOUT$pps_pic_parameter_set_id = ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id");
    public static final OfByte LAYOUT$NumDeltaPocsOfRefRpsIdx = ValueLayout.JAVA_BYTE.withName("NumDeltaPocsOfRefRpsIdx");
    public static final OfInt LAYOUT$PicOrderCntVal = ValueLayout.JAVA_INT.withName("PicOrderCntVal");
    public static final OfShort LAYOUT$NumBitsForSTRefPicSetInSlice = ValueLayout.JAVA_SHORT.withName("NumBitsForSTRefPicSetInSlice");
    public static final OfShort LAYOUT$reserved = ValueLayout.JAVA_SHORT.withName("reserved");
    public static final OfByte LAYOUT$RefPicSetStCurrBefore = ValueLayout.JAVA_BYTE.withName("RefPicSetStCurrBefore");
    public static final OfByte LAYOUT$RefPicSetStCurrAfter = ValueLayout.JAVA_BYTE.withName("RefPicSetStCurrAfter");
    public static final OfByte LAYOUT$RefPicSetLtCurr = ValueLayout.JAVA_BYTE.withName("RefPicSetLtCurr");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$sps_video_parameter_set_id, LAYOUT$pps_seq_parameter_set_id, LAYOUT$pps_pic_parameter_set_id, LAYOUT$NumDeltaPocsOfRefRpsIdx, LAYOUT$PicOrderCntVal, LAYOUT$NumBitsForSTRefPicSetInSlice, LAYOUT$reserved, LAYOUT$RefPicSetStCurrBefore, LAYOUT$RefPicSetStCurrAfter, LAYOUT$RefPicSetLtCurr);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeH265PictureInfo allocate(Arena arena) {
        return new StdVideoDecodeH265PictureInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH265PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH265PictureInfo[] ret = new StdVideoDecodeH265PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH265PictureInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeH265PictureInfo clone(Arena arena, StdVideoDecodeH265PictureInfo src) {
        StdVideoDecodeH265PictureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH265PictureInfo[] clone(Arena arena, StdVideoDecodeH265PictureInfo[] src) {
        StdVideoDecodeH265PictureInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$sps_video_parameter_set_id = PathElement.groupElement("PATH$sps_video_parameter_set_id");
    public static final PathElement PATH$pps_seq_parameter_set_id = PathElement.groupElement("PATH$pps_seq_parameter_set_id");
    public static final PathElement PATH$pps_pic_parameter_set_id = PathElement.groupElement("PATH$pps_pic_parameter_set_id");
    public static final PathElement PATH$NumDeltaPocsOfRefRpsIdx = PathElement.groupElement("PATH$NumDeltaPocsOfRefRpsIdx");
    public static final PathElement PATH$PicOrderCntVal = PathElement.groupElement("PATH$PicOrderCntVal");
    public static final PathElement PATH$NumBitsForSTRefPicSetInSlice = PathElement.groupElement("PATH$NumBitsForSTRefPicSetInSlice");
    public static final PathElement PATH$reserved = PathElement.groupElement("PATH$reserved");
    public static final PathElement PATH$RefPicSetStCurrBefore = PathElement.groupElement("PATH$RefPicSetStCurrBefore");
    public static final PathElement PATH$RefPicSetStCurrAfter = PathElement.groupElement("PATH$RefPicSetStCurrAfter");
    public static final PathElement PATH$RefPicSetLtCurr = PathElement.groupElement("PATH$RefPicSetLtCurr");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$sps_video_parameter_set_id = LAYOUT$sps_video_parameter_set_id.byteSize();
    public static final long SIZE$pps_seq_parameter_set_id = LAYOUT$pps_seq_parameter_set_id.byteSize();
    public static final long SIZE$pps_pic_parameter_set_id = LAYOUT$pps_pic_parameter_set_id.byteSize();
    public static final long SIZE$NumDeltaPocsOfRefRpsIdx = LAYOUT$NumDeltaPocsOfRefRpsIdx.byteSize();
    public static final long SIZE$PicOrderCntVal = LAYOUT$PicOrderCntVal.byteSize();
    public static final long SIZE$NumBitsForSTRefPicSetInSlice = LAYOUT$NumBitsForSTRefPicSetInSlice.byteSize();
    public static final long SIZE$reserved = LAYOUT$reserved.byteSize();
    public static final long SIZE$RefPicSetStCurrBefore = LAYOUT$RefPicSetStCurrBefore.byteSize();
    public static final long SIZE$RefPicSetStCurrAfter = LAYOUT$RefPicSetStCurrAfter.byteSize();
    public static final long SIZE$RefPicSetLtCurr = LAYOUT$RefPicSetLtCurr.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$sps_video_parameter_set_id = LAYOUT.byteOffset(PATH$sps_video_parameter_set_id);
    public static final long OFFSET$pps_seq_parameter_set_id = LAYOUT.byteOffset(PATH$pps_seq_parameter_set_id);
    public static final long OFFSET$pps_pic_parameter_set_id = LAYOUT.byteOffset(PATH$pps_pic_parameter_set_id);
    public static final long OFFSET$NumDeltaPocsOfRefRpsIdx = LAYOUT.byteOffset(PATH$NumDeltaPocsOfRefRpsIdx);
    public static final long OFFSET$PicOrderCntVal = LAYOUT.byteOffset(PATH$PicOrderCntVal);
    public static final long OFFSET$NumBitsForSTRefPicSetInSlice = LAYOUT.byteOffset(PATH$NumBitsForSTRefPicSetInSlice);
    public static final long OFFSET$reserved = LAYOUT.byteOffset(PATH$reserved);
    public static final long OFFSET$RefPicSetStCurrBefore = LAYOUT.byteOffset(PATH$RefPicSetStCurrBefore);
    public static final long OFFSET$RefPicSetStCurrAfter = LAYOUT.byteOffset(PATH$RefPicSetStCurrAfter);
    public static final long OFFSET$RefPicSetLtCurr = LAYOUT.byteOffset(PATH$RefPicSetLtCurr);

    public StdVideoDecodeH265PictureInfoFlags flags() {
        return new StdVideoDecodeH265PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoDecodeH265PictureInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte sps_video_parameter_set_id() {
        return segment.get(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id);
    }

    public void sps_video_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$sps_video_parameter_set_id, OFFSET$sps_video_parameter_set_id, value);
    }

    public @unsigned byte pps_seq_parameter_set_id() {
        return segment.get(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id);
    }

    public void pps_seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pps_seq_parameter_set_id, OFFSET$pps_seq_parameter_set_id, value);
    }

    public @unsigned byte pps_pic_parameter_set_id() {
        return segment.get(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id);
    }

    public void pps_pic_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pps_pic_parameter_set_id, OFFSET$pps_pic_parameter_set_id, value);
    }

    public @unsigned byte NumDeltaPocsOfRefRpsIdx() {
        return segment.get(LAYOUT$NumDeltaPocsOfRefRpsIdx, OFFSET$NumDeltaPocsOfRefRpsIdx);
    }

    public void NumDeltaPocsOfRefRpsIdx(@unsigned byte value) {
        segment.set(LAYOUT$NumDeltaPocsOfRefRpsIdx, OFFSET$NumDeltaPocsOfRefRpsIdx, value);
    }

    public int PicOrderCntVal() {
        return segment.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);
    }

    public void PicOrderCntVal(int value) {
        segment.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);
    }

    public @unsigned short NumBitsForSTRefPicSetInSlice() {
        return segment.get(LAYOUT$NumBitsForSTRefPicSetInSlice, OFFSET$NumBitsForSTRefPicSetInSlice);
    }

    public void NumBitsForSTRefPicSetInSlice(@unsigned short value) {
        segment.set(LAYOUT$NumBitsForSTRefPicSetInSlice, OFFSET$NumBitsForSTRefPicSetInSlice, value);
    }

    public @unsigned short reserved() {
        return segment.get(LAYOUT$reserved, OFFSET$reserved);
    }

    public void reserved(@unsigned short value) {
        segment.set(LAYOUT$reserved, OFFSET$reserved, value);
    }

    public @unsigned byte RefPicSetStCurrBefore() {
        return segment.get(LAYOUT$RefPicSetStCurrBefore, OFFSET$RefPicSetStCurrBefore);
    }

    public void RefPicSetStCurrBefore(@unsigned byte value) {
        segment.set(LAYOUT$RefPicSetStCurrBefore, OFFSET$RefPicSetStCurrBefore, value);
    }

    public @unsigned byte RefPicSetStCurrAfter() {
        return segment.get(LAYOUT$RefPicSetStCurrAfter, OFFSET$RefPicSetStCurrAfter);
    }

    public void RefPicSetStCurrAfter(@unsigned byte value) {
        segment.set(LAYOUT$RefPicSetStCurrAfter, OFFSET$RefPicSetStCurrAfter, value);
    }

    public @unsigned byte RefPicSetLtCurr() {
        return segment.get(LAYOUT$RefPicSetLtCurr, OFFSET$RefPicSetLtCurr);
    }

    public void RefPicSetLtCurr(@unsigned byte value) {
        segment.set(LAYOUT$RefPicSetLtCurr, OFFSET$RefPicSetLtCurr, value);
    }

}
