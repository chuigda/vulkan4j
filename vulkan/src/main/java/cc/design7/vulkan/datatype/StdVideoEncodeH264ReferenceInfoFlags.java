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
public record StdVideoEncodeH264ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$used_for_long_term_reference_reserved = ValueLayout.JAVA_INT.withName("bitfield$used_for_long_term_reference_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$used_for_long_term_reference_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH264ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264ReferenceInfoFlags[] ret = new StdVideoEncodeH264ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264ReferenceInfoFlags clone(Arena arena, StdVideoEncodeH264ReferenceInfoFlags src) {
        StdVideoEncodeH264ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264ReferenceInfoFlags[] clone(Arena arena, StdVideoEncodeH264ReferenceInfoFlags[] src) {
        StdVideoEncodeH264ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$used_for_long_term_reference_reserved = PathElement.groupElement("PATH$bitfield$used_for_long_term_reference_reserved");


    public static final long OFFSET$used_for_long_term_reference_reserved = LAYOUT.byteOffset(PATH$bitfield$used_for_long_term_reference_reserved);

    public boolean used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void used_for_long_term_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }


}
