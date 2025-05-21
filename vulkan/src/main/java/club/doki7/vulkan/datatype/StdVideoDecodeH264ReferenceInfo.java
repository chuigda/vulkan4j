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

/// Represents a pointer to a {@code StdVideoDecodeH264ReferenceInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264ReferenceInfo {
///     StdVideoDecodeH264ReferenceInfoFlags flags; // @link substring="StdVideoDecodeH264ReferenceInfoFlags" target="StdVideoDecodeH264ReferenceInfoFlags" @link substring="flags" target="#flags"
///     uint16_t FrameNum; // @link substring="FrameNum" target="#FrameNum"
///     uint16_t reserved;
///     int32_t PicOrderCnt; // @link substring="PicOrderCnt" target="#PicOrderCnt"
/// } StdVideoDecodeH264ReferenceInfo;
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
public record StdVideoDecodeH264ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeH264ReferenceInfo allocate(Arena arena) {
        return new StdVideoDecodeH264ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264ReferenceInfo[] ret = new StdVideoDecodeH264ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264ReferenceInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfo clone(Arena arena, StdVideoDecodeH264ReferenceInfo src) {
        StdVideoDecodeH264ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfo[] clone(Arena arena, StdVideoDecodeH264ReferenceInfo[] src) {
        StdVideoDecodeH264ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull StdVideoDecodeH264ReferenceInfoFlags flags() {
        return new StdVideoDecodeH264ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoDecodeH264ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned short FrameNum() {
        return segment.get(LAYOUT$FrameNum, OFFSET$FrameNum);
    }

    public void FrameNum(@unsigned short value) {
        segment.set(LAYOUT$FrameNum, OFFSET$FrameNum, value);
    }


    public int PicOrderCnt() {
        return segment.get(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt);
    }

    public void PicOrderCnt(int value) {
        segment.set(LAYOUT$PicOrderCnt, OFFSET$PicOrderCnt, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoDecodeH264ReferenceInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("FrameNum"),
        ValueLayout.JAVA_SHORT.withName("reserved"),
        ValueLayout.JAVA_INT.withName("PicOrderCnt")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$FrameNum = PathElement.groupElement("FrameNum");
    public static final PathElement PATH$PicOrderCnt = PathElement.groupElement("PicOrderCnt");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfShort LAYOUT$FrameNum = (OfShort) LAYOUT.select(PATH$FrameNum);
    public static final OfInt LAYOUT$PicOrderCnt = (OfInt) LAYOUT.select(PATH$PicOrderCnt);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$FrameNum = LAYOUT$FrameNum.byteSize();
    public static final long SIZE$PicOrderCnt = LAYOUT$PicOrderCnt.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$FrameNum = LAYOUT.byteOffset(PATH$FrameNum);
    public static final long OFFSET$PicOrderCnt = LAYOUT.byteOffset(PATH$PicOrderCnt);
}
