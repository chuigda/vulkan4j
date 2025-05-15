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
public record StdVideoEncodeH264RefPicMarkingEntry(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$memory_management_control_operation = ValueLayout.JAVA_INT.withName("memory_management_control_operation");
    public static final OfShort LAYOUT$difference_of_pic_nums_minus1 = ValueLayout.JAVA_SHORT.withName("difference_of_pic_nums_minus1");
    public static final OfShort LAYOUT$long_term_pic_num = ValueLayout.JAVA_SHORT.withName("long_term_pic_num");
    public static final OfShort LAYOUT$long_term_frame_idx = ValueLayout.JAVA_SHORT.withName("long_term_frame_idx");
    public static final OfShort LAYOUT$max_long_term_frame_idx_plus1 = ValueLayout.JAVA_SHORT.withName("max_long_term_frame_idx_plus1");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$memory_management_control_operation, LAYOUT$difference_of_pic_nums_minus1, LAYOUT$long_term_pic_num, LAYOUT$long_term_frame_idx, LAYOUT$max_long_term_frame_idx_plus1);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264RefPicMarkingEntry allocate(Arena arena) {
        return new StdVideoEncodeH264RefPicMarkingEntry(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264RefPicMarkingEntry[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264RefPicMarkingEntry[] ret = new StdVideoEncodeH264RefPicMarkingEntry[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264RefPicMarkingEntry(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264RefPicMarkingEntry clone(Arena arena, StdVideoEncodeH264RefPicMarkingEntry src) {
        StdVideoEncodeH264RefPicMarkingEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264RefPicMarkingEntry[] clone(Arena arena, StdVideoEncodeH264RefPicMarkingEntry[] src) {
        StdVideoEncodeH264RefPicMarkingEntry[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$memory_management_control_operation = PathElement.groupElement("PATH$memory_management_control_operation");
    public static final PathElement PATH$difference_of_pic_nums_minus1 = PathElement.groupElement("PATH$difference_of_pic_nums_minus1");
    public static final PathElement PATH$long_term_pic_num = PathElement.groupElement("PATH$long_term_pic_num");
    public static final PathElement PATH$long_term_frame_idx = PathElement.groupElement("PATH$long_term_frame_idx");
    public static final PathElement PATH$max_long_term_frame_idx_plus1 = PathElement.groupElement("PATH$max_long_term_frame_idx_plus1");

    public static final long SIZE$memory_management_control_operation = LAYOUT$memory_management_control_operation.byteSize();
    public static final long SIZE$difference_of_pic_nums_minus1 = LAYOUT$difference_of_pic_nums_minus1.byteSize();
    public static final long SIZE$long_term_pic_num = LAYOUT$long_term_pic_num.byteSize();
    public static final long SIZE$long_term_frame_idx = LAYOUT$long_term_frame_idx.byteSize();
    public static final long SIZE$max_long_term_frame_idx_plus1 = LAYOUT$max_long_term_frame_idx_plus1.byteSize();

    public static final long OFFSET$memory_management_control_operation = LAYOUT.byteOffset(PATH$memory_management_control_operation);
    public static final long OFFSET$difference_of_pic_nums_minus1 = LAYOUT.byteOffset(PATH$difference_of_pic_nums_minus1);
    public static final long OFFSET$long_term_pic_num = LAYOUT.byteOffset(PATH$long_term_pic_num);
    public static final long OFFSET$long_term_frame_idx = LAYOUT.byteOffset(PATH$long_term_frame_idx);
    public static final long OFFSET$max_long_term_frame_idx_plus1 = LAYOUT.byteOffset(PATH$max_long_term_frame_idx_plus1);

    public @enumtype(StdVideoH264MemMgmtControlOp.class) int memory_management_control_operation() {
        return segment.get(LAYOUT$memory_management_control_operation, OFFSET$memory_management_control_operation);
    }

    public void memory_management_control_operation(@enumtype(StdVideoH264MemMgmtControlOp.class) int value) {
        segment.set(LAYOUT$memory_management_control_operation, OFFSET$memory_management_control_operation, value);
    }

    public @unsigned short difference_of_pic_nums_minus1() {
        return segment.get(LAYOUT$difference_of_pic_nums_minus1, OFFSET$difference_of_pic_nums_minus1);
    }

    public void difference_of_pic_nums_minus1(@unsigned short value) {
        segment.set(LAYOUT$difference_of_pic_nums_minus1, OFFSET$difference_of_pic_nums_minus1, value);
    }

    public @unsigned short long_term_pic_num() {
        return segment.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);
    }

    public void long_term_pic_num(@unsigned short value) {
        segment.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);
    }

    public @unsigned short long_term_frame_idx() {
        return segment.get(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx);
    }

    public void long_term_frame_idx(@unsigned short value) {
        segment.set(LAYOUT$long_term_frame_idx, OFFSET$long_term_frame_idx, value);
    }

    public @unsigned short max_long_term_frame_idx_plus1() {
        return segment.get(LAYOUT$max_long_term_frame_idx_plus1, OFFSET$max_long_term_frame_idx_plus1);
    }

    public void max_long_term_frame_idx_plus1(@unsigned short value) {
        segment.set(LAYOUT$max_long_term_frame_idx_plus1, OFFSET$max_long_term_frame_idx_plus1, value);
    }

}
