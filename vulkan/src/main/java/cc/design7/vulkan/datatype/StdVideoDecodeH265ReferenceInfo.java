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
public record StdVideoDecodeH265ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoDecodeH265ReferenceInfoFlags.LAYOUT.withName("flags");
    public static final OfInt LAYOUT$PicOrderCntVal = ValueLayout.JAVA_INT.withName("PicOrderCntVal");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$PicOrderCntVal);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeH265ReferenceInfo allocate(Arena arena) {
        return new StdVideoDecodeH265ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH265ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH265ReferenceInfo[] ret = new StdVideoDecodeH265ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH265ReferenceInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeH265ReferenceInfo clone(Arena arena, StdVideoDecodeH265ReferenceInfo src) {
        StdVideoDecodeH265ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH265ReferenceInfo[] clone(Arena arena, StdVideoDecodeH265ReferenceInfo[] src) {
        StdVideoDecodeH265ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$PicOrderCntVal = PathElement.groupElement("PATH$PicOrderCntVal");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$PicOrderCntVal = LAYOUT$PicOrderCntVal.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$PicOrderCntVal = LAYOUT.byteOffset(PATH$PicOrderCntVal);

    public StdVideoDecodeH265ReferenceInfoFlags flags() {
        return new StdVideoDecodeH265ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoDecodeH265ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public int PicOrderCntVal() {
        return segment.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);
    }

    public void PicOrderCntVal(int value) {
        segment.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);
    }

}
