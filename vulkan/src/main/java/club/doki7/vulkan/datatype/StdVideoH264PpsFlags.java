package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoH264PpsFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264PpsFlags {
///     uint32_t transform_8x8_mode_flag : 1; // @link substring="transform_8x8_mode_flag" target="#transform_8x8_mode_flag"
///     uint32_t redundant_pic_cnt_present_flag : 1; // @link substring="redundant_pic_cnt_present_flag" target="#redundant_pic_cnt_present_flag"
///     uint32_t constrained_intra_pred_flag : 1; // @link substring="constrained_intra_pred_flag" target="#constrained_intra_pred_flag"
///     uint32_t deblocking_filter_control_present_flag : 1; // @link substring="deblocking_filter_control_present_flag" target="#deblocking_filter_control_present_flag"
///     uint32_t weighted_pred_flag : 1; // @link substring="weighted_pred_flag" target="#weighted_pred_flag"
///     uint32_t bottom_field_pic_order_in_frame_present_flag : 1; // @link substring="bottom_field_pic_order_in_frame_present_flag" target="#bottom_field_pic_order_in_frame_present_flag"
///     uint32_t entropy_coding_mode_flag : 1; // @link substring="entropy_coding_mode_flag" target="#entropy_coding_mode_flag"
///     uint32_t pic_scaling_matrix_present_flag : 1; // @link substring="pic_scaling_matrix_present_flag" target="#pic_scaling_matrix_present_flag"
/// } StdVideoH264PpsFlags;
/// }
///
/// ## Contracts
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
public record StdVideoH264PpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264PpsFlags allocate(Arena arena) {
        StdVideoH264PpsFlags ret = new StdVideoH264PpsFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264PpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264PpsFlags[] ret = new StdVideoH264PpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264PpsFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264PpsFlags clone(Arena arena, StdVideoH264PpsFlags src) {
        StdVideoH264PpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264PpsFlags[] clone(Arena arena, StdVideoH264PpsFlags[] src) {
        StdVideoH264PpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean transform_8x8_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void transform_8x8_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean redundant_pic_cnt_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void redundant_pic_cnt_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean constrained_intra_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void constrained_intra_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean deblocking_filter_control_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void deblocking_filter_control_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean weighted_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 4);
    }

    public void weighted_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean bottom_field_pic_order_in_frame_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 5);
    }

    public void bottom_field_pic_order_in_frame_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean entropy_coding_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 6);
    }

    public void entropy_coding_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean pic_scaling_matrix_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        return BitfieldUtil.readBit(s, 7);
    }

    public void pic_scaling_matrix_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag, LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = PathElement.groupElement("PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag");

    public static final OfInt LAYOUT$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = (OfInt) LAYOUT.select(PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);


    public static final long OFFSET$transform_8x8_mode_flag_pic_scaling_matrix_present_flag = LAYOUT.byteOffset(PATH$bitfield$transform_8x8_mode_flag_pic_scaling_matrix_present_flag);
}
