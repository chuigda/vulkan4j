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

/// Represents a pointer to a {@code StdVideoH265ShortTermRefPicSetFlags} structure in native memory.
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
public record StdVideoH265ShortTermRefPicSetFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265ShortTermRefPicSetFlags allocate(Arena arena) {
        return new StdVideoH265ShortTermRefPicSetFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoH265ShortTermRefPicSetFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ShortTermRefPicSetFlags[] ret = new StdVideoH265ShortTermRefPicSetFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ShortTermRefPicSetFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265ShortTermRefPicSetFlags clone(Arena arena, StdVideoH265ShortTermRefPicSetFlags src) {
        StdVideoH265ShortTermRefPicSetFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ShortTermRefPicSetFlags[] clone(Arena arena, StdVideoH265ShortTermRefPicSetFlags[] src) {
        StdVideoH265ShortTermRefPicSetFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$inter_ref_pic_set_prediction_flag_delta_rps_sign")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$inter_ref_pic_set_prediction_flag_delta_rps_sign = PathElement.groupElement("PATH$bitfield$inter_ref_pic_set_prediction_flag_delta_rps_sign");

    public static final OfInt LAYOUT$inter_ref_pic_set_prediction_flag_delta_rps_sign = (OfInt) LAYOUT.select(PATH$bitfield$inter_ref_pic_set_prediction_flag_delta_rps_sign);


    public static final long OFFSET$inter_ref_pic_set_prediction_flag_delta_rps_sign = LAYOUT.byteOffset(PATH$bitfield$inter_ref_pic_set_prediction_flag_delta_rps_sign);

    public boolean inter_ref_pic_set_prediction_flag() {
        MemorySegment s = segment.asSlice(OFFSET$inter_ref_pic_set_prediction_flag_delta_rps_sign, LAYOUT$inter_ref_pic_set_prediction_flag_delta_rps_sign);
        return BitfieldUtil.readBit(s, 0);
    }

    public void inter_ref_pic_set_prediction_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$inter_ref_pic_set_prediction_flag_delta_rps_sign, LAYOUT$inter_ref_pic_set_prediction_flag_delta_rps_sign);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean delta_rps_sign() {
        MemorySegment s = segment.asSlice(OFFSET$inter_ref_pic_set_prediction_flag_delta_rps_sign, LAYOUT$inter_ref_pic_set_prediction_flag_delta_rps_sign);
        return BitfieldUtil.readBit(s, 1);
    }

    public void delta_rps_sign(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$inter_ref_pic_set_prediction_flag_delta_rps_sign, LAYOUT$inter_ref_pic_set_prediction_flag_delta_rps_sign);
        BitfieldUtil.writeBit(s, 1, value);
    }

}
