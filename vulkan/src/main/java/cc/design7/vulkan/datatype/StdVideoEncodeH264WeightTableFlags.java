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

public record StdVideoEncodeH264WeightTableFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$luma_weight_l0_flag = ValueLayout.JAVA_INT.withName("luma_weight_l0_flag");
    public static final OfInt LAYOUT$chroma_weight_l0_flag = ValueLayout.JAVA_INT.withName("chroma_weight_l0_flag");
    public static final OfInt LAYOUT$luma_weight_l1_flag = ValueLayout.JAVA_INT.withName("luma_weight_l1_flag");
    public static final OfInt LAYOUT$chroma_weight_l1_flag = ValueLayout.JAVA_INT.withName("chroma_weight_l1_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$luma_weight_l0_flag, LAYOUT$chroma_weight_l0_flag, LAYOUT$luma_weight_l1_flag, LAYOUT$chroma_weight_l1_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264WeightTableFlags allocate(Arena arena) {
        return new StdVideoEncodeH264WeightTableFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264WeightTableFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264WeightTableFlags[] ret = new StdVideoEncodeH264WeightTableFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264WeightTableFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264WeightTableFlags clone(Arena arena, StdVideoEncodeH264WeightTableFlags src) {
        StdVideoEncodeH264WeightTableFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264WeightTableFlags[] clone(Arena arena, StdVideoEncodeH264WeightTableFlags[] src) {
        StdVideoEncodeH264WeightTableFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$luma_weight_l0_flag = PathElement.groupElement("PATH$luma_weight_l0_flag");
    public static final PathElement PATH$chroma_weight_l0_flag = PathElement.groupElement("PATH$chroma_weight_l0_flag");
    public static final PathElement PATH$luma_weight_l1_flag = PathElement.groupElement("PATH$luma_weight_l1_flag");
    public static final PathElement PATH$chroma_weight_l1_flag = PathElement.groupElement("PATH$chroma_weight_l1_flag");

    public static final long SIZE$luma_weight_l0_flag = LAYOUT$luma_weight_l0_flag.byteSize();
    public static final long SIZE$chroma_weight_l0_flag = LAYOUT$chroma_weight_l0_flag.byteSize();
    public static final long SIZE$luma_weight_l1_flag = LAYOUT$luma_weight_l1_flag.byteSize();
    public static final long SIZE$chroma_weight_l1_flag = LAYOUT$chroma_weight_l1_flag.byteSize();

    public static final long OFFSET$luma_weight_l0_flag = LAYOUT.byteOffset(PATH$luma_weight_l0_flag);
    public static final long OFFSET$chroma_weight_l0_flag = LAYOUT.byteOffset(PATH$chroma_weight_l0_flag);
    public static final long OFFSET$luma_weight_l1_flag = LAYOUT.byteOffset(PATH$luma_weight_l1_flag);
    public static final long OFFSET$chroma_weight_l1_flag = LAYOUT.byteOffset(PATH$chroma_weight_l1_flag);

    public @unsigned int luma_weight_l0_flag() {
        return segment.get(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag);
    }

    public void luma_weight_l0_flag(@unsigned int value) {
        segment.set(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag, value);
    }

    public @unsigned int chroma_weight_l0_flag() {
        return segment.get(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag);
    }

    public void chroma_weight_l0_flag(@unsigned int value) {
        segment.set(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag, value);
    }

    public @unsigned int luma_weight_l1_flag() {
        return segment.get(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag);
    }

    public void luma_weight_l1_flag(@unsigned int value) {
        segment.set(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag, value);
    }

    public @unsigned int chroma_weight_l1_flag() {
        return segment.get(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag);
    }

    public void chroma_weight_l1_flag(@unsigned int value) {
        segment.set(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag, value);
    }

}
/// dummy, not implemented yet
