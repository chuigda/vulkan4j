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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoDecodeH264PictureInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264PictureInfo {
///     StdVideoDecodeH264PictureInfoFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t frame_num;
///     uint16_t idr_pic_id;
///     int32_t PicOrderCnt;
/// } StdVideoDecodeH264PictureInfo;
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
public record StdVideoDecodeH264PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeH264PictureInfo allocate(Arena arena) {
        StdVideoDecodeH264PictureInfo ret = new StdVideoDecodeH264PictureInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoDecodeH264PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264PictureInfo[] ret = new StdVideoDecodeH264PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264PictureInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeH264PictureInfo clone(Arena arena, StdVideoDecodeH264PictureInfo src) {
        StdVideoDecodeH264PictureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264PictureInfo[] clone(Arena arena, StdVideoDecodeH264PictureInfo[] src) {
        StdVideoDecodeH264PictureInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoDecodeH264PictureInfoFlags flags() {
        return new StdVideoDecodeH264PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoDecodeH264PictureInfoFlags value) {
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

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned byte reserved2() {
        return segment.get(LAYOUT$reserved2, OFFSET$reserved2);
    }

    public void reserved2(@unsigned byte value) {
        segment.set(LAYOUT$reserved2, OFFSET$reserved2, value);
    }

    public @unsigned short frame_num() {
        return segment.get(LAYOUT$frame_num, OFFSET$frame_num);
    }

    public void frame_num(@unsigned short value) {
        segment.set(LAYOUT$frame_num, OFFSET$frame_num, value);
    }

    public @unsigned short idr_pic_id() {
        return segment.get(LAYOUT$idr_pic_id, OFFSET$idr_pic_id);
    }

    public void idr_pic_id(@unsigned short value) {
        segment.set(LAYOUT$idr_pic_id, OFFSET$idr_pic_id, value);
    }

    public int PicOrderCnt() {
        return segment.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);
    }

    public void PicOrderCnt(int value) {
        segment.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoDecodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("frame_num"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$seq_parameter_set_id = PathElement.groupElement("PATH$seq_parameter_set_id");
    public static final PathElement PATH$pic_parameter_set_id = PathElement.groupElement("PATH$pic_parameter_set_id");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$frame_num = PathElement.groupElement("PATH$frame_num");
    public static final PathElement PATH$idr_pic_id = PathElement.groupElement("PATH$idr_pic_id");
    public static final PathElement PATH$PicOrderCnt = PathElement.groupElement("PATH$PicOrderCnt");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$seq_parameter_set_id);
    public static final OfByte LAYOUT$pic_parameter_set_id = (OfByte) LAYOUT.select(PATH$pic_parameter_set_id);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final OfByte LAYOUT$reserved2 = (OfByte) LAYOUT.select(PATH$reserved2);
    public static final OfShort LAYOUT$frame_num = (OfShort) LAYOUT.select(PATH$frame_num);
    public static final OfShort LAYOUT$idr_pic_id = (OfShort) LAYOUT.select(PATH$idr_pic_id);
    public static final OfInt LAYOUT$PicOrderCnt = (OfInt) LAYOUT.select(PATH$PicOrderCnt);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$seq_parameter_set_id = LAYOUT$seq_parameter_set_id.byteSize();
    public static final long SIZE$pic_parameter_set_id = LAYOUT$pic_parameter_set_id.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$frame_num = LAYOUT$frame_num.byteSize();
    public static final long SIZE$idr_pic_id = LAYOUT$idr_pic_id.byteSize();
    public static final long SIZE$PicOrderCnt = LAYOUT$PicOrderCnt.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$seq_parameter_set_id = LAYOUT.byteOffset(PATH$seq_parameter_set_id);
    public static final long OFFSET$pic_parameter_set_id = LAYOUT.byteOffset(PATH$pic_parameter_set_id);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$frame_num = LAYOUT.byteOffset(PATH$frame_num);
    public static final long OFFSET$idr_pic_id = LAYOUT.byteOffset(PATH$idr_pic_id);
    public static final long OFFSET$PicOrderCnt = LAYOUT.byteOffset(PATH$PicOrderCnt);
}
