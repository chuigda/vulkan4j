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

/// Represents a pointer to a {@code StdVideoH265HrdFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265HrdFlags {
///     uint32_t nal_hrd_parameters_present_flag : 1; // @link substring="nal_hrd_parameters_present_flag" target="#nal_hrd_parameters_present_flag"
///     uint32_t vcl_hrd_parameters_present_flag : 1; // @link substring="vcl_hrd_parameters_present_flag" target="#vcl_hrd_parameters_present_flag"
///     uint32_t sub_pic_hrd_params_present_flag : 1; // @link substring="sub_pic_hrd_params_present_flag" target="#sub_pic_hrd_params_present_flag"
///     uint32_t sub_pic_cpb_params_in_pic_timing_sei_flag : 1; // @link substring="sub_pic_cpb_params_in_pic_timing_sei_flag" target="#sub_pic_cpb_params_in_pic_timing_sei_flag"
///     uint32_t fixed_pic_rate_general_flag : 8; // @link substring="fixed_pic_rate_general_flag" target="#fixed_pic_rate_general_flag"
///     uint32_t fixed_pic_rate_within_cvs_flag : 8; // @link substring="fixed_pic_rate_within_cvs_flag" target="#fixed_pic_rate_within_cvs_flag"
///     uint32_t low_delay_hrd_flag : 8; // @link substring="low_delay_hrd_flag" target="#low_delay_hrd_flag"
/// } StdVideoH265HrdFlags;
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
public record StdVideoH265HrdFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265HrdFlags allocate(Arena arena) {
        StdVideoH265HrdFlags ret = new StdVideoH265HrdFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265HrdFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265HrdFlags[] ret = new StdVideoH265HrdFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265HrdFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265HrdFlags clone(Arena arena, StdVideoH265HrdFlags src) {
        StdVideoH265HrdFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265HrdFlags[] clone(Arena arena, StdVideoH265HrdFlags[] src) {
        StdVideoH265HrdFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean nal_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void nal_hrd_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean vcl_hrd_parameters_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void vcl_hrd_parameters_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean sub_pic_hrd_params_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void sub_pic_hrd_params_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean sub_pic_cpb_params_in_pic_timing_sei_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void sub_pic_cpb_params_in_pic_timing_sei_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public @unsigned int fixed_pic_rate_general_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 4, 12);
    }

    public void fixed_pic_rate_general_flag(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 4, 12, value);
    }

    public @unsigned int fixed_pic_rate_within_cvs_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 12, 20);
    }

    public void fixed_pic_rate_within_cvs_flag(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 12, 20, value);
    }

    public @unsigned int low_delay_hrd_flag() {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        return BitfieldUtil.readBits(s, 20, 28);
    }

    public void low_delay_hrd_flag(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag, LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
        BitfieldUtil.writeBits(s, 20, 28, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag = PathElement.groupElement("PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag");

    public static final OfInt LAYOUT$nal_hrd_parameters_present_flag_low_delay_hrd_flag = (OfInt) LAYOUT.select(PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag);


    public static final long OFFSET$nal_hrd_parameters_present_flag_low_delay_hrd_flag = LAYOUT.byteOffset(PATH$bitfield$nal_hrd_parameters_present_flag_low_delay_hrd_flag);
}
