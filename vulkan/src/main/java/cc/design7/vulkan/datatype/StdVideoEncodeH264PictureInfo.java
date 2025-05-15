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
public record StdVideoEncodeH264PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$seq_parameter_set_id = ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id");
    public static final OfByte LAYOUT$pic_parameter_set_id = ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id");
    public static final OfShort LAYOUT$idr_pic_id = ValueLayout.JAVA_SHORT.withName("idr_pic_id");
    public static final OfInt LAYOUT$primary_pic_type = ValueLayout.JAVA_INT.withName("primary_pic_type");
    public static final OfInt LAYOUT$frame_num = ValueLayout.JAVA_INT.withName("frame_num");
    public static final OfInt LAYOUT$PicOrderCnt = ValueLayout.JAVA_INT.withName("PicOrderCnt");
    public static final OfByte LAYOUT$temporal_id = ValueLayout.JAVA_BYTE.withName("temporal_id");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final AddressLayout LAYOUT$pRefLists = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264ReferenceListsInfo.LAYOUT).withName("pRefLists");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$seq_parameter_set_id, LAYOUT$pic_parameter_set_id, LAYOUT$idr_pic_id, LAYOUT$primary_pic_type, LAYOUT$frame_num, LAYOUT$PicOrderCnt, LAYOUT$temporal_id, LAYOUT$reserved1, LAYOUT$pRefLists);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264PictureInfo allocate(Arena arena) {
        return new StdVideoEncodeH264PictureInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264PictureInfo[] ret = new StdVideoEncodeH264PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264PictureInfo clone(Arena arena, StdVideoEncodeH264PictureInfo src) {
        StdVideoEncodeH264PictureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264PictureInfo[] clone(Arena arena, StdVideoEncodeH264PictureInfo[] src) {
        StdVideoEncodeH264PictureInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$seq_parameter_set_id = PathElement.groupElement("PATH$seq_parameter_set_id");
    public static final PathElement PATH$pic_parameter_set_id = PathElement.groupElement("PATH$pic_parameter_set_id");
    public static final PathElement PATH$idr_pic_id = PathElement.groupElement("PATH$idr_pic_id");
    public static final PathElement PATH$primary_pic_type = PathElement.groupElement("PATH$primary_pic_type");
    public static final PathElement PATH$frame_num = PathElement.groupElement("PATH$frame_num");
    public static final PathElement PATH$PicOrderCnt = PathElement.groupElement("PATH$PicOrderCnt");
    public static final PathElement PATH$temporal_id = PathElement.groupElement("PATH$temporal_id");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pRefLists = PathElement.groupElement("PATH$pRefLists");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$seq_parameter_set_id = LAYOUT$seq_parameter_set_id.byteSize();
    public static final long SIZE$pic_parameter_set_id = LAYOUT$pic_parameter_set_id.byteSize();
    public static final long SIZE$idr_pic_id = LAYOUT$idr_pic_id.byteSize();
    public static final long SIZE$primary_pic_type = LAYOUT$primary_pic_type.byteSize();
    public static final long SIZE$frame_num = LAYOUT$frame_num.byteSize();
    public static final long SIZE$PicOrderCnt = LAYOUT$PicOrderCnt.byteSize();
    public static final long SIZE$temporal_id = LAYOUT$temporal_id.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pRefLists = LAYOUT$pRefLists.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$seq_parameter_set_id = LAYOUT.byteOffset(PATH$seq_parameter_set_id);
    public static final long OFFSET$pic_parameter_set_id = LAYOUT.byteOffset(PATH$pic_parameter_set_id);
    public static final long OFFSET$idr_pic_id = LAYOUT.byteOffset(PATH$idr_pic_id);
    public static final long OFFSET$primary_pic_type = LAYOUT.byteOffset(PATH$primary_pic_type);
    public static final long OFFSET$frame_num = LAYOUT.byteOffset(PATH$frame_num);
    public static final long OFFSET$PicOrderCnt = LAYOUT.byteOffset(PATH$PicOrderCnt);
    public static final long OFFSET$temporal_id = LAYOUT.byteOffset(PATH$temporal_id);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pRefLists = LAYOUT.byteOffset(PATH$pRefLists);

    public StdVideoEncodeH264PictureInfoFlags flags() {
        return new StdVideoEncodeH264PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH264PictureInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte seq_parameter_set_id() {
        return segment.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);
    }

    public void seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, value);
    }

    public @unsigned byte pic_parameter_set_id() {
        return segment.get(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id);
    }

    public void pic_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id, value);
    }

    public @unsigned short idr_pic_id() {
        return segment.get(LAYOUT$idr_pic_id, OFFSET$idr_pic_id);
    }

    public void idr_pic_id(@unsigned short value) {
        segment.set(LAYOUT$idr_pic_id, OFFSET$idr_pic_id, value);
    }

    public @enumtype(StdVideoH264PictureType.class) int primary_pic_type() {
        return segment.get(LAYOUT$primary_pic_type, OFFSET$primary_pic_type);
    }

    public void primary_pic_type(@enumtype(StdVideoH264PictureType.class) int value) {
        segment.set(LAYOUT$primary_pic_type, OFFSET$primary_pic_type, value);
    }

    public @unsigned int frame_num() {
        return segment.get(LAYOUT$frame_num, OFFSET$frame_num);
    }

    public void frame_num(@unsigned int value) {
        segment.set(LAYOUT$frame_num, OFFSET$frame_num, value);
    }

    public int PicOrderCnt() {
        return segment.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);
    }

    public void PicOrderCnt(int value) {
        segment.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);
    }

    public @unsigned byte temporal_id() {
        return segment.get(LAYOUT$temporal_id, OFFSET$temporal_id);
    }

    public void temporal_id(@unsigned byte value) {
        segment.set(LAYOUT$temporal_id, OFFSET$temporal_id, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoEncodeH264ReferenceListsInfo*") MemorySegment pRefListsRaw() {
        return segment.get(LAYOUT$pRefLists, OFFSET$pRefLists);
    }

    public void pRefListsRaw(@pointer(comment="StdVideoEncodeH264ReferenceListsInfo*") MemorySegment value) {
        segment.set(LAYOUT$pRefLists, OFFSET$pRefLists, value);
    }

    public @Nullable StdVideoEncodeH264ReferenceListsInfo pRefLists() {
        MemorySegment s = pRefListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeH264ReferenceListsInfo(s);
    }

    public void pRefLists(@Nullable StdVideoEncodeH264ReferenceListsInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRefListsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264ReferenceListsInfo[] pRefLists(int assumedCount) {
        MemorySegment s = pRefListsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264ReferenceListsInfo.SIZE);
        StdVideoEncodeH264ReferenceListsInfo[] ret = new StdVideoEncodeH264ReferenceListsInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceListsInfo(s.asSlice(i * StdVideoEncodeH264ReferenceListsInfo.SIZE, StdVideoEncodeH264ReferenceListsInfo.SIZE));
        }
        return ret;
    }

}
