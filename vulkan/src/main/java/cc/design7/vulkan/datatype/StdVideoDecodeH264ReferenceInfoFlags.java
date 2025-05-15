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

public record StdVideoDecodeH264ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$top_field_flag_is_non_existing = ValueLayout.JAVA_INT.withName("bitfield$top_field_flag_is_non_existing");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$top_field_flag_is_non_existing);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoDecodeH264ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH264ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoDecodeH264ReferenceInfoFlags[] ret = new StdVideoDecodeH264ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoDecodeH264ReferenceInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfoFlags clone(Arena arena, StdVideoDecodeH264ReferenceInfoFlags src) {
        StdVideoDecodeH264ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoDecodeH264ReferenceInfoFlags[] clone(Arena arena, StdVideoDecodeH264ReferenceInfoFlags[] src) {
        StdVideoDecodeH264ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$top_field_flag_is_non_existing = PathElement.groupElement("PATH$bitfield$top_field_flag_is_non_existing");


    public static final long OFFSET$top_field_flag_is_non_existing = LAYOUT.byteOffset(PATH$bitfield$top_field_flag_is_non_existing);

    public int top_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void top_field_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void bottom_field_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void used_for_long_term_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int is_non_existing() {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void is_non_existing(int value) {
        MemorySegment s = segment.asSlice(OFFSET$top_field_flag_is_non_existing, LAYOUT$top_field_flag_is_non_existing);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

}
/// dummy, not implemented yet
