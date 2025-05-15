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

public record StdVideoH265HrdFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag = ValueLayout.JAVA_INT.withName("bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265HrdFlags allocate(Arena arena) {
        return new StdVideoH265HrdFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265HrdFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265HrdFlags[] ret = new StdVideoH265HrdFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265HrdFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265HrdFlags clone(Arena arena, StdVideoH265HrdFlags src) {
        StdVideoH265HrdFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265HrdFlags[] clone(Arena arena, StdVideoH265HrdFlags[] src) {
        StdVideoH265HrdFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag = PathElement.groupElement("PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag");


    public static final long OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag = LAYOUT.byteOffset(PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag);

    public int nal_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void nal_hrd_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int vcl_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void vcl_hrd_parameters_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int sub_pic_hrd_params_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void sub_pic_hrd_params_present_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int sub_pic_cpb_params_in_pic_timing_sei_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void sub_pic_cpb_params_in_pic_timing_sei_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int fixed_pic_rate_general_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 4, 12);
    }

    public void fixed_pic_rate_general_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 4, 12, value);
    }

    public int fixed_pic_rate_within_cvs_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 12, 20);
    }

    public void fixed_pic_rate_within_cvs_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 12, 20, value);
    }

    public int low_delay_hrd_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 20, 28);
    }

    public void low_delay_hrd_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 20, 28, value);
    }

}
/// dummy, not implemented yet
