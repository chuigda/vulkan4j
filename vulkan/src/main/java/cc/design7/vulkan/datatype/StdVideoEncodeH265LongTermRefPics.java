package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record StdVideoEncodeH265LongTermRefPics(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$num_long_term_sps = ValueLayout.JAVA_BYTE.withName("num_long_term_sps");
    public static final OfByte LAYOUT$num_long_term_pics = ValueLayout.JAVA_BYTE.withName("num_long_term_pics");
    public static final OfByte LAYOUT$lt_idx_sps = ValueLayout.JAVA_BYTE.withName("lt_idx_sps");
    public static final OfByte LAYOUT$poc_lsb_lt = ValueLayout.JAVA_BYTE.withName("poc_lsb_lt");
    public static final OfShort LAYOUT$used_by_curr_pic_lt_flag = ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_lt_flag");
    public static final OfByte LAYOUT$delta_poc_msb_present_flag = ValueLayout.JAVA_BYTE.withName("delta_poc_msb_present_flag");
    public static final OfByte LAYOUT$delta_poc_msb_cycle_lt = ValueLayout.JAVA_BYTE.withName("delta_poc_msb_cycle_lt");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$num_long_term_sps, LAYOUT$num_long_term_pics, LAYOUT$lt_idx_sps, LAYOUT$poc_lsb_lt, LAYOUT$used_by_curr_pic_lt_flag, LAYOUT$delta_poc_msb_present_flag, LAYOUT$delta_poc_msb_cycle_lt);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH265LongTermRefPics allocate(Arena arena) {
        return new StdVideoEncodeH265LongTermRefPics(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265LongTermRefPics[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265LongTermRefPics[] ret = new StdVideoEncodeH265LongTermRefPics[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265LongTermRefPics(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265LongTermRefPics clone(Arena arena, StdVideoEncodeH265LongTermRefPics src) {
        StdVideoEncodeH265LongTermRefPics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265LongTermRefPics[] clone(Arena arena, StdVideoEncodeH265LongTermRefPics[] src) {
        StdVideoEncodeH265LongTermRefPics[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$num_long_term_sps = PathElement.groupElement("PATH$num_long_term_sps");
    public static final PathElement PATH$num_long_term_pics = PathElement.groupElement("PATH$num_long_term_pics");
    public static final PathElement PATH$lt_idx_sps = PathElement.groupElement("PATH$lt_idx_sps");
    public static final PathElement PATH$poc_lsb_lt = PathElement.groupElement("PATH$poc_lsb_lt");
    public static final PathElement PATH$used_by_curr_pic_lt_flag = PathElement.groupElement("PATH$used_by_curr_pic_lt_flag");
    public static final PathElement PATH$delta_poc_msb_present_flag = PathElement.groupElement("PATH$delta_poc_msb_present_flag");
    public static final PathElement PATH$delta_poc_msb_cycle_lt = PathElement.groupElement("PATH$delta_poc_msb_cycle_lt");

    public static final long SIZE$num_long_term_sps = LAYOUT$num_long_term_sps.byteSize();
    public static final long SIZE$num_long_term_pics = LAYOUT$num_long_term_pics.byteSize();
    public static final long SIZE$lt_idx_sps = LAYOUT$lt_idx_sps.byteSize();
    public static final long SIZE$poc_lsb_lt = LAYOUT$poc_lsb_lt.byteSize();
    public static final long SIZE$used_by_curr_pic_lt_flag = LAYOUT$used_by_curr_pic_lt_flag.byteSize();
    public static final long SIZE$delta_poc_msb_present_flag = LAYOUT$delta_poc_msb_present_flag.byteSize();
    public static final long SIZE$delta_poc_msb_cycle_lt = LAYOUT$delta_poc_msb_cycle_lt.byteSize();

    public static final long OFFSET$num_long_term_sps = LAYOUT.byteOffset(PATH$num_long_term_sps);
    public static final long OFFSET$num_long_term_pics = LAYOUT.byteOffset(PATH$num_long_term_pics);
    public static final long OFFSET$lt_idx_sps = LAYOUT.byteOffset(PATH$lt_idx_sps);
    public static final long OFFSET$poc_lsb_lt = LAYOUT.byteOffset(PATH$poc_lsb_lt);
    public static final long OFFSET$used_by_curr_pic_lt_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_lt_flag);
    public static final long OFFSET$delta_poc_msb_present_flag = LAYOUT.byteOffset(PATH$delta_poc_msb_present_flag);
    public static final long OFFSET$delta_poc_msb_cycle_lt = LAYOUT.byteOffset(PATH$delta_poc_msb_cycle_lt);

    public @unsigned byte num_long_term_sps() {
        return segment.get(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps);
    }

    public void num_long_term_sps(@unsigned byte value) {
        segment.set(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps, value);
    }

    public @unsigned byte num_long_term_pics() {
        return segment.get(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics);
    }

    public void num_long_term_pics(@unsigned byte value) {
        segment.set(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics, value);
    }

    public @unsigned byte lt_idx_sps() {
        return segment.get(LAYOUT$lt_idx_sps, OFFSET$lt_idx_sps);
    }

    public void lt_idx_sps(@unsigned byte value) {
        segment.set(LAYOUT$lt_idx_sps, OFFSET$lt_idx_sps, value);
    }

    public @unsigned byte poc_lsb_lt() {
        return segment.get(LAYOUT$poc_lsb_lt, OFFSET$poc_lsb_lt);
    }

    public void poc_lsb_lt(@unsigned byte value) {
        segment.set(LAYOUT$poc_lsb_lt, OFFSET$poc_lsb_lt, value);
    }

    public @unsigned short used_by_curr_pic_lt_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag);
    }

    public void used_by_curr_pic_lt_flag(@unsigned short value) {
        segment.set(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag, value);
    }

    public @unsigned byte delta_poc_msb_present_flag() {
        return segment.get(LAYOUT$delta_poc_msb_present_flag, OFFSET$delta_poc_msb_present_flag);
    }

    public void delta_poc_msb_present_flag(@unsigned byte value) {
        segment.set(LAYOUT$delta_poc_msb_present_flag, OFFSET$delta_poc_msb_present_flag, value);
    }

    public @unsigned byte delta_poc_msb_cycle_lt() {
        return segment.get(LAYOUT$delta_poc_msb_cycle_lt, OFFSET$delta_poc_msb_cycle_lt);
    }

    public void delta_poc_msb_cycle_lt(@unsigned byte value) {
        segment.set(LAYOUT$delta_poc_msb_cycle_lt, OFFSET$delta_poc_msb_cycle_lt, value);
    }

}
/// dummy, not implemented yet
