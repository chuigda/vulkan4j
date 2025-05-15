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

@ValueBasedCandidate
public record StdVideoAV1LoopFilterFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$loop_filter_delta_enabled_reserved = ValueLayout.JAVA_INT.withName("bitfield$loop_filter_delta_enabled_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$loop_filter_delta_enabled_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1LoopFilterFlags allocate(Arena arena) {
        return new StdVideoAV1LoopFilterFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1LoopFilterFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1LoopFilterFlags[] ret = new StdVideoAV1LoopFilterFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1LoopFilterFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1LoopFilterFlags clone(Arena arena, StdVideoAV1LoopFilterFlags src) {
        StdVideoAV1LoopFilterFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1LoopFilterFlags[] clone(Arena arena, StdVideoAV1LoopFilterFlags[] src) {
        StdVideoAV1LoopFilterFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$loop_filter_delta_enabled_reserved = PathElement.groupElement("PATH$bitfield$loop_filter_delta_enabled_reserved");


    public static final long OFFSET$loop_filter_delta_enabled_reserved = LAYOUT.byteOffset(PATH$bitfield$loop_filter_delta_enabled_reserved);

    public boolean loop_filter_delta_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$loop_filter_delta_enabled_reserved, LAYOUT$loop_filter_delta_enabled_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void loop_filter_delta_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$loop_filter_delta_enabled_reserved, LAYOUT$loop_filter_delta_enabled_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean loop_filter_delta_update() {
        MemorySegment s = segment.asSlice(OFFSET$loop_filter_delta_enabled_reserved, LAYOUT$loop_filter_delta_enabled_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void loop_filter_delta_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$loop_filter_delta_enabled_reserved, LAYOUT$loop_filter_delta_enabled_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }


}
