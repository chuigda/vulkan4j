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

/// Represents a pointer to a {@code StdVideoEncodeH264PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264PictureInfoFlags {
///     uint32_t IdrPicFlag : 1; // @link substring="IdrPicFlag" target="#IdrPicFlag"
///     uint32_t is_reference : 1; // @link substring="is_reference" target="#is_reference"
///     uint32_t no_output_of_prior_pics_flag : 1; // @link substring="no_output_of_prior_pics_flag" target="#no_output_of_prior_pics_flag"
///     uint32_t long_term_reference_flag : 1; // @link substring="long_term_reference_flag" target="#long_term_reference_flag"
///     uint32_t adaptive_ref_pic_marking_mode_flag : 1; // @link substring="adaptive_ref_pic_marking_mode_flag" target="#adaptive_ref_pic_marking_mode_flag"
///     uint32_t reserved : 27;
/// } StdVideoEncodeH264PictureInfoFlags;
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
public record StdVideoEncodeH264PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264PictureInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH264PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264PictureInfoFlags[] ret = new StdVideoEncodeH264PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264PictureInfoFlags(segment.asSlice(i * BYTES, BYTES));
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

    public boolean IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void IdrPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void is_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean no_output_of_prior_pics_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void no_output_of_prior_pics_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean long_term_reference_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void long_term_reference_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean adaptive_ref_pic_marking_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void adaptive_ref_pic_marking_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$IdrPicFlag$reserved, LAYOUT$bitfield$IdrPicFlag$reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$IdrPicFlag$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$IdrPicFlag$reserved = PathElement.groupElement("PATH$bitfield$IdrPicFlag$reserved");

    public static final OfInt LAYOUT$bitfield$IdrPicFlag$reserved = (OfInt) LAYOUT.select(PATH$bitfield$IdrPicFlag$reserved);


    public static final long OFFSET$bitfield$IdrPicFlag$reserved = LAYOUT.byteOffset(PATH$bitfield$IdrPicFlag$reserved);
}
