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

public record StdVideoAV1QuantizationFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$using_qmatrix_reserved = ValueLayout.JAVA_INT.withName("bitfield$using_qmatrix_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$using_qmatrix_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1QuantizationFlags allocate(Arena arena) {
        return new StdVideoAV1QuantizationFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1QuantizationFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1QuantizationFlags[] ret = new StdVideoAV1QuantizationFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1QuantizationFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1QuantizationFlags clone(Arena arena, StdVideoAV1QuantizationFlags src) {
        StdVideoAV1QuantizationFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1QuantizationFlags[] clone(Arena arena, StdVideoAV1QuantizationFlags[] src) {
        StdVideoAV1QuantizationFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$using_qmatrix_reserved = PathElement.groupElement("PATH$bitfield$using_qmatrix_reserved");


    public static final long OFFSET$using_qmatrix_reserved = LAYOUT.byteOffset(PATH$bitfield$using_qmatrix_reserved);

    public int using_qmatrix() {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void using_qmatrix(int value) {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int diff_uv_delta() {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void diff_uv_delta(int value) {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        return BitfieldUtil.readBits(s, 2, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$using_qmatrix_reserved, LAYOUT$using_qmatrix_reserved);
        BitfieldUtil.writeBits(s, 2, 32, value);
    }

}
/// dummy, not implemented yet
