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

@ValueBasedCandidate
public record StdVideoEncodeH264RefListModEntry(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$modification_of_pic_nums_idc = ValueLayout.JAVA_INT.withName("modification_of_pic_nums_idc");
    public static final OfShort LAYOUT$abs_diff_pic_num_minus1 = ValueLayout.JAVA_SHORT.withName("abs_diff_pic_num_minus1");
    public static final OfShort LAYOUT$long_term_pic_num = ValueLayout.JAVA_SHORT.withName("long_term_pic_num");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$modification_of_pic_nums_idc, LAYOUT$abs_diff_pic_num_minus1, LAYOUT$long_term_pic_num);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264RefListModEntry allocate(Arena arena) {
        return new StdVideoEncodeH264RefListModEntry(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264RefListModEntry[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264RefListModEntry[] ret = new StdVideoEncodeH264RefListModEntry[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264RefListModEntry(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264RefListModEntry clone(Arena arena, StdVideoEncodeH264RefListModEntry src) {
        StdVideoEncodeH264RefListModEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264RefListModEntry[] clone(Arena arena, StdVideoEncodeH264RefListModEntry[] src) {
        StdVideoEncodeH264RefListModEntry[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$modification_of_pic_nums_idc = PathElement.groupElement("PATH$modification_of_pic_nums_idc");
    public static final PathElement PATH$abs_diff_pic_num_minus1 = PathElement.groupElement("PATH$abs_diff_pic_num_minus1");
    public static final PathElement PATH$long_term_pic_num = PathElement.groupElement("PATH$long_term_pic_num");

    public static final long SIZE$modification_of_pic_nums_idc = LAYOUT$modification_of_pic_nums_idc.byteSize();
    public static final long SIZE$abs_diff_pic_num_minus1 = LAYOUT$abs_diff_pic_num_minus1.byteSize();
    public static final long SIZE$long_term_pic_num = LAYOUT$long_term_pic_num.byteSize();

    public static final long OFFSET$modification_of_pic_nums_idc = LAYOUT.byteOffset(PATH$modification_of_pic_nums_idc);
    public static final long OFFSET$abs_diff_pic_num_minus1 = LAYOUT.byteOffset(PATH$abs_diff_pic_num_minus1);
    public static final long OFFSET$long_term_pic_num = LAYOUT.byteOffset(PATH$long_term_pic_num);

    public @enumtype(StdVideoH264ModificationOfPicNumsIdc.class) int modification_of_pic_nums_idc() {
        return segment.get(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc);
    }

    public void modification_of_pic_nums_idc(@enumtype(StdVideoH264ModificationOfPicNumsIdc.class) int value) {
        segment.set(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc, value);
    }

    public @unsigned short abs_diff_pic_num_minus1() {
        return segment.get(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1);
    }

    public void abs_diff_pic_num_minus1(@unsigned short value) {
        segment.set(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1, value);
    }

    public @unsigned short long_term_pic_num() {
        return segment.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);
    }

    public void long_term_pic_num(@unsigned short value) {
        segment.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);
    }

}
