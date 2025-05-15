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

/// Represents a pointer to a {@code StdVideoEncodeH264ReferenceInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264ReferenceInfo {
///     StdVideoEncodeH264ReferenceInfoFlags flags;
///     StdVideoH264PictureType primary_pic_type;
///     uint32_t FrameNum;
///     int32_t PicOrderCnt;
///     uint16_t long_term_pic_num;
///     uint16_t long_term_frame_idx;
///     uint8_t temporal_id;
/// } StdVideoEncodeH264ReferenceInfo;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeH264ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264ReferenceInfo allocate(Arena arena) {
        StdVideoEncodeH264ReferenceInfo ret = new StdVideoEncodeH264ReferenceInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH264ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264ReferenceInfo[] ret = new StdVideoEncodeH264ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH264ReferenceInfo clone(Arena arena, StdVideoEncodeH264ReferenceInfo src) {
        StdVideoEncodeH264ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264ReferenceInfo[] clone(Arena arena, StdVideoEncodeH264ReferenceInfo[] src) {
        StdVideoEncodeH264ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoEncodeH264ReferenceInfoFlags flags() {
        return new StdVideoEncodeH264ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH264ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH264PictureType.class) int primary_pic_type() {
        return segment.get(LAYOUT$primary_pic_type, OFFSET$primary_pic_type);
    }

    public void primary_pic_type(@enumtype(StdVideoH264PictureType.class) int value) {
        segment.set(LAYOUT$primary_pic_type, OFFSET$primary_pic_type, value);
    }

    public @unsigned int FrameNum() {
        return segment.get(LAYOUT$FrameNum, OFFSET$FrameNum);
    }

    public void FrameNum(@unsigned int value) {
        segment.set(LAYOUT$FrameNum, OFFSET$FrameNum, value);
    }

    public int PicOrderCnt() {
        return segment.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);
    }

    public void PicOrderCnt(int value) {
        segment.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);
    }

    public @unsigned short long_term_pic_num() {
        return segment.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);
    }

    public void long_term_pic_num(@unsigned short value) {
        segment.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);
    }

    public @unsigned short long_term_frame_idx() {
        return segment.get(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx);
    }

    public void long_term_frame_idx(@unsigned short value) {
        segment.set(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx, value);
    }

    public @unsigned byte temporal_id() {
        return segment.get(LAYOUT$temporal_id, OFFSET$temporal_id);
    }

    public void temporal_id(@unsigned byte value) {
        segment.set(LAYOUT$temporal_id, OFFSET$temporal_id, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("FrameNum"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num"),
        ValueLayout.JAVA_SHORT.withName("long_term_frame_idx"),
        ValueLayout.JAVA_BYTE.withName("temporal_id")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$primary_pic_type = PathElement.groupElement("PATH$primary_pic_type");
    public static final PathElement PATH$FrameNum = PathElement.groupElement("PATH$FrameNum");
    public static final PathElement PATH$PicOrderCnt = PathElement.groupElement("PATH$PicOrderCnt");
    public static final PathElement PATH$long_term_pic_num = PathElement.groupElement("PATH$long_term_pic_num");
    public static final PathElement PATH$long_term_frame_idx = PathElement.groupElement("PATH$long_term_frame_idx");
    public static final PathElement PATH$temporal_id = PathElement.groupElement("PATH$temporal_id");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$primary_pic_type = (OfInt) LAYOUT.select(PATH$primary_pic_type);
    public static final OfInt LAYOUT$FrameNum = (OfInt) LAYOUT.select(PATH$FrameNum);
    public static final OfInt LAYOUT$PicOrderCnt = (OfInt) LAYOUT.select(PATH$PicOrderCnt);
    public static final OfShort LAYOUT$long_term_pic_num = (OfShort) LAYOUT.select(PATH$long_term_pic_num);
    public static final OfShort LAYOUT$long_term_frame_idx = (OfShort) LAYOUT.select(PATH$long_term_frame_idx);
    public static final OfByte LAYOUT$temporal_id = (OfByte) LAYOUT.select(PATH$temporal_id);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$primary_pic_type = LAYOUT$primary_pic_type.byteSize();
    public static final long SIZE$FrameNum = LAYOUT$FrameNum.byteSize();
    public static final long SIZE$PicOrderCnt = LAYOUT$PicOrderCnt.byteSize();
    public static final long SIZE$long_term_pic_num = LAYOUT$long_term_pic_num.byteSize();
    public static final long SIZE$long_term_frame_idx = LAYOUT$long_term_frame_idx.byteSize();
    public static final long SIZE$temporal_id = LAYOUT$temporal_id.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$primary_pic_type = LAYOUT.byteOffset(PATH$primary_pic_type);
    public static final long OFFSET$FrameNum = LAYOUT.byteOffset(PATH$FrameNum);
    public static final long OFFSET$PicOrderCnt = LAYOUT.byteOffset(PATH$PicOrderCnt);
    public static final long OFFSET$long_term_pic_num = LAYOUT.byteOffset(PATH$long_term_pic_num);
    public static final long OFFSET$long_term_frame_idx = LAYOUT.byteOffset(PATH$long_term_frame_idx);
    public static final long OFFSET$temporal_id = LAYOUT.byteOffset(PATH$temporal_id);
}
