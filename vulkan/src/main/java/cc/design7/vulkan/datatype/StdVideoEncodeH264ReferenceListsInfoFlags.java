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

public record StdVideoEncodeH264ReferenceListsInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$ref_pic_list_modification_flag_l0_reserved = ValueLayout.JAVA_INT.withName("bitfield$ref_pic_list_modification_flag_l0_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$ref_pic_list_modification_flag_l0_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264ReferenceListsInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH264ReferenceListsInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264ReferenceListsInfoFlags[] ret = new StdVideoEncodeH264ReferenceListsInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceListsInfoFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags clone(Arena arena, StdVideoEncodeH264ReferenceListsInfoFlags src) {
        StdVideoEncodeH264ReferenceListsInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags[] clone(Arena arena, StdVideoEncodeH264ReferenceListsInfoFlags[] src) {
        StdVideoEncodeH264ReferenceListsInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$ref_pic_list_modification_flag_l0_reserved = PathElement.groupElement("PATH$bitfield$ref_pic_list_modification_flag_l0_reserved");


    public static final long OFFSET$ref_pic_list_modification_flag_l0_reserved = LAYOUT.byteOffset(PATH$bitfield$ref_pic_list_modification_flag_l0_reserved);

    public int ref_pic_list_modification_flag_l0() {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void ref_pic_list_modification_flag_l0(int value) {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int ref_pic_list_modification_flag_l1() {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void ref_pic_list_modification_flag_l1(int value) {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        return BitfieldUtil.readBits(s, 2, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        BitfieldUtil.writeBits(s, 2, 32, value);
    }

}
/// dummy, not implemented yet
