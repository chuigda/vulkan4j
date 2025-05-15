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

public record StdVideoH265DecPicBufMgr(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$max_latency_increase_plus1 = ValueLayout.JAVA_INT.withName("max_latency_increase_plus1");
    public static final OfByte LAYOUT$max_dec_pic_buffering_minus1 = ValueLayout.JAVA_BYTE.withName("max_dec_pic_buffering_minus1");
    public static final OfByte LAYOUT$max_num_reorder_pics = ValueLayout.JAVA_BYTE.withName("max_num_reorder_pics");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$max_latency_increase_plus1, LAYOUT$max_dec_pic_buffering_minus1, LAYOUT$max_num_reorder_pics);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265DecPicBufMgr allocate(Arena arena) {
        return new StdVideoH265DecPicBufMgr(arena.allocate(LAYOUT));
    }

    public static StdVideoH265DecPicBufMgr[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265DecPicBufMgr[] ret = new StdVideoH265DecPicBufMgr[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265DecPicBufMgr(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265DecPicBufMgr clone(Arena arena, StdVideoH265DecPicBufMgr src) {
        StdVideoH265DecPicBufMgr ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265DecPicBufMgr[] clone(Arena arena, StdVideoH265DecPicBufMgr[] src) {
        StdVideoH265DecPicBufMgr[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$max_latency_increase_plus1 = PathElement.groupElement("PATH$max_latency_increase_plus1");
    public static final PathElement PATH$max_dec_pic_buffering_minus1 = PathElement.groupElement("PATH$max_dec_pic_buffering_minus1");
    public static final PathElement PATH$max_num_reorder_pics = PathElement.groupElement("PATH$max_num_reorder_pics");

    public static final long SIZE$max_latency_increase_plus1 = LAYOUT$max_latency_increase_plus1.byteSize();
    public static final long SIZE$max_dec_pic_buffering_minus1 = LAYOUT$max_dec_pic_buffering_minus1.byteSize();
    public static final long SIZE$max_num_reorder_pics = LAYOUT$max_num_reorder_pics.byteSize();

    public static final long OFFSET$max_latency_increase_plus1 = LAYOUT.byteOffset(PATH$max_latency_increase_plus1);
    public static final long OFFSET$max_dec_pic_buffering_minus1 = LAYOUT.byteOffset(PATH$max_dec_pic_buffering_minus1);
    public static final long OFFSET$max_num_reorder_pics = LAYOUT.byteOffset(PATH$max_num_reorder_pics);

    public @unsigned int max_latency_increase_plus1() {
        return segment.get(LAYOUT$max_latency_increase_plus1, OFFSET$max_latency_increase_plus1);
    }

    public void max_latency_increase_plus1(@unsigned int value) {
        segment.set(LAYOUT$max_latency_increase_plus1, OFFSET$max_latency_increase_plus1, value);
    }

    public @unsigned byte max_dec_pic_buffering_minus1() {
        return segment.get(LAYOUT$max_dec_pic_buffering_minus1, OFFSET$max_dec_pic_buffering_minus1);
    }

    public void max_dec_pic_buffering_minus1(@unsigned byte value) {
        segment.set(LAYOUT$max_dec_pic_buffering_minus1, OFFSET$max_dec_pic_buffering_minus1, value);
    }

    public @unsigned byte max_num_reorder_pics() {
        return segment.get(LAYOUT$max_num_reorder_pics, OFFSET$max_num_reorder_pics);
    }

    public void max_num_reorder_pics(@unsigned byte value) {
        segment.set(LAYOUT$max_num_reorder_pics, OFFSET$max_num_reorder_pics, value);
    }

}
/// dummy, not implemented yet
