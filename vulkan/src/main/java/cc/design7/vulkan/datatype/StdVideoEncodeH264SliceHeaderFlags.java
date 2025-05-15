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

/// Represents a pointer to a {@code StdVideoEncodeH264SliceHeaderFlags} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeH264SliceHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264SliceHeaderFlags allocate(Arena arena) {
        return new StdVideoEncodeH264SliceHeaderFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264SliceHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264SliceHeaderFlags[] ret = new StdVideoEncodeH264SliceHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264SliceHeaderFlags clone(Arena arena, StdVideoEncodeH264SliceHeaderFlags src) {
        StdVideoEncodeH264SliceHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264SliceHeaderFlags[] clone(Arena arena, StdVideoEncodeH264SliceHeaderFlags[] src) {
        StdVideoEncodeH264SliceHeaderFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$direct_spatial_mv_pred_flag_reserved")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$direct_spatial_mv_pred_flag_reserved = PathElement.groupElement("PATH$bitfield$direct_spatial_mv_pred_flag_reserved");

    public static final OfInt LAYOUT$direct_spatial_mv_pred_flag_reserved = (OfInt) LAYOUT.select(PATH$bitfield$direct_spatial_mv_pred_flag_reserved);


    public static final long OFFSET$direct_spatial_mv_pred_flag_reserved = LAYOUT.byteOffset(PATH$bitfield$direct_spatial_mv_pred_flag_reserved);

    public boolean direct_spatial_mv_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void direct_spatial_mv_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean num_ref_idx_active_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void num_ref_idx_active_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$direct_spatial_mv_pred_flag_reserved, LAYOUT$direct_spatial_mv_pred_flag_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }


}
