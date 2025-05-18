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

/// Represents a pointer to a {@code StdVideoH264SpsVuiFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264SpsVuiFlags {
///     uint32_t aspect_ratio_info_present_flag : 1; // @link substring="aspect_ratio_info_present_flag" target="#aspect_ratio_info_present_flag"
///     uint32_t overscan_info_present_flag : 1; // @link substring="overscan_info_present_flag" target="#overscan_info_present_flag"
///     uint32_t overscan_appropriate_flag : 1; // @link substring="overscan_appropriate_flag" target="#overscan_appropriate_flag"
///     uint32_t video_signal_type_present_flag : 1; // @link substring="video_signal_type_present_flag" target="#video_signal_type_present_flag"
///     uint32_t video_full_range_flag : 1; // @link substring="video_full_range_flag" target="#video_full_range_flag"
///     uint32_t color_description_present_flag : 1; // @link substring="color_description_present_flag" target="#color_description_present_flag"
///     uint32_t chroma_loc_info_present_flag : 1; // @link substring="chroma_loc_info_present_flag" target="#chroma_loc_info_present_flag"
///     uint32_t timing_info_present_flag : 1; // @link substring="timing_info_present_flag" target="#timing_info_present_flag"
///     uint32_t fixed_frame_rate_flag : 1; // @link substring="fixed_frame_rate_flag" target="#fixed_frame_rate_flag"
///     uint32_t bitstream_restriction_flag : 1; // @link substring="bitstream_restriction_flag" target="#bitstream_restriction_flag"
///     uint32_t nal_hrd_parameters_present_flag : 1; // @link substring="nal_hrd_parameters_present_flag" target="#nal_hrd_parameters_present_flag"
///     uint32_t vcl_hrd_parameters_present_flag : 1; // @link substring="vcl_hrd_parameters_present_flag" target="#vcl_hrd_parameters_present_flag"
/// } StdVideoH264SpsVuiFlags;
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
public record StdVideoH264SpsVuiFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264SpsVuiFlags allocate(Arena arena) {
        StdVideoH264SpsVuiFlags ret = new StdVideoH264SpsVuiFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264SpsVuiFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SpsVuiFlags[] ret = new StdVideoH264SpsVuiFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SpsVuiFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264SpsVuiFlags clone(Arena arena, StdVideoH264SpsVuiFlags src) {
        StdVideoH264SpsVuiFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264SpsVuiFlags[] clone(Arena arena, StdVideoH264SpsVuiFlags[] src) {
        StdVideoH264SpsVuiFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean aspect_ratio_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void aspect_ratio_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean overscan_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void overscan_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean overscan_appropriate_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void overscan_appropriate_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean video_signal_type_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void video_signal_type_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean video_full_range_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void video_full_range_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean color_description_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void color_description_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean chroma_loc_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void chroma_loc_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void timing_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean fixed_frame_rate_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 8);
    }

    public void fixed_frame_rate_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean bitstream_restriction_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 9);
    }

    public void bitstream_restriction_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean nal_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 10);
    }

    public void nal_hrd_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean vcl_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBit(s, 11);
    }

    public void vcl_hrd_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = PathElement.groupElement("PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag");

    public static final OfInt LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = (OfInt) LAYOUT.select(PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);


    public static final long OFFSET$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = LAYOUT.byteOffset(PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
}
