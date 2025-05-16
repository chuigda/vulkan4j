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

/// Represents a pointer to a {@code StdVideoH265SpsVuiFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265SpsVuiFlags {
///     uint32_t aspect_ratio_info_present_flag : 1;
///     uint32_t overscan_info_present_flag : 1;
///     uint32_t overscan_appropriate_flag : 1;
///     uint32_t video_signal_type_present_flag : 1;
///     uint32_t video_full_range_flag : 1;
///     uint32_t colour_description_present_flag : 1;
///     uint32_t chroma_loc_info_present_flag : 1;
///     uint32_t neutral_chroma_indication_flag : 1;
///     uint32_t field_seq_flag : 1;
///     uint32_t frame_field_info_present_flag : 1;
///     uint32_t default_display_window_flag : 1;
///     uint32_t vui_timing_info_present_flag : 1;
///     uint32_t vui_poc_proportional_to_timing_flag : 1;
///     uint32_t vui_hrd_parameters_present_flag : 1;
///     uint32_t bitstream_restriction_flag : 1;
///     uint32_t tiles_fixed_structure_flag : 1;
///     uint32_t motion_vectors_over_pic_boundaries_flag : 1;
///     uint32_t restricted_ref_pic_lists_flag : 1;
/// } StdVideoH265SpsVuiFlags;
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
public record StdVideoH265SpsVuiFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265SpsVuiFlags allocate(Arena arena) {
        StdVideoH265SpsVuiFlags ret = new StdVideoH265SpsVuiFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265SpsVuiFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SpsVuiFlags[] ret = new StdVideoH265SpsVuiFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SpsVuiFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265SpsVuiFlags clone(Arena arena, StdVideoH265SpsVuiFlags src) {
        StdVideoH265SpsVuiFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265SpsVuiFlags[] clone(Arena arena, StdVideoH265SpsVuiFlags[] src) {
        StdVideoH265SpsVuiFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean aspect_ratio_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void aspect_ratio_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean overscan_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void overscan_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean overscan_appropriate_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void overscan_appropriate_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean video_signal_type_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void video_signal_type_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean video_full_range_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void video_full_range_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean colour_description_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void colour_description_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean chroma_loc_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void chroma_loc_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean neutral_chroma_indication_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void neutral_chroma_indication_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean field_seq_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 8);
    }

    public void field_seq_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean frame_field_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 9);
    }

    public void frame_field_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean default_display_window_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 10);
    }

    public void default_display_window_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean vui_timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 11);
    }

    public void vui_timing_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean vui_poc_proportional_to_timing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 12);
    }

    public void vui_poc_proportional_to_timing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean vui_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 13);
    }

    public void vui_hrd_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean bitstream_restriction_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 14);
    }

    public void bitstream_restriction_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean tiles_fixed_structure_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 15);
    }

    public void tiles_fixed_structure_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public boolean motion_vectors_over_pic_boundaries_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 16);
    }

    public void motion_vectors_over_pic_boundaries_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 16, value);
    }

    public boolean restricted_ref_pic_lists_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        return BitfieldUtil.readBit(s, 17);
    }

    public void restricted_ref_pic_lists_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag, LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
        BitfieldUtil.writeBit(s, 17, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag = PathElement.groupElement("PATH$bitfield$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag");

    public static final OfInt LAYOUT$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag = (OfInt) LAYOUT.select(PATH$bitfield$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);


    public static final long OFFSET$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag = LAYOUT.byteOffset(PATH$bitfield$aspect_ratio_info_present_flag_restricted_ref_pic_lists_flag);
}
