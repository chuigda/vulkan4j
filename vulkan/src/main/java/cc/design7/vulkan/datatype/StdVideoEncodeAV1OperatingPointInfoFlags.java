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

public record StdVideoEncodeAV1OperatingPointInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$decoder_model_present_for_this_op_reserved = ValueLayout.JAVA_INT.withName("bitfield$decoder_model_present_for_this_op_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$decoder_model_present_for_this_op_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeAV1OperatingPointInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1OperatingPointInfoFlags[] ret = new StdVideoEncodeAV1OperatingPointInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags clone(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags src) {
        StdVideoEncodeAV1OperatingPointInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags[] clone(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags[] src) {
        StdVideoEncodeAV1OperatingPointInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$decoder_model_present_for_this_op_reserved = PathElement.groupElement("PATH$bitfield$decoder_model_present_for_this_op_reserved");


    public static final long OFFSET$decoder_model_present_for_this_op_reserved = LAYOUT.byteOffset(PATH$bitfield$decoder_model_present_for_this_op_reserved);

    public int decoder_model_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void decoder_model_present_for_this_op(int value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int low_delay_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void low_delay_mode_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int initial_display_delay_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void initial_display_delay_present_for_this_op(int value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBits(s, 3, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBits(s, 3, 32, value);
    }

}
/// dummy, not implemented yet
