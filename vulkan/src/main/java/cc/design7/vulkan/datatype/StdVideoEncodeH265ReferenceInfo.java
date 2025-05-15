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

public record StdVideoEncodeH265ReferenceInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoEncodeH265ReferenceInfoFlags.LAYOUT.withName("flags");
    public static final OfInt LAYOUT$pic_type = ValueLayout.JAVA_INT.withName("pic_type");
    public static final OfInt LAYOUT$PicOrderCntVal = ValueLayout.JAVA_INT.withName("PicOrderCntVal");
    public static final OfByte LAYOUT$TemporalId = ValueLayout.JAVA_BYTE.withName("TemporalId");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$pic_type, LAYOUT$PicOrderCntVal, LAYOUT$TemporalId);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH265ReferenceInfo allocate(Arena arena) {
        return new StdVideoEncodeH265ReferenceInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265ReferenceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265ReferenceInfo[] ret = new StdVideoEncodeH265ReferenceInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265ReferenceInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfo clone(Arena arena, StdVideoEncodeH265ReferenceInfo src) {
        StdVideoEncodeH265ReferenceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfo[] clone(Arena arena, StdVideoEncodeH265ReferenceInfo[] src) {
        StdVideoEncodeH265ReferenceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pic_type = PathElement.groupElement("PATH$pic_type");
    public static final PathElement PATH$PicOrderCntVal = PathElement.groupElement("PATH$PicOrderCntVal");
    public static final PathElement PATH$TemporalId = PathElement.groupElement("PATH$TemporalId");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pic_type = LAYOUT$pic_type.byteSize();
    public static final long SIZE$PicOrderCntVal = LAYOUT$PicOrderCntVal.byteSize();
    public static final long SIZE$TemporalId = LAYOUT$TemporalId.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pic_type = LAYOUT.byteOffset(PATH$pic_type);
    public static final long OFFSET$PicOrderCntVal = LAYOUT.byteOffset(PATH$PicOrderCntVal);
    public static final long OFFSET$TemporalId = LAYOUT.byteOffset(PATH$TemporalId);

    public StdVideoEncodeH265ReferenceInfoFlags flags() {
        return new StdVideoEncodeH265ReferenceInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH265ReferenceInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265PictureType.class) int pic_type() {
        return segment.get(LAYOUT$pic_type, OFFSET$pic_type);
    }

    public void pic_type(@enumtype(StdVideoH265PictureType.class) int value) {
        segment.set(LAYOUT$pic_type, OFFSET$pic_type, value);
    }

    public int PicOrderCntVal() {
        return segment.get(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal);
    }

    public void PicOrderCntVal(int value) {
        segment.set(LAYOUT$PicOrderCntVal, OFFSET$PicOrderCntVal, value);
    }

    public @unsigned byte TemporalId() {
        return segment.get(LAYOUT$TemporalId, OFFSET$TemporalId);
    }

    public void TemporalId(@unsigned byte value) {
        segment.set(LAYOUT$TemporalId, OFFSET$TemporalId, value);
    }

}
/// dummy, not implemented yet
