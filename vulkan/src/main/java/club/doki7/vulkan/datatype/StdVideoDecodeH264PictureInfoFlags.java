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

/// Represents a pointer to a {@code StdVideoDecodeH264PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264PictureInfoFlags {
///     uint32_t field_pic_flag : 1; // @link substring="field_pic_flag" target="#field_pic_flag"
///     uint32_t is_intra : 1; // @link substring="is_intra" target="#is_intra"
///     uint32_t IdrPicFlag : 1; // @link substring="IdrPicFlag" target="#IdrPicFlag"
///     uint32_t bottom_field_flag : 1; // @link substring="bottom_field_flag" target="#bottom_field_flag"
///     uint32_t is_reference : 1; // @link substring="is_reference" target="#is_reference"
///     uint32_t complementary_field_pair : 1; // @link substring="complementary_field_pair" target="#complementary_field_pair"
/// } StdVideoDecodeH264PictureInfoFlags;
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
public record StdVideoDecodeH264PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoDecodeH264PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH264PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264PictureInfoFlags[] ret = new StdVideoDecodeH264PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264PictureInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoDecodeH264PictureInfoFlags clone(Arena arena, StdVideoDecodeH264PictureInfoFlags src) {
        StdVideoDecodeH264PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264PictureInfoFlags[] clone(Arena arena, StdVideoDecodeH264PictureInfoFlags[] src) {
        StdVideoDecodeH264PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean field_pic_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 0);
    }

    public void field_pic_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean is_intra() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 1);
    }

    public void is_intra(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 2);
    }

    public void IdrPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 3);
    }

    public void bottom_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 4);
    }

    public void is_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean complementary_field_pair() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 5);
    }

    public void complementary_field_pair(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$field_pic_flag$complementary_field_pair")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$field_pic_flag$complementary_field_pair = PathElement.groupElement("field_pic_flag$complementary_field_pair");

    public static final OfInt LAYOUT$bitfield$field_pic_flag$complementary_field_pair = (OfInt) LAYOUT.select(PATH$bitfield$field_pic_flag$complementary_field_pair);


    public static final long OFFSET$bitfield$field_pic_flag$complementary_field_pair = LAYOUT.byteOffset(PATH$bitfield$field_pic_flag$complementary_field_pair);
}
