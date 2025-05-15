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
public record StdVideoH265ProfileTierLevelFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$general_tier_flag_general_frame_only_constraint_flag = ValueLayout.JAVA_INT.withName("bitfield$general_tier_flag_general_frame_only_constraint_flag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265ProfileTierLevelFlags allocate(Arena arena) {
        return new StdVideoH265ProfileTierLevelFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265ProfileTierLevelFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ProfileTierLevelFlags[] ret = new StdVideoH265ProfileTierLevelFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevelFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265ProfileTierLevelFlags clone(Arena arena, StdVideoH265ProfileTierLevelFlags src) {
        StdVideoH265ProfileTierLevelFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ProfileTierLevelFlags[] clone(Arena arena, StdVideoH265ProfileTierLevelFlags[] src) {
        StdVideoH265ProfileTierLevelFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag = PathElement.groupElement("PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag");


    public static final long OFFSET$general_tier_flag_general_frame_only_constraint_flag = LAYOUT.byteOffset(PATH$bitfield$general_tier_flag_general_frame_only_constraint_flag);

    public boolean general_tier_flag() {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void general_tier_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean general_progressive_source_flag() {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void general_progressive_source_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean general_interlaced_source_flag() {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void general_interlaced_source_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean general_non_packed_constraint_flag() {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void general_non_packed_constraint_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean general_frame_only_constraint_flag() {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void general_frame_only_constraint_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$general_tier_flag_general_frame_only_constraint_flag, LAYOUT$general_tier_flag_general_frame_only_constraint_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

}
