package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeH265PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265PictureInfoFlags {
///     uint32_t is_reference : 1;
///     uint32_t IrapPicFlag : 1;
///     uint32_t used_for_long_term_reference : 1;
///     uint32_t discardable_flag : 1;
///     uint32_t cross_layer_bla_flag : 1;
///     uint32_t pic_output_flag : 1;
///     uint32_t no_output_of_prior_pics_flag : 1;
///     uint32_t short_term_ref_pic_set_sps_flag : 1;
///     uint32_t slice_temporal_mvp_enabled_flag : 1;
///     uint32_t reserved : 23;
/// } StdVideoEncodeH265PictureInfoFlags;
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
public record StdVideoEncodeH265PictureInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265PictureInfoFlags allocate(Arena arena) {
        StdVideoEncodeH265PictureInfoFlags ret = new StdVideoEncodeH265PictureInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH265PictureInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265PictureInfoFlags[] ret = new StdVideoEncodeH265PictureInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265PictureInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH265PictureInfoFlags clone(Arena arena, StdVideoEncodeH265PictureInfoFlags src) {
        StdVideoEncodeH265PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265PictureInfoFlags[] clone(Arena arena, StdVideoEncodeH265PictureInfoFlags[] src) {
        StdVideoEncodeH265PictureInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void is_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean IrapPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void IrapPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void used_for_long_term_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean discardable_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void discardable_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean cross_layer_bla_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void cross_layer_bla_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean pic_output_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 5);
    }

    public void pic_output_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean no_output_of_prior_pics_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 6);
    }

    public void no_output_of_prior_pics_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean short_term_ref_pic_set_sps_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 7);
    }

    public void short_term_ref_pic_set_sps_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean slice_temporal_mvp_enabled_flag() {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        return BitfieldUtil.readBit(s, 8);
    }

    public void slice_temporal_mvp_enabled_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$is_reference_reserved, LAYOUT$is_reference_reserved);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$is_reference_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$is_reference_reserved = PathElement.groupElement("PATH$bitfield$is_reference_reserved");

    public static final OfInt LAYOUT$is_reference_reserved = (OfInt) LAYOUT.select(PATH$bitfield$is_reference_reserved);


    public static final long OFFSET$is_reference_reserved = LAYOUT.byteOffset(PATH$bitfield$is_reference_reserved);
}
