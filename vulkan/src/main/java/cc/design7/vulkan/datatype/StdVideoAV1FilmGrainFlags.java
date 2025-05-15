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

public record StdVideoAV1FilmGrainFlags(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$chroma_scaling_from_luma_reserved = ValueLayout.JAVA_INT.withName("bitfield$chroma_scaling_from_luma_reserved");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$chroma_scaling_from_luma_reserved);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1FilmGrainFlags allocate(Arena arena) {
        return new StdVideoAV1FilmGrainFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1FilmGrainFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1FilmGrainFlags[] ret = new StdVideoAV1FilmGrainFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1FilmGrainFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1FilmGrainFlags clone(Arena arena, StdVideoAV1FilmGrainFlags src) {
        StdVideoAV1FilmGrainFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1FilmGrainFlags[] clone(Arena arena, StdVideoAV1FilmGrainFlags[] src) {
        StdVideoAV1FilmGrainFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$chroma_scaling_from_luma_reserved = PathElement.groupElement("PATH$bitfield$chroma_scaling_from_luma_reserved");


    public static final long OFFSET$chroma_scaling_from_luma_reserved = LAYOUT.byteOffset(PATH$bitfield$chroma_scaling_from_luma_reserved);

    public int chroma_scaling_from_luma() {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        return BitfieldUtil.readBits(s, 0, 1);
    }

    public void chroma_scaling_from_luma(int value) {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        BitfieldUtil.writeBits(s, 0, 1, value);
    }

    public int overlap_flag() {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        return BitfieldUtil.readBits(s, 1, 2);
    }

    public void overlap_flag(int value) {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        BitfieldUtil.writeBits(s, 1, 2, value);
    }

    public int clip_to_restricted_range() {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        return BitfieldUtil.readBits(s, 2, 3);
    }

    public void clip_to_restricted_range(int value) {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        BitfieldUtil.writeBits(s, 2, 3, value);
    }

    public int update_grain() {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        return BitfieldUtil.readBits(s, 3, 4);
    }

    public void update_grain(int value) {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        BitfieldUtil.writeBits(s, 3, 4, value);
    }

    public int reserved() {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        return BitfieldUtil.readBits(s, 4, 32);
    }

    public void reserved(int value) {
        MemorySegment s = segment.asSlice(OFFSET$chroma_scaling_from_luma_reserved, LAYOUT$chroma_scaling_from_luma_reserved);
        BitfieldUtil.writeBits(s, 4, 32, value);
    }

}
/// dummy, not implemented yet
