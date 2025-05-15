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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record StdVideoH264SpsVuiFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = ValueLayout.JAVA_INT.withName("bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH264SpsVuiFlags allocate(Arena arena) {
        return new StdVideoH264SpsVuiFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH264SpsVuiFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SpsVuiFlags[] ret = new StdVideoH264SpsVuiFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SpsVuiFlags(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = PathElement.groupElement("PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag");


    public static final long OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag = LAYOUT.byteOffset(PATH$bitfield$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);

    public int aspect_ratio_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void aspect_ratio_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int overscan_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void overscan_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int overscan_appropriate_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void overscan_appropriate_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int video_signal_type_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void video_signal_type_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int video_full_range_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 4, 5);
    }

    public void video_full_range_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 4, 5, value);
    }

    public int color_description_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 5, 6);
    }

    public void color_description_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 5, 6, value);
    }

    public int chroma_loc_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 6, 7);
    }

    public void chroma_loc_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 6, 7, value);
    }

    public int timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 7, 8);
    }

    public void timing_info_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 7, 8, value);
    }

    public int fixed_frame_rate_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 8, 9);
    }

    public void fixed_frame_rate_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 8, 9, value);
    }

    public int bitstream_restriction_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 9, 10);
    }

    public void bitstream_restriction_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 9, 10, value);
    }

    public int nal_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 10, 11);
    }

    public void nal_hrd_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 10, 11, value);
    }

    public int vcl_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        return BitfieldUtil.readBits(s, 11, 12);
    }

    public void vcl_hrd_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag, LAYOUT$aspect_ratio_info_present_flag_vcl_hrd_parameters_present_flag);
        BitfieldUtil.writeBits(s, 11, 12, value);
    }

}
/// dummy, not implemented yet
