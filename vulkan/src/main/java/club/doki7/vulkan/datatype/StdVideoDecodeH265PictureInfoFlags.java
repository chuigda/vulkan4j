package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoDecodeH265PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH265PictureInfoFlags {
///     uint32_t IrapPicFlag : 1; // @link substring="IrapPicFlag" target="#IrapPicFlag"
///     uint32_t IdrPicFlag : 1; // @link substring="IdrPicFlag" target="#IdrPicFlag"
///     uint32_t IsReference : 1; // @link substring="IsReference" target="#IsReference"
///     uint32_t short_term_ref_pic_set_sps_flag : 1; // @link substring="short_term_ref_pic_set_sps_flag" target="#short_term_ref_pic_set_sps_flag"
/// } StdVideoDecodeH265PictureInfoFlags;
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
public record StdVideoDecodeH265PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeH265PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH265PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH265PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH265PictureInfoFlags[] ret = new StdVideoDecodeH265PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH265PictureInfoFlags(segment.asSlice(i * BYTES, BYTES));
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

    public boolean IrapPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void IrapPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void IdrPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean IsReference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void IsReference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean short_term_ref_pic_set_sps_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void short_term_ref_pic_set_sps_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag, LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag = PathElement.groupElement("IrapPicFlag$short_term_ref_pic_set_sps_flag");

    public static final OfInt LAYOUT$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag = (OfInt) LAYOUT.select(PATH$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);


    public static final long OFFSET$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag = LAYOUT.byteOffset(PATH$bitfield$IrapPicFlag$short_term_ref_pic_set_sps_flag);
}
