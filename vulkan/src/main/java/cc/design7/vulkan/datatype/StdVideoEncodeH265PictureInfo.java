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

/// Represents a pointer to a {@code StdVideoEncodeH265PictureInfo} structure in native memory.
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
public record StdVideoEncodeH265PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265PictureInfo allocate(Arena arena) {
        return new StdVideoEncodeH265PictureInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265PictureInfo[] ret = new StdVideoEncodeH265PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265PictureInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265PictureInfo clone(Arena arena, StdVideoEncodeH265PictureInfo src) {
        StdVideoEncodeH265PictureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265PictureInfo[] clone(Arena arena, StdVideoEncodeH265PictureInfo[] src) {
        StdVideoEncodeH265PictureInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH265PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("pic_type"),
        ValueLayout.JAVA_BYTE.withName("sps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pps_pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("short_term_ref_pic_set_idx"),
        ValueLayout.JAVA_INT.withName("PicOrderCntVal"),
        ValueLayout.JAVA_BYTE.withName("TemporalId"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265ReferenceListsInfo.LAYOUT).withName("pRefLists"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ShortTermRefPicSet.LAYOUT).withName("pShortTermRefPicSet"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265LongTermRefPics.LAYOUT).withName("pLongTermRefPics")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pic_type = PathElement.groupElement("PATH$pic_type");
    public static final PathElement PATH$sps_video_parameter_set_id = PathElement.groupElement("PATH$sps_video_parameter_set_id");
    public static final PathElement PATH$pps_seq_parameter_set_id = PathElement.groupElement("PATH$pps_seq_parameter_set_id");
    public static final PathElement PATH$pps_pic_parameter_set_id = PathElement.groupElement("PATH$pps_pic_parameter_set_id");
    public static final PathElement PATH$short_term_ref_pic_set_idx = PathElement.groupElement("PATH$short_term_ref_pic_set_idx");
    public static final PathElement PATH$PicOrderCntVal = PathElement.groupElement("PATH$PicOrderCntVal");
    public static final PathElement PATH$TemporalId = PathElement.groupElement("PATH$TemporalId");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pRefLists = PathElement.groupElement("PATH$pRefLists");
    public static final PathElement PATH$pShortTermRefPicSet = PathElement.groupElement("PATH$pShortTermRefPicSet");
    public static final PathElement PATH$pLongTermRefPics = PathElement.groupElement("PATH$pLongTermRefPics");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$pic_type = (OfInt) LAYOUT.select(PATH$pic_type);
    public static final OfByte LAYOUT$sps_video_parameter_set_id = (OfByte) LAYOUT.select(PATH$sps_video_parameter_set_id);
    public static final OfByte LAYOUT$pps_seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$pps_seq_parameter_set_id);
    public static final OfByte LAYOUT$pps_pic_parameter_set_id = (OfByte) LAYOUT.select(PATH$pps_pic_parameter_set_id);
    public static final OfByte LAYOUT$short_term_ref_pic_set_idx = (OfByte) LAYOUT.select(PATH$short_term_ref_pic_set_idx);
    public static final OfInt LAYOUT$PicOrderCntVal = (OfInt) LAYOUT.select(PATH$PicOrderCntVal);
    public static final OfByte LAYOUT$TemporalId = (OfByte) LAYOUT.select(PATH$TemporalId);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pRefLists = (AddressLayout) LAYOUT.select(PATH$pRefLists);
    public static final AddressLayout LAYOUT$pShortTermRefPicSet = (AddressLayout) LAYOUT.select(PATH$pShortTermRefPicSet);
    public static final AddressLayout LAYOUT$pLongTermRefPics = (AddressLayout) LAYOUT.select(PATH$pLongTermRefPics);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pic_type = LAYOUT$pic_type.byteSize();
    public static final long SIZE$sps_video_parameter_set_id = LAYOUT$sps_video_parameter_set_id.byteSize();
    public static final long SIZE$pps_seq_parameter_set_id = LAYOUT$pps_seq_parameter_set_id.byteSize();
    public static final long SIZE$pps_pic_parameter_set_id = LAYOUT$pps_pic_parameter_set_id.byteSize();
    public static final long SIZE$short_term_ref_pic_set_idx = LAYOUT$short_term_ref_pic_set_idx.byteSize();
    public static final long SIZE$PicOrderCntVal = LAYOUT$PicOrderCntVal.byteSize();
    public static final long SIZE$TemporalId = LAYOUT$TemporalId.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pRefLists = LAYOUT$pRefLists.byteSize();
    public static final long SIZE$pShortTermRefPicSet = LAYOUT$pShortTermRefPicSet.byteSize();
    public static final long SIZE$pLongTermRefPics = LAYOUT$pLongTermRefPics.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pic_type = LAYOUT.byteOffset(PATH$pic_type);
    public static final long OFFSET$sps_video_parameter_set_id = LAYOUT.byteOffset(PATH$sps_video_parameter_set_id);
    public static final long OFFSET$pps_seq_parameter_set_id = LAYOUT.byteOffset(PATH$pps_seq_parameter_set_id);
    public static final long OFFSET$pps_pic_parameter_set_id = LAYOUT.byteOffset(PATH$pps_pic_parameter_set_id);
    public static final long OFFSET$short_term_ref_pic_set_idx = LAYOUT.byteOffset(PATH$short_term_ref_pic_set_idx);
    public static final long OFFSET$PicOrderCntVal = LAYOUT.byteOffset(PATH$PicOrderCntVal);
    public static final long OFFSET$TemporalId = LAYOUT.byteOffset(PATH$TemporalId);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pRefLists = LAYOUT.byteOffset(PATH$pRefLists);
    public static final long OFFSET$pShortTermRefPicSet = LAYOUT.byteOffset(PATH$pShortTermRefPicSet);
    public static final long OFFSET$pLongTermRefPics = LAYOUT.byteOffset(PATH$pLongTermRefPics);

    public StdVideoEncodeH265PictureInfoFlags flags() {
        return new StdVideoEncodeH265PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH265PictureInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265PictureType.class) int pic_type() {
        return segment.get(LAYOUT$pic_type, OFFSET$pic_type);
    }

    public void pic_type(@enumtype(StdVideoH265PictureType.class) int value) {
        segment.set(LAYOUT$pic_type, OFFSET$pic_type, value);
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

    public @unsigned byte short_term_ref_pic_set_idx() {
        return segment.get(LAYOUT$short_term_ref_pic_set_idx, OFFSET$short_term_ref_pic_set_idx);
    }

    public void short_term_ref_pic_set_idx(@unsigned byte value) {
        segment.set(LAYOUT$short_term_ref_pic_set_idx, OFFSET$short_term_ref_pic_set_idx, value);
    }

    public int PicOrderCntVal() {
        return segment.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);
    }

    public void PicOrderCntVal(int value) {
        segment.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);
    }

    public @unsigned byte TemporalId() {
        return segment.get(LAYOUT$TemporalId, OFFSET$TemporalId);
    }

    public void TemporalId(@unsigned byte value) {
        segment.set(LAYOUT$TemporalId, OFFSET$TemporalId, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoEncodeH265ReferenceListsInfo*") MemorySegment pRefListsRaw() {
        return segment.get(LAYOUT$pRefLists, OFFSET$pRefLists);
    }

    public void pRefListsRaw(@pointer(comment="StdVideoEncodeH265ReferenceListsInfo*") MemorySegment value) {
        segment.set(LAYOUT$pRefLists, OFFSET$pRefLists, value);
    }

    public @Nullable StdVideoEncodeH265ReferenceListsInfo pRefLists() {
        MemorySegment s = pRefListsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeH265ReferenceListsInfo(s);
    }

    public void pRefLists(@Nullable StdVideoEncodeH265ReferenceListsInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRefListsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265ReferenceListsInfo[] pRefLists(int assumedCount) {
        MemorySegment s = pRefListsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265ReferenceListsInfo.SIZE);
        StdVideoEncodeH265ReferenceListsInfo[] ret = new StdVideoEncodeH265ReferenceListsInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265ReferenceListsInfo(s.asSlice(i * StdVideoEncodeH265ReferenceListsInfo.SIZE, StdVideoEncodeH265ReferenceListsInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265ShortTermRefPicSet*") MemorySegment pShortTermRefPicSetRaw() {
        return segment.get(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet);
    }

    public void pShortTermRefPicSetRaw(@pointer(comment="StdVideoH265ShortTermRefPicSet*") MemorySegment value) {
        segment.set(LAYOUT$pShortTermRefPicSet, OFFSET$pShortTermRefPicSet, value);
    }

    public @Nullable StdVideoH265ShortTermRefPicSet pShortTermRefPicSet() {
        MemorySegment s = pShortTermRefPicSetRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265ShortTermRefPicSet(s);
    }

    public void pShortTermRefPicSet(@Nullable StdVideoH265ShortTermRefPicSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShortTermRefPicSetRaw(s);
    }

    @unsafe public @Nullable StdVideoH265ShortTermRefPicSet[] pShortTermRefPicSet(int assumedCount) {
        MemorySegment s = pShortTermRefPicSetRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ShortTermRefPicSet.SIZE);
        StdVideoH265ShortTermRefPicSet[] ret = new StdVideoH265ShortTermRefPicSet[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ShortTermRefPicSet(s.asSlice(i * StdVideoH265ShortTermRefPicSet.SIZE, StdVideoH265ShortTermRefPicSet.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeH265LongTermRefPics*") MemorySegment pLongTermRefPicsRaw() {
        return segment.get(LAYOUT$pLongTermRefPics, OFFSET$pLongTermRefPics);
    }

    public void pLongTermRefPicsRaw(@pointer(comment="StdVideoEncodeH265LongTermRefPics*") MemorySegment value) {
        segment.set(LAYOUT$pLongTermRefPics, OFFSET$pLongTermRefPics, value);
    }

    public @Nullable StdVideoEncodeH265LongTermRefPics pLongTermRefPics() {
        MemorySegment s = pLongTermRefPicsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeH265LongTermRefPics(s);
    }

    public void pLongTermRefPics(@Nullable StdVideoEncodeH265LongTermRefPics value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLongTermRefPicsRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265LongTermRefPics[] pLongTermRefPics(int assumedCount) {
        MemorySegment s = pLongTermRefPicsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265LongTermRefPics.SIZE);
        StdVideoEncodeH265LongTermRefPics[] ret = new StdVideoEncodeH265LongTermRefPics[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265LongTermRefPics(s.asSlice(i * StdVideoEncodeH265LongTermRefPics.SIZE, StdVideoEncodeH265LongTermRefPics.SIZE));
        }
        return ret;
    }

}
