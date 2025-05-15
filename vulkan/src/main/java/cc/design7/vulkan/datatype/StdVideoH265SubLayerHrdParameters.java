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

public record StdVideoH265SubLayerHrdParameters(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$bit_rate_value_minus1 = ValueLayout.JAVA_INT.withName("bit_rate_value_minus1");
    public static final OfInt LAYOUT$cpb_size_value_minus1 = ValueLayout.JAVA_INT.withName("cpb_size_value_minus1");
    public static final OfInt LAYOUT$cpb_size_du_value_minus1 = ValueLayout.JAVA_INT.withName("cpb_size_du_value_minus1");
    public static final OfInt LAYOUT$bit_rate_du_value_minus1 = ValueLayout.JAVA_INT.withName("bit_rate_du_value_minus1");
    public static final OfInt LAYOUT$cbr_flag = ValueLayout.JAVA_INT.withName("cbr_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$bit_rate_value_minus1, LAYOUT$cpb_size_value_minus1, LAYOUT$cpb_size_du_value_minus1, LAYOUT$bit_rate_du_value_minus1, LAYOUT$cbr_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265SubLayerHrdParameters allocate(Arena arena) {
        return new StdVideoH265SubLayerHrdParameters(arena.allocate(LAYOUT));
    }

    public static StdVideoH265SubLayerHrdParameters[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SubLayerHrdParameters[] ret = new StdVideoH265SubLayerHrdParameters[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SubLayerHrdParameters(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265SubLayerHrdParameters clone(Arena arena, StdVideoH265SubLayerHrdParameters src) {
        StdVideoH265SubLayerHrdParameters ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265SubLayerHrdParameters[] clone(Arena arena, StdVideoH265SubLayerHrdParameters[] src) {
        StdVideoH265SubLayerHrdParameters[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bit_rate_value_minus1 = PathElement.groupElement("PATH$bit_rate_value_minus1");
    public static final PathElement PATH$cpb_size_value_minus1 = PathElement.groupElement("PATH$cpb_size_value_minus1");
    public static final PathElement PATH$cpb_size_du_value_minus1 = PathElement.groupElement("PATH$cpb_size_du_value_minus1");
    public static final PathElement PATH$bit_rate_du_value_minus1 = PathElement.groupElement("PATH$bit_rate_du_value_minus1");
    public static final PathElement PATH$cbr_flag = PathElement.groupElement("PATH$cbr_flag");

    public static final long SIZE$bit_rate_value_minus1 = LAYOUT$bit_rate_value_minus1.byteSize();
    public static final long SIZE$cpb_size_value_minus1 = LAYOUT$cpb_size_value_minus1.byteSize();
    public static final long SIZE$cpb_size_du_value_minus1 = LAYOUT$cpb_size_du_value_minus1.byteSize();
    public static final long SIZE$bit_rate_du_value_minus1 = LAYOUT$bit_rate_du_value_minus1.byteSize();
    public static final long SIZE$cbr_flag = LAYOUT$cbr_flag.byteSize();

    public static final long OFFSET$bit_rate_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_value_minus1);
    public static final long OFFSET$cpb_size_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_value_minus1);
    public static final long OFFSET$cpb_size_du_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_du_value_minus1);
    public static final long OFFSET$bit_rate_du_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_du_value_minus1);
    public static final long OFFSET$cbr_flag = LAYOUT.byteOffset(PATH$cbr_flag);

    public @unsigned int bit_rate_value_minus1() {
        return segment.get(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1);
    }

    public void bit_rate_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1, value);
    }

    public @unsigned int cpb_size_value_minus1() {
        return segment.get(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1);
    }

    public void cpb_size_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1, value);
    }

    public @unsigned int cpb_size_du_value_minus1() {
        return segment.get(LAYOUT$cpb_size_du_value_minus1, OFFSET$cpb_size_du_value_minus1);
    }

    public void cpb_size_du_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_size_du_value_minus1, OFFSET$cpb_size_du_value_minus1, value);
    }

    public @unsigned int bit_rate_du_value_minus1() {
        return segment.get(LAYOUT$bit_rate_du_value_minus1, OFFSET$bit_rate_du_value_minus1);
    }

    public void bit_rate_du_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$bit_rate_du_value_minus1, OFFSET$bit_rate_du_value_minus1, value);
    }

    public @unsigned int cbr_flag() {
        return segment.get(LAYOUT$cbr_flag, OFFSET$cbr_flag);
    }

    public void cbr_flag(@unsigned int value) {
        segment.set(LAYOUT$cbr_flag, OFFSET$cbr_flag, value);
    }

}
/// dummy, not implemented yet
