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

public record StdVideoEncodeH264SliceHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$direct_spatial_mv_pred_flag_reserved = ValueLayout.JAVA_INT.withName("bitfield$direct_spatial_mv_pred_flag_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$direct_spatial_mv_pred_flag_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264SliceHeaderFlags allocate(Arena arena) {
        return new StdVideoEncodeH264SliceHeaderFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264SliceHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264SliceHeaderFlags[] ret = new StdVideoEncodeH264SliceHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264SliceHeaderFlags clone(Arena arena, StdVideoEncodeH264SliceHeaderFlags src) {
        StdVideoEncodeH264SliceHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264SliceHeaderFlags[] clone(Arena arena, StdVideoEncodeH264SliceHeaderFlags[] src) {
        StdVideoEncodeH264SliceHeaderFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$direct_spatial_mv_pred_flag_reserved = PathElement.groupElement("PATH$bitfield$direct_spatial_mv_pred_flag_reserved");


    public static final long OFFSET$direct_spatial_mv_pred_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$direct_spatial_mv_pred_flag_reserved);

    public int direct_spatial_mv_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void direct_spatial_mv_pred_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int num_ref_idx_active_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void num_ref_idx_active_override_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        return BitfieldUtil.readBits(s, 2, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        BitfieldUtil.writeBits(s, 2, 32, value);
    }

}
/// dummy, not implemented yet
