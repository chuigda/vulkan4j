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

public record StdVideoAV1TimingInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$equal_picture_interval_reserved = ValueLayout.JAVA_INT.withName("bitfield$equal_picture_interval_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$equal_picture_interval_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1TimingInfoFlags allocate(Arena arena) {
        return new StdVideoAV1TimingInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TimingInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TimingInfoFlags[] ret = new StdVideoAV1TimingInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TimingInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags clone(Arena arena, StdVideoAV1TimingInfoFlags src) {
        StdVideoAV1TimingInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1TimingInfoFlags[] clone(Arena arena, StdVideoAV1TimingInfoFlags[] src) {
        StdVideoAV1TimingInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$equal_picture_interval_reserved = PathElement.groupElement("PATH$bitfield$equal_picture_interval_reserved");


    public static final long OFFSET$equal_picture_interval_reserved = LAYOUT.byteOffset(PATH$bitfield$equal_picture_interval_reserved);

    public int equal_picture_interval() {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void equal_picture_interval(int value) {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        return BitfieldUtil.readBits(s, 1, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$equal_picture_interval_reserved, LAYOUT$equal_picture_interval_reserved);
        BitfieldUtil.writeBits(s, 1, 32, value);
    }

}
/// dummy, not implemented yet
