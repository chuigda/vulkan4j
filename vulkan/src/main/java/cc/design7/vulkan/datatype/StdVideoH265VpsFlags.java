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

@ValueBasedCandidate
public record StdVideoH265VpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = ValueLayout.JAVA_INT.withName("bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265VpsFlags allocate(Arena arena) {
        return new StdVideoH265VpsFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265VpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265VpsFlags[] ret = new StdVideoH265VpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265VpsFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265VpsFlags clone(Arena arena, StdVideoH265VpsFlags src) {
        StdVideoH265VpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265VpsFlags[] clone(Arena arena, StdVideoH265VpsFlags[] src) {
        StdVideoH265VpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = PathElement.groupElement("PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag");


    public static final long OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = LAYOUT.byteOffset(PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);

    public boolean vps_temporal_id_nesting_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void vps_temporal_id_nesting_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean vps_sub_layer_ordering_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void vps_sub_layer_ordering_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean vps_timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void vps_timing_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean vps_poc_proportional_to_timing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void vps_poc_proportional_to_timing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

}
