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

public record StdVideoEncodeH265ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$used_for_long_term_reference_reserved = ValueLayout.JAVA_INT.withName("bitfield$used_for_long_term_reference_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$used_for_long_term_reference_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH265ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH265ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265ReferenceInfoFlags[] ret = new StdVideoEncodeH265ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265ReferenceInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags clone(Arena arena, StdVideoEncodeH265ReferenceInfoFlags src) {
        StdVideoEncodeH265ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags[] clone(Arena arena, StdVideoEncodeH265ReferenceInfoFlags[] src) {
        StdVideoEncodeH265ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$used_for_long_term_reference_reserved = PathElement.groupElement("PATH$bitfield$used_for_long_term_reference_reserved");


    public static final long OFFSET$used_for_long_term_reference_reserved = LAYOUT.byteOffset(PATH$bitfield$used_for_long_term_reference_reserved);

    public int used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void used_for_long_term_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int unused_for_reference() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void unused_for_reference(int value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBits(s, 2, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBits(s, 2, 32, value);
    }

}
/// dummy, not implemented yet
