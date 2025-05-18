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

/// Represents a pointer to a {@code StdVideoH265VpsFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265VpsFlags {
///     uint32_t vps_temporal_id_nesting_flag : 1; // @link substring="vps_temporal_id_nesting_flag" target="#vps_temporal_id_nesting_flag"
///     uint32_t vps_sub_layer_ordering_info_present_flag : 1; // @link substring="vps_sub_layer_ordering_info_present_flag" target="#vps_sub_layer_ordering_info_present_flag"
///     uint32_t vps_timing_info_present_flag : 1; // @link substring="vps_timing_info_present_flag" target="#vps_timing_info_present_flag"
///     uint32_t vps_poc_proportional_to_timing_flag : 1; // @link substring="vps_poc_proportional_to_timing_flag" target="#vps_poc_proportional_to_timing_flag"
/// } StdVideoH265VpsFlags;
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
public record StdVideoH265VpsFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265VpsFlags allocate(Arena arena) {
        StdVideoH265VpsFlags ret = new StdVideoH265VpsFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265VpsFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265VpsFlags[] ret = new StdVideoH265VpsFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265VpsFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265VpsFlags clone(Arena arena, StdVideoH265VpsFlags src) {
        StdVideoH265VpsFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265VpsFlags[] clone(Arena arena, StdVideoH265VpsFlags[] src) {
        StdVideoH265VpsFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean vps_temporal_id_nesting_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 0);
    }

    public void vps_temporal_id_nesting_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean vps_sub_layer_ordering_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 1);
    }

    public void vps_sub_layer_ordering_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean vps_timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 2);
    }

    public void vps_timing_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean vps_poc_proportional_to_timing_flag() {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        return BitfieldUtil.readBit(s, 3);
    }

    public void vps_poc_proportional_to_timing_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag, LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = PathElement.groupElement("PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag");

    public static final OfInt LAYOUT$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = (OfInt) LAYOUT.select(PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);


    public static final long OFFSET$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag = LAYOUT.byteOffset(PATH$bitfield$vps_temporal_id_nesting_flag_vps_poc_proportional_to_timing_flag);
}
