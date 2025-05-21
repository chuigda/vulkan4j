package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeH264PictureInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264PictureInfo {
///     StdVideoEncodeH264PictureInfoFlags flags; // @link substring="StdVideoEncodeH264PictureInfoFlags" target="StdVideoEncodeH264PictureInfoFlags" @link substring="flags" target="#flags"
///     uint8_t seq_parameter_set_id; // @link substring="seq_parameter_set_id" target="#seq_parameter_set_id"
///     uint8_t pic_parameter_set_id; // @link substring="pic_parameter_set_id" target="#pic_parameter_set_id"
///     uint16_t idr_pic_id; // @link substring="idr_pic_id" target="#idr_pic_id"
///     StdVideoH264PictureType primary_pic_type; // @link substring="StdVideoH264PictureType" target="StdVideoH264PictureType" @link substring="primary_pic_type" target="#primary_pic_type"
///     uint32_t frame_num; // @link substring="frame_num" target="#frame_num"
///     int32_t PicOrderCnt; // @link substring="PicOrderCnt" target="#PicOrderCnt"
///     uint8_t temporal_id; // @link substring="temporal_id" target="#temporal_id"
///     uint8_t reserved1;
///     StdVideoEncodeH264ReferenceListsInfo const* pRefLists; // @link substring="StdVideoEncodeH264ReferenceListsInfo" target="StdVideoEncodeH264ReferenceListsInfo" @link substring="pRefLists" target="#pRefLists"
/// } StdVideoEncodeH264PictureInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeH264PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264PictureInfo allocate(Arena arena) {
        return new StdVideoEncodeH264PictureInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264PictureInfo[] ret = new StdVideoEncodeH264PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfo(segment.asSlice(i * BYTES, BYTES));
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

    public @NotNull StdVideoEncodeH264PictureInfoFlags flags() {
        return new StdVideoEncodeH264PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeH264PictureInfoFlags value) {
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


    public @Nullable StdVideoEncodeH264ReferenceListsInfo pRefLists() {
        MemorySegment s = pRefListsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264ReferenceListsInfo.BYTES);
        StdVideoEncodeH264ReferenceListsInfo[] ret = new StdVideoEncodeH264ReferenceListsInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceListsInfo(s.asSlice(i * StdVideoEncodeH264ReferenceListsInfo.BYTES, StdVideoEncodeH264ReferenceListsInfo.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoEncodeH264ReferenceListsInfo.class) MemorySegment pRefListsRaw() {
        return segment.get(LAYOUT$pRefLists, OFFSET$pRefLists);
    }

    public void pRefListsRaw(@pointer(target=StdVideoEncodeH264ReferenceListsInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pRefLists, OFFSET$pRefLists, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH264PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_SHORT.withName("idr_pic_id"),
        ValueLayout.JAVA_INT.withName("primary_pic_type"),
        ValueLayout.JAVA_INT.withName("frame_num"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt"),
        ValueLayout.JAVA_BYTE.withName("temporal_id"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264ReferenceListsInfo.LAYOUT).withName("pRefLists")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$seq_parameter_set_id = PathElement.groupElement("seq_parameter_set_id");
    public static final PathElement PATH$pic_parameter_set_id = PathElement.groupElement("pic_parameter_set_id");
    public static final PathElement PATH$idr_pic_id = PathElement.groupElement("idr_pic_id");
    public static final PathElement PATH$primary_pic_type = PathElement.groupElement("primary_pic_type");
    public static final PathElement PATH$frame_num = PathElement.groupElement("frame_num");
    public static final PathElement PATH$PicOrderCnt = PathElement.groupElement("PicOrderCnt");
    public static final PathElement PATH$temporal_id = PathElement.groupElement("temporal_id");
    public static final PathElement PATH$pRefLists = PathElement.groupElement("pRefLists");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$seq_parameter_set_id);
    public static final OfByte LAYOUT$pic_parameter_set_id = (OfByte) LAYOUT.select(PATH$pic_parameter_set_id);
    public static final OfShort LAYOUT$idr_pic_id = (OfShort) LAYOUT.select(PATH$idr_pic_id);
    public static final OfInt LAYOUT$primary_pic_type = (OfInt) LAYOUT.select(PATH$primary_pic_type);
    public static final OfInt LAYOUT$frame_num = (OfInt) LAYOUT.select(PATH$frame_num);
    public static final OfInt LAYOUT$PicOrderCnt = (OfInt) LAYOUT.select(PATH$PicOrderCnt);
    public static final OfByte LAYOUT$temporal_id = (OfByte) LAYOUT.select(PATH$temporal_id);
    public static final AddressLayout LAYOUT$pRefLists = (AddressLayout) LAYOUT.select(PATH$pRefLists);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$seq_parameter_set_id = LAYOUT$seq_parameter_set_id.byteSize();
    public static final long SIZE$pic_parameter_set_id = LAYOUT$pic_parameter_set_id.byteSize();
    public static final long SIZE$idr_pic_id = LAYOUT$idr_pic_id.byteSize();
    public static final long SIZE$primary_pic_type = LAYOUT$primary_pic_type.byteSize();
    public static final long SIZE$frame_num = LAYOUT$frame_num.byteSize();
    public static final long SIZE$PicOrderCnt = LAYOUT$PicOrderCnt.byteSize();
    public static final long SIZE$temporal_id = LAYOUT$temporal_id.byteSize();
    public static final long SIZE$pRefLists = LAYOUT$pRefLists.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$seq_parameter_set_id = LAYOUT.byteOffset(PATH$seq_parameter_set_id);
    public static final long OFFSET$pic_parameter_set_id = LAYOUT.byteOffset(PATH$pic_parameter_set_id);
    public static final long OFFSET$idr_pic_id = LAYOUT.byteOffset(PATH$idr_pic_id);
    public static final long OFFSET$primary_pic_type = LAYOUT.byteOffset(PATH$primary_pic_type);
    public static final long OFFSET$frame_num = LAYOUT.byteOffset(PATH$frame_num);
    public static final long OFFSET$PicOrderCnt = LAYOUT.byteOffset(PATH$PicOrderCnt);
    public static final long OFFSET$temporal_id = LAYOUT.byteOffset(PATH$temporal_id);
    public static final long OFFSET$pRefLists = LAYOUT.byteOffset(PATH$pRefLists);
}
